package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h1b  reason: default package */
/* loaded from: classes.dex */
public final class h1b implements Comparable, Parcelable {
    public static final Parcelable.Creator<h1b> CREATOR = new go8(12);
    public final int a;
    public final int b;
    public final int c;

    static {
        a2d.K(0);
        a2d.K(1);
        a2d.K(2);
    }

    public h1b(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h1b h1bVar = (h1b) obj;
        int i = this.a - h1bVar.a;
        if (i == 0 && (i = this.b - h1bVar.b) == 0) {
            return this.c - h1bVar.c;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h1b.class == obj.getClass()) {
            h1b h1bVar = (h1b) obj;
            if (this.a == h1bVar.a && this.b == h1bVar.b && this.c == h1bVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return this.a + "." + this.b + "." + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    public h1b() {
        this.a = -1;
        this.b = -1;
        this.c = -1;
    }
}
