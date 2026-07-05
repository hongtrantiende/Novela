package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d5f  reason: default package */
/* loaded from: classes.dex */
public final class d5f extends o3 {
    public static final Parcelable.Creator<d5f> CREATOR = new q4f(3);
    public final List a;

    public d5f(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.S(parcel, 1, this.a);
        uue.V(parcel, U);
    }
}
