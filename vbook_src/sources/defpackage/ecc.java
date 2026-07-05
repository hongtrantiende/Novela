package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ecc  reason: default package */
/* loaded from: classes.dex */
public enum ecc implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PRESENT(0),
    /* JADX INFO: Fake field, exist only in values array */
    SUPPORTED(1),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_SUPPORTED(2);
    
    public static final Parcelable.Creator<ecc> CREATOR = new u7e(19);
    public final String a;

    ecc(int i) {
        this.a = r2;
    }

    public static ecc a(String str) {
        ecc[] values;
        for (ecc eccVar : values()) {
            if (str.equals(eccVar.a)) {
                return eccVar;
            }
        }
        throw new Exception(hl5.n("TokenBindingStatus ", str, " not supported"));
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
