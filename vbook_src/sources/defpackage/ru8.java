package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ru8  reason: default package */
/* loaded from: classes.dex */
public final class ru8 extends c70 implements Cloneable {
    public static final Parcelable.Creator<ru8> CREATOR = new u7e(6);
    public final String a;
    public final String b;
    public final String c;
    public boolean d;
    public final String e;

    public ru8(String str, String str2, String str3, String str4, boolean z) {
        boolean z2;
        if ((!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) || (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4))) {
            z2 = true;
        } else {
            z2 = false;
        }
        am8.m("Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.", z2);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
    }

    @Override // defpackage.c70
    public final String c() {
        return "phone";
    }

    public final Object clone() {
        boolean z = this.d;
        return new ru8(this.a, this.b, this.c, this.e, z);
    }

    @Override // defpackage.c70
    public final c70 d() {
        return (ru8) clone();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.P(parcel, 1, this.a);
        uue.P(parcel, 2, this.b);
        uue.P(parcel, 4, this.c);
        boolean z = this.d;
        uue.T(parcel, 5, 4);
        parcel.writeInt(z ? 1 : 0);
        uue.P(parcel, 6, this.e);
        uue.V(parcel, U);
    }
}
