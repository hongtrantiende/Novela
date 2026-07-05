package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dlb  reason: default package */
/* loaded from: classes.dex */
public abstract class dlb {
    public static final gm9 a = new gm9("([./:?&=/_ \\-\\\\#])");
    public static final gm9 b = new gm9("([._\\-+])");
    public static final gm9 c = new gm9("[a-zA-Z]+|\\d+");
    public static final gm9 d = new gm9(sl1.i0(tl1.B("(?<![\\p{L}\\p{N}_])(?:https?|ftp)://[A-Za-z0-9.\\-_~:/?#\\[\\]@!$&'()*+,;=]+(?![\\p{L}\\p{N}_])", "(?<![\\p{L}\\p{N}_])(?:www\\.)[A-Za-z0-9.\\-_~:/?#\\[\\]@!$&'()*+,;=]+(?![\\p{L}\\p{N}_])", "(?<![\\p{L}\\p{N}_])[A-Za-z0-9.\\-]+(?:\\.com|\\.vn|\\.net|\\.org|\\.gov|\\.io|\\.biz|\\.info)(?:/[A-Za-z0-9.\\-_~:/?#\\[\\]@!$&'()*+,;=]*)?(?![\\p{L}\\p{N}_])", "(?<!\\w)/[a-zA-Z0-9._\\-/]{2,}(?![\\p{L}\\p{N}_])", "(?<![\\p{L}\\p{N}_])[a-zA-Z]:\\\\[a-zA-Z0-9._\\\\\\-]+(?![\\p{L}\\p{N}_])", "(?<![\\p{L}\\p{N}_])[a-zA-Z0-9._\\-]+\\.(?:txt|log|tar|gz|zip|sh|py|js|cpp|h|json|xml|yaml|yml|md|csv|pdf|docx|xlsx|exe|dll|so|config)(?![\\p{L}\\p{N}_])", "(?<![\\p{L}\\p{N}_])[a-zA-Z][a-zA-Z0-9]*(?:[._\\-][a-zA-Z0-9]+){2,}(?![\\p{L}\\p{N}_])", "(?<![\\p{L}\\p{N}_])[a-fA-F0-9]{1,4}(?::[a-fA-F0-9]{1,4}){3,7}(?![\\p{L}\\p{N}_])"), "|", null, null, null, 62), 0);
    public static final gm9 e = new gm9("(?<![\\p{L}\\p{N}_])[A-Za-z0-9._%+\\-]+@[A-Za-z0-9.\\-]+\\.[A-Za-z]{2,}(?![\\p{L}\\p{N}_])", 0);
    public static final gm9 f = new gm9("(?<![a-zA-Z\\d,.])(\\d+)/(\\d+)(?![\\d,.])");
    public static final gm9 g = new gm9("(?:=|\\s)-((\\d+)/(\\d+))");
    public static final gm9 h = new gm9("(?<![a-zA-Z\\d,.])(\\d+)/(\\d+[a-zA-Z][a-zA-Z0-9]*)");

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlb.a(java.lang.String, boolean):java.lang.String");
    }

    public static ArrayList b(gm9 gm9Var, String str) {
        ArrayList arrayList = new ArrayList();
        sw4 sw4Var = new sw4(gm9.c(gm9Var, str));
        int i = 0;
        while (sw4Var.hasNext()) {
            b27 b27Var = (b27) sw4Var.next();
            arrayList.add(str.substring(i, b27Var.b().a));
            arrayList.add(b27Var.c());
            i = b27Var.b().b + 1;
        }
        arrayList.add(str.substring(i));
        return arrayList;
    }
}
