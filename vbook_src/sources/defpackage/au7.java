package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: au7  reason: default package */
/* loaded from: classes.dex */
public final class au7 extends c3e {
    public final tv7 b;
    public final ArrayList c;
    public final tv7 d;
    public final d89 e;

    public au7() {
        super(7);
        this.b = axe.h();
        this.c = new ArrayList();
        this.d = new tv7();
        el7 el7Var = new el7(this, 3);
        dra.e(dra.a);
        synchronized (dra.c) {
            dra.h = sl1.o0(dra.h, el7Var);
        }
        this.e = new d89(el7Var, 4);
    }

    @Override // defpackage.c3e
    public final xt4 F(u8a u8aVar) {
        tv7 tv7Var = this.d;
        xt4 xt4Var = (xt4) tv7Var.g(u8aVar);
        if (xt4Var == null) {
            xt4Var = new fl7(3, this, u8aVar);
            int f = tv7Var.f(u8aVar);
            if (f < 0) {
                f = ~f;
            }
            Object[] objArr = tv7Var.c;
            Object obj = objArr[f];
            tv7Var.b[f] = u8aVar;
            objArr[f] = xt4Var;
        }
        return xt4Var;
    }

    @Override // defpackage.c3e
    public final void G(ta1 ta1Var) {
        this.d.l(ta1Var);
        o(ta1Var);
        p();
    }

    @Override // defpackage.c3e
    public final void o(u8a u8aVar) {
        this.c.add(new yt7(u8aVar));
    }

    @Override // defpackage.c3e
    public final void p() {
        synchronized (this.a) {
            try {
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    zt7 zt7Var = (zt7) arrayList.get(i);
                    if (zt7Var instanceof xt7) {
                        axe.c(this.b, ((xt7) zt7Var).a, ((xt7) zt7Var).b);
                    } else if (zt7Var instanceof yt7) {
                        axe.r(this.b, ((yt7) zt7Var).a);
                    } else {
                        throw new gt1(7);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c.clear();
    }

    @Override // defpackage.c3e
    public final void s() {
        this.e.a();
        this.c.clear();
        this.d.a();
        synchronized (this.a) {
            this.b.a();
        }
    }
}
