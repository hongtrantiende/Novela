package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gt0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gt0 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gt0(int i, xt4 xt4Var, m82 m82Var, lq lqVar) {
        this.a = 0;
        this.b = i;
        this.c = xt4Var;
        this.d = m82Var;
        this.e = lqVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i;
        boolean z;
        int i2 = this.a;
        pvc pvcVar = pvc.a;
        fvb fvbVar = null;
        Object obj2 = this.e;
        Object obj3 = this.c;
        int i3 = this.b;
        Object obj4 = this.d;
        switch (i2) {
            case 0:
                xt4 xt4Var = (xt4) obj3;
                m82 m82Var = (m82) obj4;
                lq lqVar = (lq) obj2;
                ef2 ef2Var = (ef2) obj;
                ef2Var.getClass();
                int round = Math.round(ef2Var.b());
                int i4 = i3 - 1;
                if (round < 0) {
                    round = 0;
                }
                if (round <= i4) {
                    i4 = round;
                }
                xt4Var.invoke(Integer.valueOf(i4));
                z87.v(ef2Var.a, null, null, new ze2(ef2Var, i4, null), 3);
                z87.v(m82Var, null, null, new ot0(lqVar, null, 0), 3);
                return pvcVar;
            case 1:
                wy5 wy5Var = (wy5) obj4;
                gv7 gv7Var = (gv7) obj2;
                if (obj != ((h23) obj3)) {
                    if (obj instanceof iza) {
                        int i5 = wy5Var.a - i3;
                        int d = gv7Var.d(obj);
                        if (d >= 0) {
                            i = gv7Var.c[d];
                        } else {
                            i = Integer.MAX_VALUE;
                        }
                        gv7Var.g(Math.min(i5, i), obj);
                        return pvcVar;
                    }
                    return pvcVar;
                }
                vs.k("A derived state calculation cannot read itself");
                return null;
            case 2:
                v95 v95Var = (v95) obj3;
                e37 e37Var = (e37) obj4;
                mw8 mw8Var = (mw8) obj2;
                lw8 lw8Var = (lw8) obj;
                int i6 = v95Var.b;
                zsb zsbVar = v95Var.a;
                ikc ikcVar = v95Var.c;
                gvb gvbVar = (gvb) v95Var.d.invoke();
                if (gvbVar != null) {
                    fvbVar = gvbVar.a;
                }
                fvb fvbVar2 = fvbVar;
                if (e37Var.getLayoutDirection() == tc6.b) {
                    z = true;
                } else {
                    z = false;
                }
                zsbVar.a(ff8.b, kxe.k(lw8Var, i6, ikcVar, fvbVar2, z, mw8Var.a), i3, mw8Var.a);
                lw8.z(lw8Var, mw8Var, Math.round(-zsbVar.a.h()), 0);
                return pvcVar;
            default:
                List list = (List) obj4;
                ri6 ri6Var = (ri6) obj;
                ri6Var.getClass();
                ri6Var.z(list.size(), null, new pj7(6, list), new tu1(new to7(list, i3, (xt4) obj3, (aw7) obj2), true, 2039820996));
                return pvcVar;
        }
    }

    public /* synthetic */ gt0(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }

    public /* synthetic */ gt0(List list, int i, xt4 xt4Var, aw7 aw7Var) {
        this.a = 3;
        this.d = list;
        this.b = i;
        this.c = xt4Var;
        this.e = aw7Var;
    }
}
