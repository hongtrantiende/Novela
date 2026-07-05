package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fo7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fo7 implements lu4 {
    public final /* synthetic */ hu4 C;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fo7(nq7 nq7Var, dt8 dt8Var, float f, boolean z, xt4 xt4Var, tu1 tu1Var, int i) {
        this.e = nq7Var;
        this.f = dt8Var;
        this.b = f;
        this.c = z;
        this.d = xt4Var;
        this.C = tu1Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        hu4 hu4Var = this.C;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                List list = (List) obj4;
                xt4 xt4Var = (xt4) obj3;
                vt4 vt4Var = (vt4) hu4Var;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    xoe.e(this.c, this.b, list, pna.f(kq7.a, 1.0f), this.d, xt4Var, vt4Var, rv4Var, 3072);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                n4f.d((nq7) obj4, (dt8) obj3, this.b, this.c, this.d, (tu1) hu4Var, (rv4) obj, xoe.p(1572865));
                return pvcVar;
        }
    }

    public /* synthetic */ fo7(boolean z, float f, List list, xt4 xt4Var, xt4 xt4Var2, vt4 vt4Var) {
        this.c = z;
        this.b = f;
        this.e = list;
        this.d = xt4Var;
        this.f = xt4Var2;
        this.C = vt4Var;
    }
}
