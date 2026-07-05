package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l3  reason: default package */
/* loaded from: classes.dex */
public final class l3 extends zbe {
    @Override // defpackage.zbe
    public final void D(m3 m3Var, m3 m3Var2) {
        m3Var.b = m3Var2;
    }

    @Override // defpackage.zbe
    public final void E(m3 m3Var, Thread thread) {
        m3Var.a = thread;
    }

    @Override // defpackage.zbe
    public final boolean q(n3 n3Var, j3 j3Var, j3 j3Var2) {
        synchronized (n3Var) {
            try {
                if (n3Var.b == j3Var) {
                    n3Var.b = j3Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.zbe
    public final boolean r(n3 n3Var, Object obj, Object obj2) {
        synchronized (n3Var) {
            try {
                if (n3Var.a == obj) {
                    n3Var.a = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.zbe
    public final boolean s(n3 n3Var, m3 m3Var, m3 m3Var2) {
        synchronized (n3Var) {
            try {
                if (n3Var.c == m3Var) {
                    n3Var.c = m3Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
