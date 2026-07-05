package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yk3  reason: default package */
/* loaded from: classes.dex */
public final class yk3 implements Parcelable {
    public static final Parcelable.Creator<yk3> CREATOR = new cxd(9);
    public int a;
    public final UUID b;
    public final String c;
    public final String d;
    public final byte[] e;

    public yk3(Parcel parcel) {
        this.b = new UUID(parcel.readLong(), parcel.readLong());
        this.c = parcel.readString();
        String readString = parcel.readString();
        String str = a2d.a;
        this.d = readString;
        this.e = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yk3)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        yk3 yk3Var = (yk3) obj;
        if (!Objects.equals(this.c, yk3Var.c) || !Objects.equals(this.d, yk3Var.d) || !Objects.equals(this.b, yk3Var.b) || !Arrays.equals(this.e, yk3Var.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.a == 0) {
            int hashCode2 = this.b.hashCode() * 31;
            String str = this.c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.a = Arrays.hashCode(this.e) + eub.j((hashCode2 + hashCode) * 31, 31, this.d);
        }
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.e);
    }

    public yk3(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.b = uuid;
        this.c = str;
        str2.getClass();
        this.d = lc7.p(str2);
        this.e = bArr;
    }
}
