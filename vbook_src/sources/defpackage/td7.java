package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: td7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class td7 implements lu4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ lu4 b;
    public final /* synthetic */ aw7 c;
    public final /* synthetic */ aw7 d;
    public final /* synthetic */ xt4 e;

    public /* synthetic */ td7(lu4 lu4Var, xt4 xt4Var, aw7 aw7Var, aw7 aw7Var2) {
        this.b = lu4Var;
        this.e = xt4Var;
        this.c = aw7Var;
        this.d = aw7Var2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj3 = ax1.a;
        boolean z2 = true;
        boolean z3 = false;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                }
                if (rv4Var.U(intValue & 1, z3)) {
                    final lu4 lu4Var = this.b;
                    boolean f = rv4Var.f(lu4Var);
                    final xt4 xt4Var = this.e;
                    boolean f2 = f | rv4Var.f(xt4Var);
                    Object P = rv4Var.P();
                    if (f2 || P == obj3) {
                        final aw7 aw7Var = this.c;
                        final aw7 aw7Var2 = this.d;
                        P = new vt4() { // from class: vd7
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i2 = r5;
                                pvc pvcVar2 = pvc.a;
                                aw7 aw7Var3 = aw7Var2;
                                aw7 aw7Var4 = aw7Var;
                                xt4 xt4Var2 = xt4Var;
                                lu4 lu4Var2 = lu4Var;
                                switch (i2) {
                                    case 0:
                                        Boolean bool = (Boolean) aw7Var4.getValue();
                                        bool.booleanValue();
                                        lu4Var2.invoke(bool, (List) aw7Var3.getValue());
                                        xt4Var2.invoke(Boolean.FALSE);
                                        return pvcVar2;
                                    default:
                                        lu4Var2.invoke((String) aw7Var4.getValue(), (String) aw7Var3.getValue());
                                        xt4Var2.invoke(Boolean.FALSE);
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var.o0(P);
                    }
                    nmd.j((vt4) P, null, false, null, null, null, owe.a, rv4Var, 805306368, 510);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var2.U(intValue2 & 1, z)) {
                    final aw7 aw7Var3 = this.c;
                    boolean j0 = k4b.j0((String) aw7Var3.getValue());
                    final aw7 aw7Var4 = this.d;
                    if (j0 || ((String) aw7Var4.getValue()).length() < 6) {
                        z2 = false;
                    }
                    final lu4 lu4Var2 = this.b;
                    final xt4 xt4Var2 = this.e;
                    boolean f3 = rv4Var2.f(xt4Var2) | rv4Var2.f(lu4Var2) | rv4Var2.f(aw7Var3) | rv4Var2.f(aw7Var4);
                    Object P2 = rv4Var2.P();
                    if (f3 || P2 == obj3) {
                        Object obj4 = new vt4() { // from class: vd7
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i2 = r5;
                                pvc pvcVar2 = pvc.a;
                                aw7 aw7Var32 = aw7Var4;
                                aw7 aw7Var42 = aw7Var3;
                                xt4 xt4Var22 = xt4Var2;
                                lu4 lu4Var22 = lu4Var2;
                                switch (i2) {
                                    case 0:
                                        Boolean bool = (Boolean) aw7Var42.getValue();
                                        bool.booleanValue();
                                        lu4Var22.invoke(bool, (List) aw7Var32.getValue());
                                        xt4Var22.invoke(Boolean.FALSE);
                                        return pvcVar2;
                                    default:
                                        lu4Var22.invoke((String) aw7Var42.getValue(), (String) aw7Var32.getValue());
                                        xt4Var22.invoke(Boolean.FALSE);
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var2.o0(obj4);
                        P2 = obj4;
                    }
                    nmd.j((vt4) P2, null, z2, null, null, null, dxe.a, rv4Var2, 805306368, 506);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ td7(lu4 lu4Var, aw7 aw7Var, aw7 aw7Var2, xt4 xt4Var) {
        this.b = lu4Var;
        this.c = aw7Var;
        this.d = aw7Var2;
        this.e = xt4Var;
    }
}
