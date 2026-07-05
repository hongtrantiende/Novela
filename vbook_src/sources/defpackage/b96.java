package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b96  reason: default package */
/* loaded from: classes.dex */
public final class b96 implements Parcelable {
    public static final Parcelable.Creator<b96> CREATOR = new cxd(16);
    public final String a;
    public final uo8 b;

    public b96(String str, uo8 uo8Var) {
        uo8Var.getClass();
        this.a = str;
        this.b = uo8Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b96) {
            b96 b96Var = (b96) obj;
            if (b96Var.a.equals(this.a) && c16.i(b96Var.b, this.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        this.b.writeToParcel(parcel, i);
    }
}
