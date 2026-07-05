package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class wm implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;

    public /* synthetic */ wm(cn cnVar, int i) {
        this.a = i;
        this.b = cnVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        Looper looper;
        int i = this.a;
        pvc pvcVar = pvc.a;
        cn cnVar = this.b;
        switch (i) {
            case 0:
                vt4 vt4Var = (vt4) obj;
                View view = cnVar.a;
                Handler handler = view.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                } else {
                    looper = null;
                }
                if (looper == Looper.myLooper()) {
                    vt4Var.invoke();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new bg(2, vt4Var));
                    }
                }
                return pvcVar;
            case 1:
                ActionMode actionMode = cnVar.h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return pvcVar;
            case 2:
                ActionMode actionMode2 = cnVar.h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return pvcVar;
            default:
                ib3 ib3Var = (ib3) obj;
                cnVar.e.e();
                return new r6(cnVar, 3);
        }
    }
}
