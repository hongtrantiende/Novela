# Quy chuẩn cấu hình Sách liên quan (Related Books)

Trường `ruleBookInfo.relatedBooks` của nguồn sách cho phép nhà phát triển khai báo một nhóm các mô-đun sách liên quan, dùng để hiển thị thanh trượt ngang "Sách liên quan" ở dưới cùng của trang chi tiết sách. Hỗ trợ cấu hình nhiều mô-đun, mỗi mô-đun có tiêu đề và nguồn dữ liệu độc lập, ví dụ như "Tác phẩm cùng tác giả", "Người đọc sách này cũng đọc", v.v.

---

## 1. Vị trí trường dữ liệu

Trong tab **Trang chi tiết** của trình chỉnh sửa nguồn sách, trường `relatedBooks` đã được thêm mới.

```
Trang chi tiết → relatedBooks
```

Đường dẫn JSON tương ứng: `ruleBookInfo.relatedBooks`

---

## 2. Cấu trúc dữ liệu

`relatedBooks` là một mảng JSON chứa nhiều đối tượng định nghĩa mô-đun.

### Các trường dữ liệu của mô-đun

| Trường | Kiểu dữ liệu | Bắt buộc | Mô tả |
|:--------|:---------|:---|:---------------------------------------|
| **key** | `String` | Không  | Mã định danh duy nhất của mô-đun. Khuyên dùng các ký tự `[a-z0-9_]`. Nếu không cung cấp sẽ sử dụng `title`. |
| **title** | `String` | Có  | Tiêu đề mô-đun, hiển thị phía trên thanh trượt. Ví dụ: "Tác phẩm cùng tác giả". |
| **url** | `String` | Có  | URL giao diện dữ liệu. Hỗ trợ thay thế biến mẫu. |

---

## 3. Nguyên lý hoạt động

1. Khi người dùng mở trang chi tiết của một cuốn sách bất kỳ, nếu nguồn sách đó cấu hình `relatedBooks`, hệ thống sẽ phân tích cú pháp mảng JSON.
2. Đối với mỗi mô-đun, hệ thống sẽ thay thế các biến mẫu trong URL bằng giá trị thực tế của cuốn sách hiện tại, sau đó gửi yêu cầu.
3. Dữ liệu trả về sẽ được phân tích bằng **Quy tắc khám phá** (`ruleExplore`) của nguồn sách để lấy danh sách sách.
4. Sách sau khi phân tích sẽ được hiển thị dưới dạng thanh trượt ngang giữa các nút chức năng và phần giới thiệu sách trên trang chi tiết.
5. Cuốn sách hiện đang xem sẽ tự động được lọc khỏi kết quả để tránh hiển thị trùng lặp.
6. Nếu một mô-đun bất kỳ yêu cầu thất bại hoặc trả về danh sách trống, mô-đun đó sẽ bị bỏ qua một cách lặng lẽ, không ảnh hưởng đến các mô-đun khác và các chức năng của trang chi tiết.

> **Lưu ý**: Việc phân tích sách liên quan tái sử dụng quy tắc "Khám phá" (`ruleExplore`), chứ không phải quy tắc "Trang chi tiết" (`ruleBookInfo`). Vui lòng đảm bảo quy tắc khám phá của nguồn sách đã được cấu hình chính xác.

---

## 4. Cú pháp URL

URL hỗ trợ cùng cú pháp JS như `exploreUrl`, bao gồm tiền tố `@js:`, thẻ `<js></js>` và biểu thức nhúng `{{...}}`.

### Các đối tượng khả dụng trong ngữ cảnh JS

| Đối tượng | Mô tả | Thuộc tính ví dụ |
|:---------|:---------------------|:--------------------------------------------------------------------|
| `book`   | Đối tượng sách hiện tại | `book.name`, `book.author`, `book.kind`, `book.bookUrl`, `book.tocUrl`, `book.origin` |
| `source` | Đối tượng nguồn sách hiện tại | `source.bookSourceUrl`, `source.getVariable()` v.v.                      |
| `cookie` | Lưu trữ Cookie | `cookie.getKey(domain, key)`                                        |
| `page`   | Số trang (cố định là 1) | `page`                                                              |
| `java`   | Công cụ mở rộng JS (`AnalyzeUrl`) | `java.ajax()`, `java.log()` v.v.                                       |

