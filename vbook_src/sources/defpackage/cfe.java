package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cfe  reason: default package */
/* loaded from: classes.dex */
public final class cfe extends ftd implements hfe {
    public cfe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver", 4);
    }

    @Override // defpackage.hfe
    public final void D(Bundle bundle) {
        Parcel S = S();
        wbe.b(S, bundle);
        T(S, 1);
    }
}
