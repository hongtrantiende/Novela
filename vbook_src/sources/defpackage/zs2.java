package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zs2  reason: default package */
/* loaded from: classes3.dex */
public final class zs2 implements zl0 {
    public final xt4 a;
    public final vt4 b;
    public final ym0 c;
    public final wm0 d;
    public final uo3 e;

    public zs2(xt4 xt4Var, vt4 vt4Var, ym0 ym0Var, wm0 wm0Var, uo3 uo3Var) {
        this.a = xt4Var;
        this.b = vt4Var;
        this.c = ym0Var;
        this.d = wm0Var;
        this.e = uo3Var;
    }

    @Override // defpackage.zl0
    public final void a(String str) {
        str.getClass();
        t7 t7Var = new t7(27, this, str);
        uo3 uo3Var = this.e;
        if (uo3Var != null) {
            uo3Var.h(this.c, this.d, t7Var);
        } else {
            t7Var.invoke();
        }
    }

    @Override // defpackage.zl0
    public final void b(int i, String str) {
        str.getClass();
        hm hmVar = new hm(this, str, i);
        uo3 uo3Var = this.e;
        if (uo3Var != null) {
            uo3Var.h(this.c, this.d, hmVar);
        } else {
            hmVar.invoke();
        }
    }

    @Override // defpackage.zl0
    public final void c(mo3 mo3Var) {
        boolean z = mo3Var instanceof ct1;
        xt4 xt4Var = this.a;
        if (!z && !(mo3Var instanceof h13) && !(mo3Var instanceof ot5) && !(mo3Var instanceof pt5) && !(mo3Var instanceof mbc)) {
            xt4Var.invoke(mo3Var);
            return;
        }
        uo3 uo3Var = this.e;
        if (uo3Var != null) {
            uo3Var.h(this.c, this.d, new u93(uo3Var, mo3Var));
            return;
        }
        xt4Var.invoke(mo3Var);
    }

    @Override // defpackage.zl0
    public final void d(String str, apa apaVar, String str2) {
        str.getClass();
        apaVar.getClass();
        str2.getClass();
        c(new fd8(str, apaVar, str2));
    }

    @Override // defpackage.zl0
    public final void e(String str) {
        str.getClass();
        so3 so3Var = (so3) this.b.invoke();
        if (so3Var != null && so3Var.d()) {
            return;
        }
        c(new bm4(str));
    }

    @Override // defpackage.zl0
    public final void f(String str, float f) {
        c(ti1.a);
        c(new oya(str, f));
    }

    public final void g(int i, int i2, String str) {
        Object obj;
        String str2;
        ks3 ks3Var = ks3.a;
        ym0 ym0Var = this.c;
        if (ym0Var != null) {
            String f = ym0Var.f(str, i, i2, "\n", Integer.valueOf(i + 1));
            if (f != null) {
                wm0 wm0Var = this.d;
                if (wm0Var != null) {
                    wm0Var.l(f.length(), str, ks3Var);
                }
                if (wm0Var != null) {
                    wm0Var.e(str);
                }
                c(new sxc(str, new cm0(f, ks3Var)));
                return;
            }
            return;
        }
        so3 so3Var = (so3) this.b.invoke();
        if (so3Var != null) {
            xl0 c = so3Var.c(str);
            cm0 cm0Var = null;
            if (c != null) {
                obj = c.c;
            } else {
                obj = null;
            }
            if (obj instanceof cm0) {
                cm0Var = (cm0) obj;
            }
            if (cm0Var != null && (str2 = cm0Var.a) != null) {
                int n = dce.n(i, 0, str2.length());
                c(new sxc(str, new cm0(eub.o(k4b.L0(n, str2), "\n", str2.substring(dce.n(i2, n, str2.length()))), ks3Var)));
            }
        }
    }

    public final String h(xl0 xl0Var, String str) {
        cm0 cm0Var;
        String e;
        ym0 ym0Var = this.c;
        if (ym0Var != null && (e = ym0Var.e(str)) != null) {
            return e;
        }
        dm0 dm0Var = xl0Var.c;
        String str2 = null;
        if (dm0Var instanceof cm0) {
            cm0Var = (cm0) dm0Var;
        } else {
            cm0Var = null;
        }
        if (cm0Var != null) {
            str2 = cm0Var.a;
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }
}
