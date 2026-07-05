package defpackage;

import android.os.Bundle;
import android.os.Parcel;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bke  reason: default package */
/* loaded from: classes.dex */
public final class bke extends tbe implements age {
    public final jge a;

    public bke(jge jgeVar) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.a = jgeVar;
    }

    @Override // defpackage.tbe
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int identityHashCode = System.identityHashCode(this.a);
            parcel2.writeNoException();
            parcel2.writeInt(identityHashCode);
            return true;
        }
        long readLong = parcel.readLong();
        wbe.d(parcel);
        b(parcel.readString(), parcel.readString(), (Bundle) wbe.a(parcel, Bundle.CREATOR), readLong);
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.age
    public final void b(String str, String str2, Bundle bundle, long j) {
        this.a.a(str, str2, bundle, j);
    }

    @Override // defpackage.age
    public final int zzf() {
        return System.identityHashCode(this.a);
    }
}
