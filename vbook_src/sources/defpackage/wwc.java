package defpackage;

import sun.misc.Unsafe;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wwc  reason: default package */
/* loaded from: classes.dex */
public final class wwc extends cxc {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wwc(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.cxc
    public final boolean c(Object obj, long j) {
        switch (this.b) {
            case 0:
                if (fxc.g) {
                    if (fxc.h(obj, j) == 0) {
                        return false;
                    }
                } else if (fxc.i(obj, j) == 0) {
                    return false;
                }
                return true;
            default:
                if (fxc.g) {
                    if (fxc.h(obj, j) == 0) {
                        return false;
                    }
                } else if (fxc.i(obj, j) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // defpackage.cxc
    public final byte d(Object obj, long j) {
        switch (this.b) {
            case 0:
                if (fxc.g) {
                    return fxc.h(obj, j);
                }
                return fxc.i(obj, j);
            default:
                if (fxc.g) {
                    return fxc.h(obj, j);
                }
                return fxc.i(obj, j);
        }
    }

    @Override // defpackage.cxc
    public final double e(Object obj, long j) {
        switch (this.b) {
            case 0:
                return Double.longBitsToDouble(h(obj, j));
            default:
                return Double.longBitsToDouble(h(obj, j));
        }
    }

    @Override // defpackage.cxc
    public final float f(Object obj, long j) {
        switch (this.b) {
            case 0:
                return Float.intBitsToFloat(g(obj, j));
            default:
                return Float.intBitsToFloat(g(obj, j));
        }
    }

    @Override // defpackage.cxc
    public final void k(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (fxc.g) {
                    fxc.k(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    fxc.l(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (fxc.g) {
                    fxc.k(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    fxc.l(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // defpackage.cxc
    public final void l(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                o(obj, j, Double.doubleToLongBits(d));
                return;
            default:
                o(obj, j, Double.doubleToLongBits(d));
                return;
        }
    }

    @Override // defpackage.cxc
    public final void m(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                n(j, obj, Float.floatToIntBits(f));
                return;
            default:
                n(j, obj, Float.floatToIntBits(f));
                return;
        }
    }

    @Override // defpackage.cxc
    public final boolean r() {
        switch (this.b) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
