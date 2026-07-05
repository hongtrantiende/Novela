package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sh6  reason: default package */
/* loaded from: classes.dex */
public final class sh6 {
    public final sx9 a;
    public final ea4 b;
    public final tv7 c;

    public sh6(sx9 sx9Var, ea4 ea4Var) {
        this.a = sx9Var;
        this.b = ea4Var;
        long[] jArr = tz9.a;
        this.c = new tv7();
    }

    public final lu4 a(int i, Object obj, Object obj2) {
        tv7 tv7Var = this.c;
        rh6 rh6Var = (rh6) tv7Var.g(obj);
        if (rh6Var != null && rh6Var.c == i && c16.i(rh6Var.b, obj2)) {
            tu1 tu1Var = rh6Var.d;
            if (tu1Var == null) {
                tu1 tu1Var2 = new tu1(new sv4(6, rh6Var.e, rh6Var), true, 818252804);
                rh6Var.d = tu1Var2;
                return tu1Var2;
            }
            return tu1Var;
        }
        rh6 rh6Var2 = new rh6(this, i, obj, obj2);
        tv7Var.n(obj, rh6Var2);
        tu1 tu1Var3 = rh6Var2.d;
        if (tu1Var3 == null) {
            tu1 tu1Var4 = new tu1(new sv4(6, this, rh6Var2), true, 818252804);
            rh6Var2.d = tu1Var4;
            return tu1Var4;
        }
        return tu1Var3;
    }

    public final Object b(Object obj) {
        if (obj != null) {
            rh6 rh6Var = (rh6) this.c.g(obj);
            if (rh6Var != null) {
                return rh6Var.b;
            }
            th6 th6Var = (th6) this.b.invoke();
            int e = th6Var.e(obj);
            if (e != -1) {
                return th6Var.c(e);
            }
            return null;
        }
        return null;
    }
}
