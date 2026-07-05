package defpackage;

import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.RequestBody;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vp9  reason: default package */
/* loaded from: classes.dex */
public final class vp9 extends UploadDataProvider {
    public final RequestBody a;
    public final bx2 b;
    public final er7 c;
    public final long d;
    public ListenableFuture e;
    public long f;

    public vp9(RequestBody requestBody, bx2 bx2Var, ExecutorService executorService, long j) {
        er7 er7Var;
        er7 er7Var2;
        this.a = requestBody;
        this.b = bx2Var;
        boolean z = executorService instanceof er7;
        if (z) {
            this.c = (er7) executorService;
        } else {
            if (z) {
                er7Var2 = (er7) executorService;
            } else {
                if (executorService instanceof ScheduledExecutorService) {
                    er7Var = new hr7((ScheduledExecutorService) executorService);
                } else {
                    er7Var = new er7(executorService);
                }
                er7Var2 = er7Var;
            }
            this.c = er7Var2;
        }
        this.d = j == 0 ? 2147483647L : j;
    }

    public static IOException q(long j, long j2) {
        int length = "Expected ".length();
        StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + " bytes but got at least ".length() + String.valueOf(j).length() + length);
        sb.append("Expected ");
        sb.append(j);
        sb.append(" bytes but got at least ");
        sb.append(j2);
        return new IOException(sb.toString());
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [x1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [x1, java.lang.Object] */
    public final byc C(ByteBuffer byteBuffer) {
        Future future;
        int position = byteBuffer.position();
        bx2 bx2Var = this.b;
        AtomicReference atomicReference = (AtomicReference) bx2Var.d;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            ?? obj = new Object();
            obj.m(th);
            future = obj;
        } else {
            ?? obj2 = new Object();
            ((ArrayBlockingQueue) bx2Var.b).add(Pair.create(byteBuffer, obj2));
            Throwable th2 = (Throwable) atomicReference.get();
            if (th2 != null) {
                obj2.m(th2);
            }
            future = obj2;
        }
        boolean z = false;
        try {
            long nanos = TimeUnit.MILLISECONDS.toNanos(this.d);
            Future future2 = future;
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                    future2 = future2;
                }
            }
            byc bycVar = (byc) future2.get(nanos, TimeUnit.NANOSECONDS);
            this.f += byteBuffer.position() - position;
            return bycVar;
        } finally {
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.a.a();
    }

    public final void o(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        boolean z;
        int position = byteBuffer.position();
        byteBuffer.position(0);
        if (C(byteBuffer).equals(byc.b)) {
            if (byteBuffer.position() == 0) {
                z = true;
            } else {
                z = false;
            }
            Object[] objArr = new Object[0];
            if (z) {
                byteBuffer.position(position);
                uploadDataSink.onReadSucceeded(false);
                return;
            }
            throw new gt1(hma.v("END_OF_BODY reads shouldn't write anything to the buffer", objArr), 12);
        }
        throw q(this.a.a(), this.f);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (this.e == null) {
            ListenableFuture o = this.c.o(new k92(this, 1));
            this.e = o;
            o.a(new bv4(0, o, new l97(this)), e73.a);
        }
        RequestBody requestBody = this.a;
        if (requestBody.a() == -1) {
            try {
                uploadDataSink.onReadSucceeded(C(byteBuffer).equals(byc.b));
                return;
            } catch (ExecutionException | TimeoutException e) {
                this.e.cancel(true);
                uploadDataSink.onReadError(new IOException(e));
                return;
            }
        }
        try {
            byc C = C(byteBuffer);
            if (this.f <= requestBody.a()) {
                if (this.f < requestBody.a()) {
                    int ordinal = C.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            return;
                        }
                        throw new IOException("The source has been exhausted but we expected more data!");
                    }
                    uploadDataSink.onReadSucceeded(false);
                    return;
                }
                o(uploadDataSink, byteBuffer);
                return;
            }
            throw q(requestBody.a(), this.f);
        } catch (ExecutionException e2) {
            e = e2;
            this.e.cancel(true);
            uploadDataSink.onReadError(new IOException(e));
        } catch (TimeoutException e3) {
            e = e3;
            this.e.cancel(true);
            uploadDataSink.onReadError(new IOException(e));
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        uploadDataSink.onRewindError(new UnsupportedOperationException("Rewind is not supported!"));
    }
}
