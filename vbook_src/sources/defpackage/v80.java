package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v80  reason: default package */
/* loaded from: classes.dex */
public final class v80 implements e78 {
    public static final v80 a = new Object();
    public static final ac4 b = ac4.a("batteryLevel");
    public static final ac4 c = ac4.a("batteryVelocity");
    public static final ac4 d = ac4.a("proximityOn");
    public static final ac4 e = ac4.a("orientation");
    public static final ac4 f = ac4.a("ramUsed");
    public static final ac4 g = ac4.a("diskUsed");

    @Override // defpackage.ws3
    public final void a(Object obj, Object obj2) {
        ha2 ha2Var = (ha2) obj;
        f78 f78Var = (f78) obj2;
        f78Var.a(b, ((yb0) ha2Var).a);
        yb0 yb0Var = (yb0) ha2Var;
        f78Var.e(c, yb0Var.b);
        f78Var.d(d, yb0Var.c);
        f78Var.e(e, yb0Var.d);
        f78Var.g(f, yb0Var.e);
        f78Var.g(g, yb0Var.f);
    }
}
