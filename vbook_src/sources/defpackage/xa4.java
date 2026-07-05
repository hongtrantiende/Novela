package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xa4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xa4 implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xa4(vt4 vt4Var, nq7 nq7Var, boolean z, wea weaVar, wz0 wz0Var, a01 a01Var, rh8 rh8Var, int i) {
        this.d = vt4Var;
        this.e = nq7Var;
        this.b = z;
        this.f = weaVar;
        this.C = wz0Var;
        this.D = a01Var;
        this.c = rh8Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj3 = this.D;
        Object obj4 = this.C;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.c;
        Object obj8 = this.d;
        switch (i) {
            case 0:
                kj6 kj6Var = (kj6) obj8;
                rh8 rh8Var = (rh8) obj7;
                jz jzVar = (jz) obj6;
                lk0 lk0Var = (lk0) obj5;
                li4 li4Var = (li4) obj4;
                xt4 xt4Var = (xt4) obj3;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(1 & intValue, z)) {
                    jce.d(pna.c, kj6Var, rh8Var, false, jzVar, lk0Var, li4Var, this.b, null, xt4Var, rv4Var, 6, 256);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                nmd.b((vt4) obj8, (nq7) obj6, this.b, (wea) obj5, (wz0) obj4, (a01) obj3, (rh8) obj7, (rv4) obj, xoe.p(805306417));
                return pvcVar;
            case 2:
                ((Integer) obj2).getClass();
                uaf.g(this.b, (ff1) obj8, (nq7) obj7, (xt4) obj3, (xt4) obj6, (vt4) obj5, (xt4) obj4, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 3:
                ((Integer) obj2).getClass();
                p1d.e((wzc) obj8, (String) obj7, (List) obj6, this.b, (xt4) obj3, (vt4) obj5, (nq7) obj4, (rv4) obj, xoe.p(9));
                return pvcVar;
            case 4:
                ((Integer) obj2).getClass();
                ase.n((qfc) obj8, (a6b) obj7, this.b, (p71) obj6, (f81) obj5, (c81) obj4, (vt4) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                iue.F((xy4) obj8, (lid) obj7, (String) obj6, (rq9) obj5, (String) obj4, this.b, (rq9) obj3, (rv4) obj, xoe.p(24577));
                return pvcVar;
        }
    }

    public /* synthetic */ xa4(xy4 xy4Var, lid lidVar, String str, rq9 rq9Var, String str2, boolean z, rq9 rq9Var2, int i) {
        this.d = xy4Var;
        this.c = lidVar;
        this.e = str;
        this.f = rq9Var;
        this.C = str2;
        this.b = z;
        this.D = rq9Var2;
    }

    public /* synthetic */ xa4(kj6 kj6Var, rh8 rh8Var, jz jzVar, lk0 lk0Var, li4 li4Var, boolean z, xt4 xt4Var) {
        this.d = kj6Var;
        this.c = rh8Var;
        this.e = jzVar;
        this.f = lk0Var;
        this.C = li4Var;
        this.b = z;
        this.D = xt4Var;
    }

    public /* synthetic */ xa4(qfc qfcVar, a6b a6bVar, boolean z, p71 p71Var, f81 f81Var, c81 c81Var, vt4 vt4Var, int i) {
        this.d = qfcVar;
        this.c = a6bVar;
        this.b = z;
        this.e = p71Var;
        this.f = f81Var;
        this.C = c81Var;
        this.D = vt4Var;
    }

    public /* synthetic */ xa4(wzc wzcVar, String str, List list, boolean z, xt4 xt4Var, vt4 vt4Var, nq7 nq7Var, int i) {
        this.d = wzcVar;
        this.c = str;
        this.e = list;
        this.b = z;
        this.D = xt4Var;
        this.f = vt4Var;
        this.C = nq7Var;
    }

    public /* synthetic */ xa4(boolean z, ff1 ff1Var, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, vt4 vt4Var, xt4 xt4Var3, int i) {
        this.b = z;
        this.d = ff1Var;
        this.c = nq7Var;
        this.D = xt4Var;
        this.e = xt4Var2;
        this.f = vt4Var;
        this.C = xt4Var3;
    }
}
