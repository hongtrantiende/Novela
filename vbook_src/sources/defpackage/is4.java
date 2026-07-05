package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: is4  reason: default package */
/* loaded from: classes.dex */
public final class is4 implements Parcelable {
    public static final Parcelable.Creator<is4> CREATOR = new cxd(11);
    public ArrayList C;
    public ArrayList D;
    public ArrayList a;
    public ArrayList b;
    public vf0[] c;
    public int d;
    public String e;
    public ArrayList f;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeStringList(this.b);
        parcel.writeTypedArray(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeStringList(this.f);
        parcel.writeTypedList(this.C);
        parcel.writeTypedList(this.D);
    }
}
