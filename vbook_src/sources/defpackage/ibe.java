package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ibe  reason: default package */
/* loaded from: classes.dex */
public final class ibe extends o3 {
    public static final Parcelable.Creator<ibe> CREATOR = new kbe(0);
    public final String a;
    public final dbe b;
    public final String c;
    public final long d;
    public final long e;

    public ibe(ibe ibeVar, long j, long j2) {
        am8.s(ibeVar);
        this.a = ibeVar.a;
        this.b = ibeVar.b;
        this.c = ibeVar.c;
        this.d = j;
        this.e = j2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String str = this.c;
        int length = String.valueOf(str).length();
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + valueOf.length());
        nk2.C(sb, "origin=", str, ",name=", str2);
        return s21.q(sb, ",params=", valueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        kbe.b(this, parcel, i);
    }

    public ibe(String str, dbe dbeVar, String str2, long j, long j2) {
        this.a = str;
        this.b = dbeVar;
        this.c = str2;
        this.d = j;
        this.e = j2;
    }
}
