package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kad  reason: default package */
/* loaded from: classes3.dex */
public abstract class kad {
    public static final Map a = o17.s(new yk8("m3u8", "application/x-mpegURL"), new yk8("m3u", "application/x-mpegURL"), new yk8("mpd", "application/dash+xml"), new yk8("mp4", "video/mp4"), new yk8("m4v", "video/mp4"), new yk8("webm", "video/webm"), new yk8("mkv", "video/x-matroska"), new yk8("mov", "video/quicktime"), new yk8("ts", "video/mp2t"));
    public static final Set b = b00.F0(new String[]{"jpg", "jpeg", "png", "gif", "webp", "svg", "ico", "css", "woff", "woff2", "ttf", "otf", "eot"});

    public static final String a(List list) {
        Object obj;
        Object obj2;
        list.getClass();
        List e0 = g9a.e0(new ff4(new ff4(new ki4(3, new c00(new z17(list), 1), new x8d(2)), true, new x8d(3)), true, new x8d(4)));
        Iterator it = e0.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                String lowerCase = k4b.G0(k4b.G0((String) obj2, '?'), '#').toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (r4b.I(lowerCase, ".m3u8", false)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        String str = (String) obj2;
        if (str == null) {
            Iterator it2 = e0.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                String lowerCase2 = k4b.G0(k4b.G0((String) next, '?'), '#').toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                if (r4b.I(lowerCase2, ".mpd", false)) {
                    obj = next;
                    break;
                }
            }
            String str2 = (String) obj;
            if (str2 == null) {
                return (String) sl1.e0(e0);
            }
            return str2;
        }
        return str;
    }

    public static final String b(String str) {
        str.getClass();
        return k4b.G0(k4b.G0(k4b.D0(str, "://", ""), '/'), '?');
    }

    public static final String c(String str) {
        String lowerCase = k4b.E0('.', k4b.G0(k4b.G0(str, '?'), '#'), "").toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.pgd r5, defpackage.n42 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.had
            if (r0 == 0) goto L13
            r0 = r6
            had r0 = (defpackage.had) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            had r0 = new had
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.b
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2d
            if (r1 != r3) goto L27
            defpackage.hre.r(r6)
            goto L46
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r4
        L2d:
            defpackage.hre.r(r6)
            sw2 r6 = defpackage.ab3.a
            n35 r6 = defpackage.zz6.a
            n35 r6 = r6.f
            iad r1 = new iad
            r1.<init>(r5, r4, r2)
            r0.b = r3
            java.lang.Object r6 = defpackage.z87.E(r6, r1, r0)
            n82 r5 = defpackage.n82.a
            if (r6 != r5) goto L46
            return r5
        L46:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L87
            java.lang.CharSequence r5 = defpackage.k4b.N0(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "\""
            java.lang.String r5 = defpackage.k4b.t0(r5, r6)
            java.lang.String r5 = defpackage.k4b.u0(r5, r6)
            java.lang.String r6 = "\\/"
            java.lang.String r0 = "/"
            java.lang.String r5 = defpackage.r4b.N(r5, r2, r6, r0)
            java.lang.String r6 = "\\u0026"
            java.lang.String r0 = "&"
            java.lang.String r5 = defpackage.r4b.N(r5, r2, r6, r0)
            java.lang.CharSequence r6 = defpackage.k4b.N0(r5)
            java.lang.String r6 = r6.toString()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r0)
            r6.getClass()
            java.lang.String r0 = "blob:"
            boolean r6 = defpackage.r4b.Q(r6, r0, r2)
            if (r6 == 0) goto L86
            goto L87
        L86:
            return r5
        L87:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kad.d(pgd, n42):java.lang.Object");
    }

    public static final String e(String str) {
        String str2;
        if (!f(str) || (str2 = (String) a.get(c(str))) == null) {
            return "";
        }
        return str2;
    }

    public static final boolean f(String str) {
        str.getClass();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (!r4b.Q(lowerCase, "http://", false) && !r4b.Q(lowerCase, "https://", false)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|8))|153|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a9, code lost:
        r7 = r2;
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0260, code lost:
        if (r0 != r13) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x00a9: MOVE  (r17 I:??[long, double]) = (r7 I:??[long, double]), block:B:37:0x00a9 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cd A[Catch: all -> 0x0200, TRY_LEAVE, TryCatch #1 {all -> 0x0200, blocks: (B:76:0x01c9, B:78:0x01cd, B:87:0x0204, B:73:0x01b4), top: B:134:0x01b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x022c  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v3, types: [at1] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v1, types: [lu4] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [m42, java.lang.Object, jad, n42] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List, aab, java.lang.Object, m42, pgd, at1] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [aab, at1] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Throwable, java.util.List, aab, java.lang.Object, at1] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Throwable, java.util.List, aab, java.lang.Object, m42, pgd, at1] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(long r19, long r21, defpackage.lu4 r23, defpackage.n42 r24) {
        /*
            Method dump skipped, instructions count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kad.g(long, long, lu4, n42):java.lang.Object");
    }
}
