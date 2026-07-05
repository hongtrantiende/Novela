package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q70  reason: default package */
/* loaded from: classes.dex */
public final class q70 extends o3 {
    public static final Parcelable.Creator<q70> CREATOR = new go8(25);
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final GoogleSignInAccount e;
    public final PendingIntent f;

    public q70(String str, String str2, String str3, ArrayList arrayList, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        am8.s(arrayList);
        this.d = arrayList;
        this.f = pendingIntent;
        this.e = googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q70)) {
            return false;
        }
        q70 q70Var = (q70) obj;
        if (!hud.l(this.a, q70Var.a) || !hud.l(this.b, q70Var.b) || !hud.l(this.c, q70Var.c) || !hud.l(this.d, q70Var.d) || !hud.l(this.f, q70Var.f) || !hud.l(this.e, q70Var.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.f, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.P(parcel, 1, this.a);
        uue.P(parcel, 2, this.b);
        uue.P(parcel, 3, this.c);
        uue.Q(parcel, 4, this.d);
        uue.O(parcel, 5, this.e, i);
        uue.O(parcel, 6, this.f, i);
        uue.V(parcel, U);
    }
}
