package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ne7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ne7 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ aw7 c;

    public /* synthetic */ ne7(boolean z, aw7 aw7Var, int i) {
        this.a = i;
        this.b = z;
        this.c = aw7Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        kq7 kq7Var = kq7.a;
        lh9 lh9Var = ax1.a;
        aw7 aw7Var = this.c;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(1 & intValue, z)) {
                    Object P = rv4Var.P();
                    if (P == lh9Var) {
                        P = s21.e(rv4Var);
                    }
                    zm4 zm4Var = (zm4) P;
                    Object P2 = rv4Var.P();
                    if (P2 == lh9Var) {
                        P2 = new sr3(zm4Var, null, 4);
                        rv4Var.o0(P2);
                    }
                    yte.g((lu4) P2, rv4Var, zm4Var);
                    jub jubVar = (jub) aw7Var.getValue();
                    t86 t86Var = new t86(0, 0, Token.ELSE);
                    v72 v72Var = ((h27) rv4Var.j(j27.a)).c.b;
                    nq7 n = mwe.n(pna.f(kq7Var, 1.0f), zm4Var);
                    Object P3 = rv4Var.P();
                    if (P3 == lh9Var) {
                        P3 = new d07(aw7Var, 20);
                        rv4Var.o0(P3);
                    }
                    uwe.g(jubVar, (xt4) P3, n, false, null, fxe.d, null, null, this.b, null, t86Var, null, true, 0, 0, v72Var, null, rv4Var, 1572912, 12779520, 6119352);
                    xbe.i(rv4Var, pna.h(kq7Var, 12.0f));
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(1 & intValue2, z2)) {
                    Object P4 = rv4Var2.P();
                    if (P4 == lh9Var) {
                        P4 = s21.e(rv4Var2);
                    }
                    zm4 zm4Var2 = (zm4) P4;
                    Object P5 = rv4Var2.P();
                    if (P5 == lh9Var) {
                        P5 = new sr3(zm4Var2, null, 5);
                        rv4Var2.o0(P5);
                    }
                    yte.g((lu4) P5, rv4Var2, zm4Var2);
                    jub jubVar2 = (jub) aw7Var.getValue();
                    t86 t86Var2 = new t86(0, 0, Token.ELSE);
                    v72 v72Var2 = ((h27) rv4Var2.j(j27.a)).c.b;
                    nq7 n2 = mwe.n(pna.f(kq7Var, 1.0f), zm4Var2);
                    Object P6 = rv4Var2.P();
                    if (P6 == lh9Var) {
                        P6 = new d07(aw7Var, 21);
                        rv4Var2.o0(P6);
                    }
                    uwe.g(jubVar2, (xt4) P6, n2, false, null, hxe.d, null, null, this.b, null, t86Var2, null, true, 0, 0, v72Var2, null, rv4Var2, 1572912, 12779520, 6119352);
                    xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
