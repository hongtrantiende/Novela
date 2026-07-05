package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public enum Transport implements ReflectedParcelable {
    /* JADX INFO: Fake field, exist only in values array */
    BLUETOOTH_CLASSIC(0),
    /* JADX INFO: Fake field, exist only in values array */
    BLUETOOTH_LOW_ENERGY(1),
    /* JADX INFO: Fake field, exist only in values array */
    NFC(2),
    /* JADX INFO: Fake field, exist only in values array */
    USB(3),
    /* JADX INFO: Fake field, exist only in values array */
    INTERNAL(4),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID(5),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_V2(6);
    
    public static final Parcelable.Creator<Transport> CREATOR = new rwd(9);
    public final String a;

    Transport(int i) {
        this.a = r2;
    }

    public static Transport a(String str) {
        Transport[] values;
        if (!str.equals("hybrid")) {
            for (Transport transport : values()) {
                if (str.equals(transport.a)) {
                    return transport;
                }
            }
            throw new Exception(hl5.n("Transport ", str, " not supported"));
        }
        wse wseVar = (wse) pse.b.a.a;
        wse.a.a();
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
