package defpackage;

import android.view.KeyEvent;
import java.util.concurrent.CancellationException;
import okhttp3.internal.connection.RealCall;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lv0  reason: default package */
/* loaded from: classes.dex */
public final class lv0 implements xt4 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ lv0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        boolean z;
        CancellationException cancellationException;
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                ((h61) this.b).cancel();
                return pvcVar;
            case 1:
                Throwable th2 = (Throwable) obj;
                ((RealCall) this.b).d();
                return pvcVar;
            case 2:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                g19 g19Var = (g19) this.b;
                if (g19Var != null) {
                    g19Var.c = booleanValue;
                }
                return pvcVar;
            case 3:
                KeyEvent keyEvent = ((g86) obj).a;
                f7a f7aVar = (f7a) this.b;
                if (o86.a.k(keyEvent) == f86.O) {
                    f7aVar.e();
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                float[] fArr = ((l27) obj).a;
                sc6 sc6Var = (sc6) this.b;
                if (sc6Var.t()) {
                    obe.t(sc6Var).E(sc6Var, fArr);
                }
                return pvcVar;
            case 5:
                Throwable th3 = (Throwable) obj;
                ((kb3) this.b).a();
                return pvcVar;
            default:
                Throwable th4 = (Throwable) obj;
                if (th4 != null) {
                    if (th4 instanceof CancellationException) {
                        cancellationException = (CancellationException) th4;
                    } else {
                        cancellationException = null;
                    }
                    if (cancellationException == null) {
                        cancellationException = new CancellationException(th4.getMessage());
                    }
                    ((y26) this.b).t(cancellationException);
                }
                return pvcVar;
        }
    }

    public /* synthetic */ lv0() {
        this.a = 2;
    }
}
