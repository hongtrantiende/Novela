$filePath = "$PSScriptRoot\app\src\main\assets\defaultData\httpTTS.json"
$content = [System.IO.File]::ReadAllText($filePath, [System.Text.Encoding]::UTF8)

# loginCheckJs is the same for all POST API voices
$loginCheckJs = 'var responseString = result.body().string();\nif (result.code() != 200) {\n  throw new Error(\"HTTP \" + result.code() + \": \" + responseString.substring(0, 150));\n}\nvar json = JSON.parse(responseString);\nif (json.error) {\n  throw new Error(\"API Err: \" + JSON.stringify(json.error).substring(0, 150));\n}\nif (!json.audioContent) {\n  throw new Error(\"No audioContent\");\n}\nvar audioBytes = Packages.android.util.Base64.decode(json.audioContent, 0);\nvar mediaType = Packages.okhttp3.MediaType.parse(\"audio/mpeg\");\nvar responseBody;\ntry {\n  responseBody = Packages.okhttp3.ResponseBody.create(audioBytes, mediaType);\n} catch (e) {\n  responseBody = Packages.okhttp3.ResponseBody.create(mediaType, audioBytes);\n}\nresult.newBuilder().body(responseBody).header(\"Content-Type\", \"audio/mpeg\").build();'

function Make-PostUrl($voiceName) {
    return "@js:\nvar config = {};\ntry {\n  if (source.loginUi) {\n    config = JSON.parse(source.loginUi);\n  }\n} catch(e) {}\n\nvar cleanText = speakText\n  .replace(/&/g, '&amp;')\n  .replace(/</g, '&lt;')\n  .replace(/>/g, '&gt;')\n  .replace(/\""/g, '&quot;')\n  .replace(/'/g, '&apos;');\n\nvar safeText = cleanText.replace(/([.,!?:;])/g, '`$1<break time=\""70ms\""/>');\n\nvar rate = speakSpeed / 10.0;\n\nvar option = {\n  method: \""POST\"",\n  headers: { \""Content-Type\"": \""application/json\"" },\n  body: JSON.stringify({\n    input: { ssml: \""<speak>\"" + safeText + \""</speak>\"" },\n    voice: { languageCode: \""vi-VN\"", name: \""$voiceName\"" },\n    audioConfig: {\n      audioEncoding: config.audioEncoding || \""MP3\"",\n      speakingRate: rate,\n      pitch: typeof config.pitch !== \""undefined\"" ? parseFloat(config.pitch) : 0.0,\n      volumeGainDb: typeof config.volumeGain !== \""undefined\"" ? parseFloat(config.volumeGain) : 0.0,\n      effectsProfileId: config.effectsProfile ? [config.effectsProfile] : undefined,\n      sampleRateHertz: config.sampleRate ? parseInt(config.sampleRate) : undefined\n    }\n  })\n};\n\""https://texttospeech.googleapis.com/v1/text:synthesize?key=AIzaSyA33f9cSqKdR-V4XNkZNZ_rh_dbT1VQJFo,\"" + JSON.stringify(option);"
}

# This approach is simpler: parse JSON, modify entries, write back
$json = $content | ConvertFrom-Json

foreach ($entry in $json) {
    $id = $entry.id
    
    # Upgrade Gen 1 voices (-101 to -106) from GET to POST API
    if ($id -ge -106 -and $id -le -101) {
        $voiceMap = @{
            -101 = "vi-VN-Standard-A"
            -102 = "vi-VN-Wavenet-A"
            -103 = "vi-VN-Wavenet-B"
            -104 = "vi-VN-Wavenet-C"
            -105 = "vi-VN-Neural2-F"
            -106 = "vi-VN-Wavenet-D"
        }
        $voiceName = $voiceMap[$id]
        
        # Build the new URL with proper JSON escaping
        $urlJs = "@js:\nvar config = {};\ntry {\n  if (source.loginUi) {\n    config = JSON.parse(source.loginUi);\n  }\n} catch(e) {}\n\nvar cleanText = speakText\n  .replace(/&/g, '&amp;')\n  .replace(/</g, '&lt;')\n  .replace(/>/g, '&gt;')\n  .replace(/\""/g, '&quot;')\n  .replace(/'/g, '&apos;');\n\nvar safeText = cleanText.replace(/([.,!?:;])/g, '`$1<break time=\""70ms\""/>');\n\nvar rate = speakSpeed / 10.0;\n\nvar option = {\n  method: \""POST\"",\n  headers: { \""Content-Type\"": \""application/json\"" },\n  body: JSON.stringify({\n    input: { ssml: \""<speak>\"" + safeText + \""</speak>\"" },\n    voice: { languageCode: \""vi-VN\"", name: \""$voiceName\"" },\n    audioConfig: {\n      audioEncoding: config.audioEncoding || \""MP3\"",\n      speakingRate: rate,\n      pitch: typeof config.pitch !== \""undefined\"" ? parseFloat(config.pitch) : 0.0,\n      volumeGainDb: typeof config.volumeGain !== \""undefined\"" ? parseFloat(config.volumeGain) : 0.0,\n      effectsProfileId: config.effectsProfile ? [config.effectsProfile] : undefined,\n      sampleRateHertz: config.sampleRate ? parseInt(config.sampleRate) : undefined\n    }\n  })\n};\n\""https://texttospeech.googleapis.com/v1/text:synthesize?key=AIzaSyA33f9cSqKdR-V4XNkZNZ_rh_dbT1VQJFo,\"" + JSON.stringify(option);"
        
        $entry.url = $urlJs
        $entry | Add-Member -NotePropertyName "loginCheckJs" -NotePropertyValue $loginCheckJs -Force
        Write-Output "Upgraded Gen1 voice id=$id ($voiceName) to POST API"
    }
}

# Convert back to JSON with proper formatting
$jsonOut = $json | ConvertTo-Json -Depth 10
[System.IO.File]::WriteAllText($filePath, $jsonOut, [System.Text.Encoding]::UTF8)
Write-Output "JSON saved"
