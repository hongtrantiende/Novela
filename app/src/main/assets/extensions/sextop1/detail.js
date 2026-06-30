function execute(url) {
    var response = fetch(url, {
        headers: {
            "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36"
        }
    });
    
    if (!response.ok) {
        return Response.error("Lỗi kết nối");
    }
    
    var html = response.text();
    var doc = Html.parse(html);
    
    var name = doc.select("h1.page-title").text() || doc.select(".entry-title").first().text();
    var cover = doc.select(".dp-thumb img").first().attr("src") || doc.select("meta[property='og:image']").attr("content");
    
    var descEl = doc.select(".entry-content");
    var desc = descEl.text() || doc.select(".video-description").text() || doc.select("p").first().text();
    
    return Response.success({
        name: name.trim(),
        cover: cover,
        description: desc.trim(),
        author: "Sextop1"
    });
}
