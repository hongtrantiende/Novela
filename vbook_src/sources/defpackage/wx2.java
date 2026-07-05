package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wx2  reason: default package */
/* loaded from: classes.dex */
public final class wx2 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wx2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.a;
        boolean z = true;
        pvc pvcVar = pvc.a;
        Object obj4 = this.b;
        switch (i2) {
            case 0:
                long j = ((zl1) obj).a;
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    if (rv4Var.e(j)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue |= i;
                }
                if ((intValue & 19) == 18) {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    xx2.b(((uob) obj4).c, j, rv4Var, (intValue << 3) & Token.ASSIGN_MOD);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Number) obj3).intValue();
                zc2 zc2Var = (zc2) obj4;
                ((hv9) obj).getClass();
                if ((intValue2 & 17) == 16 && rv4Var2.E()) {
                    rv4Var2.X();
                } else {
                    rv4Var2.e0(5004770);
                    boolean f = rv4Var2.f(zc2Var);
                    Object P = rv4Var2.P();
                    Object obj5 = ax1.a;
                    if (f || P == obj5) {
                        P = new e62(zc2Var, 5);
                        rv4Var2.o0(P);
                    }
                    rv4Var2.q(false);
                    mwe.a((vt4) P, null, false, null, hv1.e, rv4Var2, 196608, 30);
                    rv4Var2.e0(5004770);
                    boolean f2 = rv4Var2.f(zc2Var);
                    Object P2 = rv4Var2.P();
                    if (f2 || P2 == obj5) {
                        P2 = new e62(zc2Var, 6);
                        rv4Var2.o0(P2);
                    }
                    rv4Var2.q(false);
                    mwe.a((vt4) P2, null, !((Boolean) zc2Var.m.getValue()).booleanValue(), null, hv1.f, rv4Var2, 196608, 26);
                }
                return pvcVar;
            default:
                String str = ((pm0) obj).a;
                apa apaVar = (apa) obj2;
                String str2 = (String) obj3;
                str.getClass();
                apaVar.getClass();
                str2.getClass();
                ((zl0) obj4).d(str, apaVar, str2);
                return pvcVar;
        }
    }
}
