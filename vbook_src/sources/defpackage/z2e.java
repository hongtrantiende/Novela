package defpackage;

import sun.misc.Unsafe;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z2e  reason: default package */
/* loaded from: classes.dex */
public final class z2e extends c3e {
    @Override // defpackage.c3e
    public final void P(Object obj, long j, byte b) {
        if (e3e.f) {
            e3e.b(obj, j, b);
        } else {
            e3e.c(obj, j, b);
        }
    }

    @Override // defpackage.c3e
    public final boolean R(Object obj, long j) {
        if (e3e.f) {
            return e3e.n(obj, j);
        }
        return e3e.o(obj, j);
    }

    @Override // defpackage.c3e
    public final void S(Object obj, long j, boolean z) {
        if (e3e.f) {
            e3e.b(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            e3e.c(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.c3e
    public final float T(Object obj, long j) {
        return Float.intBitsToFloat(((Unsafe) this.a).getInt(obj, j));
    }

    @Override // defpackage.c3e
    public final void U(Object obj, long j, float f) {
        ((Unsafe) this.a).putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.c3e
    public final double V(Object obj, long j) {
        return Double.longBitsToDouble(((Unsafe) this.a).getLong(obj, j));
    }

    @Override // defpackage.c3e
    public final void X(Object obj, long j, double d) {
        ((Unsafe) this.a).putLong(obj, j, Double.doubleToLongBits(d));
    }
}
