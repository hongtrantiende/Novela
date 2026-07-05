package defpackage;

import sun.misc.Unsafe;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xwc  reason: default package */
/* loaded from: classes.dex */
public final class xwc extends dxc {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xwc(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.dxc
    public final boolean c(Object obj, long j) {
        switch (this.b) {
            case 0:
                if (gxc.g) {
                    return gxc.b(obj, j);
                }
                return gxc.c(obj, j);
            default:
                if (gxc.g) {
                    return gxc.b(obj, j);
                }
                return gxc.c(obj, j);
        }
    }

    @Override // defpackage.dxc
    public final double d(Object obj, long j) {
        switch (this.b) {
            case 0:
                return Double.longBitsToDouble(g(obj, j));
            default:
                return Double.longBitsToDouble(g(obj, j));
        }
    }

    @Override // defpackage.dxc
    public final float e(Object obj, long j) {
        switch (this.b) {
            case 0:
                return Float.intBitsToFloat(f(obj, j));
            default:
                return Float.intBitsToFloat(f(obj, j));
        }
    }

    @Override // defpackage.dxc
    public final void j(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (gxc.g) {
                    gxc.k(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    gxc.l(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (gxc.g) {
                    gxc.k(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    gxc.l(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // defpackage.dxc
    public final void k(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (gxc.g) {
                    gxc.k(obj, j, b);
                    return;
                } else {
                    gxc.l(obj, j, b);
                    return;
                }
            default:
                if (gxc.g) {
                    gxc.k(obj, j, b);
                    return;
                } else {
                    gxc.l(obj, j, b);
                    return;
                }
        }
    }

    @Override // defpackage.dxc
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

    @Override // defpackage.dxc
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

    @Override // defpackage.dxc
    public final boolean r() {
        switch (this.b) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
