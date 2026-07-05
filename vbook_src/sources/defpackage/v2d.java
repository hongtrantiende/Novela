package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v2d  reason: default package */
/* loaded from: classes.dex */
public final class v2d extends o3 {
    public static final Parcelable.Creator<v2d> CREATOR = new u7e(28);
    public final int a;
    public final short b;
    public final short c;

    public v2d(int i, short s, short s2) {
        this.a = i;
        this.b = s;
        this.c = s2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v2d)) {
            return false;
        }
        v2d v2dVar = (v2d) obj;
        if (this.a != v2dVar.a || this.b != v2dVar.b || this.c != v2dVar.c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Short.valueOf(this.b), Short.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.T(parcel, 1, 4);
        parcel.writeInt(this.a);
        uue.T(parcel, 2, 4);
        parcel.writeInt(this.b);
        uue.T(parcel, 3, 4);
        parcel.writeInt(this.c);
        uue.V(parcel, U);
    }
}
