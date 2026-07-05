package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p70  reason: default package */
/* loaded from: classes.dex */
public final class p70 extends o3 {
    public static final Parcelable.Creator<p70> CREATOR = new kbe(29);
    public final d40 a;
    public final Boolean b;
    public final a1d c;
    public final hq9 d;

    public p70(String str, String str2, String str3, Boolean bool) {
        d40 a;
        a1d a2;
        hq9 a3;
        if (str == null) {
            a = null;
        } else {
            try {
                a = d40.a(str);
            } catch (c40 | gq9 | tae e) {
                xk5.m(e);
                throw null;
            }
        }
        this.a = a;
        this.b = bool;
        if (str2 == null) {
            a2 = null;
        } else {
            a2 = a1d.a(str2);
        }
        this.c = a2;
        if (str3 == null) {
            a3 = null;
        } else {
            a3 = hq9.a(str3);
        }
        this.d = a3;
    }

    public final hq9 c() {
        hq9 hq9Var = this.d;
        if (hq9Var == null) {
            hq9Var = null;
            Boolean bool = this.b;
            if (bool != null) {
                if (!bool.booleanValue()) {
                    return null;
                }
                return hq9.RESIDENT_KEY_REQUIRED;
            }
        }
        return hq9Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p70)) {
            return false;
        }
        p70 p70Var = (p70) obj;
        if (!hud.l(this.a, p70Var.a) || !hud.l(this.b, p70Var.b) || !hud.l(this.c, p70Var.c) || !hud.l(c(), p70Var.c())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, c()});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        StringBuilder o = a82.o("AuthenticatorSelectionCriteria{\n attachment=", valueOf, ", \n requireResidentKey=");
        o.append(this.b);
        o.append(", \n requireUserVerification=");
        o.append(valueOf2);
        o.append(", \n residentKeyRequirement=");
        return s21.q(o, valueOf3, "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        int U = uue.U(parcel, 20293);
        String str3 = null;
        d40 d40Var = this.a;
        if (d40Var == null) {
            str = null;
        } else {
            str = d40Var.a;
        }
        uue.P(parcel, 2, str);
        uue.G(parcel, 3, this.b);
        a1d a1dVar = this.c;
        if (a1dVar == null) {
            str2 = null;
        } else {
            str2 = a1dVar.a;
        }
        uue.P(parcel, 4, str2);
        hq9 c = c();
        if (c != null) {
            str3 = c.a;
        }
        uue.P(parcel, 5, str3);
        uue.V(parcel, U);
    }
}
