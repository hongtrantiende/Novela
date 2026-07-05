package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b8f  reason: default package */
/* loaded from: classes.dex */
public final class b8f extends o3 {
    public static final Parcelable.Creator<b8f> CREATOR = new q4f(7);
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;

    public b8f(int i, int i2, long j, String str, boolean z) {
        this.a = z;
        this.b = str;
        this.c = hma.w(i) - 1;
        this.d = w9e.y(i2) - 1;
        this.e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.T(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        uue.P(parcel, 2, this.b);
        uue.T(parcel, 3, 4);
        parcel.writeInt(this.c);
        uue.T(parcel, 4, 4);
        parcel.writeInt(this.d);
        uue.T(parcel, 5, 8);
        parcel.writeLong(this.e);
        uue.V(parcel, U);
    }
}
