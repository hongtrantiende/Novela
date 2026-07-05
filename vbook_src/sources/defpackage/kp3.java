package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kp3  reason: default package */
/* loaded from: classes.dex */
public final class kp3 extends c70 {
    public static final Parcelable.Creator<kp3> CREATOR = new kbe(11);
    public final String a;
    public final String b;
    public final String c;
    public String d;
    public boolean e;

    public kp3(String str, String str2, String str3, String str4, boolean z) {
        am8.p(str);
        this.a = str;
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            vs.m("Cannot create an EmailAuthCredential without a password or emailLink.");
            throw null;
        }
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    @Override // defpackage.c70
    public final String c() {
        return "password";
    }

    @Override // defpackage.c70
    public final c70 d() {
        return new kp3(this.a, this.b, this.c, this.d, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.P(parcel, 1, this.a);
        uue.P(parcel, 2, this.b);
        uue.P(parcel, 3, this.c);
        uue.P(parcel, 4, this.d);
        boolean z = this.e;
        uue.T(parcel, 5, 4);
        parcel.writeInt(z ? 1 : 0);
        uue.V(parcel, U);
    }
}
