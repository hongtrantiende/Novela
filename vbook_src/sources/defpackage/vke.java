package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vke  reason: default package */
/* loaded from: classes.dex */
public final class vke extends o3 {
    public static final Parcelable.Creator<vke> CREATOR = new kbe(12);
    public final qpe a;
    public final qpe b;

    public vke(qpe qpeVar, qpe qpeVar2) {
        this.a = qpeVar;
        this.b = qpeVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vke)) {
            return false;
        }
        vke vkeVar = (vke) obj;
        if (!hud.l(this.a, vkeVar.a) || !hud.l(this.b, vkeVar.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] i2;
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
        if (qpeVar2 != null) {
            bArr = qpeVar2.i();
        }
        uue.I(parcel, 2, bArr);
        uue.V(parcel, U);
    }
}
