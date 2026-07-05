package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wd6  reason: default package */
/* loaded from: classes.dex */
public final class wd6 implements p6b {
    public tc6 a = tc6.b;
    public float b;
    public float c;
    public final /* synthetic */ be6 d;

    public wd6(be6 be6Var) {
        this.d = be6Var;
    }

    @Override // defpackage.r13
    public final float G0() {
        return this.c;
    }

    @Override // defpackage.u06
    public final boolean I0() {
        kd6 kd6Var = this.d.a.d0.d;
        if (kd6Var != kd6.d && kd6Var != kd6.b) {
            return false;
        }
        return true;
    }

    @Override // defpackage.e37
    public final c37 W0(int i, int i2, Map map, xt4 xt4Var, xt4 xt4Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            lv5.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new vd6(i, i2, map, xt4Var, this, this.d, xt4Var2);
    }

    @Override // defpackage.r13
    public final float f() {
        return this.b;
    }

    @Override // defpackage.u06
    public final tc6 getLayoutDirection() {
        return this.a;
    }

    @Override // defpackage.p6b
    public final List j0(Object obj, lu4 lu4Var) {
        be6 be6Var = this.d;
        be6Var.i();
        od6 od6Var = be6Var.a;
        kd6 kd6Var = od6Var.d0.d;
        kd6 kd6Var2 = kd6.c;
        kd6 kd6Var3 = kd6.a;
        if (kd6Var != kd6Var3 && kd6Var != kd6Var2 && kd6Var != kd6.b && kd6Var != kd6.d) {
            lv5.c("subcompose can only be used inside the measure or layout blocks");
        }
        tv7 tv7Var = be6Var.C;
        Object g = tv7Var.g(obj);
        if (g == null) {
            g = (od6) be6Var.F.l(obj);
            if (g != null) {
                ud6 ud6Var = (ud6) be6Var.f.g(g);
                if (be6Var.K <= 0) {
                    lv5.c("Check failed.");
                }
                be6Var.K--;
            } else {
                g = be6Var.o(obj);
                if (g == null) {
                    int i = be6Var.d;
                    od6 od6Var2 = new od6(2);
                    od6Var.N = true;
                    od6Var.B(i, od6Var2);
                    od6Var.N = false;
                    g = od6Var2;
                }
            }
            tv7Var.n(obj, g);
        }
        od6 od6Var3 = (od6) g;
        if (sl1.f0(be6Var.d, od6Var.p()) != od6Var3) {
            int i2 = ((gw7) ((iv7) od6Var.p()).b).i(od6Var3);
            if (i2 < be6Var.d) {
                lv5.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i3 = be6Var.d;
            if (i3 != i2) {
                be6Var.k(i2, i3);
            }
        }
        be6Var.d++;
        be6Var.n(od6Var3, obj, false, lu4Var);
        if (kd6Var != kd6Var3 && kd6Var != kd6Var2) {
            return od6Var3.m();
        }
        return od6Var3.n();
    }
}
