package defpackage;

import android.os.Parcel;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zw5  reason: default package */
/* loaded from: classes.dex */
public final class zw5 implements wg3 {
    public static final yw5 CREATOR = new Object();
    public final uo8 a;

    public zw5(uo8 uo8Var) {
        this.a = uo8Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zw5) && ((zw5) obj).a.equals(this.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
        this.a.writeToParcel(parcel, i);
    }
}
