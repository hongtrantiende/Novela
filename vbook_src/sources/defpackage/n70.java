package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n70  reason: default package */
/* loaded from: classes.dex */
public final class n70 extends c70 {
    public static final Parcelable.Creator<n70> CREATOR = new kbe(25);
    public final qpe a;
    public final qpe b;
    public final qpe c;
    public final String[] d;

    public n70(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        am8.s(bArr);
        qpe h = qpe.h(bArr, bArr.length);
        am8.s(bArr2);
        qpe h2 = qpe.h(bArr2, bArr2.length);
        am8.s(bArr3);
        qpe h3 = qpe.h(bArr3, bArr3.length);
        this.a = h;
        this.b = h2;
        this.c = h3;
        am8.s(strArr);
        this.d = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x021c A[Catch: JSONException -> 0x01ae, TRY_LEAVE, TryCatch #13 {JSONException -> 0x01ae, blocks: (B:86:0x0206, B:88:0x021c, B:49:0x0140, B:51:0x014b, B:56:0x0160, B:59:0x017c, B:61:0x0191, B:63:0x0196, B:68:0x01b4, B:69:0x01b9, B:70:0x01ba, B:71:0x01bf, B:76:0x01ca, B:78:0x01d7, B:80:0x01e4, B:81:0x01f8, B:82:0x01fd, B:83:0x01fe, B:84:0x0203, B:91:0x0229, B:92:0x022e, B:95:0x0232, B:96:0x0239, B:97:0x023a, B:98:0x0242, B:101:0x0246, B:112:0x0255, B:113:0x025c, B:105:0x024c, B:117:0x0263, B:118:0x026a, B:120:0x026c, B:121:0x0273, B:125:0x027a, B:126:0x0281, B:128:0x0283, B:129:0x028a, B:134:0x0291, B:135:0x0298), top: B:160:0x0059 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject e() {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n70.e():org.json.JSONObject");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n70) {
            n70 n70Var = (n70) obj;
            if (hud.l(this.a, n70Var.a) && hud.l(this.b, n70Var.b) && hud.l(this.c, n70Var.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c}))});
    }

    public final String toString() {
        yx9 yx9Var = new yx9(getClass().getSimpleName(), 25);
        qne qneVar = xne.d;
        byte[] i = this.a.i();
        yx9Var.r(qneVar.c(i, i.length), "keyHandle");
        byte[] i2 = this.b.i();
        yx9Var.r(qneVar.c(i2, i2.length), "clientDataJSON");
        byte[] i3 = this.c.i();
        yx9Var.r(qneVar.c(i3, i3.length), "attestationObject");
        yx9Var.r(Arrays.toString(this.d), "transports");
        return yx9Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.I(parcel, 2, this.a.i());
        uue.I(parcel, 3, this.b.i());
        uue.I(parcel, 4, this.c.i());
        String[] strArr = this.d;
        if (strArr != null) {
            int U2 = uue.U(parcel, 5);
            parcel.writeStringArray(strArr);
            uue.V(parcel, U2);
        }
        uue.V(parcel, U);
    }
}
