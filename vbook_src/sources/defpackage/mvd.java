package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mvd  reason: default package */
/* loaded from: classes.dex */
public final class mvd extends o3 {
    public static final Parcelable.Creator<mvd> CREATOR = new go8(20);
    public final int a;
    public final jz1 b;
    public final svd c;

    public mvd(int i, jz1 jz1Var, svd svdVar) {
        this.a = i;
        this.b = jz1Var;
        this.c = svdVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.T(parcel, 1, 4);
        parcel.writeInt(this.a);
        uue.O(parcel, 2, this.b, i);
        uue.O(parcel, 3, this.c, i);
        uue.V(parcel, U);
    }
}
