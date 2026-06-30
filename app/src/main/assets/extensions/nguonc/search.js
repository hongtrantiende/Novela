function execute(keyword, page) {
    var url;
    if (keyword && keyword.trim() !== "") {
        url = "https://phim.nguonc.com/api/films/search?keyword=" + encodeURIComponent(keyword) + "&page=" + page;
    } else {
        url = "https://phim.nguonc.com/api/films/phim-moi-cap-nhat?page=" + page;
    }
    
    var response = fetch(url);
    if (!response.ok) {
        return Response.error("Lỗi kết nối API");
    }
    
    var json = response.json();
    var list = [];
    if (json && json.items) {
        for (var i = 0; i < json.items.length; i++) {
            var item = json.items[i];
            list.push({
                name: item.name,
                url: "https://phim.nguonc.com/api/film/" + item.slug,
                cover: item.thumb_url,
                description: item.description,
                author: "NguonC"
            });
        }
    }
    return Response.success(list);
}
