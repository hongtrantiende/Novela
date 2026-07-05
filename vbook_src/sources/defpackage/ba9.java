package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ba9  reason: default package */
/* loaded from: classes.dex */
public final class ba9 extends o3 {
    public static final Parcelable.Creator<ba9> CREATOR = new u7e(11);
    public final String a;
    public final String b;
    public final String c;

    public ba9(String str, String str2, String str3) {
        am8.s(str);
        this.a = str;
        am8.s(str2);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ba9)) {
            return false;
        }
        ba9 ba9Var = (ba9) obj;
        if (!hud.l(this.a, ba9Var.a) || !hud.l(this.b, ba9Var.b) || !hud.l(this.c, ba9Var.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb.append(this.a);
        sb.append("', \n name='");
        sb.append(this.b);
        sb.append("', \n icon='");
        return s21.q(sb, this.c, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.P(parcel, 2, this.a);
        uue.P(parcel, 3, this.b);
        uue.P(parcel, 4, this.c);
        uue.V(parcel, U);
    }
}
