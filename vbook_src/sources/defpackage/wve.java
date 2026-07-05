package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import java.util.TreeMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wve  reason: default package */
/* loaded from: classes.dex */
public final class wve extends o3 {
    public static final Parcelable.Creator<wve> CREATOR = new kbe(17);
    public final long C;
    public final String a;
    public final byte[] b;
    public final String c;
    public final rve[] d;
    public final TreeMap e = new TreeMap();
    public final boolean f;

    public wve(String str, String str2, rve[] rveVarArr, boolean z, byte[] bArr, long j) {
        this.a = str;
        this.c = str2;
        this.d = rveVarArr;
        this.f = z;
        this.b = bArr;
        this.C = j;
        for (rve rveVar : rveVarArr) {
            this.e.put(Integer.valueOf(rveVar.a), rveVar);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wve) {
            wve wveVar = (wve) obj;
            if (ube.G(this.a, wveVar.a) && ube.G(this.c, wveVar.c) && this.e.equals(wveVar.e) && this.f == wveVar.f && Arrays.equals(this.b, wveVar.b) && this.C == wveVar.C) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.e, Boolean.valueOf(this.f), this.b, Long.valueOf(this.C)});
    }

    public final String toString() {
        String encodeToString;
        StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.a);
        sb.append("', '");
        sb.append(this.c);
        sb.append("', (");
        for (rve rveVar : this.e.values()) {
            sb.append(rveVar);
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.f);
        sb.append(", ");
        byte[] bArr = this.b;
        if (bArr == null) {
            encodeToString = "null";
        } else {
            encodeToString = Base64.encodeToString(bArr, 3);
        }
        sb.append(encodeToString);
        sb.append(", ");
        sb.append(this.C);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.P(parcel, 2, this.a);
        uue.P(parcel, 3, this.c);
        uue.R(parcel, 4, this.d, i);
        uue.T(parcel, 5, 4);
        parcel.writeInt(this.f ? 1 : 0);
        uue.I(parcel, 6, this.b);
        uue.T(parcel, 7, 8);
        parcel.writeLong(this.C);
        uue.V(parcel, U);
    }
}
