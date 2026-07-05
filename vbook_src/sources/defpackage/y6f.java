package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y6f  reason: default package */
/* loaded from: classes.dex */
public final class y6f extends o3 {
    public static final Parcelable.Creator<y6f> CREATOR = new q4f(6);
    public final long a;
    public final qpe b;
    public final qpe c;
    public final qpe d;

    public y6f(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        am8.s(bArr);
        qpe h = qpe.h(bArr, bArr.length);
        am8.s(bArr2);
        qpe h2 = qpe.h(bArr2, bArr2.length);
        am8.s(bArr3);
        qpe h3 = qpe.h(bArr3, bArr3.length);
        this.a = j;
        this.b = h;
        this.c = h2;
        this.d = h3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y6f) {
            y6f y6fVar = (y6f) obj;
            if (this.a == y6fVar.a && hud.l(this.b, y6fVar.b) && hud.l(this.c, y6fVar.c) && hud.l(this.d, y6fVar.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.T(parcel, 1, 8);
        parcel.writeLong(this.a);
        uue.I(parcel, 2, this.b.i());
        uue.I(parcel, 3, this.c.i());
        uue.I(parcel, 4, this.d.i());
        uue.V(parcel, U);
    }
}
