package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lb8  reason: default package */
/* loaded from: classes.dex */
public final class lb8 implements OnBackAnimationCallback {
    public final /* synthetic */ mb8 a;

    public lb8(mb8 mb8Var) {
        this.a = mb8Var;
    }

    public final void onBackCancelled() {
        mb8 mb8Var = this.a;
        yz7 yz7Var = mb8Var.a;
        if (yz7Var != null) {
            if (!mb8Var.b) {
                yz7Var.e(mb8Var, null);
            }
            yz7Var.d();
            if (yz7Var.c) {
                f08 f08Var = yz7Var.d;
                f08Var.getClass();
                if (mb8Var.equals(f08Var.h) && -1 == f08Var.g) {
                    a08 a08Var = f08Var.f;
                    if (a08Var == null) {
                        a08Var = f08Var.c(-1);
                    }
                    f08Var.f = null;
                    f08Var.g = 0;
                    f08Var.h = null;
                    h08 h08Var = h08.a;
                    if (a08Var != null) {
                        a08Var.d = h08Var;
                        a08Var.c();
                    }
                    cza czaVar = f08Var.a;
                    czaVar.getClass();
                    czaVar.n(null, h08Var);
                }
            }
            mb8Var.b = false;
            return;
        }
        vs.k("This input is not added to any dispatcher.");
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        xz7 h = s4.h(backEvent);
        mb8 mb8Var = this.a;
        yz7 yz7Var = mb8Var.a;
        if (yz7Var != null) {
            if (mb8Var.b) {
                yz7Var.d();
                if (yz7Var.c) {
                    f08 f08Var = yz7Var.d;
                    f08Var.getClass();
                    if (mb8Var.equals(f08Var.h) && -1 == f08Var.g) {
                        a08 a08Var = f08Var.f;
                        if (a08Var == null) {
                            a08Var = f08Var.c(-1);
                        }
                        if (a08Var != null) {
                            a08Var.d = new i08(h, -1);
                            a08Var.e(h);
                        }
                        cza czaVar = f08Var.a;
                        i08 i08Var = new i08(h, -1);
                        czaVar.getClass();
                        czaVar.n(null, i08Var);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        vs.k("This input is not added to any dispatcher.");
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        xz7 h = s4.h(backEvent);
        mb8 mb8Var = this.a;
        yz7 yz7Var = mb8Var.a;
        if (yz7Var != null) {
            if (!mb8Var.b) {
                yz7Var.e(mb8Var, h);
                mb8Var.b = true;
                return;
            }
            return;
        }
        vs.k("This input is not added to any dispatcher.");
    }
}
