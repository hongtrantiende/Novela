package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xge  reason: default package */
/* loaded from: classes.dex */
public final class xge extends o3 {
    public static final Parcelable.Creator<xge> CREATOR = new kbe(6);
    public final long a;
    public final long b;
    public final boolean c;
    public final Bundle d;
    public final String e;

    public xge(long j, long j2, boolean z, Bundle bundle, String str) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = bundle;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.T(parcel, 1, 8);
        parcel.writeLong(this.a);
        uue.T(parcel, 2, 8);
        parcel.writeLong(this.b);
        uue.T(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        uue.H(parcel, 7, this.d);
        uue.P(parcel, 8, this.e);
        uue.V(parcel, U);
    }
}
