package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w99  reason: default package */
/* loaded from: classes.dex */
public final class w99 extends o3 {
    public static final Parcelable.Creator<w99> CREATOR = new u7e(4);
    public final k70 C;
    public final String D;
    public final String a;
    public final String b;
    public final qpe c;
    public final n70 d;
    public final m70 e;
    public final o70 f;

    public w99(String str, String str2, byte[] bArr, n70 n70Var, m70 m70Var, o70 o70Var, k70 k70Var, String str3) {
        qpe h;
        boolean z;
        if (bArr == null) {
            h = null;
        } else {
            h = qpe.h(bArr, bArr.length);
        }
        boolean z2 = false;
        if ((n70Var != null && m70Var == null && o70Var == null) || ((n70Var == null && m70Var != null && o70Var == null) || (n70Var == null && m70Var == null && o70Var != null))) {
            z = true;
        } else {
            z = false;
        }
        am8.m("Must provide a response object.", z);
        if (o70Var != null || (str != null && h != null)) {
            z2 = true;
        }
        am8.m("Must provide id and rawId if not an error response.", z2);
        this.a = str;
        this.b = str2;
        this.c = h;
        this.d = n70Var;
        this.e = m70Var;
        this.f = o70Var;
        this.C = k70Var;
        this.D = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w99) {
            w99 w99Var = (w99) obj;
            if (hud.l(this.a, w99Var.a) && hud.l(this.b, w99Var.b) && hud.l(this.c, w99Var.c) && hud.l(this.d, w99Var.d) && hud.l(this.e, w99Var.e) && hud.l(this.f, w99Var.f) && hud.l(this.C, w99Var.C) && hud.l(this.D, w99Var.D)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.d, this.f, this.C, this.D});
    }

    public final String toString() {
        byte[] i;
        qpe qpeVar = this.c;
        if (qpeVar == null) {
            i = null;
        } else {
            i = qpeVar.i();
        }
        String l = jye.l(i);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.C);
        StringBuilder y = nk2.y("PublicKeyCredential{\n id='", this.a, "', \n type='", this.b, "', \n rawId=");
        nk2.C(y, l, ", \n registerResponse=", valueOf, ", \n signResponse=");
        nk2.C(y, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        return nk2.w(y, valueOf4, ", \n authenticatorAttachment='", this.D, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        mte mteVar = (mte) gte.b.a.a;
        mte.a.a();
        throw null;
    }
}
