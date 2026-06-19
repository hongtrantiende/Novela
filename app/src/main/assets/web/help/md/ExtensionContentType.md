```java
public enum MimeTypeEnum {

    AAC("acc", "Âm thanh AAC", "audio/aac"),

    ABW("abw", "Tài liệu AbiWord", "application/x-abiword"),

    ARC("arc", "Tệp lưu trữ", "application/x-freearc"),

    AVI("avi", "Định dạng xen kẽ âm thanh video", "video/x-msvideo"),

    AZW("azw", "Định dạng sách điện tử Amazon Kindle", "application/vnd.amazon.ebook"),

    BIN("bin", "Bất kỳ loại dữ liệu nhị phân nào", "application/octet-stream"),

    BMP("bmp", "Đồ họa bitmap Windows OS/2", "image/bmp"),

    BZ("bz", "Tệp lưu trữ BZip", "application/x-bzip"),

    BZ2("bz2", "Tệp lưu trữ BZip2", "application/x-bzip2"),

    CSH("csh", "Kịch bản C-Shell", "application/x-csh"),

    CSS("css", "Bảng kiểu xếp chồng (CSS)", "text/css"),

    CSV("csv", "Các giá trị phân tách bằng dấu phẩy (CSV)", "text/csv"),

    DOC("doc", "Tài liệu Microsoft Word", "application/msword"),

    DOCX("docx", "Microsoft Word (OpenXML)", "application/vnd.openxmlformats-officedocument.wordprocessingml.document"),

    EOT("eot", "Phông chữ MS Embedded OpenType", "application/vnd.ms-fontobject"),

    EPUB("epub", "Ấn phẩm điện tử (EPUB)", "application/epub+zip"),

    GZ("gz", "Tệp nén GZip", "application/gzip"),

    GIF("gif", "Định dạng trao đổi hình ảnh (GIF)", "image/gif"),

    HTM("htm", "Ngôn ngữ đánh dấu siêu văn bản (HTML)", "text/html"),

    HTML("html", "Ngôn ngữ đánh dấu siêu văn bản (HTML)", "text/html"),

    ICO("ico", "Định dạng biểu tượng", "image/vnd.microsoft.icon"),

    ICS("ics", "Định dạng iCalendar", "text/calendar"),

    JAR("jar", "Tệp lưu trữ Java", "application/java-archive"),

    JPEG("jpeg", "Hình ảnh JPEG", "image/jpeg"),

    JPG("jpg", "Hình ảnh JPEG", "image/jpeg"),

    JS("js", "JavaScript", "text/javascript"),

    JSON("json", "Định dạng JSON", "application/json"),

    JSONLD("jsonld", "Định dạng JSON-LD", "application/ld+json"),

    MID("mid", "Giao diện kỹ thuật số nhạc cụ (MIDI)", "audio/midi"),

    MIDI("midi", "Giao diện kỹ thuật số nhạc cụ (MIDI)", "audio/midi"),

    MJS("mjs", "Mô-đun JavaScript", "text/javascript"),

    MP3("mp3", "Âm thanh MP3", "audio/mpeg"),

    MPEG("mpeg", "Video MPEG", "video/mpeg"),

    MPKG("mpkg", "Gói cài đặt Apple", "application/vnd.apple.installer+xml"),

    ODP("odp", "Tài liệu trình bày OpenDocument", "application/vnd.oasis.opendocument.presentation"),

    ODS("ods", "Tài liệu bảng tính OpenDocument", "application/vnd.oasis.opendocument.spreadsheet"),

    ODT("odt", "Tài liệu văn bản OpenDocument", "application/vnd.oasis.opendocument.text"),

    OGA("oga", "Âm thanh OGG", "audio/ogg"),

    OGV("ogv", "Video OGG", "video/ogg"),

    OGX("ogx", "OGG", "application/ogg"),

    OPUS("opus", "Âm thanh OPUS", "audio/opus"),

    OTF("otf", "Phông chữ OTF", "font/otf"),

    PNG("png", "Đồ họa mạng di động", "image/png"),

    PDF("pdf", "Định dạng tài liệu di động Adobe (PDF)", "application/pdf"),

    PHP("php", "php", "application/x-httpd-php"),

    PPT("ppt", "Microsoft PowerPoint", "application/vnd.ms-powerpoint"),

    PPTX("pptx", "Microsoft PowerPoint (OpenXML)", "application/vnd.openxmlformats-officedocument.presentationml.presentation"),

    RAR("rar", "Tệp lưu trữ RAR", "application/vnd.rar"),

    RTF("rtf", "Định dạng văn bản dạng RTF", "application/rtf"),

    SH("sh", "Kịch bản Bourne Shell", "application/x-sh"),

    SVG("svg", "Đồ họa vectơ có thể thu phóng (SVG)", "image/svg+xml"),

    SWF("swf", "Định dạng Web nhỏ (SWF) hoặc tài liệu Adobe Flash", "application/x-shockwave-flash"),

    TAR("tar", "Tệp lưu trữ băng từ (TAR)", "application/x-tar"),

    TIF("tif", "Định dạng tệp hình ảnh được gắn thẻ (TIFF)", "image/tiff"),

    TIFF("tiff", "Định dạng tệp hình ảnh được gắn thẻ (TIFF)", "image/tiff"),

    TS("ts", "MPEG truyền tải dòng", "video/mp2t"),

    TTF("ttf", "Phông chữ TTF", "font/ttf"),

    TXT("txt", "Văn bản (thường là ASCII hoặc ISO 8859-n)", "text/plain"),

    VSD("vsd", "Microsoft Visio", "application/vnd.visio"),

    WAV("wav", "Định dạng âm thanh sóng (WAV)", "audio/wav"),

    WEBA("weba", "Âm thanh WEBM", "audio/webm"),

    WEBM("webm", "Video WEBM", "video/webm"),

    WEBP("webp", "Hình ảnh WEBP", "image/webp"),

    WOFF("woff", "Định dạng phông chữ mở Web (WOFF)", "font/woff"),

    WOFF2("woff2", "Định dạng phông chữ mở Web (WOFF)", "font/woff2"),

    XHTML("xhtml", "XHTML", "application/xhtml+xml"),

    XLS("xls", "Microsoft Excel", "application/vnd.ms-excel"),

    XLSX("xlsx", "Microsoft Excel (OpenXML)", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"),

    XML("xml", "XML", "application/xml"),

    XUL("xul", "XUL", "application/vnd.mozilla.xul+xml"),

    ZIP("zip", "ZIP", "application/zip"),

    MIME_3GP("3gp", "3GPP audio/video container", "video/3gpp"),

    MIME_3GP_WITHOUT_VIDEO("3gp", "3GPP audio/video container doesn't contain video", "audio/3gpp2"),

    MIME_3G2("3g2", "3GPP2 audio/video container", "video/3gpp2"),

    MIME_3G2_WITHOUT_VIDEO("3g2", "3GPP2 audio/video container  doesn't contain video", "audio/3gpp2"),

    MIME_7Z("7z", "Tệp lưu trữ 7-zip", "application/x-7z-compressed")
}
```