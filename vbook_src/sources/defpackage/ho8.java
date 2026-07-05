package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ho8  reason: default package */
/* loaded from: classes.dex */
public final class ho8 implements Parcelable {
    public static final Parcelable.Creator<ho8> CREATOR = new go8(1);
    public final float a;
    public final float b;
    public final int c;

    public ho8(float f, float f2, int i) {
        this.a = f;
        this.b = f2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ho8) {
            ho8 ho8Var = (ho8) obj;
            if (ho8Var.a == this.a && ho8Var.b == this.b && ho8Var.c == this.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return nk2.d(this.b, Float.hashCode(this.a) * 31, 31) + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
        parcel.writeInt(this.c);
    }
}
