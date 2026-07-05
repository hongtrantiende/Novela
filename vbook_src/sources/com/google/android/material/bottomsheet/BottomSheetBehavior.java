package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.vbook.android.R;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends eg0 {
    public final boolean k;
    public int l;
    public boolean m;
    public final d27 n;
    public final ColorStateList o;
    public final boolean p;
    public final xea q;
    public boolean r;
    public final ValueAnimator s;
    public final int t;
    public final boolean u;
    public int v;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        ColorStateList colorStateList;
        int resourceId;
        this.k = true;
        new n07(this);
        this.v = 4;
        new ArrayList();
        new SparseIntArray();
        context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fg9.a);
        int i2 = 3;
        if (obtainStyledAttributes.hasValue(3)) {
            this.o = (!obtainStyledAttributes.hasValue(3) || (resourceId = obtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = eze.l(context, resourceId)) == null) ? obtainStyledAttributes.getColorStateList(3) : colorStateList;
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.q = xea.b(context, attributeSet, R.attr.bottomSheetStyle, 2132018086).a();
        }
        xea xeaVar = this.q;
        if (xeaVar != null) {
            d27 d27Var = new d27(xeaVar);
            this.n = d27Var;
            d27Var.f(context);
            ColorStateList colorStateList2 = this.o;
            if (colorStateList2 != null) {
                d27 d27Var2 = this.n;
                c27 c27Var = d27Var2.a;
                if (c27Var.c != colorStateList2) {
                    c27Var.c = colorStateList2;
                    d27Var2.onStateChange(d27Var2.getState());
                }
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.n.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(nae.e, 1.0f);
        this.s = ofFloat;
        ofFloat.setDuration(500L);
        this.s.addUpdateListener(new xs0(this, 0));
        obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i = peekValue.data) == -1) {
            C(i);
        } else {
            C(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z = obtainStyledAttributes.getBoolean(8, false);
        if (this.u != z) {
            this.u = z;
            if (!z && this.v == 5 && this.v != 4) {
                this.v = 4;
            }
        }
        obtainStyledAttributes.getBoolean(13, false);
        boolean z2 = obtainStyledAttributes.getBoolean(6, true);
        if (this.k != z2) {
            this.k = z2;
            i2 = (z2 && this.v == 6) ? i2 : this.v;
            if (this.v != i2) {
                this.v = i2;
            }
            D(this.v);
        }
        obtainStyledAttributes.getBoolean(12, false);
        obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.getInt(10, 0);
        float f = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f > nae.e && f < 1.0f) {
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i3 = peekValue2.data;
                if (i3 >= 0) {
                    this.t = i3;
                    D(this.v);
                } else {
                    vs.m("offset must be greater than or equal to 0");
                    throw null;
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.t = dimensionPixelOffset;
                    D(this.v);
                } else {
                    vs.m("offset must be greater than or equal to 0");
                    throw null;
                }
            }
            obtainStyledAttributes.getInt(11, 500);
            obtainStyledAttributes.getBoolean(17, false);
            obtainStyledAttributes.getBoolean(18, false);
            obtainStyledAttributes.getBoolean(19, false);
            obtainStyledAttributes.getBoolean(20, true);
            obtainStyledAttributes.getBoolean(14, false);
            obtainStyledAttributes.getBoolean(15, false);
            obtainStyledAttributes.getBoolean(16, false);
            this.p = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        vs.m("ratio must be a float value between 0 and 1");
        throw null;
    }

    public final void C(int i) {
        boolean z = this.m;
        if (i == -1) {
            if (!z) {
                this.m = true;
            }
        } else if (!z && this.l == i) {
        } else {
            this.m = false;
            this.l = Math.max(0, i);
        }
    }

    public final void D(int i) {
        boolean z;
        d27 d27Var;
        if (i != 2) {
            if (this.v == 3 && this.p) {
                z = true;
            } else {
                z = false;
            }
            if (this.r != z && (d27Var = this.n) != null) {
                this.r = z;
                ValueAnimator valueAnimator = this.s;
                float f = 1.0f;
                if (valueAnimator != null) {
                    if (valueAnimator.isRunning()) {
                        valueAnimator.reverse();
                        return;
                    }
                    float f2 = d27Var.a.h;
                    if (z) {
                        f = 0.0f;
                    }
                    valueAnimator.setFloatValues(f2, f);
                    valueAnimator.start();
                    return;
                }
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    valueAnimator.cancel();
                }
                if (this.r) {
                    f = 0.0f;
                }
                c27 c27Var = d27Var.a;
                if (c27Var.h != f) {
                    c27Var.h = f;
                    d27Var.e = true;
                    d27Var.invalidateSelf();
                }
            }
        }
    }

    public BottomSheetBehavior() {
        this.k = true;
        new n07(this);
        this.v = 4;
        new ArrayList();
        new SparseIntArray();
    }
}
