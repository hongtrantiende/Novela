package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lp7  reason: default package */
/* loaded from: classes3.dex */
public final class lp7 implements nu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ aw7 e;

    public /* synthetic */ lp7(List list, String str, xt4 xt4Var, aw7 aw7Var, int i) {
        this.a = i;
        this.b = list;
        this.c = str;
        this.d = xt4Var;
        this.e = aw7Var;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        int i4;
        int i5 = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.e;
        Object obj5 = ax1.a;
        kq7 kq7Var = kq7.a;
        String str = this.c;
        List list = this.b;
        int i6 = 2;
        xt4 xt4Var = this.d;
        switch (i5) {
            case 0:
                Object obj6 = (xg6) obj;
                int intValue = ((Number) obj2).intValue();
                rv4 rv4Var = (rv4) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (rv4Var.f(obj6)) {
                        i6 = 4;
                    }
                    i = intValue2 | i6;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (rv4Var.d(intValue)) {
                        i2 = 32;
                    } else {
                        i2 = 16;
                    }
                    i |= i2;
                }
                if ((i & Token.EXPR_VOID) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(i & 1, z)) {
                    vmc vmcVar = (vmc) list.get(intValue);
                    rv4Var.e0(-1064498060);
                    rv4Var.e0(-1973998032);
                    String str2 = vmcVar.b;
                    String str3 = vmcVar.a;
                    if (str2.length() == 0) {
                        str2 = str3;
                    }
                    if (str2.length() == 0) {
                        str2 = yqe.A((y3b) v1b.j0.getValue(), rv4Var);
                    }
                    String str4 = str2;
                    rv4Var.q(false);
                    boolean equals = str3.equals(str);
                    nq7 f = pna.f(kq7Var, 1.0f);
                    Boolean valueOf = Boolean.valueOf(equals);
                    boolean f2 = rv4Var.f(xt4Var) | rv4Var.h(vmcVar);
                    Object P = rv4Var.P();
                    if (f2 || P == obj5) {
                        P = new kp7(xt4Var, vmcVar, aw7Var, 0);
                        rv4Var.o0(P);
                    }
                    iue.g(str4, null, null, valueOf, f, (vt4) P, rv4Var, 24576, 6);
                    rv4Var.q(false);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                xg6 xg6Var = (xg6) obj;
                int intValue3 = ((Number) obj2).intValue();
                rv4 rv4Var2 = (rv4) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    if (rv4Var2.f(xg6Var)) {
                        i6 = 4;
                    }
                    i3 = intValue4 | i6;
                } else {
                    i3 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (rv4Var2.d(intValue3)) {
                        i4 = 32;
                    } else {
                        i4 = 16;
                    }
                    i3 |= i4;
                }
                if ((i3 & Token.EXPR_VOID) != 146) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(i3 & 1, z2)) {
                    vmc vmcVar2 = (vmc) list.get(intValue3);
                    rv4Var2.e0(283232042);
                    rv4Var2.e0(-406502214);
                    String str5 = vmcVar2.b;
                    String str6 = vmcVar2.a;
                    if (str5.length() == 0) {
                        str5 = str6;
                    }
                    if (str5.length() == 0) {
                        str5 = yqe.A((y3b) v1b.j0.getValue(), rv4Var2);
                    }
                    String str7 = str5;
                    rv4Var2.q(false);
                    boolean equals2 = str6.equals(str);
                    nq7 f3 = pna.f(kq7Var, 1.0f);
                    Boolean valueOf2 = Boolean.valueOf(equals2);
                    boolean f4 = rv4Var2.f(xt4Var) | rv4Var2.h(vmcVar2);
                    Object P2 = rv4Var2.P();
                    if (f4 || P2 == obj5) {
                        P2 = new kp7(xt4Var, vmcVar2, aw7Var, 1);
                        rv4Var2.o0(P2);
                    }
                    iue.g(str7, null, null, valueOf2, f3, (vt4) P2, rv4Var2, 24576, 6);
                    rv4Var2.q(false);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
