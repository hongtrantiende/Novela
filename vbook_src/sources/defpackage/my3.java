package defpackage;

import android.graphics.Rect;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: my3  reason: default package */
/* loaded from: classes.dex */
public final class my3 extends uk9 {
    @Override // defpackage.uk9
    public final gw7 H1() {
        gw7 gw7Var = new gw7(new Rect[16], 0);
        gw7Var.d(gw7Var.c, xoe.o(this).getSystemGestureExclusionRects());
        return gw7Var;
    }

    @Override // defpackage.uk9
    public final void I1(gw7 gw7Var) {
        xoe.o(this).setSystemGestureExclusionRects(gw7Var.f());
    }
}
