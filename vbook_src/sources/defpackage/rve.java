package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.TreeMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rve  reason: default package */
/* loaded from: classes.dex */
public final class rve extends o3 implements Comparable {
    public static final Parcelable.Creator<rve> CREATOR = new kbe(16);
    public final int a;
    public final nwe[] b;
    public final String[] c;
    public final TreeMap d = new TreeMap();

    public rve(int i, nwe[] nweVarArr, String[] strArr) {
        this.a = i;
        this.b = nweVarArr;
        for (nwe nweVar : nweVarArr) {
            this.d.put(nweVar.a, nweVar);
        }
        this.c = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.a - ((rve) obj).a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rve) {
            rve rveVar = (rve) obj;
            if (this.a == rveVar.a && ube.G(this.d, rveVar.d) && Arrays.equals(this.c, rveVar.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.a);
        sb.append(", (");
        for (nwe nweVar : this.d.values()) {
            sb.append(nweVar);
            sb.append(", ");
        }
        sb.append("), (");
        String[] strArr = this.c;
        if (strArr != null) {
            for (String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append("))");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.T(parcel, 2, 4);
        parcel.writeInt(this.a);
        uue.R(parcel, 3, this.b, i);
        String[] strArr = this.c;
        if (strArr != null) {
            int U2 = uue.U(parcel, 4);
            parcel.writeStringArray(strArr);
            uue.V(parcel, U2);
        }
        uue.V(parcel, U);
    }
}
