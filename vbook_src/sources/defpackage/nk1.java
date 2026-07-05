package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nk1  reason: default package */
/* loaded from: classes.dex */
public final class nk1 extends o3 {
    public static final Parcelable.Creator<nk1> CREATOR = new rwd(11);
    public final Intent a;

    public nk1(Intent intent) {
        this.a = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.O(parcel, 1, this.a, i);
        uue.V(parcel, U);
    }
}
