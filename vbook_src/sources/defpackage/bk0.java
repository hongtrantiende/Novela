package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bk0  reason: default package */
/* loaded from: classes.dex */
public final class bk0 extends o3 {
    public static final Parcelable.Creator<bk0> CREATOR = new rwd(0);
    public final boolean C;
    public final boolean a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final ArrayList f;

    public bk0(boolean z, String str, String str2, boolean z2, String str3, ArrayList arrayList, boolean z3) {
        boolean z4 = true;
        if (z2 && z3) {
            z4 = false;
        }
        am8.m("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z4);
        this.a = z;
        if (z) {
            am8.t(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.b = str;
        this.c = str2;
        this.d = z2;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f = arrayList2;
        this.e = str3;
        this.C = z3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bk0) {
            bk0 bk0Var = (bk0) obj;
            if (this.a == bk0Var.a && hud.l(this.b, bk0Var.b) && hud.l(this.c, bk0Var.c) && this.d == bk0Var.d && hud.l(this.e, bk0Var.e) && hud.l(this.f, bk0Var.f) && this.C == bk0Var.C) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, this.c, Boolean.valueOf(this.d), this.e, this.f, Boolean.valueOf(this.C)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.T(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        uue.P(parcel, 2, this.b);
        uue.P(parcel, 3, this.c);
        uue.T(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        uue.P(parcel, 5, this.e);
        uue.Q(parcel, 6, this.f);
        uue.T(parcel, 7, 4);
        parcel.writeInt(this.C ? 1 : 0);
        uue.V(parcel, U);
    }
}
