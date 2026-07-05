package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends el9 {
    public final s26 A;
    public final int B;
    public boolean C;
    public boolean D;
    public gya E;
    public final Rect F;
    public final dya G;
    public final boolean H;
    public int[] I;
    public final og J;
    public final int o;
    public final ypa[] p;
    public final yp3 q;
    public final yp3 r;
    public final int s;
    public int t;
    public final se6 u;
    public boolean v;
    public final BitSet x;
    public boolean w = false;
    public int y = -1;
    public int z = Integer.MIN_VALUE;

    /* JADX WARN: Type inference failed for: r6v3, types: [se6, java.lang.Object] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.o = -1;
        this.v = false;
        s26 s26Var = new s26(24, false);
        this.A = s26Var;
        this.B = 2;
        this.F = new Rect();
        this.G = new dya(this);
        this.H = true;
        this.J = new og(this, 10);
        dl9 F = el9.F(context, attributeSet, i, i2);
        int i3 = F.a;
        if (i3 != 0 && i3 != 1) {
            vs.m("invalid orientation.");
            throw null;
        }
        b(null);
        if (i3 != this.s) {
            this.s = i3;
            yp3 yp3Var = this.q;
            this.q = this.r;
            this.r = yp3Var;
            k0();
        }
        int i4 = F.b;
        b(null);
        if (i4 != this.o) {
            s26Var.o();
            k0();
            this.o = i4;
            this.x = new BitSet(this.o);
            this.p = new ypa[this.o];
            for (int i5 = 0; i5 < this.o; i5++) {
                this.p[i5] = new ypa(this, i5);
            }
            k0();
        }
        boolean z = F.c;
        b(null);
        gya gyaVar = this.E;
        if (gyaVar != null && gyaVar.D != z) {
            gyaVar.D = z;
        }
        this.v = z;
        k0();
        ?? obj = new Object();
        obj.a = true;
        obj.f = 0;
        obj.g = 0;
        this.u = obj;
        this.q = yp3.b(this, this.s);
        this.r = yp3.b(this, 1 - this.s);
    }

    public static int W0(int i, int i2, int i3) {
        int mode;
        if ((i2 == 0 && i3 == 0) || ((mode = View.MeasureSpec.getMode(i)) != Integer.MIN_VALUE && mode != 1073741824)) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
    }

    public final View A0(boolean z) {
        yp3 yp3Var = this.q;
        int m = yp3Var.m();
        int i = yp3Var.i();
        int u = u();
        View view = null;
        for (int i2 = 0; i2 < u; i2++) {
            View t = t(i2);
            int g = yp3Var.g(t);
            if (yp3Var.d(t) > m && g < i) {
                if (g < m && z) {
                    if (view == null) {
                        view = t;
                    }
                } else {
                    return t;
                }
            }
        }
        return view;
    }

    public final void B0(kl9 kl9Var, nl9 nl9Var, boolean z) {
        int i;
        int F0 = F0(Integer.MIN_VALUE);
        if (F0 != Integer.MIN_VALUE && (i = this.q.i() - F0) > 0) {
            int i2 = i - (-S0(-i, kl9Var, nl9Var));
            if (z && i2 > 0) {
                this.q.q(i2);
            }
        }
    }

    public final void C0(kl9 kl9Var, nl9 nl9Var, boolean z) {
        int m;
        int G0 = G0(Integer.MAX_VALUE);
        if (G0 != Integer.MAX_VALUE && (m = G0 - this.q.m()) > 0) {
            int S0 = m - S0(m, kl9Var, nl9Var);
            if (z && S0 > 0) {
                this.q.q(-S0);
            }
        }
    }

    public final int D0() {
        if (u() == 0) {
            return 0;
        }
        return el9.E(t(0));
    }

    public final int E0() {
        int u = u();
        if (u == 0) {
            return 0;
        }
        return el9.E(t(u - 1));
    }

    public final int F0(int i) {
        int i2 = this.p[0].i(i);
        for (int i3 = 1; i3 < this.o; i3++) {
            int i4 = this.p[i3].i(i);
            if (i4 > i2) {
                i2 = i4;
            }
        }
        return i2;
    }

    public final int G0(int i) {
        int l = this.p[0].l(i);
        for (int i2 = 1; i2 < this.o; i2++) {
            int l2 = this.p[i2].l(i);
            if (l2 < l) {
                l = l2;
            }
        }
        return l;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H0(int r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.H0(int, int, int):void");
    }

    @Override // defpackage.el9
    public final boolean I() {
        if (this.B != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View I0() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.I0():android.view.View");
    }

    public final boolean J0() {
        if (z() == 1) {
            return true;
        }
        return false;
    }

    public final void K0(View view, int i, int i2) {
        RecyclerView recyclerView = this.b;
        Rect rect = this.F;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.G(view));
        }
        eya eyaVar = (eya) view.getLayoutParams();
        int W0 = W0(i, ((ViewGroup.MarginLayoutParams) eyaVar).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) eyaVar).rightMargin + rect.right);
        int W02 = W0(i2, ((ViewGroup.MarginLayoutParams) eyaVar).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) eyaVar).bottomMargin + rect.bottom);
        if (s0(view, W0, W02, eyaVar)) {
            view.measure(W0, W02);
        }
    }

    @Override // defpackage.el9
    public final void L(int i) {
        super.L(i);
        for (int i2 = 0; i2 < this.o; i2++) {
            ypa ypaVar = this.p[i2];
            int i3 = ypaVar.b;
            if (i3 != Integer.MIN_VALUE) {
                ypaVar.b = i3 + i;
            }
            int i4 = ypaVar.c;
            if (i4 != Integer.MIN_VALUE) {
                ypaVar.c = i4 + i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0187, code lost:
        if (r4 != r17.w) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0189, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x018b, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0179, code lost:
        if (r17.w != false) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:290:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L0(defpackage.kl9 r18, defpackage.nl9 r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 1027
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.L0(kl9, nl9, boolean):void");
    }

    @Override // defpackage.el9
    public final void M(int i) {
        super.M(i);
        for (int i2 = 0; i2 < this.o; i2++) {
            ypa ypaVar = this.p[i2];
            int i3 = ypaVar.b;
            if (i3 != Integer.MIN_VALUE) {
                ypaVar.b = i3 + i;
            }
            int i4 = ypaVar.c;
            if (i4 != Integer.MIN_VALUE) {
                ypaVar.c = i4 + i;
            }
        }
    }

    public final boolean M0(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.s == 0) {
            if (i == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 == this.w) {
                return false;
            }
            return true;
        }
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.w) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != J0()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.el9
    public final void N() {
        this.A.o();
        for (int i = 0; i < this.o; i++) {
            this.p[i].c();
        }
    }

    public final void N0(int i) {
        int D0;
        int i2;
        if (i > 0) {
            D0 = E0();
            i2 = 1;
        } else {
            D0 = D0();
            i2 = -1;
        }
        se6 se6Var = this.u;
        se6Var.a = true;
        U0(D0);
        T0(i2);
        se6Var.c = D0 + se6Var.d;
        se6Var.b = Math.abs(i);
    }

    public final void O0(kl9 kl9Var, se6 se6Var) {
        if (se6Var.a && !se6Var.i) {
            int i = se6Var.b;
            int i2 = se6Var.e;
            if (i == 0) {
                if (i2 == -1) {
                    P0(kl9Var, se6Var.g);
                    return;
                } else {
                    Q0(kl9Var, se6Var.f);
                    return;
                }
            }
            int i3 = this.o;
            ypa[] ypaVarArr = this.p;
            int i4 = 1;
            if (i2 == -1) {
                int i5 = se6Var.f;
                int l = ypaVarArr[0].l(i5);
                while (i4 < i3) {
                    int l2 = ypaVarArr[i4].l(i5);
                    if (l2 > l) {
                        l = l2;
                    }
                    i4++;
                }
                int i6 = i5 - l;
                int i7 = se6Var.g;
                if (i6 >= 0) {
                    i7 -= Math.min(i6, se6Var.b);
                }
                P0(kl9Var, i7);
                return;
            }
            int i8 = se6Var.g;
            int i9 = ypaVarArr[0].i(i8);
            while (i4 < i3) {
                int i10 = ypaVarArr[i4].i(i8);
                if (i10 < i9) {
                    i9 = i10;
                }
                i4++;
            }
            int i11 = i9 - se6Var.g;
            int i12 = se6Var.f;
            if (i11 >= 0) {
                i12 += Math.min(i11, se6Var.b);
            }
            Q0(kl9Var, i12);
        }
    }

    @Override // defpackage.el9
    public final void P(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.J);
        }
        for (int i = 0; i < this.o; i++) {
            this.p[i].c();
        }
        recyclerView.requestLayout();
    }

    public final void P0(kl9 kl9Var, int i) {
        for (int u = u() - 1; u >= 0; u--) {
            View t = t(u);
            yp3 yp3Var = this.q;
            if (yp3Var.g(t) >= i && yp3Var.p(t) >= i) {
                eya eyaVar = (eya) t.getLayoutParams();
                eyaVar.getClass();
                if (((ArrayList) eyaVar.e.f).size() != 1) {
                    ypa ypaVar = eyaVar.e;
                    ArrayList arrayList = (ArrayList) ypaVar.f;
                    int size = arrayList.size();
                    View view = (View) arrayList.remove(size - 1);
                    eya eyaVar2 = (eya) view.getLayoutParams();
                    eyaVar2.e = null;
                    if (eyaVar2.a.g() || eyaVar2.a.j()) {
                        ypaVar.d -= ((StaggeredGridLayoutManager) ypaVar.g).q.e(view);
                    }
                    if (size == 1) {
                        ypaVar.b = Integer.MIN_VALUE;
                    }
                    ypaVar.c = Integer.MIN_VALUE;
                    h0(t, kl9Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
        if (r0 == 1) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0051, code lost:
        if (r0 == 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005b, code lost:
        if (J0() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0065, code lost:
        if (J0() == false) goto L107;
     */
    @Override // defpackage.el9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View Q(android.view.View r9, int r10, defpackage.kl9 r11, defpackage.nl9 r12) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Q(android.view.View, int, kl9, nl9):android.view.View");
    }

    public final void Q0(kl9 kl9Var, int i) {
        while (u() > 0) {
            View t = t(0);
            yp3 yp3Var = this.q;
            if (yp3Var.d(t) <= i && yp3Var.o(t) <= i) {
                eya eyaVar = (eya) t.getLayoutParams();
                eyaVar.getClass();
                if (((ArrayList) eyaVar.e.f).size() != 1) {
                    ypa ypaVar = eyaVar.e;
                    ArrayList arrayList = (ArrayList) ypaVar.f;
                    View view = (View) arrayList.remove(0);
                    eya eyaVar2 = (eya) view.getLayoutParams();
                    eyaVar2.e = null;
                    if (arrayList.size() == 0) {
                        ypaVar.c = Integer.MIN_VALUE;
                    }
                    if (eyaVar2.a.g() || eyaVar2.a.j()) {
                        ypaVar.d -= ((StaggeredGridLayoutManager) ypaVar.g).q.e(view);
                    }
                    ypaVar.b = Integer.MIN_VALUE;
                    h0(t, kl9Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.el9
    public final void R(AccessibilityEvent accessibilityEvent) {
        super.R(accessibilityEvent);
        if (u() > 0) {
            View A0 = A0(false);
            View z0 = z0(false);
            if (A0 != null && z0 != null) {
                int E = el9.E(A0);
                int E2 = el9.E(z0);
                if (E < E2) {
                    accessibilityEvent.setFromIndex(E);
                    accessibilityEvent.setToIndex(E2);
                    return;
                }
                accessibilityEvent.setFromIndex(E2);
                accessibilityEvent.setToIndex(E);
            }
        }
    }

    public final void R0() {
        if (this.s != 1 && J0()) {
            this.w = !this.v;
        } else {
            this.w = this.v;
        }
    }

    public final int S0(int i, kl9 kl9Var, nl9 nl9Var) {
        if (u() == 0 || i == 0) {
            return 0;
        }
        N0(i);
        se6 se6Var = this.u;
        int y0 = y0(kl9Var, se6Var, nl9Var);
        if (se6Var.b >= y0) {
            if (i < 0) {
                i = -y0;
            } else {
                i = y0;
            }
        }
        this.q.q(-i);
        this.C = this.w;
        se6Var.b = 0;
        O0(kl9Var, se6Var);
        return i;
    }

    public final void T0(int i) {
        boolean z;
        se6 se6Var = this.u;
        se6Var.e = i;
        boolean z2 = this.w;
        int i2 = 1;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z2 != z) {
            i2 = -1;
        }
        se6Var.d = i2;
    }

    public final void U0(int i) {
        se6 se6Var = this.u;
        boolean z = false;
        se6Var.b = 0;
        se6Var.c = i;
        RecyclerView recyclerView = this.b;
        yp3 yp3Var = this.q;
        if (recyclerView != null && recyclerView.D) {
            se6Var.f = yp3Var.m();
            se6Var.g = yp3Var.i();
        } else {
            se6Var.g = yp3Var.h();
            se6Var.f = 0;
        }
        se6Var.h = false;
        se6Var.a = true;
        if (yp3Var.k() == 0 && yp3Var.h() == 0) {
            z = true;
        }
        se6Var.i = z;
    }

    @Override // defpackage.el9
    public final void V(int i, int i2) {
        H0(i, i2, 1);
    }

    public final void V0(ypa ypaVar, int i, int i2) {
        int i3 = ypaVar.d;
        int i4 = ypaVar.e;
        BitSet bitSet = this.x;
        if (i == -1) {
            int i5 = ypaVar.b;
            if (i5 == Integer.MIN_VALUE) {
                View view = (View) ((ArrayList) ypaVar.f).get(0);
                ypaVar.b = ((StaggeredGridLayoutManager) ypaVar.g).q.g(view);
                ((eya) view.getLayoutParams()).getClass();
                i5 = ypaVar.b;
            }
            if (i5 + i3 <= i2) {
                bitSet.set(i4, false);
                return;
            }
            return;
        }
        int i6 = ypaVar.c;
        if (i6 == Integer.MIN_VALUE) {
            ypaVar.b();
            i6 = ypaVar.c;
        }
        if (i6 - i3 >= i2) {
            bitSet.set(i4, false);
        }
    }

    @Override // defpackage.el9
    public final void W() {
        this.A.o();
        k0();
    }

    @Override // defpackage.el9
    public final void X(int i, int i2) {
        H0(i, i2, 8);
    }

    @Override // defpackage.el9
    public final void Y(int i, int i2) {
        H0(i, i2, 2);
    }

    @Override // defpackage.el9
    public final void Z(int i, int i2) {
        H0(i, i2, 4);
    }

    @Override // defpackage.el9
    public final void a0(kl9 kl9Var, nl9 nl9Var) {
        L0(kl9Var, nl9Var, true);
    }

    @Override // defpackage.el9
    public final void b(String str) {
        if (this.E == null) {
            super.b(str);
        }
    }

    @Override // defpackage.el9
    public final void b0(nl9 nl9Var) {
        this.y = -1;
        this.z = Integer.MIN_VALUE;
        this.E = null;
        this.G.a();
    }

    @Override // defpackage.el9
    public final boolean c() {
        if (this.s == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.el9
    public final void c0(Parcelable parcelable) {
        if (parcelable instanceof gya) {
            gya gyaVar = (gya) parcelable;
            this.E = gyaVar;
            if (this.y != -1) {
                gyaVar.a = -1;
                gyaVar.b = -1;
                gyaVar.d = null;
                gyaVar.c = 0;
                gyaVar.e = 0;
                gyaVar.f = null;
                gyaVar.C = null;
            }
            k0();
        }
    }

    @Override // defpackage.el9
    public final boolean d() {
        if (this.s == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, gya] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.os.Parcelable, java.lang.Object, gya] */
    @Override // defpackage.el9
    public final Parcelable d0() {
        int D0;
        View A0;
        int l;
        int m;
        int[] iArr;
        gya gyaVar = this.E;
        if (gyaVar != null) {
            ?? obj = new Object();
            obj.c = gyaVar.c;
            obj.a = gyaVar.a;
            obj.b = gyaVar.b;
            obj.d = gyaVar.d;
            obj.e = gyaVar.e;
            obj.f = gyaVar.f;
            obj.D = gyaVar.D;
            obj.E = gyaVar.E;
            obj.F = gyaVar.F;
            obj.C = gyaVar.C;
            return obj;
        }
        ?? obj2 = new Object();
        obj2.D = this.v;
        obj2.E = this.C;
        obj2.F = this.D;
        s26 s26Var = this.A;
        if (s26Var != null && (iArr = (int[]) s26Var.b) != null) {
            obj2.f = iArr;
            obj2.e = iArr.length;
            obj2.C = (ArrayList) s26Var.c;
        } else {
            obj2.e = 0;
        }
        int i = -1;
        if (u() > 0) {
            if (this.C) {
                D0 = E0();
            } else {
                D0 = D0();
            }
            obj2.a = D0;
            if (this.w) {
                A0 = z0(true);
            } else {
                A0 = A0(true);
            }
            if (A0 != null) {
                i = el9.E(A0);
            }
            obj2.b = i;
            int i2 = this.o;
            obj2.c = i2;
            obj2.d = new int[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                boolean z = this.C;
                yp3 yp3Var = this.q;
                ypa[] ypaVarArr = this.p;
                if (z) {
                    l = ypaVarArr[i3].i(Integer.MIN_VALUE);
                    if (l != Integer.MIN_VALUE) {
                        m = yp3Var.i();
                        l -= m;
                        obj2.d[i3] = l;
                    } else {
                        obj2.d[i3] = l;
                    }
                } else {
                    l = ypaVarArr[i3].l(Integer.MIN_VALUE);
                    if (l != Integer.MIN_VALUE) {
                        m = yp3Var.m();
                        l -= m;
                        obj2.d[i3] = l;
                    } else {
                        obj2.d[i3] = l;
                    }
                }
            }
            return obj2;
        }
        obj2.a = -1;
        obj2.b = -1;
        obj2.c = 0;
        return obj2;
    }

    @Override // defpackage.el9
    public final boolean e(fl9 fl9Var) {
        return fl9Var instanceof eya;
    }

    @Override // defpackage.el9
    public final void e0(int i) {
        if (i == 0) {
            w0();
        }
    }

    @Override // defpackage.el9
    public final void g(int i, int i2, nl9 nl9Var, wh1 wh1Var) {
        se6 se6Var;
        int i3;
        if (this.s != 0) {
            i = i2;
        }
        if (u() != 0 && i != 0) {
            N0(i);
            int[] iArr = this.I;
            int i4 = this.o;
            if (iArr == null || iArr.length < i4) {
                this.I = new int[i4];
            }
            int i5 = 0;
            int i6 = 0;
            while (true) {
                se6Var = this.u;
                if (i5 >= i4) {
                    break;
                }
                int i7 = se6Var.d;
                ypa[] ypaVarArr = this.p;
                if (i7 == -1) {
                    int i8 = se6Var.f;
                    i3 = i8 - ypaVarArr[i5].l(i8);
                } else {
                    i3 = ypaVarArr[i5].i(se6Var.g) - se6Var.g;
                }
                if (i3 >= 0) {
                    this.I[i6] = i3;
                    i6++;
                }
                i5++;
            }
            Arrays.sort(this.I, 0, i6);
            for (int i9 = 0; i9 < i6; i9++) {
                int i10 = se6Var.c;
                if (i10 >= 0 && i10 < nl9Var.b()) {
                    wh1Var.b(se6Var.c, this.I[i9]);
                    se6Var.c += se6Var.d;
                } else {
                    return;
                }
            }
        }
    }

    @Override // defpackage.el9
    public final int i(nl9 nl9Var) {
        if (u() == 0) {
            return 0;
        }
        boolean z = !this.H;
        return nxe.r(nl9Var, this.q, A0(z), z0(z), this, this.H);
    }

    @Override // defpackage.el9
    public final int j(nl9 nl9Var) {
        return x0(nl9Var);
    }

    @Override // defpackage.el9
    public final int k(nl9 nl9Var) {
        if (u() == 0) {
            return 0;
        }
        boolean z = !this.H;
        return nxe.t(nl9Var, this.q, A0(z), z0(z), this, this.H);
    }

    @Override // defpackage.el9
    public final int l(nl9 nl9Var) {
        if (u() == 0) {
            return 0;
        }
        boolean z = !this.H;
        return nxe.r(nl9Var, this.q, A0(z), z0(z), this, this.H);
    }

    @Override // defpackage.el9
    public final int l0(int i, kl9 kl9Var, nl9 nl9Var) {
        return S0(i, kl9Var, nl9Var);
    }

    @Override // defpackage.el9
    public final int m(nl9 nl9Var) {
        return x0(nl9Var);
    }

    @Override // defpackage.el9
    public final int m0(int i, kl9 kl9Var, nl9 nl9Var) {
        return S0(i, kl9Var, nl9Var);
    }

    @Override // defpackage.el9
    public final int n(nl9 nl9Var) {
        if (u() == 0) {
            return 0;
        }
        boolean z = !this.H;
        return nxe.t(nl9Var, this.q, A0(z), z0(z), this, this.H);
    }

    @Override // defpackage.el9
    public final void p0(Rect rect, int i, int i2) {
        int f;
        int f2;
        int C = C() + B();
        int A = A() + D();
        int i3 = this.s;
        int i4 = this.o;
        if (i3 == 1) {
            int height = rect.height() + A;
            RecyclerView recyclerView = this.b;
            Field field = rcd.a;
            f2 = el9.f(i2, height, recyclerView.getMinimumHeight());
            f = el9.f(i, (this.t * i4) + C, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + C;
            RecyclerView recyclerView2 = this.b;
            Field field2 = rcd.a;
            f = el9.f(i, width, recyclerView2.getMinimumWidth());
            f2 = el9.f(i2, (this.t * i4) + A, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(f, f2);
    }

    @Override // defpackage.el9
    public final fl9 q() {
        if (this.s == 0) {
            return new fl9(-2, -1);
        }
        return new fl9(-1, -2);
    }

    @Override // defpackage.el9
    public final fl9 r(Context context, AttributeSet attributeSet) {
        return new fl9(context, attributeSet);
    }

    @Override // defpackage.el9
    public final fl9 s(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new fl9((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new fl9(layoutParams);
    }

    @Override // defpackage.el9
    public final boolean v0() {
        if (this.E == null) {
            return true;
        }
        return false;
    }

    public final boolean w0() {
        int D0;
        if (u() != 0 && this.B != 0 && this.f) {
            if (this.w) {
                D0 = E0();
                D0();
            } else {
                D0 = D0();
                E0();
            }
            if (D0 == 0 && I0() != null) {
                this.A.o();
                this.e = true;
                k0();
                return true;
            }
        }
        return false;
    }

    public final int x0(nl9 nl9Var) {
        if (u() == 0) {
            return 0;
        }
        boolean z = !this.H;
        return nxe.s(nl9Var, this.q, A0(z), z0(z), this, this.H, this.w);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0277, code lost:
        O0(r1, r7);
     */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int y0(defpackage.kl9 r25, defpackage.se6 r26, defpackage.nl9 r27) {
        /*
            Method dump skipped, instructions count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.y0(kl9, se6, nl9):int");
    }

    public final View z0(boolean z) {
        yp3 yp3Var = this.q;
        int m = yp3Var.m();
        int i = yp3Var.i();
        View view = null;
        for (int u = u() - 1; u >= 0; u--) {
            View t = t(u);
            int g = yp3Var.g(t);
            int d = yp3Var.d(t);
            if (d > m && g < i) {
                if (d > i && z) {
                    if (view == null) {
                        view = t;
                    }
                } else {
                    return t;
                }
            }
        }
        return view;
    }
}
