package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class SignInAccount extends o3 implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new go8(26);
    public final String a;
    public final GoogleSignInAccount b;
    public final String c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.b = googleSignInAccount;
        am8.q(str, "8.3 and 8.4 SDKs require non-null email");
        this.a = str;
        am8.q(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.P(parcel, 4, this.a);
        uue.O(parcel, 7, this.b, i);
        uue.P(parcel, 8, this.c);
        uue.V(parcel, U);
    }
}
