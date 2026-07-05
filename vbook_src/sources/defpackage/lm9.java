package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lm9  reason: default package */
/* loaded from: classes.dex */
public final class lm9 extends o3 {
    public static final Parcelable.Creator<lm9> CREATOR = new q4f(13);
    public final String C;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public int f;

    public lm9(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.C = "22.0.1";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.P(parcel, 1, this.a);
        uue.P(parcel, 2, this.b);
        uue.P(parcel, 3, this.c);
        uue.P(parcel, 4, this.d);
        uue.P(parcel, 5, this.e);
        int i2 = this.f;
        uue.T(parcel, 6, 4);
        parcel.writeInt(i2);
        uue.P(parcel, 7, this.C);
        uue.V(parcel, U);
    }

    public lm9(String str, String str2, String str3, String str4, String str5, int i, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.C = str6;
    }
}
