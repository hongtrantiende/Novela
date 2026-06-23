const fs = require('fs');
const file = "c:\\Users\\ACER\\Desktop\\Nam\\apk legado\\apk-thienthucac\\app\\src\\main\\assets\\web\\vue\\assets\\BookChapter-BKeJHrON.js";
let content = fs.readFileSync(file, 'utf8');

const replacements = [
    { from: '"提示"', to: '"Thông báo"' },
    { from: '"确定"', to: '"Xác nhận"' },
    { from: '"取消"', to: '"Hủy"' },
    { from: '"url 形式不正确"', to: '"Định dạng URL không đúng"' },
    { from: '"下载中……"', to: '"Đang tải xuống..."' },
    { from: '"浏览器不支持FontFace"', to: '"Trình duyệt không hỗ trợ FontFace"' },
    { from: '"字体加载成功！"', to: '"Tải phông chữ thành công!"' },
    { from: '"下载失败，请检查您输入的 url"', to: '"Tải xuống thất bại, vui lòng kiểm tra URL của bạn"' },
    { from: '"设置"', to: '"Cài đặt"' },
    { from: '"阅读主题"', to: '"Giao diện đọc"' },
    { from: '"正文字体"', to: '"Phông chữ"' },
    { from: '"自定字体"', to: '"Phông tùy chỉnh"' },
    { from: '"自定义的字体名称"', to: '"Tên phông chữ tùy chỉnh"' },
    { from: '"请输入自定义的字体名称"', to: '"Nhập tên phông chữ tùy chỉnh"' },
    { from: '"保存"', to: '"Lưu"' },
    { from: '" 已经安装在您的设备上的字体请确认输入的字体名称完整无误，或者从网络下载字体。 "', to: '" Nếu phông chữ đã cài đặt trên thiết bị, hãy đảm bảo nhập đúng tên phông chữ, hoặc tải phông chữ từ Internet. "' },
    { from: '"网络下载"', to: '"Tải từ mạng"' },
    { from: '"字体大小"', to: '"Cỡ chữ"' },
    { from: '"字距"', to: '"Khoảng cách chữ"' },
    { from: '"行距"', to: '"Khoảng cách dòng"' },
    { from: '"段距"', to: '"Khoảng cách đoạn"' },
    { from: '"页面宽度"', to: '"Chiều rộng trang"' },
    { from: '"翻页速度"', to: '"Tốc độ cuộn"' },
    { from: '"无限加载"', to: '"Tải vô hạn"' },
    { from: '"关闭"', to: '"Tắt"' },
    { from: '"开启"', to: '"Bật"' },
    { from: '"目录"', to: '"Mục lục"' },
    { from: '"🎮 手柄已连接："', to: '"🎮 Tay cầm đã kết nối: "' },
    { from: '"🎮 手柄已断开："', to: '"🎮 Tay cầm đã ngắt kết nối: "' },
    { from: '"正在获取信息"', to: '"Đang tải thông tin..."' },
    { from: '"获取章节内容失败！"', to: '"Tải nội dung chương thất bại!"' },
    { from: '"下一章"', to: '"Chương sau"' },
    { from: '"本章是最后一章"', to: '"Đây là chương cuối cùng"' },
    { from: '"上一章"', to: '"Chương trước"' },
    { from: '"本章是第一章"', to: '"Đây là chương đầu tiên"' },
    { from: '"已到达页面顶部"', to: '"Đã đến đầu trang"' },
    { from: '"已到达页面底部"', to: '"Đã đến cuối trang"' },
    { from: '"书籍信息为空，即将自动返回书架页面..."', to: '"Thông tin sách trống, đang tự động quay lại tủ sách..."' },
    { from: '`是否将《${o.name}》放入书架？`', to: '`Thêm cuốn 《${o.name}》 vào tủ sách?`' },
    { from: '"放入书架"', to: '"Thêm vào tủ sách"' },
    { from: '"确认"', to: '"Xác nhận"' },
    { from: '"否"', to: '"Không"' },
    { from: '"书架"', to: '"Tủ sách"' },
    { from: '"顶部"', to: '"Đầu trang"' },
    { from: '"底部"', to: '"Cuối trang"' }
];

replacements.forEach(r => {
    if (content.includes(r.from)) {
        content = content.split(r.from).join(r.to);
        console.log(`Replaced: ${r.from} -> ${r.to}`);
    } else {
        console.log(`NOT found: ${r.from}`);
    }
});

fs.writeFileSync(file, content, 'utf8');
console.log("Successfully wrote BookChapter-BKeJHrON.js!");
