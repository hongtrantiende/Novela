# Biến và hàm JS

> Legado sử dụng [Rhino v1.8.0](https://github.com/mozilla/rhino) làm công cụ JavaScript để dễ dàng [gọi các lớp và phương thức Java](https://m.jb51.net/article/92138.htm), xem [Bảng tương thích ECMAScript](https://mozilla.github.io/rhino/compat/engines.html)

> [Rhino Runtime](https://github.com/mozilla/rhino/blob/master/rhino/src/main/java/org/mozilla/javascript/ScriptRuntime.java) tải chậm (lazy load) các lớp và phương thức Java được nhập.

|Hàm khởi tạo|Hàm|Đối tượng|Lớp gọi|Mô tả ngắn gọn|
|------|-----|------|----|------|
|JavaImporter|importClass importPackage| |[ImporterTopLevel](https://github.com/mozilla/rhino/blob/master/rhino/src/main/java/org/mozilla/javascript/ImporterTopLevel.java)|Nhập các lớp Java vào JavaScript|
||getClass|Packages java javax ...|[NativeJavaTopPackage](https://github.com/mozilla/rhino/blob/master/rhino/src/main/java/org/mozilla/javascript/NativeJavaTopPackage.java)|Nhập mặc định các lớp Java trong JavaScript|
|JavaAdapter|||[JavaAdapter](https://github.com/mozilla/rhino/blob/master/rhino/src/main/java//org/mozilla/javascript/JavaAdapter.java)|Kế thừa các lớp Java|

> Lưu ý: Biến `java` đã được Legado sửa đổi. Nếu bạn muốn gọi các gói dưới `java.*`, vui lòng sử dụng `Packages.java.*`

> Trong quy tắc nguồn sách, sử dụng `@js`, `<js>`, `{{}}` để gọi một số lớp và phương thức tích hợp của Legado bằng JavaScript.

> Lưu ý: Vì lý do bảo mật, Legado sẽ chặn một số lệnh gọi lớp Java, xem [RhinoClassShutter](https://github.com/gedoor/legado/blob/master/modules/rhino/src/main/java/com/script/rhino/RhinoClassShutter.kt)

> Các lớp và phương thức Java được hỗ trợ gọi có thể khác nhau tùy thuộc vào các quy tắc nguồn sách khác nhau.

> Lưu ý: Các biến được khai báo bằng `const` không hỗ trợ phạm vi khối, việc sử dụng chúng trong vòng lặp có thể khiến giá trị không đổi, vui lòng sử dụng khai báo bằng `var` thay thế.

|Tên biến|Lớp gọi|
|------|-----|
|java|Lớp hiện tại|
|baseUrl|URL hiện tại, String|
|result|Kết quả của bước trước|
|book|[Lớp Sách (Book)](https://github.com/gedoor/legado/blob/master/app/src/main/java/io/legado/app/data/entities/Book.kt)|
|rssArticle|[Lớp Bài viết RSS (Article)](https://github.com/gedoor/legado/blob/master/app/src/main/java/io/legado/app/data/entities/RssArticle.kt)|
|chapter|[Lớp Chương (Chapter)](https://github.com/gedoor/legado/blob/master/app/src/main/java/io/legado/app/data/entities/BookChapter.kt)|
|source|[Lớp Nguồn sách cơ bản (BaseSource)](https://github.com/gedoor/legado/blob/master/app/src/main/java/io/legado/app/data/entities/BaseSource.kt)|
|cookie|[Lớp thao tác Cookie](https://github.com/gedoor/legado/blob/master/app/src/main/java/io/legado/app/help/http/CookieStore.kt)| 
|cache|[Lớp thao tác bộ đệm (Cache)](https://github.com/gedoor/legado/blob/master/app/src/main/java/io/legado/app/help/CacheManager.kt)|
|title|Tiêu đề chương hiện tại, String|
|src|Mã nguồn được trả về từ yêu cầu|
|nextChapterUrl|URL của chương tiếp theo|

## Một số phương thức có thể sử dụng của đối tượng lớp hiện tại

### [RssJsExtensions](https://github.com/gedoor/legado/blob/master/app/src/main/java/io/legado/app/ui/rss/read/RssJsExtensions.kt)
> Chỉ có thể sử dụng trong quy tắc `shouldOverrideUrlLoading` của nguồn đăng ký (RSS)  
> Đăng ký thêm chặn URL chuyển hướng, JS trả về true để chặn, biến JS url có thể dùng để mở URL qua JS  
> Quy tắc chặn chuyển hướng URL không được thực hiện các thao tác tốn thời gian
> Ví dụ: https://github.com/gedoor/legado/discussions/3259

* Gọi tìm kiếm Legado

```js
java.searchBook(bookName: String)
```

* Thêm vào tủ sách

```js
java.addBook(bookUrl: String)
```

### Một số hàm của [AnalyzeUrl](https://github.com/gedoor/legado/blob/master/app/src/main/java/io/legado/app/model/analyzeRule/AnalyzeUrl.kt)
> Được gọi qua `java.` trong JS, chỉ có hiệu lực trong quy tắc `JS kiểm tra đăng nhập`
```js
initUrl() //Phân tích lại URL, có thể dùng để phân tích lại và truy cập lại URL sau khi đăng nhập thành công qua JS kiểm tra đăng nhập
getHeaderMap().putAll(source.getHeaderMap(true)) //Thiết lập lại tiêu đề đăng nhập (Login Header)
getStrResponse( jsStr: String? = null, sourceRegex: String? = null) //Trả về kết quả truy cập dưới dạng văn bản, có thể gọi phương thức này để nhận lại kết quả sau khi nguồn sách tự động đăng nhập lại
getResponse(): Response //Trả về kết quả phản hồi mạng (được sử dụng bởi công cụ đọc trực tuyến), có thể truy cập lại bằng cách gọi phương thức này sau khi thực hiện đăng nhập. Tham khảo tính năng kiểm tra đăng nhập của Aliyun.
```

### Một số hàm của [AnalyzeRule](https://github.com/gedoor/legado/blob/master/app/src/main/java/io/legado/app/model/analyzeRule/AnalyzeRule.kt)
* Lấy văn bản / danh sách văn bản
> `mContent` mã nguồn cần phân tích, mặc định là trang hiện tại  
> `isUrl` cờ xác định liên kết, mặc định là `false`
```js
java.getString(ruleStr: String?, mContent: Any? = null, isUrl: Boolean = false)
java.getStringList(ruleStr: String?, mContent: Any? = null, isUrl: Boolean = false)
```
* Thiết lập nội dung phân tích

```js
java.setContent(content: Any?, baseUrl: String? = null):
```

* Lấy Element / danh sách Element

> Nếu muốn thay đổi mã nguồn cần phân tích, vui lòng sử dụng `java.setContent` trước

```js
java.getElement(ruleStr: String)
java.getElements(ruleStr: String)
```

* Tìm kiếm lại sách / Lấy lại URL mục lục

> Chỉ có thể sử dụng trước khi làm mới mục lục, một số địa chỉ sách hoặc URL mục lục của nguồn sách có thể thay đổi

```js
java.reGetBook()
java.refreshTocUrl()
```
* Lưu và lấy biến

```js
java.get(key)
java.put(key, value)
```

### Một số hàm của [Lớp mở rộng JS (JsExtensions)](https://github.com/gedoor/legado/blob/master/app/src/main/java/io/legado/app/help/JsExtensions.kt)

* Phân tích liên kết [JsURL](https://github.com/gedoor/legado/blob/master/app/src/main/java/io/legado/app/utils/JsURL.kt)
```js
java.toURL(url): JsURL
java.toURL(url, baseUrl): JsURL
```
* Lấy User-Agent của SystemWebView
```js
java.getWebViewUA(): String
```
* Yêu cầu mạng
```js
java.ajax(urlStr): String
java.ajaxAll(urlList: Array<String>): Array<StrResponse>
//Trả về đối tượng StrResponse chứa các phương thức: body(), code(), message(), headers(), raw(), toString() 
java.connect(urlStr): StrResponse

java.post(url: String, body: String, headerMap: Map<String, String>): Connection.Response

java.get(url: String, headerMap: Map<String, String>): Connection.Response

java.head(url: String, headerMap: Map<String, String>): Connection.Response

* Sử dụng webView để truy cập mạng
* @param html HTML tải trực tiếp bằng webView, nếu html trống sẽ truy cập trực tiếp bằng url
* @param url Nếu tài nguyên trong html sử dụng đường dẫn tương đối thì phải truyền url vào mới tải được
* @param js Câu lệnh JS để lấy giá trị trả về, nếu không có sẽ trả về toàn bộ mã nguồn
* @return Trả về nội dung lấy được từ JS
java.webView(html: String?, url: String?, js: String?): String?

* Sử dụng webView để lấy URL chuyển hướng
java.webViewGetOverrideUrl(html: String?, url: String?, js: String?, overrideUrlRegex: String): String?

* Sử dụng webView để lấy URL tài nguyên
java.webViewGetSource(html: String?, url: String?, js: String?, sourceRegex: String): String?

* Mở liên kết bằng trình duyệt tích hợp, có thể sử dụng để lấy mã xác thực (CAPTCHA) hoặc xác thực thủ công chống thu thập dữ liệu
* @param url Liên kết cần mở
* @param title Tiêu đề của trình duyệt
java.startBrowser(url: String, title: String)

* Mở liên kết bằng trình duyệt tích hợp và đợi kết quả. Sử dụng `.body()` để lấy nội dung trang web.
java.startBrowserAwait(url: String, title: String, refetchAfterSuccess: Boolean? = true): StrResponse
```
* Gỡ lỗi (Debug)
```js
java.log(msg)
java.logType(var)
```
* Lấy mã xác thực (CAPTCHA) do người dùng nhập
```js
java.getVerificationCode(imageUrl)
```
* Hiển thị thông báo (Toast)
```js
java.longToast(msg: Any?)
java.toast(msg: Any?)
```
* Đọc tệp JavaScript từ mạng (thực hiện bởi `java.cacheFile`) hoặc từ máy cục bộ, vui lòng sử dụng `eval(String(...))` theo cách thủ công để nhập vào ngữ cảnh.
```js
java.importScript(url)
//Đường dẫn tương đối hỗ trợ thư mục: android/data/{package}/cache
java.importScript(relativePath)
java.importScript(absolutePath)
```
* Lưu bộ đệm tệp tin từ mạng
```js
Lấy:
java.cacheFile(url)
java.cacheFile(url,saveTime)
Thực thi nội dung:
eval(String(java.cacheFile(url)))
Xóa bộ đệm / Làm mất hiệu lực bộ đệm:
cache.delete(java.md5Encode16(url))
```
* Lấy dữ liệu theo đường dẫn chỉ định từ tệp nén trên mạng (hỗ trợ Zip, Rar, 7Z)
```js
java.get*StringContent(url: String, path: String): String

java.get*StringContent(url: String, path: String, charsetName: String): String

java.get*ByteArrayContent(url: String, path: String): ByteArray?

```
* Mã hóa URI
```js
java.encodeURI(str: String) //Mặc định enc="UTF-8"
java.encodeURI(str: String, enc: String)
```
* Base64
> Tham số flags có thể bỏ qua, mặc định là Base64.NO_WRAP, xem [Giải thích tham số flags](https://blog.csdn.net/zcmain/article/details/97051870)
```js
java.base64Decode(str: String)
java.base64Decode(str: String, charset: String)
java.base64DecodeToByteArray(str: String, flags: Int)
java.base64Encode(str: String, flags: Int)
```
* ByteArray
```js
Chuyển đổi String sang Bytes
java.strToBytes(str: String)
java.strToBytes(str: String, charset: String)
Chuyển đổi Bytes sang String
java.bytesToStr(bytes: ByteArray)
java.bytesToStr(bytes: ByteArray, charset: String)
```
* Hex
```js
Giải mã HexString thành mảng byte
java.hexDecodeToByteArray(hex: String)
Giải mã HexString thành chuỗi UTF-8 (utf8String)
java.hexDecodeToString(hex: String)
Mã hóa chuỗi UTF-8 thành HexString
java.hexEncodeToString(utf8: String)
```
* Định danh ID
```js
java.randomUUID()
java.androidId()
```
* Chuyển đổi Chữ phồn thể - giản thể
```js
Chuyển đổi văn bản thành chữ giản thể
java.t2s(text: String): String
Chuyển đổi văn bản thành chữ phồn thể
java.s2t(text: String): String
```
* Định dạng thời gian
```js
java.timeFormatUTC(time: Long, format: String, sh: Int): String?
java.timeFormat(time: Long): String
```

* Định dạng HTML

```js
java.htmlFormat(str: String): String
```
* Tệp tin
> Tất cả các thao tác đọc, ghi và xóa tệp đều sử dụng đường dẫn tương đối và chỉ có thể thực hiện trên các tệp nằm trong thư mục cache của Legado: `android/data/{package}/cache/`
```js
//Tải xuống tệp tin, url dùng để tạo tên tệp, trả về đường dẫn tệp
downloadFile(url: String): String
//Giải nén tệp tin, zipPath là đường dẫn tệp nén, trả về đường dẫn giải nén
unArchiveFile(zipPath: String): String
unzipFile(zipPath: String): String
unrarFile(zipPath: String): String
un7zFile(zipPath: String): String
//Đọc tất cả các tệp trong thư mục
getTxtInFolder(unzipPath: String): String
//Đọc tệp văn bản
readTxtFile(path: String): String
//Xóa tệp
deleteFile(path: String) 
```

### Một số hàm của [Lớp mã hóa/giải mã JS (JsEncodeUtils)](https://github.com/gedoor/legado/blob/master/app/src/main/java/io/legado/app/help/JsEncodeUtils.kt)

> Cung cấp các hàm gọi nhanh thuật toán mã hóa trong môi trường JavaScript, được thực hiện bởi [hutool-crypto](https://www.hutool.cn/docs/#/crypto/%E6%A6%82%E8%BF%B0)  
> Do vấn đề tương thích, phiên bản hiện tại của hutool-crypto là 5.8.22  

> Lưu ý: Nếu tham số đầu vào không phải là Utf8String, bạn có thể gọi `java.hexDecodeToByteArray` hoặc `java.base64DecodeToByteArray` để chuyển đổi thành ByteArray trước.
* Mã hóa đối xứng
> Tham số đầu vào key, iv hỗ trợ định dạng ByteArray hoặc **Utf8String**
```js
// Tạo Cipher
java.createSymmetricCrypto(transformation, key, iv)
```
> Tham số giải mã/mã hóa data hỗ trợ định dạng ByteArray, Base64String, HexString hoặc InputStream
```js
//Giải mã thành ByteArray hoặc String
cipher.decrypt(data)
cipher.decryptStr(data)
//Mã hóa thành ByteArray, ký tự Base64 hoặc ký tự HEX
cipher.encrypt(data)
cipher.encryptBase64(data)
cipher.encryptHex(data)
```
* Mã hóa phi đối xứng
> Tham số đầu vào key hỗ trợ định dạng ByteArray hoặc **Utf8String**
```js
// Tạo Cipher
java.createAsymmetricCrypto(transformation)
//Thiết lập khóa
.setPublicKey(key)
.setPrivateKey(key)

```
> Tham số giải mã/mã hóa data hỗ trợ định dạng ByteArray, Base64String, HexString hoặc InputStream  
```js
//Giải mã thành ByteArray hoặc String
cipher.decrypt(data,  usePublicKey: Boolean? = true
)
cipher.decryptStr(data, usePublicKey: Boolean? = true
)
//Mã hóa thành ByteArray, ký tự Base64 hoặc ký tự HEX
cipher.encrypt(data,  usePublicKey: Boolean? = true
)
cipher.encryptBase64(data,  usePublicKey: Boolean? = true
)
cipher.encryptHex(data,  usePublicKey: Boolean? = true
)
```
* Chữ ký số
> Tham số đầu vào key hỗ trợ định dạng ByteArray hoặc **Utf8String**
```js
// Tạo Sign
java.createSign(algorithm)
//Thiết lập khóa
.setPublicKey(key)
.setPrivateKey(key)
```
> Tham số ký số data hỗ trợ định dạng ByteArray, InputStream hoặc String
```js
//Ký và xuất ra định dạng ByteArray hoặc HexString
sign.sign(data)
sign.signHex(data)
```
* Tóm tắt dữ liệu (Digest / Hash)
```js
java.digestHex(data: String, algorithm: String,): String?

java.digestBase64Str(data: String, algorithm: String,): String?
```
* MD5
```js
java.md5Encode(str)
java.md5Encode16(str)
```
* HMAC
```js
java.HMacHex(data: String, algorithm: String, key: String): String

java.HMacBase64(data: String, algorithm: String, key: String): String
```

## Các thuộc tính khả dụng của đối tượng book
### Thuộc tính
> Cách sử dụng: Trong JS hoặc biểu thức `{{}}`, bạn có thể lấy giá trị thông qua `book.tên_thuộc_tính`. Ví dụ, thêm `##{{book.name+"chương"+title}}` vào sau nội dung văn bản để lọc sạch các ký tự dạng Tên Sách + Chương + Tên Chương (chẳng hạn như: Tôi Là Ngôi Sao Lớn chương Chương Hai Bố Tôi Là Chủ Tịch).
```js
bookUrl // URL trang chi tiết (đối với nguồn sách cục bộ là đường dẫn tệp đầy đủ)
tocUrl // URL trang mục lục (TOC - Table of Contents)
origin // URL của nguồn sách (mặc định là BookType.local)
originName // Tên nguồn sách hoặc tên tệp sách cục bộ
name // Tên sách (lấy từ nguồn sách)
author // Tên tác giả (lấy từ nguồn sách)
kind // Thông tin phân loại (lấy từ nguồn sách)
customTag // Thông tin phân loại (do người dùng chỉnh sửa)
coverUrl // URL ảnh bìa (lấy từ nguồn sách)
customCoverUrl // URL ảnh bìa (do người dùng chỉnh sửa)
intro // Nội dung giới thiệu (lấy từ nguồn sách)
customIntro // Nội dung giới thiệu (do người dùng chỉnh sửa)
charset // Tên bộ mã ký tự tùy chỉnh (chỉ áp dụng cho sách cục bộ)
type // Loại sách: 0: văn bản (text), 1: âm thanh (audio)
group // Số chỉ mục nhóm tự định nghĩa
latestChapterTitle // Tiêu đề chương mới nhất
latestChapterTime // Thời gian cập nhật chương mới nhất
lastCheckTime // Lần cuối kiểm tra thông tin sách
lastCheckCount // Số chương mới phát hiện trong lần kiểm tra gần nhất
totalChapterNum // Tổng số chương trong mục lục
durChapterTitle // Tiêu đề chương hiện tại
durChapterIndex // Chỉ mục chương hiện tại (0-indexed)
durChapterPos // Tiến độ đọc hiện tại (vị trí chỉ mục ký tự đầu dòng)
durChapterTime // Lần đọc sách gần đây nhất (thời điểm mở chương)
canUpdate // Cho phép cập nhật thông tin sách khi làm mới tủ sách
order // Sắp xếp thủ công
originOrder // Thứ tự sắp xếp nguồn sách
variable // Thông tin biến tùy chỉnh của sách (dùng cho các quy tắc nguồn sách để tra cứu thông tin)
 ```

## Một số thuộc tính khả dụng của đối tượng chapter
> Cách sử dụng: Trong JS hoặc biểu thức `{{}}`, bạn có thể lấy giá trị thông qua `chapter.tên_thuộc_tính`. Ví dụ, thêm `##{{chapter.title+chapter.index}}` vào sau nội dung văn bản để lọc sạch các ký tự dạng Tiêu đề chương + Số thứ tự (chẳng hạn như: Chương Hai Tiên Nữ Giáng Trần 2).
 ```js
 url // Địa chỉ chương
 title // Tiêu đề chương
 baseUrl // Dùng để ghép thành URL tương đối
 bookUrl // Địa chỉ sách
 index // Số thứ tự chương
 resourceUrl // URL thực tế của tài nguyên âm thanh
 tag //
 start // Vị trí bắt đầu chương
 end // Vị trí kết thúc chương
 variable // Biến
 ```
 
## Một số hàm khả dụng của đối tượng source
* Lấy URL nguồn sách
```js
source.getKey()
```
* Lưu và lấy biến nguồn sách
```js
source.setVariable(variable: String?)
source.getVariable()
```

* Thao tác với Tiêu đề đăng nhập (Login Header)
```js
Lấy tiêu đề đăng nhập
source.getLoginHeader()
Lấy một giá trị cụ thể từ tiêu đề đăng nhập
source.getLoginHeaderMap().get(key: String)
Lưu tiêu đề đăng nhập
source.putLoginHeader(header: String)
Xóa tiêu đề đăng nhập
source.removeLoginHeader()
```
* Thao tác với thông tin đăng nhập của người dùng
> Khi sử dụng quy tắc `Giao diện đăng nhập (Login UI)` và đăng nhập thành công, Legado sẽ tự động mã hóa và lưu trữ thông tin từ quy tắc ngoại trừ các trường có loại (type) là button.
```js
Lấy thông tin đăng nhập trong hàm login
source.getLoginInfo()
Lấy giá trị cụ thể của thông tin đăng nhập trong hàm login
source.getLoginInfoMap().get(key: String)
Xóa thông tin đăng nhập
source.removeLoginInfo()
```
## Một số hàm khả dụng của đối tượng cookie
```js
Lấy toàn bộ cookie
cookie.getCookie(url)
Lấy một giá trị cụ thể từ cookie
cookie.getKey(url,key)
Thiết lập cookie
cookie.setCookie(url,cookie)
Thay thế cookie
cookie.replaceCookie(url,cookie)
Xóa cookie
cookie.removeCookie(url)
```

## Một số hàm khả dụng của đối tượng cache
> Đơn vị của saveTime: giây, có thể bỏ qua  
> Lưu vào cơ sở dữ liệu hoặc tệp lưu trữ đệm (tối đa 50MB). Nếu nội dung lưu trữ lớn, vui lòng sử dụng `getFile` và `putFile`.
```js
Lưu
cache.put(key: String, value: String, saveTime: Int)
Đọc từ cơ sở dữ liệu
cache.get(key: String): String?
Xóa
cache.delete(key: String)
Lưu trữ nội dung vào tệp đệm
cache.putFile(key: String, value: String, saveTime: Int)
Đọc nội dung tệp đệm
cache.getFile(key: String): String?
Lưu vào bộ nhớ RAM (Memory)
cache.putMemory(key: String, value: Any)
Đọc từ bộ nhớ RAM
cache.getFromMemory(key: String): Any?
Xóa khỏi bộ nhớ RAM
cache.deleteMemory(key: String)

```

## Các hàm chuyển hướng liên kết / ứng dụng ngoài
```js
// Chuyển hướng liên kết ngoài, truyền vào liên kết HTTP hoặc URI Scheme để chuyển sang trình duyệt hoặc các ứng dụng khác
java.openUrl(url:String)
// Chỉ định mimeType để chuyển sang ứng dụng thuộc loại tương ứng, ví dụ: (video/*)
java.openUrl(url:String,mimeType:String)
```