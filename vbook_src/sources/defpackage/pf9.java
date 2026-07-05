package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pf9  reason: default package */
/* loaded from: classes3.dex */
public abstract class pf9 {
    public final xt4 a;

    public pf9(xt4 xt4Var) {
        xt4Var.getClass();
        this.a = xt4Var;
    }

    public abstract void a(pl4 pl4Var);

    public abstract tf9 b(xt4 xt4Var);

    public final List c() {
        return (List) b(new py3(this, 0)).b;
    }

    public final Object d() {
        Object e = e();
        if (e != null) {
            return e;
        }
        throw new NullPointerException("ResultSet returned null for " + this);
    }

    public final Object e() {
        return b(new py3(this, 1)).b;
    }

    public abstract void f(pl4 pl4Var);
}
