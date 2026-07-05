import json
import os

path = 'app/src/main/assets/defaultData/httpTTS.json'
with open(path, 'r', encoding='utf-8') as f:
    data = json.load(f)

voice_mapping = {
    -101: 'vi-VN-Standard-A',
    -102: 'vi-VN-Wavenet-A',
    -103: 'vi-VN-Wavenet-B',
    -104: 'vi-VN-Wavenet-C',
    -105: 'vi-VN-Wavenet-E',
    -106: 'vi-VN-Wavenet-D',
}

js_template = """@js:
var config = {};
try {
  if (source.loginUi) {
    config = JSON.parse(source.loginUi);
  }
} catch(e) {}

var cleanText = speakText
  .replace(/&/g, '&amp;')
  .replace(/</g, '&lt;')
  .replace(/>/g, '&gt;')
  .replace(/"/g, '&quot;')
  .replace(/'/g, '&apos;');

var safeText = cleanText.replace(/([.,!?:;])/g, '$1<break time="70ms"/>');

var rate = speakSpeed / 10;

var option = {
  method: "POST",
  headers: { "Content-Type": "application/json" },
  body: JSON.stringify({
    input: { ssml: "<speak>" + safeText + "</speak>" },
    voice: { languageCode: "vi-VN", name: "__VOICE_NAME__" },
    audioConfig: {
      audioEncoding: config.audioEncoding || "MP3",
      speakingRate: rate,
      pitch: typeof config.pitch !== "undefined" ? parseFloat(config.pitch) : 0.0,
      volumeGainDb: typeof config.volumeGain !== "undefined" ? parseFloat(config.volumeGain) : 0.0,
      effectsProfileId: config.effectsProfile ? [config.effectsProfile] : undefined,
      sampleRateHertz: config.sampleRate ? parseInt(config.sampleRate) : undefined
    }
  })
};
"https://texttospeech.googleapis.com/v1/text:synthesize?key=AIzaSyA33f9cSqKdR-V4XNkZNZ_rh_dbT1VQJFo," + JSON.stringify(option);"""

login_check_js = """var responseString = result.body().string();
if (result.code() != 200) {
  throw new Error("Máy chủ TTS trả về lỗi HTTP " + result.code() + ": " + responseString);
}
var json = JSON.parse(responseString);
if (json.error) {
  throw new Error("Máy chủ TTS trả về lỗi API: " + JSON.stringify(json.error));
}
if (!json.audioContent) {
  throw new Error("Máy chủ TTS trả về không có audioContent: " + responseString);
}
var audioBytes = Packages.android.util.Base64.decode(json.audioContent, 0);
var mediaType = Packages.okhttp3.MediaType.parse("audio/mpeg");
var responseBody;
try {
  responseBody = Packages.okhttp3.ResponseBody.create(audioBytes, mediaType);
} catch (e) {
  responseBody = Packages.okhttp3.ResponseBody.create(mediaType, audioBytes);
}
result.newBuilder().body(responseBody).header("Content-Type", "audio/mpeg").build();"""

for item in data:
    if item['id'] in voice_mapping:
        item['url'] = js_template.replace('__VOICE_NAME__', voice_mapping[item['id']])
        item['loginCheckJs'] = login_check_js
        item['contentType'] = 'audio/mpeg'
        
        if item['id'] == -106:
            item['name'] = 'Google TTS - vi-VN (vif) [Nam]'
        elif item['id'] == -102:
            item['name'] = 'Google TTS - vi-VN (gft) [Nữ]'
        elif item['id'] == -103:
            item['name'] = 'Google TTS - vi-VN (vic) [Nam]'
        elif item['id'] == -104:
            item['name'] = 'Google TTS - vi-VN (vid) [Nữ]'
        elif item['id'] == -105:
            item['name'] = 'Google TTS - vi-VN (vie) [Nữ/Nam]'
        elif item['id'] == -101:
            item['name'] = 'Google TTS - Mặc định'

with open(path, 'w', encoding='utf-8') as f:
    json.dump(data, f, ensure_ascii=False, indent=2)
print('Done!')
