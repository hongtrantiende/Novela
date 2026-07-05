package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m70  reason: default package */
/* loaded from: classes.dex */
public final class m70 extends c70 {
    public static final Parcelable.Creator<m70> CREATOR = new kbe(15);
    public final qpe a;
    public final qpe b;
    public final qpe c;
    public final qpe d;
    public final qpe e;

    public m70(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        qpe h;
        am8.s(bArr);
        qpe h2 = qpe.h(bArr, bArr.length);
        am8.s(bArr2);
        qpe h3 = qpe.h(bArr2, bArr2.length);
        am8.s(bArr3);
        qpe h4 = qpe.h(bArr3, bArr3.length);
        am8.s(bArr4);
        qpe h5 = qpe.h(bArr4, bArr4.length);
        if (bArr5 == null) {
            h = null;
        } else {
            h = qpe.h(bArr5, bArr5.length);
        }
        this.a = h2;
        this.b = h3;
        this.c = h4;
        this.d = h5;
        this.e = h;
    }

    public final JSONObject e() {
        byte[] i;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", jye.l(this.b.i()));
            jSONObject.put("authenticatorData", jye.l(this.c.i()));
            jSONObject.put("signature", jye.l(this.d.i()));
            qpe qpeVar = this.e;
            if (qpeVar != null) {
                if (qpeVar == null) {
                    i = null;
                } else {
                    i = qpeVar.i();
                }
                jSONObject.put("userHandle", jye.l(i));
                return jSONObject;
            }
            return jSONObject;
        } catch (JSONException e) {
            cp8.p("Error encoding AuthenticatorAssertionResponse to JSON object", e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m70) {
            m70 m70Var = (m70) obj;
            if (hud.l(this.a, m70Var.a) && hud.l(this.b, m70Var.b) && hud.l(this.c, m70Var.c) && hud.l(this.d, m70Var.d) && hud.l(this.e, m70Var.e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.e}))});
    }

    public final String toString() {
        byte[] i;
        yx9 yx9Var = new yx9(getClass().getSimpleName(), 25);
        qne qneVar = xne.d;
        byte[] i2 = this.a.i();
        yx9Var.r(qneVar.c(i2, i2.length), "keyHandle");
        byte[] i3 = this.b.i();
        yx9Var.r(qneVar.c(i3, i3.length), "clientDataJSON");
        byte[] i4 = this.c.i();
        yx9Var.r(qneVar.c(i4, i4.length), "authenticatorData");
        byte[] i5 = this.d.i();
        yx9Var.r(qneVar.c(i5, i5.length), "signature");
        qpe qpeVar = this.e;
        if (qpeVar == null) {
            i = null;
        } else {
            i = qpeVar.i();
        }
        if (i != null) {
            yx9Var.r(qneVar.c(i, i.length), "userHandle");
        }
        return yx9Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] i2;
        int U = uue.U(parcel, 20293);
        uue.I(parcel, 2, this.a.i());
        uue.I(parcel, 3, this.b.i());
        uue.I(parcel, 4, this.c.i());
        uue.I(parcel, 5, this.d.i());
        qpe qpeVar = this.e;
        if (qpeVar == null) {
            i2 = null;
        } else {
            i2 = qpeVar.i();
        }
        uue.I(parcel, 6, i2);
        uue.V(parcel, U);
    }
}
