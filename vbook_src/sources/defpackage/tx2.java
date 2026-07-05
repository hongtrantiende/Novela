package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tx2  reason: default package */
/* loaded from: classes.dex */
public final class tx2 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final Number b;

    public tx2() {
        this.a = 0;
        this.b = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        Number number = this.b;
        switch (i) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) number).getAndIncrement());
                return thread;
            default:
                Thread newThread = Executors.defaultThreadFactory().newThread(new xy3(runnable, 0));
                newThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) number).getAndIncrement());
                return newThread;
        }
    }

    public tx2(AtomicLong atomicLong) {
        this.a = 1;
        this.b = atomicLong;
    }
}
