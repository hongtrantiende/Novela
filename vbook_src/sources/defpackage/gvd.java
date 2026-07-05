package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gvd  reason: default package */
/* loaded from: classes.dex */
public final class gvd extends o3 implements is9 {
    public static final Parcelable.Creator<gvd> CREATOR = new go8(19);
    public final List a;
    public final String b;

    public gvd(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
    }

    @Override // defpackage.is9
    public final Status b() {
        if (this.b != null) {
            return Status.e;
        }
        return Status.E;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.Q(parcel, 1, this.a);
        uue.P(parcel, 2, this.b);
        uue.V(parcel, U);
    }
}
