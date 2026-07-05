package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cp  reason: default package */
/* loaded from: classes.dex */
public final class cp extends xb1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewGroup e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cp(ViewGroup viewGroup, int i) {
        super(1);
        this.d = i;
        this.e = viewGroup;
    }

    @Override // defpackage.xb1
    public final tjd f(tjd tjdVar, List list) {
        int i = this.d;
        ViewGroup viewGroup = this.e;
        switch (i) {
            case 0:
                return ((wcd) viewGroup).n(tjdVar);
            default:
                w53 w53Var = (w53) viewGroup;
                if (!w53Var.I) {
                    View childAt = w53Var.getChildAt(0);
                    int max = Math.max(0, childAt.getLeft());
                    int max2 = Math.max(0, childAt.getTop());
                    int max3 = Math.max(0, w53Var.getWidth() - childAt.getRight());
                    int max4 = Math.max(0, w53Var.getHeight() - childAt.getBottom());
                    if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                        return tjdVar.a.r(max, max2, max3, max4);
                    }
                    return tjdVar;
                }
                return tjdVar;
        }
    }

    @Override // defpackage.xb1
    public final rwa g(zid zidVar, rwa rwaVar) {
        int i = this.d;
        ViewGroup viewGroup = this.e;
        int i2 = 0;
        switch (i) {
            case 0:
                wv5 wv5Var = (wv5) ((wcd) viewGroup).V.c0.d;
                if (wv5Var.u0.J) {
                    long v = hif.v(wv5Var.h0(0L));
                    int i3 = (int) (v >> 32);
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    int i4 = (int) (v & 4294967295L);
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    long a = obe.t(wv5Var).a();
                    int i5 = (int) (a >> 32);
                    int i6 = (int) (a & 4294967295L);
                    long j = wv5Var.c;
                    long v2 = hif.v(wv5Var.h0((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L)));
                    int i7 = i5 - ((int) (v2 >> 32));
                    if (i7 < 0) {
                        i7 = 0;
                    }
                    int i8 = i6 - ((int) (v2 & 4294967295L));
                    if (i8 >= 0) {
                        i2 = i8;
                    }
                    if (i3 != 0 || i4 != 0 || i7 != 0 || i2 != 0) {
                        return new rwa(10, kp.m((cx5) rwaVar.b, i3, i4, i7, i2), kp.m((cx5) rwaVar.c, i3, i4, i7, i2));
                    }
                    return rwaVar;
                }
                return rwaVar;
            default:
                w53 w53Var = (w53) viewGroup;
                if (!w53Var.I) {
                    View childAt = w53Var.getChildAt(0);
                    int max = Math.max(0, childAt.getLeft());
                    int max2 = Math.max(0, childAt.getTop());
                    int max3 = Math.max(0, w53Var.getWidth() - childAt.getRight());
                    int max4 = Math.max(0, w53Var.getHeight() - childAt.getBottom());
                    if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                        cx5 b = cx5.b(max, max2, max3, max4);
                        int i9 = b.a;
                        int i10 = b.b;
                        int i11 = b.c;
                        int i12 = b.d;
                        return new rwa(10, tjd.a((cx5) rwaVar.b, i9, i10, i11, i12), tjd.a((cx5) rwaVar.c, i9, i10, i11, i12));
                    }
                    return rwaVar;
                }
                return rwaVar;
        }
    }
}
