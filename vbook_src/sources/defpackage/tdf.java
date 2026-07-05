package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tdf  reason: default package */
/* loaded from: classes.dex */
public final class tdf implements ww9 {
    public static final Parcelable.Creator<tdf> CREATOR = new q4f(14);
    public final String a;
    public final String b;
    public final boolean c;

    public tdf(String str, String str2, boolean z) {
        am8.p(str);
        am8.p(str2);
        this.a = str;
        this.b = str2;
        mbe.d(str2);
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.P(parcel, 1, this.a);
        uue.P(parcel, 2, this.b);
        uue.T(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        uue.V(parcel, U);
    }

    public tdf(boolean z) {
        this.c = z;
        this.b = null;
        this.a = null;
    }
}
