package defpackage;

import android.os.RemoteException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p2f  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class p2f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w2f b;

    public /* synthetic */ p2f(w2f w2fVar, int i) {
        this.a = i;
        this.b = w2fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        w2f w2fVar = this.b;
        switch (i) {
            case 0:
                w2fVar.d0();
                return;
            case 1:
                lte lteVar = (lte) w2fVar.a;
                lne lneVar = w2fVar.d;
                if (lneVar == null) {
                    ppe ppeVar = lteVar.f;
                    lte.m(ppeVar);
                    ppeVar.f.e("Failed to send Dma consent settings to service");
                    return;
                }
                try {
                    lneVar.L(w2fVar.n0(false));
                    w2fVar.k0();
                    return;
                } catch (RemoteException e) {
                    ppe ppeVar2 = lteVar.f;
                    lte.m(ppeVar2);
                    ppeVar2.f.f(e, "Failed to send Dma consent settings to the service");
                    return;
                }
            default:
                lte lteVar2 = (lte) w2fVar.a;
                lne lneVar2 = w2fVar.d;
                if (lneVar2 == null) {
                    ppe ppeVar3 = lteVar2.f;
                    lte.m(ppeVar3);
                    ppeVar3.f.e("Failed to send storage consent settings to service");
                    return;
                }
                try {
                    lneVar2.k(w2fVar.n0(false));
                    w2fVar.k0();
                    return;
                } catch (RemoteException e2) {
                    ppe ppeVar4 = lteVar2.f;
                    lte.m(ppeVar4);
                    ppeVar4.f.f(e2, "Failed to send storage consent settings to the service");
                    return;
                }
        }
    }
}
