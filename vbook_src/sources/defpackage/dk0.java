package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dk0  reason: default package */
/* loaded from: classes.dex */
public final class dk0 extends o3 {
    public static final Parcelable.Creator<dk0> CREATOR = new rwd(2);
    public final boolean a;
    public final byte[] b;
    public final String c;

    public dk0(boolean z, byte[] bArr, String str) {
        if (z) {
            am8.s(bArr);
            am8.s(str);
        }
        this.a = z;
        this.b = bArr;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk0)) {
            return false;
        }
        dk0 dk0Var = (dk0) obj;
        if (this.a == dk0Var.a && Arrays.equals(this.b, dk0Var.b) && Objects.equals(this.c, dk0Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Objects.hash(Boolean.valueOf(this.a), this.c) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.T(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        uue.I(parcel, 2, this.b);
        uue.P(parcel, 3, this.c);
        uue.V(parcel, U);
    }
}
