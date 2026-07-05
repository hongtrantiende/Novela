package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xv0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class xv0 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ xt4 c;

    public /* synthetic */ xv0(List list, xt4 xt4Var, int i) {
        this.a = i;
        this.b = list;
        this.c = xt4Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        xt4 xt4Var = this.c;
        List list = this.b;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((yf6) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(1 & intValue, z)) {
                    yf2.f(0, xt4Var, rv4Var, null, list);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        uia uiaVar = (uia) list.get(i2);
                        tu1 E = jce.E(-302072060, new sj(uiaVar, 16), rv4Var2);
                        boolean f = rv4Var2.f(xt4Var) | rv4Var2.f(uiaVar);
                        Object P = rv4Var2.P();
                        if (f || P == ax1.a) {
                            P = new u93(22, xt4Var, uiaVar);
                            rv4Var2.o0(P);
                        }
                        iue.f(E, null, null, (vt4) P, rv4Var2, 6, 30);
                    }
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
