package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: da9  reason: default package */
/* loaded from: classes.dex */
public final class da9 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    da9 EF5;
    public static final /* synthetic */ da9[] a = {new Enum("PUBLIC_KEY", 0)};
    public static final Parcelable.Creator<da9> CREATOR = new u7e(12);

    public static da9 a(String str) {
        da9[] values;
        for (da9 da9Var : values()) {
            da9Var.getClass();
            if (str.equals("public-key")) {
                return da9Var;
            }
        }
        throw new Exception(hl5.n("PublicKeyCredentialType ", str, " not supported"));
    }

    public static da9 valueOf(String str) {
        return (da9) Enum.valueOf(da9.class, str);
    }

    public static da9[] values() {
        return (da9[]) a.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "public-key";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString("public-key");
    }
}
