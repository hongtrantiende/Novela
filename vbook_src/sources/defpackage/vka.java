package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vka  reason: default package */
/* loaded from: classes.dex */
public final class vka extends o3 {
    public static final Parcelable.Creator<vka> CREATOR = new rwd(6);
    public final String C;
    public final String D;
    public final w99 E;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;
    public final String f;

    public vka(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, w99 w99Var) {
        am8.s(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
        this.f = str5;
        this.C = str6;
        this.D = str7;
        this.E = w99Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vka)) {
            return false;
        }
        vka vkaVar = (vka) obj;
        if (!hud.l(this.a, vkaVar.a) || !hud.l(this.b, vkaVar.b) || !hud.l(this.c, vkaVar.c) || !hud.l(this.d, vkaVar.d) || !hud.l(this.e, vkaVar.e) || !hud.l(this.f, vkaVar.f) || !hud.l(this.C, vkaVar.C) || !hud.l(this.D, vkaVar.D) || !hud.l(this.E, vkaVar.E)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.P(parcel, 1, this.a);
        uue.P(parcel, 2, this.b);
        uue.P(parcel, 3, this.c);
        uue.P(parcel, 4, this.d);
        uue.O(parcel, 5, this.e, i);
        uue.P(parcel, 6, this.f);
        uue.P(parcel, 7, this.C);
        uue.P(parcel, 8, this.D);
        uue.O(parcel, 9, this.E, i);
        uue.V(parcel, U);
    }
}
