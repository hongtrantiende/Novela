# Hướng dẫn sao lưu WebDAV

### Ứng dụng hỗ trợ sao lưu đám mây qua giao thức WebDAV. Bất kỳ dịch vụ lưu trữ đám mây nào hỗ trợ WebDAV đều dùng được. Chúng tôi khuyến nghị sử dụng Jianguoyun (hoặc các dịch vụ như Nextcloud, Yandex Disk...) để sao lưu dữ liệu. Dưới đây là các bước cấu hình ví dụ.

1. Truy cập trang web Jianguoyun https://www.jianguoyun.com/d/home#/ (hoặc nhà cung cấp WebDAV của bạn)
2. Đăng ký tài khoản nếu chưa có
3. Đăng nhập vào tài khoản
4. Vào thông tin tài khoản (thường ở góc trên bên phải)
5. Nhấp vào tùy chọn bảo mật (Security settings)
6. Thêm ứng dụng của bên thứ ba trong phần quản lý ứng dụng để tạo mật khẩu ứng dụng riêng (App Password)
7. Điền địa chỉ máy chủ (Server Address), tên đăng nhập (Username/Email) và mật khẩu ứng dụng vừa tạo vào phần Cài đặt WebDAV của ứng dụng Legado.
8. Cài đặt WebDAV của ứng dụng nằm ở mục: Tôi -> Sao lưu và khôi phục. Tùy chọn tạo thư mục con nên để mặc định.
9. Sau khi cài đặt xong, hãy nhấn Sao lưu thủ công để kiểm tra xem có thành công hay không.
10. Khi muốn khôi phục, chỉ cần chọn tệp sao lưu mong muốn trong danh sách.

### Hướng dẫn tự động sao lưu:

* Sau khi thiết lập thành công, ứng dụng sẽ tự động sao lưu mỗi khi bạn thoát.
* Trên WebDAV, các bản sao lưu trong cùng một ngày sẽ tự động ghi đè lên nhau, còn các bản sao lưu của các ngày khác nhau sẽ được giữ riêng biệt.
