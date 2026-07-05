package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p41  reason: default package */
/* loaded from: classes.dex */
public final class p41 implements Parcelable {
    public static final Parcelable.Creator<p41> CREATOR = new q4f(4);
    public final zb a;

    public p41(zb zbVar) {
        this.a = zbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static p41 a(int i) {
        an3[] values;
        pg9 pg9Var;
        if (i == -262) {
            pg9Var = pg9.RS1;
        } else {
            pg9[] values2 = pg9.values();
            int length = values2.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    pg9 pg9Var2 = values2[i2];
                    if (pg9Var2.a == i) {
                        pg9Var = pg9Var2;
                        break;
                    }
                    i2++;
                } else {
                    for (an3 an3Var : an3.values()) {
                        if (an3Var.a == i) {
                            pg9Var = an3Var;
                        }
                    }
                    throw new Exception(hl5.l("Algorithm with COSE value ", " not supported", i));
                }
            }
        }
        return new p41(pg9Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof p41) && this.a.a() == ((p41) obj).a.a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return hl5.n("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.a), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.a());
    }
}
