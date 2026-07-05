package defpackage;

import android.view.MotionEvent;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f19  reason: default package */
/* loaded from: classes.dex */
public final class f19 extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g19 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f19(g19 g19Var, int i) {
        super(1);
        this.a = i;
        this.b = g19Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        g19 g19Var = this.b;
        switch (i) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                ep epVar = g19Var.a;
                if (epVar != null) {
                    epVar.invoke(motionEvent);
                    return pvcVar;
                }
                c16.w("onTouchEvent");
                throw null;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                ep epVar2 = g19Var.a;
                if (epVar2 != null) {
                    epVar2.invoke(motionEvent2);
                    return pvcVar;
                }
                c16.w("onTouchEvent");
                throw null;
        }
    }
}
