package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oh7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class oh7 implements nu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tu1 b;
    public final /* synthetic */ tu1 c;

    public /* synthetic */ oh7(tu1 tu1Var, tu1 tu1Var2, int i) {
        this.a = i;
        this.b = tu1Var;
        this.c = tu1Var2;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        boolean z2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = 16;
        tu1 tu1Var = this.c;
        tu1 tu1Var2 = this.b;
        jj8 jj8Var = (jj8) obj;
        int intValue = ((Integer) obj2).intValue();
        rv4 rv4Var = (rv4) obj3;
        int intValue2 = ((Integer) obj4).intValue();
        switch (i) {
            case 0:
                jj8Var.getClass();
                if ((intValue2 & 48) == 0) {
                    if (rv4Var.d(intValue)) {
                        i2 = 32;
                    }
                    intValue2 |= i2;
                }
                if ((intValue2 & Token.TARGET) != 144) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue2 & 1, z)) {
                    if (intValue != 0) {
                        if (intValue != 1) {
                            rv4Var.e0(-1307036619);
                            rv4Var.q(false);
                        } else {
                            rv4Var.e0(650573214);
                            tu1Var.invoke(rv4Var, 0);
                            rv4Var.q(false);
                        }
                    } else {
                        rv4Var.e0(650571780);
                        tu1Var2.invoke(rv4Var, 0);
                        rv4Var.q(false);
                    }
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                jj8Var.getClass();
                if ((intValue2 & 48) == 0) {
                    if (rv4Var.d(intValue)) {
                        i2 = 32;
                    }
                    intValue2 |= i2;
                }
                if ((intValue2 & Token.TARGET) != 144) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var.U(intValue2 & 1, z2)) {
                    if (intValue != 0) {
                        if (intValue != 1) {
                            rv4Var.e0(-1310713983);
                            rv4Var.q(false);
                        } else {
                            rv4Var.e0(1343191250);
                            tu1Var.invoke(rv4Var, 0);
                            rv4Var.q(false);
                        }
                    } else {
                        rv4Var.e0(1343189816);
                        tu1Var2.invoke(rv4Var, 0);
                        rv4Var.q(false);
                    }
                } else {
                    rv4Var.X();
                }
                return pvcVar;
        }
    }
}
