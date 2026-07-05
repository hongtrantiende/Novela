package defpackage;

import android.view.MotionEvent;
import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ep  reason: default package */
/* loaded from: classes.dex */
public final class ep extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wcd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ep(wcd wcdVar, int i) {
        super(1);
        this.a = i;
        this.b = wcdVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        rg rgVar;
        boolean dispatchTouchEvent;
        int i = this.a;
        pvc pvcVar = pvc.a;
        wcd wcdVar = this.b;
        switch (i) {
            case 0:
                wg8 wg8Var = (wg8) obj;
                if (wg8Var instanceof rg) {
                    rgVar = (rg) wg8Var;
                } else {
                    rgVar = null;
                }
                if (rgVar != null) {
                    qp qpVar = rgVar.l0;
                    if (qpVar == null) {
                        qpVar = new qp(rgVar.getContext());
                        rgVar.addView(qpVar, -1);
                        rgVar.requestLayout();
                        rgVar.l0 = qpVar;
                    }
                    qpVar.removeViewInLayout(wcdVar);
                    HashMap<od6, kp> layoutNodeToHolder = qpVar.getLayoutNodeToHolder();
                    jsc.s(layoutNodeToHolder).remove(qpVar.getHolderToLayoutNode().remove(wcdVar));
                    wcdVar.setImportantForAccessibility(0);
                }
                wcdVar.removeAllViewsInLayout();
                return pvcVar;
            case 1:
                wcdVar.M = (xt4) obj;
                return pvcVar;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        dispatchTouchEvent = wcdVar.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        dispatchTouchEvent = wcdVar.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(dispatchTouchEvent);
        }
    }
}
