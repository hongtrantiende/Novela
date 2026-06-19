# Chi tiết về biểu thức đường dẫn XPath

_Lưu ý: Tất cả mã trong bài viết này đã được xác thực qua Chrome (Phiên bản 123.0.6312.86)_

> Đặc tả XPath định nghĩa 13 loại trục (axes) khác nhau.  
> Trục biểu thị mối quan hệ với phần tử hiện tại và được sử dụng để định vị các phần tử trên cây phần tử tương đối so với phần tử đó.

-   `namespace` (Không hỗ trợ)
-   `attribute` Thuộc tính của phần tử. Có thể viết tắt là `@`
-   `self` Biểu thị chính phần tử đó. Có thể viết tắt là `.`
-   `parent` Phần tử cha của phần tử hiện tại. Có thể viết tắt là `..`
-   `child` Phần tử con của phần tử hiện tại.
-   `ancestor` Tất cả tổ tiên trực tiếp của phần tử hiện tại.
-   `ancestor-or-self` Phần tử hiện tại và tất cả tổ tiên trực tiếp của nó.
-   `descendant` Tất cả các phần tử con đệ quy (hậu duệ) của phần tử hiện tại.
-   `descendant-or-self` Phần tử hiện tại và tất cả các phần tử hậu duệ của nó.
-   `following` Tất cả các phần tử xuất hiện sau phần tử hiện tại. Bỏ qua phân cấp phần tử, nhưng không bao gồm hậu duệ trực tiếp.
-   `following-sibling` Tất cả các phần tử cùng cấp xuất hiện sau phần tử hiện tại.
-   `preceding` Tất cả các phần tử xuất hiện trước phần tử hiện tại. Bỏ qua phân cấp phần tử, nhưng không bao gồm tổ tiên trực tiếp.
-   `preceding-sibling` Tất cả các phần tử cùng cấp xuất hiện trước phần tử hiện tại.

```js
// Cách dùng trục -> TênTrục::BiểuThức
// Ví dụ:
> $x('//body/ancestor-or-self::*')
< [body, html]
```

#### 1. Định dạng cơ bản của biểu thức XPath

> XPath sử dụng "biểu thức đường dẫn" (Path Expression) để chọn các phần tử.  
> Về mặt hình thức, "biểu thức đường dẫn" rất giống với hệ thống tập tin truyền thống.

```txt
# Dấu gạch chéo "/" làm dấu phân cách bên trong đường dẫn.
# Cùng một phần tử có hai cách viết: đường dẫn tuyệt đối và đường dẫn tương đối.
# Đường dẫn tuyệt đối phải bắt đầu bằng "/", theo sau trực tiếp là phần tử gốc, ví dụ: /step/step/...
# Đường dẫn tương đối là các cách viết khác ngoài đường dẫn tuyệt đối, ví dụ: step/step, nghĩa là không bắt đầu bằng "/".
# "." biểu thị phần tử hiện tại.
# ".." biểu thị phần tử cha của phần tử hiện tại.
```

### 2. Các quy tắc cơ bản để chọn phần tử

```txt
- "/" : Chọn phần tử gốc
- "//" : Chọn một phần tử nào đó ở bất kỳ vị trí nào
- nodename : Chọn phần tử có tên được chỉ định
- "@" : Chọn một thuộc tính nào đó
```

### 3. Các ví dụ chọn phần tử

```html
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Tiêu đề</title>
        <meta property="author" content="Tác giả" />
    </head>
    <body>
        <div>
            <title lang="eng">Harry Potter</title>
            <p>29.39</p>
            <p>usd</p>
        </div>
        <div>
            <title lang="cn">Lập trình C++ nâng cao</title>
            <p>39.95</p>
            <p>rmb</p>
        </div>
        <div id="list">
            <dl>
                <dd><a href="/1">Một</a></dd>
                <dd><a href="/2">Hai</a></dd>
                <dd><a href="/3">Ba</a></dd>
            </dl>
        </div>
    </body>
</html>
```

