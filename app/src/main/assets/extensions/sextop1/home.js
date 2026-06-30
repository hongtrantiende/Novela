function execute() {
    var kinds = [
        {
            title: "Khám Phá",
            name: "Khám Phá",
            input: "https://sextop1.gd/wp-json/tiktok/v1/videos/grid?page="
        },
        {
            title: "Phim Sex Việt",
            name: "Phim Sex Việt",
            input: "https://sextop1.gd/wp-json/tiktok/v1/videos/grid?page="
        },
        {
            title: "Đang Xem Nhiều",
            name: "Đang Xem Nhiều",
            input: "https://sextop1.gd/wp-json/tiktok/v1/videos/trending?page="
        }
    ];
    return Response.success(kinds);
}
