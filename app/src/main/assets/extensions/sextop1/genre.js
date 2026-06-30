function execute(input, page) {
    var url = getUrl(input, page);
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
    var elements = doc.select(".dp_box .dp-item");
    var list = [];
    
    for (var i = 0; i < elements.size(); i++) {
        var el = elements.get(i);
        var titleEl = el.select("a.dp-thumb");
        var title = titleEl.attr("title") || el.select(".entry-title a").text();
        var link = titleEl.attr("href");
        var cover = el.select("img").attr("src");
        var status = el.select(".status").text() || "Phim HD";
        
        if (title && link) {
            list.push({
                name: title.trim(),
                url: link,
                cover: cover,
                description: status,
                author: "Sextop1"
            });
        }
    }
    
    return Response.success(list);
}

function getUrl(input, page) {
    if (page == 1) {
        if (input.endsWith('/page/')) {
            return input.substring(0, input.length - 5);
        }
        return input;
    }
    return input + page + "/";
}
