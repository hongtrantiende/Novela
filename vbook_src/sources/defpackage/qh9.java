package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qh9  reason: default package */
/* loaded from: classes.dex */
public final class qh9 {
    public static final qh9 a;

    /* JADX WARN: Type inference failed for: r0v0, types: [qh9, java.lang.Object] */
    static {
        oh9.a.getClass();
        a = new Object();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qh9) {
                ph9 ph9Var = hq7.P;
                if (!ph9Var.equals(ph9Var)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return hq7.P.hashCode() + (Integer.hashCode(3) * 31);
    }

    public final String toString() {
        return "ReadMode(sizeType=3, decider=" + hq7.P + ')';
    }
}
