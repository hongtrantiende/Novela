$filePath = "$PSScriptRoot\app\src\main\assets\defaultData\httpTTS.json"
$content = [System.IO.File]::ReadAllText($filePath, [System.Text.Encoding]::UTF8)

$oldEscaped = ',\n      pitch: typeof config.pitch !== \"undefined\" ? parseFloat(config.pitch) : 0.0,\n      volumeGainDb: typeof config.volumeGain !== \"undefined\" ? parseFloat(config.volumeGain) : 0.0,\n      effectsProfileId: config.effectsProfile ? [config.effectsProfile] : undefined,\n      sampleRateHertz: config.sampleRate ? parseInt(config.sampleRate) : undefined\n    }\n  })\n};\n'
$newEscaped = '\n    }\n  })\n};\n'

$lines = $content -split "`r`n"
$modifiedCount = 0
for ($i = 0; $i -lt $lines.Count; $i++) {
    if ($lines[$i] -match 'Chirp3-HD' -and $lines[$i].Contains($oldEscaped)) {
        $lines[$i] = $lines[$i].Replace($oldEscaped, $newEscaped)
        $modifiedCount++
    }
}

Write-Output "Modified $modifiedCount Chirp3-HD lines"
$result = $lines -join "`r`n"
[System.IO.File]::WriteAllText($filePath, $result, [System.Text.Encoding]::UTF8)
Write-Output "Done"
