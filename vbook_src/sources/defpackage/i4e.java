package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i4e  reason: default package */
/* loaded from: classes.dex */
public final class i4e extends o3 {
    public static final Parcelable.Creator<i4e> CREATOR = new rwd(24);
    public final ibe C;
    public long D;
    public ibe E;
    public final long F;
    public final ibe G;
    public String a;
    public String b;
    public g6f c;
    public long d;
    public boolean e;
    public String f;

    public i4e(i4e i4eVar) {
        am8.s(i4eVar);
        this.a = i4eVar.a;
        this.b = i4eVar.b;
        this.c = i4eVar.c;
        this.d = i4eVar.d;
        this.e = i4eVar.e;
        this.f = i4eVar.f;
        this.C = i4eVar.C;
        this.D = i4eVar.D;
        this.E = i4eVar.E;
        this.F = i4eVar.F;
        this.G = i4eVar.G;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.P(parcel, 2, this.a);
        uue.P(parcel, 3, this.b);
        uue.O(parcel, 4, this.c, i);
        long j = this.d;
        uue.T(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z = this.e;
        uue.T(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        uue.P(parcel, 7, this.f);
        uue.O(parcel, 8, this.C, i);
        long j2 = this.D;
        uue.T(parcel, 9, 8);
        parcel.writeLong(j2);
        uue.O(parcel, 10, this.E, i);
        uue.T(parcel, 11, 8);
        parcel.writeLong(this.F);
        uue.O(parcel, 12, this.G, i);
        uue.V(parcel, U);
    }

    public i4e(String str, String str2, g6f g6fVar, long j, boolean z, String str3, ibe ibeVar, long j2, ibe ibeVar2, long j3, ibe ibeVar3) {
        this.a = str;
        this.b = str2;
        this.c = g6fVar;
        this.d = j;
        this.e = z;
        this.f = str3;
        this.C = ibeVar;
        this.D = j2;
        this.E = ibeVar2;
        this.F = j3;
        this.G = ibeVar3;
    }
}
