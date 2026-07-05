package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class q7 implements nu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q7(cz7 cz7Var, m82 m82Var, iw2 iw2Var, rj8 rj8Var) {
        this.a = 7;
        this.d = cz7Var;
        this.c = m82Var;
        this.e = iw2Var;
        this.b = rj8Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        int i;
        cz7 cz7Var = (cz7) this.d;
        m82 m82Var = (m82) this.c;
        iw2 iw2Var = (iw2) this.e;
        rj8 rj8Var = (rj8) this.b;
        int intValue = ((Integer) obj2).intValue();
        rv4 rv4Var = (rv4) obj3;
        int intValue2 = ((Integer) obj4).intValue();
        ((jj8) obj).getClass();
        if ((intValue2 & 48) == 0) {
            if (rv4Var.d(intValue)) {
                i = 32;
            } else {
                i = 16;
            }
            intValue2 |= i;
        }
        if ((intValue2 & Token.TARGET) != 144) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue2 & 1, z)) {
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue != 3) {
                            rv4Var.e0(-793301784);
                            rv4Var.q(false);
                        } else {
                            rv4Var.e0(-793391715);
                            hud.h(cz7Var, rv4Var, 0);
                            rv4Var.q(false);
                        }
                    } else {
                        rv4Var.e0(-793628617);
                        dce.b(cz7Var, rj8Var, rv4Var, 0);
                        rv4Var.q(false);
                    }
                } else {
                    rv4Var.e0(-793747781);
                    hu7.b(cz7Var, rv4Var, 0);
                    rv4Var.q(false);
                }
            } else {
                rv4Var.e0(-794166529);
                boolean h = rv4Var.h(m82Var) | rv4Var.f(iw2Var);
                Object P = rv4Var.P();
                if (h || P == ax1.a) {
                    P = new e07(m82Var, iw2Var, 0);
                    rv4Var.o0(P);
                }
                nxe.c(cz7Var, (vt4) P, rv4Var, 0);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:324:0x0d1c  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0d8e  */
    @Override // defpackage.nu4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.Object r62, java.lang.Object r63, java.lang.Object r64, java.lang.Object r65) {
        /*
            Method dump skipped, instructions count: 3512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q7.h(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ q7(g0d g0dVar, aw7 aw7Var, aw7 aw7Var2, aw7 aw7Var3) {
        this.a = 6;
        this.c = g0dVar;
        this.b = aw7Var;
        this.e = aw7Var2;
        this.d = aw7Var3;
    }

    public /* synthetic */ q7(fdd fddVar, aw7 aw7Var, Object obj, aw7 aw7Var2, int i) {
        this.a = i;
        this.c = fddVar;
        this.b = aw7Var;
        this.d = obj;
        this.e = aw7Var2;
    }

    public /* synthetic */ q7(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }
}
