package defpackage;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bte  reason: default package */
/* loaded from: classes.dex */
public final class bte extends Thread {
    public final Object a;
    public final BlockingQueue b;
    public boolean c = false;
    public final /* synthetic */ ete d;

    public bte(ete eteVar, String str, BlockingQueue blockingQueue) {
        this.d = eteVar;
        am8.s(blockingQueue);
        this.a = new Object();
        this.b = blockingQueue;
        setName(str);
    }

    public final void a() {
        ete eteVar = this.d;
        synchronized (eteVar.E) {
            try {
                if (!this.c) {
                    eteVar.F.release();
                    eteVar.E.notifyAll();
                    if (this == eteVar.c) {
                        eteVar.c = null;
                    } else if (this == eteVar.d) {
                        eteVar.d = null;
                    } else {
                        ppe ppeVar = ((lte) eteVar.a).f;
                        lte.m(ppeVar);
                        ppeVar.f.e("Current scheduler thread is neither worker nor network");
                    }
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i;
        boolean z = false;
        while (!z) {
            try {
                this.d.F.acquire();
                z = true;
            } catch (InterruptedException e) {
                ppe ppeVar = ((lte) this.d.a).f;
                lte.m(ppeVar);
                ppeVar.E.f(e, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.b;
                yse yseVar = (yse) blockingQueue.poll();
                if (yseVar != null) {
                    if (true != yseVar.b) {
                        i = 10;
                    } else {
                        i = threadPriority;
                    }
                    Process.setThreadPriority(i);
                    yseVar.run();
                } else {
                    Object obj = this.a;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.d.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e2) {
                                ppe ppeVar2 = ((lte) this.d.a).f;
                                lte.m(ppeVar2);
                                ppeVar2.E.f(e2, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.d.E) {
                        if (this.b.peek() == null) {
                            a();
                            a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            a();
            throw th;
        }
    }
}
