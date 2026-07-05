package defpackage;

import android.os.Parcel;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uxc  reason: default package */
/* loaded from: classes.dex */
public final class uxc implements wg3 {
    public static final txc CREATOR = new Object();
    public final String a;
    public final uo8 b;

    public uxc(String str, uo8 uo8Var) {
        this.a = str;
        this.b = uo8Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof uxc)) {
                uxc uxcVar = (uxc) obj;
                if (uxcVar.b.equals(this.b) && uxcVar.a.equals(this.a)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(2);
        parcel.writeString(this.a);
        this.b.writeToParcel(parcel, i);
    }
}
