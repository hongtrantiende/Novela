package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sz8  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class sz8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sz8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                vz8 vz8Var = (vz8) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = vz8Var.b;
                if (view != null) {
                    view.setAlpha(floatValue);
                }
                ViewGroup viewGroup = vz8Var.c;
                if (viewGroup != null) {
                    viewGroup.setAlpha(floatValue);
                }
                ViewGroup viewGroup2 = vz8Var.d;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(floatValue);
                }
                ViewGroup viewGroup3 = vz8Var.f;
                if (viewGroup3 != null) {
                    viewGroup3.setAlpha(floatValue);
                    return;
                }
                return;
            case 1:
                ((vz8) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                ((vz8) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                vz8 vz8Var2 = (vz8) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view2 = vz8Var2.b;
                if (view2 != null) {
                    view2.setAlpha(floatValue2);
                }
                ViewGroup viewGroup4 = vz8Var2.c;
                if (viewGroup4 != null) {
                    viewGroup4.setAlpha(floatValue2);
                }
                ViewGroup viewGroup5 = vz8Var2.d;
                if (viewGroup5 != null) {
                    viewGroup5.setAlpha(floatValue2);
                }
                ViewGroup viewGroup6 = vz8Var2.f;
                if (viewGroup6 != null) {
                    viewGroup6.setAlpha(floatValue2);
                    return;
                }
                return;
            default:
                zx2 zx2Var = (zx2) obj;
                zx2Var.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zx2Var.invalidate(zx2Var.a);
                return;
        }
    }
}
