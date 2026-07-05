package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sc7  reason: default package */
/* loaded from: classes3.dex */
public abstract class sc7 {
    public static final gm9 a = new gm9("(?<![\\p{L}\\p{N}_])(?=[IVXLCDM]{2,})(?:M{0,4}(?:CM|CD|D?C{0,3})(?:XC|XL|L?X{0,3})(?:IX|IV|V?I{0,3}))(?<=[IVXLCDM])(?![\\p{L}\\p{N}_])");
    public static final gm9 b = new gm9("(?<!['’])(?<![\\p{L}\\p{N}_])([a-zA-Z])(?![\\p{L}\\p{N}_])(\\.?)");
    public static final gm9 c = new gm9("(?<![\\p{L}\\p{N}_])(?=[A-ZĐĂÂÊÔƠƯa-zĐĂÂÊÔƠƯ0-9]*[A-ZĐĂÂÊÔƠƯ])(?:[A-ZĐĂÂÊÔƠƯ][a-zđăâêôơư]?\\d*){2,}(?![\\p{L}\\p{N}_])");
    public static final gm9 d = new gm9("(?<![-–—])(?<![\\p{L}\\p{N}_])(\\d+(?:\\.\\d+){2,})(?![\\p{L}\\p{N}_])");
    public static final gm9 e = new gm9("((?<![\\p{L}\\p{N}_])[a-zA-Z0-9])['’](?!\\w)");
    public static final gm9 f = new gm9("(?<=\\d)(['’]+|[\"”])");
    public static final gm9 g = new gm9("(chữ|chữ cái|kí tự|ký tự)\\s+(['\"]?)([a-z])(['\"]?)(?![\\p{L}\\p{N}_])", 0);
    public static final gm9 h = new gm9("(?<![\\p{L}\\p{N}_])(\\d+)([a-zA-Z])(?![\\p{L}\\p{N}_])");
    public static final gm9 i = new gm9("(?<![\\p{L}\\p{N}_])([a-zA-Z])(\\d+)(?![\\p{L}\\p{N}_])");
    public static final gm9 j = new gm9("[\\(\\[\\{]\\s*(.*?)\\s*[\\)\\]\\}]");
    public static final gm9 k = new gm9("[\\[\\]\\(\\)\\{\\}]");
    public static final gm9 l = new gm9("-(\\d+(?:[.,]\\d+)?)\\s*°\\s*c(?![\\p{L}\\p{N}_])", 0);
    public static final gm9 m = new gm9("-(\\d+(?:[.,]\\d+)?)\\s*°\\s*f(?![\\p{L}\\p{N}_])", 0);
    public static final gm9 n = new gm9("(\\d+(?:[.,]\\d+)?)\\s*°\\s*c(?![\\p{L}\\p{N}_])", 0);
    public static final gm9 o = new gm9("(\\d+(?:[.,]\\d+)?)\\s*°\\s*f(?![\\p{L}\\p{N}_])", 0);
    public static final gm9 p = new gm9("°");
    public static final gm9 q = new gm9("(?<![.,\\d])(?<![\\p{L}\\p{N}_])(\\d+):(\\d+(?:\\.\\d+)?)(?![\\p{L}\\p{N}_])(?![.,\\d])");
    public static final gm9 r = new gm9("[^a-zA-Z0-9\\sàáảãạăắằẳẵặâấầẩẫậèéẻẽẹêếềểễệìíỉĩịòóỏõọôốồổỗộơớờởỡợùúủũụưứừửữựỳýỷỹỵđÀÁẢÃẠĂẮẰẲẴẶÂẤẦẨẪẬÈÉẺẼẸÊẾỀỂỄỆÌÍỈĨỊÒÓỎÕỌÔỐỒỔỖỘƠỚỜỞỠỢÙÚỦŨỤƯỨỪỬỮỰỲÝỶỸỴĐ.,!?_'‘’\\-]");
    public static final gm9 s = new gm9("[“”„]");
    public static final gm9 t = new gm9("(^|[\\s.,!?;:])[‘’']+|[‘’']+($|[\\s.,!?;:])");
    public static final gm9 u = new gm9("[:;]");
    public static final gm9 v = new gm9("(?<![\\p{L}\\p{N}_])([a-zA-Z]+)\\^([-+]?\\d+)(?![\\p{L}\\p{N}_])");
    public static final mfb w = new mfb(new qx6(10));
    public static final gm9 x = new gm9("\\.(com|vn|net|org|edu|gov|io|biz|info)(?![\\p{L}\\p{N}_])", 0);
    public static final gm9 y = new gm9("([.!?]+(?:\\s+|$))");
}
