package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u2d  reason: default package */
/* loaded from: classes.dex */
public final class u2d extends o3 {
    public static final Parcelable.Creator<u2d> CREATOR = new u7e(27);
    public final List a;

    public u2d(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final JSONArray c() {
        try {
            JSONArray jSONArray = new JSONArray();
            List list = this.a;
            if (list != null) {
                for (int i = 0; i < list.size(); i++) {
                    v2d v2dVar = (v2d) list.get(i);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) v2dVar.c);
                    jSONArray2.put((int) v2dVar.b);
                    jSONArray2.put((int) v2dVar.c);
                    jSONArray.put(i, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            cp8.p("Error encoding UvmEntries to JSON object", e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u2d)) {
            return false;
        }
        List list = ((u2d) obj).a;
        List list2 = this.a;
        if (list2 == null && list == null) {
            return true;
        }
        if (list2 == null || list == null || !list2.containsAll(list) || !list.containsAll(list2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        HashSet hashSet;
        List list = this.a;
        if (list == null) {
            hashSet = null;
        } else {
            hashSet = new HashSet(list);
        }
        return Arrays.hashCode(new Object[]{hashSet});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.S(parcel, 1, this.a);
        uue.V(parcel, U);
    }
}
