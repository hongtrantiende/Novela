package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yz7  reason: default package */
/* loaded from: classes.dex */
public final class yz7 {
    public final q6 a;
    public boolean b;
    public boolean c = true;
    public final f08 d = new f08();
    public final lv7 e = df8.a();
    public final lv7 f = df8.a();
    public final lv7 g = df8.a();

    public yz7(q6 q6Var) {
        this.a = q6Var;
    }

    public static void a(yz7 yz7Var, a08 a08Var) {
        yz7Var.getClass();
        a08Var.getClass();
        yz7Var.d();
        if (yz7Var.f.a(a08Var)) {
            f08 f08Var = yz7Var.d;
            f08Var.getClass();
            if (a08Var.g == null) {
                f08Var.e.addFirst(a08Var);
                a08Var.g = yz7Var;
                f08Var.b();
                return;
            }
            hfd.h(a08Var, "' is already registered with a dispatcher", "Handler '");
        }
    }

    public final void b(e08 e08Var) {
        d();
        if (this.g.a(e08Var)) {
            this.d.a(this, e08Var, -1);
        }
    }

    public final void c(mb8 mb8Var, int i) {
        d();
        if (i != 1 && i != 0) {
            p1a.k(a82.j(i, "Unsupported priority value: "));
        } else if (this.g.a(mb8Var)) {
            this.d.a(this, mb8Var, i);
        }
    }

    public final void d() {
        if (!this.b) {
            return;
        }
        vs.k("This NavigationEventDispatcher has already been disposed and cannot be used.");
    }

    public final void e(e08 e08Var, xz7 xz7Var) {
        d();
        if (this.c) {
            f08 f08Var = this.d;
            f08Var.getClass();
            if (f08Var.g == 0) {
                a08 c = f08Var.c(-1);
                f08Var.f = c;
                f08Var.g = -1;
                f08Var.h = e08Var;
                if (xz7Var != null) {
                    if (c != null) {
                        c.d = new i08(xz7Var, -1);
                        c.f(xz7Var);
                    }
                    cza czaVar = f08Var.a;
                    i08 i08Var = new i08(xz7Var, -1);
                    czaVar.getClass();
                    czaVar.n(null, i08Var);
                }
            }
        }
    }
}
