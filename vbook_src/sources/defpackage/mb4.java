package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mb4  reason: default package */
/* loaded from: classes.dex */
public final class mb4 extends o3 {
    public static final Parcelable.Creator<mb4> CREATOR = new u7e(23);
    public final String a;
    public final int b;
    public final long c;
    public final boolean d;

    public mb4(String str, int i, long j, boolean z) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = z;
    }

    public final long c() {
        long j = this.c;
        if (j == -1) {
            return this.b;
        }
        return j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mb4) {
            mb4 mb4Var = (mb4) obj;
            if (hud.l(this.a, mb4Var.a) && c() == mb4Var.c() && this.d == mb4Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(c()), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        s26 s26Var = new s26(this);
        s26Var.h(this.a, "name");
        s26Var.h(Long.valueOf(c()), "version");
        s26Var.h(Boolean.valueOf(this.d), "is_fully_rolled_out");
        return s26Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.P(parcel, 1, this.a);
        uue.T(parcel, 2, 4);
        parcel.writeInt(this.b);
        long c = c();
        uue.T(parcel, 3, 8);
        parcel.writeLong(c);
        uue.T(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        uue.V(parcel, U);
    }

    public mb4(String str, long j) {
        this(str, -1, j, false);
    }
}
