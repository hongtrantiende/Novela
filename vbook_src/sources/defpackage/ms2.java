package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ms2  reason: default package */
/* loaded from: classes.dex */
public final class ms2 implements az8, k67, dl3 {
    public final xfb a;
    public final y9c b;
    public final z9c c;
    public final yv d;
    public final SparseArray e;
    public rr6 f;
    public cz8 g;
    public ggb h;
    public boolean i;

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, yv] */
    public ms2(xfb xfbVar) {
        xfbVar.getClass();
        this.a = xfbVar;
        String str = a2d.a;
        Looper myLooper = Looper.myLooper();
        this.f = new rr6((myLooper == null ? Looper.getMainLooper() : myLooper).getThread());
        y9c y9cVar = new y9c();
        this.b = y9cVar;
        this.c = new z9c();
        ?? obj = new Object();
        obj.a = y9cVar;
        ms5 ms5Var = qs5.b;
        obj.b = mm9.e;
        obj.c = rm9.C;
        this.d = obj;
        this.e = new SparseArray();
    }

    @Override // defpackage.az8
    public final void A(int i, boolean z) {
        N(I(), -1, new vm1(25));
    }

    @Override // defpackage.az8
    public final void B(my8 my8Var) {
        N(I(), 12, new vm1(22));
    }

    @Override // defpackage.az8
    public final void C(yy8 yy8Var) {
        N(I(), 13, new ls2(7));
    }

    @Override // defpackage.az8
    public final void D(tb7 tb7Var) {
        N(I(), 28, new vm1(26));
    }

    @Override // defpackage.az8
    public final void E(f57 f57Var, int i) {
        N(I(), 1, new ls2(9));
    }

    @Override // defpackage.az8
    public final void F(int i, int i2) {
        N(M(), 24, new gs2(11));
    }

    @Override // defpackage.k67
    public final void G(int i, e67 e67Var, cs6 cs6Var, h57 h57Var, int i2) {
        N(L(i, e67Var), 1000, new gs2(12));
    }

    @Override // defpackage.az8
    public final void H(boolean z) {
        N(I(), 7, new vm1(27));
    }

    public final cd I() {
        return J((e67) this.d.d);
    }

    public final cd J(e67 e67Var) {
        aac aacVar;
        this.g.getClass();
        if (e67Var == null) {
            aacVar = null;
        } else {
            aacVar = (aac) ((rm9) this.d.c).get(e67Var);
        }
        if (e67Var != null && aacVar != null) {
            return K(aacVar, aacVar.g(e67Var.a, this.b).c, e67Var);
        }
        int i = ((i04) this.g).i();
        aac m = ((i04) this.g).m();
        if (i >= m.o()) {
            m = aac.a;
        }
        return K(m, i, null);
    }

    public final cd K(aac aacVar, int i, e67 e67Var) {
        e67 e67Var2;
        boolean z;
        if (aacVar.p()) {
            e67Var2 = null;
        } else {
            e67Var2 = e67Var;
        }
        this.a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (aacVar.equals(((i04) this.g).m()) && i == ((i04) this.g).i()) {
            z = true;
        } else {
            z = false;
        }
        long j = 0;
        if (e67Var2 != null && e67Var2.b()) {
            if (z && ((i04) this.g).g() == e67Var2.b && ((i04) this.g).h() == e67Var2.c) {
                j = ((i04) this.g).k();
            }
        } else if (z) {
            i04 i04Var = (i04) this.g;
            i04Var.X();
            j = i04Var.f(i04Var.q0);
        } else if (!aacVar.p()) {
            j = a2d.e0(aacVar.m(i, this.c, 0L).k);
        }
        long j2 = j;
        aac m = ((i04) this.g).m();
        int i2 = ((i04) this.g).i();
        long k = ((i04) this.g).k();
        i04 i04Var2 = (i04) this.g;
        i04Var2.X();
        return new cd(elapsedRealtime, aacVar, i, e67Var2, j2, m, i2, (e67) this.d.d, k, a2d.e0(i04Var2.q0.r));
    }

    public final cd L(int i, e67 e67Var) {
        this.g.getClass();
        if (e67Var != null) {
            if (((aac) ((rm9) this.d.c).get(e67Var)) != null) {
                return J(e67Var);
            }
            return K(aac.a, i, e67Var);
        }
        aac m = ((i04) this.g).m();
        if (i >= m.o()) {
            m = aac.a;
        }
        return K(m, i, null);
    }

    public final cd M() {
        return J((e67) this.d.f);
    }

    public final void N(cd cdVar, int i, or6 or6Var) {
        this.e.put(i, cdVar);
        this.f.e(i, or6Var);
    }

    public final void O(i04 i04Var, Looper looper) {
        boolean z;
        boolean z2 = true;
        if (this.g != null && !((qs5) this.d.b).isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        wq9.D(z);
        i04Var.getClass();
        this.g = i04Var;
        this.h = this.a.a(looper, null);
        rr6 rr6Var = this.f;
        iu1 iu1Var = new iu1(1, this, i04Var);
        rr6Var.getClass();
        xfb xfbVar = this.a;
        if (xfbVar == null) {
            z2 = false;
        }
        wq9.D(z2);
        this.f = new rr6(rr6Var.d, looper, looper.getThread(), xfbVar, iu1Var, rr6Var.i);
    }

    @Override // defpackage.az8
    public final void a(uad uadVar) {
        cd M = M();
        N(M, 25, new js2(M, uadVar));
    }

    @Override // defpackage.az8
    public final void b(int i) {
        N(I(), 6, new vm1(29));
    }

    @Override // defpackage.k67
    public final void d(int i, e67 e67Var, h57 h57Var) {
        cd L = L(i, e67Var);
        N(L, 1004, new iu1(2, L, h57Var));
    }

    @Override // defpackage.k67
    public final void e(int i, e67 e67Var, h57 h57Var) {
        N(L(i, e67Var), 1005, new gs2(27));
    }

    @Override // defpackage.az8
    public final void f(kjc kjcVar) {
        N(I(), 19, new gs2(26));
    }

    @Override // defpackage.az8
    public final void g(boolean z) {
        N(I(), 3, new ls2(5));
    }

    @Override // defpackage.az8
    public final void h(int i, boolean z) {
        N(I(), 5, new gs2(3));
    }

    @Override // defpackage.az8
    public final void i(float f) {
        N(M(), 22, new vm1(23));
    }

    @Override // defpackage.k67
    public final void j(int i, e67 e67Var, cs6 cs6Var, h57 h57Var) {
        N(L(i, e67Var), 1002, new gs2(18));
    }

    @Override // defpackage.az8
    public final void k(int i) {
        N(M(), 21, new gs2(23));
    }

    @Override // defpackage.az8
    public final void l(int i) {
        N(I(), 4, new gs2(6));
    }

    @Override // defpackage.k67
    public final void m(int i, e67 e67Var, cs6 cs6Var, h57 h57Var) {
        N(L(i, e67Var), 1001, new gs2(20));
    }

    @Override // defpackage.az8
    public final void n(boolean z) {
        N(I(), 9, new ls2(4));
    }

    @Override // defpackage.k67
    public final void o(int i, e67 e67Var, cs6 cs6Var, h57 h57Var, IOException iOException, boolean z) {
        cd L = L(i, e67Var);
        N(L, 1003, new q6(L, cs6Var, h57Var, iOException, z));
    }

    @Override // defpackage.az8
    public final void p(ud2 ud2Var) {
        N(I(), 27, new gs2(9));
    }

    @Override // defpackage.az8
    public final void q(tjc tjcVar) {
        N(I(), 2, new gs2(2));
    }

    @Override // defpackage.az8
    public final void r(int i, bz8 bz8Var, bz8 bz8Var2) {
        if (i == 1) {
            this.i = false;
        }
        cz8 cz8Var = this.g;
        cz8Var.getClass();
        yv yvVar = this.d;
        yvVar.d = yv.q(cz8Var, (qs5) yvVar.b, (e67) yvVar.e, (y9c) yvVar.a);
        cd I = I();
        N(I, 11, new is2(I, i, bz8Var, bz8Var2));
    }

    @Override // defpackage.az8
    public final void s(int i) {
        cz8 cz8Var = this.g;
        cz8Var.getClass();
        yv yvVar = this.d;
        yvVar.d = yv.q(cz8Var, (qs5) yvVar.b, (e67) yvVar.e, (y9c) yvVar.a);
        yvVar.D(((i04) cz8Var).m());
        N(I(), 0, new ls2(8));
    }

    @Override // defpackage.az8
    public final void t(j57 j57Var) {
        N(I(), 14, new gs2(17));
    }

    @Override // defpackage.az8
    public final void u(pz3 pz3Var) {
        cd I;
        e67 e67Var;
        if ((pz3Var instanceof pz3) && (e67Var = pz3Var.D) != null) {
            I = J(e67Var);
        } else {
            I = I();
        }
        N(I, 10, new gs2(1));
    }

    @Override // defpackage.az8
    public final void v(int i) {
        N(I(), 8, new ls2(2));
    }

    @Override // defpackage.az8
    public final void w(pz3 pz3Var) {
        cd I;
        e67 e67Var;
        if ((pz3Var instanceof pz3) && (e67Var = pz3Var.D) != null) {
            I = J(e67Var);
        } else {
            I = I();
        }
        N(I, 10, new q6(I, pz3Var, 9));
    }

    @Override // defpackage.az8
    public final void y(boolean z) {
        N(M(), 23, new gs2(29));
    }

    @Override // defpackage.az8
    public final void z(List list) {
        cd I = I();
        N(I, 27, new hs2(I, list));
    }

    @Override // defpackage.az8
    public final void x() {
    }

    @Override // defpackage.az8
    public final void c(zy8 zy8Var) {
    }
}
