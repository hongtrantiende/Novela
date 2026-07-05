package defpackage;

import android.os.CancellationSignal;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mw1  reason: default package */
/* loaded from: classes.dex */
public final class mw1 extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CancellationSignal b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mw1(CancellationSignal cancellationSignal, int i) {
        super(1);
        this.a = i;
        this.b = cancellationSignal;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        CancellationSignal cancellationSignal = this.b;
        switch (i) {
            case 0:
                if (((Throwable) obj) != null) {
                    cancellationSignal.cancel();
                }
                return pvcVar;
            default:
                Throwable th = (Throwable) obj;
                cancellationSignal.cancel();
                return pvcVar;
        }
    }
}
