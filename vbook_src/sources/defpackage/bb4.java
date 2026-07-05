package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bb4  reason: default package */
/* loaded from: classes.dex */
public final class bb4 extends AnimatorListenerAdapter {
    public boolean a = false;
    public final /* synthetic */ cb4 b;

    public bb4(cb4 cb4Var) {
        this.b = cb4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            this.a = false;
            return;
        }
        cb4 cb4Var = this.b;
        if (((Float) cb4Var.z.getAnimatedValue()).floatValue() == nae.e) {
            cb4Var.A = 0;
            cb4Var.d(0);
            return;
        }
        cb4Var.A = 2;
        cb4Var.s.invalidate();
    }
}
