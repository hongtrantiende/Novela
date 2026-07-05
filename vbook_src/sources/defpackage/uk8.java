package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uk8  reason: default package */
/* loaded from: classes.dex */
public final class uk8 implements Parcelable {
    public static final Parcelable.Creator<uk8> CREATOR = new cxd(24);
    public final List a;
    public final int b;
    public final int c;

    public uk8(int i, List list, int i2) {
        list.getClass();
        this.a = list;
        this.b = i;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeTypedList(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
