package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bo9  reason: default package */
/* loaded from: classes.dex */
public final class bo9 {
    public final ei0 a;
    public final int b;
    public final ei0 c;
    public int d = 0;
    public boolean e = false;
    public boolean f = false;

    public bo9(ei0 ei0Var, ei0 ei0Var2, int i) {
        this.a = ei0Var;
        this.b = i;
        this.c = ei0Var2;
    }

    public static void b(ei0 ei0Var) {
        boolean z;
        int i = ei0Var.D;
        if (i == 2) {
            if (i == 2) {
                z = true;
            } else {
                z = false;
            }
            wq9.D(z);
            ei0Var.D = 1;
            ei0Var.v();
        }
    }

    public static boolean h(ei0 ei0Var) {
        if (ei0Var.D != 0) {
            return true;
        }
        return false;
    }

    public static void l(ei0 ei0Var, long j) {
        ei0Var.J = true;
        if (ei0Var instanceof hxb) {
            hxb hxbVar = (hxb) ei0Var;
            wq9.D(hxbVar.J);
            hxbVar.g0 = j;
        }
    }

    public final void a(ei0 ei0Var, kv2 kv2Var) {
        boolean z;
        boolean z2 = true;
        if (this.a != ei0Var && this.c != ei0Var) {
            z = false;
        } else {
            z = true;
        }
        wq9.D(z);
        if (!h(ei0Var)) {
            return;
        }
        if (ei0Var == kv2Var.c) {
            kv2Var.d = null;
            kv2Var.c = null;
            kv2Var.e = true;
        }
        b(ei0Var);
        if (ei0Var.D != 1) {
            z2 = false;
        }
        wq9.D(z2);
        ei0Var.c.k();
        ei0Var.D = 0;
        ei0Var.E = null;
        ei0Var.F = null;
        ei0Var.J = false;
        ei0Var.p();
        ei0Var.M = null;
    }

    public final int c() {
        int i;
        boolean h = h(this.a);
        ei0 ei0Var = this.c;
        if (ei0Var != null && h(ei0Var)) {
            i = 1;
        } else {
            i = 0;
        }
        return (h ? 1 : 0) + i;
    }

    public final ei0 d(o57 o57Var) {
        gx9 gx9Var;
        if (o57Var != null && (gx9Var = o57Var.c[this.b]) != null) {
            ei0 ei0Var = this.a;
            if (ei0Var.E == gx9Var) {
                return ei0Var;
            }
            ei0 ei0Var2 = this.c;
            if (ei0Var2 != null && ei0Var2.E == gx9Var) {
                return ei0Var2;
            }
        }
        return null;
    }

    public final boolean e(o57 o57Var, ei0 ei0Var) {
        if (ei0Var != null) {
            gx9[] gx9VarArr = o57Var.c;
            int i = this.b;
            gx9 gx9Var = gx9VarArr[i];
            gx9 gx9Var2 = ei0Var.E;
            if (gx9Var2 != null) {
                if (gx9Var2 == gx9Var) {
                    if (gx9Var != null && !ei0Var.l()) {
                        o57 o57Var2 = o57Var.m;
                        if (o57Var.g.h && o57Var2 != null && o57Var2.e && ((ei0Var instanceof hxb) || (ei0Var instanceof yb7) || ei0Var.I >= o57Var2.e())) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                }
                o57 o57Var3 = o57Var.m;
                if (o57Var3 == null || o57Var3.c[i] != ei0Var.E) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final boolean f() {
        int i = this.d;
        if (i != 2 && i != 4 && i != 3) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        int i = this.d;
        if (i != 0 && i != 2 && i != 4) {
            ei0 ei0Var = this.c;
            ei0Var.getClass();
            if (ei0Var.D != 0) {
                return true;
            }
            return false;
        }
        return h(this.a);
    }

    public final void i(boolean z) {
        boolean z2 = true;
        if (z) {
            if (this.e) {
                ei0 ei0Var = this.a;
                if (ei0Var.D != 0) {
                    z2 = false;
                }
                wq9.D(z2);
                ei0Var.c.k();
                ei0Var.t();
                this.e = false;
            }
        } else if (this.f) {
            ei0 ei0Var2 = this.c;
            ei0Var2.getClass();
            if (ei0Var2.D != 0) {
                z2 = false;
            }
            wq9.D(z2);
            ei0Var2.c.k();
            ei0Var2.t();
            this.f = false;
        }
    }

    public final int j(ei0 ei0Var, o57 o57Var, ljc ljcVar, kv2 kv2Var) {
        ei0 ei0Var2;
        Object[] objArr;
        int i;
        int i2;
        if (ei0Var == null || ei0Var.D == 0 || (ei0Var == (ei0Var2 = this.a) && ((i2 = this.d) == 2 || i2 == 4))) {
            return 1;
        }
        if (ei0Var == this.c && this.d == 3) {
            return 1;
        }
        gx9 gx9Var = ei0Var.E;
        gx9[] gx9VarArr = o57Var.c;
        int i3 = this.b;
        boolean z = false;
        if (gx9Var != gx9VarArr[i3]) {
            objArr = 1;
        } else {
            objArr = null;
        }
        boolean k = ljcVar.k(i3);
        if (!k || objArr != null) {
            if (!ei0Var.J) {
                c14 c14Var = ((c14[]) ljcVar.c)[i3];
                if (c14Var != null) {
                    i = c14Var.length();
                } else {
                    i = 0;
                }
                vq4[] vq4VarArr = new vq4[i];
                for (int i4 = 0; i4 < i; i4++) {
                    c14Var.getClass();
                    vq4VarArr[i4] = c14Var.h(i4);
                }
                gx9 gx9Var2 = o57Var.c[i3];
                gx9Var2.getClass();
                ei0Var.A(vq4VarArr, gx9Var2, o57Var.e(), o57Var.p, o57Var.g.a);
                return 3;
            } else if (!ei0Var.m()) {
                return 0;
            } else {
                a(ei0Var, kv2Var);
                if (!k || f()) {
                    if (ei0Var == ei0Var2) {
                        z = true;
                    }
                    i(z);
                    return 1;
                }
            }
        }
        return 1;
    }

    public final void k() {
        if (!h(this.a)) {
            i(true);
        }
        ei0 ei0Var = this.c;
        if (ei0Var == null || ei0Var.D != 0) {
            return;
        }
        i(false);
    }

    public final void m() {
        int i;
        ei0 ei0Var = this.a;
        int i2 = ei0Var.D;
        boolean z = false;
        if (i2 == 1 && this.d != 4) {
            if (i2 == 1) {
                z = true;
            }
            wq9.D(z);
            ei0Var.D = 2;
            ei0Var.u();
            return;
        }
        ei0 ei0Var2 = this.c;
        if (ei0Var2 != null && (i = ei0Var2.D) == 1 && this.d != 3) {
            if (i == 1) {
                z = true;
            }
            wq9.D(z);
            ei0Var2.D = 2;
            ei0Var2.u();
        }
    }
}
