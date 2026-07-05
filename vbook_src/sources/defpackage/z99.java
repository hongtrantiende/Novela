package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z99  reason: default package */
/* loaded from: classes.dex */
public final class z99 extends o3 {
    public static final Parcelable.Creator<z99> CREATOR;
    public final da9 a;
    public final qpe b;
    public final List c;

    static {
        dee.n(2, z1d.d, z1d.e);
        CREATOR = new u7e(7);
    }

    public z99(String str, byte[] bArr, ArrayList arrayList) {
        qpe qpeVar = qpe.c;
        qpe h = qpe.h(bArr, bArr.length);
        am8.s(str);
        try {
            this.a = da9.a(str);
            this.b = h;
            this.c = arrayList;
        } catch (ca9 e) {
            xk5.m(e);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z99) {
            z99 z99Var = (z99) obj;
            List list = z99Var.c;
            if (this.a.equals(z99Var.a) && hud.l(this.b, z99Var.b)) {
                List list2 = this.c;
                if (list2 != null || list != null) {
                    if (list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2)) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String l = jye.l(this.b.i());
        return s21.q(nk2.y("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", l, ", \n transports="), String.valueOf(this.c), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        this.a.getClass();
        uue.P(parcel, 2, "public-key");
        uue.I(parcel, 3, this.b.i());
        uue.S(parcel, 4, this.c);
        uue.V(parcel, U);
    }
}
