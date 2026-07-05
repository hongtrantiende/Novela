package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z42  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class z42 implements lu4 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z42(long j, String str, oyb oybVar, yya yyaVar) {
        this.b = j;
        this.c = str;
        this.d = oybVar;
        this.e = yyaVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        zc6 zc6Var;
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                zc6 zc6Var2 = (zc6) obj5;
                wl9 wl9Var = (wl9) obj4;
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long t = uaf.t(zc6Var2.j(), zc6Var2.a, wl9Var.a, floatValue, this.b);
                cza czaVar = (cza) ((a52) obj3).c;
                do {
                    value = czaVar.getValue();
                    zc6Var = (zc6) value;
                } while (!czaVar.l(value, zc6.c(zc6Var, 0L, nae.e, null, 0L, null, null, yz1.x(y78.j(zc6Var.g, t), zc6Var.e(), zc6Var.h()), yz1.t(floatValue, zc6Var.i()), null, null, 7999)));
                wl9Var.a = floatValue;
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                ube.h((String) obj5, (String) obj4, this.b, (nq7) obj3, (rv4) obj, xoe.p(3073));
                return pvcVar;
            default:
                String str = (String) obj5;
                oyb oybVar = (oyb) obj4;
                yya yyaVar = (yya) obj3;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    gv9 a = ev9.a(lz.a, kh5.G, rv4Var, 48);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l = rv4Var.l();
                    kq7 kq7Var = kq7.a;
                    nq7 p = lye.p(rv4Var, kq7Var);
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
                    ar5 c = rp5.c((wk3) jk3.e.getValue(), rv4Var, 0);
                    nq7 t2 = tte.t(pna.n(kq7Var, 16.0f), ((Number) yyaVar.getValue()).floatValue());
                    long j = this.b;
                    nk5.a(c, null, t2, j, rv4Var, 48, 0);
                    xbe.i(rv4Var, pna.s(kq7Var, 8.0f));
                    cvb.c(str, null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, oybVar, rv4Var, 0, 24576, 114682);
                    rv4Var.q(true);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ z42(zc6 zc6Var, wl9 wl9Var, long j, a52 a52Var) {
        this.c = zc6Var;
        this.d = wl9Var;
        this.b = j;
        this.e = a52Var;
    }

    public /* synthetic */ z42(String str, String str2, long j, nq7 nq7Var, int i) {
        this.c = str;
        this.d = str2;
        this.b = j;
        this.e = nq7Var;
    }
}
