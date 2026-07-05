package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wjd  reason: default package */
/* loaded from: classes.dex */
public class wjd extends kwe {
    public final WindowInsetsController c;
    public final bp9 d;
    public final Window e;

    public wjd(Window window, bp9 bp9Var) {
        this.c = window.getInsetsController();
        this.d = bp9Var;
        this.e = window;
    }

    @Override // defpackage.kwe
    public int F() {
        Window window = this.e;
        if (window != null) {
            Object tag = window.getDecorView().getTag(356039078);
            if (tag != null) {
                return ((Integer) tag).intValue();
            }
            return 1;
        }
        return this.c.getSystemBarsBehavior();
    }

    @Override // defpackage.kwe
    public final void G(int i) {
        if ((i & 8) != 0) {
            ((xk9) this.d.b).h();
        }
        this.c.hide(i & (-9));
    }

    @Override // defpackage.kwe
    public boolean J() {
        return S(16, 16);
    }

    @Override // defpackage.kwe
    public boolean K() {
        return S(8192, 8);
    }

    @Override // defpackage.kwe
    public void N(boolean z) {
        Window window = this.e;
        if (window != null) {
            if (z) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                return;
            }
            T(16);
            return;
        }
        WindowInsetsController windowInsetsController = this.c;
        if (z) {
            windowInsetsController.setSystemBarsAppearance(16, 16);
        } else {
            windowInsetsController.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // defpackage.kwe
    public void O(boolean z) {
        Window window = this.e;
        if (window != null) {
            if (z) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                return;
            }
            T(8192);
            return;
        }
        WindowInsetsController windowInsetsController = this.c;
        if (z) {
            windowInsetsController.setSystemBarsAppearance(8, 8);
        } else {
            windowInsetsController.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // defpackage.kwe
    public void P(int i) {
        Window window = this.e;
        if (window != null) {
            window.getDecorView().setTag(356039078, Integer.valueOf(i));
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    T(2048);
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 4096);
                    return;
                }
                T(4096);
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 2048);
                return;
            }
            T(6144);
            return;
        }
        this.c.setSystemBarsBehavior(i);
    }

    @Override // defpackage.kwe
    public final void Q(int i) {
        if ((i & 8) != 0) {
            ((xk9) this.d.b).r();
        }
        this.c.show(i & (-9));
    }

    public final boolean S(int i, int i2) {
        Window window = this.e;
        if (window != null) {
            if ((window.getDecorView().getSystemUiVisibility() & i) != 0) {
                return true;
            }
        } else {
            this.c.setSystemBarsAppearance(0, 0);
            if ((this.c.getSystemBarsAppearance() & i2) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void T(int i) {
        View decorView = this.e.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
