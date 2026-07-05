package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: px9  reason: default package */
/* loaded from: classes.dex */
public final class px9 extends o3 {
    public static final Parcelable.Creator<px9> CREATOR = new rwd(4);
    public final xka a;
    public final String b;
    public final int c;

    public px9(xka xkaVar, String str, int i) {
        am8.s(xkaVar);
        this.a = xkaVar;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof px9)) {
            return false;
        }
        px9 px9Var = (px9) obj;
        if (!hud.l(this.a, px9Var.a) || !hud.l(this.b, px9Var.b) || this.c != px9Var.c) {
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
        uue.O(parcel, 1, this.a, i);
        uue.P(parcel, 2, this.b);
        uue.T(parcel, 3, 4);
        parcel.writeInt(this.c);
        uue.V(parcel, U);
    }
}
