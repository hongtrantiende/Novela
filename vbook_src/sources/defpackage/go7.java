package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: go7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class go7 implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ hu4 E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ xt4 f;

    public /* synthetic */ go7(nq7 nq7Var, dt8 dt8Var, float f, boolean z, ti8 ti8Var, boolean z2, xt4 xt4Var, tu1 tu1Var, int i) {
        this.a = 2;
        this.e = nq7Var;
        this.C = dt8Var;
        this.d = f;
        this.b = z;
        this.D = ti8Var;
        this.c = z2;
        this.f = xt4Var;
        this.E = tu1Var;
        this.F = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.F;
        hu4 hu4Var = this.E;
        Object obj3 = this.D;
        Object obj4 = this.C;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(i2 | 1);
                xoe.c(this.b, this.c, this.d, (List) obj5, this.f, (xt4) obj4, (xt4) obj3, (vt4) hu4Var, (rv4) obj, p);
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(i2 | 1);
                xoe.b(this.b, this.c, this.d, (List) obj5, this.f, (xt4) obj4, (xt4) obj3, (vt4) hu4Var, (rv4) obj, p2);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p3 = xoe.p(i2 | 1);
                hre.a((nq7) obj5, (dt8) obj4, this.d, this.b, (ti8) obj3, this.c, this.f, (tu1) hu4Var, (rv4) obj, p3);
                return pvcVar;
        }
    }

    public /* synthetic */ go7(boolean z, boolean z2, float f, List list, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, vt4 vt4Var, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = z2;
        this.d = f;
        this.e = list;
        this.f = xt4Var;
        this.C = xt4Var2;
        this.D = xt4Var3;
        this.E = vt4Var;
        this.F = i;
    }
}
