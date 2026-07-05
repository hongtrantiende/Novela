package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ig6  reason: default package */
/* loaded from: classes.dex */
public final class ig6 implements i2a {
    public final /* synthetic */ int a;
    public final /* synthetic */ i2a b;
    public final /* synthetic */ x2a c;

    public /* synthetic */ ig6(i2a i2aVar, x2a x2aVar, int i) {
        this.a = i;
        this.c = x2aVar;
        this.b = i2aVar;
    }

    @Override // defpackage.i2a
    public final float a(float f) {
        switch (this.a) {
            case 0:
                return this.b.a(f);
            case 1:
                return this.b.a(f);
            default:
                return this.b.a(f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int b(int i) {
        Object obj;
        int i2 = this.a;
        Integer num = null;
        boolean z = false;
        x2a x2aVar = this.c;
        switch (i2) {
            case 0:
                qg6 qg6Var = (qg6) x2aVar;
                eg6 j = qg6Var.j();
                if (j.m.isEmpty()) {
                    return 0;
                }
                int h = qg6Var.h();
                if (i <= e() && h <= i) {
                    List list = j.m;
                    int size = list.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            obj = list.get(i3);
                            if (((fg6) obj).a != i) {
                                i3++;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    fg6 fg6Var = (fg6) obj;
                    if (j.q == ff8.a) {
                        if (fg6Var != null) {
                            num = Integer.valueOf((int) (fg6Var.x & 4294967295L));
                        }
                    } else if (fg6Var != null) {
                        num = Integer.valueOf((int) (fg6Var.x >> 32));
                    }
                    if (num == null) {
                        return 0;
                    }
                    return num.intValue();
                }
                int i4 = ((eg6) qg6Var.e.getValue()).j;
                int q = xoe.q(j);
                int i5 = 1;
                if (i < qg6Var.h()) {
                    z = true;
                }
                int h2 = i - qg6Var.h();
                int i6 = i4 - 1;
                if (z) {
                    i5 = -1;
                }
                return ((((i6 * i5) + h2) / i4) * q) - qg6Var.i();
            case 1:
                kj6 kj6Var = (kj6) x2aVar;
                fj6 j2 = kj6Var.j();
                if (j2.k.isEmpty()) {
                    return 0;
                }
                int h3 = kj6Var.h();
                if (i <= e() && h3 <= i) {
                    List list2 = j2.k;
                    int size2 = list2.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 < size2) {
                            Object obj2 = list2.get(i7);
                            if (((gj6) obj2).a == i) {
                                num = obj2;
                            } else {
                                i7++;
                            }
                        }
                    }
                    gj6 gj6Var = (gj6) num;
                    if (gj6Var == null) {
                        return 0;
                    }
                    return gj6Var.p;
                }
                return ((i - kj6Var.h()) * rqe.r(j2)) - kj6Var.i();
            default:
                rj8 rj8Var = (rj8) x2aVar;
                return (int) (dce.o(xxe.q(rj8Var) + k27.A(((rj8Var.p() * (i - rj8Var.k())) - (rj8Var.l() * rj8Var.p())) + nae.e), rj8Var.h, rj8Var.g) - xxe.q(rj8Var));
        }
    }

    public final int c() {
        int i = this.a;
        x2a x2aVar = this.c;
        switch (i) {
            case 0:
                return ((qg6) x2aVar).h();
            case 1:
                return ((kj6) x2aVar).h();
            default:
                return ((rj8) x2aVar).e;
        }
    }

    public final int d() {
        int i = this.a;
        x2a x2aVar = this.c;
        switch (i) {
            case 0:
                return ((qg6) x2aVar).i();
            case 1:
                return ((kj6) x2aVar).i();
            default:
                return ((rj8) x2aVar).f;
        }
    }

    public final int e() {
        int i = this.a;
        x2a x2aVar = this.c;
        switch (i) {
            case 0:
                fg6 fg6Var = (fg6) sl1.k0(((qg6) x2aVar).j().m);
                if (fg6Var == null) {
                    return 0;
                }
                return fg6Var.a;
            case 1:
                gj6 gj6Var = (gj6) sl1.k0(((kj6) x2aVar).j().k);
                if (gj6Var == null) {
                    return 0;
                }
                return gj6Var.a;
            default:
                return ((f37) sl1.j0(((rj8) x2aVar).m().a)).a;
        }
    }

    public final void f(int i, int i2) {
        int i3 = this.a;
        x2a x2aVar = this.c;
        switch (i3) {
            case 0:
                ((qg6) x2aVar).m(i, i2, true);
                return;
            case 1:
                ((kj6) x2aVar).m(i, i2, true);
                return;
            default:
                rj8 rj8Var = (rj8) x2aVar;
                float p = rj8Var.p();
                float f = nae.e;
                if (p != nae.e) {
                    f = i2 / p;
                }
                rj8Var.v(i, f, true);
                return;
        }
    }
}
