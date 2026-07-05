package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nu9  reason: default package */
/* loaded from: classes.dex */
public final class nu9 extends o3 {
    public static final Parcelable.Creator<nu9> CREATOR = new rwd(21);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public nu9(int i, int i2, int i3, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.T(parcel, 1, 4);
        parcel.writeInt(this.a);
        uue.T(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        uue.T(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        uue.T(parcel, 4, 4);
        parcel.writeInt(this.d);
        uue.T(parcel, 5, 4);
        parcel.writeInt(this.e);
        uue.V(parcel, U);
    }
}
