function execute(keyword, page) {
    var url = "https://sextop1.am/wp-json/tiktok/v1/videos/grid?search=" + encodeURIComponent(keyword) + "&page=" + page;
    var response = fetch(url, {
        headers: {
            "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36"
        }
    });
    
    if (!response.ok) {
        return Response.error("Lỗi kết nối");
    }
    
    var json = JSON.parse(response.text());
    var videos = json.videos || [];
    var list = [];
    
    for (var i = 0; i < videos.length; i++) {
        var video = videos[i];
        var id = video.id;
        var title = video.title;
        var cover = video.thumbnail;
        var likes = video.like_count || 0;
        
        if (id && title) {
            list.push({
                name: title.trim(),
                url: "https://sextop1.am/phim-sex-viet/video/" + id + "/",
                cover: cover,
                description: "Thích: " + likes,
                author: "Sextop1"
            });
        }
    }
    
    return Response.success(list);
}
