package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vk  reason: default package */
/* loaded from: classes.dex */
public final class vk implements a59, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long D;
    public long C;
    public final View a;
    public boolean c;
    public boolean f;
    public final PriorityQueue b = new PriorityQueue(11, new uk(0));
    public final Choreographer d = Choreographer.getInstance();
    public final n8b e = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
        if (r0 >= 30.0f) goto L8;
     */
    /* JADX WARN: Type inference failed for: r0v2, types: [n8b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public vk(android.view.View r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.a = r5
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            uk r1 = new uk
            r2 = 0
            r1.<init>(r2)
            r2 = 11
            r0.<init>(r2, r1)
            r4.b = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r4.d = r0
            n8b r0 = new n8b
            r0.<init>()
            r4.e = r0
            long r0 = defpackage.vk.D
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L49
            android.view.Display r0 = r5.getDisplay()
            boolean r1 = r5.isInEditMode()
            if (r1 != 0) goto L40
            if (r0 == 0) goto L40
            float r0 = r0.getRefreshRate()
            r1 = 1106247680(0x41f00000, float:30.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L40
            goto L42
        L40:
            r0 = 1114636288(0x42700000, float:60.0)
        L42:
            r1 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r1 = r1 / r0
            long r0 = (long) r1
            defpackage.vk.D = r0
        L49:
            r5.addOnAttachStateChangeListener(r4)
            boolean r5 = r5.isAttachedToWindow()
            if (r5 == 0) goto L55
            r5 = 1
            r4.f = r5
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vk.<init>(android.view.View):void");
    }

    @Override // defpackage.a59
    public final void a(z49 z49Var) {
        this.b.add(new f69(1, z49Var));
        if (!this.c) {
            this.c = true;
            this.a.post(this);
        }
    }

    public final boolean b() {
        n8b n8bVar = this.e;
        long a = n8bVar.a();
        ff.G(a, "compose:lazy:prefetch:available_time_nanos");
        boolean z = true;
        if (a > 0) {
            PriorityQueue priorityQueue = this.b;
            Object peek = priorityQueue.peek();
            peek.getClass();
            if (!((f69) peek).b.c(n8bVar)) {
                priorityQueue.poll();
                z = false;
            }
            n8bVar.a = false;
        }
        return z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f) {
            this.C = j;
            this.a.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f = false;
        this.a.removeCallbacks(this);
        this.d.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        PriorityQueue priorityQueue = this.b;
        if (!priorityQueue.isEmpty() && this.c && this.f) {
            View view = this.a;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                if (System.nanoTime() > (2 * D) + nanos) {
                    z = true;
                } else {
                    z = false;
                }
                n8b n8bVar = this.e;
                n8bVar.a = z;
                n8bVar.b = Math.max(this.C, nanos) + D;
                boolean z2 = false;
                while (!priorityQueue.isEmpty() && !z2) {
                    if (n8bVar.a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            z2 = b();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        z2 = b();
                    }
                }
                if (z2) {
                    this.d.postFrameCallback(this);
                } else {
                    this.c = false;
                }
                ff.G(0L, "compose:lazy:prefetch:available_time_nanos");
                return;
            }
        }
        this.c = false;
    }
}
