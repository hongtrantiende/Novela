function execute() {
    var kinds = [
        {
            title: "Khám Phá",
            name: "explore",
            input: "https://sextop1.am/wp-json/tiktok/v1/videos/grid"
        },
        {
            title: "Xem Nhiều",
            name: "trending",
            input: "https://sextop1.am/wp-json/tiktok/v1/videos/trending"
        }
    ];
    return Response.success(kinds);
}
