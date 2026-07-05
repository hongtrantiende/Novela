package okhttp3.internal.cache;

import java.io.IOException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class FaultHidingSink extends ir4 {
    public boolean b;

    @Override // defpackage.ir4, defpackage.yma, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException unused) {
            this.b = true;
            throw null;
        }
    }

    @Override // defpackage.ir4, defpackage.yma, java.io.Flushable
    public final void flush() {
        if (this.b) {
            return;
        }
        try {
            super.flush();
        } catch (IOException unused) {
            this.b = true;
            throw null;
        }
    }

    @Override // defpackage.ir4, defpackage.yma
    public final void write(my0 my0Var, long j) {
        if (this.b) {
            my0Var.skip(j);
            return;
        }
        try {
            this.a.write(my0Var, j);
        } catch (IOException unused) {
            this.b = true;
            throw null;
        }
    }
}
