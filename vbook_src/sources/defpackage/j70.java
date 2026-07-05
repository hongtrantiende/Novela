package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j70  reason: default package */
/* loaded from: classes.dex */
public final class j70 extends o3 {
    public static final Parcelable.Creator<j70> CREATOR = new kbe(5);
    public final ncf C;
    public final t2e D;
    public final c15 E;
    public final c7e F;
    public final bae G;
    public final m5e H;
    public final yb4 a;
    public final k9f b;
    public final z0d c;
    public final pkf d;
    public final fyd e;
    public final a0e f;

    public j70(yb4 yb4Var, k9f k9fVar, z0d z0dVar, pkf pkfVar, fyd fydVar, a0e a0eVar, ncf ncfVar, t2e t2eVar, c15 c15Var, c7e c7eVar, bae baeVar, m5e m5eVar) {
        this.a = yb4Var;
        this.c = z0dVar;
        this.b = k9fVar;
        this.d = pkfVar;
        this.e = fydVar;
        this.f = a0eVar;
        this.C = ncfVar;
        this.D = t2eVar;
        this.E = c15Var;
        this.F = c7eVar;
        this.G = baeVar;
        this.H = m5eVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j70)) {
            return false;
        }
        j70 j70Var = (j70) obj;
        if (!hud.l(this.a, j70Var.a) || !hud.l(this.b, j70Var.b) || !hud.l(this.c, j70Var.c) || !hud.l(this.d, j70Var.d) || !hud.l(this.e, j70Var.e) || !hud.l(this.f, j70Var.f) || !hud.l(this.C, j70Var.C) || !hud.l(this.D, j70Var.D) || !hud.l(this.E, j70Var.E) || !hud.l(this.F, j70Var.F) || !hud.l(this.G, j70Var.G) || !hud.l(this.H, j70Var.H)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, this.H});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.C);
        String valueOf8 = String.valueOf(this.D);
        String valueOf9 = String.valueOf(this.E);
        String valueOf10 = String.valueOf(this.F);
        String valueOf11 = String.valueOf(this.G);
        StringBuilder y = nk2.y("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        nk2.C(y, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        nk2.C(y, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        nk2.C(y, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        nk2.C(y, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return s21.q(y, valueOf11, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.O(parcel, 2, this.a, i);
        uue.O(parcel, 3, this.b, i);
        uue.O(parcel, 4, this.c, i);
        uue.O(parcel, 5, this.d, i);
        uue.O(parcel, 6, this.e, i);
        uue.O(parcel, 7, this.f, i);
        uue.O(parcel, 8, this.C, i);
        uue.O(parcel, 9, this.D, i);
        uue.O(parcel, 10, this.E, i);
        uue.O(parcel, 11, this.F, i);
        uue.O(parcel, 12, this.G, i);
        uue.O(parcel, 13, this.H, i);
        uue.V(parcel, U);
    }
}
