package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rvd  reason: default package */
/* loaded from: classes.dex */
public final class rvd extends o3 {
    public static final Parcelable.Creator<rvd> CREATOR = new go8(22);
    public final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;

    public rvd(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.T(parcel, 1, 4);
        parcel.writeInt(this.a);
        uue.O(parcel, 2, this.b, i);
        uue.T(parcel, 3, 4);
        parcel.writeInt(this.c);
        uue.O(parcel, 4, this.d, i);
        uue.V(parcel, U);
    }
}
