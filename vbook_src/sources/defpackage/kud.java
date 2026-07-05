package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kud  reason: default package */
/* loaded from: classes.dex */
public final class kud extends o3 {
    public static final Parcelable.Creator<kud> CREATOR = new go8(17);
    public final int a;
    public final String b;
    public final long c;
    public final int d;
    public final boolean e;

    public kud(int i, int i2, long j, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = i2;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.T(parcel, 1, 4);
        parcel.writeInt(this.a);
        uue.P(parcel, 2, this.b);
        uue.T(parcel, 3, 8);
        parcel.writeLong(this.c);
        uue.T(parcel, 4, 4);
        parcel.writeInt(this.d);
        uue.T(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        uue.V(parcel, U);
    }
}
