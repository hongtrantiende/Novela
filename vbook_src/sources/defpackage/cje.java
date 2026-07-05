package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cje  reason: default package */
/* loaded from: classes.dex */
public final class cje implements ThreadFactory {
    public final /* synthetic */ int a;
    public final ThreadFactory b;

    public cje(qke qkeVar) {
        this.a = 0;
        this.b = Executors.defaultThreadFactory();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        ThreadFactory threadFactory = this.b;
        switch (i) {
            case 0:
                Thread newThread = threadFactory.newThread(runnable);
                newThread.setName("ScionFrontendApi");
                return newThread;
            default:
                return threadFactory.newThread(new uw9(runnable, 5));
        }
    }

    public /* synthetic */ cje(ThreadFactory threadFactory) {
        this.a = 1;
        this.b = threadFactory;
    }
}