```js
// Ví dụ 1
> $x('/') // Chọn phần tử gốc, trả về mảng chứa phần tử được chọn.
< [document]
// Ví dụ 2
> $x('/html') // Chọn tất cả phần tử con html dưới phần tử gốc, đây là cách viết đường dẫn tuyệt đối.
< [html]
// Ví dụ 3
> $x('html/head/meta') // Chọn tất cả phần tử meta dưới phần tử head, đây là cách viết đường dẫn tương đối.
< [meta, meta]  // <meta charset="utf-8">, <meta property="author" content="Tác giả">
// Ví dụ 4
> $x('//p') // Chọn tất cả phần tử p, bất kể vị trí của chúng
< [p, p, p, p] // <p>29.39</p>, <p>usd</p>, <p>39.95</p>, <p>rmb</p>
// Ví dụ 5
> $x('html/body//a') // Chọn tất cả phần tử a dưới phần tử body
< [a, a, a] // <a href="/1">Một</a>, <a href="/2">Hai</a>, <a href="/3">Ba</a>
// Ví dụ 6
> $x('//@lang') // Chọn tất cả thuộc tính có tên là lang.
< [lang, lang] // lang="eng", lang="cn"
> $x('html/head/meta/@content') // Chọn thuộc tính content của tất cả các phần tử meta dưới phần tử head.
< [content] // content="Tác giả"
// Ví dụ 7
> $x('//meta/..') // Chọn phần tử cha của tất cả phần tử meta (kết quả trùng lặp chỉ trả về một phần tử duy nhất).
< [head] // <head>...</head>
```

### 4. Điều kiện vị ngữ (Predicate) của XPath

> Cái gọi là "điều kiện vị ngữ" chính là điều kiện bổ sung cho biểu thức đường dẫn.  
> Tất cả các điều kiện bổ sung đều được viết trong dấu ngoặc vuông `[]`, dùng để lọc thêm phần tử.
> Chỉ những phần tử có kết quả biểu thức trong dấu ngoặc vuông là true mới được chọn.

```js
// Ví dụ 8
> $x('html/head/meta[1]') // Chọn phần tử meta đầu tiên dưới phần tử head
< [meta] // <meta charset="utf-8">
> $x('//p[1]') // Chọn phần tử p đầu tiên dưới tất cả phần tử cha
< [p, p] // <p>29.39</p>, <p>39.95</p>
// Ví dụ 9
> $x('html/head/meta[last()]') // Chọn phần tử meta cuối cùng dưới phần tử head
< [meta] // <meta property="author" content="Tác giả">
// Ví dụ 10
> $x('html/head/meta[last()-1]') // Chọn phần tử meta kế cuối dưới phần tử head
< [meta] // <meta charset="utf-8">
// Ví dụ 11
> $x('html/head/meta[position()>1]') // Chọn tất cả phần tử meta dưới phần tử head ngoại trừ phần tử đầu tiên
< [meta] // <meta property="author" content="Tác giả">
// Ví dụ 12
> $x('//title[@lang]') // Chọn tất cả phần tử title có thuộc tính lang.
< [title, title] // <title lang="eng">Harry Potter</title>, <title lang="cn">Lập trình C++ nâng cao</title>
// Ví dụ 13
> $x('//title[@lang="eng"]') // Chọn tất cả phần tử title có giá trị thuộc tính lang bằng "eng".
< [title] // <title lang="eng">Harry Potter</title>
// Ví dụ 14
> $x('/html/body/div[dl]') // Chọn phần tử con div của body, và phần tử div được chọn phải chứa phần tử con dl.
< [div] // <div id="list"><dl id="list">...</dl></div>
// Ví dụ 15
> $x('/html/body/div[p>35.00]') // Chọn phần tử con div của body, và giá trị phần tử con p của div được chọn phải lớn hơn 35.00.
< [div] // <div><title lang="cn">Lập trình C++ nâng cao</title><p>39.95</p><p>rmb</p></div>
> $x('/html/body/div[p="rmb"]') // Chọn phần tử con div của body, và giá trị phần tử con p của div được chọn phải bằng "rmb".
< [div] // <div><title lang="cn">Lập trình C++ nâng cao</title><p>39.95</p><p>rmb</p></div>
// Ví dụ 16
> $x('/html/body/div[p="rmb"]/title') // Chọn phần tử con title trong tập kết quả của Ví dụ 15.
< [title] // <title lang="cn">Lập trình C++ nâng cao</title>
// Ví dụ 17
> $x('/html/body/div/p[.>35.00]') // Chọn phần tử con p của "/html/body/div" có giá trị lớn hơn 35.00.
< [p] // <p>39.95</p>
```

