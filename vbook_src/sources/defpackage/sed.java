package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sed  reason: default package */
/* loaded from: classes3.dex */
public final class sed {
    public final String a;
    public final int b;

    public sed(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sed) {
                sed sedVar = (sed) obj;
                if (!this.a.equals(sedVar.a) || this.b != sedVar.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return s21.k("VisibleTextInfo(text=", this.b, this.a, ", sentinelOffset=", ")");
    }
}
