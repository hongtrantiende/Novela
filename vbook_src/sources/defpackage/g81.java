package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g81  reason: default package */
/* loaded from: classes3.dex */
public final class g81 {
    public final String a;
    public final Throwable b;

    public g81(String str, Throwable th) {
        this.a = str;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g81) {
                g81 g81Var = (g81) obj;
                if (!this.a.equals(g81Var.a) || !this.b.equals(g81Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CascadeError(context=" + this.a + ", cause=" + this.b + ")";
    }
}
