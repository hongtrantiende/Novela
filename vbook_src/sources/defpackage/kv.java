package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kv  reason: default package */
/* loaded from: classes.dex */
public final class kv extends o3 {
    public static final Parcelable.Creator<kv> CREATOR = cxd.b;
    public static final kv d;
    public final mt1 a;
    public final boolean b;
    public boolean c;

    static {
        kv kvVar = new kv(null, false);
        kvVar.c = false;
        d = kvVar;
    }

    public kv(mt1 mt1Var, boolean z) {
        this.a = mt1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kv) {
            kv kvVar = (kv) obj;
            if (hud.l(this.a, kvVar.a) && this.c == kvVar.c && this.b == kvVar.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.c), Boolean.valueOf(this.b)});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        return nk2.v(new StringBuilder(valueOf.length() + 31), "ApiMetadata(complianceOptions=", valueOf, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.c) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int U = uue.U(parcel, 20293);
        uue.O(parcel, 1, this.a, i);
        uue.T(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        uue.V(parcel, U);
    }
}
