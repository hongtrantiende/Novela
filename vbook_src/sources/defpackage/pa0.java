package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pa0  reason: default package */
/* loaded from: classes.dex */
public final class pa0 implements e78 {
    public static final pa0 a = new Object();
    public static final ac4 b = ac4.a("sessionId");
    public static final ac4 c = ac4.a("firstSessionId");
    public static final ac4 d = ac4.a("sessionIndex");
    public static final ac4 e = ac4.a("eventTimestampUs");
    public static final ac4 f = ac4.a("dataCollectionStatus");
    public static final ac4 g = ac4.a("firebaseInstallationId");
    public static final ac4 h = ac4.a("firebaseAuthenticationToken");

    @Override // defpackage.ws3
    public final void a(Object obj, Object obj2) {
        fba fbaVar = (fba) obj;
        f78 f78Var = (f78) obj2;
        f78Var.a(b, fbaVar.a);
        f78Var.a(c, fbaVar.b);
        f78Var.e(d, fbaVar.c);
        f78Var.g(e, fbaVar.d);
        f78Var.a(f, fbaVar.e);
        f78Var.a(g, fbaVar.f);
        f78Var.a(h, fbaVar.g);
    }
}
