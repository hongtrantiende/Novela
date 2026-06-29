# Hướng dẫn triển khai lên Cloudflare Pages 🌐

Trang web danh sách nguồn sách Novela đã được tạo hoàn chỉnh tại thư mục `viet-sources-web/` của bạn. Bạn có thể dễ dàng triển khai lên Cloudflare Pages miễn phí và nhanh chóng theo 2 cách dưới đây:

---

## Cách 1: Tải thư mục trực tiếp (Nhanh nhất - Không cần Git) 🚀

1. Truy cập trang quản trị [Cloudflare Dashboard](https://dash.cloudflare.com/) và đăng nhập.
2. Tại menu bên trái, nhấp chọn **Workers & Pages**.
3. Bấm nút **Create application** (Tạo ứng dụng), sau đó chọn tab **Pages**.
4. Chọn **Upload assets** (Tải lên tài nguyên).
5. Đặt tên dự án của bạn (ví dụ: `nguon-novela`).
6. Bấm **Create project** (Tạo dự án).
7. Kéo và thả toàn bộ các tệp tin trong thư mục `viet-sources-web/` (bao gồm: `index.html`, `styles.css`, `app.js`) vào vùng tải lên.
8. Bấm **Deploy site** (Triển khai trang web). 
9. Cloudflare sẽ cấp cho bạn một địa chỉ URL miễn phí dạng `https://<ten-du-an>.pages.dev` cực kỳ chuyên nghiệp và tải siêu tốc!

---

## Cách 2: Triển khai tự động thông qua GitHub (Tự động cập nhật khi đổi mã nguồn) ⚙️

1. Đẩy thư mục `viet-sources-web` lên một repository mới trên tài khoản GitHub của bạn.
2. Truy cập [Cloudflare Dashboard](https://dash.cloudflare.com/) > **Workers & Pages** > **Create application** > chọn **Pages**.
3. Chọn **Connect to Git** (Kết nối với Git) và chọn tài khoản GitHub chứa repository của bạn.
4. Chọn repository bạn vừa tải lên.
5. Cấu hình cài đặt bản dựng (Build Settings):
   * **Framework preset**: Chọn `None` (hoặc để trống).
   * **Build command** (Lệnh dựng): Để trống.
   * **Build output directory** (Thư mục đầu ra): Nhập `viet-sources-web` (nếu folder nằm ở thư mục con của repo) hoặc để `/` (nếu các tệp tin nằm ngay thư mục gốc của repo).
6. Bấm **Save and Deploy** (Lưu và Triển khai).
7. Mỗi khi bạn đẩy code mới lên GitHub, Cloudflare Pages sẽ tự động biên dịch lại và cập nhật trang web trong vòng vài giây!
