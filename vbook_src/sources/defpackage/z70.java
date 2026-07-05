package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z70  reason: default package */
/* loaded from: classes.dex */
public final class z70 implements e78 {
    public static final z70 a = new Object();
    public static final ac4 b = ac4.a("requestTimeMs");
    public static final ac4 c = ac4.a("requestUptimeMs");
    public static final ac4 d = ac4.a("clientInfo");
    public static final ac4 e = ac4.a("logSource");
    public static final ac4 f = ac4.a("logSourceName");
    public static final ac4 g = ac4.a("logEvent");
    public static final ac4 h = ac4.a("qosTier");

    @Override // defpackage.ws3
    public final void a(Object obj, Object obj2) {
        fw6 fw6Var = (fw6) obj;
        f78 f78Var = (f78) obj2;
        f78Var.g(b, ((vc0) fw6Var).a);
        vc0 vc0Var = (vc0) fw6Var;
        f78Var.g(c, vc0Var.b);
        f78Var.a(d, vc0Var.c);
        f78Var.a(e, vc0Var.d);
        f78Var.a(f, vc0Var.e);
        f78Var.a(g, vc0Var.f);
        f78Var.a(h, ab9.a);
    }
}
