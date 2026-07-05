package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hde  reason: default package */
/* loaded from: classes.dex */
public final class hde extends c70 {
    public static final Parcelable.Creator<hde> CREATOR = new kbe(8);
    public final String C;
    public final String a;
    public final String b;
    public final String c;
    public final u5e d;
    public final String e;
    public final String f;

    public hde(String str, String str2, String str3, u5e u5eVar, String str4, String str5, String str6) {
        this.a = str == null ? "" : str;
        this.b = str2;
        this.c = str3;
        this.d = u5eVar;
        this.e = str4;
        this.f = str5;
        this.C = str6;
    }

    public static hde e(u5e u5eVar) {
        am8.t(u5eVar, "Must specify a non-null webSignInCredential");
        return new hde(null, null, null, u5eVar, null, null, null);
    }

    @Override // defpackage.c70
    public final String c() {
        return this.a;
    }

    @Override // defpackage.c70
    public final c70 d() {
        return new hde(this.a, this.b, this.c, this.d, this.e, this.f, this.C);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.P(parcel, 1, this.a);
        uue.P(parcel, 2, this.b);
        uue.P(parcel, 3, this.c);
        uue.O(parcel, 4, this.d, i);
        uue.P(parcel, 5, this.e);
        uue.P(parcel, 6, this.f);
        uue.P(parcel, 7, this.C);
        uue.V(parcel, U);
    }
}
