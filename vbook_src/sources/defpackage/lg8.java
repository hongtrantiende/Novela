package defpackage;

import java.io.FileOutputStream;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lg8  reason: default package */
/* loaded from: classes3.dex */
public final class lg8 implements yma {
    public final FileOutputStream a;
    public final dac b;

    public lg8(FileOutputStream fileOutputStream, dac dacVar) {
        this.a = fileOutputStream;
        this.b = dacVar;
    }

    @Override // defpackage.yma, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.yma, java.io.Flushable
    public final void flush() {
        this.a.flush();
    }

    @Override // defpackage.yma
    public final dac timeout() {
        return this.b;
    }

    public final String toString() {
        return "sink(" + this.a + ')';
    }

    @Override // defpackage.yma
    public final void write(my0 my0Var, long j) {
        bbe.n(my0Var.b, 0L, j);
        while (j > 0) {
            this.b.f();
            e5a e5aVar = my0Var.a;
            e5aVar.getClass();
            int min = (int) Math.min(j, e5aVar.c - e5aVar.b);
            this.a.write(e5aVar.a, e5aVar.b, min);
            int i = e5aVar.b + min;
            e5aVar.b = i;
            long j2 = min;
            j -= j2;
            my0Var.b -= j2;
            if (i == e5aVar.c) {
                my0Var.a = e5aVar.a();
                n5a.a(e5aVar);
            }
        }
    }
}
