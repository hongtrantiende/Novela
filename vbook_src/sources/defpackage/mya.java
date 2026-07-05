package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mya  reason: default package */
/* loaded from: classes.dex */
public final class mya implements xr {
    public final xr a;
    public final long b;

    public mya(lf4 lf4Var, long j) {
        this.a = lf4Var;
        this.b = j;
    }

    @Override // defpackage.xr
    public final o4d a(drc drcVar) {
        return new nya(this.a.a(drcVar), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mya)) {
            return false;
        }
        mya myaVar = (mya) obj;
        if (myaVar.b != this.b || !c16.i(myaVar.a, this.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
