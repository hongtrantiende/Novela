function execute(url) {
    var idMatch = url.match(/\/video\/(\d+)/);
    if (!idMatch) {
        return Response.error("Không tìm thấy ID video");
    }
    var id = idMatch[1];
    var apiUrl = "https://sextop1.am/wp-json/tiktok/v1/videos/" + id;
    
    var response = fetch(apiUrl, {
        headers: {
            "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36"
        }
    });
    
    if (!response.ok) {
        return Response.error("Lỗi kết nối");
    }
    
    var json = JSON.parse(response.text());
    var video = json.video;
    if (!video) {
        return Response.error("Không tìm thấy dữ liệu video");
    }
    
    return Response.success({
        name: video.title.trim(),
        cover: video.thumbnail,
        description: "Lượt thích: " + (video.like_count || 0),
        author: "Sextop1"
    });
}
