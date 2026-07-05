package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h9e  reason: default package */
/* loaded from: classes.dex */
public final class h9e extends o3 {
    public static final Parcelable.Creator<h9e> CREATOR = new u7e(5);
    public final Bundle a;

    public h9e(Bundle bundle) {
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.H(parcel, 1, this.a);
        uue.V(parcel, U);
    }
}
