package defpackage;

import android.os.Parcel;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iie  reason: default package */
/* loaded from: classes.dex */
public final class iie extends tbe implements sfe {
    public final /* synthetic */ w1f a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iie(fhe fheVar, w1f w1fVar) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.a = w1fVar;
    }

    @Override // defpackage.tbe
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            zze();
            return true;
        }
        return false;
    }

    @Override // defpackage.sfe
    public final void zze() {
        this.a.run();
    }
}
