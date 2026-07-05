package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e2a  reason: default package */
/* loaded from: classes.dex */
public final class e2a extends mq7 implements fd6, z7a {
    public k2a K;
    public boolean L;

    @Override // defpackage.fd6
    public final int H0(ry6 ry6Var, w27 w27Var, int i) {
        if (!this.L) {
            i = Integer.MAX_VALUE;
        }
        return w27Var.j(i);
    }

    @Override // defpackage.fd6
    public final int P0(ry6 ry6Var, w27 w27Var, int i) {
        if (!this.L) {
            i = Integer.MAX_VALUE;
        }
        return w27Var.n0(i);
    }

    @Override // defpackage.fd6
    public final int a1(ry6 ry6Var, w27 w27Var, int i) {
        if (this.L) {
            i = Integer.MAX_VALUE;
        }
        return w27Var.F(i);
    }

    @Override // defpackage.z7a
    public final void m1(l8a l8aVar) {
        j8a.l(l8aVar);
        s1a s1aVar = new s1a(new vt4(this) { // from class: d2a
            public final /* synthetic */ e2a b;

            {
                this.b = this;
            }

            @Override // defpackage.vt4
            public final Object invoke() {
                int h;
                int i = r2;
                e2a e2aVar = this.b;
                switch (i) {
                    case 0:
                        h = e2aVar.K.a.h();
                        break;
                    default:
                        h = e2aVar.K.f.h();
                        break;
                }
                return Float.valueOf(h);
            }
        }, new vt4(this) { // from class: d2a
            public final /* synthetic */ e2a b;

            {
                this.b = this;
            }

            @Override // defpackage.vt4
            public final Object invoke() {
                int h;
                int i = r2;
                e2a e2aVar = this.b;
                switch (i) {
                    case 0:
                        h = e2aVar.K.a.h();
                        break;
                    default:
                        h = e2aVar.K.f.h();
                        break;
                }
                return Float.valueOf(h);
            }
        }, false);
        if (this.L) {
            k8a k8aVar = h8a.w;
            r76 r76Var = j8a.a[13];
            l8aVar.a(k8aVar, s1aVar);
            return;
        }
        k8a k8aVar2 = h8a.v;
        r76 r76Var2 = j8a.a[12];
        l8aVar.a(k8aVar2, s1aVar);
    }

    @Override // defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        ff8 ff8Var;
        int h;
        int i;
        int i2;
        if (this.L) {
            ff8Var = ff8.a;
        } else {
            ff8Var = ff8.b;
        }
        lre.e(j, ff8Var);
        int i3 = Integer.MAX_VALUE;
        if (this.L) {
            h = Integer.MAX_VALUE;
        } else {
            h = x02.h(j);
        }
        if (this.L) {
            i3 = x02.i(j);
        }
        mw8 M = w27Var.M(x02.b(j, 0, i3, 0, h, 5));
        int i4 = M.a;
        int i5 = x02.i(j);
        if (i4 > i5) {
            i4 = i5;
        }
        int i6 = M.b;
        int h2 = x02.h(j);
        if (i6 > h2) {
            i6 = h2;
        }
        int i7 = M.b - i6;
        int i8 = M.a - i4;
        if (!this.L) {
            i7 = i8;
        }
        this.K.f(i7);
        k2a k2aVar = this.K;
        if (this.L) {
            i = i6;
        } else {
            i = i4;
        }
        k2aVar.b.i(i);
        k2a k2aVar2 = this.K;
        if (this.L) {
            i2 = M.b;
        } else {
            i2 = M.a;
        }
        k2aVar2.c.i(i2);
        this.K.d.setValue(Boolean.FALSE);
        return e37Var.q0(i4, i6, ls3.a, new in2(this, i7, M, 7));
    }

    @Override // defpackage.fd6
    public final int z(ry6 ry6Var, w27 w27Var, int i) {
        if (this.L) {
            i = Integer.MAX_VALUE;
        }
        return w27Var.J(i);
    }
}
