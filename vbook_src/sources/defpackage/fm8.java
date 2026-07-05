package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fm8  reason: default package */
/* loaded from: classes.dex */
public final class fm8 extends jza implements Parcelable, ira, yya, aw7 {
    public static final Parcelable.Creator<fm8> CREATOR = new cxd(28);
    public hra b;

    public fm8(long j) {
        zqa j2 = dra.j();
        hra hraVar = new hra(j2.g(), j);
        if (!(j2 instanceof lz4)) {
            hraVar.b = new hra(1L, j);
        }
        this.b = hraVar;
    }

    @Override // defpackage.iza
    public final kza a() {
        return this.b;
    }

    @Override // defpackage.iza
    public final kza b(kza kzaVar, kza kzaVar2, kza kzaVar3) {
        if (((hra) kzaVar2).c == ((hra) kzaVar3).c) {
            return kzaVar2;
        }
        return null;
    }

    @Override // defpackage.ira
    public final kra d() {
        return zj1.G;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.iza
    public final void e(kza kzaVar) {
        kzaVar.getClass();
        this.b = (hra) kzaVar;
    }

    @Override // defpackage.yya
    public final Object getValue() {
        return Long.valueOf(h());
    }

    public final long h() {
        return ((hra) dra.t(this.b, this)).c;
    }

    public final void i(long j) {
        zqa j2;
        hra hraVar = (hra) dra.h(this.b);
        if (hraVar.c != j) {
            hra hraVar2 = this.b;
            synchronized (dra.c) {
                j2 = dra.j();
                ((hra) dra.o(hraVar2, this, j2, hraVar)).c = j;
            }
            dra.n(j2, this);
        }
    }

    @Override // defpackage.aw7
    public final void setValue(Object obj) {
        i(((Number) obj).longValue());
    }

    public final String toString() {
        long j = ((hra) dra.h(this.b)).c;
        int hashCode = hashCode();
        return "MutableLongState(value=" + j + ")@" + hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(h());
    }
}
