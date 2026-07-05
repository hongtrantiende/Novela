package defpackage;

import android.os.RemoteException;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o1f  reason: default package */
/* loaded from: classes.dex */
public final class o1f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d8f b;
    public final /* synthetic */ w2f c;

    public o1f(w2f w2fVar, d8f d8fVar) {
        this.a = 4;
        this.b = d8fVar;
        Objects.requireNonNull(w2fVar);
        this.c = w2fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        d8f d8fVar = this.b;
        w2f w2fVar = this.c;
        switch (i) {
            case 0:
                lne lneVar = w2fVar.d;
                lte lteVar = (lte) w2fVar.a;
                if (lneVar == null) {
                    ppe ppeVar = lteVar.f;
                    lte.m(ppeVar);
                    ppeVar.f.e("Failed to reset data on the service: not connected to service");
                    return;
                }
                try {
                    lneVar.y(d8fVar);
                } catch (RemoteException e) {
                    ppe ppeVar2 = lteVar.f;
                    lte.m(ppeVar2);
                    ppeVar2.f.f(e, "Failed to reset data on the service: remote exception");
                }
                w2fVar.k0();
                return;
            case 1:
                lne lneVar2 = w2fVar.d;
                lte lteVar2 = (lte) w2fVar.a;
                if (lneVar2 == null) {
                    ppe ppeVar3 = lteVar2.f;
                    lte.m(ppeVar3);
                    ppeVar3.f.e("Discarding data. Failed to send app launch");
                    return;
                }
                try {
                    t7e t7eVar = lteVar2.d;
                    wme wmeVar = yme.W0;
                    if (t7eVar.i0(null, wmeVar)) {
                        w2fVar.p0(lneVar2, null, d8fVar);
                    }
                    lneVar2.c(d8fVar);
                    lteVar2.o().c0();
                    lteVar2.d.i0(null, wmeVar);
                    w2fVar.p0(lneVar2, null, d8fVar);
                    w2fVar.k0();
                    return;
                } catch (RemoteException e2) {
                    ppe ppeVar4 = lteVar2.f;
                    lte.m(ppeVar4);
                    ppeVar4.f.f(e2, "Failed to send app launch to the service");
                    return;
                }
            case 2:
                lne lneVar3 = w2fVar.d;
                lte lteVar3 = (lte) w2fVar.a;
                if (lneVar3 == null) {
                    ppe ppeVar5 = lteVar3.f;
                    lte.m(ppeVar5);
                    ppeVar5.E.e("Failed to send app backgrounded");
                    return;
                }
                try {
                    lneVar3.H(d8fVar);
                    w2fVar.k0();
                    return;
                } catch (RemoteException e3) {
                    ppe ppeVar6 = lteVar3.f;
                    lte.m(ppeVar6);
                    ppeVar6.f.f(e3, "Failed to send app backgrounded to the service");
                    return;
                }
            case 3:
                lne lneVar4 = w2fVar.d;
                lte lteVar4 = (lte) w2fVar.a;
                if (lneVar4 == null) {
                    ppe ppeVar7 = lteVar4.f;
                    lte.m(ppeVar7);
                    ppeVar7.f.e("Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    lneVar4.J(d8fVar);
                    w2fVar.k0();
                    return;
                } catch (RemoteException e4) {
                    ppe ppeVar8 = lteVar4.f;
                    lte.m(ppeVar8);
                    ppeVar8.f.f(e4, "Failed to send measurementEnabled to the service");
                    return;
                }
            default:
                lne lneVar5 = w2fVar.d;
                lte lteVar5 = (lte) w2fVar.a;
                if (lneVar5 == null) {
                    ppe ppeVar9 = lteVar5.f;
                    lte.m(ppeVar9);
                    ppeVar9.f.e("Failed to send consent settings to service");
                    return;
                }
                try {
                    lneVar5.o(d8fVar);
                    w2fVar.k0();
                    return;
                } catch (RemoteException e5) {
                    ppe ppeVar10 = lteVar5.f;
                    lte.m(ppeVar10);
                    ppeVar10.f.f(e5, "Failed to send consent settings to the service");
                    return;
                }
        }
    }

    public /* synthetic */ o1f(w2f w2fVar, d8f d8fVar, int i) {
        this.a = i;
        this.b = d8fVar;
        this.c = w2fVar;
    }
}
