package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ab4  reason: default package */
/* loaded from: classes.dex */
public final class ab4 extends hl9 {
    public final /* synthetic */ cb4 a;

    public ab4(cb4 cb4Var) {
        this.a = cb4Var;
    }

    @Override // defpackage.hl9
    public final void a(RecyclerView recyclerView) {
        boolean z;
        boolean z2;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        cb4 cb4Var = this.a;
        int i = cb4Var.a;
        int computeVerticalScrollRange = cb4Var.s.computeVerticalScrollRange();
        int i2 = cb4Var.r;
        if (computeVerticalScrollRange - i2 > 0 && i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        cb4Var.t = z;
        int computeHorizontalScrollRange = cb4Var.s.computeHorizontalScrollRange();
        int i3 = cb4Var.q;
        if (computeHorizontalScrollRange - i3 > 0 && i3 >= i) {
            z2 = true;
        } else {
            z2 = false;
        }
        cb4Var.u = z2;
        boolean z3 = cb4Var.t;
        if (!z3 && !z2) {
            if (cb4Var.v != 0) {
                cb4Var.d(0);
                return;
            }
            return;
        }
        if (z3) {
            float f = i2;
            cb4Var.l = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
            cb4Var.k = Math.min(i2, (i2 * i2) / computeVerticalScrollRange);
        }
        if (cb4Var.u) {
            float f2 = computeHorizontalScrollOffset;
            float f3 = i3;
            cb4Var.o = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
            cb4Var.n = Math.min(i3, (i3 * i3) / computeHorizontalScrollRange);
        }
        int i4 = cb4Var.v;
        if (i4 != 0 && i4 != 1) {
            return;
        }
        cb4Var.d(1);
    }
}
