package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fk0  reason: default package */
/* loaded from: classes.dex */
public final class fk0 extends o3 {
    public static final Parcelable.Creator<fk0> CREATOR = new go8(27);
    public final ck0 C;
    public final boolean D;
    public final ek0 a;
    public final bk0 b;
    public final String c;
    public final boolean d;
    public final int e;
    public final dk0 f;

    public fk0(ek0 ek0Var, bk0 bk0Var, String str, boolean z, int i, dk0 dk0Var, ck0 ck0Var, boolean z2) {
        am8.s(ek0Var);
        this.a = ek0Var;
        am8.s(bk0Var);
        this.b = bk0Var;
        this.c = str;
        this.d = z;
        this.e = i;
        this.f = dk0Var == null ? new dk0(false, null, null) : dk0Var;
        this.C = ck0Var == null ? new ck0(null, false) : ck0Var;
        this.D = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fk0)) {
            return false;
        }
        fk0 fk0Var = (fk0) obj;
        if (!hud.l(this.a, fk0Var.a) || !hud.l(this.b, fk0Var.b) || !hud.l(this.f, fk0Var.f) || !hud.l(this.C, fk0Var.C) || !hud.l(this.c, fk0Var.c) || this.d != fk0Var.d || this.e != fk0Var.e || this.D != fk0Var.D) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.f, this.C, this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.D)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.O(parcel, 1, this.a, i);
        uue.O(parcel, 2, this.b, i);
        uue.P(parcel, 3, this.c);
        uue.T(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        uue.T(parcel, 5, 4);
        parcel.writeInt(this.e);
        uue.O(parcel, 6, this.f, i);
        uue.O(parcel, 7, this.C, i);
        uue.T(parcel, 8, 4);
        parcel.writeInt(this.D ? 1 : 0);
        uue.V(parcel, U);
    }
}
