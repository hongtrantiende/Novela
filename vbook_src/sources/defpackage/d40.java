package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d40  reason: default package */
/* loaded from: classes.dex */
public enum d40 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PLATFORM(0),
    /* JADX INFO: Fake field, exist only in values array */
    CROSS_PLATFORM(1);
    
    public static final Parcelable.Creator<d40> CREATOR = new rwd(10);
    public final String a;

    d40(int i) {
        this.a = r2;
    }

    public static d40 a(String str) {
        d40[] values;
        for (d40 d40Var : values()) {
            if (str.equals(d40Var.a)) {
                return d40Var;
            }
        }
        throw new Exception(hl5.n("Attachment ", str, " not supported"));
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
