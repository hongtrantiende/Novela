package defpackage;

import android.view.View;
import android.view.Window;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ujd  reason: default package */
/* loaded from: classes.dex */
public class ujd extends kwe {
    public final Window c;
    public final bp9 d;

    public ujd(Window window, bp9 bp9Var) {
        this.c = window;
        this.d = bp9Var;
    }

    @Override // defpackage.kwe
    public final int F() {
        Object tag = this.c.getDecorView().getTag(356039078);
        if (tag != null) {
            return ((Integer) tag).intValue();
        }
        return 1;
    }

    @Override // defpackage.kwe
    public final void G(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 8) {
                            ((xk9) this.d.b).h();
                        }
                    } else {
                        S(2);
                    }
                } else {
                    S(4);
                }
            }
        }
    }

    @Override // defpackage.kwe
    public final boolean K() {
        if ((this.c.getDecorView().getSystemUiVisibility() & 8192) != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.kwe
    public final void O(boolean z) {
        if (z) {
            Window window = this.c;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            S(8192);
            return;
        }
        T(8192);
    }

    @Override // defpackage.kwe
    public final void P(int i) {
        this.c.getDecorView().setTag(356039078, Integer.valueOf(i));
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                T(2048);
                S(4096);
                return;
            }
            T(4096);
            S(2048);
            return;
        }
        T(6144);
    }

    @Override // defpackage.kwe
    public final void Q(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 8) {
                            ((xk9) this.d.b).r();
                        }
                    } else {
                        T(2);
                    }
                } else {
                    T(4);
                    this.c.clearFlags(1024);
                }
            }
        }
    }

    public final void S(int i) {
        View decorView = this.c.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void T(int i) {
        View decorView = this.c.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
