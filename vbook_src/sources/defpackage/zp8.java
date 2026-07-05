package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zp8  reason: default package */
/* loaded from: classes.dex */
public interface zp8 extends Parcelable {
    public static final Parcelable.Creator<zp8> CREATOR = new go8(3);

    @Override // android.os.Parcelable
    default int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    default void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        if (this instanceof io8) {
            parcel.writeInt(1);
        } else if (this instanceof ro5) {
            parcel.writeInt(2);
        } else {
            xk5.o();
        }
    }
}
