package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ck0  reason: default package */
/* loaded from: classes.dex */
public final class ck0 extends o3 {
    public static final Parcelable.Creator<ck0> CREATOR = new rwd(1);
    public final boolean a;
    public final String b;

    public ck0(String str, boolean z) {
        if (z) {
            am8.s(str);
        }
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck0)) {
            return false;
        }
        ck0 ck0Var = (ck0) obj;
        if (this.a == ck0Var.a && hud.l(this.b, ck0Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.T(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        uue.P(parcel, 2, this.b);
        uue.V(parcel, U);
    }
}
