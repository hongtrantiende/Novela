package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vf0  reason: default package */
/* loaded from: classes.dex */
public final class vf0 implements Parcelable {
    public static final Parcelable.Creator<vf0> CREATOR = new cxd(2);
    public final int C;
    public final int D;
    public final CharSequence E;
    public final int F;
    public final CharSequence G;
    public final ArrayList H;
    public final ArrayList I;
    public final boolean J;
    public final int[] a;
    public final ArrayList b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final String f;

    public vf0(uf0 uf0Var) {
        String str;
        int size = uf0Var.a.size();
        this.a = new int[size * 6];
        if (uf0Var.g) {
            this.b = new ArrayList(size);
            this.c = new int[size];
            this.d = new int[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                qs4 qs4Var = (qs4) uf0Var.a.get(i2);
                int i3 = i + 1;
                this.a[i] = qs4Var.a;
                ArrayList arrayList = this.b;
                rr4 rr4Var = qs4Var.b;
                if (rr4Var != null) {
                    str = rr4Var.e;
                } else {
                    str = null;
                }
                arrayList.add(str);
                int[] iArr = this.a;
                iArr[i3] = qs4Var.c ? 1 : 0;
                iArr[i + 2] = qs4Var.d;
                iArr[i + 3] = qs4Var.e;
                int i4 = i + 5;
                iArr[i + 4] = qs4Var.f;
                i += 6;
                iArr[i4] = qs4Var.g;
                this.c[i2] = qs4Var.h.ordinal();
                this.d[i2] = qs4Var.i.ordinal();
            }
            this.e = uf0Var.f;
            this.f = uf0Var.h;
            this.C = uf0Var.s;
            this.D = uf0Var.i;
            this.E = uf0Var.j;
            this.F = uf0Var.k;
            this.G = uf0Var.l;
            this.H = uf0Var.m;
            this.I = uf0Var.n;
            this.J = uf0Var.o;
            return;
        }
        vs.k("Not on back stack");
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        TextUtils.writeToParcel(this.E, parcel, 0);
        parcel.writeInt(this.F);
        TextUtils.writeToParcel(this.G, parcel, 0);
        parcel.writeStringList(this.H);
        parcel.writeStringList(this.I);
        parcel.writeInt(this.J ? 1 : 0);
    }

    public vf0(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.C = parcel.readInt();
        this.D = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.E = (CharSequence) creator.createFromParcel(parcel);
        this.F = parcel.readInt();
        this.G = (CharSequence) creator.createFromParcel(parcel);
        this.H = parcel.createStringArrayList();
        this.I = parcel.createStringArrayList();
        this.J = parcel.readInt() != 0;
    }
}
