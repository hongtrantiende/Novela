package defpackage;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qw5  reason: default package */
/* loaded from: classes3.dex */
public final class qw5 implements osa {
    public final /* synthetic */ int a;
    public final AutoCloseable b;
    public final Object c;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.lang.AutoCloseable] */
    public qw5(ih9 ih9Var) {
        this.a = 1;
        this.c = ih9Var;
        this.b = new Object();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                ((InputStream) this.b).close();
                return;
            default:
                ((ih9) this.c).close();
                return;
        }
    }

    @Override // defpackage.osa
    public final long read(my0 my0Var, long j) {
        int i = this.a;
        Object obj = this.c;
        AutoCloseable autoCloseable = this.b;
        long j2 = -1;
        switch (i) {
            case 0:
                my0Var.getClass();
                int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i2 != 0) {
                    if (i2 >= 0) {
                        try {
                            ((dac) obj).f();
                            e5a b1 = my0Var.b1(1);
                            int read = ((InputStream) autoCloseable).read(b1.a, b1.c, (int) Math.min(j, 8192 - b1.c));
                            if (read == -1) {
                                if (b1.b == b1.c) {
                                    my0Var.a = b1.a();
                                    n5a.a(b1);
                                }
                            } else {
                                b1.c += read;
                                j2 = read;
                                my0Var.b += j2;
                            }
                            return j2;
                        } catch (AssertionError e) {
                            if (dtd.a(e)) {
                                throw new IOException(e);
                            }
                            throw e;
                        }
                    }
                    p1a.k(hl5.k(j, "byteCount < 0: "));
                }
                return 0L;
            default:
                ly0 ly0Var = (ly0) autoCloseable;
                my0Var.getClass();
                long M = ((ih9) obj).M(ly0Var, j);
                if (M == -1) {
                    return -1L;
                }
                long j3 = M;
                while (j3 > 0) {
                    if (!ly0Var.k()) {
                        d5a d5aVar = ly0Var.a;
                        d5aVar.getClass();
                        byte[] bArr = d5aVar.a;
                        int i3 = d5aVar.b;
                        int i4 = d5aVar.c - i3;
                        my0Var.write(bArr, i3, i4);
                        if (i4 != 0) {
                            if (i4 >= 0) {
                                if (i4 <= d5aVar.b()) {
                                    ly0Var.skip(i4);
                                } else {
                                    vs.k("Returned too many bytes");
                                }
                            } else {
                                vs.k("Returned negative read bytes count");
                            }
                        }
                        j3 -= i4;
                    } else {
                        vs.m("Buffer is empty");
                    }
                    return 0L;
                    break;
                }
                return M;
        }
    }

    @Override // defpackage.osa
    public final dac timeout() {
        switch (this.a) {
            case 0:
                return (dac) this.c;
            default:
                return dac.d;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "source(" + ((InputStream) this.b) + ')';
            default:
                return super.toString();
        }
    }

    public qw5(InputStream inputStream, dac dacVar) {
        this.a = 0;
        inputStream.getClass();
        this.b = inputStream;
        this.c = dacVar;
    }
}
