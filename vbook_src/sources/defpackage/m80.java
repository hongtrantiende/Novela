package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m80  reason: default package */
/* loaded from: classes.dex */
public final class m80 implements e78 {
    public static final m80 a = new Object();
    public static final ac4 b = ac4.a("generator");
    public static final ac4 c = ac4.a("identifier");
    public static final ac4 d = ac4.a("appQualitySessionId");
    public static final ac4 e = ac4.a("startedAt");
    public static final ac4 f = ac4.a("endedAt");
    public static final ac4 g = ac4.a("crashed");
    public static final ac4 h = ac4.a("app");
    public static final ac4 i = ac4.a("user");
    public static final ac4 j = ac4.a("os");
    public static final ac4 k = ac4.a("device");
    public static final ac4 l = ac4.a("events");
    public static final ac4 m = ac4.a("generatorType");

    @Override // defpackage.ws3
    public final void a(Object obj, Object obj2) {
        pa2 pa2Var = (pa2) obj;
        f78 f78Var = (f78) obj2;
        f78Var.a(b, ((gb0) pa2Var).a);
        gb0 gb0Var = (gb0) pa2Var;
        f78Var.a(c, gb0Var.b.getBytes(qa2.a));
        f78Var.a(d, gb0Var.c);
        f78Var.g(e, gb0Var.d);
        f78Var.a(f, gb0Var.e);
        f78Var.d(g, gb0Var.f);
        f78Var.a(h, gb0Var.g);
        f78Var.a(i, gb0Var.h);
        f78Var.a(j, gb0Var.i);
        f78Var.a(k, gb0Var.j);
        f78Var.a(l, gb0Var.k);
        f78Var.e(m, gb0Var.l);
    }
}
