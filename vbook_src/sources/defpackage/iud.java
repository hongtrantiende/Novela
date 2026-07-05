package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iud  reason: default package */
/* loaded from: classes.dex */
public final class iud extends o3 implements is9 {
    public static final Parcelable.Creator<iud> CREATOR = new go8(15);
    public final int a;
    public final int b;
    public final Intent c;

    public iud(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // defpackage.is9
    public final Status b() {
        if (this.b == 0) {
            return Status.e;
        }
        return Status.E;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.T(parcel, 1, 4);
        parcel.writeInt(this.a);
        uue.T(parcel, 2, 4);
        parcel.writeInt(this.b);
        uue.O(parcel, 3, this.c, i);
        uue.V(parcel, U);
    }
}
