function execute(chapterUrl) {
    // Return the embed player URL (ssplay.net) directly, the hidden sniffing WebView inside Legado's VideoReaderScreen
    // will load and sniff the stream link automatically!
    return Response.success(chapterUrl);
}
