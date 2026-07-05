package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bv5  reason: default package */
/* loaded from: classes3.dex */
public final class bv5 implements osa {
    public final mj9 a;
    public final Inflater b;
    public int c;
    public boolean d;

    public bv5(mj9 mj9Var, Inflater inflater) {
        this.a = mj9Var;
        this.b = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }

    public final long o(my0 my0Var, long j) {
        Inflater inflater = this.b;
        my0Var.getClass();
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (!this.d) {
                if (i != 0) {
                    try {
                        e5a b1 = my0Var.b1(1);
                        int min = (int) Math.min(j, 8192 - b1.c);
                        boolean needsInput = inflater.needsInput();
                        mj9 mj9Var = this.a;
                        if (needsInput && !mj9Var.k()) {
                            e5a e5aVar = mj9Var.b.a;
                            e5aVar.getClass();
                            int i2 = e5aVar.c;
                            int i3 = e5aVar.b;
                            int i4 = i2 - i3;
                            this.c = i4;
                            inflater.setInput(e5aVar.a, i3, i4);
                        }
                        int inflate = inflater.inflate(b1.a, b1.c, min);
                        int i5 = this.c;
                        if (i5 != 0) {
                            int remaining = i5 - inflater.getRemaining();
                            this.c -= remaining;
                            mj9Var.skip(remaining);
                        }
                        if (inflate > 0) {
                            b1.c += inflate;
                            long j2 = inflate;
                            my0Var.b += j2;
                            return j2;
                        } else if (b1.b == b1.c) {
                            my0Var.a = b1.a();
                            n5a.a(b1);
                        }
                    } catch (DataFormatException e) {
                        throw new IOException(e);
                    }
                }
                return 0L;
            }
            vs.k("closed");
            return 0L;
        }
        p1a.k(hl5.k(j, "byteCount < 0: "));
        return 0L;
    }

    @Override // defpackage.osa
    public final long read(my0 my0Var, long j) {
        my0Var.getClass();
        do {
            long o = o(my0Var, j);
            if (o > 0) {
                return o;
            }
            Inflater inflater = this.b;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.a.k());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // defpackage.osa
    public final dac timeout() {
        return this.a.a.timeout();
    }
}
