package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cc7  reason: default package */
/* loaded from: classes.dex */
public final class cc7 extends o3 {
    public static final Parcelable.Creator<cc7> CREATOR = new go8(21);
    public final String C;
    public final int D;
    public final int E;
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;

    public cc7(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.C = str2;
        this.D = i4;
        this.E = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.T(parcel, 1, 4);
        parcel.writeInt(this.a);
        uue.T(parcel, 2, 4);
        parcel.writeInt(this.b);
        uue.T(parcel, 3, 4);
        parcel.writeInt(this.c);
        uue.T(parcel, 4, 8);
        parcel.writeLong(this.d);
        uue.T(parcel, 5, 8);
        parcel.writeLong(this.e);
        uue.P(parcel, 6, this.f);
        uue.P(parcel, 7, this.C);
        uue.T(parcel, 8, 4);
        parcel.writeInt(this.D);
        uue.T(parcel, 9, 4);
        parcel.writeInt(this.E);
        uue.V(parcel, U);
    }
}
