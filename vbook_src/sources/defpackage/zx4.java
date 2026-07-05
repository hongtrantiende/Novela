package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zx4  reason: default package */
/* loaded from: classes.dex */
public final class zx4 extends o3 {
    public static final Parcelable.Creator<zx4> CREATOR = new go8(29);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public zx4(String str, String str2, boolean z, String str3, int i, String str4) {
        am8.s(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zx4)) {
            return false;
        }
        zx4 zx4Var = (zx4) obj;
        if (!hud.l(this.a, zx4Var.a) || !hud.l(this.d, zx4Var.d) || !hud.l(this.b, zx4Var.b) || !hud.l(Boolean.valueOf(this.e), Boolean.valueOf(zx4Var.e)) || this.f != zx4Var.f) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d, Boolean.valueOf(this.e), Integer.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.P(parcel, 1, this.a);
        uue.P(parcel, 2, this.b);
        uue.P(parcel, 3, this.c);
        uue.P(parcel, 4, this.d);
        uue.T(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        uue.T(parcel, 6, 4);
        parcel.writeInt(this.f);
        uue.V(parcel, U);
    }
}
