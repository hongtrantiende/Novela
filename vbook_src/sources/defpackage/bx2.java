package defpackage;

import android.util.Pair;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bx2  reason: default package */
/* loaded from: classes3.dex */
public final class bx2 implements yma {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public bx2() {
        this.a = 1;
        this.b = new ArrayBlockingQueue(1);
        this.c = new AtomicBoolean();
        this.d = new AtomicReference();
    }

    @Override // defpackage.yma, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        int i2 = this.a;
        Object obj = this.c;
        switch (i2) {
            case 0:
                OutputStream outputStream = (OutputStream) this.b;
                asa asaVar = (asa) obj;
                oaa oaaVar = (oaa) this.d;
                asaVar.i();
                try {
                    AtomicInteger atomicInteger = (AtomicInteger) oaaVar.c;
                    Socket socket = (Socket) oaaVar.b;
                    atomicInteger.getClass();
                    while (true) {
                        int i3 = atomicInteger.get();
                        if ((i3 & 1) != 0) {
                            i = 0;
                        } else {
                            int i4 = i3 | 1;
                            if (atomicInteger.compareAndSet(i3, i4)) {
                                i = i4;
                            }
                        }
                    }
                    if (i != 0) {
                        if (i != 3) {
                            if (!socket.isClosed() && !socket.isOutputShutdown()) {
                                outputStream.flush();
                                try {
                                    socket.shutdownOutput();
                                } catch (UnsupportedOperationException unused) {
                                    outputStream.close();
                                }
                            }
                        } else {
                            socket.close();
                        }
                        if (asaVar.j()) {
                            throw asaVar.k(null);
                        }
                        return;
                    }
                    return;
                } catch (IOException e) {
                    if (!asaVar.j()) {
                        throw e;
                    }
                    throw asaVar.k(e);
                } finally {
                    asaVar.j();
                }
            default:
                ((AtomicBoolean) obj).set(true);
                return;
        }
    }

    @Override // defpackage.yma, java.io.Flushable
    public final void flush() {
        switch (this.a) {
            case 0:
                asa asaVar = (asa) this.c;
                asaVar.i();
                try {
                    ((OutputStream) this.b).flush();
                    if (!asaVar.j()) {
                        return;
                    }
                    throw asaVar.k(null);
                } catch (IOException e) {
                    if (!asaVar.j()) {
                        throw e;
                    }
                    throw asaVar.k(e);
                } finally {
                    asaVar.j();
                }
            default:
                return;
        }
    }

    @Override // defpackage.yma
    public final dac timeout() {
        switch (this.a) {
            case 0:
                return (asa) this.c;
            default:
                return dac.d;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "sink(" + ((Socket) ((oaa) this.d).b) + ')';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.yma
    public final void write(my0 my0Var, long j) {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                asa asaVar = (asa) obj2;
                bbe.n(my0Var.b, 0L, j);
                while (j > 0) {
                    asaVar.f();
                    e5a e5aVar = my0Var.a;
                    e5aVar.getClass();
                    int min = (int) Math.min(j, e5aVar.c - e5aVar.b);
                    asaVar.i();
                    try {
                        try {
                            ((OutputStream) obj).write(e5aVar.a, e5aVar.b, min);
                            if (!asaVar.j()) {
                                int i2 = e5aVar.b + min;
                                e5aVar.b = i2;
                                long j2 = min;
                                j -= j2;
                                my0Var.b -= j2;
                                if (i2 == e5aVar.c) {
                                    my0Var.a = e5aVar.a();
                                    n5a.a(e5aVar);
                                }
                            } else {
                                throw asaVar.k(null);
                            }
                        } catch (IOException e) {
                            if (!asaVar.j()) {
                                throw e;
                            }
                            throw asaVar.k(e);
                        }
                    } catch (Throwable th) {
                        asaVar.j();
                        throw th;
                    }
                }
                return;
            default:
                wq9.D(!((AtomicBoolean) obj2).get());
                while (j != 0) {
                    try {
                        Pair pair = (Pair) ((ArrayBlockingQueue) obj).take();
                        ByteBuffer byteBuffer = (ByteBuffer) pair.first;
                        gca gcaVar = (gca) pair.second;
                        int limit = byteBuffer.limit();
                        byteBuffer.limit((int) Math.min(limit, j));
                        try {
                            long read = my0Var.read(byteBuffer);
                            if (read != -1) {
                                j -= read;
                                byteBuffer.limit(limit);
                                gcaVar.l(byc.a);
                            } else {
                                IOException iOException = new IOException("The source has been exhausted but we expected more!");
                                gcaVar.m(iOException);
                                throw iOException;
                            }
                        } catch (IOException e2) {
                            gcaVar.m(e2);
                            throw e2;
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        fb4.k("Interrupted while waiting for a read to finish!");
                        return;
                    }
                }
                return;
        }
    }

    public bx2(oaa oaaVar) {
        this.a = 0;
        this.d = oaaVar;
        Socket socket = (Socket) oaaVar.b;
        this.b = socket.getOutputStream();
        this.c = new asa(socket);
    }

    private final void o() {
    }
}
