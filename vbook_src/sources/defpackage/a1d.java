package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a1d  reason: default package */
/* loaded from: classes.dex */
public enum a1d implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_REQUIRED(0),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_PREFERRED(1),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_DISCOURAGED(2);
    
    public static final Parcelable.Creator<a1d> CREATOR = new u7e(26);
    public final String a;

    a1d(int i) {
        this.a = r2;
    }

    public static a1d a(String str) {
        a1d[] values;
        for (a1d a1dVar : values()) {
            if (str.equals(a1dVar.a)) {
                return a1dVar;
            }
        }
        throw new Exception(hl5.n("User verification requirement ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
