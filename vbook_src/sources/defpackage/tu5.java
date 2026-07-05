package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tu5  reason: default package */
/* loaded from: classes.dex */
public final class tu5 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ uu5 a;

    public tu5(uu5 uu5Var) {
        this.a = uu5Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        uu5 uu5Var = this.a;
        lg lgVar = (lg) uu5Var.c;
        if (!uu5Var.a) {
            int i = uu5Var.b;
            int i2 = 2;
            if (i == 1) {
                if (Math.abs(f) > Math.abs(f2)) {
                    if (f > nae.e) {
                        i2 = 1;
                    }
                    ((rm4) lgVar.b.getFocusOwner()).g(i2, false);
                    return true;
                }
            } else if (i == 2 && Math.abs(f2) > Math.abs(f)) {
                if (f2 > nae.e) {
                    i2 = 1;
                }
                ((rm4) lgVar.b.getFocusOwner()).g(i2, false);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
