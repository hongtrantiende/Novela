package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j19  reason: default package */
/* loaded from: classes3.dex */
public final class j19 implements zl0 {
    public final zl0 a;
    public final qo3 b;

    public j19(zs2 zs2Var, qo3 qo3Var) {
        zs2Var.getClass();
        qo3Var.getClass();
        this.a = zs2Var;
        this.b = qo3Var;
    }

    @Override // defpackage.zl0
    public final void a(String str) {
        str.getClass();
        if (this.b.b) {
            this.a.a(str);
        }
    }

    @Override // defpackage.zl0
    public final void b(int i, String str) {
        str.getClass();
        if (this.b.b) {
            this.a.b(i, str);
        }
    }

    @Override // defpackage.zl0
    public final void c(mo3 mo3Var) {
        qo3 qo3Var = qo3.j;
        qo3 qo3Var2 = this.b;
        boolean z = true;
        if (qo3Var2 != qo3Var && !(mo3Var instanceof bm4) && !mo3Var.equals(ti1.a) && !mo3Var.equals(ek1.a) && !mo3Var.equals(y51.a) && !mo3Var.equals(ui1.a)) {
            if (!(mo3Var instanceof ww5) && !(mo3Var instanceof xw5) && !(mo3Var instanceof c13) && !(mo3Var instanceof d13) && !mo3Var.equals(h13.a) && !(mo3Var instanceof v62) && !(mo3Var instanceof n97) && !(mo3Var instanceof bxa) && !mo3Var.equals(pt5.a) && !mo3Var.equals(ot5.a)) {
                if (!(mo3Var instanceof sxc)) {
                    if (mo3Var instanceof mbc) {
                        z = qo3Var2.c;
                    } else if (!(mo3Var instanceof lbc) && !mo3Var.equals(r5a.a)) {
                        if (!mo3Var.equals(om4.a) && !mo3Var.equals(sm4.a)) {
                            if (!(mo3Var instanceof oya) && !(mo3Var instanceof vxc) && !mo3Var.equals(ct1.a) && !(mo3Var instanceof ms7)) {
                                if (!(mo3Var instanceof fd8) && !(mo3Var instanceof zxc) && !(mo3Var instanceof g65) && !mo3Var.equals(nz7.a)) {
                                    xk5.o();
                                    return;
                                }
                                z = qo3Var2.g;
                            } else if (!qo3Var2.i || !qo3Var2.b) {
                                z = false;
                            }
                        } else {
                            z = qo3Var2.a;
                        }
                    } else {
                        z = qo3Var2.h;
                    }
                } else {
                    z = qo3Var2.a;
                }
            } else {
                z = qo3Var2.b;
            }
        }
        if (z) {
            this.a.c(mo3Var);
        }
    }

    @Override // defpackage.zl0
    public final void d(String str, apa apaVar, String str2) {
        str.getClass();
        apaVar.getClass();
        str2.getClass();
        if (this.b.g) {
            this.a.d(str, apaVar, str2);
        }
    }

    @Override // defpackage.zl0
    public final void e(String str) {
        str.getClass();
        this.a.e(str);
    }

    @Override // defpackage.zl0
    public final void f(String str, float f) {
        if (this.b.i) {
            this.a.f(str, f);
        }
    }
}
