package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p4f  reason: default package */
/* loaded from: classes.dex */
public final class p4f extends o3 {
    public static final Parcelable.Creator<p4f> CREATOR = new q4f(0);
    public final String a;
    public final long b;
    public final int c;

    public p4f(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.P(parcel, 1, this.a);
        uue.T(parcel, 2, 8);
        parcel.writeLong(this.b);
        uue.T(parcel, 3, 4);
        parcel.writeInt(this.c);
        uue.V(parcel, U);
    }
}
