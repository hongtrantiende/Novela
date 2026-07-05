package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q25  reason: default package */
/* loaded from: classes.dex */
public final class q25 extends t3d {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = zl1.i;
    public List f;
    public boolean g;
    public yj h;
    public xt4 i;
    public final jc j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    public q25() {
        int i = k4d.a;
        this.f = ks3.a;
        this.g = true;
        this.j = new jc(this, 21);
        this.k = "";
        this.o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }

    @Override // defpackage.t3d
    public final void a(ak3 ak3Var) {
        if (this.s) {
            float[] fArr = this.b;
            if (fArr == null) {
                fArr = l27.a();
                this.b = fArr;
            } else {
                l27.f(fArr);
            }
            l27.k(fArr, this.q + this.m, this.r + this.n);
            l27.g(this.l, fArr);
            l27.h(fArr, this.o, this.p);
            l27.k(fArr, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                yj yjVar = this.h;
                if (yjVar == null) {
                    yjVar = dk.a();
                    this.h = yjVar;
                }
                ak0.w(this.f, yjVar);
            }
            this.g = false;
        }
        ij1 Q0 = ak3Var.Q0();
        long G = Q0.G();
        Q0.w().i();
        try {
            ij1 ij1Var = (ij1) ((mu9) Q0.b).a;
            float[] fArr2 = this.b;
            if (fArr2 != null) {
                ij1Var.w().k(fArr2);
            }
            yj yjVar2 = this.h;
            if (!this.f.isEmpty() && yjVar2 != null) {
                ij1Var.w().f(yjVar2, 1);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((t3d) arrayList.get(i)).a(ak3Var);
            }
        } finally {
            rs8.r(Q0, G);
        }
    }

    @Override // defpackage.t3d
    public final xt4 b() {
        return this.i;
    }

    @Override // defpackage.t3d
    public final void d(jc jcVar) {
        this.i = jcVar;
    }

    public final void e(int i, t3d t3dVar) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, t3dVar);
        } else {
            arrayList.add(t3dVar);
        }
        g(t3dVar);
        t3dVar.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            int i = k4d.a;
            if (zl1.h(j2) != zl1.h(j) || zl1.g(j2) != zl1.g(j) || zl1.e(j2) != zl1.e(j)) {
                this.d = false;
                this.e = zl1.i;
            }
        }
    }

    public final void g(t3d t3dVar) {
        if (t3dVar instanceof in8) {
            in8 in8Var = (in8) t3dVar;
            hy0 hy0Var = in8Var.b;
            if (this.d && hy0Var != null) {
                if (hy0Var instanceof esa) {
                    f(((esa) hy0Var).a);
                } else {
                    this.d = false;
                    this.e = zl1.i;
                }
            }
            hy0 hy0Var2 = in8Var.g;
            if (this.d && hy0Var2 != null) {
                if (hy0Var2 instanceof esa) {
                    f(((esa) hy0Var2).a);
                    return;
                }
                this.d = false;
                this.e = zl1.i;
            }
        } else if (t3dVar instanceof q25) {
            q25 q25Var = (q25) t3dVar;
            if (q25Var.d && this.d) {
                f(q25Var.e);
                return;
            }
            this.d = false;
            this.e = zl1.i;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append("\t");
            sb.append(((t3d) arrayList.get(i)).toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
