package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o96  reason: default package */
/* loaded from: classes3.dex */
public abstract class o96 {
    public static final ly1 a;

    static {
        new tk6(new v16(12));
        new tk6(new v16(13));
        a = new ly1(new v16(14));
        new tk6(new v16(15));
    }

    public static final q0a a(rv4 rv4Var) {
        ly1 ly1Var = a;
        try {
            zv1 zv1Var = (zv1) rv4Var.j(ly1Var);
            if (zv1Var.b == null) {
                zv1Var.b = zv1Var.a.invoke();
            }
            Object obj = zv1Var.b;
            if (obj != null) {
                return (q0a) obj;
            }
            throw new IllegalStateException("Can't retrieve Koin context value. Ensure Koin is properly initialized with startKoin() or KoinApplication.");
        } catch (Exception e) {
            zv1 zv1Var2 = (zv1) rv4Var.j(ly1Var);
            Object invoke = zv1Var2.a.invoke();
            zv1Var2.b = invoke;
            q0a q0aVar = (q0a) invoke;
            if (q0aVar != null) {
                return q0aVar;
            }
            xk5.p(e, "Can't get Koin scope due to error: ");
            return null;
        }
    }
}
