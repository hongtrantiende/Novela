package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: im4  reason: default package */
/* loaded from: classes.dex */
public final class im4 extends mq7 implements xm4, ViewTreeObserver.OnGlobalFocusChangeListener {
    public View K;
    public ViewTreeObserver L;
    public final hm4 M = new hm4(this, 0);
    public final hm4 N = new hm4(this, 1);

    @Override // defpackage.mq7
    public final void A1() {
        ViewTreeObserver viewTreeObserver = this.L;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.L = null;
        xoe.o(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.K = null;
    }

    public final hn4 H1() {
        boolean z;
        if (!this.a.J) {
            lv5.c("visitLocalDescendants called on an unattached node");
        }
        mq7 mq7Var = this.a;
        if ((mq7Var.d & 1024) != 0) {
            boolean z2 = false;
            for (mq7 mq7Var2 = mq7Var.f; mq7Var2 != null; mq7Var2 = mq7Var2.f) {
                if ((mq7Var2.c & 1024) != 0) {
                    mq7 mq7Var3 = mq7Var2;
                    gw7 gw7Var = null;
                    while (mq7Var3 != null) {
                        if (mq7Var3 instanceof hn4) {
                            hn4 hn4Var = (hn4) mq7Var3;
                            if (z2) {
                                return hn4Var;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (mq7Var3.c & 1024) != 0 && (mq7Var3 instanceof m03)) {
                            int i = 0;
                            for (mq7 mq7Var4 = ((m03) mq7Var3).L; mq7Var4 != null; mq7Var4 = mq7Var4.f) {
                                if ((mq7Var4.c & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        mq7Var3 = mq7Var4;
                                    } else {
                                        if (gw7Var == null) {
                                            gw7Var = new gw7(new mq7[16], 0);
                                        }
                                        if (mq7Var3 != null) {
                                            gw7Var.b(mq7Var3);
                                            mq7Var3 = null;
                                        }
                                        gw7Var.b(mq7Var4);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        mq7Var3 = voe.h(gw7Var);
                    }
                    continue;
                }
            }
        }
        vs.k("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // defpackage.xm4
    public final void e0(tm4 tm4Var) {
        tm4Var.d(false);
        tm4Var.c(this.M);
        tm4Var.a(this.N);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z;
        if (voe.v(this).K != null) {
            View i = w9e.i(this);
            pm4 focusOwner = ((rg) voe.w(this)).getFocusOwner();
            wg8 w = voe.w(this);
            boolean z2 = true;
            if (view != null && !view.equals(w)) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent == i.getParent()) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (view2 != null && !view2.equals(w)) {
                for (ViewParent parent2 = view2.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                    if (parent2 == i.getParent()) {
                        break;
                    }
                }
            }
            z2 = false;
            if (z && z2) {
                this.K = view2;
            } else if (z2) {
                this.K = view2;
                hn4 H1 = H1();
                if (!H1.M1().a()) {
                    cae.y(H1);
                }
            } else if (z) {
                this.K = null;
                if (H1().M1().b()) {
                    ((rm4) focusOwner).b(8, false, false);
                }
            } else {
                this.K = null;
            }
        }
    }

    @Override // defpackage.mq7
    public final void z1() {
        ViewTreeObserver viewTreeObserver = xoe.o(this).getViewTreeObserver();
        this.L = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }
}
