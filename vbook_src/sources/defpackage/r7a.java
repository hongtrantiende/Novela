package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r7a  reason: default package */
/* loaded from: classes.dex */
public final class r7a {
    public final eid a;
    public final eid b;

    public r7a(eid eidVar, eid eidVar2) {
        this.a = eidVar;
        this.b = eidVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7a)) {
            return false;
        }
        r7a r7aVar = (r7a) obj;
        if (this.a == r7aVar.a && this.b == r7aVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectionWedgeAffinity(startAffinity=" + this.a + ", endAffinity=" + this.b + ")";
    }
}
