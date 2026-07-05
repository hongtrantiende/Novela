package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a5f  reason: default package */
/* loaded from: classes.dex */
public final class a5f extends o3 {
    public static final Parcelable.Creator<a5f> CREATOR = new q4f(2);
    public final List a;

    public a5f(ArrayList arrayList) {
        this.a = arrayList;
    }

    public static a5f c(p0f... p0fVarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(p0fVarArr[0].a));
        return new a5f(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        List list = this.a;
        if (list != null) {
            int U2 = uue.U(parcel, 1);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(((Integer) list.get(i2)).intValue());
            }
            uue.V(parcel, U2);
        }
        uue.V(parcel, U);
    }
}
