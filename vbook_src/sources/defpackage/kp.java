package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.vbook.android.R;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kp  reason: default package */
/* loaded from: classes.dex */
public abstract class kp extends ViewGroup implements g18, ew1, xg8, ib8 {
    public vt4 C;
    public nq7 D;
    public xt4 E;
    public r13 F;
    public xt4 G;
    public un6 H;
    public ty9 I;
    public final int[] J;
    public long K;
    public tjd L;
    public xt4 M;
    public final jp N;
    public final jp O;
    public xt4 P;
    public final int[] Q;
    public int R;
    public int S;
    public final vf9 T;
    public boolean U;
    public final od6 V;
    public final x08 a;
    public final View b;
    public final wg8 c;
    public vt4 d;
    public boolean e;
    public vt4 f;

    public kp(Context context, pv4 pv4Var, int i, x08 x08Var, View view, wg8 wg8Var) {
        super(context);
        this.a = x08Var;
        this.b = view;
        this.c = wg8Var;
        tv7 tv7Var = ukd.a;
        setTag(R.id.androidx_compose_ui_view_composition_context, pv4Var);
        setSaveFromParentEnabled(false);
        addView(view);
        wcd wcdVar = (wcd) this;
        rcd.d(this, new cp(wcdVar, 0));
        kcd.b(this, this);
        this.d = fh.J;
        this.f = fh.I;
        this.C = fh.H;
        kq7 kq7Var = kq7.a;
        this.D = kq7Var;
        this.F = fpe.d();
        this.J = new int[2];
        this.K = 0L;
        this.N = new jp(wcdVar, 1);
        this.O = new jp(wcdVar, 0);
        this.Q = new int[2];
        this.R = Integer.MIN_VALUE;
        this.S = Integer.MIN_VALUE;
        this.T = new vf9(9, (byte) 0);
        od6 od6Var = new od6(3);
        od6Var.L = wcdVar;
        nq7 c = y7a.c(yae.A(kq7Var, yf2.a, x08Var), true, kg.I);
        g19 g19Var = new g19();
        g19Var.a = new ep(wcdVar, 2);
        lv0 lv0Var = new lv0();
        lv0 lv0Var2 = g19Var.b;
        if (lv0Var2 != null) {
            lv0Var2.b = null;
        }
        g19Var.b = lv0Var;
        lv0Var.b = g19Var;
        setOnRequestDisallowInterceptTouchEvent$ui(lv0Var);
        nq7 a0 = obe.y(ote.r(c.a0(g19Var), new gp(wcdVar, od6Var, wcdVar)), new dp(wcdVar, od6Var, 2)).a0(new uu0(new ep(wcdVar, 1)));
        od6Var.i0(this.D.a0(a0));
        this.E = new jk(5, od6Var, a0);
        od6Var.e0(this.F);
        this.G = new jc(od6Var, 5);
        od6Var.j0 = new dp(wcdVar, od6Var, 0);
        od6Var.k0 = new ep(wcdVar, 0);
        od6Var.h0(new fp(wcdVar, od6Var));
        this.V = od6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yg8 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            lv5.c("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((rg) this.c).getSnapshotObserver();
    }

    public static final int l(wcd wcdVar, int i, int i2, int i3) {
        if (i3 < 0 && i != i2) {
            if (i3 == -2 && i2 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
            }
            if (i3 == -1 && i2 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            }
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        return View.MeasureSpec.makeMeasureSpec(dce.n(i3, i, i2), 1073741824);
    }

    public static cx5 m(cx5 cx5Var, int i, int i2, int i3, int i4) {
        int i5 = cx5Var.a - i;
        int i6 = 0;
        if (i5 < 0) {
            i5 = 0;
        }
        int i7 = cx5Var.b - i2;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = cx5Var.c - i3;
        if (i8 < 0) {
            i8 = 0;
        }
        int i9 = cx5Var.d - i4;
        if (i9 >= 0) {
            i6 = i9;
        }
        return cx5.b(i5, i7, i8, i6);
    }

    @Override // defpackage.xg8
    public final boolean T() {
        return isAttachedToWindow();
    }

    @Override // defpackage.ew1
    public final void a() {
        this.C.invoke();
    }

    @Override // defpackage.g18
    public final void b(int i, int i2, int i3, int i4, int i5) {
        int i6;
        b18 b18Var;
        if (!this.b.isNestedScrollingEnabled()) {
            return;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(i * (-1.0f)) << 32) | (Float.floatToRawIntBits(i2 * (-1.0f)) & 4294967295L);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(i3 * (-1.0f)) << 32) | (Float.floatToRawIntBits(i4 * (-1.0f)) & 4294967295L);
        if (i5 == 0) {
            i6 = 1;
        } else {
            i6 = 2;
        }
        int i7 = i6;
        b18 b18Var2 = this.a.a;
        if (b18Var2 != null) {
            b18Var = b18Var2.I1();
        } else {
            b18Var = null;
        }
        b18 b18Var3 = b18Var;
        if (b18Var3 != null) {
            b18Var3.i1(floatToRawIntBits, floatToRawIntBits2, i7);
        }
    }

    @Override // defpackage.ew1
    public final void c() {
        this.f.invoke();
        removeAllViewsInLayout();
    }

    @Override // defpackage.g18
    public final void d(int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6;
        b18 b18Var;
        long j;
        if (!this.b.isNestedScrollingEnabled()) {
            return;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(i * (-1.0f)) << 32) | (Float.floatToRawIntBits(i2 * (-1.0f)) & 4294967295L);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(i3 * (-1.0f)) << 32) | (Float.floatToRawIntBits(i4 * (-1.0f)) & 4294967295L);
        if (i5 == 0) {
            i6 = 1;
        } else {
            i6 = 2;
        }
        b18 b18Var2 = this.a.a;
        if (b18Var2 != null) {
            b18Var = b18Var2.I1();
        } else {
            b18Var = null;
        }
        b18 b18Var3 = b18Var;
        if (b18Var3 != null) {
            j = b18Var3.i1(floatToRawIntBits, floatToRawIntBits2, i6);
        } else {
            j = 0;
        }
        iArr[0] = k27.A(Float.intBitsToFloat((int) (j >> 32))) * (-1);
        iArr[1] = k27.A(Float.intBitsToFloat((int) (j & 4294967295L))) * (-1);
    }

