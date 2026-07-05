package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xc4  reason: default package */
/* loaded from: classes.dex */
public final class xc4 implements dq5 {
    public mj9 C;
    public final hn8 a;
    public final pe4 b;
    public final String c;
    public final AutoCloseable d;
    public final Object e = new Object();
    public boolean f;

    public xc4(hn8 hn8Var, pe4 pe4Var, String str, AutoCloseable autoCloseable) {
        this.a = hn8Var;
        this.b = pe4Var;
        this.c = str;
        this.d = autoCloseable;
    }

    @Override // defpackage.dq5
    public final hn8 M0() {
        hn8 hn8Var;
        synchronized (this.e) {
            if (!this.f) {
                hn8Var = this.a;
            } else {
                throw new IllegalStateException("closed");
            }
        }
        return hn8Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.e) {
            this.f = true;
            mj9 mj9Var = this.C;
            if (mj9Var != null) {
                try {
                    mj9Var.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
            AutoCloseable autoCloseable = this.d;
            if (autoCloseable != null) {
                try {
                    eub.u(autoCloseable);
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception unused2) {
                }
            }
        }
    }

    @Override // defpackage.dq5
    public final pe4 getFileSystem() {
        return this.b;
    }

    @Override // defpackage.dq5
    public final jxe l() {
        return null;
    }

    @Override // defpackage.dq5
    public final bz0 v() {
        synchronized (this.e) {
            if (!this.f) {
                mj9 mj9Var = this.C;
                if (mj9Var != null) {
                    return mj9Var;
                }
                mj9 q = tl1.q(this.b.k1(this.a));
                this.C = q;
                return q;
            }
            throw new IllegalStateException("closed");
        }
    }
}
