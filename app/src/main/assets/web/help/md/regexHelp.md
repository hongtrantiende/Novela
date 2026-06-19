# Học biểu thức chính quy (Regex)

- [Khớp cơ bản]
- [Ký tự đặc biệt (Metacharacter)]
  - [Dấu chấm tiếng Anh]
  - [Tập hợp ký tự]
    - [Tập hợp ký tự phủ định]
  - [Lặp lại]
    - [Dấu sao]
    - [Dấu cộng]
    - [Dấu hỏi]
  - [Dấu ngoặc nhọn]
  - [Nhóm ký tự]
  - [Cấu trúc nhánh]
  - [Thoát ký tự đặc biệt]
  - [Trình định vị]
    - [Ký tự mũ (Caret)]
    - [Ký tự đô la (Dollar)]
- [Tập hợp ký tự viết tắt]
- [Khẳng định (Assertion / Lookaround)]
  - [Khẳng định nhìn trước tích cực (Positive Lookahead)]
  - [Khẳng định nhìn trước tiêu cực (Negative Lookahead)]
  - [Khẳng định nhìn sau tích cực (Positive Lookbehind)]
  - [Khẳng định nhìn sau tiêu cực (Negative Lookbehind)]
- [Cờ (Flag)]
  - [Không phân biệt chữ hoa chữ thường]
  - [Tìm kiếm toàn cục]
  - [Khớp nhiều dòng]
- [Biểu thức chính quy thông dụng]

## 1. Khớp cơ bản

Biểu thức chính quy chỉ là các mẫu mà chúng ta sử dụng để tìm kiếm các chữ cái và chữ số trong văn bản. Ví dụ: biểu thức chính quy `cat`, có nghĩa là: chữ cái `c` theo sau bởi chữ cái `a`, và sau đó là chữ cái `t`.
<pre>"cat" => The <a href="#learn-regex"><strong>cat</strong></a> sat on the mat</pre>

Biểu thức chính quy `123` sẽ khớp với chuỗi "123". Việc khớp chính quy được thực hiện bằng cách so sánh từng ký tự trong biểu thức chính quy với từng ký tự trong chuỗi cần khớp.
Biểu thức chính quy thường phân biệt chữ hoa chữ thường, vì vậy biểu thức chính quy `Cat` không khớp với chuỗi "cat".
<pre>"Cat" => The cat sat on the <a href="#learn-regex"><strong>Cat</strong></a></pre>

## 2. Ký tự đặc biệt (Metacharacter)

Ký tự đặc biệt là các thành phần cơ bản của biểu thức chính quy. Ký tự đặc biệt ở đây không mang ý nghĩa thông thường của nó mà được giải thích theo một ý nghĩa đặc biệt nào đó. Một số ký tự đặc biệt có ý nghĩa riêng khi được viết trong dấu ngoặc vuông.
Các ký tự đặc biệt như sau:

|Ký tự đặc biệt|Mô tả|
|:----:|----|
|.|Khớp với bất kỳ ký tự nào ngoại trừ ký tự xuống dòng.|
|[ ]|Lớp ký tự, khớp với bất kỳ ký tự nào nằm trong dấu ngoặc vuông.|
|[^ ]|Lớp ký tự phủ định. Khớp với bất kỳ ký tự nào không nằm trong dấu ngoặc vuông.|
|*|Khớp với biểu thức con phía trước không hoặc nhiều lần.|
|+|Khớp với biểu thức con phía trước một hoặc nhiều lần.|
|?|Khớp với biểu thức con phía trước không hoặc một lần, hoặc chỉ định một lượng từ không tham lam (non-greedy).|
|{n,m}|Dấu ngoặc nhọn, khớp với ký tự phía trước ít nhất n lần nhưng không quá m lần.|
|(xyz)|Nhóm ký tự, khớp với các ký tự xyz theo đúng thứ tự.|
|&#124;|Cấu trúc nhánh, khớp với các ký tự trước hoặc sau ký hiệu này.|
|&#92;|Ký tự thoát, nó khôi phục lại ý nghĩa ban đầu của ký tự đặc biệt, cho phép bạn khớp với các ký tự dành riêng <code>[ ] ( ) { } . * + ? ^ $ \ &#124;</code>|
|^|Khớp với vị trí bắt đầu của dòng.|
|$|Khớp với vị trí kết thúc của dòng.|

## 2.1 Dấu chấm tiếng Anh

