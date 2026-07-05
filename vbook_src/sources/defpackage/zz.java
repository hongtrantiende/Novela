package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zz  reason: default package */
/* loaded from: classes.dex */
public abstract class zz {
    public static final int a;

    static {
        Object gs9Var;
        int i;
        Object obj = null;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            if (property != null) {
                gs9Var = r4b.R(10, property);
            } else {
                gs9Var = null;
            }
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        if (!(gs9Var instanceof gs9)) {
            obj = gs9Var;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 2097152;
        }
        a = i;
    }
}
