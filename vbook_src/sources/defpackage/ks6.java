package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ks6  reason: default package */
/* loaded from: classes.dex */
public final class ks6 extends zu7 {
    public final awd l;
    public un6 m;
    public ih1 n;

    public ks6(awd awdVar) {
        this.l = awdVar;
        if (awdVar.a == null) {
            awdVar.a = this;
        } else {
            vs.k("There is already a listener registered");
            throw null;
        }
    }

    @Override // defpackage.zu7
    public final void e() {
        awd awdVar = this.l;
        awdVar.b = true;
        awdVar.d = false;
        awdVar.c = false;
        awdVar.i.drainPermits();
        awdVar.c();
    }

    @Override // defpackage.zu7
    public final void f() {
        this.l.b = false;
    }

    @Override // defpackage.zu7
    public final void h(q78 q78Var) {
        super.h(q78Var);
        this.m = null;
        this.n = null;
    }

    public final void j() {
        un6 un6Var = this.m;
        ih1 ih1Var = this.n;
        if (un6Var != null && ih1Var != null) {
            super.h(ih1Var);
            d(un6Var, ih1Var);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        Class<?> cls = this.l.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