### 5. Ký tự đại diện (Wildcard)

-   `\*` Biểu thị khớp với bất kỳ phần tử nào.
-   `@\*` Biểu thị khớp với bất kỳ tên thuộc tính nào.

```js
// Ví dụ 18
> $x('//*') // Chọn tất cả các phần tử, kết quả được trả về theo thứ tự đệ quy
< [html, head, meta, title, meta, body, div, title, p, p, div, title, p, p, div, dl, dd, a, dd, a, dd, a]
// Ví dụ 19
> $x('/*/*') // Chọn tất cả phần tử ở cấp thứ hai
< [head, body] // <head>...</head>, <body>...</body>
// Ví dụ 20
> $x('//dl[@id="list"]/*') // Chọn tất cả phần tử con của phần tử dl có id="list".
< [dd, dd, dd] // <dd><a href="/1">Một</a></dd>, <dd><a href="/2">Hai</a></dd>, <dd><a href="/3">Ba</a></dd>
// Ví dụ 21
> $x('//title[@*]') // Chọn tất cả các phần tử title có thuộc tính.
< [title, title] // <title lang="eng">Harry Potter</title>, <title lang="cn">Lập trình C++ nâng cao</title>
```

### 6. Chọn nhiều đường dẫn

-   Sử dụng `|` để gộp kết quả chọn của nhiều biểu thức.

```js
// Ví dụ 22
> $x('//title | //a') // Chọn tất cả các phần tử title và a.
< [title, title, title, a, a, a]

```

### 7. Các hàm của XPath

> Tham số của hàm XPath có thể là chuỗi tĩnh hoặc biểu thức, và các hàm có thể được gọi lồng nhau.  
> Các chỉ mục trong XPath đều bắt đầu từ 1, chứ không phải từ 0.

