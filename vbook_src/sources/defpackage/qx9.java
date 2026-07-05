package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qx9  reason: default package */
/* loaded from: classes.dex */
public final class qx9 extends o3 {
    public static final Parcelable.Creator<qx9> CREATOR = new rwd(5);
    public final PendingIntent a;

    public qx9(PendingIntent pendingIntent) {
        am8.s(pendingIntent);
        this.a = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qx9)) {
            return false;
        }
        return hud.l(this.a, ((qx9) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.O(parcel, 1, this.a, i);
        uue.V(parcel, U);
    }
}
