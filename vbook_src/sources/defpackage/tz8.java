package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tz8  reason: default package */
/* loaded from: classes.dex */
public final class tz8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ vz8 b;

    public /* synthetic */ tz8(vz8 vz8Var, int i) {
        this.a = i;
        this.b = vz8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = this.a;
        vz8 vz8Var = this.b;
        switch (i) {
            case 0:
                View view = vz8Var.b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = vz8Var.c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = vz8Var.d;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                }
                ViewGroup viewGroup3 = vz8Var.f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                    return;
                }
                return;
            case 1:
            default:
                super.onAnimationEnd(animator);
                return;
            case 2:
                vz8Var.i(0);
                return;
            case 3:
                vz8Var.i(0);
                return;
            case 4:
                ViewGroup viewGroup4 = vz8Var.g;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                    return;
                }
                return;
            case 5:
                ViewGroup viewGroup5 = vz8Var.i;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        int i2 = 4;
        vz8 vz8Var = this.b;
        switch (i) {
            case 0:
                View view = vz8Var.k;
                if ((view instanceof zx2) && !vz8Var.B) {
                    zx2 zx2Var = (zx2) view;
                    ValueAnimator valueAnimator = zx2Var.d0;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(zx2Var.e0, nae.e);
                    valueAnimator.setDuration(250L);
                    valueAnimator.start();
                    return;
                }
                return;
            case 1:
                View view2 = vz8Var.b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup = vz8Var.c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = vz8Var.d;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                ViewGroup viewGroup3 = vz8Var.f;
                if (viewGroup3 != null) {
                    if (vz8Var.B) {
                        i2 = 0;
                    }
                    viewGroup3.setVisibility(i2);
                }
                View view3 = vz8Var.k;
                if ((view3 instanceof zx2) && !vz8Var.B) {
                    zx2 zx2Var2 = (zx2) view3;
                    ValueAnimator valueAnimator2 = zx2Var2.d0;
                    if (valueAnimator2.isStarted()) {
                        valueAnimator2.cancel();
                    }
                    zx2Var2.f0 = false;
                    valueAnimator2.setFloatValues(zx2Var2.e0, 1.0f);
                    valueAnimator2.setDuration(250L);
                    valueAnimator2.start();
                    return;
                }
                return;
            case 2:
                vz8Var.i(4);
                return;
            case 3:
                vz8Var.i(4);
                return;
            case 4:
                ViewGroup viewGroup4 = vz8Var.i;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(0);
                    viewGroup4.setTranslationX(viewGroup4.getWidth());
                    viewGroup4.scrollTo(viewGroup4.getWidth(), 0);
                    return;
                }
                return;
            default:
                ViewGroup viewGroup5 = vz8Var.g;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
