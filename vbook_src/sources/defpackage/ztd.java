package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ztd  reason: default package */
/* loaded from: classes.dex */
public abstract class ztd extends ptd {
    @Override // defpackage.ptd
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            qtd.b(parcel);
            b((Bundle) qtd.a(parcel));
            return true;
        }
        return false;
    }

    public abstract void b(Bundle bundle);
}
