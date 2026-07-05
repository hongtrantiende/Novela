package defpackage;

import android.os.Parcel;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xg3  reason: default package */
/* loaded from: classes.dex */
public final class xg3 extends zg3 {
    public final int a;
    public final List b;
    public final String c;

    public xg3(int i, String str, List list) {
        this.a = i;
        this.b = list;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xg3) {
                xg3 xg3Var = (xg3) obj;
                if (this.a != xg3Var.a || !this.b.equals(xg3Var.b) || !this.c.equals(xg3Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + eub.l(Integer.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Failure(failedBatchIndex=");
        sb.append(this.a);
        sb.append(", appliedIds=");
        sb.append(this.b);
        sb.append(", errorMessage=");
        return s21.p(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
        parcel.writeInt(this.a);
        parcel.writeStringList(this.b);
        parcel.writeString(this.c);
    }
}
