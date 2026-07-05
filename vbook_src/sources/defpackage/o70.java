package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o70  reason: default package */
/* loaded from: classes.dex */
public final class o70 extends c70 {
    public static final Parcelable.Creator<o70> CREATOR = new kbe(27);
    public final jw3 a;
    public final String b;
    public final int c;

    public o70(int i, String str, int i2) {
        try {
            this.a = jw3.a(i);
            this.b = str;
            this.c = i2;
        } catch (iw3 e) {
            xk5.m(e);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o70)) {
            return false;
        }
        o70 o70Var = (o70) obj;
        if (!hud.l(this.a, o70Var.a) || !hud.l(this.b, o70Var.b) || !hud.l(Integer.valueOf(this.c), Integer.valueOf(o70Var.c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    public final String toString() {
        yx9 yx9Var = new yx9(getClass().getSimpleName(), 25);
        String valueOf = String.valueOf(this.a.a);
        yx9 yx9Var2 = new yx9((char) 0, 24);
        ((yx9) yx9Var.d).d = yx9Var2;
        yx9Var.d = yx9Var2;
        yx9Var2.b = valueOf;
        yx9Var2.c = "errorCode";
        String str = this.b;
        if (str != null) {
            yx9Var.r(str, "errorMessage");
        }
        return yx9Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        int i2 = this.a.a;
        uue.T(parcel, 2, 4);
        parcel.writeInt(i2);
        uue.P(parcel, 3, this.b);
        uue.T(parcel, 4, 4);
        parcel.writeInt(this.c);
        uue.V(parcel, U);
    }
}
