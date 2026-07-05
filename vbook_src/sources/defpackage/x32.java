package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x32  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class x32 implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ hu4 D;
    public final /* synthetic */ hu4 E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ nq7 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ x32(hv9 hv9Var, boolean z, vt4 vt4Var, tu1 tu1Var, nq7 nq7Var, lu4 lu4Var, boolean z2, oz7 oz7Var, int i) {
        this.f = hv9Var;
        this.b = z;
        this.C = vt4Var;
        this.D = tu1Var;
        this.c = nq7Var;
        this.E = lu4Var;
        this.d = z2;
        this.F = oz7Var;
        this.e = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.e;
        Object obj3 = this.F;
        hu4 hu4Var = this.E;
        hu4 hu4Var2 = this.D;
        Object obj4 = this.C;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(i2 | 1);
                lpe.c(this.b, this.d, (List) obj5, (rh8) obj4, this.c, (xt4) hu4Var2, (xt4) hu4Var, (xt4) obj3, (rv4) obj, p);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(i2 | 1);
                vz7.b((hv9) obj5, this.b, (vt4) obj4, (tu1) hu4Var2, this.c, (lu4) hu4Var, this.d, (oz7) obj3, (rv4) obj, p2);
                return pvcVar;
        }
    }

    public /* synthetic */ x32(boolean z, boolean z2, List list, rh8 rh8Var, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, int i) {
        this.b = z;
        this.d = z2;
        this.f = list;
        this.C = rh8Var;
        this.c = nq7Var;
        this.D = xt4Var;
        this.E = xt4Var2;
        this.F = xt4Var3;
        this.e = i;
    }
}
