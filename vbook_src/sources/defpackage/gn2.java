package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gn2  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gn2 implements xt4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gn2(int i, String str, int i2, xt4 xt4Var) {
        this.b = i;
        this.c = str;
        this.d = i2;
        this.e = xt4Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj2 = this.e;
        final int i2 = this.d;
        final String str = this.c;
        switch (i) {
            case 0:
                gk2 gk2Var = (gk2) obj2;
                nm nmVar = (nm) obj;
                nmVar.getClass();
                ((cne) gk2Var.c).getClass();
                nmVar.j(0, Long.valueOf(this.b));
                ((cne) gk2Var.c).getClass();
                nmVar.j(1, Long.valueOf(i2));
                nmVar.g(2, str);
                return pvcVar;
            default:
                final xt4 xt4Var = (xt4) obj2;
                vf6 vf6Var = (vf6) obj;
                vf6Var.getClass();
                vf6.A(vf6Var, this.b, new si7(13), null, new tu1(new nu4() { // from class: yj7
                    @Override // defpackage.nu4
                    public final Object h(Object obj3, Object obj4, Object obj5, Object obj6) {
                        boolean z;
                        boolean z2;
                        int i3;
                        int intValue = ((Integer) obj4).intValue();
                        rv4 rv4Var = (rv4) obj5;
                        int intValue2 = ((Integer) obj6).intValue();
                        ((yf6) obj3).getClass();
                        if ((intValue2 & 48) == 0) {
                            if (rv4Var.d(intValue)) {
                                i3 = 32;
                            } else {
                                i3 = 16;
                            }
                            intValue2 |= i3;
                        }
                        boolean z3 = false;
                        boolean z4 = true;
                        if ((intValue2 & Token.TARGET) != 144) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (rv4Var.U(intValue2 & 1, z)) {
                            if (intValue == i2) {
                                z2 = true;
                            } else {
                                z2 = true;
                                z4 = false;
                            }
                            xt4 xt4Var2 = xt4Var;
                            boolean f = rv4Var.f(xt4Var2);
                            int i4 = intValue2 & Token.ASSIGN_MOD;
                            if (i4 == 32) {
                                z3 = z2;
                            }
                            boolean z5 = f | z3;
                            Object P = rv4Var.P();
                            if (z5 || P == ax1.a) {
                                P = new tp0(xt4Var2, intValue, 9);
                                rv4Var.o0(P);
                            }
                            jsc.j(str, intValue, z4, (vt4) P, rv4Var, i4);
                        } else {
                            rv4Var.X();
                        }
                        return pvc.a;
                    }
                }, true, 1703519865), 12);
                return pvcVar;
        }
    }

    public /* synthetic */ gn2(gk2 gk2Var, int i, int i2, String str) {
        this.e = gk2Var;
        this.b = i;
        this.d = i2;
        this.c = str;
    }
}
