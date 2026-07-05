package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j43  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class j43 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k23 b;
    public final /* synthetic */ v43 c;
    public final /* synthetic */ rh8 d;
    public final /* synthetic */ xt4 e;

    public /* synthetic */ j43(k23 k23Var, v43 v43Var, rh8 rh8Var, xt4 xt4Var, int i) {
        this.a = i;
        this.b = k23Var;
        this.c = v43Var;
        this.d = rh8Var;
        this.e = xt4Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        String str;
        boolean z;
        String str2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        lh9 lh9Var = ax1.a;
        kq7 kq7Var = kq7.a;
        final xt4 xt4Var = this.e;
        v43 v43Var = this.c;
        final k23 k23Var = this.b;
        switch (i) {
            case 0:
                boolean z2 = false;
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((yf6) obj).getClass();
                if ((intValue & 17) != 16) {
                    z2 = true;
                }
                if (rv4Var.U(intValue & 1, z2)) {
                    String str3 = k23Var.b;
                    String str4 = k23Var.d;
                    String str5 = k23Var.e;
                    String str6 = k23Var.c;
                    boolean z3 = k23Var.m;
                    String str7 = v43Var.b;
                    if (str7 == null) {
                        str = "";
                    } else {
                        str = str7;
                    }
                    String str8 = v43Var.h;
                    nq7 f = pna.f(kq7Var, 1.0f);
                    boolean f2 = rv4Var.f(xt4Var) | rv4Var.h(k23Var);
                    Object P = rv4Var.P();
                    if (f2 || P == lh9Var) {
                        P = new vt4() { // from class: l43
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i2 = r3;
                                pvc pvcVar2 = pvc.a;
                                k23 k23Var2 = k23Var;
                                xt4 xt4Var2 = xt4Var;
                                switch (i2) {
                                    case 0:
                                        xt4Var2.invoke(k23Var2.j);
                                        return pvcVar2;
                                    default:
                                        xt4Var2.invoke(k23Var2.j);
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var.o0(P);
                    }
                    nqe.e(str3, str4, str5, str6, z3, str, str8, this.d, f, (vt4) P, rv4Var, 100663296);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((yf6) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var2.U(intValue2 & 1, z)) {
                    String str9 = k23Var.b;
                    String str10 = k23Var.d;
                    String str11 = k23Var.e;
                    String str12 = k23Var.c;
                    boolean z4 = k23Var.m;
                    String str13 = v43Var.b;
                    if (str13 == null) {
                        str2 = "";
                    } else {
                        str2 = str13;
                    }
                    String str14 = v43Var.h;
                    nq7 f3 = pna.f(kq7Var, 1.0f);
                    boolean f4 = rv4Var2.f(xt4Var) | rv4Var2.h(k23Var);
                    Object P2 = rv4Var2.P();
                    if (f4 || P2 == lh9Var) {
                        P2 = new vt4() { // from class: l43
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i2 = r3;
                                pvc pvcVar2 = pvc.a;
                                k23 k23Var2 = k23Var;
                                xt4 xt4Var2 = xt4Var;
                                switch (i2) {
                                    case 0:
                                        xt4Var2.invoke(k23Var2.j);
                                        return pvcVar2;
                                    default:
                                        xt4Var2.invoke(k23Var2.j);
                                        return pvcVar2;
                                }
                            }
                        };
                        rv4Var2.o0(P2);
                    }
                    nqe.e(str9, str10, str11, str12, z4, str2, str14, this.d, f3, (vt4) P2, rv4Var2, 100663296);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
