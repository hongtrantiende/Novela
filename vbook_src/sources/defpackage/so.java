package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: so  reason: default package */
/* loaded from: classes.dex */
public final class so implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ to a;

    public so(to toVar) {
        this.a = toVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a.d.removeCallbacks(this);
        to.y0(this.a);
        to toVar = this.a;
        synchronized (toVar.e) {
            if (!toVar.F) {
                return;
            }
            toVar.F = false;
            ArrayList arrayList = toVar.C;
            toVar.C = toVar.D;
            toVar.D = arrayList;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
            }
            arrayList.clear();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        to.y0(this.a);
        to toVar = this.a;
        synchronized (toVar.e) {
            if (toVar.C.isEmpty()) {
                toVar.c.removeFrameCallback(this);
                toVar.F = false;
            }
        }
    }
}
