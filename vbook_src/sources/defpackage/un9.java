package defpackage;

import android.os.Parcel;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: un9  reason: default package */
/* loaded from: classes.dex */
public final class un9 implements wg3 {
    public static final tn9 CREATOR = new Object();
    public final String a;
    public final int b;

    public un9(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof un9)) {
                un9 un9Var = (un9) obj;
                if (un9Var.b == this.b && un9Var.a.equals(this.a)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(3);
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }
}
