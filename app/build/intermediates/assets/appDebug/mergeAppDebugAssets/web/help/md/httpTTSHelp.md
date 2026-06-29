# Hướng dẫn Quy tắc Đọc Trực tuyến (HTTP TTS)

* Quy tắc đọc trực tuyến sử dụng các quy tắc URL, tương tự như URL của nguồn sách.
* Các tham số JS:
```
speakText //Văn bản cần đọc
speakSpeed //Tốc độ đọc, từ 5 đến 50
```
* Ví dụ:
```
http://tts.baidu.com/text2audio,{
    "method": "POST",
    "body": "tex={{java.encodeURI(java.encodeURI(speakText))}}&spd={{String((speakSpeed + 5) / 10 + 4)}}&per=5003&cuid=baidu_speech_demo&idx=1&cod=2&lan=zh&ctp=1&pdt=1&vol=5&pit=5&_res_tag_=audio"
}
```