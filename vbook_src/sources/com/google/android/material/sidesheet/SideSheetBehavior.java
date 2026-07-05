package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends eg0 {
    public final d27 k;
    public final ColorStateList l;
    public final xea m;
    public int n;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateList;
        int resourceId;
        new xk9(this);
        this.n = 5;
        new LinkedHashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fg9.h);
        if (obtainStyledAttributes.hasValue(3)) {
            this.l = (!obtainStyledAttributes.hasValue(3) || (resourceId = obtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = eze.l(context, resourceId)) == null) ? obtainStyledAttributes.getColorStateList(3) : colorStateList;
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.m = xea.b(context, attributeSet, 0, 2132018232).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            obtainStyledAttributes.getResourceId(5, -1);
        }
        xea xeaVar = this.m;
        if (xeaVar != null) {
            d27 d27Var = new d27(xeaVar);
            this.k = d27Var;
            d27Var.f(context);
            ColorStateList colorStateList2 = this.l;
            if (colorStateList2 != null) {
                d27 d27Var2 = this.k;
                c27 c27Var = d27Var2.a;
                if (c27Var.c != colorStateList2) {
                    c27Var.c = colorStateList2;
                    d27Var2.onStateChange(d27Var2.getState());
                }
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.k.setTint(typedValue.data);
            }
        }
        obtainStyledAttributes.getDimension(2, -1.0f);
        obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public SideSheetBehavior() {
        new xk9(this);
        this.n = 5;
        new LinkedHashSet();
    }
}