### Cú pháp mẫu đơn giản

Đối với URL đơn giản, bạn có thể sử dụng trực tiếp cú pháp `{{book.tên_thuộc_tính}}`, giá trị sẽ tự động được mã hóa URL:

```
https://example.com/search?keyword={{book.author}}&name={{book.name}}
```

### Biểu thức `@js:`

Đối với URL yêu cầu xử lý logic, hãy sử dụng tiền tố `@js:`:

```
@js:"https://example.com/api/related?author=" + java.net.URLEncoder.encode(book.author, "UTF-8")
```

---

## 5. Ví dụ JSON đầy đủ

```json
[
  {
    "key": "same_author",
    "title": "Tác phẩm cùng tác giả",
    "url": "https://example.com/search?keyword={{book.author}}&type=author&page=1"
  },
  {
    "key": "readers_also_read",
    "title": "Người đọc sách này cũng đọc",
    "url": "https://example.com/api/related?book={{book.bookUrl}}&limit=20"
  },
  {
    "key": "same_genre",
    "title": "Đề xuất cùng thể loại",
    "url": "https://example.com/category/{{book.kind}}?page=1"
  }
]
```

Cấu hình trên sẽ hiển thị ba hàng thanh trượt ở cuối trang chi tiết:

```
┌─────────────────────────────────────────────┐
│ [Khu vực nút chức năng]                     │
├─────────────────────────────────────────────┤
│ Tác phẩm cùng tác giả                       │
│ [Ảnh bìa 1] [Ảnh bìa 2] [Ảnh bìa 3] [Ảnh bìa 4] → │
│                                             │
│ Người đọc sách này cũng đọc                 │
│ [Ảnh bìa 1] [Ảnh bìa 2] [Ảnh bìa 3] [Ảnh bìa 4] → │
│                                             │
│ Đề xuất cùng thể loại                       │
│ [Ảnh bìa 1] [Ảnh bìa 2] [Ảnh bìa 3] [Ảnh bìa 4] → │
├─────────────────────────────────────────────┤
│ [Khu vực giới thiệu sách]                   │
└─────────────────────────────────────────────┘
```

---

## 6. Ví dụ đơn giản

Nếu chỉ cần một hàng sách liên quan, mảng JSON chỉ cần chứa một phần tử:

```json
[
  {
    "title": "Tác phẩm cùng tác giả",
    "url": "https://example.com/search?keyword={{book.author}}"
  }
]
```

Trường `key` là tùy chọn, khi không được cung cấp sẽ tự động lấy `title` làm mã định danh.

---

## 7. Ví dụ URL

### Tìm sách liên quan theo tác giả

```
https://example.com/search?keyword={{book.author}}&type=author
```

### Tìm cùng hệ liệt/sê-ri theo tên sách

```
https://example.com/search?keyword={{book.name}}&type=related
```

### Tìm sách cùng loại theo phân loại

```
https://example.com/category/{{book.kind}}?page=1
```

### Sử dụng biểu thức JS

Giống như `exploreUrl`, URL hỗ trợ đầy đủ các biểu thức `@js:` và `<js>`. Trong ngữ cảnh JS, đối tượng `book` đại diện cho cuốn sách hiện tại, bạn có thể truy cập các thuộc tính như `book.name`, `book.author`, `book.kind`, `book.bookUrl`, `book.tocUrl`, v.v.

**Ghép chuỗi đơn giản:**

```
@js:"https://example.com/api/related?author=" + java.net.URLEncoder.encode(book.author, "UTF-8") + "&book_id=" + book.bookUrl.split("/").pop()
```

**Kèm logic điều kiện:**

```
@js:
var base = "https://example.com/api/related";
if (book.kind && book.kind.contains("Huyền Huyễn")) {
  base + "?genre=fantasy&author=" + java.net.URLEncoder.encode(book.author, "UTF-8")
} else {
  base + "?author=" + java.net.URLEncoder.encode(book.author, "UTF-8")
}
```

