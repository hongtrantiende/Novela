package okhttp3.internal.connection;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RoutePlanner;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class FastFallbackExchangeFinder implements ExchangeFinder {
    public final RealRoutePlanner a;
    public final TaskRunner b;
    public long c;
    public final CopyOnWriteArrayList d;
    public final BlockingQueue e;

    public FastFallbackExchangeFinder(RealRoutePlanner realRoutePlanner, TaskRunner taskRunner) {
        taskRunner.getClass();
        this.a = realRoutePlanner;
        this.b = taskRunner;
        this.c = Long.MIN_VALUE;
        this.d = new CopyOnWriteArrayList();
        this.e = new LinkedBlockingDeque();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004a A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0006, B:5:0x000c, B:12:0x001d, B:14:0x0023, B:22:0x004a, B:25:0x0054, B:28:0x005f, B:31:0x0068, B:33:0x0070, B:38:0x0079, B:40:0x0082, B:41:0x0086, B:43:0x008a, B:47:0x0091, B:50:0x009b, B:52:0x009f, B:55:0x00a5, B:56:0x00a9, B:57:0x00ad, B:58:0x00ae, B:60:0x00b2, B:20:0x003e, B:61:0x00b9, B:62:0x00c0), top: B:65:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0006, B:5:0x000c, B:12:0x001d, B:14:0x0023, B:22:0x004a, B:25:0x0054, B:28:0x005f, B:31:0x0068, B:33:0x0070, B:38:0x0079, B:40:0x0082, B:41:0x0086, B:43:0x008a, B:47:0x0091, B:50:0x009b, B:52:0x009f, B:55:0x00a5, B:56:0x00a9, B:57:0x00ad, B:58:0x00ae, B:60:0x00b2, B:20:0x003e, B:61:0x00b9, B:62:0x00c0), top: B:65:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0006, B:5:0x000c, B:12:0x001d, B:14:0x0023, B:22:0x004a, B:25:0x0054, B:28:0x005f, B:31:0x0068, B:33:0x0070, B:38:0x0079, B:40:0x0082, B:41:0x0086, B:43:0x008a, B:47:0x0091, B:50:0x009b, B:52:0x009f, B:55:0x00a5, B:56:0x00a9, B:57:0x00ad, B:58:0x00ae, B:60:0x00b2, B:20:0x003e, B:61:0x00b9, B:62:0x00c0), top: B:65:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0006 A[SYNTHETIC] */
    @Override // okhttp3.internal.connection.ExchangeFinder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.internal.connection.RealConnection a() {
        /*
            r10 = this;
            okhttp3.internal.connection.RealRoutePlanner r0 = r10.a
            java.util.concurrent.CopyOnWriteArrayList r1 = r10.d
            r2 = 0
            r3 = r2
        L6:
            boolean r4 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r4 == 0) goto L1d
            boolean r4 = r0.a(r2)     // Catch: java.lang.Throwable -> L1a
            if (r4 == 0) goto L13
            goto L1d
        L13:
            r10.c()
            r3.getClass()
            throw r3
        L1a:
            r0 = move-exception
            goto Lc1
        L1d:
            okhttp3.internal.connection.RealCall r4 = r0.k     // Catch: java.lang.Throwable -> L1a
            boolean r4 = r4.N     // Catch: java.lang.Throwable -> L1a
            if (r4 != 0) goto Lb9
            okhttp3.internal.concurrent.TaskRunner r4 = r10.b     // Catch: java.lang.Throwable -> L1a
            okhttp3.internal.concurrent.TaskRunner$RealBackend r4 = r4.a     // Catch: java.lang.Throwable -> L1a
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L1a
            long r6 = r10.c     // Catch: java.lang.Throwable -> L1a
            long r6 = r6 - r4
            boolean r8 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r8 != 0) goto L3e
            r8 = 0
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 > 0) goto L3b
            goto L3e
        L3b:
            r7 = r6
            r6 = r2
            goto L48
        L3e:
            okhttp3.internal.connection.RoutePlanner$ConnectResult r6 = r10.d()     // Catch: java.lang.Throwable -> L1a
            r7 = 250000000(0xee6b280, double:1.235164115E-315)
            long r4 = r4 + r7
            r10.c = r4     // Catch: java.lang.Throwable -> L1a
        L48:
            if (r6 != 0) goto L68
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L1a
            boolean r5 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r5 == 0) goto L54
        L52:
            r6 = r2
            goto L65
        L54:
            java.util.concurrent.BlockingQueue r5 = r10.e     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r4 = r5.poll(r7, r4)     // Catch: java.lang.Throwable -> L1a
            okhttp3.internal.connection.RoutePlanner$ConnectResult r4 = (okhttp3.internal.connection.RoutePlanner.ConnectResult) r4     // Catch: java.lang.Throwable -> L1a
            if (r4 != 0) goto L5f
            goto L52
        L5f:
            okhttp3.internal.connection.RoutePlanner$Plan r5 = r4.a     // Catch: java.lang.Throwable -> L1a
            r1.remove(r5)     // Catch: java.lang.Throwable -> L1a
            r6 = r4
        L65:
            if (r6 != 0) goto L68
            goto L6
        L68:
            okhttp3.internal.connection.RoutePlanner$Plan r4 = r6.a     // Catch: java.lang.Throwable -> L1a
            okhttp3.internal.connection.RoutePlanner$Plan r5 = r6.b     // Catch: java.lang.Throwable -> L1a
            r7 = 0
            r8 = 1
            if (r5 != 0) goto L76
            java.lang.Throwable r5 = r6.c     // Catch: java.lang.Throwable -> L1a
            if (r5 != 0) goto L76
            r5 = r8
            goto L77
        L76:
            r5 = r7
        L77:
            if (r5 == 0) goto L9b
            r10.c()     // Catch: java.lang.Throwable -> L1a
            boolean r5 = r4.a()     // Catch: java.lang.Throwable -> L1a
            if (r5 != 0) goto L86
            okhttp3.internal.connection.RoutePlanner$ConnectResult r6 = r4.g()     // Catch: java.lang.Throwable -> L1a
        L86:
            okhttp3.internal.connection.RoutePlanner$Plan r4 = r6.b     // Catch: java.lang.Throwable -> L1a
            if (r4 != 0) goto L8f
            java.lang.Throwable r4 = r6.c     // Catch: java.lang.Throwable -> L1a
            if (r4 != 0) goto L8f
            r7 = r8
        L8f:
            if (r7 == 0) goto L9b
            okhttp3.internal.connection.RoutePlanner$Plan r0 = r6.a     // Catch: java.lang.Throwable -> L1a
            okhttp3.internal.connection.RealConnection r0 = r0.d()     // Catch: java.lang.Throwable -> L1a
            r10.c()
            return r0
        L9b:
            java.lang.Throwable r4 = r6.c     // Catch: java.lang.Throwable -> L1a
            if (r4 == 0) goto Lae
            boolean r5 = r4 instanceof java.io.IOException     // Catch: java.lang.Throwable -> L1a
            if (r5 == 0) goto Lad
            if (r3 != 0) goto La9
            java.io.IOException r4 = (java.io.IOException) r4     // Catch: java.lang.Throwable -> L1a
            r3 = r4
            goto Lae
        La9:
            defpackage.pye.e(r3, r4)     // Catch: java.lang.Throwable -> L1a
            goto Lae
        Lad:
            throw r4     // Catch: java.lang.Throwable -> L1a
        Lae:
            okhttp3.internal.connection.RoutePlanner$Plan r4 = r6.b     // Catch: java.lang.Throwable -> L1a
            if (r4 == 0) goto L6
            rz r5 = r0.p     // Catch: java.lang.Throwable -> L1a
            r5.addFirst(r4)     // Catch: java.lang.Throwable -> L1a
            goto L6
        Lb9:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "Canceled"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1a
            throw r0     // Catch: java.lang.Throwable -> L1a
        Lc1:
            r10.c()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.FastFallbackExchangeFinder.a():okhttp3.internal.connection.RealConnection");
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    public final RoutePlanner b() {
        return this.a;
    }

    public final void c() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            RoutePlanner.Plan plan = (RoutePlanner.Plan) it.next();
            plan.cancel();
            RoutePlanner.Plan b = plan.b();
            if (b != null) {
                this.a.p.addLast(b);
            }
        }
        copyOnWriteArrayList.clear();
    }

    public final RoutePlanner.ConnectResult d() {
        final RoutePlanner.Plan failedPlan;
        RealRoutePlanner realRoutePlanner = this.a;
        if (realRoutePlanner.a(null)) {
            try {
                failedPlan = realRoutePlanner.d();
            } catch (Throwable th) {
                failedPlan = new FailedPlan(th);
            }
            if (failedPlan.a()) {
                return new RoutePlanner.ConnectResult(failedPlan, null, null, 6);
            }
            if (failedPlan instanceof FailedPlan) {
                return ((FailedPlan) failedPlan).a;
            }
            this.d.add(failedPlan);
            final String str = _UtilJvmKt.b + " connect " + realRoutePlanner.i.h.g();
            this.b.d().d(new Task(str) { // from class: okhttp3.internal.connection.FastFallbackExchangeFinder$launchTcpConnect$1
                @Override // okhttp3.internal.concurrent.Task
                public final long a() {
                    RoutePlanner.ConnectResult connectResult;
                    RoutePlanner.Plan plan = failedPlan;
                    try {
                        connectResult = plan.e();
                    } catch (Throwable th2) {
                        connectResult = new RoutePlanner.ConnectResult(plan, null, th2, 2);
                    }
                    FastFallbackExchangeFinder fastFallbackExchangeFinder = this;
                    if (fastFallbackExchangeFinder.d.contains(plan)) {
                        fastFallbackExchangeFinder.e.put(connectResult);
                        return -1L;
                    }
                    return -1L;
                }
            }, 0L);
        }
        return null;
    }
}
