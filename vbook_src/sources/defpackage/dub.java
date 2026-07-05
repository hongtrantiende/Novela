package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dub  reason: default package */
/* loaded from: classes.dex */
public final class dub {
    public final s26 a;
    public frb b;
    public final hm8 c;
    public final hm8 d;
    public final hm8 e;
    public final xk9 f;
    public final gw7 g;

    public dub(String str) {
        int length = str.length();
        long a = sze.a(length, length);
        this.a = new s26(27);
        this.b = new frb(new grb(str, sze.d(str.length(), a), null, null, null, null, null, Token.IMPORT), null, null, null, 14);
        Boolean bool = Boolean.FALSE;
        this.c = yae.z(bool);
        this.d = yae.z(new grb(str, a, null, null, null, null, null, Token.IMPORT));
        this.e = yae.z(bool);
        this.f = new xk9(this, 10);
        this.g = new gw7(new cub[16], 0);
    }

    public static final void a(dub dubVar, og0 og0Var, boolean z, wrb wrbVar) {
        boolean z2;
        pyb pybVar;
        a9a a9aVar;
        grb d = dubVar.d();
        if (((gw7) dubVar.b.a().b).c == 0 && fxb.c(d.e, dubVar.b.f)) {
            if (c16.i(d.f, dubVar.b.C) && c16.i(d.C, dubVar.b.E) && c16.i(d.a, dubVar.b.D)) {
                return;
            }
            grb d2 = dubVar.d();
            String tb1Var = dubVar.b.c.toString();
            frb frbVar = dubVar.b;
            long j = frbVar.f;
            fxb fxbVar = frbVar.C;
            dubVar.i(d2, new grb(tb1Var, j, fxbVar, frbVar.E, xxe.o(fxbVar, frbVar.D), null, d.c, 32), z);
            return;
        }
        boolean z3 = false;
        if (((gw7) dubVar.b.a().b).c != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        String tb1Var2 = dubVar.b.c.toString();
        frb frbVar2 = dubVar.b;
        long j2 = frbVar2.f;
        fxb fxbVar2 = frbVar2.C;
        grb grbVar = new grb(tb1Var2, j2, fxbVar2, frbVar2.E, xxe.o(fxbVar2, frbVar2.D), null, xxe.u(dubVar.b), 32);
        if (og0Var == null) {
            if (z2 && z) {
                z3 = true;
            }
            dubVar.i(d, grbVar, z3);
            dubVar.e(d, grbVar, dubVar.b.a(), wrbVar);
            return;
        }
        frb frbVar3 = new frb(grbVar, dubVar.b.a(), d, null, 8);
        aw7 aw7Var = og0Var.a;
        aw7 aw7Var2 = og0Var.b;
        y8a y8aVar = y8a.i;
        z8a z8aVar = z8a.i;
        boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
        tb1 tb1Var3 = frbVar3.c;
        if (!booleanValue) {
            CharSequence charSequence = frbVar3.a.d;
            charSequence.getClass();
            if (tb1Var3.length() > 0 && tb1Var3.charAt(0) == 8203) {
                a9aVar = z8aVar;
            } else if (tb1Var3.length() < charSequence.length()) {
                a9aVar = y8aVar;
            } else {
                int length = tb1Var3.length();
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (tb1Var3.charAt(i) == 8203) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                a9aVar = new a9a(i);
            }
            if (!a9aVar.equals(z8aVar)) {
                if (a9aVar.equals(y8aVar)) {
                    ((vt4) aw7Var2.getValue()).invoke();
                    frbVar3.c(0, 0, "\u200b");
                } else if (a9aVar instanceof a9a) {
                    int i2 = a9aVar.i;
                    if (i2 > 0) {
                        frbVar3.c(i2, i2 + 1, "");
                    }
                    if (!k4b.A0(tb1Var3, "\u200b", false)) {
                        frbVar3.c(0, 0, "\u200b");
                    }
                } else {
                    xk5.o();
                }
            }
        }
        boolean E = r4b.E(tb1Var3, grbVar);
        boolean z4 = !E;
        boolean c = fxb.c(frbVar3.f, grbVar.e);
        boolean z5 = !c;
        pyb pybVar2 = frbVar3.d;
        hub hubVar = grbVar.c;
        if (hubVar != null) {
            pybVar = hubVar.a;
        } else {
            pybVar = null;
        }
        boolean i3 = c16.i(pybVar2, pybVar);
        boolean z6 = !i3;
        if (E && c && i3) {
            dubVar.i(d, frb.h(frbVar3, 0L, grbVar.f, null, 13), z);
        } else {
            dubVar.h(frbVar3, z4, z5, z6);
        }
        dubVar.e(d, dubVar.d(), frbVar3.a(), wrbVar);
    }

    public final void b(frb frbVar) {
        boolean z;
        frb frbVar2;
        if (((gw7) frbVar.a().b).c > 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !fxb.c(frbVar.f, this.b.f);
        boolean i = true ^ c16.i(frbVar.d, this.b.d);
        if (z) {
            frbVar2 = frbVar;
            e(d(), frb.h(frbVar2, 0L, null, null, 15), frbVar2.a(), wrb.b);
        } else {
            frbVar2 = frbVar;
        }
        h(frbVar2, z, z2, i);
    }

    public final void c() {
        this.c.setValue(Boolean.FALSE);
        f(false);
    }

    public final grb d() {
        return (grb) this.d.getValue();
    }

    public final void e(grb grbVar, grb grbVar2, kw5 kw5Var, wrb wrbVar) {
        int ordinal = wrbVar.ordinal();
        s26 s26Var = this.a;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    st0.p(s26Var, grbVar, grbVar2, kw5Var, false);
                    return;
                } else {
                    xk5.o();
                    return;
                }
            }
            ((hm8) s26Var.c).setValue(null);
            hvc hvcVar = (hvc) s26Var.b;
            ((ora) hvcVar.b).clear();
            ((ora) hvcVar.c).clear();
            return;
        }
        st0.p(s26Var, grbVar, grbVar2, kw5Var, true);
    }

    public final void f(boolean z) {
        this.e.setValue(Boolean.valueOf(z));
    }

    public final frb g() {
        xt4 xt4Var;
        hm8 hm8Var = this.c;
        zqa f = pae.f();
        if (f != null) {
            xt4Var = f.e();
        } else {
            xt4Var = null;
        }
        zqa h = pae.h(f);
        try {
            if (((Boolean) hm8Var.getValue()).booleanValue()) {
                ov5.c("TextFieldState does not support concurrent or nested editing.");
            }
            hm8Var.setValue(Boolean.TRUE);
            return new frb(d(), null, null, null, 14);
        } finally {
            pae.n(f, h, xt4Var);
        }
    }

    public final void h(frb frbVar, boolean z, boolean z2, boolean z3) {
        grb h = frb.h(this.b, 0L, null, null, 15);
        if (!z && !z3) {
            if (z2) {
                frb frbVar2 = this.b;
                long j = frbVar.f;
                int i = fxb.c;
                frbVar2.g(sze.a((int) (j >> 32), (int) (j & 4294967295L)));
            }
        } else {
            this.b = new frb(new grb(frbVar.c.toString(), frbVar.f, null, null, null, null, xxe.u(frbVar), 60), null, null, null, 14);
        }
        if (z || z2 || !c16.i(h.f, frbVar.C)) {
            this.b.f(null);
        }
        i(h, frb.h(this.b, 0L, null, null, 15), true);
    }

    public final void i(grb grbVar, grb grbVar2, boolean z) {
        boolean z2;
        this.d.setValue(grbVar2);
        gw7 gw7Var = this.g;
        Object[] objArr = gw7Var.a;
        int i = gw7Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            cub cubVar = (cub) objArr[i2];
            if (z && !r4b.E(grbVar.d, grbVar2) && grbVar.f != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            cubVar.a(grbVar, grbVar2, z2);
        }
        f(false);
    }

    public final String toString() {
        xt4 xt4Var;
        zqa f = pae.f();
        if (f != null) {
            xt4Var = f.e();
        } else {
            xt4Var = null;
        }
        zqa h = pae.h(f);
        try {
            String i = fxb.i(d().e);
            CharSequence charSequence = d().d;
            return "TextFieldState(selection=" + i + ", text=\"" + ((Object) charSequence) + "\")";
        } finally {
            pae.n(f, h, xt4Var);
        }
    }
}