Dấu chấm tiếng Anh `.` là ví dụ đơn giản nhất về ký tự đặc biệt. Ký tự đặc biệt `.` có thể khớp với bất kỳ ký tự đơn nào. Nó sẽ không khớp với ký tự xuống dòng hoặc dòng mới. Ví dụ: biểu thức chính quy `.ar`, có nghĩa là: bất kỳ ký tự nào theo sau bởi chữ cái `a`, và sau đó là chữ cái `r`.
<pre>".ar" => The <a href="#learn-regex"><strong>car</strong></a> <a href="#learn-regex"><strong>par</strong></a>ked in the <a href="#learn-regex"><strong>gar</strong></a>age.</pre>

## 2.2 Tập hợp ký tự

Tập hợp ký tự còn được gọi là lớp ký tự. Dấu ngoặc vuông được sử dụng để chỉ định tập hợp ký tự. Sử dụng dấu gạch nối trong dấu ngoặc vuông để chỉ định một phạm vi ký tự. Thứ tự của phạm vi ký tự trong dấu ngoặc vuông không quan trọng.
Ví dụ: biểu thức chính quy `[Tt]he`, có nghĩa là: chữ `T` hoa hoặc chữ `t` thường, tiếp theo là chữ `h`, rồi đến chữ `e`.
<pre>"[Tt]he" => <a href="#learn-regex"><strong>The</strong></a> car parked in <a href="#learn-regex"><strong>the</strong></a> garage.</pre>

Tuy nhiên, dấu chấm tiếng Anh trong tập hợp ký tự sẽ biểu thị ý nghĩa thực tế của nó. Biểu thức chính quy `ar[.]` đại diện cho chữ cái viết thường `a`, tiếp theo là chữ cái `r`, và sau đó là một dấu chấm `.`.
<pre>"ar[.]" => A garage is a good place to park a c<a href="#learn-regex"><strong>ar.</strong></a></pre>

### 2.2.1 Tập hợp ký tự phủ định

Thông thường ký tự mũ `^` biểu thị điểm bắt đầu của một chuỗi, nhưng khi nó xuất hiện bên trong dấu ngoặc vuông, nó sẽ phủ định tập hợp ký tự đó. Ví dụ: biểu thức chính quy `[^c]ar` có nghĩa là: bất kỳ ký tự nào ngoại trừ chữ cái `c`, theo sau bởi ký tự `a`, rồi đến chữ cái `r`.
<pre>"[^c]ar" => The car <a href="#learn-regex"><strong>par</strong></a>ked in the <a href="#learn-regex"><strong>gar</strong></a>age.</pre>

## 2.3 Lặp lại

Các ký tự đặc biệt `+`, `*` hoặc `?` dưới đây được sử dụng để chỉ định tần suất xuất hiện của một mẫu con. Các ký tự đặc biệt này hoạt động khác nhau trong những tình huống khác nhau.

### 2.3.1 Dấu sao

Ký hiệu `*` biểu thị khớp không hoặc nhiều lần với quy tắc khớp trước đó. Biểu thức chính quy `a*` có nghĩa là chữ cái viết thường `a` có thể lặp lại không hoặc nhiều lần. Tuy nhiên, nếu nó xuất hiện sau một tập hợp ký tự hoặc lớp ký tự, nó biểu thị sự lặp lại của toàn bộ tập hợp ký tự đó.
Ví dụ: biểu thức chính quy `[a-z]*` biểu thị: một dòng có thể chứa bất kỳ số lượng chữ cái viết thường nào.
<pre>"[a-z]*" => T<a href="#learn-regex"><strong>he</strong></a> <a href="#learn-regex"><strong>car</strong></a> <a href="#learn-regex"><strong>parked</strong></a> <a href="#learn-regex"><strong>in</strong></a> <a href="#learn-regex"><strong>the</strong></a> <a href="#learn-regex"><strong>garage</strong></a> #21.</pre>

Ký hiệu `*` này có thể được sử dụng cùng với ký tự đặc biệt `.` để khớp với bất kỳ chuỗi nào `.*`. Ký hiệu `*` này cũng có thể được sử dụng cùng với ký tự khoảng trắng `\s` để khớp với một loạt ký tự khoảng trắng.
Ví dụ: biểu thức chính quy `\s*cat\s*` có nghĩa là: không hoặc nhiều khoảng trắng, tiếp theo là chữ cái viết thường `c`, tiếp theo là chữ cái `a`, tiếp theo là chữ cái `t`, và sau đó là không hoặc nhiều khoảng trắng.
<pre>"\s*cat\s*" => The fat<a href="#learn-regex"><strong> cat </strong></a>sat on the <a href="#learn-regex"><strong>cat</strong></a>.</pre>

