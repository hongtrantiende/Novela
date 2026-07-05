package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lg  reason: default package */
/* loaded from: classes.dex */
public final class lg extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lg(rg rgVar, int i) {
        super(1);
        this.a = i;
        this.b = rgVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        Looper looper;
        int i = this.a;
        pvc pvcVar = pvc.a;
        rg rgVar = this.b;
        switch (i) {
            case 0:
                ((rm4) rgVar.getFocusOwner()).g(((em4) obj).a, false);
                return pvcVar;
            case 1:
                vt4 vt4Var = (vt4) obj;
                rgVar.getUncaughtExceptionHandler$ui();
                Handler handler = rgVar.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                } else {
                    looper = null;
                }
                if (looper == Looper.myLooper()) {
                    vt4Var.invoke();
                } else {
                    Handler handler2 = rgVar.getHandler();
                    if (handler2 != null) {
                        handler2.post(new bg(1, vt4Var));
                    }
                }
                return pvcVar;
            case 2:
                return new kk(rgVar, rgVar.getTextInputService(), (m82) obj);
            case 3:
                vx1 vx1Var = (vx1) obj;
                return rgVar.getInputModeManager();
            case 4:
                vx1 vx1Var2 = (vx1) obj;
                return rgVar.getTextInputService();
            case 5:
                vx1 vx1Var3 = (vx1) obj;
                return rgVar.getSoftwareKeyboardController();
            case 6:
                vx1 vx1Var4 = (vx1) obj;
                return rgVar.getTextToolbar();
            default:
                vx1 vx1Var5 = (vx1) obj;
                return rgVar.getPointerIconService();
        }
    }
}
