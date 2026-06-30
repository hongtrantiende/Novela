function execute(chapterUrl) {
    // Return the embed player URL directly, the hidden sniffing WebView inside Legado's VideoReaderScreen
    // will load and sniff the direct .m3u8 stream link automatically!
    return Response.success(chapterUrl);
}
