package defpackage;

import java.io.OutputStream;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mg8  reason: default package */
/* loaded from: classes3.dex */
public final class mg8 implements hh9 {
    public final OutputStream a;

    public mg8(OutputStream outputStream) {
        this.a = outputStream;
    }

    @Override // defpackage.hh9
    public final void U0(ly0 ly0Var, long j) {
        tc4.n(ly0Var.c, j);
        while (j > 0) {
            if (!ly0Var.k()) {
                d5a d5aVar = ly0Var.a;
                d5aVar.getClass();
                byte[] bArr = d5aVar.a;
                int i = d5aVar.b;
                int min = (int) Math.min(j, d5aVar.c - i);
                this.a.write(bArr, i, min);
                if (min != 0) {
                    if (min >= 0) {
                        if (min <= d5aVar.b()) {
                            ly0Var.skip(min);
                        } else {
                            vs.k("Returned too many bytes");
                            return;
                        }
                    } else {
                        vs.k("Returned negative read bytes count");
                        return;
                    }
                }
                j -= min;
            } else {
                vs.m("Buffer is empty");
                return;
            }
        }
    }

    @Override // defpackage.hh9, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.a.flush();
    }

    public final String toString() {
        return "RawSink(" + this.a + ')';
    }
}
