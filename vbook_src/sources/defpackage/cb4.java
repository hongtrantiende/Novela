package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cb4  reason: default package */
/* loaded from: classes.dex */
public final class cb4 {
    public static final int[] C = {16842919};
    public static final int[] D = new int[0];
    public int A;
    public final og B;
    public final int a;
    public final int b;
    public final StateListDrawable c;
    public final Drawable d;
    public final int e;
    public final int f;
    public final StateListDrawable g;
    public final Drawable h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public int o;
    public float p;
    public final RecyclerView s;
    public final ValueAnimator z;
    public int q = 0;
    public int r = 0;
    public boolean t = false;
    public boolean u = false;
    public int v = 0;
    public int w = 0;
    public final int[] x = new int[2];
    public final int[] y = new int[2];

    public cb4(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(nae.e, 1.0f);
        this.z = ofFloat;
        this.A = 0;
        og ogVar = new og(this, 3);
        this.B = ogVar;
        ab4 ab4Var = new ab4(this);
        this.c = stateListDrawable;
        this.d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new bb4(this));
        ofFloat.addUpdateListener(new xs0(this, 1));
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.K;
            el9 el9Var = recyclerView2.I;
            if (el9Var != null) {
                el9Var.b("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.J();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.s;
            recyclerView3.L.remove(this);
            if (recyclerView3.M == this) {
                recyclerView3.M = null;
            }
            ArrayList arrayList2 = this.s.B0;
            if (arrayList2 != null) {
                arrayList2.remove(ab4Var);
            }
            this.s.removeCallbacks(ogVar);
        }
        this.s = recyclerView;
        ArrayList arrayList3 = recyclerView.K;
        el9 el9Var2 = recyclerView.I;
        if (el9Var2 != null) {
            el9Var2.b("Cannot add item decoration during a scroll  or layout");
        }
        if (arrayList3.isEmpty()) {
            recyclerView.setWillNotDraw(false);
        }
        arrayList3.add(this);
        recyclerView.J();
        recyclerView.requestLayout();
        this.s.L.add(this);
        RecyclerView recyclerView4 = this.s;
        if (recyclerView4.B0 == null) {
            recyclerView4.B0 = new ArrayList();
        }
        recyclerView4.B0.add(ab4Var);
    }

    public static int c(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            int i5 = i - i3;
            int i6 = (int) (((f2 - f) / i4) * i5);
            int i7 = i2 + i6;
            if (i7 < i5 && i7 >= 0) {
                return i6;
            }
        }
        return 0;
    }

    public final boolean a(float f, float f2) {
        if (f2 >= this.r - this.i) {
            int i = this.o;
            int i2 = this.n;
            if (f >= i - (i2 / 2) && f <= (i2 / 2) + i) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean b(float f, float f2) {
        Field field = rcd.a;
        int layoutDirection = this.s.getLayoutDirection();
        int i = this.e;
        if (layoutDirection == 1) {
            if (f > i) {
                return false;
            }
        } else if (f < this.q - i) {
            return false;
        }
        int i2 = this.l;
        int i3 = this.k / 2;
        if (f2 >= i2 - i3 && f2 <= i3 + i2) {
            return true;
        }
        return false;
    }

    public final void d(int i) {
        RecyclerView recyclerView = this.s;
        og ogVar = this.B;
        StateListDrawable stateListDrawable = this.c;
        if (i == 2 && this.v != 2) {
            stateListDrawable.setState(C);
            recyclerView.removeCallbacks(ogVar);
        }
        if (i == 0) {
            recyclerView.invalidate();
        } else {
            e();
        }
        if (this.v == 2 && i != 2) {
            stateListDrawable.setState(D);
            recyclerView.removeCallbacks(ogVar);
            recyclerView.postDelayed(ogVar, 1200L);
        } else if (i == 1) {
            recyclerView.removeCallbacks(ogVar);
            recyclerView.postDelayed(ogVar, 1500L);
        }
        this.v = i;
    }

    public final void e() {
        int i = this.A;
        ValueAnimator valueAnimator = this.z;
        if (i != 0) {
            if (i != 3) {
                return;
            }
            valueAnimator.cancel();
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
