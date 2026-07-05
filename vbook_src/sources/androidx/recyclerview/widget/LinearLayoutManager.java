package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class LinearLayoutManager extends el9 {
    public final n50 A;
    public final int B;
    public final int[] C;
    public int o;
    public yo6 p;
    public yp3 q;
    public boolean r;
    public final boolean s;
    public boolean t;
    public boolean u;
    public final boolean v;
    public int w;
    public int x;
    public zo6 y;
    public final n04 z;

    /* JADX WARN: Type inference failed for: r1v2, types: [n50, java.lang.Object] */
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.o = 1;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = true;
        this.w = -1;
        this.x = Integer.MIN_VALUE;
        this.y = null;
        this.z = new n04();
        this.A = new Object();
        this.B = 2;
        this.C = new int[2];
        dl9 F = el9.F(context, attributeSet, i, i2);
        T0(F.a);
        boolean z = F.c;
        b(null);
        if (z != this.s) {
            this.s = z;
            k0();
        }
        U0(F.d);
    }

    public final int A0(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130 && this.o == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.o == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.o == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.o == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.o != 1 && M0()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.o == 1 || !M0()) {
            return -1;
        } else {
            return 1;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [yo6, java.lang.Object] */
    public final void B0() {
        if (this.p == null) {
            ?? obj = new Object();
            obj.a = true;
            obj.h = 0;
            obj.i = 0;
            obj.k = null;
            this.p = obj;
        }
    }

    public final int C0(kl9 kl9Var, yo6 yo6Var, nl9 nl9Var, boolean z) {
        int i;
        int i2 = yo6Var.c;
        int i3 = yo6Var.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                yo6Var.g = i3 + i2;
            }
            P0(kl9Var, yo6Var);
        }
        int i4 = yo6Var.c + yo6Var.h;
        while (true) {
            if ((!yo6Var.l && i4 <= 0) || (i = yo6Var.d) < 0 || i >= nl9Var.b()) {
                break;
            }
            n50 n50Var = this.A;
            n50Var.a = 0;
            n50Var.b = false;
            n50Var.c = false;
            n50Var.d = false;
            N0(kl9Var, nl9Var, yo6Var, n50Var);
            if (!n50Var.b) {
                int i5 = yo6Var.b;
                int i6 = n50Var.a;
                yo6Var.b = (yo6Var.f * i6) + i5;
                if (!n50Var.c || yo6Var.k != null || !nl9Var.f) {
                    yo6Var.c -= i6;
                    i4 -= i6;
                }
                int i7 = yo6Var.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    yo6Var.g = i8;
                    int i9 = yo6Var.c;
                    if (i9 < 0) {
                        yo6Var.g = i8 + i9;
                    }
                    P0(kl9Var, yo6Var);
                }
                if (z && n50Var.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - yo6Var.c;
    }

    public final View D0(boolean z) {
        if (this.t) {
            return G0(0, u(), z);
        }
        return G0(u() - 1, -1, z);
    }

    public final View E0(boolean z) {
        if (this.t) {
            return G0(u() - 1, -1, z);
        }
        return G0(0, u(), z);
    }

    public final View F0(int i, int i2) {
        int i3;
        int i4;
        B0();
        if (i2 > i || i2 < i) {
            if (this.q.g(t(i)) < this.q.m()) {
                i3 = 16644;
                i4 = 16388;
            } else {
                i3 = 4161;
                i4 = 4097;
            }
            if (this.o == 0) {
                return this.c.j(i, i2, i3, i4);
            }
            return this.d.j(i, i2, i3, i4);
        }
        return t(i);
    }

    public final View G0(int i, int i2, boolean z) {
        int i3;
        B0();
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (this.o == 0) {
            return this.c.j(i, i2, i3, 320);
        }
        return this.d.j(i, i2, i3, 320);
    }

    public View H0(kl9 kl9Var, nl9 nl9Var, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        B0();
        int u = u();
        if (z2) {
            i2 = u() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = u;
            i2 = 0;
            i3 = 1;
        }
        int b = nl9Var.b();
        int m = this.q.m();
        int i4 = this.q.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View t = t(i2);
            int E = el9.E(t);
            int g = this.q.g(t);
            int d = this.q.d(t);
            if (E >= 0 && E < b) {
                if (((fl9) t.getLayoutParams()).a.g()) {
                    if (view3 == null) {
                        view3 = t;
                    }
                } else {
                    if (d <= m && g < m) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (g >= i4 && d > i4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z3 && !z4) {
                        return t;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = t;
                        }
                        view2 = t;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = t;
                        }
                        view2 = t;
                    }
                }
            }
            i2 += i3;
        }
        if (view != null) {
            return view;
        }
        if (view2 != null) {
            return view2;
        }
        return view3;
    }

    @Override // defpackage.el9
    public final boolean I() {
        return true;
    }

    public final int I0(int i, kl9 kl9Var, nl9 nl9Var, boolean z) {
        int i2;
        int i3 = this.q.i() - i;
        if (i3 > 0) {
            int i4 = -S0(-i3, kl9Var, nl9Var);
            int i5 = i + i4;
            if (z && (i2 = this.q.i() - i5) > 0) {
                this.q.q(i2);
                return i2 + i4;
            }
            return i4;
        }
        return 0;
    }

    public final int J0(int i, kl9 kl9Var, nl9 nl9Var, boolean z) {
        int m;
        int m2 = i - this.q.m();
        if (m2 > 0) {
            int i2 = -S0(m2, kl9Var, nl9Var);
            int i3 = i + i2;
            if (z && (m = i3 - this.q.m()) > 0) {
                this.q.q(-m);
                return i2 - m;
            }
            return i2;
        }
        return 0;
    }

    public final View K0() {
        int u;
        if (this.t) {
            u = 0;
        } else {
            u = u() - 1;
        }
        return t(u);
    }

    public final View L0() {
        int i;
        if (this.t) {
            i = u() - 1;
        } else {
            i = 0;
        }
        return t(i);
    }

    public final boolean M0() {
        if (z() == 1) {
            return true;
        }
        return false;
    }

    public void N0(kl9 kl9Var, nl9 nl9Var, yo6 yo6Var, n50 n50Var) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        View b = yo6Var.b(kl9Var);
        if (b == null) {
            n50Var.b = true;
            return;
        }
        fl9 fl9Var = (fl9) b.getLayoutParams();
        List list = yo6Var.k;
        boolean z3 = this.t;
        int i5 = yo6Var.f;
        if (list == null) {
            if (i5 == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3 == z2) {
                a(b, -1, false);
            } else {
                a(b, 0, false);
            }
        } else {
            if (i5 == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z3 == z) {
                a(b, -1, true);
            } else {
                a(b, 0, true);
            }
        }
        fl9 fl9Var2 = (fl9) b.getLayoutParams();
        Rect G = this.b.G(b);
        int i6 = G.left + G.right;
        int i7 = G.top + G.bottom;
        int v = el9.v(c(), this.m, this.k, C() + B() + ((ViewGroup.MarginLayoutParams) fl9Var2).leftMargin + ((ViewGroup.MarginLayoutParams) fl9Var2).rightMargin + i6, ((ViewGroup.MarginLayoutParams) fl9Var2).width);
        int v2 = el9.v(d(), this.n, this.l, A() + D() + ((ViewGroup.MarginLayoutParams) fl9Var2).topMargin + ((ViewGroup.MarginLayoutParams) fl9Var2).bottomMargin + i7, ((ViewGroup.MarginLayoutParams) fl9Var2).height);
        if (s0(b, v, v2, fl9Var2)) {
            b.measure(v, v2);
        }
        n50Var.a = this.q.e(b);
        if (this.o == 1) {
            if (M0()) {
                i4 = this.m - C();
                i2 = i4 - this.q.f(b);
            } else {
                int B = B();
                i4 = this.q.f(b) + B;
                i2 = B;
            }
            int i8 = yo6Var.f;
            i3 = yo6Var.b;
            int i9 = n50Var.a;
            if (i8 == -1) {
                int i10 = i3 - i9;
                i = i3;
                i3 = i10;
            } else {
                i = i9 + i3;
            }
        } else {
            int D = D();
            int f = this.q.f(b) + D;
            int i11 = yo6Var.f;
            int i12 = yo6Var.b;
            int i13 = n50Var.a;
            if (i11 == -1) {
                int i14 = i12 - i13;
                i4 = i12;
                i3 = D;
                i = f;
                i2 = i14;
            } else {
                int i15 = i12 + i13;
                i = f;
                i2 = i12;
                i3 = D;
                i4 = i15;
            }
        }
        el9.K(b, i2, i3, i4, i);
        if (fl9Var.a.g() || fl9Var.a.j()) {
            n50Var.c = true;
        }
        n50Var.d = b.hasFocusable();
    }

    public final void P0(kl9 kl9Var, yo6 yo6Var) {
        if (yo6Var.a && !yo6Var.l) {
            int i = yo6Var.g;
            int i2 = yo6Var.i;
            if (yo6Var.f == -1) {
                int u = u();
                if (i >= 0) {
                    int h = (this.q.h() - i) + i2;
                    if (this.t) {
                        for (int i3 = 0; i3 < u; i3++) {
                            View t = t(i3);
                            if (this.q.g(t) < h || this.q.p(t) < h) {
                                Q0(kl9Var, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = u - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View t2 = t(i5);
                        if (this.q.g(t2) < h || this.q.p(t2) < h) {
                            Q0(kl9Var, i4, i5);
                            return;
                        }
                    }
                }
            } else if (i >= 0) {
                int i6 = i - i2;
                int u2 = u();
                if (this.t) {
                    int i7 = u2 - 1;
                    for (int i8 = i7; i8 >= 0; i8--) {
                        View t3 = t(i8);
                        if (this.q.d(t3) > i6 || this.q.o(t3) > i6) {
                            Q0(kl9Var, i7, i8);
                            return;
                        }
                    }
                    return;
                }
                for (int i9 = 0; i9 < u2; i9++) {
                    View t4 = t(i9);
                    if (this.q.d(t4) > i6 || this.q.o(t4) > i6) {
                        Q0(kl9Var, 0, i9);
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.el9
    public View Q(View view, int i, kl9 kl9Var, nl9 nl9Var) {
        int A0;
        View F0;
        View K0;
        R0();
        if (u() != 0 && (A0 = A0(i)) != Integer.MIN_VALUE) {
            B0();
            V0(A0, (int) (this.q.n() * 0.33333334f), false, nl9Var);
            yo6 yo6Var = this.p;
            yo6Var.g = Integer.MIN_VALUE;
            yo6Var.a = false;
            C0(kl9Var, yo6Var, nl9Var, true);
            boolean z = this.t;
            if (A0 == -1) {
                if (z) {
                    F0 = F0(u() - 1, -1);
                } else {
                    F0 = F0(0, u());
                }
            } else if (z) {
                F0 = F0(0, u());
            } else {
                F0 = F0(u() - 1, -1);
            }
            if (A0 == -1) {
                K0 = L0();
            } else {
                K0 = K0();
            }
            if (K0.hasFocusable()) {
                if (F0 != null) {
                    return K0;
                }
            } else {
                return F0;
            }
        }
        return null;
    }

    public final void Q0(kl9 kl9Var, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    View t = t(i3);
                    i0(i3);
                    kl9Var.k(t);
                }
                return;
            }
            while (i > i2) {
                View t2 = t(i);
                i0(i);
                kl9Var.k(t2);
                i--;
            }
        }
    }

    @Override // defpackage.el9
    public final void R(AccessibilityEvent accessibilityEvent) {
        int E;
        super.R(accessibilityEvent);
        if (u() > 0) {
            View G0 = G0(0, u(), false);
            int i = -1;
            if (G0 == null) {
                E = -1;
            } else {
                E = el9.E(G0);
            }
            accessibilityEvent.setFromIndex(E);
            View G02 = G0(u() - 1, -1, false);
            if (G02 != null) {
                i = el9.E(G02);
            }
            accessibilityEvent.setToIndex(i);
        }
    }

    public final void R0() {
        if (this.o != 1 && M0()) {
            this.t = !this.s;
        } else {
            this.t = this.s;
        }
    }

    public final int S0(int i, kl9 kl9Var, nl9 nl9Var) {
        int i2;
        if (u() != 0 && i != 0) {
            B0();
            this.p.a = true;
            if (i > 0) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            int abs = Math.abs(i);
            V0(i2, abs, true, nl9Var);
            yo6 yo6Var = this.p;
            int C0 = C0(kl9Var, yo6Var, nl9Var, false) + yo6Var.g;
            if (C0 >= 0) {
                if (abs > C0) {
                    i = i2 * C0;
                }
                this.q.q(-i);
                this.p.j = i;
                return i;
            }
        }
        return 0;
    }

    public final void T0(int i) {
        if (i != 0 && i != 1) {
            vs.m(a82.j(i, "invalid orientation:"));
            return;
        }
        b(null);
        if (i == this.o && this.q != null) {
            return;
        }
        yp3 b = yp3.b(this, i);
        this.q = b;
        this.z.f = b;
        this.o = i;
        k0();
    }

    public void U0(boolean z) {
        b(null);
        if (this.u == z) {
            return;
        }
        this.u = z;
        k0();
    }

    public final void V0(int i, int i2, boolean z, nl9 nl9Var) {
        boolean z2;
        int i3;
        int m;
        yo6 yo6Var = this.p;
        boolean z3 = false;
        int i4 = 1;
        if (this.q.k() == 0 && this.q.h() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        yo6Var.l = z2;
        this.p.f = i;
        int[] iArr = this.C;
        iArr[0] = 0;
        iArr[1] = 0;
        nl9Var.getClass();
        int i5 = this.p.f;
        iArr[0] = 0;
        iArr[1] = 0;
        int max = Math.max(0, 0);
        int max2 = Math.max(0, iArr[1]);
        if (i == 1) {
            z3 = true;
        }
        yo6 yo6Var2 = this.p;
        if (z3) {
            i3 = max2;
        } else {
            i3 = max;
        }
        yo6Var2.h = i3;
        if (!z3) {
            max = max2;
        }
        yo6Var2.i = max;
        if (z3) {
            yo6Var2.h = this.q.j() + i3;
            View K0 = K0();
            yo6 yo6Var3 = this.p;
            if (this.t) {
                i4 = -1;
            }
            yo6Var3.e = i4;
            int E = el9.E(K0);
            yo6 yo6Var4 = this.p;
            yo6Var3.d = E + yo6Var4.e;
            yo6Var4.b = this.q.d(K0);
            m = this.q.d(K0) - this.q.i();
        } else {
            View L0 = L0();
            yo6 yo6Var5 = this.p;
            yo6Var5.h = this.q.m() + yo6Var5.h;
            yo6 yo6Var6 = this.p;
            if (!this.t) {
                i4 = -1;
            }
            yo6Var6.e = i4;
            int E2 = el9.E(L0);
            yo6 yo6Var7 = this.p;
            yo6Var6.d = E2 + yo6Var7.e;
            yo6Var7.b = this.q.g(L0);
            m = (-this.q.g(L0)) + this.q.m();
        }
        yo6 yo6Var8 = this.p;
        yo6Var8.c = i2;
        if (z) {
            yo6Var8.c = i2 - m;
        }
        yo6Var8.g = m;
    }

    public final void W0(int i, int i2) {
        int i3;
        this.p.c = this.q.i() - i2;
        yo6 yo6Var = this.p;
        if (this.t) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        yo6Var.e = i3;
        yo6Var.d = i;
        yo6Var.f = 1;
        yo6Var.b = i2;
        yo6Var.g = Integer.MIN_VALUE;
    }

    public final void X0(int i, int i2) {
        int i3;
        this.p.c = i2 - this.q.m();
        yo6 yo6Var = this.p;
        yo6Var.d = i;
        if (this.t) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        yo6Var.e = i3;
        yo6Var.f = -1;
        yo6Var.b = i2;
        yo6Var.g = Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // defpackage.el9
    public void a0(kl9 kl9Var, nl9 nl9Var) {
        int i;
        View H0;
        boolean z;
        boolean z2;
        int n;
        int i2;
        boolean z3;
        boolean z4;
        int g;
        int n2;
        int i3;
        boolean z5;
        int i4;
        int i5;
        ?? r4;
        List list;
        boolean z6;
        int i6;
        int i7;
        int I0;
        int i8;
        View p;
        int g2;
        int i9;
        int i10;
        int i11 = -1;
        if ((this.y != null || this.w != -1) && nl9Var.b() == 0) {
            f0(kl9Var);
            return;
        }
        zo6 zo6Var = this.y;
        if (zo6Var != null && (i10 = zo6Var.a) >= 0) {
            this.w = i10;
        }
        B0();
        boolean z7 = false;
        this.p.a = false;
        R0();
        RecyclerView recyclerView = this.b;
        View view = (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) this.a.d).contains(view)) ? null : null;
        n04 n04Var = this.z;
        if (n04Var.e && this.w == -1 && this.y == null) {
            if (view != null && (this.q.g(view) >= this.q.i() || this.q.d(view) <= this.q.m())) {
                n04Var.c(view, el9.E(view));
            }
        } else {
            n04Var.f();
            n04Var.d = this.t ^ this.u;
            if (!nl9Var.f && (i2 = this.w) != -1) {
                if (i2 >= 0 && i2 < nl9Var.b()) {
                    int i12 = this.w;
                    n04Var.b = i12;
                    zo6 zo6Var2 = this.y;
                    if (zo6Var2 != null && zo6Var2.a >= 0) {
                        boolean z8 = zo6Var2.c;
                        n04Var.d = z8;
                        yp3 yp3Var = this.q;
                        if (z8) {
                            n04Var.c = yp3Var.i() - this.y.b;
                        } else {
                            n04Var.c = yp3Var.m() + this.y.b;
                        }
                    } else if (this.x == Integer.MIN_VALUE) {
                        View p2 = p(i12);
                        if (p2 != null) {
                            if (this.q.e(p2) > this.q.n()) {
                                n04Var.b();
                            } else {
                                int g3 = this.q.g(p2) - this.q.m();
                                yp3 yp3Var2 = this.q;
                                if (g3 < 0) {
                                    n04Var.c = yp3Var2.m();
                                    n04Var.d = false;
                                } else if (yp3Var2.i() - this.q.d(p2) < 0) {
                                    n04Var.c = this.q.i();
                                    n04Var.d = true;
                                } else {
                                    boolean z9 = n04Var.d;
                                    yp3 yp3Var3 = this.q;
                                    if (z9) {
                                        int d = yp3Var3.d(p2);
                                        yp3 yp3Var4 = this.q;
                                        if (Integer.MIN_VALUE == yp3Var4.a) {
                                            n2 = 0;
                                        } else {
                                            n2 = yp3Var4.n() - yp3Var4.a;
                                        }
                                        g = n2 + d;
                                    } else {
                                        g = yp3Var3.g(p2);
                                    }
                                    n04Var.c = g;
                                }
                            }
                        } else {
                            if (u() > 0) {
                                if (this.w < el9.E(t(0))) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3 == this.t) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                n04Var.d = z4;
                            }
                            n04Var.b();
                        }
                    } else {
                        boolean z10 = this.t;
                        n04Var.d = z10;
                        yp3 yp3Var5 = this.q;
                        if (z10) {
                            n04Var.c = yp3Var5.i() - this.x;
                        } else {
                            n04Var.c = yp3Var5.m() + this.x;
                        }
                    }
                    n04Var.e = true;
                } else {
                    this.w = -1;
                    this.x = Integer.MIN_VALUE;
                }
            }
            if (u() != 0) {
                RecyclerView recyclerView2 = this.b;
                View view2 = (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.a.d).contains(view2)) ? null : null;
                if (view2 != null) {
                    fl9 fl9Var = (fl9) view2.getLayoutParams();
                    if (!fl9Var.a.g() && fl9Var.a.b() >= 0 && fl9Var.a.b() < nl9Var.b()) {
                        n04Var.c(view2, el9.E(view2));
                        n04Var.e = true;
                    }
                }
                boolean z11 = this.r;
                boolean z12 = this.u;
                if (z11 == z12 && (H0 = H0(kl9Var, nl9Var, n04Var.d, z12)) != null) {
                    int E = el9.E(H0);
                    boolean z13 = n04Var.d;
                    yp3 yp3Var6 = (yp3) n04Var.f;
                    if (z13) {
                        int d2 = yp3Var6.d(H0);
                        yp3 yp3Var7 = (yp3) n04Var.f;
                        if (Integer.MIN_VALUE == yp3Var7.a) {
                            n = 0;
                        } else {
                            n = yp3Var7.n() - yp3Var7.a;
                        }
                        n04Var.c = n + d2;
                    } else {
                        n04Var.c = yp3Var6.g(H0);
                    }
                    n04Var.b = E;
                    if (!nl9Var.f && v0()) {
                        int g4 = this.q.g(H0);
                        int d3 = this.q.d(H0);
                        int m = this.q.m();
                        int i13 = this.q.i();
                        if (d3 <= m && g4 < m) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (g4 >= i13 && d3 > i13) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z || z2) {
                            if (n04Var.d) {
                                m = i13;
                            }
                            n04Var.c = m;
                        }
                    }
                    n04Var.e = true;
                }
            }
            n04Var.b();
            if (this.u) {
                i = nl9Var.b() - 1;
            } else {
                i = 0;
            }
            n04Var.b = i;
            n04Var.e = true;
        }
        yo6 yo6Var = this.p;
        if (yo6Var.j >= 0) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        yo6Var.f = i3;
        int[] iArr = this.C;
        iArr[0] = 0;
        iArr[1] = 0;
        nl9Var.getClass();
        int i14 = this.p.f;
        iArr[0] = 0;
        iArr[1] = 0;
        int m2 = this.q.m() + Math.max(0, 0);
        int j = this.q.j() + Math.max(0, iArr[1]);
        if (nl9Var.f && (i8 = this.w) != -1 && this.x != Integer.MIN_VALUE && (p = p(i8)) != null) {
            boolean z14 = this.t;
            yp3 yp3Var8 = this.q;
            if (z14) {
                i9 = yp3Var8.i() - this.q.d(p);
                g2 = this.x;
            } else {
                g2 = yp3Var8.g(p) - this.q.m();
                i9 = this.x;
            }
            int i15 = i9 - g2;
            if (i15 > 0) {
                m2 += i15;
            } else {
                j -= i15;
            }
        }
        boolean z15 = n04Var.d;
        boolean z16 = this.t;
        if (!z15 ? !z16 : z16) {
            i11 = 1;
        }
        O0(kl9Var, nl9Var, n04Var, i11);
        o(kl9Var);
        yo6 yo6Var2 = this.p;
        if (this.q.k() == 0 && this.q.h() == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        yo6Var2.l = z5;
        this.p.getClass();
        this.p.i = 0;
        boolean z17 = n04Var.d;
        int i16 = n04Var.b;
        if (z17) {
            X0(i16, n04Var.c);
            yo6 yo6Var3 = this.p;
            yo6Var3.h = m2;
            C0(kl9Var, yo6Var3, nl9Var, false);
            yo6 yo6Var4 = this.p;
            i5 = yo6Var4.b;
            int i17 = yo6Var4.d;
            int i18 = yo6Var4.c;
            if (i18 > 0) {
                j += i18;
            }
            W0(n04Var.b, n04Var.c);
            yo6 yo6Var5 = this.p;
            yo6Var5.h = j;
            yo6Var5.d += yo6Var5.e;
            C0(kl9Var, yo6Var5, nl9Var, false);
            yo6 yo6Var6 = this.p;
            i4 = yo6Var6.b;
            int i19 = yo6Var6.c;
            if (i19 > 0) {
                X0(i17, i5);
                yo6 yo6Var7 = this.p;
                yo6Var7.h = i19;
                C0(kl9Var, yo6Var7, nl9Var, false);
                i5 = this.p.b;
            }
        } else {
            W0(i16, n04Var.c);
            yo6 yo6Var8 = this.p;
            yo6Var8.h = j;
            C0(kl9Var, yo6Var8, nl9Var, false);
            yo6 yo6Var9 = this.p;
            i4 = yo6Var9.b;
            int i20 = yo6Var9.d;
            int i21 = yo6Var9.c;
            if (i21 > 0) {
                m2 += i21;
            }
            X0(n04Var.b, n04Var.c);
            yo6 yo6Var10 = this.p;
            yo6Var10.h = m2;
            yo6Var10.d += yo6Var10.e;
            C0(kl9Var, yo6Var10, nl9Var, false);
            yo6 yo6Var11 = this.p;
            int i22 = yo6Var11.b;
            int i23 = yo6Var11.c;
            if (i23 > 0) {
                W0(i20, i4);
                yo6 yo6Var12 = this.p;
                yo6Var12.h = i23;
                C0(kl9Var, yo6Var12, nl9Var, false);
                i4 = this.p.b;
            }
            i5 = i22;
        }
        if (u() > 0) {
            if (this.t ^ this.u) {
                int I02 = I0(i4, kl9Var, nl9Var, true);
                i6 = i5 + I02;
                i7 = i4 + I02;
                I0 = J0(i6, kl9Var, nl9Var, false);
            } else {
                int J0 = J0(i5, kl9Var, nl9Var, true);
                i6 = i5 + J0;
                i7 = i4 + J0;
                I0 = I0(i7, kl9Var, nl9Var, false);
            }
            i5 = i6 + I0;
            i4 = i7 + I0;
        }
        if (nl9Var.j && u() != 0 && !nl9Var.f && v0()) {
            List list2 = (List) kl9Var.f;
            int size = list2.size();
            int E2 = el9.E(t(0));
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i24 < size) {
                rl9 rl9Var = (rl9) list2.get(i24);
                boolean g5 = rl9Var.g();
                View view3 = rl9Var.a;
                if (!g5) {
                    if (rl9Var.b() < E2) {
                        z6 = true;
                    } else {
                        z6 = z7;
                    }
                    boolean z18 = this.t;
                    yp3 yp3Var9 = this.q;
                    if (z6 != z18) {
                        i25 += yp3Var9.e(view3);
                    } else {
                        i26 += yp3Var9.e(view3);
                    }
                }
                i24++;
                z7 = false;
            }
            this.p.k = list2;
            if (i25 > 0) {
                X0(el9.E(L0()), i5);
                yo6 yo6Var13 = this.p;
                yo6Var13.h = i25;
                r4 = 0;
                yo6Var13.c = 0;
                yo6Var13.a(null);
                C0(kl9Var, this.p, nl9Var, false);
            } else {
                r4 = 0;
            }
            if (i26 > 0) {
                W0(el9.E(K0()), i4);
                yo6 yo6Var14 = this.p;
                yo6Var14.h = i26;
                yo6Var14.c = r4;
                list = null;
                yo6Var14.a(null);
                C0(kl9Var, this.p, nl9Var, r4);
            } else {
                list = null;
            }
            this.p.k = list;
        }
        if (!nl9Var.f) {
            yp3 yp3Var10 = this.q;
            yp3Var10.a = yp3Var10.n();
        } else {
            n04Var.f();
        }
        this.r = this.u;
    }

    @Override // defpackage.el9
    public final void b(String str) {
        if (this.y == null) {
            super.b(str);
        }
    }

    @Override // defpackage.el9
    public void b0(nl9 nl9Var) {
        this.y = null;
        this.w = -1;
        this.x = Integer.MIN_VALUE;
        this.z.f();
    }

    @Override // defpackage.el9
    public final boolean c() {
        if (this.o == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.el9
    public final void c0(Parcelable parcelable) {
        if (parcelable instanceof zo6) {
            zo6 zo6Var = (zo6) parcelable;
            this.y = zo6Var;
            if (this.w != -1) {
                zo6Var.a = -1;
            }
            k0();
        }
    }

    @Override // defpackage.el9
    public final boolean d() {
        if (this.o == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [zo6, android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [zo6, android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.el9
    public final Parcelable d0() {
        zo6 zo6Var = this.y;
        if (zo6Var != null) {
            ?? obj = new Object();
            obj.a = zo6Var.a;
            obj.b = zo6Var.b;
            obj.c = zo6Var.c;
            return obj;
        }
        ?? obj2 = new Object();
        if (u() > 0) {
            B0();
            boolean z = this.r ^ this.t;
            obj2.c = z;
            if (z) {
                View K0 = K0();
                obj2.b = this.q.i() - this.q.d(K0);
                obj2.a = el9.E(K0);
                return obj2;
            }
            View L0 = L0();
            obj2.a = el9.E(L0);
            obj2.b = this.q.g(L0) - this.q.m();
            return obj2;
        }
        obj2.a = -1;
        return obj2;
    }

    @Override // defpackage.el9
    public final void g(int i, int i2, nl9 nl9Var, wh1 wh1Var) {
        int i3;
        if (this.o != 0) {
            i = i2;
        }
        if (u() != 0 && i != 0) {
            B0();
            if (i > 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            V0(i3, Math.abs(i), true, nl9Var);
            w0(nl9Var, this.p, wh1Var);
        }
    }

    @Override // defpackage.el9
    public final void h(int i, wh1 wh1Var) {
        boolean z;
        int i2;
        zo6 zo6Var = this.y;
        int i3 = -1;
        if (zo6Var != null && (i2 = zo6Var.a) >= 0) {
            z = zo6Var.c;
        } else {
            R0();
            z = this.t;
            i2 = this.w;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.B && i2 >= 0 && i2 < i; i4++) {
            wh1Var.b(i2, 0);
            i2 += i3;
        }
    }

    @Override // defpackage.el9
    public final int i(nl9 nl9Var) {
        return x0(nl9Var);
    }

    @Override // defpackage.el9
    public int j(nl9 nl9Var) {
        return y0(nl9Var);
    }

    @Override // defpackage.el9
    public int k(nl9 nl9Var) {
        return z0(nl9Var);
    }

    @Override // defpackage.el9
    public final int l(nl9 nl9Var) {
        return x0(nl9Var);
    }

    @Override // defpackage.el9
    public int l0(int i, kl9 kl9Var, nl9 nl9Var) {
        if (this.o == 1) {
            return 0;
        }
        return S0(i, kl9Var, nl9Var);
    }

    @Override // defpackage.el9
    public int m(nl9 nl9Var) {
        return y0(nl9Var);
    }

    @Override // defpackage.el9
    public int m0(int i, kl9 kl9Var, nl9 nl9Var) {
        if (this.o == 0) {
            return 0;
        }
        return S0(i, kl9Var, nl9Var);
    }

    @Override // defpackage.el9
    public int n(nl9 nl9Var) {
        return z0(nl9Var);
    }

    @Override // defpackage.el9
    public final View p(int i) {
        int u = u();
        if (u == 0) {
            return null;
        }
        int E = i - el9.E(t(0));
        if (E >= 0 && E < u) {
            View t = t(E);
            if (el9.E(t) == i) {
                return t;
            }
        }
        return super.p(i);
    }

    @Override // defpackage.el9
    public fl9 q() {
        return new fl9(-2, -2);
    }

    @Override // defpackage.el9
    public final boolean t0() {
        if (this.l != 1073741824 && this.k != 1073741824) {
            int u = u();
            for (int i = 0; i < u; i++) {
                ViewGroup.LayoutParams layoutParams = t(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.el9
    public boolean v0() {
        if (this.y == null && this.r == this.u) {
            return true;
        }
        return false;
    }

    public void w0(nl9 nl9Var, yo6 yo6Var, wh1 wh1Var) {
        int i = yo6Var.d;
        if (i >= 0 && i < nl9Var.b()) {
            wh1Var.b(i, Math.max(0, yo6Var.g));
        }
    }

    public final int x0(nl9 nl9Var) {
        if (u() == 0) {
            return 0;
        }
        B0();
        yp3 yp3Var = this.q;
        boolean z = !this.v;
        return nxe.r(nl9Var, yp3Var, E0(z), D0(z), this, this.v);
    }

    public final int y0(nl9 nl9Var) {
        if (u() == 0) {
            return 0;
        }
        B0();
        yp3 yp3Var = this.q;
        boolean z = !this.v;
        return nxe.s(nl9Var, yp3Var, E0(z), D0(z), this, this.v, this.t);
    }

    public final int z0(nl9 nl9Var) {
        if (u() == 0) {
            return 0;
        }
        B0();
        yp3 yp3Var = this.q;
        boolean z = !this.v;
        return nxe.t(nl9Var, yp3Var, E0(z), D0(z), this, this.v);
    }

    @Override // defpackage.el9
    public final void P(RecyclerView recyclerView) {
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [n50, java.lang.Object] */
    public LinearLayoutManager() {
        this.o = 1;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = true;
        this.w = -1;
        this.x = Integer.MIN_VALUE;
        this.y = null;
        this.z = new n04();
        this.A = new Object();
        this.B = 2;
        this.C = new int[2];
        T0(1);
        b(null);
        if (this.s) {
            this.s = false;
            k0();
        }
    }

    public void O0(kl9 kl9Var, nl9 nl9Var, n04 n04Var, int i) {
    }
}
