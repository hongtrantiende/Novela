package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sz1  reason: default package */
/* loaded from: classes.dex */
public final class sz1 extends o3 {
    public static final Parcelable.Creator<sz1> CREATOR = new kbe(26);
    public final nu9 a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    public sz1(nu9 nu9Var, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.a = nu9Var;
        this.b = z;
        this.c = z2;
        this.d = iArr;
        this.e = i;
        this.f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.O(parcel, 1, this.a, i);
        uue.T(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        uue.T(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        uue.L(parcel, 4, this.d);
        uue.T(parcel, 5, 4);
        parcel.writeInt(this.e);
        uue.L(parcel, 6, this.f);
        uue.V(parcel, U);
    }
}
