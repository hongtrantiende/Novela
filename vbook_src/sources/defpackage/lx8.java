package defpackage;

import android.view.View;
import android.widget.Magnifier;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lx8  reason: default package */
/* loaded from: classes.dex */
public final class lx8 implements ix8 {
    public static final lx8 a = new Object();

    @Override // defpackage.ix8
    public final boolean b() {
        return true;
    }

    @Override // defpackage.ix8
    public final hx8 c(View view, boolean z, long j, float f, float f2, boolean z2, r13 r13Var, float f3) {
        if (z) {
            return new jx8(new Magnifier(view));
        }
        long f1 = r13Var.f1(j);
        float L0 = r13Var.L0(f);
        float L02 = r13Var.L0(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (f1 != 9205357640488583168L) {
            builder.setSize(k27.A(Float.intBitsToFloat((int) (f1 >> 32))), k27.A(Float.intBitsToFloat((int) (f1 & 4294967295L))));
        }
        if (!Float.isNaN(L0)) {
            builder.setCornerRadius(L0);
        }
        if (!Float.isNaN(L02)) {
            builder.setElevation(L02);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        return new jx8(builder.build());
    }
}
