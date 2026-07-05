package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kf5  reason: default package */
/* loaded from: classes3.dex */
public abstract class kf5 {
    public static final h40 a;

    static {
        nsc nscVar;
        gi1 a2 = cm9.a(uy1.class);
        try {
            nscVar = cm9.d(uy1.class);
        } catch (Throwable unused) {
            nscVar = null;
        }
        a = new h40("ApplicationPluginRegistry", new isc(a2, nscVar));
    }

    public static final Object a(re5 re5Var, jf5 jf5Var) {
        Object obj;
        re5Var.getClass();
        uy1 uy1Var = (uy1) re5Var.D.e(a);
        if (uy1Var != null) {
            obj = uy1Var.e(jf5Var.getKey());
        } else {
            obj = null;
        }
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder("Plugin ");
        sb.append(jf5Var);
        h40 key = jf5Var.getKey();
        sb.append(" is not installed. Consider using `install(");
        sb.append(key);
        sb.append(")` in client config first.");
        throw new IllegalStateException(sb.toString());
    }
}
