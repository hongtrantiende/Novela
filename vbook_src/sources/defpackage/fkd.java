package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fkd  reason: default package */
/* loaded from: classes.dex */
public final class fkd {
    public static final xv5[] b;
    public static final wu7 c;
    public static final wu7 d;
    public static final wu7 e;
    public final hkd a;

    static {
        xv5[] xv5VarArr = new xv5[4];
        for (int i = 0; i < 4; i++) {
            xv5VarArr[i] = new xv5((String) null);
        }
        b = xv5VarArr;
        wu7 wu7Var = new wu7(8);
        wu7Var.i(1, new xv5("status bars source"));
        wu7Var.i(2, new xv5("navigation bars source"));
        wu7Var.i(4, new xv5("caption bar source"));
        wu7Var.i(8, new xv5("IME source"));
        wu7Var.i(16, new xv5("system gestures source"));
        wu7Var.i(32, new xv5("mandatory system gestures source"));
        wu7Var.i(64, new xv5("tappable element source"));
        wu7Var.i(Token.CASE, new xv5("display cutout source"));
        c = wu7Var;
        wu7 wu7Var2 = new wu7(8);
        wu7Var2.i(1, new xv5("status bars target"));
        wu7Var2.i(2, new xv5("navigation bars target"));
        wu7Var2.i(4, new xv5("caption bar target"));
        wu7Var2.i(8, new xv5("IME target"));
        wu7Var2.i(16, new xv5("system gestures target"));
        wu7Var2.i(32, new xv5("mandatory system gestures target"));
        wu7Var2.i(64, new xv5("tappable element target"));
        wu7Var2.i(Token.CASE, new xv5("display cutout target"));
        d = wu7Var2;
        wu7 wu7Var3 = new wu7(8);
        dkd.a.getClass();
        wu7Var3.i(1, ckd.g);
        wu7Var3.i(2, ckd.f);
        wu7Var3.i(4, ckd.b);
        wu7Var3.i(8, ckd.d);
        wu7Var3.i(16, ckd.h);
        wu7Var3.i(32, ckd.e);
        wu7Var3.i(64, ckd.i);
        wu7Var3.i(Token.CASE, ckd.c);
        e = wu7Var3;
    }

    public fkd(hkd hkdVar) {
        this.a = hkdVar;
        oy5.a();
    }

    public static boolean a(u95 u95Var, xv5 xv5Var) {
        if (u95Var != xv5Var.b() && u95Var != xv5Var.d() && u95Var != xv5Var.c() && u95Var != xv5Var.a()) {
            return false;
        }
        return true;
    }

    public static void b(oy6 oy6Var, xv5 xv5Var, cx5 cx5Var) {
        long a = oy6Var.a().a();
        oy6Var.g(xv5Var.b(), cx5Var.a);
        oy6Var.g(xv5Var.d(), cx5Var.b);
        oy6Var.g(xv5Var.c(), ((int) (a >> 32)) - cx5Var.c);
        oy6Var.g(xv5Var.a(), ((int) (a & 4294967295L)) - cx5Var.d);
    }
}
