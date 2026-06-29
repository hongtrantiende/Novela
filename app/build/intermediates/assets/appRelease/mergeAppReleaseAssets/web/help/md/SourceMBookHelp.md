# Trợ giúp Giao diện Quản lý Nguồn Sách

* Ký hiệu ở góc trên bên phải nguồn sách:
  * Chấm màu xanh lá: nguồn sách có tính năng "Khám phá" và đang được bật.
  * Chấm màu đỏ: nguồn sách có tính năng "Khám phá" nhưng chưa được bật.
  * Không có ký hiệu: nguồn sách này không hỗ trợ tính năng "Khám phá".
* Có menu nhóm ở góc trên bên phải để lọc nguồn sách theo nhóm.
* Menu tùy chọn khác ở góc trên bên phải bao gồm:
  * Tạo mới nguồn sách
  * Nhập từ máy (Cục bộ)
  * Nhập trực tuyến (Mạng)
  * Nhập từ mã QR
  * Chia sẻ nguồn đã chọn
* Các thao tác khác cho nguồn sách nằm trong menu ở góc dưới bên phải (chỉ áp dụng cho các nguồn sách đã chọn):
  * Bật mục đã chọn
  * Tắt mục đã chọn
  * Thêm nhóm
  * Xóa nhóm
  * Bật Khám phá
  * Tắt Khám phá
  * Ghim lên đầu
  * Chuyển xuống cuối
  * Xuất nguồn đã chọn
  * Kiểm tra nguồn đã chọn (Xác minh)
* Tính năng kiểm tra nguồn sách cho phép kiểm tra hàng loạt (kết quả chỉ mang tính tham khảo do yếu tố mạng):
  * "Kiểm tra thành công" nghĩa là tất cả các mục kiểm tra đã chọn đều vượt qua.
  * Nhận diện các lỗi: tìm kiếm trống, khám phá trống, thư mục tìm kiếm/khám phá trống, nội dung tìm kiếm/khám phá trống, hết thời gian kiểm tra, lỗi thực thi JS; các nguyên nhân khác được xem là trang web bị lỗi.
  * Việc kiểm tra tìm kiếm ưu tiên sử dụng từ khóa kiểm tra do nguồn sách thiết lập, nếu không có sẽ dùng từ khóa do người dùng nhập.
  * Sau khi hoàn tất kiểm tra, hệ thống sẽ tự động lọc ra các nguồn sách "bị lỗi".