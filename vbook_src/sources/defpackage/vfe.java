package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vfe  reason: default package */
/* loaded from: classes.dex */
public final class vfe extends ftd implements age {
    public vfe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 4);
    }

    @Override // defpackage.age
    public final void b(String str, String str2, Bundle bundle, long j) {
        Parcel S = S();
        S.writeString(str);
        S.writeString(str2);
        wbe.b(S, bundle);
        S.writeLong(j);
        T(S, 1);
    }

    @Override // defpackage.age
    public final int zzf() {
        Parcel R = R(S(), 2);
        int readInt = R.readInt();
        R.recycle();
        return readInt;
    }
}
