package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qbe  reason: default package */
/* loaded from: classes.dex */
public final class qbe extends o3 {
    public static final Parcelable.Creator<qbe> CREATOR = new kbe(1);
    public final List a;
    public final List b;

    public qbe(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList == null ? new ArrayList() : arrayList;
        this.b = arrayList2 == null ? new ArrayList() : arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.S(parcel, 1, this.a);
        uue.S(parcel, 2, this.b);
        uue.V(parcel, U);
    }
}
