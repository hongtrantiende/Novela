package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j80  reason: default package */
/* loaded from: classes.dex */
public final class j80 implements e78 {
    public static final j80 a = new Object();
    public static final ac4 b = ac4.a("identifier");
    public static final ac4 c = ac4.a("version");
    public static final ac4 d = ac4.a("displayVersion");
    public static final ac4 e = ac4.a("organization");
    public static final ac4 f = ac4.a("installationUuid");
    public static final ac4 g = ac4.a("developmentPlatform");
    public static final ac4 h = ac4.a("developmentPlatformVersion");

    @Override // defpackage.ws3
    public final void a(Object obj, Object obj2) {
        x92 x92Var = (x92) obj;
        f78 f78Var = (f78) obj2;
        f78Var.a(b, ((hb0) x92Var).a);
        hb0 hb0Var = (hb0) x92Var;
        f78Var.a(c, hb0Var.b);
        f78Var.a(d, hb0Var.c);
        f78Var.a(e, null);
        f78Var.a(f, hb0Var.d);
        f78Var.a(g, hb0Var.e);
        f78Var.a(h, hb0Var.f);
    }
}
