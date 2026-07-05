package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vu2  reason: default package */
/* loaded from: classes.dex */
public final class vu2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ wu2 b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ yu2 e;

    public /* synthetic */ vu2(yu2 yu2Var, wu2 wu2Var, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.a = i;
        this.e = yu2Var;
        this.b = wu2Var;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        wu2 wu2Var = this.b;
        yu2 yu2Var = this.e;
        View view = this.d;
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(nae.e);
                view.setTranslationY(nae.e);
                yu2Var.c(wu2Var.a);
                yu2Var.r.remove(wu2Var.a);
                yu2Var.i();
                return;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(nae.e);
                view.setTranslationY(nae.e);
                yu2Var.c(wu2Var.b);
                yu2Var.r.remove(wu2Var.b);
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
}