**Yêu cầu kèm Cookie/Xác thực:**

```
@js:
var ck = "sessionid=" + (String(cookie.getKey("example.com", "sessionid")) || "");
"https://example.com/api/related?book_id=" + book.bookUrl.split("/").pop() + "&cookie=" + java.net.URLEncoder.encode(ck, "UTF-8")
```

---

## 8. Logic hiển thị

| Điều kiện | Hành vi |
|:------------------------------------|:-------------------------|
| `relatedBooks` trống hoặc không được cấu hình | Không hiển thị mô-đun sách liên quan |
| Định dạng JSON bị lỗi | Bỏ qua lặng lẽ, không ảnh hưởng đến các nội dung khác của trang chi tiết |
| Yêu cầu URL của một mô-đun nào đó thất bại | Bỏ qua mô-đun đó, các mô-đun khác hiển thị bình thường |
| Một mô-đun nào đó trả về danh sách trống | Bỏ qua mô-đun đó, các mô-đun khác hiển thị bình thường |
| Tất cả các mô-đun đều không có kết quả | Không hiển thị khu vực sách liên quan |
| Kết quả chứa cuốn sách hiện tại | Tự động lọc bỏ cuốn sách hiện tại |
| Sách cục bộ (không có nguồn sách) | Không hiển thị mô-đun sách liên quan |
| Khi chuyển nguồn sách | Xóa sách liên quan cũ, tải lại dữ liệu của nguồn mới |

---

## 9. Cấu hình trình chỉnh sửa nguồn sách

Trong tab **Trang chi tiết** của trình chỉnh sửa nguồn sách:

| Trường | Giá trị |
|:--------------------|:------------------------------------------------------------------|
| relatedBooks | `[{"title":"Tác phẩm cùng tác giả","url":"https://example.com/search?keyword={{book.author}}"}]` |

---

## 10. Thực tiễn tốt nhất

1. **Thiết lập số lượng mô-đun hợp lý**: Khuyến nghị dùng 1-3 mô-đun, quá nhiều hàng thanh trượt sẽ ảnh hưởng đến trải nghiệm trang.
2. **Sử dụng tiêu đề có ý nghĩa**: Tiêu đề nên mô tả rõ ràng nguồn gốc đề xuất, ví dụ "Tác phẩm cùng tác giả" sẽ có tính định hướng tốt hơn là từ "Đề xuất" chung chung.
3. **Ưu tiên sử dụng tác giả hoặc phân loại**: Tìm kiếm theo tác giả là cách liên kết phổ biến nhất, giúp đề xuất hiệu quả các tác phẩm khác của cùng tác giả.
4. **Tránh truy vấn quá rộng**: Nếu kết quả trả về từ URL không có tính liên quan cao với cuốn sách hiện tại, trải nghiệm người dùng sẽ bị giảm sút.
5. **Đảm bảo tính tương thích của quy tắc khám phá**: Dữ liệu trả về từ URL phải được phân tích cú pháp chính xác bởi `ruleExplore`.
6. **Cảnh đơn giản dùng bản mẫu, cảnh phức tạp dùng JS**: Thay thế đơn giản như `{{book.author}}` thì dùng trực tiếp cú pháp mẫu; khi cần phán đoán điều kiện, ghép chuỗi, xử lý Cookie hoặc các logic phức tạp khác thì dùng biểu thức `@js:`.
7. **Kiểm tra các trường hợp biên**: Kiểm tra xem URL có hoạt động bình thường khi tên tác giả chứa các ký tự đặc biệt (như `&`, `#`, chữ tiếng Trung). Các biến mẫu sẽ tự động được mã hóa URL, nhưng trong biểu thức `@js:` bạn cần gọi thủ công `java.net.URLEncoder.encode()`.
8. **Kiểm soát số lượng trả về**: Khuyến nghị phía máy chủ giới hạn số lượng trả về (ví dụ 10-20 cuốn), nội dung thanh trượt quá nhiều sẽ ảnh hưởng đến trải nghiệm.
