package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e  reason: default package */
/* loaded from: classes3.dex */
public abstract class e {
    public static final e31 a;
    public static final e31 b;
    public static final e31 c;
    public static final e31 d;
    public static final e31 e;

    static {
        e31 e31Var = e31.d;
        a = p40.o("/");
        b = p40.o("\\");
        c = p40.o("/\\");
        d = p40.o(".");
        e = p40.o("..");
    }

    public static final int a(hn8 hn8Var) {
        e31 e31Var = hn8Var.a;
        if (e31Var.e() != 0) {
            if (e31Var.j(0) != 47) {
                if (e31Var.j(0) == 92) {
                    if (e31Var.e() > 2 && e31Var.j(1) == 92) {
                        e31 e31Var2 = b;
                        e31Var2.getClass();
                        int g = e31Var.g(e31Var2.i(), 2);
                        if (g == -1) {
                            return e31Var.e();
                        }
                        return g;
                    }
                } else if (e31Var.e() > 2 && e31Var.j(1) == 58 && e31Var.j(2) == 92) {
                    char j = (char) e31Var.j(0);
                    if ('a' > j || j >= '{') {
                        if ('A' <= j && j < '[') {
                            return 3;
                        }
                    } else {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [my0, java.lang.Object] */
    public static final hn8 b(hn8 hn8Var, hn8 hn8Var2, boolean z) {
        hn8Var.getClass();
        hn8Var2.getClass();
        if (a(hn8Var2) != -1) {
            return hn8Var2;
        }
        if (hn8Var2.g() != null) {
            return hn8Var2;
        }
        e31 c2 = c(hn8Var);
        if (c2 == null && (c2 = c(hn8Var2)) == null) {
            c2 = f(hn8.b);
        }
        ?? obj = new Object();
        obj.g1(hn8Var.a);
        if (obj.b > 0) {
            obj.g1(c2);
        }
        obj.g1(hn8Var2.a);
        return d(obj, z);
    }

    public static final e31 c(hn8 hn8Var) {
        e31 e31Var = hn8Var.a;
        e31 e31Var2 = a;
        if (e31.h(e31Var, e31Var2) != -1) {
            return e31Var2;
        }
        e31 e31Var3 = hn8Var.a;
        e31 e31Var4 = b;
        if (e31.h(e31Var3, e31Var4) != -1) {
            return e31Var4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0110 A[EDGE_INSN: B:99:0x0110->B:81:0x0110 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [my0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.hn8 d(defpackage.my0 r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e.d(my0, boolean):hn8");
    }

    public static final e31 e(byte b2) {
        if (b2 != 47) {
            if (b2 == 92) {
                return b;
            }
            vs.m(a82.j(b2, "not a directory separator: "));
            return null;
        }
        return a;
    }

    public static final e31 f(String str) {
        if (c16.i(str, "/")) {
            return a;
        }
        if (c16.i(str, "\\")) {
            return b;
        }
        vs.m(s21.m("not a directory separator: ", str));
        return null;
    }
}
