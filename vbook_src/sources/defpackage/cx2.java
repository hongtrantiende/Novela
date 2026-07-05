package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cx2  reason: default package */
/* loaded from: classes3.dex */
public final class cx2 implements osa {
    public final InputStream a;
    public final asa b;
    public final /* synthetic */ oaa c;

    public cx2(oaa oaaVar) {
        this.c = oaaVar;
        Socket socket = (Socket) oaaVar.b;
        this.a = socket.getInputStream();
        this.b = new asa(socket);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        oaa oaaVar = this.c;
        asa asaVar = this.b;
        asaVar.i();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) oaaVar.c;
            Socket socket = (Socket) oaaVar.b;
            atomicInteger.getClass();
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 2) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 2;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i != 3) {
                    if (!socket.isClosed() && !socket.isInputShutdown()) {
                        try {
                            socket.shutdownInput();
                        } catch (UnsupportedOperationException unused) {
                            this.a.close();
                        }
                    } else {
                        return;
                    }
                } else {
                    socket.close();
                }
                if (!asaVar.j()) {
                    return;
                }
                throw asaVar.k(null);
            }
        } catch (IOException e) {
            if (!asaVar.j()) {
                throw e;
            }
            throw asaVar.k(e);
        } finally {
            asaVar.j();
        }
    }

    @Override // defpackage.osa
    public final long read(my0 my0Var, long j) {
        my0Var.getClass();
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return 0L;
        }
        if (i >= 0) {
            asa asaVar = this.b;
            asaVar.f();
            e5a b1 = my0Var.b1(1);
            int min = (int) Math.min(j, 8192 - b1.c);
            try {
                asaVar.i();
                try {
                    int read = this.a.read(b1.a, b1.c, min);
                    if (!asaVar.j()) {
                        if (read == -1) {
                            if (b1.b == b1.c) {
                                my0Var.a = b1.a();
                                n5a.a(b1);
                                return -1L;
                            }
                            return -1L;
                        }
                        b1.c += read;
                        long j2 = read;
                        my0Var.b += j2;
                        return j2;
                    }
                    throw asaVar.k(null);
                } catch (IOException e) {
                    if (!asaVar.j()) {
                        throw e;
                    }
                    throw asaVar.k(e);
                }
            } catch (AssertionError e2) {
                if (dtd.a(e2)) {
                    throw new IOException(e2);
                }
                throw e2;
            }
        }
        p1a.k(hl5.k(j, "byteCount < 0: "));
        return 0L;
    }

    @Override // defpackage.osa
    public final dac timeout() {
        return this.b;
    }

    public final String toString() {
        return "source(" + ((Socket) this.c.b) + ')';
    }
}
