package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tu2  reason: default package */
/* loaded from: classes.dex */
public final class tu2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ rl9 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ yu2 e;

    public tu2(yu2 yu2Var, rl9 rl9Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = yu2Var;
        this.b = rl9Var;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        rl9 rl9Var = this.b;
        yu2 yu2Var = this.e;
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.c.setAlpha(1.0f);
                yu2Var.c(rl9Var);
                yu2Var.q.remove(rl9Var);
                yu2Var.i();
                return;
            default:
                viewPropertyAnimator.setListener(null);
                yu2Var.c(rl9Var);
                yu2Var.o.remove(rl9Var);
                yu2Var.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.e.getClass();
                return;
            default:
                this.e.getClass();
                return;
        }
    }

    public tu2(yu2 yu2Var, rl9 rl9Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = yu2Var;
        this.b = rl9Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
