package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ht9 */
/* loaded from: classes.dex */
public final class ht9 extends View {
    public pwc a;
    public Boolean b;
    public Long c;
    public e09 d;
    public ve e;
    public static final int[] f = {16842919, 16842910};
    public static final int[] C = new int[0];

    private final void setRippleState(boolean z) {
        long j;
        int[] iArr;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.c;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        long j2 = currentAnimationTimeMillis - j;
        if (!z && j2 < 5) {
            e09 e09Var = new e09(this, 2);
            this.d = e09Var;
            postDelayed(e09Var, 50L);
        } else {
            if (z) {
                iArr = f;
            } else {
                iArr = C;
            }
            pwc pwcVar = this.a;
            if (pwcVar != null) {
                pwcVar.setState(iArr);
            }
        }
        this.c = Long.valueOf(currentAnimationTimeMillis);
    }

    public static final void setRippleState$lambda$1(ht9 ht9Var) {
        pwc pwcVar = ht9Var.a;
        if (pwcVar != null) {
            pwcVar.setState(C);
        }
        ht9Var.d = null;
    }

    public final void b(l59 l59Var, boolean z, long j, int i, long j2, float f2, ve veVar) {
        if (this.a == null || !Boolean.valueOf(z).equals(this.b)) {
            pwc pwcVar = new pwc(z);
            setBackground(pwcVar);
            this.a = pwcVar;
            this.b = Boolean.valueOf(z);
        }
        pwc pwcVar2 = this.a;
        pwcVar2.getClass();
        this.e = veVar;
        e(j, i, j2, f2);
        if (z) {
            pwcVar2.setHotspot(Float.intBitsToFloat((int) (l59Var.a >> 32)), Float.intBitsToFloat((int) (l59Var.a & 4294967295L)));
        } else {
            pwcVar2.setHotspot(pwcVar2.getBounds().centerX(), pwcVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.e = null;
        e09 e09Var = this.d;
        if (e09Var != null) {
            removeCallbacks(e09Var);
            e09 e09Var2 = this.d;
            e09Var2.getClass();
            e09Var2.run();
        } else {
            pwc pwcVar = this.a;
            if (pwcVar != null) {
                pwcVar.setState(C);
            }
        }
        pwc pwcVar2 = this.a;
        if (pwcVar2 == null) {
            return;
        }
        pwcVar2.setVisible(false, false);
        unscheduleDrawable(pwcVar2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            c();
        } else {
            super.draw(canvas);
        }
    }

    public final void e(long j, int i, long j2, float f2) {
        boolean c;
        pwc pwcVar = this.a;
        if (pwcVar == null) {
            return;
        }
        if (pwcVar.getRadius() != i) {
            pwcVar.setRadius(i);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f2 *= 2.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        long b = zl1.b(f2, j2);
        zl1 zl1Var = pwcVar.b;
        if (zl1Var == null) {
            c = false;
        } else {
            c = zl1.c(zl1Var.a, b);
        }
        if (!c) {
            pwcVar.b = new zl1(b);
            pwcVar.setColor(ColorStateList.valueOf(sve.x(b)));
        }
        Rect rect = new Rect(0, 0, k27.A(Float.intBitsToFloat((int) (j >> 32))), k27.A(Float.intBitsToFloat((int) (j & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        pwcVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        ve veVar = this.e;
        if (veVar != null) {
            veVar.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
