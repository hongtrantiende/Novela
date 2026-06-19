# Hướng dẫn nhanh sử dụng Sách WebDav

> Trang hướng dẫn này tự động hiển thị khi bạn truy cập lần đầu và sẽ không xuất hiện lại nữa. Nếu muốn xem lại, vui lòng nhấn nút ba chấm dọc “**⁝**” ở góc trên bên phải > chọn Trợ giúp để xem trang này.

Mặc dù "Đọc sách" (Legado) chủ yếu được thiết kế để đọc tiểu thuyết trực tuyến, nhưng để thuận tiện cho bạn đọc, ứng dụng cũng hỗ trợ đơn giản việc đọc sách tải lên từ thiết bị cục bộ (định dạng epub, txt).

Tuy nhiên, một vấn đề lớn khi đọc sách cục bộ là làm thế nào để đồng bộ hóa tiến trình đọc và kho sách trên nhiều thiết bị. Nếu bạn đổi thiết bị, việc nhập thủ công lại sách cục bộ từ đầu rất bất tiện.

"Đọc sách" không có máy chủ riêng nên không lưu trữ sách như các ứng dụng như WeChat Reading. Tuy nhiên, ứng dụng hỗ trợ sao lưu WebDav, cho phép bạn sử dụng dịch vụ WebDav cá nhân để đồng bộ hóa sách.

### Điều kiện tiên quyết
1. **Thiết lập Vị trí lưu trữ sách** (nơi lưu sách tải xuống từ WebDav): Vào Của tôi / Cài đặt khác / Vị trí lưu trữ sách, và chọn thư mục lưu sách mong muốn.

2. **Thiết lập Sao lưu WebDav** (nơi lưu trữ sách trên dịch vụ WebDav): Vào Của tôi / Sao lưu & Phục hồi / Cài đặt WebDav. Tại đây bạn cần điền địa chỉ máy chủ WebDav, tài khoản và mật khẩu.

### Tải sách lên WebDav

Sau khi định cấu hình WebDav, việc truy cập trang Sách WebDav từ màn hình chính và không thấy cuốn sách nào là hoàn toàn bình thường, vì chúng ta chưa tải bất kỳ cuốn sách nào lên máy chủ WebDav.

Hiện tại có ba cách để tải sách lên WebDav:

1. **Ứng dụng tải lên sách cục bộ đã nhập**:
   Nhấn giữ sách cục bộ đã nhập trên tủ sách để vào Chi tiết sách > Nhấn nút ba chấm “**⁝**” ở góc trên bên phải > Chọn **Tải lên WebDav**, đợi vài giây để hoàn tất tải lên.

2. **Ứng dụng tải lên sách mạng đã lưu vào bộ nhớ đệm (cache)**:
   Tại giao diện chính, nhấn vào Thêm cài đặt ở góc trên bên phải > Chọn Bộ nhớ đệm/Xuất > Nhấn nút ba chấm “**⁝**” ở góc trên bên phải của trang này và tích chọn **Xuất sang WebDav**. Từ đó, mỗi khi xuất sách, ứng dụng sẽ tự động tải một bản sao lên máy chủ WebDav.

3. **Sử dụng ứng dụng WebDav (như Jianguoyun) hoặc máy chủ WebDav tự dựng để tải lên**:
   Đối với hầu hết người dùng, việc tải lên trực tiếp từ ứng dụng là đủ. Nhưng nếu bạn có số lượng sách lớn, chúng tôi khuyên bạn nên tải lên hàng loạt bằng ứng dụng khách WebDav trên máy tính hoặc điện thoại thay vì tải lên từng cuốn một qua ứng dụng.
   Ví dụ, nếu sử dụng dịch vụ WebDav của Jianguoyun, hãy truy cập thư mục `legado/books` trên máy chủ WebDav của bạn (đây là thư mục mặc định lưu trữ sách) và tải hàng loạt sách của bạn vào thư mục đó.

**Dù sử dụng bất kỳ phương pháp nào ở trên, để đảm bảo tải lên thành công, tốt nhất bạn nên vào trang Sách WebDav kiểm tra xem đã thấy các sách đã tải lên xuất hiện hay chưa.**

### Tải sách từ WebDav về máy

Trái ngược với việc tải lên có nhiều cách khác nhau, việc tải sách về máy khá đơn giản:
Duyệt qua danh sách sách đã tải lên trên **Trang sách WebDav**, tìm cuốn sách bạn muốn tải xuống, nhấn vào nút **Thêm vào kệ sách**, ứng dụng sẽ tự động tải sách về thiết bị cục bộ và thêm vào tủ sách của bạn.

### Lưu ý
- Nếu bạn sử dụng dịch vụ WebDav miễn phí của Jianguoyun, giới hạn băng thông miễn phí hàng tháng là đủ để đồng bộ hóa cài đặt ứng dụng và **một lượng nhỏ sách**. Tuy nhiên, nếu bạn thường xuyên tải lên/tải xuống sách lớn, lưu lượng có thể không đủ. Vui lòng chú ý mức sử dụng để tránh ảnh hưởng đến việc đồng bộ hóa cấu hình của ứng dụng.

### Câu hỏi thường gặp
- Vào **Trang sách WebDav** báo lỗi "Lỗi lấy sách WebDav, WebDav chưa được cấu hình".
  > Nguyên nhân là do bạn chưa thiết lập dịch vụ đồng bộ WebDav. Vui lòng làm theo hướng dẫn trong phần Điều kiện tiên quyết để cấu hình.

- Sách cục bộ do thiết bị A tải lên có hiển thị trên thiết bị B không, và có tự động thêm vào tủ sách không?
  > Nếu thiết bị A và B sử dụng chung một tài khoản WebDav, thiết bị B sẽ thấy sách do thiết bị A tải lên tại **Trang sách WebDav**. Tuy nhiên, sách sẽ không tự động thêm vào tủ sách trên thiết bị B; bạn phải vào **Trang sách WebDav** của thiết bị B, tìm sách đó và nhấn **Thêm vào kệ sách** thủ công.

- Tiến trình đọc/đánh dấu sách của sách cục bộ có được đồng bộ không?
  > Có, chúng được đồng bộ hóa.