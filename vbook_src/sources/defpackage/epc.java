package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: epc  reason: default package */
/* loaded from: classes3.dex */
public final class epc extends hpc {
    public final String a;

    public epc(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof epc) && c16.i(this.a, ((epc) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hl5.n("LoadError(message=", this.a, ")");
    }

    public /* synthetic */ epc() {
        this("");
    }
}