### 2.3.2 Dấu cộng

Ký hiệu `+` khớp với ký tự trước đó một hoặc nhiều lần. Ví dụ: biểu thức chính quy `c.+t` có nghĩa là: một chữ cái viết thường `c`, theo sau bởi bất kỳ số lượng ký tự nào, và tiếp theo là chữ cái viết thường `t`.
<pre>"c.+t" => The fat <a href="#learn-regex"><strong>cat sat on the mat</strong></a>.</pre>

### 2.3.3 Dấu hỏi

Trong biểu thức chính quy, ký tự đặc biệt `?` được sử dụng để chỉ ra rằng ký tự trước đó là tùy chọn (có thể có hoặc không). Ký hiệu này khớp với ký tự trước đó không hoặc một lần.
Ví dụ: biểu thức chính quy `[T]?he` có nghĩa là: chữ `T` viết hoa tùy chọn, theo sau là chữ cái viết thường `h`, tiếp theo là chữ cái viết thường `e`.
<pre>"[T]he" => <a href="#learn-regex"><strong>The</strong></a> car is parked in the garage.</pre><pre>"[T]?he" => <a href="#learn-regex"><strong>The</strong></a> car is parked in t<a href="#learn-regex"><strong>he</strong></a> garage.</pre>

## 2.4 Dấu ngoặc nhọn

Trong biểu thức chính quy, dấu ngoặc nhọn (còn được gọi là lượng từ) được sử dụng để chỉ định số lần một ký tự hoặc một nhóm ký tự có thể lặp lại. Ví dụ: biểu thức chính quy `[0-9]{2,3}` có nghĩa là: khớp với ít nhất 2 chữ số nhưng không quá 3 chữ số (các ký tự trong phạm vi từ 0 đến 9).
<pre>"[0-9]{2,3}" => The number was 9.<a href="#learn-regex"><strong>999</strong></a>7 but we rounded it off to <a href="#learn-regex"><strong>10</strong></a>.0.</pre>

Chúng ta có thể bỏ qua số thứ hai. Ví dụ: biểu thức chính quy `[0-9]{2,}` có nghĩa là: khớp với 2 chữ số trở lên. Nếu chúng ta cũng xóa dấu phẩy, biểu thức chính quy `[0-9]{2}` có nghĩa là: khớp với chính xác chữ số có 2 chữ số.
<pre>"[0-9]{2,}" => The number was 9.<a href="#learn-regex"><strong>9997</strong></a> but we rounded it off to <a href="#learn-regex"><strong>10</strong></a>.0.</pre><pre>"[0-9]{2}" => The number was 9.<a href="#learn-regex"><strong>99</strong></a><a href="#learn-regex"><strong>97</strong></a> but we rounded it off to <a href="#learn-regex"><strong>10</strong></a>.0.</pre>

## 2.5 Nhóm ký tự

Nhóm ký tự là một nhóm các biểu thức con được viết trong dấu ngoặc đơn `(...)`. Như chúng ta đã thảo luận trong biểu thức chính quy, nếu chúng ta đặt một lượng từ sau một ký tự, nó sẽ lặp lại ký tự trước đó.
Tuy nhiên, nếu chúng ta đặt lượng từ sau một nhóm ký tự, nó sẽ lặp lại toàn bộ nhóm ký tự đó.
Ví dụ: biểu thức chính quy `(ab)*` đại diện cho việc khớp với chuỗi "ab" không hoặc nhiều lần. Chúng ta cũng có thể sử dụng ký tự đặc biệt `|` trong nhóm ký tự. Ví dụ: biểu thức chính quy `(c|g|p)ar` có nghĩa là: chữ cái viết thường `c`, `g` hoặc `p` theo sau bởi chữ cái `a`, tiếp theo là chữ cái `r`.
<pre>"(c|g|p)ar" => The <a href="#learn-regex"><strong>car</strong></a> is <a href="#learn-regex"><strong>par</strong></a>ked in the <a href="#learn-regex"><strong>gar</strong></a>age.</pre>

## 2.6 Cấu trúc nhánh

