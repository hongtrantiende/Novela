package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: elb  reason: default package */
/* loaded from: classes.dex */
public final class elb extends o3 {
    public static final Parcelable.Creator<elb> CREATOR = new go8(14);
    public final int a;
    public List b;

    public elb(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.T(parcel, 1, 4);
        parcel.writeInt(this.a);
        uue.S(parcel, 2, this.b);
        uue.V(parcel, U);
    }
}
