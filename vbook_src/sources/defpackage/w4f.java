package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w4f  reason: default package */
/* loaded from: classes.dex */
public final class w4f extends o3 {
    public static final Parcelable.Creator<w4f> CREATOR = new q4f(1);
    public String C;
    public final long a;
    public byte[] b;
    public final String c;
    public final Bundle d;
    public final int e;
    public final long f;

    public w4f(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.a = j;
        this.b = bArr;
        this.c = str;
        this.d = bundle;
        this.e = i;
        this.f = j2;
        this.C = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.T(parcel, 1, 8);
        parcel.writeLong(this.a);
        uue.I(parcel, 2, this.b);
        uue.P(parcel, 3, this.c);
        uue.H(parcel, 4, this.d);
        uue.T(parcel, 5, 4);
        parcel.writeInt(this.e);
        uue.T(parcel, 6, 8);
        parcel.writeLong(this.f);
        uue.P(parcel, 7, this.C);
        uue.V(parcel, U);
    }
}
