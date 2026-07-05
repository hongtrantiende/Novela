package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eg  reason: default package */
/* loaded from: classes.dex */
public final class eg extends mq7 implements vu0, z7a, l86, fd6, rnc {
    public fkd K;
    public final y0 L = new y0(this, 1);
    public final jc M = new jc(this, 1);
    public final /* synthetic */ rg N;

    public eg(rg rgVar) {
        this.N = rgVar;
    }

    @Override // defpackage.l86
    public final boolean H(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.rnc
    public final Object M() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.l86
    public final boolean g0(KeyEvent keyEvent) {
        em4 em4Var;
        int i;
        int[] iArr = lm4.a;
        long i2 = gae.i(keyEvent);
        int i3 = 2;
        if (e86.a(i2, e86.c)) {
            em4Var = new em4(2);
        } else if (e86.a(i2, e86.d)) {
            em4Var = new em4(1);
        } else if (e86.a(i2, e86.v)) {
            if (keyEvent.isShiftPressed()) {
                i = 2;
            } else {
                i = 1;
            }
            em4Var = new em4(i);
        } else if (e86.a(i2, e86.h)) {
            em4Var = new em4(4);
        } else if (e86.a(i2, e86.g)) {
            em4Var = new em4(3);
        } else if (!e86.a(i2, e86.e) && !e86.a(i2, e86.I)) {
            if (!e86.a(i2, e86.f) && !e86.a(i2, e86.J)) {
                if (!e86.a(i2, e86.i) && !e86.a(i2, e86.x) && !e86.a(i2, e86.K)) {
                    if (!e86.a(i2, e86.b) && !e86.a(i2, e86.A)) {
                        em4Var = null;
                    } else {
                        em4Var = new em4(8);
                    }
                } else {
                    em4Var = new em4(7);
                }
            } else {
                em4Var = new em4(6);
            }
        } else {
            em4Var = new em4(5);
        }
        boolean z = false;
        if (em4Var != null) {
            int i4 = em4Var.a;
            if (gae.j(keyEvent) == 2) {
                rg rgVar = this.N;
                hn4 f = ((rm4) rgVar.getFocusOwner()).f();
                if (f != null && f.K && rgVar.w(i4)) {
                    lu4 playNavigationSoundEffect$ui = rgVar.getPlayNavigationSoundEffect$ui();
                    if (keyEvent.getRepeatCount() > 0) {
                        z = true;
                    }
                    playNavigationSoundEffect$ui.invoke(em4Var, Boolean.valueOf(z));
                    return true;
                }
                Boolean e = ((rm4) rgVar.getFocusOwner()).e(i4, rgVar.getEmbeddedViewFocusRect(), new jc(em4Var, 2));
                if (e == null) {
                    return true;
                }
                if (e.booleanValue()) {
                    lu4 playNavigationSoundEffect$ui2 = rgVar.getPlayNavigationSoundEffect$ui();
                    if (keyEvent.getRepeatCount() > 0) {
                        z = true;
                    }
                    playNavigationSoundEffect$ui2.invoke(em4Var, Boolean.valueOf(z));
                    return true;
                } else if (i4 != 1 && i4 != 2) {
                    return false;
                } else {
                    Integer c = lm4.c(i4);
                    if (c != null) {
                        i3 = c.intValue();
                    }
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View rootView = rgVar.getRootView();
                    rootView.getClass();
                    View findNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, rgVar.getView(), i3);
                    if (findNextFocus == null || findNextFocus.equals(rgVar)) {
                        return ((rm4) rgVar.getFocusOwner()).h(i4);
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.vu0
    public final Object l0(i38 i38Var, hg hgVar, n42 n42Var) {
        rk9 rk9Var;
        long h0 = i38Var.h0(0L);
        rk9 rk9Var2 = (rk9) hgVar.invoke();
        if (rk9Var2 != null) {
            rk9Var = rk9Var2.o(h0);
        } else {
            rk9Var = null;
        }
        if (rk9Var != null) {
            this.N.requestRectangleOnScreen(new Rect((int) rk9Var.a, (int) rk9Var.b, (int) rk9Var.c, (int) rk9Var.d), false);
        }
        return pvc.a;
    }

    @Override // defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        mw8 M = w27Var.M(j);
        int i = M.a;
        int i2 = M.b;
        dg dgVar = new dg(M, 0);
        return e37Var.i0(i, i2, this.M, this.L, ls3.a, dgVar);
    }

    @Override // defpackage.z7a
    public final void m1(l8a l8aVar) {
    }
}
