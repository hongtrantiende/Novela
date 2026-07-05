package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oi1  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class oi1 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw7 b;
    public final /* synthetic */ aw7 c;

    public /* synthetic */ oi1(aw7 aw7Var, aw7 aw7Var2, int i) {
        this.a = i;
        this.b = aw7Var;
        this.c = aw7Var2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        float f;
        po5 po5Var;
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.c;
        aw7 aw7Var2 = this.b;
        switch (i) {
            case 0:
                aw7Var2.setValue(na5.a((na5) aw7Var2.getValue(), nae.e, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), nae.e, 9));
                ((xt4) aw7Var.getValue()).invoke((na5) aw7Var2.getValue());
                return pvcVar;
            case 1:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    kq7 kq7Var = kq7.a;
                    float f2 = 1.0f;
                    nq7 f3 = hl5.f(kq7Var, 4.0f, rv4Var, kq7Var, 1.0f);
                    gv9 a = ev9.a(new hz(12.0f, true, new vs(2)), kh5.F, rv4Var, 6);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l = rv4Var.l();
                    nq7 p = lye.p(rv4Var, f3);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(qw1.f, rv4Var, a);
                    jce.F(qw1.e, rv4Var, l);
                    jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var);
                    jce.F(qw1.d, rv4Var, p);
                    String A = yqe.A((y3b) s2b.J.getValue(), rv4Var);
                    String str = (String) aw7Var2.getValue();
                    if (1.0f <= 0.0d) {
                        jv5.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    } else {
                        f = 1.0f;
                    }
                    we6 we6Var = new we6(f, true);
                    boolean f4 = rv4Var.f(aw7Var2);
                    Object P = rv4Var.P();
                    lh9 lh9Var = ax1.a;
                    if (f4 || P == lh9Var) {
                        P = new zn3(aw7Var2, 15);
                        rv4Var.o0(P);
                    }
                    bze.a(A, str, we6Var, (xt4) P, rv4Var, 0);
                    String A2 = yqe.A((y3b) s2b.K.getValue(), rv4Var);
                    String str2 = (String) aw7Var.getValue();
                    if (1.0f <= 0.0d) {
                        jv5.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f2 = Float.MAX_VALUE;
                    }
                    we6 we6Var2 = new we6(f2, true);
                    boolean f5 = rv4Var.f(aw7Var);
                    Object P2 = rv4Var.P();
                    if (f5 || P2 == lh9Var) {
                        P2 = new zn3(aw7Var, 16);
                        rv4Var.o0(P2);
                    }
                    bze.a(A2, str2, we6Var2, (xt4) P2, rv4Var, 0);
                    rv4Var.q(true);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 2:
                y78 y78Var = (y78) obj;
                vh8 vh8Var = (vh8) obj2;
                vh8Var.getClass();
                if (vh8Var instanceof po5) {
                    po5Var = (po5) vh8Var;
                } else {
                    po5Var = null;
                }
                aw7Var2.setValue(po5Var);
                if (po5Var == null) {
                    y78Var = null;
                }
                aw7Var.setValue(y78Var);
                return pvcVar;
            case 3:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                str3.getClass();
                str4.getClass();
                aw7Var2.setValue(str3);
                aw7Var.setValue(str4);
                return pvcVar;
            case 4:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                Boolean bool2 = (Boolean) obj2;
                bool2.getClass();
                aw7Var2.setValue(bool);
                aw7Var.setValue(bool2);
                return pvcVar;
            case 5:
                String str5 = (String) obj;
                String str6 = (String) obj2;
                str5.getClass();
                str6.getClass();
                aw7Var2.setValue(str5);
                aw7Var.setValue(str6);
                return pvcVar;
            default:
                String str7 = (String) obj;
                String str8 = (String) obj2;
                str7.getClass();
                str8.getClass();
                aw7Var2.setValue(str7);
                aw7Var.setValue(str8);
                return pvcVar;
        }
    }
}
