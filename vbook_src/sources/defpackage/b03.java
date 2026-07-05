package defpackage;

import java.io.IOException;
import java.util.zip.Deflater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b03  reason: default package */
/* loaded from: classes3.dex */
public final class b03 implements yma {
    public final /* synthetic */ int a;
    public boolean b;
    public final yma c;
    public final Object d;

    public /* synthetic */ b03(yma ymaVar, Object obj, int i) {
        this.a = i;
        this.c = ymaVar;
        this.d = obj;
    }

    @Override // defpackage.yma, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        Object obj = this.d;
        yma ymaVar = this.c;
        switch (i) {
            case 0:
                Deflater deflater = (Deflater) obj;
                if (!this.b) {
                    try {
                        deflater.finish();
                        o(false);
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        deflater.end();
                    } catch (Throwable th2) {
                        if (th == null) {
                            th = th2;
                        }
                    }
                    try {
                        ((lj9) ymaVar).close();
                    } catch (Throwable th3) {
                        if (th == null) {
                            th = th3;
                        }
                    }
                    this.b = true;
                    if (th == null) {
                        return;
                    }
                    throw th;
                }
                return;
            default:
                try {
                    ymaVar.close();
                    return;
                } catch (IOException e) {
                    this.b = true;
                    ((cq2) obj).invoke(e);
                    return;
                }
        }
    }

    @Override // defpackage.yma, java.io.Flushable
    public final void flush() {
        int i = this.a;
        yma ymaVar = this.c;
        switch (i) {
            case 0:
                o(true);
                ((lj9) ymaVar).flush();
                return;
            default:
                try {
                    ymaVar.flush();
                    return;
                } catch (IOException e) {
                    this.b = true;
                    ((cq2) this.d).invoke(e);
                    return;
                }
        }
    }

    public void o(boolean z) {
        e5a b1;
        int deflate;
        Deflater deflater = (Deflater) this.d;
        lj9 lj9Var = (lj9) this.c;
        my0 my0Var = lj9Var.b;
        while (true) {
            b1 = my0Var.b1(1);
            byte[] bArr = b1.a;
            int i = b1.c;
            if (z) {
                try {
                    deflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (IllegalStateException e) {
                    throw new IOException("Deflater already closed", e);
                } catch (NullPointerException e2) {
                    throw new IOException("Deflater already closed", e2);
                }
            } else {
                deflate = deflater.deflate(bArr, i, 8192 - i);
            }
            if (deflate > 0) {
                b1.c += deflate;
                my0Var.b += deflate;
                lj9Var.a0();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (b1.b == b1.c) {
            my0Var.a = b1.a();
            n5a.a(b1);
        }
    }

    @Override // defpackage.yma
    public final dac timeout() {
        int i = this.a;
        yma ymaVar = this.c;
        switch (i) {
            case 0:
                return ((lj9) ymaVar).a.timeout();
            default:
                return ymaVar.timeout();
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "DeflaterSink(" + ((lj9) this.c) + ')';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.yma
    public final void write(my0 my0Var, long j) {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                Deflater deflater = (Deflater) obj;
                bbe.n(my0Var.b, 0L, j);
                while (j > 0) {
                    e5a e5aVar = my0Var.a;
                    e5aVar.getClass();
                    int min = (int) Math.min(j, e5aVar.c - e5aVar.b);
                    deflater.setInput(e5aVar.a, e5aVar.b, min);
                    o(false);
                    long j2 = min;
                    my0Var.b -= j2;
                    int i2 = e5aVar.b + min;
                    e5aVar.b = i2;
                    if (i2 == e5aVar.c) {
                        my0Var.a = e5aVar.a();
                        n5a.a(e5aVar);
                    }
                    j -= j2;
                }
                deflater.setInput(b16.c, 0, 0);
                return;
            default:
                if (this.b) {
                    my0Var.skip(j);
                    return;
                }
                try {
                    this.c.write(my0Var, j);
                    return;
                } catch (IOException e) {
                    this.b = true;
                    ((cq2) obj).invoke(e);
                    return;
                }
        }
    }
}
