package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hq9  reason: default package */
/* loaded from: classes.dex */
public enum hq9 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_DISCOURAGED(0),
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_PREFERRED(1),
    RESIDENT_KEY_REQUIRED(2);
    
    public static final Parcelable.Creator<hq9> CREATOR = new u7e(16);
    public final String a;

    hq9(int i) {
        this.a = r2;
    }

    public static hq9 a(String str) {
        hq9[] values;
        for (hq9 hq9Var : values()) {
            if (str.equals(hq9Var.a)) {
                return hq9Var;
            }
        }
        throw new Exception(hl5.n("Resident key requirement ", str, " not supported"));
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
