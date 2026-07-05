package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xe1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xe1 extends xu4 implements lu4 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xe1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v13, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v14, types: [jm4, ez5, java.lang.Object] */
    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        wzc wzcVar;
        boolean b;
        boolean b2;
        int i = this.a;
        ai6 ai6Var = null;
        boolean z = true;
        int i2 = 0;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                String str = (String) obj;
                List list = (List) obj2;
                str.getClass();
                list.getClass();
                ng1 ng1Var = (ng1) this.receiver;
                ng1Var.getClass();
                if (((cg1) ng1Var.C.getValue()).o && (wzcVar = ng1Var.H) != null) {
                    hk1 a = jdd.a(ng1Var);
                    sw2 sw2Var = ab3.a;
                    ng1Var.f(a, ru2.c, new mg1(wzcVar, str, ng1Var, list, null));
                }
                return pvcVar;
            case 1:
                ((tb2) this.receiver).getClass();
                return tb2.a((String) obj, (String) obj2);
            case 2:
                ((tb2) this.receiver).getClass();
                return tb2.a((String) obj, (String) obj2);
            case 3:
                m42 m42Var = (m42) obj2;
                ((xt4) this.receiver).invoke(new Float(((Number) obj).floatValue()));
                return pvcVar;
            case 4:
                m42 m42Var2 = (m42) obj2;
                ((xt4) this.receiver).invoke(new Float(((Number) obj).floatValue()));
                return pvcVar;
            case 5:
                String str2 = (String) obj;
                String str3 = (String) obj2;
                str2.getClass();
                str3.getClass();
                ((i44) this.receiver).j(str2, str3);
                return pvcVar;
            case 6:
                dn4 dn4Var = (dn4) obj;
                dn4 dn4Var2 = (dn4) obj2;
                fn4 fn4Var = (fn4) this.receiver;
                if (fn4Var.J && (b = dn4Var2.b()) != dn4Var.b()) {
                    if (b) {
                        ?? obj3 = new Object();
                        iue.R(fn4Var, new hg(15, obj3, fn4Var));
                        ai6 ai6Var2 = (ai6) obj3.a;
                        if (ai6Var2 != null) {
                            ai6Var2.a();
                            ai6Var = ai6Var2;
                        }
                        fn4Var.N = ai6Var;
                    } else {
                        ai6 ai6Var3 = fn4Var.N;
                        if (ai6Var3 != null) {
                            ai6Var3.b();
                        }
                        fn4Var.N = null;
                    }
                }
                return pvcVar;
            case 7:
                dn4 dn4Var3 = (dn4) obj;
                dn4 dn4Var4 = (dn4) obj2;
                mn4 mn4Var = (mn4) this.receiver;
                if (mn4Var.J && (b2 = dn4Var4.b()) != dn4Var3.b()) {
                    xt4 xt4Var = mn4Var.N;
                    if (xt4Var != null) {
                        xt4Var.invoke(Boolean.valueOf(b2));
                    }
                    hq7 hq7Var = pn4.K;
                    if (b2) {
                        z87.v(mn4Var.v1(), null, null, new o54(mn4Var, (m42) null, 3), 3);
                        ?? obj4 = new Object();
                        iue.R(mn4Var, new u93(15, obj4, mn4Var));
                        ai6 ai6Var4 = (ai6) obj4.a;
                        if (ai6Var4 != null) {
                            ai6Var4.a();
                        } else {
                            ai6Var4 = null;
                        }
                        mn4Var.P = ai6Var4;
                        i38 i38Var = mn4Var.Q;
                        if (i38Var != null && i38Var.E1().J && mn4Var.J) {
                            dae.l(mn4Var, hq7Var);
                        }
                    } else {
                        ai6 ai6Var5 = mn4Var.P;
                        if (ai6Var5 != null) {
                            ai6Var5.b();
                        }
                        mn4Var.P = null;
                        if (mn4Var.J) {
                            dae.l(mn4Var, hq7Var);
                        }
                    }
                    ak0.t(mn4Var);
                    yu7 yu7Var = mn4Var.M;
                    if (yu7Var != null) {
                        jm4 jm4Var = mn4Var.O;
                        if (b2) {
                            if (jm4Var != null) {
                                mn4Var.K1(yu7Var, new km4(jm4Var));
                                mn4Var.O = null;
                            }
                            ?? obj5 = new Object();
                            mn4Var.K1(yu7Var, obj5);
                            mn4Var.O = obj5;
                        } else if (jm4Var != null) {
                            mn4Var.K1(yu7Var, new km4(jm4Var));
                            mn4Var.O = null;
                        }
                    }
                }
                return pvcVar;
            case 8:
                o9a o9aVar = (o9a) obj;
                int intValue = ((Number) obj2).intValue();
                o9aVar.getClass();
                m46 m46Var = (m46) this.receiver;
                m46Var.getClass();
                z = (o9aVar.j(intValue) || !o9aVar.i(intValue).c()) ? false : false;
                m46Var.b = z;
                return Boolean.valueOf(z);
            case 9:
                int intValue2 = ((Number) obj).intValue();
                int intValue3 = ((Number) obj2).intValue();
                nk6 nk6Var = (nk6) this.receiver;
                kj kjVar = nk6Var.e;
                int[] iArr = new int[intValue3];
                if (((gk6) nk6Var.d.getValue()).j.X(intValue2)) {
                    b00.h0(intValue2, 0, 6, iArr);
                } else {
                    kjVar.i(intValue2 + intValue3);
                    int q = kjVar.q(intValue2);
                    if (q != -2 && q != -1) {
                        if (q < 0) {
                            ov5.a("Expected positive lane number, got " + q + " instead.");
                        }
                        i2 = Math.min(q, intValue3);
                    }
                    int i3 = i2 - 1;
                    int i4 = intValue2;
                    while (true) {
                        if (-1 < i3) {
                            i4 = kjVar.j(i4, i3);
                            iArr[i3] = i4;
                            if (i4 == -1) {
                                b00.h0(-1, i3, 2, iArr);
                            } else {
                                i3--;
                            }
                        }
                    }
                    iArr[i2] = intValue2;
                    for (int i5 = i2 + 1; i5 < intValue3; i5++) {
                        intValue2++;
                        int length = kjVar.a + ((int[]) kjVar.b).length;
                        while (true) {
                            if (intValue2 < length) {
                                if (kjVar.c(intValue2, i5)) {
                                    break;
                                }
                                intValue2++;
                            } else {
                                intValue2 = kjVar.a + ((int[]) kjVar.b).length;
                            }
                        }
                        iArr[i5] = intValue2;
                    }
                }
                return iArr;
            case 10:
                return ((ss8) this.receiver).n().L0(((Number) obj).intValue(), (m42) obj2);
            case 11:
                return ((ar8) this.receiver).b(((Number) obj).intValue(), (m42) obj2);
            case 12:
                String str4 = (String) obj;
                String str5 = (String) obj2;
                str4.getClass();
                str5.getClass();
                szc szcVar = (szc) this.receiver;
                szcVar.getClass();
                hk1 a2 = jdd.a(szcVar);
                sw2 sw2Var2 = ab3.a;
                szcVar.f(a2, ru2.c, new xr0(szcVar, str5, str4, (m42) null, 19));
                return pvcVar;
            case 13:
                ((ubd) this.receiver).r(((Number) obj).longValue(), ((Number) obj2).longValue());
                return pvcVar;
            case 14:
                ((ubd) this.receiver).r(((Number) obj).longValue(), ((Number) obj2).longValue());
                return pvcVar;
            default:
                ((ubd) this.receiver).r(((Number) obj).longValue(), ((Number) obj2).longValue());
                return pvcVar;
        }
    }
}
