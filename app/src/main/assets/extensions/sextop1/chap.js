function execute(url) {
    // 1. Fetch the movie page
    var response = fetch(url, {
        headers: {
            "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36"
        }
    });
    
    if (!response.ok) {
        return Response.error("Lỗi kết nối");
    }
    
    var html = response.text();
    
    // 2. Extract data-id and data-server
    var idMatch = html.match(/data-id="(\d+)"/);
    if (!idMatch) {
        idMatch = html.match(/postid-(\d+)/);
    }
    
    if (!idMatch) {
        return Response.error("Không tìm thấy ID video");
    }
    
    var id = idMatch[1];
    var serverMatch = html.match(/data-server="(\d+)"/);
    var server = serverMatch ? serverMatch[1] : "1";
    
    // 3. Fetch player data
    var playerUrl = "https://sextop1.gd/wp-json/sextop1/player/?id=" + id + "&server=" + server;
    var playerRes = fetch(playerUrl, {
        headers: {
            "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36",
            "Referer": url
        }
    });
    
    if (!playerRes.ok) {
        // Try fallback to server 2
        playerUrl = "https://sextop1.gd/wp-json/sextop1/player/?id=" + id + "&server=2";
        playerRes = fetch(playerUrl, {
            headers: {
                "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36",
                "Referer": url
            }
        });
    }
    
    if (!playerRes.ok) {
        return Response.error("Lỗi kết nối máy chủ phát");
    }
    
    var playerJson = JSON.parse(playerRes.text());
    if (!playerJson.success || !playerJson.data) {
        return Response.error("Máy chủ báo lỗi");
    }
    
    var playerData = playerJson.data;
    
    // 4. Extract video stream URL
    var videoUrlMatch = playerData.match(/file:\s*'([^']+)'/) || playerData.match(/file:\s*"([^"]+)"/);
    if (!videoUrlMatch) {
        videoUrlMatch = playerData.match(/(https?:\/\/[^\s'"]+\.(?:m3u8|mp4))/);
    }
    
    if (!videoUrlMatch) {
        return Response.error("Không tìm thấy luồng phát video");
    }
    
    var videoUrl = videoUrlMatch[1];
    
    return Response.success(videoUrl);
}
