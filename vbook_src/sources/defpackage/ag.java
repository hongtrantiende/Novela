package defpackage;

import android.os.Trace;
import android.view.MotionEvent;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ag  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ag implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rg b;

    public /* synthetic */ ag(rg rgVar, int i) {
        this.a = i;
        this.b = rgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        rg rgVar = this.b;
        switch (i) {
            case 0:
                rz rzVar = rgVar.D;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!rzVar.isEmpty()) {
                    try {
                        ((vt4) rzVar.removeLast()).invoke();
                    } finally {
                        Trace.endSection();
                    }
                }
                return;
            case 1:
                rgVar.S0 = false;
                MotionEvent motionEvent = rgVar.I0;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    rgVar.M(motionEvent);
                    return;
                } else {
                    vs.k("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                rg.k(rgVar.getRoot());
                return;
            default:
                rg.k(rgVar.getRoot());
                return;
        }
    }
}
