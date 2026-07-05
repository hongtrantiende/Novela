package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u05  reason: default package */
/* loaded from: classes.dex */
public final class u05 extends o3 {
    public static final Parcelable.Creator<u05> CREATOR = new go8(13);
    public final int a;
    public final int b;
    public final Bundle c;

    public u05(int i, int i2, Bundle bundle) {
        this.a = i;
        this.b = i2;
        this.c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.T(parcel, 1, 4);
        parcel.writeInt(this.a);
        uue.T(parcel, 2, 4);
        parcel.writeInt(this.b);
        uue.H(parcel, 3, this.c);
        uue.V(parcel, U);
    }
}
