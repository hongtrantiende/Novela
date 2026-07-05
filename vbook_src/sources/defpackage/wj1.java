package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wj1  reason: default package */
/* loaded from: classes.dex */
public final class wj1 extends xnd {
    public final long l;
    public final boolean m;
    public final ArrayList n;
    public final z9c o;
    public uj1 p;
    public vj1 q;
    public long r;
    public long s;

    public wj1(tj1 tj1Var) {
        super(tj1Var.a);
        this.l = tj1Var.b;
        this.m = tj1Var.c;
        this.n = new ArrayList();
        this.o = new z9c();
    }

    public final void C(aac aacVar) {
        long j;
        z9c z9cVar = this.o;
        aacVar.n(0, z9cVar);
        long j2 = z9cVar.o;
        uj1 uj1Var = this.p;
        long j3 = this.l;
        long j4 = Long.MIN_VALUE;
        ArrayList arrayList = this.n;
        if (uj1Var != null && !arrayList.isEmpty()) {
            j = this.r - j2;
            if (j3 == Long.MIN_VALUE) {
                j3 = Long.MIN_VALUE;
            } else {
                j3 = this.s - j2;
            }
        } else {
            this.r = j2;
            if (j3 != Long.MIN_VALUE) {
                j4 = j2 + j3;
            }
            this.s = j4;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                sj1 sj1Var = (sj1) arrayList.get(i);
                long j5 = this.r;
                long j6 = this.s;
                sj1Var.f = j5;
                sj1Var.C = j6;
            }
            j = 0;
        }
        try {
            uj1 uj1Var2 = new uj1(aacVar, j, j3);
            this.p = uj1Var2;
            m(uj1Var2);
        } catch (vj1 e) {
            this.q = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((sj1) arrayList.get(i2)).D = this.q;
            }
        }
    }

    @Override // defpackage.ci0
    public final n57 b(e67 e67Var, ij1 ij1Var, long j) {
        sj1 sj1Var = new sj1(this.k.b(e67Var, ij1Var, j), this.m, this.r, this.s, 0);
        this.n.add(sj1Var);
        return sj1Var;
    }

    @Override // defpackage.jx1, defpackage.ci0
    public final void j() {
        vj1 vj1Var = this.q;
        if (vj1Var == null) {
            super.j();
            return;
        }
        throw vj1Var;
    }

    @Override // defpackage.ci0
    public final void n(n57 n57Var) {
        ArrayList arrayList = this.n;
        wq9.D(arrayList.remove(n57Var));
        this.k.n(((sj1) n57Var).a);
        if (arrayList.isEmpty()) {
            uj1 uj1Var = this.p;
            uj1Var.getClass();
            C(uj1Var.b);
        }
    }

    @Override // defpackage.jx1, defpackage.ci0
    public final void p() {
        super.p();
        this.q = null;
        this.p = null;
    }

    @Override // defpackage.xnd
    public final void z(aac aacVar) {
        if (this.q != null) {
            return;
        }
        C(aacVar);
    }
}
