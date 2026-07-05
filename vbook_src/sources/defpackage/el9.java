package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: el9  reason: default package */
/* loaded from: classes.dex */
public abstract class el9 {
    public ij1 a;
    public RecyclerView b;
    public final rwa c;
    public final rwa d;
    public boolean e;
    public boolean f;
    public final boolean g;
    public final boolean h;
    public int i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;

    public el9() {
        k57 k57Var = new k57(this, 5);
        l97 l97Var = new l97(this);
        this.c = new rwa(k57Var);
        this.d = new rwa(l97Var);
        this.e = false;
        this.f = false;
        this.g = true;
        this.h = true;
    }

    public static int E(View view) {
        return ((fl9) view.getLayoutParams()).a.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dl9, java.lang.Object] */
    public static dl9 F(Context context, AttributeSet attributeSet, int i, int i2) {
        ?? obj = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eg9.a, i, i2);
        obj.a = obtainStyledAttributes.getInt(0, 1);
        obj.b = obtainStyledAttributes.getInt(10, 1);
        obj.c = obtainStyledAttributes.getBoolean(9, false);
        obj.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return obj;
    }

    public static boolean J(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i) {
                return false;
            }
            return true;
        } else if (size < i) {
            return false;
        } else {
            return true;
        }
    }

    public static void K(View view, int i, int i2, int i3, int i4) {
        fl9 fl9Var = (fl9) view.getLayoutParams();
        Rect rect = fl9Var.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) fl9Var).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) fl9Var).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) fl9Var).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) fl9Var).bottomMargin);
    }

    public static int f(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(i2, i3);
            }
            return size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r6 == 1073741824) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int v(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.el9.v(boolean, int, int, int, int):int");
    }

    public final int A() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int B() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int D() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int G(kl9 kl9Var, nl9 nl9Var) {
        return -1;
    }

    public final void H(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((fl9) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.G;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public boolean I() {
        return false;
    }

    public void L(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int y = recyclerView.f.y();
            for (int i2 = 0; i2 < y; i2++) {
                recyclerView.f.x(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void M(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int y = recyclerView.f.y();
            for (int i2 = 0; i2 < y; i2++) {
                recyclerView.f.x(i2).offsetTopAndBottom(i);
            }
        }
    }

    public abstract void P(RecyclerView recyclerView);

    public abstract View Q(View view, int i, kl9 kl9Var, nl9 nl9Var);

    public void R(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        kl9 kl9Var = recyclerView.c;
        nl9 nl9Var = recyclerView.z0;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            yk9 yk9Var = this.b.H;
            if (yk9Var != null) {
                accessibilityEvent.setItemCount(yk9Var.a());
            }
        }
    }

    public void S(kl9 kl9Var, nl9 nl9Var, v4 v4Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = v4Var.a;
        if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
            v4Var.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
            v4Var.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(G(kl9Var, nl9Var), w(kl9Var, nl9Var), false, 0));
    }

    public final void U(View view, v4 v4Var) {
        rl9 F = RecyclerView.F(view);
        if (F != null && !F.g()) {
            ij1 ij1Var = this.a;
            if (!((ArrayList) ij1Var.d).contains(F.a)) {
                RecyclerView recyclerView = this.b;
                T(recyclerView.c, recyclerView.z0, view, v4Var);
            }
        }
    }

    public final void a(View view, int i, boolean z) {
        int i2;
        rl9 F = RecyclerView.F(view);
        if (!z && !F.g()) {
            this.b.C.k(F);
        } else {
            jla jlaVar = (jla) this.b.C.b;
            ycd ycdVar = (ycd) jlaVar.get(F);
            if (ycdVar == null) {
                ycdVar = ycd.a();
                jlaVar.put(F, ycdVar);
            }
            ycdVar.a |= 1;
        }
        fl9 fl9Var = (fl9) view.getLayoutParams();
        if (!F.o() && !F.h()) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.b;
            ij1 ij1Var = this.a;
            if (parent == recyclerView) {
                zg1 zg1Var = (zg1) ij1Var.c;
                int indexOfChild = ((RecyclerView) ((g99) ij1Var.b).b).indexOfChild(view);
                if (indexOfChild == -1 || zg1Var.E(indexOfChild)) {
                    i2 = -1;
                } else {
                    i2 = indexOfChild - zg1Var.A(indexOfChild);
                }
                if (i == -1) {
                    i = this.a.y();
                }
                if (i2 != -1) {
                    if (i2 != i) {
                        el9 el9Var = this.b.I;
                        View t = el9Var.t(i2);
                        if (t != null) {
                            el9Var.t(i2);
                            el9Var.a.t(i2);
                            fl9 fl9Var2 = (fl9) t.getLayoutParams();
                            rl9 F2 = RecyclerView.F(t);
                            boolean g = F2.g();
                            RecyclerView recyclerView2 = el9Var.b;
                            if (g) {
                                jla jlaVar2 = (jla) recyclerView2.C.b;
                                ycd ycdVar2 = (ycd) jlaVar2.get(F2);
                                if (ycdVar2 == null) {
                                    ycdVar2 = ycd.a();
                                    jlaVar2.put(F2, ycdVar2);
                                }
                                ycdVar2.a = 1 | ycdVar2.a;
                            } else {
                                recyclerView2.C.k(F2);
                            }
                            el9Var.a.k(t, i, fl9Var2, F2.g());
                        } else {
                            RecyclerView recyclerView3 = el9Var.b;
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i2 + recyclerView3.toString());
                        }
                    }
                } else {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.w());
                }
            } else {
                ij1Var.c(view, i, false);
                fl9Var.c = true;
            }
        } else {
            if (F.h()) {
                F.m.o(F);
            } else {
                F.i &= -33;
            }
            this.a.k(view, i, view.getLayoutParams(), false);
        }
        if (fl9Var.d) {
            F.a.invalidate();
            fl9Var.d = false;
        }
    }

    public abstract void a0(kl9 kl9Var, nl9 nl9Var);

    public void b(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.f(str);
        }
    }

    public abstract void b0(nl9 nl9Var);

    public abstract boolean c();

    public abstract boolean d();

    public Parcelable d0() {
        return null;
    }

    public boolean e(fl9 fl9Var) {
        if (fl9Var != null) {
            return true;
        }
        return false;
    }

    public final void f0(kl9 kl9Var) {
        for (int u = u() - 1; u >= 0; u--) {
            if (!RecyclerView.F(t(u)).n()) {
                View t = t(u);
                i0(u);
                kl9Var.k(t);
            }
        }
    }

    public final void g0(kl9 kl9Var) {
        ArrayList arrayList;
        int size = ((ArrayList) kl9Var.c).size();
        int i = size - 1;
        while (true) {
            arrayList = (ArrayList) kl9Var.c;
            if (i < 0) {
                break;
            }
            View view = ((rl9) arrayList.get(i)).a;
            rl9 F = RecyclerView.F(view);
            if (!F.n()) {
                F.m(false);
                if (F.i()) {
                    this.b.removeDetachedView(view, false);
                }
                cl9 cl9Var = this.b.i0;
                if (cl9Var != null) {
                    cl9Var.d(F);
                }
                F.m(true);
                rl9 F2 = RecyclerView.F(view);
                F2.m = null;
                F2.n = false;
                F2.i &= -33;
                kl9Var.l(F2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) kl9Var.d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public final void h0(View view, kl9 kl9Var) {
        ij1 ij1Var = this.a;
        g99 g99Var = (g99) ij1Var.b;
        int indexOfChild = ((RecyclerView) g99Var.b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((zg1) ij1Var.c).I(indexOfChild)) {
                ij1Var.a0(view);
            }
            g99Var.y(indexOfChild);
        }
        kl9Var.k(view);
    }

    public abstract int i(nl9 nl9Var);

    public final void i0(int i) {
        if (t(i) != null) {
            ij1 ij1Var = this.a;
            int E = ij1Var.E(i);
            g99 g99Var = (g99) ij1Var.b;
            View childAt = ((RecyclerView) g99Var.b).getChildAt(E);
            if (childAt != null) {
                if (((zg1) ij1Var.c).I(E)) {
                    ij1Var.a0(childAt);
                }
                g99Var.y(E);
            }
        }
    }

    public abstract int j(nl9 nl9Var);

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ab, code lost:
        if ((r5.bottom - r10) > r2) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean j0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.B()
            int r1 = r8.D()
            int r2 = r8.m
            int r3 = r8.C()
            int r2 = r2 - r3
            int r3 = r8.n
            int r4 = r8.A()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.z()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lae
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7c
            goto Lb3
        L7c:
            int r1 = r8.B()
            int r2 = r8.D()
            int r3 = r8.m
            int r4 = r8.C()
            int r3 = r3 - r4
            int r4 = r8.n
            int r5 = r8.A()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.b
            android.graphics.Rect r5 = r5.E
            r8.x(r13, r5)
            int r8 = r5.left
            int r8 = r8 - r11
            if (r8 >= r3) goto Lb3
            int r8 = r5.right
            int r8 = r8 - r11
            if (r8 <= r1) goto Lb3
            int r8 = r5.top
            int r8 = r8 - r10
            if (r8 >= r4) goto Lb3
            int r8 = r5.bottom
            int r8 = r8 - r10
            if (r8 > r2) goto Lae
            goto Lb3
        Lae:
            if (r11 != 0) goto Lb4
            if (r10 == 0) goto Lb3
            goto Lb4
        Lb3:
            return r0
        Lb4:
            if (r12 == 0) goto Lba
            r9.scrollBy(r11, r10)
            return r7
        Lba:
            r9.X(r11, r10, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.el9.j0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int k(nl9 nl9Var);

    public final void k0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int l(nl9 nl9Var);

    public abstract int l0(int i, kl9 kl9Var, nl9 nl9Var);

    public abstract int m(nl9 nl9Var);

    public abstract int m0(int i, kl9 kl9Var, nl9 nl9Var);

    public abstract int n(nl9 nl9Var);

    public final void n0(RecyclerView recyclerView) {
        o0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void o(kl9 kl9Var) {
        for (int u = u() - 1; u >= 0; u--) {
            View t = t(u);
            rl9 F = RecyclerView.F(t);
            if (!F.n()) {
                if (F.e() && !F.g()) {
                    this.b.H.getClass();
                    i0(u);
                    kl9Var.l(F);
                } else {
                    t(u);
                    this.a.t(u);
                    kl9Var.m(t);
                    this.b.C.k(F);
                }
            }
        }
    }

    public final void o0(int i, int i2) {
        this.m = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.k = mode;
        if (mode == 0 && !RecyclerView.U0) {
            this.m = 0;
        }
        this.n = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.l = mode2;
        if (mode2 == 0 && !RecyclerView.U0) {
            this.n = 0;
        }
    }

    public View p(int i) {
        int u = u();
        for (int i2 = 0; i2 < u; i2++) {
            View t = t(i2);
            rl9 F = RecyclerView.F(t);
            if (F != null && F.b() == i && !F.n() && (this.b.z0.f || !F.g())) {
                return t;
            }
        }
        return null;
    }

    public void p0(Rect rect, int i, int i2) {
        int C = C() + B() + rect.width();
        int A = A() + D() + rect.height();
        RecyclerView recyclerView = this.b;
        Field field = rcd.a;
        this.b.setMeasuredDimension(f(i, C, recyclerView.getMinimumWidth()), f(i2, A, this.b.getMinimumHeight()));
    }

    public abstract fl9 q();

    public final void q0(int i, int i2) {
        int u = u();
        if (u == 0) {
            this.b.l(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < u; i7++) {
            View t = t(i7);
            Rect rect = this.b.E;
            x(t, rect);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.b.E.set(i6, i4, i3, i5);
        p0(this.b.E, i, i2);
    }

    public fl9 r(Context context, AttributeSet attributeSet) {
        return new fl9(context, attributeSet);
    }

    public final void r0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.m = 0;
            this.n = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.f;
            this.m = recyclerView.getWidth();
            this.n = recyclerView.getHeight();
        }
        this.k = 1073741824;
        this.l = 1073741824;
    }

    public fl9 s(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof fl9) {
            return new fl9((fl9) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new fl9((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new fl9(layoutParams);
    }

    public final boolean s0(View view, int i, int i2, fl9 fl9Var) {
        if (!view.isLayoutRequested() && this.g && J(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) fl9Var).width) && J(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) fl9Var).height)) {
            return false;
        }
        return true;
    }

    public final View t(int i) {
        ij1 ij1Var = this.a;
        if (ij1Var != null) {
            return ij1Var.x(i);
        }
        return null;
    }

    public boolean t0() {
        return false;
    }

    public final int u() {
        ij1 ij1Var = this.a;
        if (ij1Var != null) {
            return ij1Var.y();
        }
        return 0;
    }

    public final boolean u0(View view, int i, int i2, fl9 fl9Var) {
        if (this.g && J(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) fl9Var).width) && J(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) fl9Var).height)) {
            return false;
        }
        return true;
    }

    public boolean v0() {
        return false;
    }

    public int w(kl9 kl9Var, nl9 nl9Var) {
        return -1;
    }

    public void x(View view, Rect rect) {
        int[] iArr = RecyclerView.S0;
        fl9 fl9Var = (fl9) view.getLayoutParams();
        Rect rect2 = fl9Var.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) fl9Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) fl9Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) fl9Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) fl9Var).bottomMargin);
    }

    public final int y() {
        yk9 yk9Var;
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            yk9Var = recyclerView.getAdapter();
        } else {
            yk9Var = null;
        }
        if (yk9Var != null) {
            return yk9Var.a();
        }
        return 0;
    }

    public final int z() {
        RecyclerView recyclerView = this.b;
        Field field = rcd.a;
        return recyclerView.getLayoutDirection();
    }

    public void N() {
    }

    public void W() {
    }

    public void O(RecyclerView recyclerView) {
    }

    public void c0(Parcelable parcelable) {
    }

    public void e0(int i) {
    }

    public void V(int i, int i2) {
    }

    public void X(int i, int i2) {
    }

    public void Y(int i, int i2) {
    }

    public void Z(int i, int i2) {
    }

    public void h(int i, wh1 wh1Var) {
    }

    public void T(kl9 kl9Var, nl9 nl9Var, View view, v4 v4Var) {
    }

    public void g(int i, int i2, nl9 nl9Var, wh1 wh1Var) {
    }
}
