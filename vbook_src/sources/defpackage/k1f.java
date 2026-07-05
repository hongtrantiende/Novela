package defpackage;

import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k1f  reason: default package */
/* loaded from: classes.dex */
public final class k1f extends tbe implements goe {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ w2f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1f(w2f w2fVar, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.a = atomicReference;
        this.b = w2fVar;
    }

    @Override // defpackage.goe
    public final void I(d5f d5fVar) {
        AtomicReference atomicReference = this.a;
        synchronized (atomicReference) {
            ppe ppeVar = ((lte) this.b.a).f;
            lte.m(ppeVar);
            ppeVar.J.f(Integer.valueOf(d5fVar.a.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(d5fVar);
            atomicReference.notifyAll();
        }
    }

    @Override // defpackage.tbe
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            wbe.d(parcel);
            I((d5f) wbe.a(parcel, d5f.CREATOR));
            return true;
        }
        return false;
    }
}
