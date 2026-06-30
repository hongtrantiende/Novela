function execute(keyword, page) {
    var url;
    if (keyword && keyword.trim() !== "") {
        url = "https://sextop1.gd/wp-json/tiktok/v1/videos/grid?s=" + encodeURIComponent(keyword) + "&page=" + page;
    } else {
        url = "https://sextop1.gd/wp-json/tiktok/v1/videos/grid?page=" + page;
    }
    
    var response = fetch(url, {
        headers: {
            "User-Agent": "Mozilla/5.0"
        }
    });
    if (!response.ok) {
        return Response.error("Lỗi kết nối API");
    }
    
    var json = JSON.parse(response.text());
    var items = json.videos || json.data || [];
    var list = [];
    for (var i = 0; i < items.length; i++) {
        var item = items[i];
        list.push({
            name: item.title,
            url: "https://sextop1.gd/wp-json/tiktok/v1/videos/" + item.id,
            cover: item.thumbnail || "",
            description: "Likes: " + (item.like_count || 0),
            author: "Sextop1"
        });
    }
    return Response.success(list);
}
