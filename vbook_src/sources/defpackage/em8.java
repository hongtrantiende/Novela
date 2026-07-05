package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: em8  reason: default package */
/* loaded from: classes.dex */
public final class em8 extends jza implements Parcelable, ira, yya, aw7 {
    public static final Parcelable.Creator<em8> CREATOR = new cxd(27);
    public gra b;

    public em8(int i) {
        zqa j = dra.j();
        gra graVar = new gra(j.g(), i);
        if (!(j instanceof lz4)) {
            graVar.b = new gra(1L, i);
        }
        this.b = graVar;
    }

    @Override // defpackage.iza
    public final kza a() {
        return this.b;
    }

    @Override // defpackage.iza
    public final kza b(kza kzaVar, kza kzaVar2, kza kzaVar3) {
        if (((gra) kzaVar2).c == ((gra) kzaVar3).c) {
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
        this.b = (gra) kzaVar;
    }

    @Override // defpackage.yya
    public final Object getValue() {
        return Integer.valueOf(h());
    }

    public final int h() {
        return ((gra) dra.t(this.b, this)).c;
    }

    public final void i(int i) {
        zqa j;
        gra graVar = (gra) dra.h(this.b);
        if (graVar.c != i) {
            gra graVar2 = this.b;
            synchronized (dra.c) {
                j = dra.j();
                ((gra) dra.o(graVar2, this, j, graVar)).c = i;
            }
            dra.n(j, this);
        }
    }

    @Override // defpackage.aw7
    public final void setValue(Object obj) {
        i(((Number) obj).intValue());
    }

    public final String toString() {
        return rs8.k("MutableIntState(value=", ((gra) dra.h(this.b)).c, hashCode(), ")@");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(h());
    }
}
