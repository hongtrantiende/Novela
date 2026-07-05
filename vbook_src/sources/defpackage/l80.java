package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l80  reason: default package */
/* loaded from: classes.dex */
public final class l80 implements e78 {
    public static final l80 a = new Object();
    public static final ac4 b = ac4.a("arch");
    public static final ac4 c = ac4.a("model");
    public static final ac4 d = ac4.a("cores");
    public static final ac4 e = ac4.a("ram");
    public static final ac4 f = ac4.a("diskSpace");
    public static final ac4 g = ac4.a("simulator");
    public static final ac4 h = ac4.a("state");
    public static final ac4 i = ac4.a("manufacturer");
    public static final ac4 j = ac4.a("modelClass");

    @Override // defpackage.ws3
    public final void a(Object obj, Object obj2) {
        y92 y92Var = (y92) obj;
        f78 f78Var = (f78) obj2;
        f78Var.e(b, ((kb0) y92Var).a);
        kb0 kb0Var = (kb0) y92Var;
        f78Var.a(c, kb0Var.b);
        f78Var.e(d, kb0Var.c);
        f78Var.g(e, kb0Var.d);
        f78Var.g(f, kb0Var.e);
        f78Var.d(g, kb0Var.f);
        f78Var.e(h, kb0Var.g);
        f78Var.a(i, kb0Var.h);
        f78Var.a(j, kb0Var.i);
    }
}
