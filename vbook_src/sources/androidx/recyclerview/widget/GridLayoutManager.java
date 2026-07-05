package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.reflect.Field;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean D;
    public final int E;
    public int[] F;
    public View[] G;
    public final SparseIntArray H;
    public final SparseIntArray I;
    public final kw5 J;
    public final Rect K;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.D = false;
        this.E = -1;
        this.H = new SparseIntArray();
        this.I = new SparseIntArray();
        kw5 kw5Var = new kw5(27);
        this.J = kw5Var;
        this.K = new Rect();
        int i3 = el9.F(context, attributeSet, i, i2).b;
        if (i3 == this.E) {
            return;
        }
        this.D = true;
        if (i3 >= 1) {
            this.E = i3;
            kw5Var.y();
            k0();
            return;
        }
        vs.m(a82.j(i3, "Span count should be at least 1. Provided "));
        throw null;
    }

    @Override // defpackage.el9
    public final int G(kl9 kl9Var, nl9 nl9Var) {
        if (this.o == 0) {
            return this.E;
        }
        if (nl9Var.b() < 1) {
            return 0;
        }
        return b1(nl9Var.b() - 1, kl9Var, nl9Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View H0(kl9 kl9Var, nl9 nl9Var, boolean z, boolean z2) {
        int i;
        int i2;
        int u = u();
        int i3 = 1;
        if (z2) {
            i2 = u() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = u;
            i2 = 0;
        }
        int b = nl9Var.b();
        B0();
        int m = this.q.m();
        int i4 = this.q.i();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View t = t(i2);
            int E = el9.E(t);
            if (E >= 0 && E < b && c1(E, kl9Var, nl9Var) == 0) {
                if (((fl9) t.getLayoutParams()).a.g()) {
                    if (view2 == null) {
                        view2 = t;
                    }
                } else if (this.q.g(t) < i4 && this.q.d(t) >= m) {
                    return t;
                } else {
                    if (view == null) {
                        view = t;
                    }
                }
            }
            i2 += i3;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0085, code lost:
        r23.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0087, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v31 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N0(defpackage.kl9 r20, defpackage.nl9 r21, defpackage.yo6 r22, defpackage.n50 r23) {
        /*
            Method dump skipped, instructions count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.N0(kl9, nl9, yo6, n50):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void O0(kl9 kl9Var, nl9 nl9Var, n04 n04Var, int i) {
        boolean z;
        f1();
        if (nl9Var.b() > 0 && !nl9Var.f) {
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            int c1 = c1(n04Var.b, kl9Var, nl9Var);
            if (z) {
                while (c1 > 0) {
                    int i2 = n04Var.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    n04Var.b = i3;
                    c1 = c1(i3, kl9Var, nl9Var);
                }
            } else {
                int b = nl9Var.b() - 1;
                int i4 = n04Var.b;
                while (i4 < b) {
                    int i5 = i4 + 1;
                    int c12 = c1(i5, kl9Var, nl9Var);
                    if (c12 <= c1) {
                        break;
                    }
                    i4 = i5;
                    c1 = c12;
                }
                n04Var.b = i4;
            }
        }
        Z0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
        if (r13 == r10) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0107, code lost:
        if (r13 == r9) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (((java.util.ArrayList) r22.a.d).contains(r3) != false) goto L4;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.el9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View Q(android.view.View r23, int r24, defpackage.kl9 r25, defpackage.nl9 r26) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.Q(android.view.View, int, kl9, nl9):android.view.View");
    }

    @Override // defpackage.el9
    public final void S(kl9 kl9Var, nl9 nl9Var, v4 v4Var) {
        super.S(kl9Var, nl9Var, v4Var);
        v4Var.i("android.widget.GridView");
    }

    @Override // defpackage.el9
    public final void T(kl9 kl9Var, nl9 nl9Var, View view, v4 v4Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = v4Var.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof k25)) {
            U(view, v4Var);
            return;
        }
        k25 k25Var = (k25) layoutParams;
        int b1 = b1(k25Var.a.b(), kl9Var, nl9Var);
        int i = this.o;
        int i2 = k25Var.e;
        int i3 = k25Var.f;
        if (i == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, b1, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(b1, 1, i2, i3, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void U0(boolean z) {
        if (!z) {
            super.U0(false);
        } else {
            xk5.q("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
    }

    @Override // defpackage.el9
    public final void V(int i, int i2) {
        kw5 kw5Var = this.J;
        kw5Var.y();
        ((SparseIntArray) kw5Var.c).clear();
    }

    @Override // defpackage.el9
    public final void W() {
        kw5 kw5Var = this.J;
        kw5Var.y();
        ((SparseIntArray) kw5Var.c).clear();
    }

    @Override // defpackage.el9
    public final void X(int i, int i2) {
        kw5 kw5Var = this.J;
        kw5Var.y();
        ((SparseIntArray) kw5Var.c).clear();
    }

    @Override // defpackage.el9
    public final void Y(int i, int i2) {
        kw5 kw5Var = this.J;
        kw5Var.y();
        ((SparseIntArray) kw5Var.c).clear();
    }

    public final void Y0(int i) {
        int i2;
        int[] iArr = this.F;
        int i3 = this.E;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 > 0 && i3 - i4 < i6) {
                i2 = i5 + 1;
                i4 -= i3;
            } else {
                i2 = i5;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.F = iArr;
    }

    @Override // defpackage.el9
    public final void Z(int i, int i2) {
        kw5 kw5Var = this.J;
        kw5Var.y();
        ((SparseIntArray) kw5Var.c).clear();
    }

    public final void Z0() {
        View[] viewArr = this.G;
        if (viewArr != null && viewArr.length == this.E) {
            return;
        }
        this.G = new View[this.E];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.el9
    public final void a0(kl9 kl9Var, nl9 nl9Var) {
        boolean z = nl9Var.f;
        SparseIntArray sparseIntArray = this.I;
        SparseIntArray sparseIntArray2 = this.H;
        if (z) {
            int u = u();
            for (int i = 0; i < u; i++) {
                k25 k25Var = (k25) t(i).getLayoutParams();
                int b = k25Var.a.b();
                sparseIntArray2.put(b, k25Var.f);
                sparseIntArray.put(b, k25Var.e);
            }
        }
        super.a0(kl9Var, nl9Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    public final int a1(int i, int i2) {
        if (this.o == 1 && M0()) {
            int[] iArr = this.F;
            int i3 = this.E;
            return iArr[i3 - i] - iArr[(i3 - i) - i2];
        }
        int[] iArr2 = this.F;
        return iArr2[i2 + i] - iArr2[i];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.el9
    public final void b0(nl9 nl9Var) {
        super.b0(nl9Var);
        this.D = false;
    }

    public final int b1(int i, kl9 kl9Var, nl9 nl9Var) {
        boolean z = nl9Var.f;
        int i2 = this.E;
        kw5 kw5Var = this.J;
        if (!z) {
            kw5Var.getClass();
            return kw5.v(i, i2);
        }
        int b = kl9Var.b(i);
        if (b == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
            return 0;
        }
        kw5Var.getClass();
        return kw5.v(b, i2);
    }

    public final int c1(int i, kl9 kl9Var, nl9 nl9Var) {
        boolean z = nl9Var.f;
        int i2 = this.E;
        kw5 kw5Var = this.J;
        if (!z) {
            kw5Var.getClass();
            return i % i2;
        }
        int i3 = this.I.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int b = kl9Var.b(i);
        if (b == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 0;
        }
        kw5Var.getClass();
        return b % i2;
    }

    public final int d1(int i, kl9 kl9Var, nl9 nl9Var) {
        boolean z = nl9Var.f;
        kw5 kw5Var = this.J;
        if (!z) {
            kw5Var.getClass();
            return 1;
        }
        int i2 = this.H.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (kl9Var.b(i) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 1;
        }
        kw5Var.getClass();
        return 1;
    }

    @Override // defpackage.el9
    public final boolean e(fl9 fl9Var) {
        return fl9Var instanceof k25;
    }

    public final void e1(View view, int i, boolean z) {
        int i2;
        int i3;
        boolean s0;
        k25 k25Var = (k25) view.getLayoutParams();
        Rect rect = k25Var.b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) k25Var).topMargin + ((ViewGroup.MarginLayoutParams) k25Var).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) k25Var).leftMargin + ((ViewGroup.MarginLayoutParams) k25Var).rightMargin;
        int a1 = a1(k25Var.e, k25Var.f);
        if (this.o == 1) {
            i3 = el9.v(false, a1, i, i5, ((ViewGroup.MarginLayoutParams) k25Var).width);
            i2 = el9.v(true, this.q.n(), this.l, i4, ((ViewGroup.MarginLayoutParams) k25Var).height);
        } else {
            int v = el9.v(false, a1, i, i4, ((ViewGroup.MarginLayoutParams) k25Var).height);
            int v2 = el9.v(true, this.q.n(), this.k, i5, ((ViewGroup.MarginLayoutParams) k25Var).width);
            i2 = v;
            i3 = v2;
        }
        fl9 fl9Var = (fl9) view.getLayoutParams();
        if (z) {
            s0 = u0(view, i3, i2, fl9Var);
        } else {
            s0 = s0(view, i3, i2, fl9Var);
        }
        if (s0) {
            view.measure(i3, i2);
        }
    }

    public final void f1() {
        int A;
        int D;
        if (this.o == 1) {
            A = this.m - C();
            D = B();
        } else {
            A = this.n - A();
            D = D();
        }
        Y0(A - D);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.el9
    public final int j(nl9 nl9Var) {
        return y0(nl9Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.el9
    public final int k(nl9 nl9Var) {
        return z0(nl9Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.el9
    public final int l0(int i, kl9 kl9Var, nl9 nl9Var) {
        f1();
        Z0();
        return super.l0(i, kl9Var, nl9Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.el9
    public final int m(nl9 nl9Var) {
        return y0(nl9Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.el9
    public final int m0(int i, kl9 kl9Var, nl9 nl9Var) {
        f1();
        Z0();
        return super.m0(i, kl9Var, nl9Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.el9
    public final int n(nl9 nl9Var) {
        return z0(nl9Var);
    }

    @Override // defpackage.el9
    public final void p0(Rect rect, int i, int i2) {
        int f;
        int f2;
        if (this.F == null) {
            super.p0(rect, i, i2);
        }
        int C = C() + B();
        int A = A() + D();
        if (this.o == 1) {
            int height = rect.height() + A;
            RecyclerView recyclerView = this.b;
            Field field = rcd.a;
            f2 = el9.f(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.F;
            f = el9.f(i, iArr[iArr.length - 1] + C, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + C;
            RecyclerView recyclerView2 = this.b;
            Field field2 = rcd.a;
            f = el9.f(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.F;
            f2 = el9.f(i2, iArr2[iArr2.length - 1] + A, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(f, f2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.el9
    public final fl9 q() {
        if (this.o == 0) {
            return new k25(-2, -1);
        }
        return new k25(-1, -2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fl9, k25] */
    @Override // defpackage.el9
    public final fl9 r(Context context, AttributeSet attributeSet) {
        ?? fl9Var = new fl9(context, attributeSet);
        fl9Var.e = -1;
        fl9Var.f = 0;
        return fl9Var;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [fl9, k25] */
    /* JADX WARN: Type inference failed for: r2v3, types: [fl9, k25] */
    @Override // defpackage.el9
    public final fl9 s(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? fl9Var = new fl9((ViewGroup.MarginLayoutParams) layoutParams);
            fl9Var.e = -1;
            fl9Var.f = 0;
            return fl9Var;
        }
        ?? fl9Var2 = new fl9(layoutParams);
        fl9Var2.e = -1;
        fl9Var2.f = 0;
        return fl9Var2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.el9
    public final boolean v0() {
        if (this.y == null && !this.D) {
            return true;
        }
        return false;
    }

    @Override // defpackage.el9
    public final int w(kl9 kl9Var, nl9 nl9Var) {
        if (this.o == 1) {
            return this.E;
        }
        if (nl9Var.b() < 1) {
            return 0;
        }
        return b1(nl9Var.b() - 1, kl9Var, nl9Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void w0(nl9 nl9Var, yo6 yo6Var, wh1 wh1Var) {
        int i = this.E;
        int i2 = i;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = yo6Var.d;
            if (i4 >= 0 && i4 < nl9Var.b() && i2 > 0) {
                wh1Var.b(yo6Var.d, Math.max(0, yo6Var.g));
                this.J.getClass();
                i2--;
                yo6Var.d += yo6Var.e;
            } else {
                return;
            }
        }
    }
}
