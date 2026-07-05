package defpackage;

import android.os.Parcel;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p5f  reason: default package */
/* loaded from: classes.dex */
public final class p5f extends ftd {
    public final yj5 V(n78 n78Var, String str, int i) {
        Parcel S = S();
        lde.b(S, n78Var);
        S.writeString(str);
        S.writeInt(i);
        Parcel Q = Q(S, 2);
        yj5 T = n78.T(Q.readStrongBinder());
        Q.recycle();
        return T;
    }

    public final yj5 W(n78 n78Var, String str, int i) {
        Parcel S = S();
        lde.b(S, n78Var);
        S.writeString(str);
        S.writeInt(i);
        Parcel Q = Q(S, 4);
        yj5 T = n78.T(Q.readStrongBinder());
        Q.recycle();
        return T;
    }

    public final yj5 X(n78 n78Var, String str, boolean z, long j) {
        Parcel S = S();
        lde.b(S, n78Var);
        S.writeString(str);
        S.writeInt(z ? 1 : 0);
        S.writeLong(j);
        Parcel Q = Q(S, 7);
        yj5 T = n78.T(Q.readStrongBinder());
        Q.recycle();
        return T;
    }

    public final yj5 Y(n78 n78Var, String str, int i, n78 n78Var2) {
        Parcel S = S();
        lde.b(S, n78Var);
        S.writeString(str);
        S.writeInt(i);
        lde.b(S, n78Var2);
        Parcel Q = Q(S, 8);
        yj5 T = n78.T(Q.readStrongBinder());
        Q.recycle();
        return T;
    }
}
