package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cxe  reason: default package */
/* loaded from: classes.dex */
public final class cxe extends o3 implements Comparable {
    public static final Parcelable.Creator<cxe> CREATOR = new kbe(23);
    public final int a;
    public final int b;

    public cxe(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        cxe cxeVar = (cxe) obj;
        int i = cxeVar.a;
        int i2 = this.a;
        if (i2 >= i) {
            if (i2 <= i) {
                int i3 = cxeVar.b;
                int i4 = this.b;
                if (i4 < i3) {
                    return -1;
                }
                if (i4 > i3) {
                    return 1;
                }
                return 0;
            }
            return 1;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        cxe cxeVar;
        int i;
        int i2;
        int i3;
        int i4;
        if ((obj instanceof cxe) && (i2 = this.a) >= (i = (cxeVar = (cxe) obj).a) && i2 <= i && (i4 = this.b) >= (i3 = cxeVar.b) && i4 <= i3) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(i2).length() + 1);
        a82.t(i, i2, "GenericDimension(", ", ", sb);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.T(parcel, 1, 4);
        parcel.writeInt(this.a);
        uue.T(parcel, 2, 4);
        parcel.writeInt(this.b);
        uue.V(parcel, U);
    }
}
