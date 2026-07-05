package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: brc  reason: default package */
/* loaded from: classes.dex */
public final class brc extends c70 {
    public static final Parcelable.Creator<brc> CREATOR = new u7e(15);
    public final String a;
    public final String b;

    public brc(String str, String str2) {
        am8.p(str);
        this.a = str;
        am8.p(str2);
        this.b = str2;
    }

    @Override // defpackage.c70
    public final String c() {
        return "twitter.com";
    }

    @Override // defpackage.c70
    public final c70 d() {
        return new brc(this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.P(parcel, 1, this.a);
        uue.P(parcel, 2, this.b);
        uue.V(parcel, U);
    }
}
