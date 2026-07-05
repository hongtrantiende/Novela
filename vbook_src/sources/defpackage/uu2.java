package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uu2  reason: default package */
/* loaded from: classes.dex */
public final class uu2 extends AnimatorListenerAdapter {
    public final /* synthetic */ rl9 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewPropertyAnimator e;
    public final /* synthetic */ yu2 f;

    public uu2(yu2 yu2Var, rl9 rl9Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f = yu2Var;
        this.a = rl9Var;
        this.b = i;
        this.c = view;
        this.d = i2;
        this.e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.b;
        View view = this.c;
        if (i != 0) {
            view.setTranslationX(nae.e);
        }
        if (this.d != 0) {
            view.setTranslationY(nae.e);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.e.setListener(null);
        yu2 yu2Var = this.f;
        rl9 rl9Var = this.a;
        yu2Var.c(rl9Var);
        yu2Var.p.remove(rl9Var);
        yu2Var.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f.getClass();
    }
}
