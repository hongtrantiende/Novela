function execute(bookUrl) {
    var response = fetch(bookUrl);
    if (!response.ok) {
        return Response.error("Lỗi kết nối API");
    }
    
    var json = response.json();
    if (json && json.movie) {
        var movie = json.movie;
        var info = {
            name: movie.name,
            url: bookUrl,
            cover: movie.thumb_url,
            description: movie.description,
            author: "NguonC"
        };
        return Response.success(info);
    }
    return Response.error("Không tìm thấy thông tin phim");
}
