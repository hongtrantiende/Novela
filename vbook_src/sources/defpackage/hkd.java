package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Field;
import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hkd  reason: default package */
/* loaded from: classes.dex */
public final class hkd extends xb1 implements Runnable, ib8, View.OnAttachStateChangeListener {
    public static final Integer[] F = {8, 64, 4, 1, Integer.valueOf((int) Token.CASE), 16, 2, 32};
    public final hm8 C;
    public final wu7 D;
    public final wu7 E;
    public boolean d;
    public int e;
    public tjd f;

    public hkd(rg rgVar) {
        super(1);
        this.C = yae.z(null);
        this.D = new wu7(8);
        this.E = new wu7(8);
    }

    @Override // defpackage.xb1
    public final void d(zid zidVar) {
        boolean z = false;
        this.d = false;
        int c = zidVar.a.c();
        n0(c).setValue(null);
        o0(c).setValue(null);
        this.e = (~c) & this.e;
        this.f = null;
        synchronized (dra.c) {
            uv7 uv7Var = dra.j.h;
            if (uv7Var != null) {
                if (uv7Var.h()) {
                    z = true;
                }
            }
        }
        if (z) {
            dra.a();
        }
    }

    @Override // defpackage.xb1
    public final void e(zid zidVar) {
        this.d = true;
    }

    @Override // defpackage.xb1
    public final tjd f(tjd tjdVar, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            zid zidVar = (zid) list.get(i);
            int c = zidVar.a.c();
            if ((this.e & c) != 0) {
                n0(c).setValue(zidVar);
            }
        }
        p0(tjdVar);
        return tjdVar;
    }

    @Override // defpackage.xb1
    public final rwa g(zid zidVar, rwa rwaVar) {
        tjd tjdVar = this.f;
        boolean z = false;
        this.d = false;
        cx5 cx5Var = null;
        this.f = null;
        if (zidVar.a.a() > 0 && tjdVar != null) {
            int c = zidVar.a.c();
            tjd m0 = m0();
            if (m0 != null) {
                cx5Var = m0.a.i(c);
            }
            cx5 i = tjdVar.a.i(c);
            if (!c16.i(i, cx5Var) && cx5Var != null) {
                this.e |= c;
                n0(c).setValue(zidVar);
                o0(c).setValue(new gkd(cx5Var, i));
                synchronized (dra.c) {
                    uv7 uv7Var = dra.j.h;
                    if (uv7Var != null) {
                        if (uv7Var.h()) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    dra.a();
                    return rwaVar;
                }
            }
        }
        return rwaVar;
    }

    @Override // defpackage.ib8
    public final tjd i(View view, tjd tjdVar) {
        if (this.d) {
            this.f = tjdVar;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return tjdVar;
            }
        } else if (this.e == 0) {
            p0(tjdVar);
        }
        return tjdVar;
    }

    public final tjd m0() {
        return (tjd) this.C.getValue();
    }

    public final aw7 n0(int i) {
        wu7 wu7Var = this.D;
        aw7 aw7Var = (aw7) wu7Var.b(i);
        if (aw7Var == null) {
            hm8 z = yae.z(null);
            wu7Var.i(i, z);
            return z;
        }
        return aw7Var;
    }

    public final aw7 o0(int i) {
        wu7 wu7Var = this.E;
        aw7 aw7Var = (aw7) wu7Var.b(i);
        if (aw7Var == null) {
            hm8 z = yae.z(null);
            wu7Var.i(i, z);
            return z;
        }
        return aw7Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            view = view2;
        }
        Field field = rcd.a;
        kcd.b(view, this);
        rcd.d(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View view2;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            view = view2;
        }
        Field field = rcd.a;
        kcd.b(view, null);
        rcd.d(view, null);
    }

    public final void p0(tjd tjdVar) {
        cx5 j;
        boolean z = false;
        if (m0() == null) {
            cx5 cx5Var = cx5.e;
            Integer[] numArr = F;
            for (int i = 0; i < 8; i++) {
                int intValue = numArr[i].intValue();
                if (intValue == 8) {
                    j = tjdVar.a.i(intValue);
                } else {
                    j = tjdVar.a.j(intValue);
                }
                if (c16.i(j, cx5Var)) {
                }
            }
            return;
        }
        this.C.setValue(tjdVar);
        synchronized (dra.c) {
            uv7 uv7Var = dra.j.h;
            if (uv7Var != null) {
                if (uv7Var.h()) {
                    z = true;
                }
            }
        }
        if (z) {
            dra.a();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d) {
            this.e = 0;
            this.d = false;
            tjd tjdVar = this.f;
            if (tjdVar != null) {
                p0(tjdVar);
                this.f = null;
            }
        }
    }
}
