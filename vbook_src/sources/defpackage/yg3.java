package defpackage;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yg3  reason: default package */
/* loaded from: classes.dex */
public final class yg3 extends zg3 {
    public final List a;

    public yg3(Parcel parcel) {
        List createStringArrayList = parcel.createStringArrayList();
        this.a = createStringArrayList == null ? ks3.a : createStringArrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof yg3) && c16.i(this.a, ((yg3) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(ids=" + this.a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(0);
        parcel.writeStringList(this.a);
    }

    public yg3(ArrayList arrayList) {
        this.a = arrayList;
    }
}
