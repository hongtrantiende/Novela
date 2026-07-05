package defpackage;

import android.os.Parcel;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eyd  reason: default package */
/* loaded from: classes.dex */
public final class eyd extends ftd implements zzd {
    public final boolean V() {
        boolean z;
        Parcel Q = Q(S(), 7);
        int i = lde.a;
        if (Q.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        Q.recycle();
        return z;
    }
}
