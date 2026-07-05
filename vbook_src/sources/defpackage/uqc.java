package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uqc  reason: default package */
/* loaded from: classes3.dex */
public final class uqc {
    public final int a;
    public final vp8 b;

    public uqc(int i, vp8 vp8Var) {
        this.a = i;
        this.b = vp8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqc)) {
            return false;
        }
        uqc uqcVar = (uqc) obj;
        if (this.a == uqcVar.a && c16.i(this.b, uqcVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TtsState(page=" + this.a + ", highlight=" + this.b + ")";
    }
}
