package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vi2  reason: default package */
/* loaded from: classes3.dex */
public abstract class vi2 {
    public static final int[] a = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final gm9 b = new gm9("(?<![a-zA-Z\\d])(?<![a-zA-Z\\d][.,])(\\d{1,2})([/\\-.])(\\d{1,2})([/\\-.])(\\d{4})(?!\\d|[.,]\\d)");
    public static final gm9 c = new gm9("(?<![a-zA-Z\\d])(?<![a-zA-Z\\d][.,])(\\d{4})-(\\d{2})-(\\d{2})(?!\\d|[.,]\\d)");
    public static final gm9 d = new gm9("(\\d{2})T(\\d{2})|(\\d{2})Z(?![\\p{L}\\p{N}_])");
    public static final gm9 e = new gm9("(?<![a-zA-Z\\d])(?<![a-zA-Z\\d][.,])(\\d{1,2})([/\\-])(\\d{1,2})(?!\\d|[.,]\\d)");
    public static final gm9 f = new gm9("(?<![a-zA-Z\\d])(?<![a-zA-Z\\d][.,])(\\d{1,2})([/\\-.])(\\d{4})(?!\\d|[.,]\\d)");
    public static final gm9 g = new gm9("(?<![\\p{L}\\p{N}_])([a-zA-Z]\\d*)/(\\d{4})(?![\\p{L}\\p{N}_])", 0);
    public static final gm9 h = new gm9("(?<![\\p{L}\\p{N}_])(\\d+)(g|:|h)(\\d{1,2})(p|:|m)(\\d{1,2})(?:\\s*(giây|s|g))?(?![\\p{L}\\p{N}_])", 0);
    public static final gm9 i = new gm9("(?<![\\p{L}\\p{N}_])(\\d+)(g|h|:)(\\d{1,2})(?:\\s*(phút|p|m|giây|s|g))?(?![\\p{L}\\p{N}_])(?![.,]\\d)", 0);
    public static final gm9 j = new gm9("(?<![\\p{L}\\p{N}_])(\\d+)g\\s*(sáng|trưa|chiều|tối|khuya)(?![\\p{L}\\p{N}_])", 0);
    public static final gm9 k = new gm9("(?<![\\p{L}\\p{N}_])lúc\\s*(\\d+)g(?![\\p{L}\\p{N}_])", 0);
    public static final gm9 l = new gm9("(?<![\\p{L}\\p{N}_])ngày\\s+ngày(?![\\p{L}\\p{N}_])", 0);
    public static final gm9 m = new gm9("(?<![\\p{L}\\p{N}_])tháng\\s+tháng(?![\\p{L}\\p{N}_])", 0);
    public static final gm9 n = new gm9("(?<![\\p{L}\\p{N}_])năm\\s+năm(?![\\p{L}\\p{N}_])", 0);
    public static final gm9 o = new gm9("(?<![\\p{L}\\p{N}_])hôm\\s+ngày(?![\\p{L}\\p{N}_])", 0);

    public static boolean a(String str, String str2) {
        int i2;
        int i3;
        Integer S = r4b.S(str);
        if (S != null) {
            i2 = S.intValue();
        } else {
            i2 = 0;
        }
        Integer S2 = r4b.S(str2);
        if (S2 != null) {
            i3 = S2.intValue();
        } else {
            i3 = 0;
        }
        if (1 > i3 || i3 >= 13 || 1 > i2 || i2 > a[i3 - 1]) {
            return false;
        }
        return true;
    }

    public static String b(String str) {
        String S0 = k4b.S0(str, '0');
        if (S0.length() == 0) {
            return "0";
        }
        return S0;
    }
}
