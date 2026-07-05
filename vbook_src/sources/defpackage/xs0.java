package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xs0  reason: default package */
/* loaded from: classes.dex */
public final class xs0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xs0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d27 d27Var = ((BottomSheetBehavior) obj).n;
                if (d27Var != null) {
                    c27 c27Var = d27Var.a;
                    if (c27Var.h != floatValue) {
                        c27Var.h = floatValue;
                        d27Var.e = true;
                        d27Var.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            default:
                int floatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                cb4 cb4Var = (cb4) obj;
                cb4Var.c.setAlpha(floatValue2);
                cb4Var.d.setAlpha(floatValue2);
                cb4Var.s.invalidate();
                return;
        }
    }
}
