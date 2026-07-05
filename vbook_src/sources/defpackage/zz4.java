package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zz4  reason: default package */
/* loaded from: classes.dex */
public final class zz4 extends c70 {
    public static final Parcelable.Creator<zz4> CREATOR = new u7e(0);
    public final String a;
    public final String b;

    public zz4(String str, String str2) {
        if (str == null && str2 == null) {
            vs.m("Must specify an idToken or an accessToken.");
            throw null;
        } else if (str != null && str.length() == 0) {
            vs.m("idToken cannot be empty");
            throw null;
        } else if (str2 != null && str2.length() == 0) {
            vs.m("accessToken cannot be empty");
            throw null;
        } else {
            this.a = str;
            this.b = str2;
        }
    }

    @Override // defpackage.c70
    public final String c() {
        return "google.com";
    }

    @Override // defpackage.c70
    public final c70 d() {
        return new zz4(this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.P(parcel, 1, this.a);
        uue.P(parcel, 2, this.b);
        uue.V(parcel, U);
    }
}
