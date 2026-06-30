function execute(bookUrl) {
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
    return Response.success({
        name: item.title,
        url: bookUrl,
        cover: item.thumbnail || "",
        description: item.title || "",
        author: "Sextop1"
    });
}
