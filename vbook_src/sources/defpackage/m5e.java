package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m5e  reason: default package */
/* loaded from: classes.dex */
public final class m5e extends o3 {
    public static final Parcelable.Creator<m5e> CREATOR = new rwd(28);
    public final qpe a;
    public final qpe b;
    public final qpe c;
    public final int d;

    public m5e(qpe qpeVar, qpe qpeVar2, qpe qpeVar3, int i) {
        this.a = qpeVar;
        this.b = qpeVar2;
        this.c = qpeVar3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m5e)) {
            return false;
        }
        m5e m5eVar = (m5e) obj;
        if (!hud.l(this.a, m5eVar.a) || !hud.l(this.b, m5eVar.b) || !hud.l(this.c, m5eVar.c) || this.d != m5eVar.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        byte[] i;
        byte[] i2;
        byte[] bArr = null;
        qpe qpeVar = this.a;
        if (qpeVar == null) {
            i = null;
        } else {
            i = qpeVar.i();
        }
        String l = jye.l(i);
        qpe qpeVar2 = this.b;
        if (qpeVar2 == null) {
            i2 = null;
        } else {
            i2 = qpeVar2.i();
        }
        String l2 = jye.l(i2);
        qpe qpeVar3 = this.c;
        if (qpeVar3 != null) {
            bArr = qpeVar3.i();
        }
        String l3 = jye.l(bArr);
        StringBuilder y = nk2.y("HmacSecretExtension{coseKeyAgreement=", l, ", saltEnc=", l2, ", saltAuth=");
        y.append(l3);
        y.append(", getPinUvAuthProtocol=");
        return rs8.g(this.d, "}", y);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] i2;
        byte[] i3;
        int U = uue.U(parcel, 20293);
        byte[] bArr = null;
        qpe qpeVar = this.a;
        if (qpeVar == null) {
            i2 = null;
        } else {
            i2 = qpeVar.i();
        }
        uue.I(parcel, 1, i2);
        qpe qpeVar2 = this.b;
        if (qpeVar2 == null) {
            i3 = null;
        } else {
            i3 = qpeVar2.i();
        }
        uue.I(parcel, 2, i3);
        qpe qpeVar3 = this.c;
        if (qpeVar3 != null) {
            bArr = qpeVar3.i();
        }
        uue.I(parcel, 3, bArr);
        uue.T(parcel, 4, 4);
        parcel.writeInt(this.d);
        uue.V(parcel, U);
    }
}
