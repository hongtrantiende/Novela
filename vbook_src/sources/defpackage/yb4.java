package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yb4  reason: default package */
/* loaded from: classes.dex */
public final class yb4 extends o3 {
    public static final Parcelable.Creator<yb4> CREATOR = new q4f(12);
    public final String a;

    public yb4(String str) {
        am8.s(str);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yb4)) {
            return false;
        }
        return this.a.equals(((yb4) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return s21.q(new StringBuilder("FidoAppIdExtension{appid='"), this.a, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.P(parcel, 2, this.a);
        uue.V(parcel, U);
    }
}