Trong biểu thức chính quy, thanh đứng `|` được sử dụng để định nghĩa cấu trúc nhánh, cấu trúc nhánh này hoạt động giống như một điều kiện giữa nhiều biểu thức. Bây giờ bạn có thể nghĩ rằng tập hợp ký tự và cấu trúc nhánh hoạt động theo cùng một cách.
Nhưng sự kết hợp lớn giữa tập hợp ký tự và cấu trúc nhánh là tập hợp ký tự chỉ hoạt động ở cấp độ ký tự, trong khi cấu trúc nhánh vẫn có thể được sử dụng ở cấp độ biểu thức.
Ví dụ: biểu thức chính quy `(T|t)he|car` có nghĩa là: chữ `T` viết hoa hoặc chữ `t` viết thường, theo sau bởi chữ cái viết thường `h`, tiếp theo là chữ cái viết thường `e` hoặc chữ cái viết thường `c`, tiếp theo là chữ cái viết thường `a`, tiếp theo là chữ cái viết thường `r`.
<pre>"(T|t)he|car" => <a href="#learn-regex"><strong>The</strong></a> <a href="#learn-regex"><strong>car</strong></a> is parked in <a href="#learn-regex"><strong>the</strong></a> garage.</pre>

## 2.7 Thoát ký tự đặc biệt

