package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hc6  reason: default package */
/* loaded from: classes.dex */
public final class hc6 {
    public static final hc6 a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, hc6] */
    static {
        ?? obj = new Object();
        if (rg3.a(nae.e, nae.e) < 0 || rg3.a(nae.e, nae.e) < 0 || rg3.a(nae.e, nae.e) < 0 || rg3.a(nae.e, nae.e) < 0) {
            kv5.a("Layer outsets must be non-negative");
        }
        a = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof hc6) || !rg3.b(nae.e, nae.e) || !rg3.b(nae.e, nae.e) || !rg3.b(nae.e, nae.e) || !rg3.b(nae.e, nae.e)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(nae.e) + nk2.d(nae.e, nk2.d(nae.e, Float.hashCode(nae.e) * 31, 31), 31);
    }

    public final String toString() {
        String c = rg3.c(nae.e);
        String c2 = rg3.c(nae.e);
        return nk2.w(nk2.y("LayerOutsets(left=", c, ", top=", c2, ", right="), rg3.c(nae.e), ", bottom=", rg3.c(nae.e), ")");
    }
}
