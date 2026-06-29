# Cấu hình Mô-đun Trang chủ (Homepage Modules)

Trường `homepageModules` của nguồn sách cho phép nhà phát triển khai báo các mô-đun nội dung hiển thị của nguồn sách này trên trang chủ. Các mô-đun này được định nghĩa thông qua một mảng JSON, hỗ trợ bố cục tùy biến cao và nguồn dữ liệu linh hoạt.

---

## 1. Cấu trúc Dữ liệu (Data Structure)

`homepageModules` là một mảng JSON chứa nhiều đối tượng định nghĩa mô-đun.

### Các trường chung của mô-đun

| Trường | Kiểu dữ liệu | Bắt buộc | Mô tả |
|:-----------------|:---------|:---|:------------------------------------------------------|
| **key**          | `String` | Có  | Mã định danh duy nhất của mô-đun. Khuyên dùng các ký tự `[a-z0-9_]`. Dùng để lưu cài đặt sắp xếp/hiển thị của người dùng. |
| **type**         | `Enum`   | Có  | Loại mô-đun. Xác định phương thức hiển thị và logic tương tác. Xem thêm [Loại mô-đun](#2-loai-mo-dun-module-types). |
| **title**        | `String` | Có  | Tiêu đề mặc định của mô-đun. Người dùng có thể tùy chỉnh đè lên ở cục bộ. |
| **kindTitle**    | `String` | Không | Dùng để khớp với tiêu đề phân loại trong quy tắc "Khám phá" của nguồn sách. Sau khi khớp thành công sẽ tự động kế thừa URL và quy tắc của phân loại đó. |
| **url**          | `String` | Không | Chỉ định rõ ràng URL giao diện dữ liệu. Có độ ưu tiên cao hơn `kindTitle`. Hỗ trợ thay thế biến. |
| **args**         | `String` | Không | Tham số bổ sung. Trong loại `buttonGroup`, đây là một chuỗi mảng JSON. |
| **layoutConfig** | `Object` | Không | Đối tượng cấu hình bố cục, dùng để điều chỉnh số cột, số hàng, biểu tượng, v.v. Xem thêm [Cấu hình bố cục](#3-cau-hinh-bo-cuc-layoutconfig). |

---

## 2. Loại mô-đun (Module Types)

### Nhóm Danh sách và Trình chiếu (Carousel)

| Loại (Type) | Mô tả | Đặc điểm |
|:----------|:------|:-----------------------|
| `banner`  | Trình chiếu trượt ngang | Thích hợp hiển thị các đề xuất chất lượng cao, sử dụng ảnh bìa lớn. |
| `ranking` | Danh sách bảng xếp hạng | Hiển thị danh sách dọc kèm theo số thứ tự xếp hạng. |
| `card`    | Thẻ đề xuất  | Dòng thẻ trượt ngang, hiển thị đồng thời ảnh bìa, tiêu đề và giới thiệu ngắn. |

### Nhóm Lưới (Grid)

| Loại (Type)      | Mô tả | Đặc điểm |
|:---------------|:------|:------------------|
| `grid`         | Lưới tiêu chuẩn | Định dạng hiển thị phổ biến nhất. Hỗ trợ tùy chỉnh số hàng/cột. |
| `gridRanking`  | Lưới bảng xếp hạng | Hiển thị bảng xếp hạng nhiều hàng nhiều cột. Lật trang theo chiều ngang. |
| `infiniteGrid` | Lưới vô hạn  | Dòng lưới cuộn dọc. Tải nội dung vô hạn. |
| `waterfall`    | Dòng thác nước | Dòng sách xếp so le cuộn dọc. Tải nội dung vô hạn. |

### Nhóm Chức năng

| Loại (Type)     | Mô tả | Đặc điểm |
|:--------------|:------|:--------------------------------------------|
| `buttonGroup` | Nhóm nút nhanh | Hiển thị dưới dạng một nhóm nút tròn/icon, hỗ trợ tự động căn độ rộng và chia cột. Thường dùng để đặt các lối vào phân loại hoặc chức năng phổ biến. |

---

## 3. Cấu hình bố cục (LayoutConfig)

Thông qua đối tượng `layoutConfig`, bạn có thể kiểm soát chi tiết cách hiển thị của mô-đun.

| Thuộc tính (Property) | Kiểu dữ liệu | Loại áp dụng | Giá trị mặc định | Mô tả |
|:--------------|:---------|:------------------------------------|:----|:-----------------------------------------|
| `columns`     | `Int`    | `grid`, `waterfall`, `infiniteGrid` | 3   | Số cột hiển thị trên mỗi hàng. |
| `icon`        | `String` | `buttonGroup`                       | -   | URL biểu tượng mặc định chung cho nhóm nút. |
| `icons`       | `Object` | `buttonGroup`                       | -   | Bảng ánh xạ biểu tượng. Ví dụ: `{"Xếp hạng": "http://path/to/icon"}`. |

---

## 4. Logic liên kết dữ liệu (Data Binding)

1. **Tự động khớp**: Nếu cung cấp `kindTitle`, hệ thống sẽ duyệt qua danh sách trả về từ `exploreKinds()` của nguồn sách. Nếu `title` của phân loại nào trùng khớp hoàn toàn, mô-đun đó sẽ tự động sử dụng `url` của phân loại đó.
2. **Chỉ định tĩnh**: Nếu cung cấp `url`, hệ thống sẽ trực tiếp gửi yêu cầu đến URL đó.
3. **Phương án dự phòng (fallback)**: Nếu không khớp được `kindTitle` và không có `url`, mô-đun sẽ chuyển sang sử dụng `exploreUrl` chính của nguồn sách.

---

## 5. Ví dụ JSON đầy đủ

```json
[
  {
    "key": "top_banner",
    "type": "banner",
    "title": "Đề xuất chọn lọc",
    "kindTitle": "Trang chủ đề xuất"
  },
  {
    "key": "quick_nav",
    "type": "buttonGroup",
    "title": "Điều hướng phân loại",
    "args": "[\"Võ hiệp\", \"Tiên hiệp\", \"Đô thị\", \"Lịch sử\"]",
    "layoutConfig": {
      "icon": "https://example.com/icons/default.png",
      "icons": {
        "Võ hiệp": "https://example.com/icons/wuxia.png"
      }
    }
  },
  {
    "key": "hot_rank",
    "type": "ranking",
    "title": "Bảng xếp hạng hot",
    "kindTitle": "Bảng xếp hạng",
    "layoutConfig": {
      "rows": 5
    }
  },
  {
    "key": "explore_waterfall",
    "type": "waterfall",
    "title": "Khám phá thêm",
    "kindTitle": "Tất cả",
    "layoutConfig": {
      "columns": 2
    }
  }
]
```
