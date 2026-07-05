package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ru1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ru1 implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ru1(int i, tu1 tu1Var, tu1 tu1Var2, lu4 lu4Var, lu4 lu4Var2, iw7 iw7Var, lu4 lu4Var3) {
        this.a = 6;
        this.b = i;
        this.c = tu1Var;
        this.d = tu1Var2;
        this.e = lu4Var;
        this.f = lu4Var2;
        this.C = iw7Var;
        this.D = lu4Var3;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        int i2 = this.b;
        Object obj3 = this.D;
        Object obj4 = this.C;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        pvc pvcVar = pvc.a;
        Object obj8 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((tu1) obj8).m(this.d, this.e, this.f, this.C, this.D, (rv4) obj, xoe.p(i2) | 1);
                return pvcVar;
            case 1:
                ((Integer) obj2).intValue();
                vqe.e((amc) obj8, (l54) obj7, (nq7) obj6, (vt4) obj5, (vt4) obj4, (vt4) obj3, (rv4) obj, xoe.p(i2 | 1));
                return pvcVar;
            case 2:
                ((Integer) obj2).getClass();
                iue.h((tu1) obj8, (lu4) obj7, (lu4) obj6, (Boolean) obj5, (nq7) obj4, (vt4) obj3, (rv4) obj, xoe.p(i2 | 1));
                return pvcVar;
            case 3:
                ((Integer) obj2).getClass();
                do5.c((String) obj8, (String) obj7, (String) obj6, (String) obj5, (w22) obj4, (nq7) obj3, (rv4) obj, xoe.p(i2 | 1));
                return pvcVar;
            case 4:
                ((Integer) obj2).getClass();
                wq9.a((String) obj8, (String) obj7, (String) obj6, (List) obj5, this.b, (nq7) obj4, (vt4) obj3, (rv4) obj, xoe.p(196609));
                return pvcVar;
            case 5:
                ((Integer) obj2).getClass();
                ipe.n((String) obj8, (String) obj7, (List) obj6, (List) obj5, (nq7) obj4, (lu4) obj3, (rv4) obj, xoe.p(i2 | 1));
                return pvcVar;
            case 6:
                tu1 tu1Var = (tu1) obj8;
                tu1 tu1Var2 = (tu1) obj7;
                lu4 lu4Var = (lu4) obj6;
                lu4 lu4Var2 = (lu4) obj5;
                iw7 iw7Var = (iw7) obj4;
                lu4 lu4Var3 = (lu4) obj3;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    mwe.e(this.b, tu1Var, tu1Var2, lu4Var, lu4Var2, iw7Var, lu4Var3, rv4Var, 0);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 7:
                ((Integer) obj2).getClass();
                mwe.e(this.b, (tu1) obj8, (tu1) obj7, (lu4) obj6, (lu4) obj5, (qid) obj4, (lu4) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                kxe.i((List) obj8, (String) obj7, (nq7) obj6, (xt4) obj5, (vt4) obj4, (xt4) obj3, (rv4) obj, xoe.p(i2 | 1));
                return pvcVar;
        }
    }

    public /* synthetic */ ru1(int i, tu1 tu1Var, tu1 tu1Var2, lu4 lu4Var, lu4 lu4Var2, qid qidVar, lu4 lu4Var3, int i2) {
        this.a = 7;
        this.b = i;
        this.c = tu1Var;
        this.d = tu1Var2;
        this.e = lu4Var;
        this.f = lu4Var2;
        this.C = qidVar;
        this.D = lu4Var3;
    }

    public /* synthetic */ ru1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.C = obj5;
        this.D = obj6;
        this.b = i;
    }

    public /* synthetic */ ru1(String str, String str2, String str3, List list, int i, nq7 nq7Var, vt4 vt4Var, int i2) {
        this.a = 4;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = list;
        this.b = i;
        this.C = nq7Var;
        this.D = vt4Var;
    }
}
