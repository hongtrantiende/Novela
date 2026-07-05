package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y70  reason: default package */
/* loaded from: classes.dex */
public final class y70 implements e78 {
    public static final y70 a = new Object();
    public static final ac4 b = ac4.a("eventTimeMs");
    public static final ac4 c = ac4.a("eventCode");
    public static final ac4 d = ac4.a("complianceData");
    public static final ac4 e = ac4.a("eventUptimeMs");
    public static final ac4 f = ac4.a("sourceExtension");
    public static final ac4 g = ac4.a("sourceExtensionJsonProto3");
    public static final ac4 h = ac4.a("timezoneOffsetSeconds");
    public static final ac4 i = ac4.a("networkConnectionInfo");
    public static final ac4 j = ac4.a("experimentIds");

    @Override // defpackage.ws3
    public final void a(Object obj, Object obj2) {
        bw6 bw6Var = (bw6) obj;
        f78 f78Var = (f78) obj2;
        f78Var.g(b, ((uc0) bw6Var).a);
        uc0 uc0Var = (uc0) bw6Var;
        f78Var.a(c, uc0Var.b);
        f78Var.a(d, uc0Var.c);
        f78Var.g(e, uc0Var.d);
        f78Var.a(f, uc0Var.e);
        f78Var.a(g, uc0Var.f);
        f78Var.g(h, uc0Var.g);
        f78Var.a(i, uc0Var.h);
        f78Var.a(j, uc0Var.i);
    }
}
