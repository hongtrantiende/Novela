package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nra  reason: default package */
/* loaded from: classes.dex */
public final class nra implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ nra(int i) {
        this.a = i;
    }

    public static ora a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = nra.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new ora();
        }
        ku8 e = hqa.b.e();
        for (int i = 0; i < readInt; i++) {
            e.add(parcel.readValue(classLoader));
        }
        return new ora(e.c());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            default:
                return new ml9(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ora[i];
            default:
                return new ml9[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            default:
                return new ml9(parcel, classLoader);
        }
    }
}
