package defpackage;

import java.io.EOFException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wj9  reason: default package */
/* loaded from: classes3.dex */
public final class wj9 implements psa {
    public final ih9 a;
    public boolean b;
    public final ly0 c = new Object();

    /* JADX WARN: Type inference failed for: r1v1, types: [ly0, java.lang.Object] */
    public wj9(ih9 ih9Var) {
        this.a = ih9Var;
    }

    @Override // defpackage.ih9
    public final long M(ly0 ly0Var, long j) {
        ly0Var.getClass();
        if (!this.b) {
            if (j >= 0) {
                ly0 ly0Var2 = this.c;
                if (ly0Var2.c == 0 && this.a.M(ly0Var2, 8192L) == -1) {
                    return -1L;
                }
                return ly0Var2.M(ly0Var, Math.min(j, ly0Var2.c));
            }
            p1a.k(hl5.k(j, "byteCount: "));
            return 0L;
        }
        vs.k("Source is closed.");
        return 0L;
    }

    @Override // defpackage.psa, defpackage.zma
    public final ly0 b() {
        return this.c;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.close();
        ly0 ly0Var = this.c;
        ly0Var.skip(ly0Var.c);
    }

    @Override // defpackage.psa
    public final boolean k() {
        if (!this.b) {
            ly0 ly0Var = this.c;
            if (!ly0Var.k() || this.a.M(ly0Var, 8192L) != -1) {
                return false;
            }
            return true;
        }
        vs.k("Source is closed.");
        return false;
    }

    @Override // defpackage.psa
    public final wj9 peek() {
        if (!this.b) {
            return new wj9(new ft8(this));
        }
        vs.k("Source is closed.");
        return null;
    }

    @Override // defpackage.psa
    public final byte readByte() {
        w(1L);
        return this.c.readByte();
    }

    @Override // defpackage.psa
    public final boolean request(long j) {
        ly0 ly0Var;
        if (!this.b) {
            if (j >= 0) {
                do {
                    ly0Var = this.c;
                    if (ly0Var.c >= j) {
                        return true;
                    }
                } while (this.a.M(ly0Var, 8192L) != -1);
                return false;
            }
            p1a.k(hl5.k(j, "byteCount: "));
            return false;
        }
        vs.k("Source is closed.");
        return false;
    }

    public final String toString() {
        return "buffered(" + this.a + ')';
    }

    @Override // defpackage.psa
    public final void w(long j) {
        if (request(j)) {
            return;
        }
        throw new EOFException(nk2.t(j, "Source doesn't contain required number of bytes (", ")."));
    }
}
