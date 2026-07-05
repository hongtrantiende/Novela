package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gm8  reason: default package */
/* loaded from: classes.dex */
public final class gm8 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ gm8(int i) {
        this.a = i;
    }

    public static hm8 a(Parcel parcel, ClassLoader classLoader) {
        kra kraVar;
        if (classLoader == null) {
            classLoader = gm8.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt != 0) {
            if (readInt != 1) {
                if (readInt == 2) {
                    kraVar = r0f.L;
                } else {
                    vs.k(hl5.l("Unsupported MutableState policy ", " was restored", readInt));
                    return null;
                }
            } else {
                kraVar = zj1.G;
            }
        } else {
            kraVar = r0f.J;
        }
        return new hm8(readValue, kraVar);
    }

    public static tra b(Parcel parcel, ClassLoader classLoader) {
        tra traVar = new tra();
        if (classLoader == null) {
            classLoader = tra.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            traVar.add(parcel.readValue(classLoader));
        }
        return traVar;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return a0.b;
                }
                vs.k("superState must be null");
                return null;
            default:
                return b(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new hm8[i];
            case 1:
                return new a0[i];
            default:
                return new tra[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return a0.b;
                }
                vs.k("superState must be null");
                return null;
            default:
                return b(parcel, null);
        }
    }
}
