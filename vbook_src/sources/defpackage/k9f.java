package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k9f  reason: default package */
/* loaded from: classes.dex */
public final class k9f extends o3 {
    public static final Parcelable.Creator<k9f> CREATOR = new q4f(9);
    public final List a;

    public k9f(ArrayList arrayList) {
        am8.s(arrayList);
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k9f)) {
            return false;
        }
        List list = ((k9f) obj).a;
        List list2 = this.a;
        if (!list2.containsAll(list) || !list.containsAll(list2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.S(parcel, 1, this.a);
        uue.V(parcel, U);
    }
}
