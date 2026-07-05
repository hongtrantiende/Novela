package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o1  reason: default package */
/* loaded from: classes.dex */
public final class o1 extends lbe {
    @Override // defpackage.lbe
    public final boolean b(x1 x1Var, l1 l1Var, l1 l1Var2) {
        synchronized (x1Var) {
            try {
                if (x1Var.b == l1Var) {
                    x1Var.b = l1Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.lbe
    public final boolean c(x1 x1Var, Object obj, Object obj2) {
        synchronized (x1Var) {
            try {
                if (x1Var.a == obj) {
                    x1Var.a = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.lbe
    public final boolean d(x1 x1Var, w1 w1Var, w1 w1Var2) {
        synchronized (x1Var) {
            try {
                if (x1Var.c == w1Var) {
                    x1Var.c = w1Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.lbe
    public final l1 l(x1 x1Var) {
        l1 l1Var;
        l1 l1Var2 = l1.d;
        synchronized (x1Var) {
            try {
                l1Var = x1Var.b;
                if (l1Var != l1Var2) {
                    x1Var.b = l1Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return l1Var;
    }

    @Override // defpackage.lbe
    public final w1 m(x1 x1Var) {
        w1 w1Var;
        w1 w1Var2 = w1.c;
        synchronized (x1Var) {
            try {
                w1Var = x1Var.c;
                if (w1Var != w1Var2) {
                    x1Var.c = w1Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return w1Var;
    }

    @Override // defpackage.lbe
    public final void r(w1 w1Var, w1 w1Var2) {
        w1Var.b = w1Var2;
    }

    @Override // defpackage.lbe
    public final void s(w1 w1Var, Thread thread) {
        w1Var.a = thread;
    }
}
