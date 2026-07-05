package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n6d  reason: default package */
/* loaded from: classes3.dex */
public final class n6d implements e48 {
    public static final gm9 a = new gm9("[ \\t ]+");
    public static final gm9 b = new gm9(",\\s*,");
    public static final gm9 c = new gm9("\\.[\\s.]*\\.");
    public static final gm9 d = new gm9(",\\s*([.!?;])");
    public static final gm9 e = new gm9("\\s+([,.!?;:])");
    public static final gm9 f = new gm9("([.,!?;:])([^\\s\\d<])");
    public static final gm9 g = new gm9("(?is)(__start_en__.*?__end_en__|<en>.*?</en>)");
    public static final gm9 h = new gm9("(\\d+)\\.(\\d+)");
    public static final gm9 i = new gm9("ENTOKEN\\d+", 0);
    public static final gm9 j = new gm9("(?is)<en>.*?</en>");
    public static final gm9 k = new gm9("(?<![\\p{L}\\p{N}_])(bằng|tính|kết quả)\\s+(\\d+(?:[.,]\\d+)?)\\s*[-–—]\\s*(\\d+(?:[.,]\\d+)?)(?![\\p{L}\\p{N}_])", 0);
    public static final gm9 l = new gm9("(?<![\\p{L}\\p{N}_])(\\d+(?:[.,]\\d+)?)\\s*[-–—]\\s*(\\d+(?:[.,]\\d+)?)\\s+(bằng|tính|kết quả)(?![\\p{L}\\p{N}_])", 0);
    public static final gm9 m = new gm9("(?<![\\p{L}\\p{N}_])(từ|khoảng|trong)\\s+(\\d+(?:[.,]\\d+)?)\\s*[-–—]\\s*(\\d+(?:[.,]\\d+)?)(?![\\p{L}\\p{N}_])", 0);
    public static final gm9 n = new gm9("([\\d./]+)\\s*[-–—]\\s*([\\d./]+)\\s*=");
    public static final gm9 o = new gm9("=\\s*[-–—](\\d+(?:[./]\\d+)?)");
    public static final gm9 p = new gm9("(?<![\\p{L}\\p{N}_])(0\\d{2,3})[–\\-—](\\d{3,4})[–\\-—](\\d{4})(?![\\p{L}\\p{N}_])");
    public static final gm9 q = new gm9("(?<![\\p{L}\\p{N}_])10\\^([-+]?\\d+)(?![\\p{L}\\p{N}_])");
    public static final gm9 r = new gm9("\\s*(?:->|=>)\\s*");
    public static final gm9 s = new gm9("(?<![\\p{L}\\p{N}_])(\\d+(?:,\\d+){2,})(?![\\p{L}\\p{N}_])");
    public static final gm9 t = new gm9("(?<![\\p{L}\\p{N}_])\\d+(?:[–\\-—]\\d+){2,}(?![\\p{L}\\p{N}_])");
    public static final gm9 u = new gm9("(?<![\\p{L}\\p{N}_])0\\d{2,3}(?:\\s\\d{3}){2}(?![\\p{L}\\p{N}_])");
    public static final gm9 v = new gm9("(?<!\\d)(?<!\\d[,.])(?<![a-zA-Z])(\\d{1,15}(?:[,.]\\d{1,15})?)(\\s*)[–\\-—](\\s*)(\\d{1,15}(?:[,.]\\d{1,15})?)(?!\\d)(?![.,]\\d)");
    public static final gm9 w = new gm9("(?<=\\s)[–\\-—](?=\\s)");
    public static final gm9 x = new gm9("(?<![\\d.])(\\d+(?:\\.\\d{3})*),(\\d+)(%)?");
    public static final gm9 y = new gm9("(?<![\\d.])\\d+(?:\\.\\d{3})+(?![\\d.])");
    public static final gm9 z = new gm9("(?<!\\d)(?<!\\d[,.])([-–—]?)(\\d{7,})(?!\\d)(?![.,]\\d)");
    public static final gm9 A = new gm9("(?<=[a-z])(?=[A-Z])|(?<=[A-Z])(?=[A-Z][a-z])");
    public static final gm9 B = new gm9("(?<![\\p{L}\\p{N}_])[a-zA-Z]{3,}(?![\\p{L}\\p{N}_])");

    /* JADX WARN: Code restructure failed: missing block: B:59:0x04ef, code lost:
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x04f4, code lost:
        if (r1 >= r15.length()) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x04fe, code lost:
        if (java.lang.Character.isUpperCase(r15.charAt(r1)) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0501, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0504, code lost:
        r1 = r16;
     */
    @Override // defpackage.e48
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 1700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n6d.a(java.lang.String):java.lang.String");
    }
}
