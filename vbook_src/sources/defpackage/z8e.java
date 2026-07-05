package defpackage;

import sun.misc.Unsafe;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z8e  reason: default package */
/* loaded from: classes.dex */
public final class z8e extends a9e {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z8e(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.a9e
    public final double a(Object obj, long j) {
        switch (this.b) {
            case 0:
                return Double.longBitsToDouble(k(obj, j));
            default:
                return Double.longBitsToDouble(k(obj, j));
        }
    }

    @Override // defpackage.a9e
    public final void c(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (b9e.f) {
                    b9e.i(obj, j, b);
                    return;
                } else {
                    b9e.k(obj, j, b);
                    return;
                }
            default:
                if (b9e.f) {
                    b9e.i(obj, j, b);
                    return;
                } else {
                    b9e.k(obj, j, b);
                    return;
                }
        }
    }

    @Override // defpackage.a9e
    public final void d(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                f(obj, j, Double.doubleToLongBits(d));
                return;
            default:
                f(obj, j, Double.doubleToLongBits(d));
                return;
        }
    }

    @Override // defpackage.a9e
    public final void e(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                b(j, obj, Float.floatToIntBits(f));
                return;
            default:
                b(j, obj, Float.floatToIntBits(f));
                return;
        }
    }

    @Override // defpackage.a9e
    public final void g(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (b9e.f) {
                    b9e.i(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    b9e.k(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (b9e.f) {
                    b9e.i(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    b9e.k(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // defpackage.a9e
    public final float h(Object obj, long j) {
        switch (this.b) {
            case 0:
                return Float.intBitsToFloat(j(obj, j));
            default:
                return Float.intBitsToFloat(j(obj, j));
        }
    }

    @Override // defpackage.a9e
    public final boolean i(Object obj, long j) {
        switch (this.b) {
            case 0:
                if (b9e.f) {
                    if (((byte) (b9e.c.j(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)))) == 0) {
                        return false;
                    }
                } else {
                    if (((byte) (b9e.c.j(obj, (-4) & j) >>> ((int) ((j & 3) << 3)))) == 0) {
                        return false;
                    }
                }
                return true;
            default:
                if (b9e.f) {
                    if (((byte) (b9e.c.j(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)))) == 0) {
                        return false;
                    }
                } else {
                    if (((byte) (b9e.c.j(obj, (-4) & j) >>> ((int) ((j & 3) << 3)))) == 0) {
                        return false;
                    }
                }
                return true;
        }
    }
}
