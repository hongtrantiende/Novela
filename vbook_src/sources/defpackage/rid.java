package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rid  reason: default package */
/* loaded from: classes.dex */
public final class rid implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ zid a;
    public final /* synthetic */ tjd b;
    public final /* synthetic */ tjd c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public rid(zid zidVar, tjd tjdVar, tjd tjdVar2, int i, View view) {
        this.a = zidVar;
        this.b = tjdVar;
        this.c = tjdVar2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        hjd ajdVar;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        zid zidVar = this.a;
        yid yidVar = zidVar.a;
        yidVar.d(animatedFraction);
        float b = yidVar.b();
        PathInterpolator pathInterpolator = uid.e;
        int i = Build.VERSION.SDK_INT;
        tjd tjdVar = this.b;
        if (i >= 36) {
            ajdVar = new gjd(tjdVar);
        } else if (i >= 35) {
            ajdVar = new fjd(tjdVar);
        } else if (i >= 34) {
            ajdVar = new ejd(tjdVar);
        } else if (i >= 31) {
            ajdVar = new djd(tjdVar);
        } else if (i >= 30) {
            ajdVar = new cjd(tjdVar);
        } else if (i >= 29) {
            ajdVar = new bjd(tjdVar);
        } else {
            ajdVar = new ajd(tjdVar);
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            qjd qjdVar = tjdVar.a;
            if (i3 == 0) {
                ajdVar.d(i2, qjdVar.i(i2));
            } else {
                cx5 i4 = qjdVar.i(i2);
                cx5 i5 = this.c.a.i(i2);
                float f = 1.0f - b;
                ajdVar.d(i2, tjd.a(i4, (int) (((i4.a - i5.a) * f) + 0.5d), (int) (((i4.b - i5.b) * f) + 0.5d), (int) (((i4.c - i5.c) * f) + 0.5d), (int) (((i4.d - i5.d) * f) + 0.5d)));
            }
        }
        uid.g(this.e, ajdVar.b(), Collections.singletonList(zidVar));
    }
}
