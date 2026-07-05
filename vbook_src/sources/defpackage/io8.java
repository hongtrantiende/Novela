package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: io8  reason: default package */
/* loaded from: classes.dex */
public final class io8 implements zp8 {
    public static final Parcelable.Creator<io8> CREATOR = new go8(0);
    public final int a;
    public final float b;
    public final ArrayList c;

    public io8(int i, float f, ArrayList arrayList) {
        this.a = i;
        this.b = f;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof io8) {
                io8 io8Var = (io8) obj;
                if (this.a == io8Var.a && this.b == io8Var.b && this.c.equals(io8Var.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + nk2.d(this.b, this.a * 31, 31);
    }

    @Override // defpackage.zp8, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
        ArrayList arrayList = this.c;
        parcel.writeInt(arrayList.size());
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((ho8) obj).writeToParcel(parcel, i);
        }
    }
}
