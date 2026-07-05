package defpackage;

import android.os.Process;
import java.util.ArrayDeque;
import java.util.Deque;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uw9  reason: default package */
/* loaded from: classes.dex */
public final class uw9 implements Runnable {
    public final /* synthetic */ int a;
    public final Runnable b;

    public /* synthetic */ uw9(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Runnable runnable = this.b;
        switch (i) {
            case 0:
                try {
                    runnable.run();
                    return;
                } catch (Exception e) {
                    mwe.m(e, "Executor", "Background execution failure.");
                    return;
                }
            case 1:
                runnable.run();
                return;
            case 2:
                runnable.run();
                return;
            case 3:
                Process.setThreadPriority(0);
                runnable.run();
                return;
            case 4:
                Deque deque = (Deque) wc7.b.get();
                am8.s(deque);
                deque.add(runnable);
                if (deque.size() <= 1) {
                    do {
                        runnable.run();
                        deque.removeFirst();
                        runnable = (Runnable) deque.peekFirst();
                    } while (runnable != null);
                    return;
                }
                return;
            default:
                wc7.b.set(new ArrayDeque());
                runnable.run();
                return;
        }
    }

    public String toString() {
        int i = this.a;
        Runnable runnable = this.b;
        switch (i) {
            case 1:
                return runnable.toString();
            case 2:
                return runnable.toString();
            default:
                return super.toString();
        }
    }
}
