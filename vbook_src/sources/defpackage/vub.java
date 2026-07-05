package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vub  reason: default package */
/* loaded from: classes.dex */
public final class vub implements fy8 {
    public final View a;
    public final zg4 b;
    public final g04 c;
    public boolean d;
    public xt4 e;
    public xt4 f;
    public jub g;
    public as5 h;
    public final ArrayList i;
    public final ye6 j;
    public Rect k;
    public final be2 l;
    public final gw7 m;
    public e09 n;

    public vub(View view, rg rgVar) {
        zg4 zg4Var = new zg4(view);
        g04 g04Var = new g04(view, 1);
        this.a = view;
        this.b = zg4Var;
        this.c = g04Var;
        this.e = co9.E;
        this.f = co9.F;
        this.g = new jub("", fxb.b, 4);
        this.h = as5.g;
        this.i = new ArrayList();
        this.j = ipe.x(sk6.c, new ik(this, 27));
        this.l = new be2(rgVar, zg4Var);
        this.m = new gw7(new uub[16], 0);
    }

    @Override // defpackage.fy8
    public final void a() {
        i(uub.a);
    }

    @Override // defpackage.fy8
    public final void b() {
        i(uub.c);
    }

    @Override // defpackage.fy8
    public final void c() {
        this.d = false;
        this.e = co9.G;
        this.f = co9.H;
        this.k = null;
        i(uub.b);
    }

    @Override // defpackage.fy8
    public final void d(jub jubVar, j88 j88Var, fvb fvbVar, lv0 lv0Var, rk9 rk9Var, rk9 rk9Var2) {
        be2 be2Var = this.l;
        synchronized (be2Var.c) {
            try {
                be2Var.j = jubVar;
                be2Var.l = j88Var;
                be2Var.k = fvbVar;
                be2Var.m = lv0Var;
                be2Var.n = rk9Var;
                be2Var.o = rk9Var2;
                if (!be2Var.e) {
                    if (be2Var.d) {
                    }
                }
                be2Var.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.fy8
    public final void e(jub jubVar, jub jubVar2) {
        boolean z;
        int i;
        int i2;
        int i3;
        if (fxb.c(this.g.b, jubVar2.b) && c16.i(this.g.c, jubVar2.c)) {
            z = false;
        } else {
            z = true;
        }
        this.g = jubVar2;
        int size = this.i.size();
        for (int i4 = 0; i4 < size; i4++) {
            mk9 mk9Var = (mk9) ((WeakReference) this.i.get(i4)).get();
            if (mk9Var != null) {
                mk9Var.d = jubVar2;
            }
        }
        be2 be2Var = this.l;
        synchronized (be2Var.c) {
            be2Var.j = null;
            be2Var.l = null;
            be2Var.k = null;
            be2Var.m = kg.Y;
            be2Var.n = null;
            be2Var.o = null;
        }
        int i5 = -1;
        if (c16.i(jubVar, jubVar2)) {
            if (z) {
                zg4 zg4Var = this.b;
                int g = fxb.g(jubVar2.b);
                int f = fxb.f(jubVar2.b);
                fxb fxbVar = this.g.c;
                if (fxbVar != null) {
                    i3 = fxb.g(fxbVar.a);
                } else {
                    i3 = -1;
                }
                fxb fxbVar2 = this.g.c;
                if (fxbVar2 != null) {
                    i5 = fxb.f(fxbVar2.a);
                }
                ((InputMethodManager) ((ye6) zg4Var.c).getValue()).updateSelection((View) zg4Var.b, g, f, i3, i5);
            }
        } else if (jubVar != null && (!c16.i(jubVar.a.b, jubVar2.a.b) || (fxb.c(jubVar.b, jubVar2.b) && !c16.i(jubVar.c, jubVar2.c)))) {
            zg4 zg4Var2 = this.b;
            ((InputMethodManager) ((ye6) zg4Var2.c).getValue()).restartInput((View) zg4Var2.b);
        } else {
            int size2 = this.i.size();
            for (int i6 = 0; i6 < size2; i6++) {
                mk9 mk9Var2 = (mk9) ((WeakReference) this.i.get(i6)).get();
                if (mk9Var2 != null) {
                    jub jubVar3 = this.g;
                    zg4 zg4Var3 = this.b;
                    if (mk9Var2.h) {
                        mk9Var2.d = jubVar3;
                        if (mk9Var2.f) {
                            ((InputMethodManager) ((ye6) zg4Var3.c).getValue()).updateExtractedText((View) zg4Var3.b, mk9Var2.e, h9a.X(jubVar3));
                        }
                        fxb fxbVar3 = jubVar3.c;
                        long j = jubVar3.b;
                        if (fxbVar3 != null) {
                            i = fxb.g(fxbVar3.a);
                        } else {
                            i = -1;
                        }
                        fxb fxbVar4 = jubVar3.c;
                        if (fxbVar4 != null) {
                            i2 = fxb.f(fxbVar4.a);
                        } else {
                            i2 = -1;
                        }
                        ((InputMethodManager) ((ye6) zg4Var3.c).getValue()).updateSelection((View) zg4Var3.b, fxb.g(j), fxb.f(j), i, i2);
                    }
                }
            }
        }
    }

    @Override // defpackage.fy8
    public final void f(jub jubVar, as5 as5Var, r6a r6aVar, h72 h72Var) {
        this.d = true;
        this.g = jubVar;
        this.h = as5Var;
        this.e = r6aVar;
        this.f = h72Var;
        i(uub.a);
    }

    @Override // defpackage.fy8
    public final void g() {
        i(uub.d);
    }

    @Override // defpackage.fy8
    public final void h(rk9 rk9Var) {
        Rect rect;
        this.k = new Rect(k27.A(rk9Var.a), k27.A(rk9Var.b), k27.A(rk9Var.c), k27.A(rk9Var.d));
        if (this.i.isEmpty() && (rect = this.k) != null) {
            this.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    public final void i(uub uubVar) {
        this.m.b(uubVar);
        if (this.n == null) {
            e09 e09Var = new e09(this, 7);
            this.c.execute(e09Var);
            this.n = e09Var;
        }
    }
}
