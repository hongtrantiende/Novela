package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class CarouselLayoutManager extends el9 {
    public ny0 o;
    public final View.OnLayoutChangeListener p;

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        Paint paint = new Paint();
        Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
        this.p = new g71(this, 0);
        new lh9(29);
        k0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fg9.b);
            obtainStyledAttributes.getInt(0, 0);
            k0();
            y0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }

    @Override // defpackage.el9
    public final void O(RecyclerView recyclerView) {
        k0();
        recyclerView.addOnLayoutChangeListener(this.p);
    }

    @Override // defpackage.el9
    public final void P(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.p);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (r7 == 1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (x0() != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
        if (r7 == 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
        if (x0() != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    @Override // defpackage.el9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View Q(android.view.View r5, int r6, defpackage.kl9 r7, defpackage.nl9 r8) {
        /*
            r4 = this;
            int r7 = r4.u()
            r8 = 0
            if (r7 != 0) goto L9
            goto L96
        L9:
            ny0 r7 = r4.o
            int r7 = r7.b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = -1
            r2 = 1
            if (r6 == r2) goto L47
            r3 = 2
            if (r6 == r3) goto L3d
            r3 = 17
            if (r6 == r3) goto L4c
            r3 = 33
            if (r6 == r3) goto L49
            r3 = 66
            if (r6 == r3) goto L3f
            r3 = 130(0x82, float:1.82E-43)
            if (r6 == r3) goto L3b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown focus request:"
            r7.<init>(r3)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "CarouselLayoutManager"
            android.util.Log.d(r7, r6)
        L39:
            r6 = r0
            goto L55
        L3b:
            if (r7 != r2) goto L39
        L3d:
            r6 = r2
            goto L55
        L3f:
            if (r7 != 0) goto L39
            boolean r6 = r4.x0()
            if (r6 == 0) goto L3d
        L47:
            r6 = r1
            goto L55
        L49:
            if (r7 != r2) goto L39
            goto L47
        L4c:
            if (r7 != 0) goto L39
            boolean r6 = r4.x0()
            if (r6 == 0) goto L47
            goto L3d
        L55:
            if (r6 != r0) goto L58
            goto L96
        L58:
            r7 = 0
            if (r6 != r1) goto L8b
            int r5 = defpackage.el9.E(r5)
            if (r5 != 0) goto L62
            goto L96
        L62:
            android.view.View r5 = r4.t(r7)
            int r5 = defpackage.el9.E(r5)
            int r5 = r5 - r2
            if (r5 < 0) goto L7a
            int r6 = r4.y()
            if (r5 < r6) goto L74
            goto L7a
        L74:
            ny0 r4 = r4.o
            r4.i()
            throw r8
        L7a:
            boolean r5 = r4.x0()
            if (r5 == 0) goto L86
            int r5 = r4.u()
            int r7 = r5 + (-1)
        L86:
            android.view.View r4 = r4.t(r7)
            return r4
        L8b:
            int r5 = defpackage.el9.E(r5)
            int r6 = r4.y()
            int r6 = r6 - r2
            if (r5 != r6) goto L97
        L96:
            return r8
        L97:
            int r5 = r4.u()
            int r5 = r5 - r2
            android.view.View r5 = r4.t(r5)
            int r5 = defpackage.el9.E(r5)
            int r5 = r5 + r2
            if (r5 < 0) goto Lb4
            int r6 = r4.y()
            if (r5 < r6) goto Lae
            goto Lb4
        Lae:
            ny0 r4 = r4.o
            r4.i()
            throw r8
        Lb4:
            boolean r5 = r4.x0()
            if (r5 == 0) goto Lbb
            goto Lc1
        Lbb:
            int r5 = r4.u()
            int r7 = r5 + (-1)
        Lc1:
            android.view.View r4 = r4.t(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.Q(android.view.View, int, kl9, nl9):android.view.View");
    }

    @Override // defpackage.el9
    public final void R(AccessibilityEvent accessibilityEvent) {
        super.R(accessibilityEvent);
        if (u() > 0) {
            accessibilityEvent.setFromIndex(el9.E(t(0)));
            accessibilityEvent.setToIndex(el9.E(t(u() - 1)));
        }
    }

    @Override // defpackage.el9
    public final void V(int i, int i2) {
        y();
    }

    @Override // defpackage.el9
    public final void Y(int i, int i2) {
        y();
    }

    @Override // defpackage.el9
    public final void a0(kl9 kl9Var, nl9 nl9Var) {
        int i;
        if (nl9Var.b() > 0) {
            if (w0()) {
                i = this.m;
            } else {
                i = this.n;
            }
            if (i > nae.e) {
                x0();
                View view = kl9Var.n(0, Long.MAX_VALUE).a;
                vs.k("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
                return;
            }
        }
        f0(kl9Var);
    }

    @Override // defpackage.el9
    public final void b0(nl9 nl9Var) {
        if (u() == 0) {
            return;
        }
        el9.E(t(0));
    }

    @Override // defpackage.el9
    public final boolean c() {
        return w0();
    }

    @Override // defpackage.el9
    public final boolean d() {
        return !w0();
    }

    @Override // defpackage.el9
    public final int i(nl9 nl9Var) {
        u();
        return 0;
    }

    @Override // defpackage.el9
    public final int j(nl9 nl9Var) {
        return 0;
    }

    @Override // defpackage.el9
    public final boolean j0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // defpackage.el9
    public final int k(nl9 nl9Var) {
        return 0;
    }

    @Override // defpackage.el9
    public final int l(nl9 nl9Var) {
        u();
        return 0;
    }

    @Override // defpackage.el9
    public final int l0(int i, kl9 kl9Var, nl9 nl9Var) {
        if (!w0() || u() == 0 || i == 0) {
            return 0;
        }
        View view = kl9Var.n(0, Long.MAX_VALUE).a;
        vs.k("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // defpackage.el9
    public final int m(nl9 nl9Var) {
        return 0;
    }

    @Override // defpackage.el9
    public final int m0(int i, kl9 kl9Var, nl9 nl9Var) {
        if (!d() || u() == 0 || i == 0) {
            return 0;
        }
        View view = kl9Var.n(0, Long.MAX_VALUE).a;
        vs.k("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // defpackage.el9
    public final int n(nl9 nl9Var) {
        return 0;
    }

    @Override // defpackage.el9
    public final fl9 q() {
        return new fl9(-2, -2);
    }

    public final boolean w0() {
        if (this.o.b == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.el9
    public final void x(View view, Rect rect) {
        super.x(view, rect);
        rect.centerY();
        if (w0()) {
            rect.centerX();
        }
        throw null;
    }

    public final boolean x0() {
        if (w0() && z() == 1) {
            return true;
        }
        return false;
    }

    public final void y0(int i) {
        ny0 i71Var;
        if (i != 0 && i != 1) {
            vs.m(a82.j(i, "invalid orientation:"));
            return;
        }
        b(null);
        ny0 ny0Var = this.o;
        if (ny0Var != null && i == ny0Var.b) {
            return;
        }
        if (i != 0) {
            if (i == 1) {
                i71Var = new ny0(1, 1);
            } else {
                vs.m("invalid orientation");
                return;
            }
        } else {
            i71Var = new i71(this);
        }
        this.o = i71Var;
        k0();
    }

    public CarouselLayoutManager() {
        new lh9(29);
        Paint paint = new Paint();
        Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
        this.p = new g71(this, 0);
        k0();
        y0(0);
    }
}
