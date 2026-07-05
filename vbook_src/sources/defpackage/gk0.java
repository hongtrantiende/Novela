package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gk0  reason: default package */
/* loaded from: classes.dex */
public final class gk0 extends o3 {
    public static final Parcelable.Creator<gk0> CREATOR = new go8(28);
    public final PendingIntent a;

    public gk0(PendingIntent pendingIntent) {
        am8.s(pendingIntent);
        this.a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.O(parcel, 1, this.a, i);
        uue.V(parcel, U);
    }
}
