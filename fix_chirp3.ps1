$filePath = "c:\Users\Admin\Documents\NAM\legado\app\src\main\assets\defaultData\httpTTS.json"
$content = [System.IO.File]::ReadAllText($filePath, [System.Text.Encoding]::UTF8)

# The target string in the JSON (as stored in the file)
$old = '\n      speakingRate: rate,\n      pitch: typeof config.pitch !== \"undefined\" ? parseFloat(config.pitch) : 0.0,\n      volumeGainDb: typeof config.volumeGain !== \"undefined\" ? parseFloat(config.volumeGain) : 0.0,\n      effectsProfileId: config.effectsProfile ? [config.effectsProfile] : undefined,\n      sampleRateHertz: config.sampleRate ? parseInt(config.sampleRate) : undefined\n    }\n  })\n};'

$new = '\n      speakingRate: rate\n    }\n  })\n};'

$count = ([regex]::Matches($content, [regex]::Escape($old))).Count
Write-Output "Found $count occurrences"

$content = $content.Replace($old, $new)
[System.IO.File]::WriteAllText($filePath, $content, [System.Text.Encoding]::UTF8)
Write-Output "Done"
