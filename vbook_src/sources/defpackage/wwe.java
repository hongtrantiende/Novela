package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wwe  reason: default package */
/* loaded from: classes.dex */
public final class wwe extends o3 {
    public static final Parcelable.Creator<wwe> CREATOR = new kbe(22);
    public final List a;

    public wwe(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwe)) {
            return false;
        }
        return this.a.equals(((wwe) obj).a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlagOverrides(");
        boolean z = true;
        for (pwe pweVar : this.a) {
            if (!z) {
                sb.append(", ");
            }
            pweVar.c(sb);
            z = false;
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.S(parcel, 2, this.a);
        uue.V(parcel, U);
    }
}
