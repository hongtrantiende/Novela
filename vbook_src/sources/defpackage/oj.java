package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oj  reason: default package */
/* loaded from: classes.dex */
public final class oj implements fy8 {
    public cl6 a;
    public iya b;
    public pl6 c;
    public pga d;

    @Override // defpackage.fy8
    public final void a() {
        j(null);
    }

    @Override // defpackage.fy8
    public final void b() {
        bsa bsaVar;
        cl6 cl6Var = this.a;
        if (cl6Var != null && (bsaVar = (bsa) nye.q(cl6Var, dy1.q)) != null) {
            ((w03) bsaVar).b();
        }
    }

    @Override // defpackage.fy8
    public final void c() {
        iya iyaVar = this.b;
        if (iyaVar != null) {
            iyaVar.cancel(null);
        }
        this.b = null;
        xv7 i = i();
        if (i != null) {
            ((pga) i).e();
        }
    }

    @Override // defpackage.fy8
    public final void d(jub jubVar, j88 j88Var, fvb fvbVar, lv0 lv0Var, rk9 rk9Var, rk9 rk9Var2) {
        pl6 pl6Var = this.c;
        if (pl6Var != null) {
            dl6 dl6Var = pl6Var.m;
            synchronized (dl6Var.c) {
                try {
                    dl6Var.j = jubVar;
                    dl6Var.l = j88Var;
                    dl6Var.k = fvbVar;
                    dl6Var.m = rk9Var;
                    dl6Var.n = rk9Var2;
                    if (!dl6Var.e) {
                        if (dl6Var.d) {
                        }
                    }
                    dl6Var.a();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.fy8
    public final void e(jub jubVar, jub jubVar2) {
        boolean z;
        int i;
        int i2;
        int i3;
        pl6 pl6Var = this.c;
        if (pl6Var != null) {
            if (fxb.c(pl6Var.h.b, jubVar2.b) && c16.i(pl6Var.h.c, jubVar2.c)) {
                z = false;
            } else {
                z = true;
            }
            pl6Var.h = jubVar2;
            int size = pl6Var.j.size();
            for (int i4 = 0; i4 < size; i4++) {
                nk9 nk9Var = (nk9) ((WeakReference) pl6Var.j.get(i4)).get();
                if (nk9Var != null) {
                    nk9Var.g = jubVar2;
                }
            }
            dl6 dl6Var = pl6Var.m;
            synchronized (dl6Var.c) {
                dl6Var.j = null;
                dl6Var.l = null;
                dl6Var.k = null;
                dl6Var.m = null;
                dl6Var.n = null;
            }
            int i5 = -1;
            if (c16.i(jubVar, jubVar2)) {
                if (z) {
                    kw5 kw5Var = pl6Var.b;
                    int g = fxb.g(jubVar2.b);
                    int f = fxb.f(jubVar2.b);
                    fxb fxbVar = pl6Var.h.c;
                    if (fxbVar != null) {
                        i3 = fxb.g(fxbVar.a);
                    } else {
                        i3 = -1;
                    }
                    fxb fxbVar2 = pl6Var.h.c;
                    if (fxbVar2 != null) {
                        i5 = fxb.f(fxbVar2.a);
                    }
                    kw5Var.r().updateSelection((View) kw5Var.b, g, f, i3, i5);
                }
            } else if (jubVar != null && (!c16.i(jubVar.a.b, jubVar2.a.b) || (fxb.c(jubVar.b, jubVar2.b) && !c16.i(jubVar.c, jubVar2.c)))) {
                kw5 kw5Var2 = pl6Var.b;
                kw5Var2.r().restartInput((View) kw5Var2.b);
            } else {
                int size2 = pl6Var.j.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    nk9 nk9Var2 = (nk9) ((WeakReference) pl6Var.j.get(i6)).get();
                    if (nk9Var2 != null) {
                        jub jubVar3 = pl6Var.h;
                        kw5 kw5Var3 = pl6Var.b;
                        if (nk9Var2.k) {
                            nk9Var2.g = jubVar3;
                            if (nk9Var2.i) {
                                kw5Var3.r().updateExtractedText((View) kw5Var3.b, nk9Var2.h, dpe.k(jubVar3));
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
                            kw5Var3.r().updateSelection((View) kw5Var3.b, fxb.g(j), fxb.f(j), i, i2);
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.fy8
    public final void f(jub jubVar, as5 as5Var, r6a r6aVar, h72 h72Var) {
        j(new p6(jubVar, this, as5Var, r6aVar, h72Var, 2));
    }

    @Override // defpackage.fy8
    public final void g() {
        bsa bsaVar;
        cl6 cl6Var = this.a;
        if (cl6Var != null && (bsaVar = (bsa) nye.q(cl6Var, dy1.q)) != null) {
            ((w03) bsaVar).a();
        }
    }

    @Override // defpackage.fy8
    public final void h(rk9 rk9Var) {
        Rect rect;
        pl6 pl6Var = this.c;
        if (pl6Var != null) {
            pl6Var.l = new Rect(k27.A(rk9Var.a), k27.A(rk9Var.b), k27.A(rk9Var.c), k27.A(rk9Var.d));
            if (pl6Var.j.isEmpty() && (rect = pl6Var.l) != null) {
                pl6Var.a.requestRectangleOnScreen(new Rect(rect));
            }
        }
    }

    public final xv7 i() {
        pga pgaVar = this.d;
        if (pgaVar != null) {
            return pgaVar;
        }
        if (!e6b.a) {
            return null;
        }
        pga a = qga.a(0, 2, py0.c);
        this.d = a;
        return a;
    }

    public final void j(p6 p6Var) {
        cl6 cl6Var = this.a;
        if (cl6Var == null) {
            return;
        }
        iya iyaVar = null;
        l lVar = new l(p6Var, this, cl6Var, (m42) null, 2);
        if (cl6Var.J) {
            iyaVar = z87.v(cl6Var.v1(), null, p82.d, new c95(cl6Var, lVar, (m42) null, 14), 1);
        }
        this.b = iyaVar;
    }

    public final void k(cl6 cl6Var) {
        boolean z;
        cl6 cl6Var2 = this.a;
        if (cl6Var2 == cl6Var) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ov5.c("Expected textInputModifierNode to be " + cl6Var + " but was " + cl6Var2);
        }
        this.a = null;
    }
}
