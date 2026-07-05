package defpackage;

import android.os.Build;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gr  reason: default package */
/* loaded from: classes.dex */
public final class gr implements wq2 {
    public final boolean a;

    public gr() {
        boolean z;
        if (Build.VERSION.SDK_INT < 34) {
            z = true;
        } else {
            z = false;
        }
        this.a = z;
    }

    @Override // defpackage.wq2
    public final xq2 a(xta xtaVar, xe8 xe8Var) {
        bz0 v = xtaVar.a.v();
        if (!v.P0(0L, vq2.b) && !v.P0(0L, vq2.a) && (!v.P0(0L, vq2.c) || !v.P0(8L, vq2.d) || !v.P0(12L, vq2.e) || !v.request(21L) || ((byte) (v.b().S(20L) & 2)) <= 0)) {
            if (Build.VERSION.SDK_INT >= 30 && v.P0(4L, vq2.f)) {
                if (!v.P0(8L, vq2.g) && !v.P0(8L, vq2.h) && !v.P0(8L, vq2.i)) {
                    return null;
                }
            } else {
                return null;
            }
        }
        return new lr(xtaVar.a, xe8Var, this.a);
    }
}
