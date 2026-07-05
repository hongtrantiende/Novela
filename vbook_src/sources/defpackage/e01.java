package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e01  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class e01 implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ hu4 F;
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e01(vt4 vt4Var, nq7 nq7Var, boolean z, wea weaVar, wz0 wz0Var, rh8 rh8Var, mu4 mu4Var, int i, int i2) {
        this.e = vt4Var;
        this.f = nq7Var;
        this.b = z;
        this.C = weaVar;
        this.D = wz0Var;
        this.E = rh8Var;
        this.F = mu4Var;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        pvc pvcVar = pvc.a;
        Object obj3 = this.E;
        Object obj4 = this.D;
        hu4 hu4Var = this.F;
        Object obj5 = this.C;
        Object obj6 = this.f;
        Object obj7 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(i2 | 1);
                nmd.j((vt4) obj7, (nq7) obj6, this.b, (wea) obj5, (wz0) obj4, (rh8) obj3, (mu4) hu4Var, (rv4) obj, p, this.d);
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(1);
                jsc.f(this.b, (String) obj7, (String) obj6, this.c, this.d, (List) obj5, (io5) obj4, (xt4) obj3, (xt4) hu4Var, (rv4) obj, p2);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p3 = xoe.p(i2 | 1);
                fxe.h((String) obj7, (nq7) obj6, this.b, (tu1) obj5, (mu4) hu4Var, (mu4) obj4, (tu1) obj3, (rv4) obj, p3, this.d);
                return pvcVar;
        }
    }

    public /* synthetic */ e01(String str, nq7 nq7Var, boolean z, tu1 tu1Var, mu4 mu4Var, mu4 mu4Var2, tu1 tu1Var2, int i, int i2) {
        this.e = str;
        this.f = nq7Var;
        this.b = z;
        this.C = tu1Var;
        this.F = mu4Var;
        this.D = mu4Var2;
        this.E = tu1Var2;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ e01(boolean z, String str, String str2, int i, int i2, List list, io5 io5Var, xt4 xt4Var, xt4 xt4Var2, int i3) {
        this.b = z;
        this.e = str;
        this.f = str2;
        this.c = i;
        this.d = i2;
        this.C = list;
        this.D = io5Var;
        this.E = xt4Var;
        this.F = xt4Var2;
    }
}
