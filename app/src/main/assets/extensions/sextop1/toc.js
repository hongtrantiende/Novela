function execute(bookUrl, page) {
    var response = fetch(bookUrl, {
        headers: {
            "User-Agent": "Mozilla/5.0"
        }
    });
    if (!response.ok) {
        return Response.error("Lỗi kết nối API");
    }
    
    var json = JSON.parse(response.text());
    var item = json.video || {};
    var list = [];
    if (item.video_url) {
        list.push({
            title: "Xem Video",
            url: item.video_url
        });
    }
    return Response.success(list);
}
