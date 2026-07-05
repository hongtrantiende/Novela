package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lsc  reason: default package */
/* loaded from: classes3.dex */
public final class lsc implements nf9 {
    public final String a;

    public lsc(gi1 gi1Var) {
        this.a = v66.a(gi1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lsc.class == obj.getClass() && c16.i(this.a, ((lsc) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.nf9
    public final String getValue() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
