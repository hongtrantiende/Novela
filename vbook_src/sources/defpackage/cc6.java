package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cc6  reason: default package */
/* loaded from: classes.dex */
public final class cc6 implements bn9, g82 {
    public final d82 a;
    public final lu4 b;
    public final m41 c;
    public w26 d;

    public cc6(d82 d82Var, lu4 lu4Var) {
        this.a = d82Var;
        this.b = lu4Var;
        this.c = k27.a(d82Var.plus(this));
    }

    @Override // defpackage.g82
    public final void S(d82 d82Var, Throwable th) {
        sx1 sx1Var = (sx1) d82Var.get(sx1.b);
        if (sx1Var != null) {
            zxe.x(th, new t7(23, sx1Var, this));
        }
        g82 g82Var = (g82) this.a.get(p40.d);
        if (g82Var != null) {
            g82Var.S(d82Var, th);
            return;
        }
        throw th;
    }

    @Override // defpackage.bn9
    public final void a() {
        w26 w26Var = this.d;
        if (w26Var != null) {
            w26Var.cancel(new sq4(1));
        }
        this.d = null;
    }

    @Override // defpackage.bn9
    public final void b() {
        w26 w26Var = this.d;
        if (w26Var != null) {
            w26Var.cancel(new sq4(1));
        }
        this.d = null;
    }

    @Override // defpackage.bn9
    public final void c() {
        w26 w26Var = this.d;
        if (w26Var != null) {
            k27.o(w26Var, "Old job was still running!", null);
        }
        this.d = z87.v(this.c, null, null, this.b, 3);
    }

    @Override // defpackage.d82
    public final Object fold(Object obj, lu4 lu4Var) {
        return lu4Var.invoke(obj, this);
    }

    @Override // defpackage.d82
    public final b82 get(c82 c82Var) {
        return nq2.x(this, c82Var);
    }

    @Override // defpackage.b82
    public final c82 getKey() {
        return p40.d;
    }

    @Override // defpackage.d82
    public final d82 minusKey(c82 c82Var) {
        return nq2.B(this, c82Var);
    }

    @Override // defpackage.d82
    public final d82 plus(d82 d82Var) {
        return nq2.C(this, d82Var);
    }
}
