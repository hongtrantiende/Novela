package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gcc  reason: default package */
/* loaded from: classes.dex */
public final class gcc extends o3 {
    public static final Parcelable.Creator<gcc> CREATOR = new u7e(20);
    public final ecc a;
    public final String b;

    static {
        new gcc("supported", null);
        new gcc("not-supported", null);
    }

    public gcc(String str, String str2) {
        am8.s(str);
        try {
            this.a = ecc.a(str);
            this.b = str2;
        } catch (fcc e) {
            xk5.m(e);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gcc)) {
            return false;
        }
        gcc gccVar = (gcc) obj;
        if (!nmd.H(this.a, gccVar.a) || !nmd.H(this.b, gccVar.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.P(parcel, 2, this.a.a);
        uue.P(parcel, 3, this.b);
        uue.V(parcel, U);
    }
}
