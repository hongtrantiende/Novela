package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wa1  reason: default package */
/* loaded from: classes3.dex */
public abstract class wa1 implements zu4 {
    public final d82 a;
    public final int b;
    public final py0 c;

    public wa1(d82 d82Var, int i, py0 py0Var) {
        this.a = d82Var;
        this.b = i;
        this.c = py0Var;
    }

    @Override // defpackage.sj4
    public Object a(tj4 tj4Var, m42 m42Var) {
        Object p = k27.p(new n0(tj4Var, this, null, 19), m42Var);
        if (p == n82.a) {
            return p;
        }
        return pvc.a;
    }

    @Override // defpackage.zu4
    public final sj4 c(d82 d82Var, int i, py0 py0Var) {
        d82 d82Var2 = this.a;
        d82 plus = d82Var.plus(d82Var2);
        py0 py0Var2 = py0.a;
        py0 py0Var3 = this.c;
        int i2 = this.b;
        if (py0Var == py0Var2) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            py0Var = py0Var3;
        }
        if (c16.i(plus, d82Var2) && i == i2 && py0Var == py0Var3) {
            return this;
        }
        return i(plus, i, py0Var);
    }

    public String g() {
        return null;
    }

    public abstract Object h(y69 y69Var, m42 m42Var);

    public abstract wa1 i(d82 d82Var, int i, py0 py0Var);

    public sj4 j() {
        return null;
    }

    public ta1 k(m82 m82Var) {
        int i = this.b;
        if (i == -3) {
            i = -2;
        }
        lu4 cv0Var = new cv0(this, null, 7);
        y69 y69Var = new y69(tc4.s(m82Var, this.a), xpe.a(i, 4, this.c));
        y69Var.r0(p82.c, y69Var, cv0Var);
        return y69Var;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String g = g();
        if (g != null) {
            arrayList.add(g);
        }
        gs3 gs3Var = gs3.a;
        d82 d82Var = this.a;
        if (d82Var != gs3Var) {
            arrayList.add("context=" + d82Var);
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        py0 py0Var = py0.a;
        py0 py0Var2 = this.c;
        if (py0Var2 != py0Var) {
            arrayList.add("onBufferOverflow=" + py0Var2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return s21.p(sb, sl1.i0(arrayList, ", ", null, null, null, 62), ']');
    }
}
