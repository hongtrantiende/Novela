package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dm8  reason: default package */
/* loaded from: classes.dex */
public final class dm8 extends jza implements Parcelable, ira, yya, aw7 {
    public static final Parcelable.Creator<dm8> CREATOR = new cxd(26);
    public fra b;

    public dm8(float f) {
        zqa j = dra.j();
        fra fraVar = new fra(f, j.g());
        if (!(j instanceof lz4)) {
            fraVar.b = new fra(f, 1L);
        }
        this.b = fraVar;
    }

    @Override // defpackage.iza
    public final kza a() {
        return this.b;
    }

    @Override // defpackage.iza
    public final kza b(kza kzaVar, kza kzaVar2, kza kzaVar3) {
        if (((fra) kzaVar2).c == ((fra) kzaVar3).c) {
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
        this.b = (fra) kzaVar;
    }

    @Override // defpackage.yya
    public final Object getValue() {
        return Float.valueOf(h());
    }

    public final float h() {
        return ((fra) dra.t(this.b, this)).c;
    }

    public final void i(float f) {
        zqa j;
        fra fraVar = (fra) dra.h(this.b);
        if (fraVar.c == f) {
            return;
        }
        fra fraVar2 = this.b;
        synchronized (dra.c) {
            j = dra.j();
            ((fra) dra.o(fraVar2, this, j, fraVar)).c = f;
        }
        dra.n(j, this);
    }

    @Override // defpackage.aw7
    public final void setValue(Object obj) {
        i(((Number) obj).floatValue());
    }

    public final String toString() {
        float f = ((fra) dra.h(this.b)).c;
        int hashCode = hashCode();
        return "MutableFloatState(value=" + f + ")@" + hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(h());
    }
}
