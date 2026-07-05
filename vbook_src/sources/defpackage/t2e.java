package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t2e  reason: default package */
/* loaded from: classes.dex */
public final class t2e extends o3 {
    public static final Parcelable.Creator<t2e> CREATOR = new rwd(22);
    public final String a;

    public t2e(String str) {
        am8.s(str);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t2e)) {
            return false;
        }
        return this.a.equals(((t2e) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.P(parcel, 1, this.a);
        uue.V(parcel, U);
    }
}
