package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f40  reason: default package */
/* loaded from: classes.dex */
public enum f40 implements Parcelable {
    NONE(0),
    /* JADX INFO: Fake field, exist only in values array */
    INDIRECT(1),
    /* JADX INFO: Fake field, exist only in values array */
    DIRECT(2);
    
    public static final Parcelable.Creator<f40> CREATOR = new u7e(24);
    public final String a;

    f40(int i) {
        this.a = r2;
    }

    public static f40 a(String str) {
        f40[] values;
        for (f40 f40Var : values()) {
            if (str.equals(f40Var.a)) {
                return f40Var;
            }
        }
        throw new Exception(hl5.n("Attestation conveyance preference ", str, " not supported"));
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
