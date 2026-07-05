package okhttp3.internal.connection;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.platform.Platform;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class RealConnectionPool {
    public final long a;
    public final TaskQueue b;
    public final RealConnectionPool$cleanupTask$1 c;
    public final ConcurrentLinkedQueue d;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [okhttp3.internal.connection.RealConnectionPool$cleanupTask$1] */
    public RealConnectionPool(TaskRunner taskRunner) {
        taskRunner.getClass();
        TimeUnit.MINUTES.getClass();
        this.a = 300000000000L;
        this.b = taskRunner.d();
        final String q = s21.q(new StringBuilder(), _UtilJvmKt.b, " ConnectionPool connection closer");
        this.c = new Task(q) { // from class: okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public final long a() {
                RealConnectionPool realConnectionPool = RealConnectionPool.this;
                long nanoTime = System.nanoTime();
                long j = (nanoTime - realConnectionPool.a) + 1;
                Iterator it = realConnectionPool.d.iterator();
                it.getClass();
                RealConnection realConnection = null;
                long j2 = Long.MAX_VALUE;
                int i = 0;
                RealConnection realConnection2 = null;
                RealConnection realConnection3 = null;
                int i2 = 0;
                while (it.hasNext()) {
                    RealConnection realConnection4 = (RealConnection) it.next();
                    realConnection4.getClass();
                    synchronized (realConnection4) {
                        if (realConnectionPool.a(realConnection4, nanoTime) > 0) {
                            i2++;
                        } else {
                            long j3 = realConnection4.M;
                            if (j3 < j) {
                                realConnection2 = realConnection4;
                                j = j3;
                            }
                            i++;
                            if (j3 < j2) {
                                realConnection3 = realConnection4;
                                j2 = j3;
                            }
                        }
                    }
                }
                if (realConnection2 != null) {
                    realConnection = realConnection2;
                } else if (i > 5) {
                    j = j2;
                    realConnection = realConnection3;
                } else {
                    j = -1;
                }
                if (realConnection != null) {
                    synchronized (realConnection) {
                        if (!realConnection.L.isEmpty()) {
                            return 0L;
                        }
                        if (realConnection.M != j) {
                            return 0L;
                        }
                        realConnection.F = true;
                        realConnectionPool.d.remove(realConnection);
                        _UtilJvmKt.c(realConnection.e);
                        if (realConnectionPool.d.isEmpty()) {
                            realConnectionPool.b.a();
                        }
                        return 0L;
                    }
                } else if (realConnection3 != null) {
                    return (j2 + realConnectionPool.a) - nanoTime;
                } else {
                    if (i2 <= 0) {
                        return -1L;
                    }
                    return realConnectionPool.a;
                }
            }
        };
        this.d = new ConcurrentLinkedQueue();
    }

    public final int a(RealConnection realConnection, long j) {
        TimeZone timeZone = _UtilJvmKt.a;
        ArrayList arrayList = realConnection.L;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                Platform platform = Platform.a;
                Platform.a.k(((RealCall.CallReference) reference).a, "A connection to " + realConnection.c.a.h + " was leaked. Did you forget to close a response body?");
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    realConnection.M = j - this.a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
