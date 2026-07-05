package defpackage;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n21  reason: default package */
/* loaded from: classes3.dex */
public final class n21 implements ih9 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public n21(s11 s11Var) {
        s11Var.getClass();
        this.b = s11Var;
    }

    @Override // defpackage.ih9
    public final long M(ly0 ly0Var, long j) {
        byte[] bArr;
        int i;
        int i2;
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                ly0Var.getClass();
                s11 s11Var = (s11) obj;
                if (s11Var.h().k()) {
                    z87.C(gs3.a, new oi(this, (m42) null, 6));
                }
                if (s11Var.h().k()) {
                    return -1L;
                }
                return s11Var.h().M(ly0Var, j);
            default:
                ly0Var.getClass();
                int i4 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i4 == 0) {
                    return 0L;
                }
                if (i4 >= 0) {
                    boolean z = false;
                    try {
                        d5a g0 = ly0Var.g0(1);
                        long read = ((InputStream) obj).read(g0.a, g0.c, (int) Math.min(j, bArr.length - i));
                        if (read == -1) {
                            i2 = 0;
                        } else {
                            i2 = (int) read;
                        }
                        if (i2 == 1) {
                            g0.c += i2;
                            ly0Var.c += i2;
                        } else if (i2 >= 0 && i2 <= g0.a()) {
                            if (i2 != 0) {
                                g0.c += i2;
                                ly0Var.c += i2;
                            } else if (zxe.q(g0)) {
                                ly0Var.Q();
                            }
                        } else {
                            throw new IllegalStateException(("Invalid number of bytes written: " + i2 + ". Should be in 0.." + g0.a()).toString());
                        }
                        return read;
                    } catch (AssertionError e) {
                        if (e.getCause() != null) {
                            String message = e.getMessage();
                            if (message != null) {
                                z = k4b.V(message, "getsockname failed", false);
                            }
                            if (z) {
                                throw new IOException(e);
                            }
                        }
                        throw e;
                    }
                }
                p1a.k(nk2.t(j, "byteCount (", ") < 0"));
                return 0L;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                s9e.m((s11) this.b);
                return;
            default:
                ((InputStream) this.b).close();
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "RawSource(" + ((InputStream) this.b) + ')';
            default:
                return super.toString();
        }
    }

    public n21(InputStream inputStream) {
        inputStream.getClass();
        this.b = inputStream;
    }
}
