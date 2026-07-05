package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ma4  reason: default package */
/* loaded from: classes.dex */
public final class ma4 extends c70 {
    public static final Parcelable.Creator<ma4> CREATOR = new kbe(13);
    public final String a;

    public ma4(String str) {
        am8.p(str);
        this.a = str;
    }

    @Override // defpackage.c70
    public final String c() {
        return "facebook.com";
    }

    @Override // defpackage.c70
    public final c70 d() {
        return new ma4(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.P(parcel, 1, this.a);
        uue.V(parcel, U);
    }
}
