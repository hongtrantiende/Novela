package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aw0  reason: default package */
/* loaded from: classes3.dex */
public final class aw0 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aw0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                return new i25(((i25) ((c8) obj4).invoke((lg6) obj, ((List) obj3).get(((Number) obj2).intValue()))).a);
            case 1:
                rv4 rv4Var = (rv4) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && rv4Var.E()) {
                    rv4Var.X();
                } else {
                    i62.b((nq7) obj4, jce.E(-1630443845, new g62((zc2) obj3, 0), rv4Var), rv4Var, 48);
                }
                return pvcVar;
            case 2:
                rv4 rv4Var2 = (rv4) obj;
                yya yyaVar = (yya) obj3;
                if ((((Number) obj2).intValue() & 3) == 2 && rv4Var2.E()) {
                    rv4Var2.X();
                } else {
                    aw7 D = yae.D((wc2) obj4, rv4Var2);
                    nq7 n = pna.n(kq7.a, 20.0f);
                    rv4Var2.e0(-1633490746);
                    boolean f = rv4Var2.f(D) | rv4Var2.f(yyaVar);
                    Object P = rv4Var2.P();
                    if (f || P == ax1.a) {
                        P = new k0(24, D, yyaVar);
                        rv4Var2.o0(P);
                    }
                    rv4Var2.q(false);
                    fu0.a(ote.s(n, (xt4) P), rv4Var2, 0);
                }
                return pvcVar;
            case 3:
                return new i25(((i25) ((pg2) obj4).invoke((lg6) obj, ((List) obj3).get(((Number) obj2).intValue()))).a);
            case 4:
                return new i25(((i25) ((tsa) obj4).invoke((lg6) obj, ((List) obj3).get(((Number) obj2).intValue()))).a);
            case 5:
                return new i25(((i25) ((tsa) obj4).invoke((lg6) obj, ((List) obj3).get(((Number) obj2).intValue()))).a);
            default:
                int intValue = ((Number) obj2).intValue();
                return new i25(((i25) ((gjb) obj4).c((lg6) obj, Integer.valueOf(intValue), ((List) obj3).get(intValue))).a);
        }
    }
}
