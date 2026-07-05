package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: er0  reason: default package */
/* loaded from: classes3.dex */
public final class er0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public /* synthetic */ boolean c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ er0(int i, m42 m42Var, Object obj, Object obj2, boolean z) {
        super(2, m42Var);
        this.a = i;
        this.c = z;
        this.d = obj;
        this.b = obj2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return new er0((sr0) this.d, this.c, (String) obj2, m42Var, 0);
            case 1:
                er0 er0Var = new er0((String) obj2, this.c, m42Var);
                er0Var.d = obj;
                return er0Var;
            case 2:
                return new er0((ma3) this.d, this.c, (String) obj2, m42Var, 2);
            case 3:
                return new er0(this.c, (String) obj2, (rx5) this.d, m42Var, 3);
            case 4:
                return new er0(this.c, (String) obj2, (tx5) this.d, m42Var, 4);
            case 5:
                return new er0(5, m42Var, (wzc) this.d, (aw7) obj2, this.c);
            case 6:
                return new er0(6, m42Var, (mo9) this.d, this.b, this.c);
            default:
                er0 er0Var2 = new er0((ef2) this.d, (dm8) obj2, m42Var);
                er0Var2.c = ((Boolean) obj).booleanValue();
                return er0Var2;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                ((er0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ((er0) create((pv7) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 2:
                ((er0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 3:
                ((er0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 4:
                ((er0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 5:
                ((er0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 6:
                ((er0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((er0) create(bool, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        String str;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        float f;
        int i = this.a;
        String str2 = null;
        pvc pvcVar = pvc.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                sr0 sr0Var = (sr0) this.d;
                if (this.c) {
                    str = (String) obj2;
                } else {
                    str = null;
                }
                if (str != null && !k4b.j0(str)) {
                    str2 = str;
                }
                if (!sr0Var.H || !c16.i(sr0Var.G, str2)) {
                    if (str2 == null) {
                        sr0Var.k();
                    } else {
                        sr0Var.l(str2);
                    }
                }
                return pvcVar;
            case 1:
                hre.r(obj);
                pv7 pv7Var = (pv7) this.d;
                e49 l = s9e.l((String) obj2);
                Boolean valueOf = Boolean.valueOf(this.c);
                pv7Var.getClass();
                pv7Var.f(l, valueOf);
                return pvcVar;
            case 2:
                hre.r(obj);
                ma3 ma3Var = (ma3) this.d;
                if (this.c) {
                    str2 = (String) obj2;
                }
                if (str2 == null) {
                    str2 = "";
                }
                if (!ma3Var.F || !c16.i(ma3Var.E, str2)) {
                    if (k4b.j0(str2)) {
                        ma3Var.k();
                    } else {
                        ma3Var.l(str2);
                    }
                }
                return pvcVar;
            case 3:
                rx5 rx5Var = (rx5) this.d;
                cza czaVar = rx5Var.d;
                String str3 = (String) obj2;
                hre.r(obj);
                boolean z = this.c;
                if (z && !k4b.j0(str3)) {
                    w26 w26Var = rx5Var.e;
                    if (w26Var != null) {
                        w26Var.cancel(null);
                    }
                    if (k4b.j0(str3)) {
                        if (czaVar != null) {
                            do {
                                value3 = czaVar.getValue();
                                ox5 ox5Var = (ox5) value3;
                            } while (!czaVar.l(value3, new ox5(null, 7)));
                        }
                    } else if (czaVar != null) {
                        do {
                            value2 = czaVar.getValue();
                            ox5 ox5Var2 = (ox5) value2;
                        } while (!czaVar.l(value2, new ox5(str3, 4)));
                        hk1 a = jdd.a(rx5Var);
                        sw2 sw2Var = ab3.a;
                        rx5Var.e = rx5Var.f(a, ru2.c, new c95(rx5Var, str3, (m42) null, 9));
                    } else {
                        hk1 a2 = jdd.a(rx5Var);
                        sw2 sw2Var2 = ab3.a;
                        rx5Var.e = rx5Var.f(a2, ru2.c, new c95(rx5Var, str3, (m42) null, 9));
                    }
                } else if (!z) {
                    w26 w26Var2 = rx5Var.e;
                    if (w26Var2 != null) {
                        w26Var2.cancel(null);
                    }
                    if (czaVar != null) {
                        do {
                            value = czaVar.getValue();
                            ox5 ox5Var3 = (ox5) value;
                        } while (!czaVar.l(value, new ox5(null, 7)));
                    }
                }
                return pvcVar;
            case 4:
                tx5 tx5Var = (tx5) this.d;
                cza czaVar2 = tx5Var.e;
                String str4 = (String) obj2;
                hre.r(obj);
                boolean z2 = this.c;
                if (z2 && !k4b.j0(str4)) {
                    w26 w26Var3 = tx5Var.f;
                    if (w26Var3 != null) {
                        w26Var3.cancel(null);
                    }
                    if (k4b.j0(str4)) {
                        if (czaVar2 != null) {
                            do {
                                value6 = czaVar2.getValue();
                                sx5 sx5Var = (sx5) value6;
                            } while (!czaVar2.l(value6, new sx5(null, 7)));
                        }
                    } else if (czaVar2 != null) {
                        do {
                            value5 = czaVar2.getValue();
                            sx5 sx5Var2 = (sx5) value5;
                        } while (!czaVar2.l(value5, new sx5(str4, 4)));
                        hk1 a3 = jdd.a(tx5Var);
                        sw2 sw2Var3 = ab3.a;
                        tx5Var.f = tx5Var.f(a3, ru2.c, new qq4(tx5Var, str4, null, 10));
                    } else {
                        hk1 a32 = jdd.a(tx5Var);
                        sw2 sw2Var32 = ab3.a;
                        tx5Var.f = tx5Var.f(a32, ru2.c, new qq4(tx5Var, str4, null, 10));
                    }
                } else if (!z2) {
                    w26 w26Var4 = tx5Var.f;
                    if (w26Var4 != null) {
                        w26Var4.cancel(null);
                    }
                    if (czaVar2 != null) {
                        do {
                            value4 = czaVar2.getValue();
                            sx5 sx5Var3 = (sx5) value4;
                        } while (!czaVar2.l(value4, new sx5(null, 7)));
                    }
                }
                return pvcVar;
            case 5:
                hre.r(obj);
                if (this.c) {
                    ((aw7) obj2).setValue(sl1.i0(((wzc) this.d).h, " ", null, null, null, 62));
                }
                return pvcVar;
            case 6:
                hre.r(obj);
                boolean z3 = this.c;
                mo9 mo9Var = (mo9) this.d;
                if (z3) {
                    mo9Var.r.add(obj2);
                } else {
                    mo9Var.r.remove(obj2);
                }
                return pvcVar;
            default:
                dm8 dm8Var = (dm8) obj2;
                boolean z4 = this.c;
                hre.r(obj);
                if (z4) {
                    f = 1.0f;
                } else {
                    f = nae.e;
                }
                if (f != dm8Var.h()) {
                    dm8Var.i(f);
                    ef2 ef2Var = (ef2) this.d;
                    z87.v(ef2Var.a, null, null, new ze2(ef2Var, f, null), 3);
                }
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er0(ef2 ef2Var, dm8 dm8Var, m42 m42Var) {
        super(2, m42Var);
        this.a = 7;
        this.d = ef2Var;
        this.b = dm8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ er0(fdd fddVar, boolean z, String str, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = fddVar;
        this.c = z;
        this.b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er0(String str, boolean z, m42 m42Var) {
        super(2, m42Var);
        this.a = 1;
        this.b = str;
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ er0(boolean z, String str, fdd fddVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = z;
        this.b = str;
        this.d = fddVar;
    }
}
