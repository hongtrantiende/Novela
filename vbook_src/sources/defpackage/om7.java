package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: om7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class om7 implements lu4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ hu4 e;
    public final /* synthetic */ hu4 f;

    public /* synthetic */ om7(float f, int i, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, int i2) {
        this.b = f;
        this.c = i;
        this.d = nq7Var;
        this.e = xt4Var;
        this.f = xt4Var2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        hu4 hu4Var = this.f;
        hu4 hu4Var2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ctd.r(this.b, this.c, (nq7) obj3, (xt4) hu4Var2, (xt4) hu4Var, (rv4) obj, xoe.p(385));
                return pvcVar;
            case 1:
                final tu1 tu1Var = (tu1) obj3;
                final lu4 lu4Var = (lu4) hu4Var2;
                final tu1 tu1Var2 = (tu1) hu4Var;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(1 & intValue, z)) {
                    k2a u = rte.u(rv4Var);
                    Object P = rv4Var.P();
                    lh9 lh9Var = ax1.a;
                    if (P == lh9Var) {
                        P = yte.s(rv4Var);
                        rv4Var.o0(P);
                    }
                    m82 m82Var = (m82) P;
                    boolean f = rv4Var.f(u) | rv4Var.f(m82Var);
                    Object P2 = rv4Var.P();
                    if (f || P2 == lh9Var) {
                        P2 = new y2a(u, m82Var);
                        rv4Var.o0(P2);
                    }
                    final y2a y2aVar = (y2a) P2;
                    nq7 l = tte.l(y7a.c(rte.q(pna.w(pna.f(kq7.a, 1.0f), kh5.d, false), u, 14), false, new az9(23)));
                    final float f2 = this.b;
                    final int i2 = this.c;
                    boolean c = rv4Var.c(f2) | rv4Var.f(tu1Var) | rv4Var.f(lu4Var) | rv4Var.f(tu1Var2) | rv4Var.h(y2aVar) | rv4Var.d(i2);
                    Object P3 = rv4Var.P();
                    if (c || P3 == lh9Var) {
                        lu4 lu4Var2 = new lu4() { // from class: b3a
                            @Override // defpackage.lu4
                            public final Object invoke(Object obj4, Object obj5) {
                                final p6b p6bVar = (p6b) obj4;
                                final x02 x02Var = (x02) obj5;
                                p6bVar.getClass();
                                final int X0 = p6bVar.X0(f2);
                                List<w27> j0 = p6bVar.j0(ljb.a, tu1Var);
                                int i3 = 0;
                                int i4 = 0;
                                for (w27 w27Var : j0) {
                                    i4 = Math.max(i4, w27Var.j(Integer.MAX_VALUE));
                                }
                                final int i5 = i4;
                                long b = x02.b(x02Var.a, 0, 0, i5, i4, 3);
                                final ArrayList arrayList = new ArrayList(tl1.s(j0, 10));
                                for (w27 w27Var2 : j0) {
                                    arrayList.add(w27Var2.M(b));
                                }
                                int size = arrayList.size();
                                final int i6 = X0 * 2;
                                while (i3 < size) {
                                    Object obj6 = arrayList.get(i3);
                                    i3++;
                                    i6 += ((mw8) obj6).a;
                                }
                                final lu4 lu4Var3 = lu4Var;
                                final y2a y2aVar2 = y2aVar;
                                final int i7 = i2;
                                final tu1 tu1Var3 = tu1Var2;
                                return p6bVar.q0(i6, i5, ls3.a, new xt4() { // from class: c3a
                                    @Override // defpackage.xt4
                                    public final Object invoke(Object obj7) {
                                        int i8;
                                        int i9;
                                        boolean z2;
                                        boolean z3;
                                        lw8 lw8Var = (lw8) obj7;
                                        lw8Var.getClass();
                                        ArrayList arrayList2 = new ArrayList();
                                        ArrayList arrayList3 = arrayList;
                                        int size2 = arrayList3.size();
                                        int i10 = X0;
                                        int i11 = i10;
                                        int i12 = 0;
                                        while (i12 < size2) {
                                            Object obj8 = arrayList3.get(i12);
                                            i12++;
                                            mw8 mw8Var = (mw8) obj8;
                                            lw8.z(lw8Var, mw8Var, i11, 0);
                                            arrayList2.add(new kjb(lw8Var.y0(i11), lw8Var.y0(mw8Var.a)));
                                            i11 += mw8Var.a;
                                        }
                                        ljb ljbVar = ljb.b;
                                        p6b p6bVar2 = p6bVar;
                                        Iterator it = p6bVar2.j0(ljbVar, lu4Var3).iterator();
                                        while (true) {
                                            boolean hasNext = it.hasNext();
                                            i8 = i6;
                                            i9 = i5;
                                            if (!hasNext) {
                                                break;
                                            }
                                            mw8 M = ((w27) it.next()).M(x02.b(x02Var.a, i8, i8, 0, 0, 8));
                                            lw8.z(lw8Var, M, 0, i9 - M.b);
                                        }
                                        for (w27 w27Var3 : p6bVar2.j0(ljb.c, new tu1(new f58(7, tu1Var3, arrayList2), true, 1917359634))) {
                                            if (i8 >= 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            if (i9 >= 0) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            if (!(z2 & z3)) {
                                                nv5.a("width and height must be >= 0");
                                            }
                                            lw8.z(lw8Var, w27Var3.M(y02.h(i8, i8, i9, i9)), 0, 0);
                                        }
                                        y2a y2aVar3 = y2aVar2;
                                        k2a k2aVar = y2aVar3.a;
                                        Integer num = y2aVar3.c;
                                        int i13 = i7;
                                        if (num == null || num.intValue() != i13) {
                                            y2aVar3.c = Integer.valueOf(i13);
                                            kjb kjbVar = (kjb) sl1.f0(i13, arrayList2);
                                            if (kjbVar != null) {
                                                kjb kjbVar2 = (kjb) sl1.j0(arrayList2);
                                                int X02 = p6bVar2.X0(kjbVar2.a + kjbVar2.b) + i10;
                                                int h = X02 - k2aVar.f.h();
                                                int X03 = p6bVar2.X0(kjbVar.a) - ((h / 2) - (p6bVar2.X0(kjbVar.b) / 2));
                                                int i14 = X02 - h;
                                                if (i14 < 0) {
                                                    i14 = 0;
                                                }
                                                int n = dce.n(X03, 0, i14);
                                                if (k2aVar.a.h() != n) {
                                                    z87.v(y2aVar3.b, null, null, new rr0(y2aVar3, n, (m42) null, 10), 3);
                                                }
                                            }
                                        }
                                        return pvc.a;
                                    }
                                });
                            }
                        };
                        rv4Var.o0(lu4Var2);
                        P3 = lu4Var2;
                    }
                    k6b.a(l, (lu4) P3, rv4Var, 0, 0);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                rgc.f((nq7) obj3, this.b, (lu4) hu4Var2, (tu1) hu4Var, (rv4) obj, xoe.p(this.c | 1));
                return pvcVar;
        }
    }

    public /* synthetic */ om7(float f, tu1 tu1Var, lu4 lu4Var, tu1 tu1Var2, int i) {
        this.b = f;
        this.d = tu1Var;
        this.e = lu4Var;
        this.f = tu1Var2;
        this.c = i;
    }

    public /* synthetic */ om7(nq7 nq7Var, float f, lu4 lu4Var, tu1 tu1Var, int i) {
        this.d = nq7Var;
        this.b = f;
        this.e = lu4Var;
        this.f = tu1Var;
        this.c = i;
    }
}
