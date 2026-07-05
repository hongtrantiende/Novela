package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oi6  reason: default package */
/* loaded from: classes.dex */
public final class oi6 extends mq7 implements z7a {
    public vt4 K;
    public ii6 L;
    public ff8 M;
    public boolean N;
    public boolean O;
    public s1a P;
    public final mi6 Q = new mi6(this, 0);
    public mi6 R;

    public oi6(vt4 vt4Var, ii6 ii6Var, ff8 ff8Var, boolean z, boolean z2) {
        this.K = vt4Var;
        this.L = ii6Var;
        this.M = ff8Var;
        this.N = z;
        this.O = z2;
        H1();
    }

    public final void H1() {
        mi6 mi6Var;
        this.P = new s1a(new ni6(this, 0), new ni6(this, 1), this.O);
        if (this.N) {
            mi6Var = new mi6(this, 1);
        } else {
            mi6Var = null;
        }
        this.R = mi6Var;
    }

    @Override // defpackage.z7a
    public final void m1(l8a l8aVar) {
        j8a.l(l8aVar);
        l8aVar.a(h8a.P, this.Q);
        ff8 ff8Var = this.M;
        s1a s1aVar = this.P;
        if (ff8Var == ff8.a) {
            if (s1aVar != null) {
                k8a k8aVar = h8a.w;
                r76 r76Var = j8a.a[13];
                l8aVar.a(k8aVar, s1aVar);
            } else {
                c16.w("scrollAxisRange");
                throw null;
            }
        } else if (s1aVar != null) {
            k8a k8aVar2 = h8a.v;
            r76 r76Var2 = j8a.a[12];
            l8aVar.a(k8aVar2, s1aVar);
        } else {
            c16.w("scrollAxisRange");
            throw null;
        }
        mi6 mi6Var = this.R;
        if (mi6Var != null) {
            l8aVar.a(s7a.f, new g4(null, mi6Var));
        }
        l8aVar.a(s7a.C, new g4(null, new ko9(new ni6(this, 2), 2)));
        pl1 f = this.L.f();
        k8a k8aVar3 = h8a.f;
        r76 r76Var3 = j8a.a[24];
        l8aVar.a(k8aVar3, f);
    }

    @Override // defpackage.mq7
    public final boolean w1() {
        return false;
    }
}
