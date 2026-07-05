package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zk3  reason: default package */
/* loaded from: classes.dex */
public final class zk3 implements Comparator, Parcelable {
    public static final Parcelable.Creator<zk3> CREATOR = new cxd(8);
    public final yk3[] a;
    public int b;
    public final String c;
    public final int d;

    public zk3(Parcel parcel) {
        this.c = parcel.readString();
        yk3[] yk3VarArr = (yk3[]) parcel.createTypedArray(yk3.CREATOR);
        String str = a2d.a;
        this.a = yk3VarArr;
        this.d = yk3VarArr.length;
    }

    public final zk3 a(String str) {
        if (Objects.equals(this.c, str)) {
            return this;
        }
        return new zk3(str, false, this.a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        yk3 yk3Var = (yk3) obj;
        yk3 yk3Var2 = (yk3) obj2;
        UUID uuid = h31.a;
        if (uuid.equals(yk3Var.b)) {
            if (uuid.equals(yk3Var2.b)) {
                return 0;
            }
            return 1;
        }
        return yk3Var.b.compareTo(yk3Var2.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zk3.class == obj.getClass()) {
            zk3 zk3Var = (zk3) obj;
            if (Objects.equals(this.c, zk3Var.c) && Arrays.equals(this.a, zk3Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (this.b == 0) {
            String str = this.c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.b = (hashCode * 31) + Arrays.hashCode(this.a);
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeTypedArray(this.a, 0);
    }

    public zk3(String str, boolean z, yk3... yk3VarArr) {
        this.c = str;
        yk3VarArr = z ? (yk3[]) yk3VarArr.clone() : yk3VarArr;
        this.a = yk3VarArr;
        this.d = yk3VarArr.length;
        Arrays.sort(yk3VarArr, this);
    }

    public zk3(String str, ArrayList arrayList) {
        this(str, false, (yk3[]) arrayList.toArray(new yk3[0]));
    }
}
