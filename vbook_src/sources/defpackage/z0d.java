package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z0d  reason: default package */
/* loaded from: classes.dex */
public final class z0d extends o3 {
    public static final Parcelable.Creator<z0d> CREATOR = new u7e(25);
    public final boolean a;

    public z0d(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z0d) || this.a != ((z0d) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.T(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        uue.V(parcel, U);
    }
}
