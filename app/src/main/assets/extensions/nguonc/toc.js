function execute(bookUrl, page) {
    var response = fetch(bookUrl);
    if (!response.ok) {
        return Response.error("Lỗi kết nối API");
    }
    
    var json = response.json();
    var list = [];
    if (json && json.episodes) {
        for (var s = 0; s < json.episodes.length; s++) {
            var server = json.episodes[s];
            var serverName = server.server_name;
            if (server.items) {
                for (var e = 0; e < server.items.length; e++) {
                    var ep = server.items[e];
                    list.push({
                        title: serverName + " - Tập " + ep.name,
                        url: ep.embed
                    });
                }
            }
        }
    }
    return Response.success(list);
}
