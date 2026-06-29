# Trợ giúp Quy tắc Nguồn

* [Hướng dẫn quy tắc Legado 3.0](https://mgz0227.github.io/The-tutorial-of-Legado/)
* [Tài liệu trợ giúp Nguồn sách](https://mgz0227.github.io/The-tutorial-of-Legado/Rule/source.html)
* [Tài liệu trợ giúp Nguồn đăng ký (RSS)](https://mgz0227.github.io/The-tutorial-of-Legado/Rule/rss.html)
* * Trong bàn phím phụ ❓ có thể chèn các mẫu tham số URL, mở trợ giúp, hướng dẫn JS, hướng dẫn Regex, chọn tệp.
* Ký hiệu quy tắc: Khi sử dụng quy tắc bên trong `{{......}}` thì phải có ký hiệu quy tắc rõ ràng, nếu không có ký hiệu quy tắc thì sẽ được thực thi như mã JS.
```
@@ Quy tắc mặc định, có thể bỏ qua @@ khi viết trực tiếp
@XPath: quy tắc xpath, có thể bỏ qua @XPath khi viết trực tiếp bắt đầu bằng //
@Json: quy tắc json, có thể bỏ qua @Json khi viết trực tiếp bắt đầu bằng $.
: quy tắc regex, không thể bỏ qua, chỉ có thể sử dụng trong danh sách sách và danh sách mục lục
```
* jsLib
> Tiêm JavaScript vào công cụ RhinoJS, hỗ trợ hai định dạng, có thể thực hiện [chia sẻ hàm](https://github.com/gedoor/legado/wiki/JavaScript%E5%87%BD%E6%95%B0%E5%85%B1%E7%94%A8)

> `JavaScript Code` Điền trực tiếp đoạn mã JavaScript  
> `{"example":"https://www.example.com/js/example.js", ...}` Tự động tái sử dụng các tệp JS đã tải xuống

> Lưu ý: Các hàm được định nghĩa ở đây có thể được gọi đồng thời bởi nhiều luồng. Nội dung biến toàn cục trong hàm sẽ được chia sẻ, và việc sửa đổi chúng có thể gây ra tranh chấp (race condition).
> Không thể khai báo biến toàn cục bên trong hàm, và các biến toàn cục bên ngoài hàm không thể gán lại giá trị, nếu không sẽ ném ra ngoại lệ `Không thể sửa đổi thuộc tính của đối tượng kín`.

* Tỷ lệ đồng thời (Concurrency Rate)
> Giới hạn đồng thời (đơn vị: ms), có thể điền theo hai định dạng:

> `1000` Khoảng cách truy cập 1 giây  
> `20/60000` Số lần truy cập là 20 lần trong vòng 60 giây  

* Loại nguồn sách: Tệp (File)
> Đối với các trang web như Zhixuan Cangshu cung cấp tải xuống tệp tích hợp, bạn có thể lấy liên kết tệp trong quy tắc URL tải xuống ở chi tiết nguồn sách.

> Lấy thông tin tệp bằng cách trích xuất từ liên kết tải xuống hoặc tiêu đề phản hồi tệp. Nếu lấy thất bại, hệ thống sẽ tự động ghép `Tên sách`, `Tác giả` và trường `type` trong `UrlOption` của liên kết tải xuống.

> Bộ đệm giải nén của tệp nén sẽ tự động được dọn dẹp sau lần khởi động tiếp theo, không chiếm thêm không gian lưu trữ.  

* CookieJar
> Khi được bật, hệ thống sẽ tự động lưu giá trị Set-Cookie trong mỗi tiêu đề trả về, thích hợp cho các trang web yêu cầu session như trang có hình ảnh mã xác thực (CAPTCHA).

* Giao diện đăng nhập (Login UI)
> Không sử dụng webView tích hợp để đăng nhập trang web, cần sử dụng quy tắc `URL đăng nhập` để thực hiện logic đăng nhập, và có thể sử dụng `JS kiểm tra đăng nhập` để kiểm tra kết quả đăng nhập.  
> Thay đổi quan trọng trong phiên bản 20221113: Các nút hỗ trợ gọi các hàm bên trong quy tắc `URL đăng nhập`, bắt buộc phải triển khai hàm `login`.
```
Ví dụ điền quy tắc
[
    {
        "name": "telephone",
        "type": "text"
    },
    {
        "name": "password",
        "type": "password"
    },
    {
        "name": "Đăng ký",
        "type": "button",
        "action": "http://www.yooike.com/xiaoshuo/#/register?title=%E6%B3%A8%E5%86%8C"
    },
    {
        "name": "Lấy mã xác thực",
        "type": "button",
        "action": "getVerificationCode()",
        "style": {
            "layout_flexGrow": 0,
            "layout_flexShrink": 1,
            "layout_alignSelf": "auto",
            "layout_flexBasisPercent": -1,
            "layout_wrapBefore": false
        }
    }
]
```
* URL đăng nhập
> Có thể điền liên kết đăng nhập hoặc mã JavaScript thực hiện logic đăng nhập của Giao diện đăng nhập (Login UI).
```
Ví dụ điền
function login() {
    java.log("Mô phỏng yêu cầu đăng nhập");
    java.log(source.getLoginInfoMap());
}
function getVerificationCode() {
    java.log("Nút UI Đăng nhập: Đã nhận được số điện thoại "+result.get("telephone"))
}

Hàm nút đăng nhập lấy thông tin đăng nhập
result.get("telephone")
Hàm login lấy thông tin đăng nhập
source.getLoginInfo()
source.getLoginInfoMap().get("telephone")
Các phương thức liên quan đến đăng nhập của source, có thể gọi qua source. trong JS, tham khảo Đăng nhập bằng giọng nói Aliyun
login()
getHeaderMap(hasLoginHeader: Boolean = false)
getLoginHeader(): String?
getLoginHeaderMap(): Map<String, String>?
putLoginHeader(header: String)
removeLoginHeader()
setVariable(variable: String?)
getVariable(): String?
Các hàm liên quan đến AnalyzeUrl, gọi qua java. trong JS
initUrl() //Phân tích lại URL, có thể dùng để phân tích lại và truy cập lại URL sau khi đăng nhập thành công qua JS kiểm tra đăng nhập
getHeaderMap().putAll(source.getHeaderMap(true)) //Thiết lập lại tiêu đề đăng nhập (Login Header)
getStrResponse( jsStr: String? = null, sourceRegex: String? = null) //Trả về kết quả truy cập dưới dạng văn bản, có thể gọi phương thức này để nhận lại kết quả sau khi nguồn sách tự động đăng nhập lại
getResponse(): Response //Trả về kết quả phản hồi mạng (được sử dụng bởi công cụ đọc trực tuyến), có thể truy cập lại bằng cách gọi phương thức này sau khi thực hiện đăng nhập. Tham khảo tính năng kiểm tra đăng nhập của Aliyun.
```

* Định dạng URL khám phá
```json
[
  {
    "title": "xxx",
    "url": "",
    "style": {
      "layout_flexGrow": 0,
      "layout_flexShrink": 1,
      "layout_alignSelf": "auto",
      "layout_flexBasisPercent": -1,
      "layout_wrapBefore": false
    }
  }
]
```

* Tiêu đề yêu cầu (Request Headers), hỗ trợ cài đặt proxy HTTP, SOCKS4, SOCKS5
> Lưu ý: Key của tiêu đề yêu cầu phân biệt chữ hoa chữ thường.  
> Định dạng đúng: User-Agent, Referer  
> Định dạng sai: user-agent, referer
```
Proxy SOCKS5
{
  "proxy":"socks5://127.0.0.1:1080"
}
Proxy HTTP
{
  "proxy":"http://127.0.0.1:1080"
}
Hỗ trợ xác thực máy chủ proxy HTTP
{
  "proxy":"http://127.0.0.1:1080@tên_đăng_nhập@mật_khẩu"
}
Lưu ý: Các tiêu đề yêu cầu sau là vô nghĩa và sẽ bị bỏ qua
```

* URL thêm tham số JS, thực thi khi phân tích URL, có thể xử lý URL khi truy cập. Ví dụ:
```
https://www.baidu.com,{"js":"java.headerMap.put('xxx', 'yyy')"}
https://www.baidu.com,{"js":"java.url=java.url+'yyyy'"}
```

* Thêm phương thức JS dùng để chặn chuyển hướng (Redirect)
  * `java.get(urlStr: String, headers: Map<String, String>)`
  * `java.post(urlStr: String, body: String, headers: Map<String, String>)`
* Đối với các nguồn chuyển hướng tìm kiếm, bạn có thể sử dụng phương thức này để lấy URL sau khi chuyển hướng.
```
(()=>{
  if(page==1){
    let url='https://www.yooread.net/e/search/index.php,'+JSON.stringify({
    "method":"POST",
    "body":"show=title&tempid=1&keyboard="+key
    });
    return source.put('surl',String(java.connect(url).raw().request().url()));
  } else {
    return source.get('surl')+'&page='+(page-1)
  }
})()
Hoặc
(()=>{
  let base='https://www.yooread.net/e/search/';
  if(page==1){
    let url=base+'index.php';
    let body='show=title&tempid=1&keyboard='+key;
    return base+source.put('surl',java.post(url,body,{}).header("Location"));
  } else {
    return base+source.get('surl')+'&page='+(page-1);
  }
})()
```

* Liên kết hình ảnh hỗ trợ sửa đổi tiêu đề (Headers)
```
let options = {
"headers": {"User-Agent": "xxxx","Referrer":baseUrl,"Cookie":"aaa=vbbb;"}
};
'<img src="'+src+","+JSON.stringify(options)+'">'
```

* Sử dụng phân tích phông chữ (Font)
> Cách dùng: Sử dụng trong quy tắc thay thế văn bản chính. Nguyên lý là dựa trên dữ liệu glyph của phông chữ f1 để tìm mã hóa tương ứng của glyph đó trong phông chữ f2.
```
<js>
(function(){
  var b64=String(src).match(/ttf;base64,([^\)]+)/);
  if(b64){
    var f1 = java.queryTTF(b64[1]);
    var f2 = java.queryTTF("https://alanskycn.gitee.io/teachme/assets/font/Source Han Sans CN Regular.ttf");
    // return java.replaceFont(result, f1, f2);
    return java.replaceFont(result, f1, f2, true); // Lọc bỏ các glyph không tồn tại trong f1
  }
  return result;
})()
</js>
```

* Thao tác mua hàng (Purchase)
> Có thể điền trực tiếp liên kết hoặc mã JavaScript. Nếu kết quả thực thi là liên kết mạng thì trình duyệt sẽ tự động được mở; nếu JS trả về true, hệ thống sẽ tự động làm mới mục lục và chương hiện tại.

* Giải mã hình ảnh
> Áp dụng cho các trường hợp hình ảnh cần giải mã lần hai, điền trực tiếp mã JavaScript và trả về `ByteArray` sau khi giải mã.  
> Giải thích một số biến: java (chỉ hỗ trợ [lớp mở rộng JS (JsExtensions)](https://github.com/gedoor/legado/blob/master/app/src/main/java/io/legado/app/help/JsExtensions.kt)), result là `ByteArray` của hình ảnh cần giải mã, src là liên kết hình ảnh.

```js
java.createSymmetricCrypto("AES/CBC/PKCS5Padding", key, iv).decrypt(result)
```

```js
function decodeImage(data, key) {
  var input = new Packages.java.io.ByteArrayInputStream(data)
  var out = new Packages.java.io.ByteArrayOutputStream()
  var byte
  while ((byte = input.read()) != -1) {
    out.write(byte ^ key)
  }
  return out.toByteArray()
}

decodeImage(result, key)
```

* Giải mã ảnh bìa
> Tương tự như giải mã hình ảnh, trong đó result là `inputStream` của ảnh bìa cần giải mã.

```js
java.createSymmetricCrypto("AES/CBC/PKCS5Padding", key, iv).decrypt(result)
```

```js
function decodeImage(data, key) {
  var out = new Packages.java.io.ByteArrayOutputStream()
  var byte
  while ((byte = data.read()) != -1) {
    out.write(byte ^ key)
  }
  return out.toByteArray()
}

decodeImage(result, key)
```
