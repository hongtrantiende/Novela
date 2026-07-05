package defpackage;

import android.os.Handler;
import android.os.Looper;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pk  reason: default package */
/* loaded from: classes.dex */
public final class pk extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i29 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pk(i29 i29Var, int i) {
        super(1);
        this.a = i;
        this.b = i29Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        Looper looper;
        int i = this.a;
        pvc pvcVar = pvc.a;
        i29 i29Var = this.b;
        switch (i) {
            case 0:
                sc6 Z = ((sc6) obj).Z();
                Z.getClass();
                i29Var.r(Z);
                return pvcVar;
            case 1:
                i29Var.m7setPopupContentSizefhxjrPA(new zy5(((zy5) obj).a));
                i29Var.s();
                return pvcVar;
            case 2:
                i29Var.W = (nb8) obj;
                return pvcVar;
            default:
                vt4 vt4Var = (vt4) obj;
                Handler handler = i29Var.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                } else {
                    looper = null;
                }
                if (looper == Looper.myLooper()) {
                    vt4Var.invoke();
                } else {
                    Handler handler2 = i29Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new bg(5, vt4Var));
                    }
                }
                return pvcVar;
        }
    }
}
