package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yn9  reason: default package */
/* loaded from: classes.dex */
public final class yn9 implements Parcelable {
    public static final Parcelable.Creator<yn9> CREATOR = new go8(7);
    public final int a;
    public final int b;
    public final int c;

    public yn9(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yn9)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        yn9 yn9Var = (yn9) obj;
        if (this.a != yn9Var.a || this.b != yn9Var.b || this.c != yn9Var.c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
