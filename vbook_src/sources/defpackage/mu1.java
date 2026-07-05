package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mu1  reason: default package */
/* loaded from: classes.dex */
public final class mu1 {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;

    public mu1(nu1 nu1Var) {
        this.a = sl1.E0(nu1Var.a);
        this.b = sl1.E0(nu1Var.b);
        this.c = sl1.E0(nu1Var.c);
        ArrayList arrayList = new ArrayList();
        for (yk8 yk8Var : (List) nu1Var.f.getValue()) {
            arrayList.add(new ve(yk8Var, 25));
        }
        this.d = arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (wq2 wq2Var : (List) nu1Var.g.getValue()) {
            arrayList2.add(new lu1(wq2Var, 1));
        }
        this.e = arrayList2;
    }

    public final void a(jl jlVar, gi1 gi1Var) {
        this.c.add(new yk8(jlVar, gi1Var));
    }

    public final void b(yo yoVar, gi1 gi1Var) {
        this.b.add(new yk8(yoVar, gi1Var));
    }

    public final void c(rb4 rb4Var, gi1 gi1Var) {
        this.d.add(new t7(22, rb4Var, gi1Var));
    }

    public final nu1 d() {
        return new nu1(que.w(this.a), que.w(this.b), que.w(this.c), que.w(this.d), que.w(this.e));
    }

    public mu1() {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
    }
}
