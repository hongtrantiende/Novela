package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e80  reason: default package */
/* loaded from: classes.dex */
public final class e80 implements e78 {
    public static final e80 a = new Object();
    public static final ac4 b = ac4.a("pid");
    public static final ac4 c = ac4.a("processName");
    public static final ac4 d = ac4.a("reasonCode");
    public static final ac4 e = ac4.a("importance");
    public static final ac4 f = ac4.a("pss");
    public static final ac4 g = ac4.a("rss");
    public static final ac4 h = ac4.a("timestamp");
    public static final ac4 i = ac4.a("traceFile");
    public static final ac4 j = ac4.a("buildIdMappingForArch");

    @Override // defpackage.ws3
    public final void a(Object obj, Object obj2) {
        s92 s92Var = (s92) obj;
        f78 f78Var = (f78) obj2;
        f78Var.e(b, ((ab0) s92Var).a);
        ab0 ab0Var = (ab0) s92Var;
        f78Var.a(c, ab0Var.b);
        f78Var.e(d, ab0Var.c);
        f78Var.e(e, ab0Var.d);
        f78Var.g(f, ab0Var.e);
        f78Var.g(g, ab0Var.f);
        f78Var.g(h, ab0Var.g);
        f78Var.a(i, ab0Var.h);
        f78Var.a(j, ab0Var.i);
    }
}
