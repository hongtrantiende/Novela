package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: to  reason: default package */
/* loaded from: classes.dex */
public final class to extends f82 {
    public static final mfb I = new mfb(fh.G);
    public static final ro J = new ro(0);
    public boolean E;
    public boolean F;
    public final vo H;
    public final Choreographer c;
    public final Handler d;
    public final Object e = new Object();
    public final rz f = new rz();
    public ArrayList C = new ArrayList();
    public ArrayList D = new ArrayList();
    public final so G = new so(this);

    public to(Choreographer choreographer, Handler handler) {
        this.c = choreographer;
        this.d = handler;
        this.H = new vo(choreographer, this);
    }

    public static final void y0(to toVar) {
        Object removeFirst;
        Runnable runnable;
        boolean z;
        Object removeFirst2;
        do {
            synchronized (toVar.e) {
                rz rzVar = toVar.f;
                if (rzVar.isEmpty()) {
                    removeFirst = null;
                } else {
                    removeFirst = rzVar.removeFirst();
                }
                runnable = (Runnable) removeFirst;
            }
            while (runnable != null) {
                runnable.run();
                synchronized (toVar.e) {
                    rz rzVar2 = toVar.f;
                    if (rzVar2.isEmpty()) {
                        removeFirst2 = null;
                    } else {
                        removeFirst2 = rzVar2.removeFirst();
                    }
                    runnable = (Runnable) removeFirst2;
                }
            }
            synchronized (toVar.e) {
                if (toVar.f.isEmpty()) {
                    z = false;
                    toVar.E = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // defpackage.f82
    public final void C(d82 d82Var, Runnable runnable) {
        synchronized (this.e) {
            this.f.addLast(runnable);
            if (!this.E) {
                this.E = true;
                this.d.post(this.G);
                if (!this.F) {
                    this.F = true;
                    this.c.postFrameCallback(this.G);
                }
            }
        }
    }
}
