package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lha  reason: default package */
/* loaded from: classes.dex */
public final class lha implements yy6 {
    public final /* synthetic */ yy6 a;
    public final m82 b;
    public sc6 e;
    public sc6 f;
    public final hm8 c = yae.z(Boolean.FALSE);
    public final ik d = new ik(this, 25);
    public final hm8 C = yae.z(new ArrayList());
    public final qra D = new qra();

    public lha(yy6 yy6Var, m82 m82Var) {
        this.a = yy6Var;
        this.b = m82Var;
    }

    public static iha c(Object obj, rv4 rv4Var) {
        rv4Var.e0(800730162);
        rv4Var.e0(-148945892);
        boolean f = rv4Var.f(obj);
        Object P = rv4Var.P();
        if (f || P == ax1.a) {
            P = new iha(obj);
            rv4Var.o0(P);
        }
        iha ihaVar = (iha) P;
        ihaVar.b.setValue(fha.a);
        rv4Var.q(false);
        rv4Var.q(false);
        return ihaVar;
    }

    public static nq7 d(lha lhaVar, nq7 nq7Var, iha ihaVar, qr qrVar) {
        eu3 g = zt3.g(null, 3);
        lz3 i = zt3.i(null, 3);
        u22 u22Var = r0f.C;
        nk0 nk0Var = kh5.e;
        tv7 tv7Var = pha.c;
        Object g2 = tv7Var.g(u22Var);
        if (g2 == null) {
            g2 = new tv7();
            tv7Var.n(u22Var, g2);
        }
        tv7 tv7Var2 = (tv7) g2;
        Object g3 = tv7Var2.g(nk0Var);
        if (g3 == null) {
            g3 = new Object();
            tv7Var2.n(nk0Var, g3);
        }
        hha.a.getClass();
        mha mhaVar = pha.b;
        lhaVar.getClass();
        return lye.j(lye.j(nq7Var, new mj3(ihaVar, qrVar.a(), (xt4) co9.C, lhaVar, false, mhaVar)), new kha(qrVar, g, i, ihaVar, (nz9) g3));
    }

    public static nq7 e(lha lhaVar, nq7 nq7Var, iha ihaVar, qr qrVar) {
        hha.a.getClass();
        mha mhaVar = pha.b;
        lhaVar.getClass();
        return lye.j(nq7Var, new mj3(ihaVar, qrVar.a(), (xt4) co9.D, lhaVar, true, mhaVar));
    }

    @Override // defpackage.yy6
    public final sc6 a(sc6 sc6Var) {
        return this.a.a(sc6Var);
    }

    public final boolean b() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    public final void f() {
        Collection<jga> values = this.D.d().c.values();
        boolean z = false;
        for (jga jgaVar : values) {
            if (!z && (!jgaVar.a() || !jgaVar.d())) {
                z = false;
            } else {
                z = true;
            }
            jgaVar.e();
        }
        if (z != b()) {
            this.c.setValue(Boolean.valueOf(z));
            if (!z) {
                for (jga jgaVar2 : values) {
                    if (jgaVar2.c().size() > 1) {
                        List c = jgaVar2.c();
                        int i = lga.a;
                        int size = c.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            if (((kga) c.get(i2)).d().b()) {
                                break;
                            }
                        }
                    }
                    kl9 kl9Var = jgaVar2.c;
                    kl9Var.f = zya.a;
                    kl9Var.a = ((em8) kl9Var.e).h();
                    ((hm8) kl9Var.d).setValue(t28.a);
                }
            }
        }
    }

    @Override // defpackage.yy6
    public final long g(sc6 sc6Var, sc6 sc6Var2) {
        return this.a.g(sc6Var, sc6Var2);
    }
}
