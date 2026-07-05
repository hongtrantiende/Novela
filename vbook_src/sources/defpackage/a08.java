package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a08  reason: default package */
/* loaded from: classes.dex */
public abstract class a08 {
    public d08 a;
    public List b;
    public List c;
    public j08 d;
    public boolean e;
    public boolean f;
    public yz7 g;

    public a08(d08 d08Var, boolean z, int i) {
        d08Var.getClass();
        this.a = d08Var;
        ks3 ks3Var = ks3.a;
        this.b = ks3Var;
        this.c = ks3Var;
        this.d = h08.a;
        this.e = z;
        this.f = false;
    }

    public final boolean a() {
        yz7 yz7Var = this.g;
        if (yz7Var != null && !yz7Var.c) {
            return false;
        }
        return this.e;
    }

    public final boolean b() {
        yz7 yz7Var = this.g;
        if (yz7Var != null && !yz7Var.c) {
            return false;
        }
        return this.f;
    }

    public abstract void d();

    public void f(xz7 xz7Var) {
        xz7Var.getClass();
    }

    public final void h() {
        yz7 yz7Var = this.g;
        if (yz7Var != null && yz7Var.f.h(this)) {
            f08 f08Var = yz7Var.d;
            f08Var.getClass();
            if (equals(f08Var.f)) {
                int i = f08Var.g;
                h08 h08Var = h08.a;
                if (i != -1) {
                    if (i == 1) {
                        this.d = h08Var;
                        g();
                    }
                } else {
                    this.d = h08Var;
                    c();
                }
                f08Var.f = null;
                f08Var.g = 0;
                f08Var.h = null;
            }
            f08Var.d.remove(this);
            f08Var.e.remove(this);
            this.g = null;
            f08Var.b();
        }
    }

    public final void i(boolean z) {
        f08 f08Var;
        if (this.e != z) {
            this.e = z;
            yz7 yz7Var = this.g;
            if (yz7Var != null && (f08Var = yz7Var.d) != null) {
                f08Var.b();
            }
        }
    }

    public void c() {
    }

    public void g() {
    }

    public void e(xz7 xz7Var) {
    }
}