```js
// boolean(expression) Chuyển đổi kết quả chọn của biểu thức thành giá trị boolean.
> $x('boolean(//title)')
< true
// number([object]) Chuyển đổi kết quả chọn của biểu thức thành một số (nội dung phần tử HTML mặc định là chuỗi).
> $x('number(//p[1])')
< 29.39
// round(decimal) Chuyển đổi tham số số thành số nguyên và làm tròn số.
> $x('round(//p[1])')
< 29
// ceiling(number) Chuyển đổi tham số số thành số nguyên và làm tròn lên. ceiling(5.2)=6
> $x('ceiling(//p[1])') // Chỉ sử dụng phần tử đầu tiên khớp với biểu thức
< 30
// floor(number) Chuyển đổi tham số số thành số nguyên và làm tròn xuống. floor(5.8)=5
> $x('floor(//p[1])')
< 29
// concat( string1, string2 [,stringn]* ) Ghép chuỗi, các tham số là chuỗi tĩnh hoặc biểu thức
> $x('concat("cost:", //p[1], //p[2])') // Chỉ sử dụng phần tử đầu tiên khớp với biểu thức
< 'cost:29.39usd'
// contains(haystack, needle) Xác định xem haystack có chứa needle hay không, trả về boolean
> $x('contains(//p[1], "29.39")') // Chỉ sử dụng phần tử đầu tiên khớp với biểu thức
< true
> $x('//title[contains(., "Harry")]') // Chọn các phần tử title có nội dung chứa "Harry".
< [title] // <title lang="eng">Harry Potter</title>
// count( node-set ) Thống kê số lượng phần tử được biểu thức chọn.
> $x('count(//p)')
< 4
// id(expression) Chọn phần tử dựa trên thuộc tính id. Nếu tham số là một biểu thức, kết quả của biểu thức sẽ được lấy làm id để truy vấn.
> $x('id(//dl/@id)') // Tương đương với $x('id("list")')
< [dl#list] // <dl id="list">...</dl>
// last() Trả về số lượng thành viên của tập hợp phần tử cùng cấp khớp với biểu thức đường dẫn hiện tại.
> $x('//p[last()]')
< [p, p] // <p>usd</p>, <p>rmb</p>
// name([node-set]) Trả về tên phần tử kèm theo không gian tên (namespace) của thành viên đầu tiên trong tập hợp được biểu thức chọn, trong HTML tương đương với local-name([node-set]).
// local-name([node-set]) Trả về tên phần tử cục bộ (local name) của thành viên đầu tiên trong tập hợp được biểu thức chọn.
> $x('local-name(//*[@id])') //
< 'dl'
// namespace-uri([node-set]) Lấy URI không gian tên (namespace URI) của nút đầu tiên trong tập hợp nút được chọn.
> $x('namespace-uri(//div)')
< 'http://www.w3.org/1999/xhtml' // HTML thường trả về giá trị cố định này
// normalize-space([string]) Loại bỏ khoảng trắng ở đầu và cuối nội dung văn bản, đồng thời thay thế các khoảng trắng liên tiếp bên trong bằng một khoảng trắng đơn.
> $x('normalize-space("  test    string   ")')
< 'test string'
// not(expression) Trả về giá trị boolean phủ định của biểu thức.
> $x('//title[not(@lang)]')
< [title] // <title>Tiêu đề</title>
// position() Trả về vị trí của phần tử được chọn trong tập hợp phần tử cùng cấp khớp với biểu thức đường dẫn.
> $x('//meta[position()=2]')
< [meta] // <meta property="author" content="Tác giả" />
// starts-with(haystack, needle) Kiểm tra xem một chuỗi haystack có bắt đầu bằng một chuỗi needle khác hay không.
> $x('//title[starts-with(., "Cpp")]')
< [title] // <title lang="cn">Lập trình C++ nâng cao</title]
// string([object]) Chuyển đổi tham số đã cho thành chuỗi
> $x('string(//p)')
< '29.39'
// string-length([string]) Trả về số lượng ký tự của chuỗi đã cho
> $x('string-length(string(//p))')
< 5
// substring(string, start[, length]) Trích xuất một chuỗi con
> $x('substring(string(//p), 1, 3)')
< '29.'
// substring-after(haystack, needle) Trả về chuỗi phía sau needle đầu tiên được tìm thấy trong chuỗi haystack.
> $x('substring-after(string(//p), ".")')
< '39'
// substring-before(haystack, needle) Trả về chuỗi phía trước needle đầu tiên được tìm thấy trong chuỗi haystack.
> $x('substring-before(string(//p), ".")')
< '29'
// sum([node-set]) Tính tổng các số trong tập hợp đã cho. Nếu có giá trị không phải số trong tập hợp, trả về NaN
> $x('sum(//p[1])')
< 69.34
// translate(string, "abc", "XYZ") Thay thế các ký tự a, b, c xuất hiện trong string bằng X, Y, Z tương ứng.
// Nếu số lượng ký tự trong tham số thứ sau ít hơn tham số thứ hai, các ký tự tương ứng trong tham số thứ nhất sẽ bị xóa.
> $x('translate("aabbcc112233", "ac2", "V8")')
< 'VVbb881133'
// true() Biểu thị giá trị boolean true trong hàm
// false() Biểu thị giá trị boolean false trong hàm
```
