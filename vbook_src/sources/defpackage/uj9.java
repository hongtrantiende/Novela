package defpackage;

import java.io.EOFException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uj9  reason: default package */
/* loaded from: classes3.dex */
public final class uj9 implements zma {
    public final mg8 a;
    public boolean b;
    public final ly0 c = new Object();

    /* JADX WARN: Type inference failed for: r1v1, types: [ly0, java.lang.Object] */
    public uj9(mg8 mg8Var) {
        this.a = mg8Var;
    }

    @Override // defpackage.zma
    public final void C0() {
        int i;
        if (!this.b) {
            ly0 ly0Var = this.c;
            long j = ly0Var.c;
            if (j == 0) {
                j = 0;
            } else {
                d5a d5aVar = ly0Var.b;
                d5aVar.getClass();
                if (d5aVar.c < 8192 && d5aVar.e) {
                    j -= i - d5aVar.b;
                }
            }
            if (j > 0) {
                this.a.U0(ly0Var, j);
                return;
            }
            return;
        }
        vs.k("Sink is closed.");
    }

    @Override // defpackage.zma
    public final long D0(ih9 ih9Var) {
        ih9Var.getClass();
        long j = 0;
        if (this.b) {
            vs.k("Sink is closed.");
            return 0L;
        }
        while (true) {
            long M = ih9Var.M(this.c, 8192L);
            if (M != -1) {
                j += M;
                C0();
            } else {
                return j;
            }
        }
    }

    @Override // defpackage.zma
    public final void E(short s) {
        if (!this.b) {
            this.c.E(s);
            C0();
            return;
        }
        vs.k("Sink is closed.");
    }

    @Override // defpackage.zma
    public final void P(byte b) {
        if (!this.b) {
            this.c.P(b);
            C0();
            return;
        }
        vs.k("Sink is closed.");
    }

    @Override // defpackage.hh9
    public final void U0(ly0 ly0Var, long j) {
        if (!this.b) {
            if (j >= 0) {
                this.c.U0(ly0Var, j);
                C0();
                return;
            }
            p1a.k(hl5.k(j, "byteCount: "));
            return;
        }
        vs.k("Sink is closed.");
    }

    @Override // defpackage.zma
    public final ly0 b() {
        return this.c;
    }

    @Override // defpackage.hh9, java.lang.AutoCloseable
    public final void close() {
        mg8 mg8Var = this.a;
        if (!this.b) {
            try {
                ly0 ly0Var = this.c;
                long j = ly0Var.c;
                if (j > 0) {
                    mg8Var.U0(ly0Var, j);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                mg8Var.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.b = true;
            if (th == null) {
                return;
            }
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (!this.b) {
            ly0 ly0Var = this.c;
            long j = ly0Var.c;
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            mg8 mg8Var = this.a;
            if (i > 0) {
                mg8Var.U0(ly0Var, j);
            }
            mg8Var.flush();
            return;
        }
        vs.k("Sink is closed.");
    }

    @Override // defpackage.zma
    public final void n(byte[] bArr, int i) {
        bArr.getClass();
        if (!this.b) {
            tc4.m(bArr.length, 0L, i);
            this.c.n(bArr, i);
            C0();
            return;
        }
        vs.k("Sink is closed.");
    }

    public final String toString() {
        return "buffered(" + this.a + ')';
    }

    @Override // defpackage.zma
    public final void writeInt(int i) {
        if (!this.b) {
            this.c.writeInt(i);
            C0();
            return;
        }
        vs.k("Sink is closed.");
    }

    @Override // defpackage.zma
    public final void z0(psa psaVar, long j) {
        if (!this.b) {
            if (j >= 0) {
                long j2 = j;
                while (j2 > 0) {
                    long M = psaVar.M(this.c, j2);
                    if (M != -1) {
                        j2 -= M;
                        C0();
                    } else {
                        throw new EOFException(hl5.q(rs8.o(j, "Source exhausted before reading ", " bytes from it (number of bytes read: "), j - j2, ")."));
                    }
                }
                return;
            }
            p1a.k(hl5.k(j, "byteCount: "));
            return;
        }
        vs.k("Sink is closed.");
    }
}
