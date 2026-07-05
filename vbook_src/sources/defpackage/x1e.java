package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x1e  reason: default package */
/* loaded from: classes.dex */
public final class x1e extends o3 {
    public static final Parcelable.Creator<x1e> CREATOR = new rwd(19);
    public final long a;
    public final int b;
    public final long c;

    public x1e(long j, long j2, int i) {
        this.a = j;
        this.b = i;
        this.c = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.T(parcel, 1, 8);
        parcel.writeLong(this.a);
        uue.T(parcel, 2, 4);
        parcel.writeInt(this.b);
        uue.T(parcel, 3, 8);
        parcel.writeLong(this.c);
        uue.V(parcel, U);
    }
}
