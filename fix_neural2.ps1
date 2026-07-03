$filePath = "c:\Users\Admin\Documents\NAM\legado\app\src\main\assets\defaultData\httpTTS.json"
$content = [System.IO.File]::ReadAllText($filePath, [System.Text.Encoding]::UTF8)

# Only fix Neural2-D and Neural2-A entries: add back pitch/volumeGainDb/effectsProfileId/sampleRateHertz
$oldNeural2D = 'name: \"vi-VN-Neural2-D\" },\n    audioConfig: {\n      audioEncoding: config.audioEncoding || \"MP3\",\n      speakingRate: rate\n    }\n  })\n};'
$newNeural2D = 'name: \"vi-VN-Neural2-D\" },\n    audioConfig: {\n      audioEncoding: config.audioEncoding || \"MP3\",\n      speakingRate: rate,\n      pitch: typeof config.pitch !== \"undefined\" ? parseFloat(config.pitch) : 0.0,\n      volumeGainDb: typeof config.volumeGain !== \"undefined\" ? parseFloat(config.volumeGain) : 0.0,\n      effectsProfileId: config.effectsProfile ? [config.effectsProfile] : undefined,\n      sampleRateHertz: config.sampleRate ? parseInt(config.sampleRate) : undefined\n    }\n  })\n};'

$oldNeural2A = 'name: \"vi-VN-Neural2-A\" },\n    audioConfig: {\n      audioEncoding: config.audioEncoding || \"MP3\",\n      speakingRate: rate\n    }\n  })\n};'
$newNeural2A = 'name: \"vi-VN-Neural2-A\" },\n    audioConfig: {\n      audioEncoding: config.audioEncoding || \"MP3\",\n      speakingRate: rate,\n      pitch: typeof config.pitch !== \"undefined\" ? parseFloat(config.pitch) : 0.0,\n      volumeGainDb: typeof config.volumeGain !== \"undefined\" ? parseFloat(config.volumeGain) : 0.0,\n      effectsProfileId: config.effectsProfile ? [config.effectsProfile] : undefined,\n      sampleRateHertz: config.sampleRate ? parseInt(config.sampleRate) : undefined\n    }\n  })\n};'

$content = $content.Replace($oldNeural2D, $newNeural2D)
$content = $content.Replace($oldNeural2A, $newNeural2A)
[System.IO.File]::WriteAllText($filePath, $content, [System.Text.Encoding]::UTF8)
Write-Output "Done - Neural2 entries restored"
