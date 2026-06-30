param (
    [Parameter(Mandatory=$true)]
    [string]$Ip,

    [Parameter(Mandatory=$false)]
    [int]$Port = 1122,

    [Parameter(Mandatory=$true)]
    [string]$Name
)

$ErrorActionPreference = "Stop"

# Define directories
$extensionPath = Join-Path (Get-Location) "app/src/main/assets/extensions/$Name"
if (-not (Test-Path $extensionPath)) {
    Write-Error "Extension folder not found at: $extensionPath"
    exit 1
}

# Define temp zip file path
$tempZipPath = Join-Path ([System.IO.Path]::GetTempPath()) "ext_$Name.zip"
if (Test-Path $tempZipPath) {
    Remove-Item $tempZipPath -Force
}

Write-Host "Zipping extension files from: $extensionPath ..." -ForegroundColor Cyan
[System.Reflection.Assembly]::LoadWithPartialName("System.IO.Compression.FileSystem") | Out-Null
[System.IO.Compression.ZipFile]::CreateFromDirectory($extensionPath, $tempZipPath)

Write-Host "Uploading to http://$Ip`:$Port/uploadExtension using curl..." -ForegroundColor Cyan

try {
    # Call curl.exe to perform the multipart post upload
    $url = "http://$Ip`:$Port/uploadExtension"
    $output = curl.exe -s -F "file=@$tempZipPath" $url
    
    # Ktor responds with JSON or raw string
    if ($output -match "true" -or $output -match "data") {
        Write-Host "Success: Extension '$Name' synced successfully!" -ForegroundColor Green
    } else {
        Write-Error "Sync failed! Server response: $output"
    }
} catch {
    Write-Error "Error during upload: $_"
} finally {
    if (Test-Path $tempZipPath) {
        Remove-Item $tempZipPath -Force
    }
}
