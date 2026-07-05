package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xka  reason: default package */
/* loaded from: classes.dex */
public final class xka extends o3 {
    public static final Parcelable.Creator<xka> CREATOR = new rwd(7);
    public final String a;
    public final String b;

    public xka(String str, String str2) {
        am8.t(str, "Account identifier cannot be null");
        String trim = str.trim();
        am8.q(trim, "Account identifier cannot be empty");
        this.a = trim;
        am8.p(str2);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xka)) {
            return false;
        }
        xka xkaVar = (xka) obj;
        if (!hud.l(this.a, xkaVar.a) || !hud.l(this.b, xkaVar.b)) {
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
        uue.P(parcel, 1, this.a);
        uue.P(parcel, 2, this.b);
        uue.V(parcel, U);
    }
}
