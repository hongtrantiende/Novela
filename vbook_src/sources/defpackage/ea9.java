package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ea9  reason: default package */
/* loaded from: classes.dex */
public final class ea9 extends o3 {
    public static final Parcelable.Creator<ea9> CREATOR = new u7e(14);
    public final qpe a;
    public final String b;
    public final String c;
    public final String d;

    public ea9(String str, String str2, String str3, byte[] bArr) {
        am8.s(bArr);
        this.a = qpe.h(bArr, bArr.length);
        am8.s(str);
        this.b = str;
        this.c = str2;
        am8.s(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ea9) {
            ea9 ea9Var = (ea9) obj;
            if (hud.l(this.a, ea9Var.a) && hud.l(this.b, ea9Var.b) && hud.l(this.c, ea9Var.c) && hud.l(this.d, ea9Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        StringBuilder o = a82.o("PublicKeyCredentialUserEntity{\n id=", jye.l(this.a.i()), ", \n name='");
        o.append(this.b);
        o.append("', \n icon='");
        o.append(this.c);
        o.append("', \n displayName='");
        return s21.q(o, this.d, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.I(parcel, 2, this.a.i());
        uue.P(parcel, 3, this.b);
        uue.P(parcel, 4, this.c);
        uue.P(parcel, 5, this.d);
        uue.V(parcel, U);
    }
}
