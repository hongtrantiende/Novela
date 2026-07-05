package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zta  reason: default package */
/* loaded from: classes.dex */
public final class zta implements dq5 {
    public final pe4 a;
    public final jxe b;
    public final Object c = new Object();
    public boolean d;
    public final bz0 e;

    public zta(bz0 bz0Var, pe4 pe4Var, jxe jxeVar) {
        this.a = pe4Var;
        this.b = jxeVar;
        this.e = bz0Var;
    }

    @Override // defpackage.dq5
    public final hn8 M0() {
        synchronized (this.c) {
            if (this.d) {
                throw new IllegalStateException("closed");
            }
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.c) {
            this.d = true;
            bz0 bz0Var = this.e;
            if (bz0Var != null) {
                try {
                    bz0Var.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // defpackage.dq5
    public final pe4 getFileSystem() {
        return this.a;
    }

    @Override // defpackage.dq5
    public final jxe l() {
        return this.b;
    }

    @Override // defpackage.dq5
    public final bz0 v() {
        bz0 bz0Var;
        synchronized (this.c) {
            try {
                if (!this.d) {
                    bz0Var = this.e;
                    if (bz0Var == null) {
                        throw null;
                    }
                } else {
                    throw new IllegalStateException("closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bz0Var;
    }
}
