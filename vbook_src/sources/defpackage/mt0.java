package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mt0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mt0 implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ hu4 E;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ vt4 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ mt0(g08 g08Var, boolean z, vt4 vt4Var, vt4 vt4Var2, boolean z2, vt4 vt4Var3, vt4 vt4Var4, int i) {
        this.f = g08Var;
        this.b = z;
        this.c = vt4Var;
        this.C = vt4Var2;
        this.d = z2;
        this.D = vt4Var3;
        this.E = vt4Var4;
        this.e = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.e;
        hu4 hu4Var = this.E;
        Object obj3 = this.C;
        Object obj4 = this.D;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(i2 | 1);
                pt0.a((hv9) obj5, this.b, this.c, (tu1) obj3, (nq7) obj4, this.d, (lu4) hu4Var, (rv4) obj, p);
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(i2 | 1);
                ese.i((g08) obj5, this.b, this.c, (vt4) obj3, this.d, (vt4) obj4, (vt4) hu4Var, (rv4) obj, p2);
                return pvcVar;
            default:
                ((Integer) obj2).intValue();
                int p3 = xoe.p(i2 | 1);
                hbe.N(this.b, (List) obj5, this.d, (nq7) obj4, (rh8) obj3, this.c, (vt4) hu4Var, (rv4) obj, p3);
                return pvcVar;
        }
    }

    public /* synthetic */ mt0(hv9 hv9Var, boolean z, vt4 vt4Var, tu1 tu1Var, nq7 nq7Var, boolean z2, lu4 lu4Var, int i) {
        this.f = hv9Var;
        this.b = z;
        this.c = vt4Var;
        this.C = tu1Var;
        this.D = nq7Var;
        this.d = z2;
        this.E = lu4Var;
        this.e = i;
    }

    public /* synthetic */ mt0(boolean z, List list, boolean z2, nq7 nq7Var, rh8 rh8Var, vt4 vt4Var, vt4 vt4Var2, int i) {
        this.b = z;
        this.f = list;
        this.d = z2;
        this.D = nq7Var;
        this.C = rh8Var;
        this.c = vt4Var;
        this.E = vt4Var2;
        this.e = i;
    }
}
