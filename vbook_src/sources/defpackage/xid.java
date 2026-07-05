package defpackage;

import android.view.View;
import android.view.WindowInsetsAnimation;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xid  reason: default package */
/* loaded from: classes.dex */
public final class xid extends yid {
    public final WindowInsetsAnimation e;

    public xid(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    public static cx5 e(WindowInsetsAnimation.Bounds bounds) {
        return cx5.c(bounds.getUpperBound());
    }

    public static cx5 f(WindowInsetsAnimation.Bounds bounds) {
        return cx5.c(bounds.getLowerBound());
    }

    public static void g(View view, xb1 xb1Var) {
        wid widVar;
        if (xb1Var != null) {
            widVar = new wid(xb1Var);
        } else {
            widVar = null;
        }
        view.setWindowInsetsAnimationCallback(widVar);
    }

    @Override // defpackage.yid
    public final long a() {
        return this.e.getDurationMillis();
    }

    @Override // defpackage.yid
    public final float b() {
        return this.e.getInterpolatedFraction();
    }

    @Override // defpackage.yid
    public final int c() {
        return this.e.getTypeMask();
    }

    @Override // defpackage.yid
    public final void d(float f) {
        this.e.setFraction(f);
    }
}
