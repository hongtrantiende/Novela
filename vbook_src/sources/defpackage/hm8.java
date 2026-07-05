package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hm8  reason: default package */
/* loaded from: classes.dex */
public final class hm8 extends jza implements Parcelable, ira {
    public static final Parcelable.Creator<hm8> CREATOR = new gm8(0);
    public final kra b;
    public jra c;

    public hm8(Object obj, kra kraVar) {
        this.b = kraVar;
        zqa j = dra.j();
        jra jraVar = new jra(obj, j.g());
        if (!(j instanceof lz4)) {
            jraVar.b = new jra(obj, 1L);
        }
        this.c = jraVar;
    }

    @Override // defpackage.iza
    public final kza a() {
        return this.c;
    }

    @Override // defpackage.iza
    public final kza b(kza kzaVar, kza kzaVar2, kza kzaVar3) {
        jra jraVar = (jra) kzaVar;
        if (this.b.i(((jra) kzaVar2).c, ((jra) kzaVar3).c)) {
            return kzaVar2;
        }
        return null;
    }

    @Override // defpackage.ira
    public final kra d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.iza
    public final void e(kza kzaVar) {
        kzaVar.getClass();
        this.c = (jra) kzaVar;
    }

    @Override // defpackage.yya
    public final Object getValue() {
        return ((jra) dra.t(this.c, this)).c;
    }

    @Override // defpackage.aw7
    public final void setValue(Object obj) {
        zqa j;
        jra jraVar = (jra) dra.h(this.c);
        if (!this.b.i(jraVar.c, obj)) {
            jra jraVar2 = this.c;
            synchronized (dra.c) {
                j = dra.j();
                ((jra) dra.o(jraVar2, this, j, jraVar)).c = obj;
            }
            dra.n(j, this);
        }
    }

    public final String toString() {
        Object obj = ((jra) dra.h(this.c)).c;
        int hashCode = hashCode();
        return "MutableState(value=" + obj + ")@" + hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        r0f r0fVar = r0f.J;
        kra kraVar = this.b;
        if (c16.i(kraVar, r0fVar)) {
            i2 = 0;
        } else if (c16.i(kraVar, zj1.G)) {
            i2 = 1;
        } else if (c16.i(kraVar, r0f.L)) {
            i2 = 2;
        } else {
            vs.k("Only known types of MutableState's SnapshotMutationPolicy are supported");
            return;
        }
        parcel.writeInt(i2);
    }
}
