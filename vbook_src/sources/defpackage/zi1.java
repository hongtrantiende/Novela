package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zi1  reason: default package */
/* loaded from: classes.dex */
public class zi1 extends t0 {
    public z09 g0;
    public ku5 h0;

    @Override // defpackage.su5
    public final void O0() {
        Z1(true);
    }

    @Override // defpackage.t0
    public final boolean U1(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.t0
    public final void V1(KeyEvent keyEvent) {
        W1();
    }

    @Override // defpackage.su5
    public final void Z(kj kjVar, s09 s09Var) {
        boolean z;
        ArrayList arrayList = (ArrayList) kjVar.b;
        S1();
        if (this.R && this.V == null) {
            cx4 cx4Var = new cx4(this);
            H1(cx4Var);
            this.V = cx4Var;
        }
        int i = 0;
        if (s09Var == s09.b) {
            if (this.h0 == null) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (nye.o((ku5) arrayList.get(i2))) {
                        ku5 ku5Var = (ku5) arrayList.get(0);
                        ku5Var.i = true;
                        this.h0 = ku5Var;
                        if (this.R) {
                            this.W = "waiting";
                            Q1(ku5Var);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ku5 ku5Var2 = (ku5) arrayList.get(i3);
                if (ku5Var2.i || !ku5Var2.h || ku5Var2.d) {
                    float f = ((ucd) nye.q(this, dy1.t)).f();
                    int size3 = arrayList.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        ku5 ku5Var3 = (ku5) arrayList.get(i4);
                        long j = ku5Var3.c;
                        ku5 ku5Var4 = this.h0;
                        ku5Var4.getClass();
                        if (Math.abs(y78.e(y78.i(j, ku5Var4.c))) > f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (ku5Var3.i || z) {
                            Z1(true);
                            return;
                        }
                    }
                    return;
                }
            }
            ((ku5) arrayList.get(0)).i = true;
            if (this.R) {
                this.W = "recognized";
                ku5 ku5Var5 = this.h0;
                ku5Var5.getClass();
                P1(true, ku5Var5.c);
                W1();
            }
            this.h0 = null;
        } else if (s09Var == s09.c) {
            if (this.h0 != null) {
                int size4 = arrayList.size();
                while (true) {
                    if (i >= size4) {
                        break;
                    }
                    ku5 ku5Var6 = (ku5) arrayList.get(i);
                    if (ku5Var6.i && ku5Var6 != this.h0) {
                        Z1(true);
                        break;
                    }
                    i++;
                }
            }
            if (c16.i(this.W, "recognized")) {
                this.W = "idle";
            }
        }
    }

    public final void Z1(boolean z) {
        if (z) {
            this.h0 = null;
        } else {
            this.g0 = null;
        }
        O1(z);
        this.W = "idle";
    }

    @Override // defpackage.t0, defpackage.c19
    public final void b0(r09 r09Var, s09 s09Var, long j) {
        super.b0(r09Var, s09Var, j);
        if (s09Var == s09.b) {
            if (this.g0 == null) {
                if (ukb.f(r09Var, true, false)) {
                    z09 z09Var = (z09) r09Var.a.get(0);
                    z09Var.a();
                    this.g0 = z09Var;
                    if (this.R) {
                        this.W = "waiting";
                        R1(z09Var);
                        return;
                    }
                    return;
                }
                return;
            }
            List list = r09Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (!ie2.l((z09) list.get(i))) {
                    long N1 = N1(j);
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        z09 z09Var2 = (z09) list.get(i2);
                        if (z09Var2.c() || ie2.w(z09Var2, j, N1)) {
                            Z1(false);
                            return;
                        }
                    }
                    return;
                }
            }
            ((z09) list.get(0)).a();
            if (this.R) {
                this.W = "recognized";
                z09 z09Var3 = this.g0;
                z09Var3.getClass();
                P1(false, z09Var3.c);
                W1();
            }
            this.g0 = null;
        } else if (s09Var == s09.c) {
            if (this.g0 != null) {
                List list2 = r09Var.a;
                int size3 = list2.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size3) {
                        break;
                    }
                    z09 z09Var4 = (z09) list2.get(i3);
                    if (z09Var4.c() && z09Var4 != this.g0) {
                        Z1(false);
                        break;
                    }
                    i3++;
                }
            }
            if (c16.i(this.W, "recognized")) {
                this.W = "idle";
            }
        }
    }

    @Override // defpackage.c19
    public final void n0() {
        ga5 ga5Var;
        yu7 yu7Var = this.M;
        if (yu7Var != null && (ga5Var = this.Z) != null) {
            yu7Var.c(new ha5(ga5Var));
        }
        this.Z = null;
        Z1(false);
    }
}