    @Override // defpackage.g18
    public final void e(int i, int i2, int i3, int[] iArr) {
        int i4;
        b18 b18Var;
        long j;
        if (!this.b.isNestedScrollingEnabled()) {
            return;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(i2 * (-1.0f)) & 4294967295L) | (Float.floatToRawIntBits(i * (-1.0f)) << 32);
        if (i3 == 0) {
            i4 = 1;
        } else {
            i4 = 2;
        }
        b18 b18Var2 = this.a.a;
        if (b18Var2 != null) {
            b18Var = b18Var2.I1();
        } else {
            b18Var = null;
        }
        if (b18Var != null) {
            j = b18Var.u0(i4, floatToRawIntBits);
        } else {
            j = 0;
        }
        iArr[0] = k27.A(Float.intBitsToFloat((int) (j >> 32))) * (-1);
        iArr[1] = k27.A(Float.intBitsToFloat((int) (j & 4294967295L))) * (-1);
    }

    @Override // defpackage.g18
    public final void f(View view, View view2, int i, int i2) {
        vf9 vf9Var = this.T;
        if (i2 == 1) {
            vf9Var.c = i;
        } else {
            vf9Var.b = i;
        }
    }

    @Override // defpackage.g18
    public final void g(View view, int i) {
        vf9 vf9Var = this.T;
        if (i == 1) {
            vf9Var.c = 0;
        } else {
            vf9Var.b = 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.Q;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final r13 getDensity() {
        return this.F;
    }

    public final View getInteropView() {
        return this.b;
    }

    public final od6 getLayoutNode() {
        return this.V;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        if (layoutParams == null) {
            return new ViewGroup.LayoutParams(-1, -1);
        }
        return layoutParams;
    }

    public final un6 getLifecycleOwner() {
        return this.H;
    }

    public final nq7 getModifier() {
        return this.D;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        vf9 vf9Var = this.T;
        return vf9Var.c | vf9Var.b;
    }

    public final xt4 getOnDensityChanged$ui() {
        return this.G;
    }

    public final xt4 getOnModifierChanged$ui() {
        return this.E;
    }

    public final xt4 getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.P;
    }

    public final vt4 getRelease() {
        return this.C;
    }

    public final vt4 getReset() {
        return this.f;
    }

    public final ty9 getSavedStateRegistryOwner() {
        return this.I;
    }

    public final vt4 getUpdate() {
        return this.d;
    }

    public final View getView() {
        return this.b;
    }

    @Override // defpackage.ew1
    public final void h() {
        View view = this.b;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.f.invoke();
        }
    }

