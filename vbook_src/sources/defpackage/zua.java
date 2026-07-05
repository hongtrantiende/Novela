package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zua  reason: default package */
/* loaded from: classes3.dex */
public final class zua {
    public final xt4 a;
    public final ym0 b;
    public final wm0 c;
    public final uo3 d;

    public zua(xt4 xt4Var, ym0 ym0Var, wm0 wm0Var, uo3 uo3Var) {
        ym0Var.getClass();
        wm0Var.getClass();
        this.a = xt4Var;
        this.b = ym0Var;
        this.c = wm0Var;
        this.d = uo3Var;
    }

    public final void a(String str, int i, int i2, tva tvaVar) {
        boolean z;
        str.getClass();
        if (!e(str)) {
            if (i != i2) {
                z = true;
            } else {
                z = false;
            }
            ym0 ym0Var = this.b;
            String e = ym0Var.e(str);
            if (e != null) {
                no3 no3Var = null;
                wm0 wm0Var = this.c;
                uo3 uo3Var = this.d;
                if (z && uo3Var != null) {
                    no3Var = gwe.g(uo3Var, ym0Var, wm0Var);
                }
                if (uo3Var != null) {
                    uo3Var.b(str);
                }
                this.c.c(str, i, i2, tvaVar, e.length());
                d(str, e);
                if (uo3Var == null) {
                    return;
                }
                no3 g = gwe.g(uo3Var, ym0Var, wm0Var);
                if (no3Var != null) {
                    uo3Var.f(cwe.c(no3Var, g), p97.a);
                }
                uo3Var.l(str, g);
            }
        }
    }

    public final void b(String str, String str2) {
        ym0 ym0Var;
        String e;
        int length;
        int length2;
        no3 no3Var;
        str.getClass();
        str2.getClass();
        if (!e(str) && (e = (ym0Var = this.b).e(str)) != null) {
            fxb d = ym0Var.d(str);
            if (d != null) {
                length = fxb.g(d.a);
            } else {
                length = e.length();
            }
            int i = length;
            if (d != null) {
                length2 = fxb.f(d.a);
            } else {
                length2 = e.length();
            }
            int i2 = length2;
            wm0 wm0Var = this.c;
            uo3 uo3Var = this.d;
            if (uo3Var != null) {
                no3Var = gwe.g(uo3Var, ym0Var, wm0Var);
            } else {
                no3Var = null;
            }
            if (uo3Var != null) {
                uo3Var.b(str);
            }
            wm0Var.getClass();
            wm0Var.b(i, str, i2 - i, 1);
            int i3 = i + 1;
            String f = this.b.f(str, i, i2, "￼", Integer.valueOf(i3));
            if (f != null) {
                this.c.c(str, i, i3, new mva(str2), f.length());
                d(str, f);
                if (uo3Var == null) {
                    return;
                }
                no3 g = gwe.g(uo3Var, ym0Var, wm0Var);
                if (no3Var != null) {
                    uo3Var.f(cwe.c(no3Var, g), p97.a);
                }
                uo3Var.l(str, g);
            }
        }
    }

    public final void c(String str, int i, int i2, tva tvaVar) {
        boolean z;
        str.getClass();
        tvaVar.getClass();
        if (!e(str)) {
            if (i != i2) {
                z = true;
            } else {
                z = false;
            }
            ym0 ym0Var = this.b;
            String e = ym0Var.e(str);
            if (e != null) {
                no3 no3Var = null;
                wm0 wm0Var = this.c;
                uo3 uo3Var = this.d;
                if (z && uo3Var != null) {
                    no3Var = gwe.g(uo3Var, ym0Var, wm0Var);
                }
                if (uo3Var != null) {
                    uo3Var.b(str);
                }
                wm0Var.k(str, i, i2, tvaVar);
                d(str, e);
                if (uo3Var == null) {
                    return;
                }
                no3 g = gwe.g(uo3Var, ym0Var, wm0Var);
                if (no3Var != null) {
                    uo3Var.f(cwe.c(no3Var, g), p97.a);
                }
                uo3Var.l(str, g);
            }
        }
    }

    public final void d(String str, String str2) {
        this.a.invoke(new sxc(str, new cm0(str2, this.c.i(str))));
    }

    public final boolean e(String str) {
        so3 e;
        xl0 c;
        hn0 hn0Var;
        uo3 uo3Var = this.d;
        if (uo3Var != null && (e = uo3Var.e()) != null && (c = e.c(str)) != null && (hn0Var = c.b) != null) {
            return !hn0Var.b();
        }
        return false;
    }
}
