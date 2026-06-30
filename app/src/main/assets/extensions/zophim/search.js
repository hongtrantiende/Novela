function execute(keyword, page) {
    var url;
    if (keyword && keyword.trim() !== "") {
        url = "https://anisrc.top/api/v1/search/" + encodeURIComponent(keyword) + "/" + page;
    } else {
        url = "https://anisrc.top/api/v1/update/" + page;
    }
    
    var response = fetch(url, {
        headers: {
            "User-Agent": "Mozilla/5.0"
        }
    });
    if (!response.ok) {
        return Response.error("Lỗi kết nối API");
    }
    
    var text = response.text();
    var lines = text.split('\n');
    var list = [];
    for (var i = 0; i < lines.length; i++) {
        var line = lines[i].trim();
        if (line) {
            try {
                var item = JSON.parse(line);
                list.push({
                    name: item.ten_phim,
                    url: "https://anisrc.top/api/v1/list/" + item.slug,
                    cover: item.poster,
                    description: item.noi_dung || "",
                    author: "Zophim"
                });
            } catch (e) {
                // ignore
            }
        }
    }
    return Response.success(list);
}
