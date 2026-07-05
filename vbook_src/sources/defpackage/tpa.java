package defpackage;

import android.view.KeyEvent;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tpa  reason: default package */
/* loaded from: classes.dex */
public final class tpa implements xt4 {
    public final /* synthetic */ float C;
    public final /* synthetic */ vt4 D;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ jk1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ xt4 e;
    public final /* synthetic */ boolean f;

    public tpa(boolean z, jk1 jk1Var, int i, boolean z2, xt4 xt4Var, boolean z3, float f, vt4 vt4Var) {
        this.a = z;
        this.b = jk1Var;
        this.c = i;
        this.d = z2;
        this.e = xt4Var;
        this.f = z3;
        this.C = f;
        this.D = vt4Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i;
        int i2;
        KeyEvent keyEvent = ((g86) obj).a;
        if (!this.a) {
            return Boolean.FALSE;
        }
        int j = gae.j(keyEvent);
        boolean z = this.f;
        if (j == 2) {
            jk1 jk1Var = this.b;
            float f = jk1Var.b;
            float f2 = jk1Var.a;
            float abs = Math.abs(f - f2);
            int i3 = this.c;
            if (i3 > 0) {
                i = i3 + 1;
            } else {
                i = 100;
            }
            float f3 = abs / i;
            if (this.d) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            boolean a = e86.a(rae.a(keyEvent.getKeyCode()), e86.B);
            xt4 xt4Var = this.e;
            if (a) {
                xt4Var.invoke(Float.valueOf(f2));
                return Boolean.TRUE;
            } else if (e86.a(rae.a(keyEvent.getKeyCode()), e86.C)) {
                xt4Var.invoke(Float.valueOf(jk1Var.b));
                return Boolean.TRUE;
            } else {
                float f4 = this.C;
                if (z) {
                    long a2 = rae.a(keyEvent.getKeyCode());
                    if (e86.a(a2, e86.e)) {
                        xt4Var.invoke(dce.p(Float.valueOf(f4 - (i2 * f3)), jk1Var));
                        return Boolean.TRUE;
                    } else if (e86.a(a2, e86.f)) {
                        xt4Var.invoke(dce.p(Float.valueOf((i2 * f3) + f4), jk1Var));
                        return Boolean.TRUE;
                    } else if (e86.a(a2, e86.I)) {
                        xt4Var.invoke(dce.p(Float.valueOf(f4 - ((dce.n(i / 10, 1, 10) * i2) * f3)), jk1Var));
                        return Boolean.TRUE;
                    } else if (e86.a(a2, e86.J)) {
                        xt4Var.invoke(dce.p(Float.valueOf((dce.n(i / 10, 1, 10) * i2 * f3) + f4), jk1Var));
                        return Boolean.TRUE;
                    } else {
                        return Boolean.FALSE;
                    }
                }
                long a3 = rae.a(keyEvent.getKeyCode());
                if (e86.a(a3, e86.h)) {
                    xt4Var.invoke(dce.p(Float.valueOf((i2 * f3) + f4), jk1Var));
                    return Boolean.TRUE;
                } else if (e86.a(a3, e86.g)) {
                    xt4Var.invoke(dce.p(Float.valueOf(f4 - (i2 * f3)), jk1Var));
                    return Boolean.TRUE;
                } else if (e86.a(a3, e86.I)) {
                    xt4Var.invoke(dce.p(Float.valueOf((dce.n(i / 10, 1, 10) * f3) + f4), jk1Var));
                    return Boolean.TRUE;
                } else if (e86.a(a3, e86.J)) {
                    xt4Var.invoke(dce.p(Float.valueOf(f4 - (dce.n(i / 10, 1, 10) * f3)), jk1Var));
                    return Boolean.TRUE;
                } else {
                    return Boolean.FALSE;
                }
            }
        } else if (j == 1) {
            vt4 vt4Var = this.D;
            if (z) {
                long a4 = rae.a(keyEvent.getKeyCode());
                if (!e86.a(a4, e86.e) && !e86.a(a4, e86.f) && !e86.a(a4, e86.B) && !e86.a(a4, e86.C) && !e86.a(a4, e86.I) && !e86.a(a4, e86.J)) {
                    return Boolean.FALSE;
                }
                if (vt4Var != null) {
                    vt4Var.invoke();
                }
                return Boolean.TRUE;
            }
            long a5 = rae.a(keyEvent.getKeyCode());
            if (!e86.a(a5, e86.h) && !e86.a(a5, e86.g) && !e86.a(a5, e86.B) && !e86.a(a5, e86.C) && !e86.a(a5, e86.I) && !e86.a(a5, e86.J)) {
                return Boolean.FALSE;
            }
            if (vt4Var != null) {
                vt4Var.invoke();
            }
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }
}
