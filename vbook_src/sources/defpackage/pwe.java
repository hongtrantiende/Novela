package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pwe  reason: default package */
/* loaded from: classes.dex */
public final class pwe extends o3 {
    public static final Parcelable.Creator<pwe> CREATOR = new kbe(21);
    public final String a;
    public final String b;
    public final nwe c;
    public final boolean d;

    public pwe(String str, String str2, nwe nweVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = nweVar;
        this.d = z;
    }

    public final void c(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        this.c.c(sb);
        sb.append(", ");
        sb.append(this.d);
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwe)) {
            return false;
        }
        pwe pweVar = (pwe) obj;
        if (ube.G(this.a, pweVar.a) && ube.G(this.b, pweVar.b) && ube.G(this.c, pweVar.c) && this.d == pweVar.d) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        c(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.P(parcel, 2, this.a);
        uue.P(parcel, 3, this.b);
        uue.O(parcel, 4, this.c, i);
        uue.T(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        uue.V(parcel, U);
    }
}
