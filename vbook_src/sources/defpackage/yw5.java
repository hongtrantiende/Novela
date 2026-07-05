package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yw5  reason: default package */
/* loaded from: classes.dex */
public final class yw5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        uo8 createFromParcel = uo8.CREATOR.createFromParcel(parcel);
        createFromParcel.getClass();
        return new zw5(createFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new zw5[i];
    }
}
