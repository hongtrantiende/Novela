package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bwe  reason: default package */
/* loaded from: classes.dex */
public final class bwe extends o3 {
    public static final Parcelable.Creator<bwe> CREATOR = new kbe(18);
    public final byte[] a;

    public bwe(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.I(parcel, 2, this.a);
        uue.V(parcel, U);
    }
}