Biểu thức chính quy sử dụng dấu gạch chéo ngược `\` để thoát ký tự tiếp theo. Điều này sẽ cho phép bạn sử dụng các ký tự dành riêng làm ký tự khớp `{ } [ ] / \ + * . $ ^ | ?`. Bằng cách thêm `\` vào trước ký tự đặc biệt, bạn có thể sử dụng nó để khớp ký tự.
Ví dụ: biểu thức chính quy `.` được sử dụng để khớp với bất kỳ ký tự nào ngoại trừ ký tự xuống dòng. Bây giờ, để khớp với ký tự `.` trong chuỗi đầu vào, biểu thức chính quy `(f|c|m)at\.?` có nghĩa là: chữ cái viết thường `f`, `c` hoặc `m` theo sau bởi chữ cái viết thường `a`, tiếp theo là chữ cái viết thường `t`, tiếp theo là một ký tự `.` tùy chọn.
<pre>"(f|c|m)at\.?" => The <a href="#learn-regex"><strong>fat</strong></a> <a href="#learn-regex"><strong>cat</strong></a> sat on the <a href="#learn-regex"><strong>mat.</strong></a></pre>

## 2.8 Trình định vị

Trong biểu thức chính quy, để kiểm tra xem ký tự khớp có phải là ký tự bắt đầu hay kết thúc hay không, chúng ta sử dụng trình định vị.
Có hai loại trình định vị: loại thứ nhất là `^` để kiểm tra xem ký tự khớp có phải là ký tự bắt đầu hay không, loại thứ hai là `$` để kiểm tra xem ký tự khớp có phải là ký tự cuối cùng của chuỗi đầu vào hay không.

### 2.8.1 Ký tự mũ (Caret)

Ký hiệu mũ `^` được sử dụng để kiểm tra xem ký tự khớp có phải là ký tự đầu tiên của chuỗi đầu vào hay không. Nếu chúng ta sử dụng biểu thức chính quy `^a` (nếu a là ký tự bắt đầu) khớp với chuỗi `abc`, nó sẽ khớp với `a`.
Nhưng nếu chúng ta sử dụng biểu thức chính quy `^b`, nó sẽ không khớp với bất kỳ thứ gì vì "b" không phải là ký tự bắt đầu trong chuỗi `abc`.
Hãy xem xét một biểu thức chính quy khác `^(T|t)he`, có nghĩa là: chữ `T` viết hoa hoặc chữ `t` viết thường là ký tự bắt đầu của chuỗi đầu vào, tiếp theo là chữ cái viết thường `h`, tiếp theo là chữ cái viết thường `e`.
<pre>"(T|t)he" => <a href="#learn-regex"><strong>The</strong></a> car is parked in <a href="#learn-regex"><strong>the</strong></a> garage.</pre><pre>"^(T|t)he" => <a href="#learn-regex"><strong>The</strong></a> car is parked in the garage.</pre>

### 2.8.2 Ký tự đô la (Dollar)

Ký hiệu đô la `$` được sử dụng để kiểm tra xem ký tự khớp có phải là ký tự cuối cùng của chuỗi đầu vào hay không. Ví dụ: biểu thức chính quy `(at\.)$` có nghĩa là: chữ cái viết thường `a`, tiếp theo là chữ cái viết thường `t`, tiếp theo là một ký tự `.`, và bộ khớp này phải ở cuối chuỗi.
<pre>"(at\.)" => The fat c<a href="#learn-regex"><strong>at.</strong></a> s<a href="#learn-regex"><strong>at.</strong></a> on the m<a href="#learn-regex"><strong>at.</strong></a></pre><pre>"(at\.)$" => The fat cat sat on the m<a href="#learn-regex"><strong>at.</strong></a></pre>

## 3. Tập hợp ký tự viết tắt

Biểu thức chính quy cung cấp viết tắt cho các tập hợp ký tự và biểu thức chính quy thường dùng. Các ký tự viết tắt như sau:

|Viết tắt|Mô tả|
|:----:|----|
|.|Khớp với bất kỳ ký tự nào ngoại trừ ký tự xuống dòng|
|\w|Khớp với tất cả các ký tự chữ cái và chữ số: `[a-zA-Z0-9_]`|
|\W|Khớp với các ký tự không phải chữ cái và chữ số: `[^\w]`|
|\d|Khớp với chữ số: `[0-9]`|
|\D|Khớp với ký tự không phải chữ số: `[^\d]`|
|\s|Khớp với ký tự khoảng trắng: `[\t\n\f\r\p{Z}]`|
|\S|Khớp với ký tự không phải khoảng trắng: `[^\s]`|

## 4. Khẳng định (Assertion / Lookaround)

Khẳng định nhìn trước (lookahead) và nhìn sau (lookbehind) đôi khi được gọi là khẳng định (lookaround), chúng là các loại đặc biệt của ***nhóm không chụp (non-capturing group)*** (được sử dụng để khớp mẫu nhưng không bao gồm trong danh sách khớp). Khi chúng ta có một mẫu cụ thể xuất hiện trước hoặc sau một mẫu khác, khẳng định sẽ được ưu tiên sử dụng.
Ví dụ: chúng ta muốn lấy tất cả các chữ số có tiền tố `$` trong chuỗi đầu vào `$4.44 and $10.88`. Chúng ta có thể sử dụng biểu thức chính quy này `(?<=\$)[0-9\.]*`, có nghĩa là: lấy tất cả các chữ số chứa ký tự `.` và có tiền tố là `$`.
Dưới đây là các khẳng định được sử dụng trong biểu thức chính quy:

|Ký hiệu|Mô tả|
|:----:|----|
|?=|Khẳng định nhìn trước tích cực (Positive Lookahead)|
|?!|Khẳng định nhìn trước tiêu cực (Negative Lookahead)|
|?<=|Khẳng định nhìn sau tích cực (Positive Lookbehind)|
|?<!|Khẳng định nhìn sau tiêu cực (Negative Lookbehind)|

### 4.1 Khẳng định nhìn trước tích cực (Positive Lookahead)

Khẳng định nhìn trước tích cực xác định rằng phần biểu thức thứ nhất phải có biểu thức khẳng định nhìn trước đi kèm. Kết quả khớp trả về chỉ chứa văn bản khớp với phần biểu thức thứ nhất.
Để định nghĩa một khẳng định nhìn trước tích cực bên trong dấu ngoặc đơn, dấu hỏi và dấu bằng được sử dụng như thế này `(?=...)`. Biểu thức khẳng định nhìn trước được viết sau dấu bằng trong dấu ngoặc đơn.
Ví dụ: biểu thức chính quy `(T|t)he(?=\sfat)` có nghĩa là: khớp với chữ `T` viết hoa hoặc chữ `t` viết thường, theo sau bởi chữ `h`, tiếp theo là chữ `e`.
Trong dấu ngoặc đơn, chúng ta định nghĩa khẳng định nhìn trước tích cực, hướng dẫn công cụ biểu thức chính quy chỉ khớp với `The` hoặc `the` nếu theo sau bởi `fat`.
<pre>"(T|t)he(?=\sfat)" => <a href="#learn-regex"><strong>The</strong></a> fat cat sat on the mat.</pre>

### 4.2 Khẳng định nhìn trước tiêu cực (Negative Lookahead)

Khi chúng ta cần lấy nội dung không khớp với biểu thức từ chuỗi đầu vào, chúng ta sử dụng khẳng định nhìn trước tiêu cực. Định nghĩa của khẳng định nhìn trước tiêu cực giống như cách định nghĩa khẳng định nhìn trước tích cực, điểm khác biệt duy nhất là sử dụng dấu chấm than `!` thay vì dấu bằng `=`, ví dụ: `(?!...)`.
Hãy xem biểu thức chính quy dưới đây `(T|t)he(?!\sfat)`, có nghĩa là: lấy tất cả các từ `The` hoặc `the` từ chuỗi đầu vào mà không theo sau bởi `fat` có dấu khoảng trắng phía trước.
<pre>"(T|t)he(?!\sfat)" => The fat cat sat on <a href="#learn-regex"><strong>the</strong></a> mat.</pre>

### 4.3 Khẳng định nhìn sau tích cực (Positive Lookbehind)

Khẳng định nhìn sau tích cực được sử dụng để lấy tất cả các nội dung khớp xuất hiện sau một mẫu cụ thể. Khẳng định nhìn sau tích cực được biểu diễn dưới dạng `(?<=...)`. Ví dụ: biểu thức chính quy `(?<=(T|t)he\s)(fat|mat)` có nghĩa là: lấy tất cả các từ `fat` và `mat` xuất hiện sau từ `The` hoặc `the` và một ký tự khoảng trắng trong chuỗi đầu vào.
<pre>"(?<=(T|t)he\s)(fat|mat)" => The <a href="#learn-regex"><strong>fat</strong></a> cat sat on the <a href="#learn-regex"><strong>mat</strong></a>.</pre>

### 4.4 Khẳng định nhìn sau tiêu cực (Negative Lookbehind)

Khẳng định nhìn sau tiêu cực được sử dụng để lấy tất cả các nội dung khớp không xuất hiện sau một mẫu cụ thể. Khẳng định nhìn sau tiêu cực được biểu diễn dưới dạng `(?<!...)`. Ví dụ: biểu thức chính quy `(?<!(T|t)he\s)(cat)` có nghĩa là: lấy tất cả các từ `cat` trong chuỗi đầu vào không xuất hiện sau `The` hoặc `the` và một ký tự khoảng trắng.
<pre>"(?&lt;!(T|t)he\s)(cat)" => The cat sat on <a href="#learn-regex"><strong>cat</strong></a>.</pre>

## 5. Cờ (Flag)

Cờ còn được gọi là bổ trợ sửa đổi vì nó thay đổi đầu ra của biểu thức chính quy. Các cờ này có thể được sử dụng theo bất kỳ thứ tự hoặc sự kết hợp nào và là một phần của biểu thức chính quy.

|Cờ|Mô tả|
|:----:|----|
|i|Không phân biệt chữ hoa chữ thường: Thiết lập việc khớp không phân biệt chữ hoa hay chữ thường.|
|g|Tìm kiếm toàn cục: Tìm kiếm tất cả các kết quả khớp trong toàn bộ chuỗi đầu vào.|
|m|Khớp nhiều dòng: Sẽ khớp với từng dòng của chuỗi đầu vào.|

* **Chữ số**: `\d+$`
* **Tên người dùng**: `^[\w\d_.]{4,16}$`
* **Ký tự chữ và số**: `^[a-zA-Z0-9]*$`
* **Ký tự chữ và số có khoảng trắng**: `^[a-zA-Z0-9 ]*$`
* **Chữ thường**: `[a-z]+$`
* **Chữ hoa**: `[A-Z]+$`
* **Địa chỉ trang web (URL)**: `^(((http|https|ftp):\/\/)?([[a-zA-Z0-9]\-\.])+(\.)([[a-zA-Z0-9]]){2,4}([[a-zA-Z0-9]\/+=%&_\.~?\-]*))*$`
* **Ngày tháng (MM/DD/YYYY)**: `^(0?[1-9]|1[012])[- /.](0?[1-9]|[12][0-9]|3[01])[- /.](19|20)?[0-9]{2}$`
* **Ngày tháng (YYYY/MM/DD)**: `^(19|20)?[0-9]{2}[- /.](0?[1-9]|1[012])[- /.](0?[1-9]|[12][0-9]|3[01])$`
* **Lọc lời xin lỗi/cảm ơn/yêu cầu vote**: `[\(（【].*?[cầu|xin|cảm|ơn|chúc|ủng|hộ|tải|truyện].*?[】）\)]`
* **Tìm chương mới nhất**: `Bạn có thể.*?tìm chương mới nhất`
* **ps/PS**: `(?i)ps\b.*`
* **Thẻ HTML**: `<[^>]+?>`
