package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p3f  reason: default package */
/* loaded from: classes.dex */
public final class p3f {
    public final o2f a;
    public final vf9 b;

    public p3f(o2f o2fVar, vf9 vf9Var) {
        this.a = o2fVar;
        this.b = vf9Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p3f) {
            p3f p3fVar = (p3f) obj;
            o2f o2fVar = p3fVar.a;
            o2f o2fVar2 = this.a;
            if (o2fVar2 != null ? o2fVar2 == o2fVar : o2fVar == null) {
                if (this.b == p3fVar.b) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        o2f o2fVar = this.a;
        if (o2fVar == null) {
            hashCode = 0;
        } else {
            hashCode = o2fVar.hashCode();
        }
        return this.b.hashCode() ^ ((hashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String obj = this.b.toString();
        StringBuilder sb = new StringBuilder(valueOf.length() + 52 + obj.length() + 1);
        nk2.C(sb, "SnapshotBlobAndResult{snapshotBlob=", valueOf, ", snapshotResult=", obj);
        sb.append("}");
        return sb.toString();
    }
}