    @Override // defpackage.ib8
    public final tjd i(View view, tjd tjdVar) {
        this.L = new tjd(tjdVar);
        return n(tjdVar);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (this.U) {
            this.b.postOnAnimation(new bg(3, this.O));
            return null;
        }
        this.V.D();
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.b.isNestedScrollingEnabled();
    }

    @Override // defpackage.g18
    public final boolean j(int i) {
        if ((i & 2) != 0 || (i & 1) != 0) {
            return true;
        }
        return false;
    }

    public final tjd n(tjd tjdVar) {
        qjd qjdVar = tjdVar.a;
        cx5 i = qjdVar.i(-1);
        cx5 cx5Var = cx5.e;
        if (!i.equals(cx5Var) || !qjdVar.j(-9).equals(cx5Var) || qjdVar.h() != null) {
            wv5 wv5Var = (wv5) this.V.c0.d;
            if (wv5Var.u0.J) {
                long v = hif.v(wv5Var.h0(0L));
                int i2 = (int) (v >> 32);
                int i3 = 0;
                if (i2 < 0) {
                    i2 = 0;
                }
                int i4 = (int) (v & 4294967295L);
                if (i4 < 0) {
                    i4 = 0;
                }
                long a = obe.t(wv5Var).a();
                int i5 = (int) (a >> 32);
                int i6 = (int) (a & 4294967295L);
                long j = wv5Var.c;
                long v2 = hif.v(wv5Var.h0((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L)));
                int i7 = i5 - ((int) (v2 >> 32));
                if (i7 < 0) {
                    i7 = 0;
                }
                int i8 = i6 - ((int) (4294967295L & v2));
                if (i8 >= 0) {
                    i3 = i8;
                }
                if (i2 != 0 || i4 != 0 || i7 != 0 || i3 != 0) {
                    return tjdVar.a.r(i2, i4, i7, i3);
                }
            }
        }
        return tjdVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (this.U) {
            this.b.postOnAnimation(new bg(3, this.O));
            return;
        }
        this.V.D();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.b.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.b;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        } else if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
        } else {
            view.measure(i, i2);
            setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
            this.R = i;
            this.S = i2;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.b.isNestedScrollingEnabled()) {
            return false;
        }
        z87.v(this.a.c(), null, null, new hp(z, this, ese.q(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.b.isNestedScrollingEnabled()) {
            return false;
        }
        z87.v(this.a.c(), null, null, new ip(this, ese.q(f * (-1.0f), f2 * (-1.0f)), (m42) null, 0), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rk9 rk9Var;
        xt4 xt4Var = this.M;
        if (xt4Var != null) {
            if (rect != null) {
                rk9Var = ipe.D(rect);
            } else {
                rk9Var = null;
            }
            xt4Var.invoke(rk9Var);
            return true;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        xt4 xt4Var = this.P;
        if (xt4Var != null) {
            xt4Var.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(r13 r13Var) {
        if (r13Var != this.F) {
            this.F = r13Var;
            xt4 xt4Var = this.G;
            if (xt4Var != null) {
                xt4Var.invoke(r13Var);
            }
        }
    }

    public final void setLifecycleOwner(un6 un6Var) {
        if (un6Var != this.H) {
            this.H = un6Var;
            setTag(R.id.view_tree_lifecycle_owner, un6Var);
        }
    }

    public final void setModifier(nq7 nq7Var) {
        if (nq7Var != this.D) {
            this.D = nq7Var;
            xt4 xt4Var = this.E;
            if (xt4Var != null) {
                xt4Var.invoke(nq7Var);
            }
        }
    }

    public final void setOnDensityChanged$ui(xt4 xt4Var) {
        this.G = xt4Var;
    }

    public final void setOnModifierChanged$ui(xt4 xt4Var) {
        this.E = xt4Var;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(xt4 xt4Var) {
        this.P = xt4Var;
    }

    public final void setRelease(vt4 vt4Var) {
        this.C = vt4Var;
    }

    public final void setReset(vt4 vt4Var) {
        this.f = vt4Var;
    }

    public final void setSavedStateRegistryOwner(ty9 ty9Var) {
        if (ty9Var != this.I) {
            this.I = ty9Var;
            setTag(R.id.view_tree_saved_state_registry_owner, ty9Var);
        }
    }

    public final void setUpdate(vt4 vt4Var) {
        this.d = vt4Var;
        this.e = true;
        this.N.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
