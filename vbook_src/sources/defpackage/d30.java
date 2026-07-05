package defpackage;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d30  reason: default package */
/* loaded from: classes.dex */
public final class d30 extends Thread {
    public final /* synthetic */ int a = 0;

    public /* synthetic */ d30(String str) {
        super(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        e30 g;
        switch (this.a) {
            case 0:
                break;
            default:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
        }
        while (true) {
            try {
                jt1 jt1Var = e30.h;
                reentrantLock = e30.j;
                reentrantLock.lock();
                g = p40.g();
            } catch (InterruptedException unused2) {
            }
            if (g == e30.i) {
                e30.i = null;
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            if (g != null) {
                g.l();
            }
        }
    }

    public /* synthetic */ d30(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
