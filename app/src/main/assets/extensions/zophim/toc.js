function execute(bookUrl, page) {
    var response = fetch(bookUrl, {
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
                var tap = item.tap || (i + 1).toString();
                
                if (item.vs) {
                    list.push({
                        title: "Vietsub - Tập " + tap,
                        url: item.vs
                    });
                }
                if (item.tm) {
                    list.push({
                        title: "Thuyết Minh - Tập " + tap,
                        url: item.tm
                    });
                }
            } catch (e) {
                // ignore
            }
        }
    }
    return Response.success(list);
}
