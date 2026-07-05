package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sd6  reason: default package */
/* loaded from: classes.dex */
public final class sd6 {
    public final od6 a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public xy6 q;
    public kd6 d = kd6.e;
    public final a37 p = new a37(this);

    public sd6(od6 od6Var) {
        this.a = od6Var;
    }

    public final i38 a() {
        return (i38) this.a.c0.e;
    }

    public final void b() {
        kd6 kd6Var = this.a.d0.d;
        kd6 kd6Var2 = kd6.c;
        kd6 kd6Var3 = kd6.d;
        if (kd6Var == kd6Var2 || kd6Var == kd6Var3) {
            if (this.p.X) {
                g(true);
            } else {
                f(true);
            }
        }
        if (kd6Var == kd6Var3) {
            xy6 xy6Var = this.q;
            if (xy6Var != null && xy6Var.R) {
                i(true);
            } else {
                h(true);
            }
        }
    }

    public final void c(long j) {
        xy6 xy6Var = this.q;
        if (xy6Var != null) {
            sd6 sd6Var = xy6Var.f;
            sd6Var.d = kd6.b;
            od6 od6Var = sd6Var.a;
            sd6Var.e = false;
            xy6Var.V = j;
            yg8 snapshotObserver = ((rg) rd6.a(od6Var)).getSnapshotObserver();
            wy6 wy6Var = xy6Var.W;
            snapshotObserver.a.d(od6Var, snapshotObserver.b, wy6Var);
            sd6Var.f = true;
            sd6Var.g = true;
            boolean F = xbe.F(od6Var);
            a37 a37Var = sd6Var.p;
            if (F) {
                a37Var.S = true;
                a37Var.T = true;
            } else {
                a37Var.R = true;
            }
            sd6Var.d = kd6.e;
        }
    }

    public final void d(int i) {
        boolean z;
        sd6 sd6Var;
        int i2 = this.l;
        this.l = i;
        boolean z2 = false;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == 0) {
            z2 = true;
        }
        if (z != z2) {
            od6 v = this.a.v();
            if (v != null) {
                sd6Var = v.d0;
            } else {
                sd6Var = null;
            }
            if (sd6Var != null) {
                int i3 = sd6Var.l;
                if (i == 0) {
                    sd6Var.d(i3 - 1);
                } else {
                    sd6Var.d(i3 + 1);
                }
            }
        }
    }

    public final void e(int i) {
        boolean z;
        sd6 sd6Var;
        int i2 = this.o;
        this.o = i;
        boolean z2 = false;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == 0) {
            z2 = true;
        }
        if (z != z2) {
            od6 v = this.a.v();
            if (v != null) {
                sd6Var = v.d0;
            } else {
                sd6Var = null;
            }
            if (sd6Var != null) {
                int i3 = sd6Var.o;
                if (i == 0) {
                    sd6Var.e(i3 - 1);
                } else {
                    sd6Var.e(i3 + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                d(this.l + 1);
            } else if (!z && !this.j) {
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                d(this.l + 1);
            } else if (!z && !this.k) {
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                e(this.o + 1);
            } else if (!z && !this.m) {
                e(this.o - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                e(this.o + 1);
            } else if (!z && !this.n) {
                e(this.o - 1);
            }
        }
    }

    public final void j() {
        a37 a37Var = this.p;
        sd6 sd6Var = a37Var.f;
        Object obj = a37Var.O;
        od6 od6Var = this.a;
        if ((obj != null || sd6Var.a().S() != null) && a37Var.N) {
            a37Var.N = false;
            a37Var.O = sd6Var.a().S();
            od6 v = od6Var.v();
            if (v != null) {
                od6.a0(v, false, 7);
            }
        }
        xy6 xy6Var = this.q;
        if (xy6Var != null) {
            sd6 sd6Var2 = xy6Var.f;
            if (xy6Var.U == null) {
                ty6 C1 = sd6Var2.a().C1();
                C1.getClass();
                if (C1.O.S() == null) {
                    return;
                }
            }
            if (xy6Var.T) {
                xy6Var.T = false;
                ty6 C12 = sd6Var2.a().C1();
                C12.getClass();
                xy6Var.U = C12.O.S();
                if (xbe.F(od6Var)) {
                    od6 v2 = od6Var.v();
                    if (v2 != null) {
                        od6.a0(v2, false, 7);
                        return;
                    }
                    return;
                }
                od6 v3 = od6Var.v();
                if (v3 != null) {
                    od6.Y(v3, false, 7);
                }
            }
        }
    }
}
