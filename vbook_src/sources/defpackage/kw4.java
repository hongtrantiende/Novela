package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kw4  reason: default package */
/* loaded from: classes.dex */
public abstract class kw4 implements Cloneable {
    public final qw4 a;
    public qw4 b;

    public kw4(qw4 qw4Var) {
        this.a = qw4Var;
        if (!qw4Var.h()) {
            this.b = qw4Var.j();
        } else {
            vs.m("Default instance must be immutable.");
            throw null;
        }
    }

    public final qw4 a() {
        qw4 b = b();
        b.getClass();
        if (qw4.g(b, true)) {
            return b;
        }
        throw new nvc();
    }

    public final qw4 b() {
        boolean h = this.b.h();
        qw4 qw4Var = this.b;
        if (!h) {
            return qw4Var;
        }
        qw4Var.getClass();
        z89 z89Var = z89.c;
        z89Var.getClass();
        z89Var.a(qw4Var.getClass()).b(qw4Var);
        qw4Var.i();
        return this.b;
    }

    public final void c() {
        if (!this.b.h()) {
            qw4 j = this.a.j();
            qw4 qw4Var = this.b;
            z89 z89Var = z89.c;
            z89Var.getClass();
            z89Var.a(j.getClass()).a(j, qw4Var);
            this.b = j;
        }
    }

    public final Object clone() {
        kw4 kw4Var = (kw4) this.a.d(5);
        kw4Var.b = b();
        return kw4Var;
    }
}
