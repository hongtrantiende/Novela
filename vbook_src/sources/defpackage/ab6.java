package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ab6  reason: default package */
/* loaded from: classes3.dex */
public final class ab6 {
    public final String a;

    public ab6(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ab6) && c16.i(this.a, ((ab6) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Integer.hashCode(1) + (hashCode * 31);
    }

    public final String toString() {
        return hl5.n("LacConfig(modelPath=", this.a, ", threadCount=1)");
    }
}
