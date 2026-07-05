package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: us0  reason: default package */
/* loaded from: classes.dex */
public final class us0 extends uq7 {
    public final float b;
    public final esa c;
    public final wea d;

    public us0(float f, esa esaVar, wea weaVar) {
        this.b = f;
        this.c = esaVar;
        this.d = weaVar;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new ts0(this.b, this.c, this.d);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(new rg3(this.b), "width");
        long j = this.c.a;
        c00Var.b(new zl1(j), "color");
        nx5Var.a = new zl1(j);
        c00Var.b(this.d, "shape");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        ts0 ts0Var = (ts0) mq7Var;
        float f = ts0Var.N;
        s41 s41Var = ts0Var.Q;
        float f2 = this.b;
        if (!rg3.b(f, f2)) {
            ts0Var.N = f2;
            s41Var.H1();
        }
        esa esaVar = ts0Var.O;
        esa esaVar2 = this.c;
        if (!c16.i(esaVar, esaVar2)) {
            ts0Var.O = esaVar2;
            s41Var.H1();
        }
        wea weaVar = ts0Var.P;
        wea weaVar2 = this.d;
        if (!c16.i(weaVar, weaVar2)) {
            ts0Var.P = weaVar2;
            s41Var.H1();
            ak0.t(ts0Var);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof us0) {
                us0 us0Var = (us0) obj;
                if (!rg3.b(this.b, us0Var.b) || !this.c.equals(us0Var.c) || !c16.i(this.d, us0Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode();
        return this.d.hashCode() + ((hashCode + (Float.hashCode(this.b) * 31)) * 31);
    }

    public final String toString() {
        String c = rg3.c(this.b);
        return "BorderModifierNodeElement(width=" + c + ", brush=" + this.c + ", shape=" + this.d + ")";
    }
}
