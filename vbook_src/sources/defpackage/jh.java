package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jh  reason: default package */
/* loaded from: classes.dex */
public final class jh extends fb6 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jh(int i, int i2, hu4 hu4Var, Object obj) {
        super(2);
        this.a = i2;
        this.b = obj;
        this.c = hu4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                int intValue = ((Number) obj).intValue();
                b8a b8aVar = (b8a) obj2;
                kh khVar = (kh) obj3;
                if (!((c8a) obj4).b.c(b8aVar.f)) {
                    khVar.h(intValue, b8aVar);
                    khVar.e();
                }
                return pvcVar;
            case 1:
                ((Number) obj2).intValue();
                zt3.a((tkc) obj4, (vt4) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 2:
                ((Number) obj2).intValue();
                dpe.a((tm3) obj4, (tu1) obj3, (rv4) obj, 49);
                return pvcVar;
            case 3:
                rv4 rv4Var = (rv4) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue2 & 1, z)) {
                    Boolean bool = (Boolean) ((ud6) obj4).g.getValue();
                    boolean booleanValue = bool.booleanValue();
                    lu4 lu4Var = (lu4) obj3;
                    rv4Var.h0(bool);
                    boolean g = rv4Var.g(booleanValue);
                    if (booleanValue) {
                        lu4Var.invoke(rv4Var, 0);
                    } else {
                        if (rv4Var.l != 0) {
                            ex1.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!rv4Var.S) {
                            if (!g) {
                                rv4Var.W();
                            } else {
                                aqa aqaVar = rv4Var.G;
                                int i2 = aqaVar.g;
                                int i3 = aqaVar.h;
                                bx1 bx1Var = rv4Var.M;
                                bx1Var.getClass();
                                bx1Var.d(false);
                                bx1Var.b.d.p(ld8.c);
                                xwe.c(i2, rv4Var.s, i3);
                                rv4Var.G.t();
                            }
                        }
                    }
                    if (rv4Var.y && rv4Var.G.i == rv4Var.z) {
                        rv4Var.z = -1;
                        rv4Var.y = false;
                    }
                    rv4Var.q(false);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 4:
                k61 k61Var = (k61) obj;
                p15 p15Var = (p15) obj2;
                i38 i38Var = (i38) obj4;
                od6 od6Var = i38Var.O;
                if (od6Var.K()) {
                    i38Var.j0 = k61Var;
                    i38Var.i0 = p15Var;
                    yg8 snapshotObserver = ((rg) rd6.a(od6Var)).getSnapshotObserver();
                    qs9 qs9Var = i38.p0;
                    snapshotObserver.a.d(i38Var, vt3.I, (f38) obj3);
                    i38Var.m0 = false;
                } else {
                    i38Var.m0 = true;
                }
                return pvcVar;
            default:
                ((Number) obj2).intValue();
                pha.a((nq7) obj4, (tu1) obj3, (rv4) obj, xoe.p(49));
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jh(int i, Object obj, Object obj2) {
        super(2);
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
