package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fve  reason: default package */
/* loaded from: classes.dex */
public final class fve extends o3 {
    public static final Parcelable.Creator<fve> CREATOR = new kbe(24);
    public Bundle a;
    public mb4[] b;
    public int c;
    public sz1 d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.H(parcel, 1, this.a);
        uue.R(parcel, 2, this.b, i);
        int i2 = this.c;
        uue.T(parcel, 3, 4);
        parcel.writeInt(i2);
        uue.O(parcel, 4, this.d, i);
        uue.V(parcel, U);
    }
}
