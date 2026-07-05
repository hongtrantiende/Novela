package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q19  reason: default package */
/* loaded from: classes.dex */
public final class q19 implements iw9 {
    public final iw9 a;
    public final long b;
    public final /* synthetic */ x19 c;

    public q19(x19 x19Var, iw9 iw9Var) {
        iw9Var.getClass();
        this.c = x19Var;
        this.a = iw9Var;
        this.b = w92.r();
    }

    @Override // defpackage.iw9
    public final boolean Z0() {
        if (!this.c.d.get()) {
            if (this.b == w92.r()) {
                return this.a.Z0();
            }
            oue.K(21, "Attempted to use statement on a different thread");
            throw null;
        }
        oue.K(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.iw9
    public final void b0(int i, String str) {
        str.getClass();
        if (!this.c.d.get()) {
            if (this.b == w92.r()) {
                this.a.b0(i, str);
                return;
            } else {
                oue.K(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        oue.K(21, "Statement is recycled");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.c.d.get()) {
            if (this.b == w92.r()) {
                this.a.close();
                return;
            } else {
                oue.K(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        oue.K(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.iw9
    public final byte[] getBlob(int i) {
        if (!this.c.d.get()) {
            if (this.b == w92.r()) {
                return this.a.getBlob(i);
            }
            oue.K(21, "Attempted to use statement on a different thread");
            throw null;
        }
        oue.K(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.iw9
    public final int getColumnCount() {
        if (!this.c.d.get()) {
            if (this.b == w92.r()) {
                return this.a.getColumnCount();
            }
            oue.K(21, "Attempted to use statement on a different thread");
            throw null;
        }
        oue.K(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.iw9
    public final String getColumnName(int i) {
        if (!this.c.d.get()) {
            if (this.b == w92.r()) {
                return this.a.getColumnName(i);
            }
            oue.K(21, "Attempted to use statement on a different thread");
            throw null;
        }
        oue.K(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.iw9
    public final long getLong(int i) {
        if (!this.c.d.get()) {
            if (this.b == w92.r()) {
                return this.a.getLong(i);
            }
            oue.K(21, "Attempted to use statement on a different thread");
            throw null;
        }
        oue.K(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.iw9
    public final boolean isNull(int i) {
        if (!this.c.d.get()) {
            if (this.b == w92.r()) {
                return this.a.isNull(i);
            }
            oue.K(21, "Attempted to use statement on a different thread");
            throw null;
        }
        oue.K(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.iw9
    public final void m(int i, long j) {
        if (!this.c.d.get()) {
            if (this.b == w92.r()) {
                this.a.m(i, j);
                return;
            } else {
                oue.K(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        oue.K(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.iw9
    public final void p(byte[] bArr, int i) {
        if (!this.c.d.get()) {
            if (this.b == w92.r()) {
                this.a.p(bArr, i);
                return;
            } else {
                oue.K(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        oue.K(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.iw9
    public final void r(int i) {
        if (!this.c.d.get()) {
            if (this.b == w92.r()) {
                this.a.r(i);
                return;
            } else {
                oue.K(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        oue.K(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.iw9
    public final void reset() {
        if (!this.c.d.get()) {
            if (this.b == w92.r()) {
                this.a.reset();
                return;
            } else {
                oue.K(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        oue.K(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.iw9
    public final String s0(int i) {
        if (!this.c.d.get()) {
            if (this.b == w92.r()) {
                return this.a.s0(i);
            }
            oue.K(21, "Attempted to use statement on a different thread");
            throw null;
        }
        oue.K(21, "Statement is recycled");
        throw null;
    }
}
