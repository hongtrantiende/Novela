$filePath = "$PSScriptRoot\app\src\main\assets\defaultData\httpTTS.json"
$content = [System.IO.File]::ReadAllText($filePath, [System.Text.Encoding]::UTF8)

# ConvertTo-Json double-escaped the backslashes in Gen1 entries
# Fix: replace \\\\n with \\n, \\\\\\" with \\", \\\\' with \\' in Gen1 entries

# The problem: ConvertTo-Json converts \n to \\n, \" to \\" etc.
# We need to undo this extra escaping for the url and loginCheckJs fields
# that we modified for Gen1 entries

# Simple approach: find and fix the double-escaped patterns
# \\\\n -> \\n (in JSON, \\n represents literal \n in the string)
# But we need to be careful to only fix the Gen1 entries

# Actually, let me just rewrite the entire file properly.
# First, restore from git the original file, then do manual edits.

# Better approach: just fix the escaping
# \\\\n should be \\n
# \\\\\\" should be \\"
# \\\\' should be \\'

# Only apply to lines 2-43 (Gen1 entries)
$lines = $content.Split("`n")
for ($i = 0; $i -lt $lines.Count; $i++) {
    $line = $lines[$i]
    # Check if this line belongs to a Gen1 entry (first 6 entries, roughly lines 1-43)
    # We can identify them by looking at the URL pattern or just fix all \\\\n
    if ($line -match '\\\\\\\\n') {
        $lines[$i] = $line.Replace('\\\\n', '\n')
    }
}
$content = $lines -join "`n"
[System.IO.File]::WriteAllText($filePath, $content, [System.Text.Encoding]::UTF8)
Write-Output "Fixed escaping"
