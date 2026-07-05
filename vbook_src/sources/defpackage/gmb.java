package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gmb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gmb implements xt4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ zl0 c;
    public final /* synthetic */ xl0 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ gmb(qo3 qo3Var, String str, List list, loa loaVar, boolean z, xl0 xl0Var, String str2, ppb ppbVar, zl0 zl0Var) {
        this.e = qo3Var;
        this.f = str;
        this.D = list;
        this.E = loaVar;
        this.b = z;
        this.d = xl0Var;
        this.C = str2;
        this.F = ppbVar;
        this.c = zl0Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int length;
        boolean z;
        boolean z2;
        Integer num;
        Iterable iterable;
        Object obj2;
        tva tvaVar;
        pva pvaVar;
        cq6 bq6Var;
        fxb d;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj3 = this.F;
        Object obj4 = this.E;
        Object obj5 = this.D;
        Object obj6 = this.C;
        Object obj7 = this.f;
        Object obj8 = this.e;
        switch (i) {
            case 0:
                xve.f((qo3) obj8, (String) obj7, (List) obj5, (loa) obj4, this.b, this.d, (String) obj6, (ppb) obj3, this.c, ((Integer) obj).intValue());
                return pvcVar;
            default:
                dub dubVar = (dub) obj8;
                uo3 uo3Var = (uo3) obj7;
                yya yyaVar = (yya) obj6;
                ym0 ym0Var = (ym0) obj4;
                aw7 aw7Var = (aw7) obj3;
                y78 y78Var = (y78) obj;
                fvb fvbVar = (fvb) ((aw7) obj5).getValue();
                if (fvbVar != null) {
                    length = fvbVar.b.g(y78Var.a);
                } else {
                    length = dubVar.d().d.length();
                }
                so3 e = uo3Var.e();
                String str = e.b;
                int i2 = 1;
                if (str != null && (d = ym0Var.d(str)) != null && !fxb.d(d.a)) {
                    z = true;
                } else {
                    z = false;
                }
                if (e.d != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean d2 = e.d();
                String str2 = null;
                if (fvbVar != null) {
                    CharSequence charSequence = dubVar.d().d;
                    if (charSequence.length() <= 0 || charSequence.charAt(0) != 8203) {
                        i2 = 0;
                    }
                    int length2 = charSequence.length() - i2;
                    if (length2 < 0) {
                        length2 = 0;
                    }
                    num = Integer.valueOf(dce.n(length - i2, 0, length2));
                } else {
                    num = null;
                }
                if (this.b) {
                    iterable = (List) yyaVar.getValue();
                } else {
                    iterable = ks3.a;
                }
                iterable.getClass();
                if (!z2 && !d2 && !z && num != null) {
                    int intValue = num.intValue();
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            iyb iybVar = (iyb) obj2;
                            if (!(iybVar.c instanceof pva) || iybVar.a > intValue || intValue >= iybVar.b) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    iyb iybVar2 = (iyb) obj2;
                    if (iybVar2 != null) {
                        tvaVar = iybVar2.c;
                    } else {
                        tvaVar = null;
                    }
                    if (tvaVar instanceof pva) {
                        pvaVar = (pva) tvaVar;
                    } else {
                        pvaVar = null;
                    }
                    if (pvaVar != null) {
                        String obj9 = k4b.N0(pvaVar.a).toString();
                        if (obj9.length() == 0) {
                            bq6Var = new aq6();
                        } else {
                            if (!k4b.V(obj9, "://", false)) {
                                obj9 = "https://".concat(obj9);
                            }
                            bq6Var = new bq6(obj9);
                        }
                        str2 = bq6Var.a();
                    }
                }
                xt4 xt4Var = (xt4) aw7Var.getValue();
                if (str2 != null && xt4Var != null) {
                    xt4Var.invoke(str2);
                } else {
                    frb g = dubVar.g();
                    try {
                        g.g(sze.a(length, length));
                        dubVar.b(g);
                        dubVar.c();
                        this.c.e(this.d.a);
                    } catch (Throwable th) {
                        dubVar.c();
                        throw th;
                    }
                }
                return pvcVar;
        }
    }

    public /* synthetic */ gmb(dub dubVar, uo3 uo3Var, boolean z, yya yyaVar, zl0 zl0Var, xl0 xl0Var, aw7 aw7Var, ym0 ym0Var, aw7 aw7Var2) {
        this.e = dubVar;
        this.f = uo3Var;
        this.b = z;
        this.C = yyaVar;
        this.c = zl0Var;
        this.d = xl0Var;
        this.D = aw7Var;
        this.E = ym0Var;
        this.F = aw7Var2;
    }
}
