package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m5  reason: default package */
/* loaded from: classes.dex */
public final class m5 extends o3 {
    public static final Parcelable.Creator<m5> CREATOR = new u7e(21);
    public final boolean C;
    public final String D;
    public int E;
    public final String F;
    public final String G;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;

    public m5(String str, String str2, String str3, String str4, boolean z, String str5, boolean z2, String str6, int i, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = str5;
        this.C = z2;
        this.D = str6;
        this.E = i;
        this.F = str7;
        this.G = str8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.P(parcel, 1, this.a);
        uue.P(parcel, 2, this.b);
        uue.P(parcel, 3, this.c);
        uue.P(parcel, 4, this.d);
        uue.T(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        uue.P(parcel, 6, this.f);
        uue.T(parcel, 7, 4);
        parcel.writeInt(this.C ? 1 : 0);
        uue.P(parcel, 8, this.D);
        int i2 = this.E;
        uue.T(parcel, 9, 4);
        parcel.writeInt(i2);
        uue.P(parcel, 10, this.F);
        uue.P(parcel, 11, this.G);
        uue.V(parcel, U);
    }

    public m5(tn3 tn3Var) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = false;
        this.f = null;
        this.C = false;
        this.F = null;
        this.G = null;
    }
}
