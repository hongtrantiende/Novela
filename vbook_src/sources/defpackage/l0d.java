package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l0d  reason: default package */
/* loaded from: classes.dex */
public final class l0d extends o3 {
    public static final Parcelable.Creator<l0d> CREATOR = new u7e(17);
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final Uri e;

    public l0d(String str, String str2, boolean z, boolean z2) {
        Uri parse;
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        if (TextUtils.isEmpty(str2)) {
            parse = null;
        } else {
            parse = Uri.parse(str2);
        }
        this.e = parse;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.P(parcel, 2, this.a);
        uue.P(parcel, 3, this.b);
        uue.T(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        uue.T(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        uue.V(parcel, U);
    }
}
