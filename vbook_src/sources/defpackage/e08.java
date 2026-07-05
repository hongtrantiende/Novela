package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e08  reason: default package */
/* loaded from: classes.dex */
public abstract class e08 {
    public yz7 a;
    public boolean b;

    public final void a() {
        yz7 yz7Var = this.a;
        if (yz7Var != null) {
            if (!this.b) {
                yz7Var.e(this, null);
            }
            yz7Var.d();
            if (yz7Var.c) {
                f08 f08Var = yz7Var.d;
                q6 q6Var = yz7Var.a;
                f08Var.getClass();
                if (equals(f08Var.h) && -1 == f08Var.g) {
                    a08 a08Var = f08Var.f;
                    if (a08Var == null) {
                        a08Var = f08Var.c(-1);
                    }
                    f08Var.f = null;
                    f08Var.g = 0;
                    f08Var.h = null;
                    h08 h08Var = h08.a;
                    if (a08Var == null) {
                        if (q6Var != null) {
                            ((tb8) q6Var.b).a.run();
                        }
                    } else {
                        a08Var.d = h08Var;
                        a08Var.d();
                    }
                    cza czaVar = f08Var.a;
                    czaVar.getClass();
                    czaVar.n(null, h08Var);
                }
            }
            this.b = false;
            return;
        }
        vs.k("This input is not added to any dispatcher.");
    }

    public void c() {
    }

    public void b(boolean z) {
    }
}
