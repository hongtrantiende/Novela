package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: za1  reason: default package */
/* loaded from: classes3.dex */
public abstract class za1 extends wa1 {
    public final sj4 d;

    public za1(sj4 sj4Var, d82 d82Var, int i, py0 py0Var) {
        super(d82Var, i, py0Var);
        this.d = sj4Var;
    }

    @Override // defpackage.wa1, defpackage.sj4
    public final Object a(tj4 tj4Var, m42 m42Var) {
        d82 q;
        int i = this.b;
        n82 n82Var = n82.a;
        if (i == -3) {
            d82 context = m42Var.getContext();
            Boolean bool = Boolean.FALSE;
            tv1 tv1Var = new tv1(26);
            d82 d82Var = this.a;
            if (!((Boolean) d82Var.fold(bool, tv1Var)).booleanValue()) {
                q = context.plus(d82Var);
            } else {
                q = tc4.q(context, d82Var, false);
            }
            if (c16.i(q, context)) {
                Object l = l(tj4Var, m42Var);
                if (l == n82Var) {
                    return l;
                }
            } else {
                abf abfVar = abf.d;
                if (c16.i(q.get(abfVar), context.get(abfVar))) {
                    d82 context2 = m42Var.getContext();
                    if (!(tj4Var instanceof x8a) && !(tj4Var instanceof d48)) {
                        tj4Var = new nr(tj4Var, context2);
                    }
                    Object t = r1d.t(q, tj4Var, a7c.b(q), new cv0(this, null, 8), m42Var);
                    if (t == n82Var) {
                        return t;
                    }
                }
            }
            return pvc.a;
        }
        Object a = super.a(tj4Var, m42Var);
        if (a == n82Var) {
            return a;
        }
        return pvc.a;
    }

    @Override // defpackage.wa1
    public final Object h(y69 y69Var, m42 m42Var) {
        Object l = l(new x8a(y69Var), m42Var);
        if (l == n82.a) {
            return l;
        }
        return pvc.a;
    }

    public abstract Object l(tj4 tj4Var, m42 m42Var);

    @Override // defpackage.wa1
    public final String toString() {
        return this.d + " -> " + super.toString();
    }
}
