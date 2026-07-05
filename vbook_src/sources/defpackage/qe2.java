package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qe2  reason: default package */
/* loaded from: classes.dex */
public final class qe2 {
    public final mf9 a;
    public final boolean b;

    public qe2(mf9 mf9Var, boolean z) {
        this.a = mf9Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qe2) {
            qe2 qe2Var = (qe2) obj;
            if (qe2Var.a.equals(this.a) && qe2Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.b).hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }
}
