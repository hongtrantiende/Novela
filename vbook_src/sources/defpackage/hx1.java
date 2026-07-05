package defpackage;

import java.io.IOException;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hx1  reason: default package */
/* loaded from: classes.dex */
public final class hx1 implements k67, dl3 {
    public final Object a;
    public cl3 b;
    public cl3 c;
    public final /* synthetic */ jx1 d;

    public hx1(jx1 jx1Var, Object obj) {
        this.d = jx1Var;
        this.b = jx1Var.a(null);
        this.c = new cl3(jx1Var.d.c, 0, null);
        this.a = obj;
    }

    @Override // defpackage.k67
    public final void G(int i, e67 e67Var, cs6 cs6Var, h57 h57Var, int i2) {
        if (a(i, e67Var)) {
            cl3 cl3Var = this.b;
            h57 b = b(h57Var, e67Var);
            cl3Var.getClass();
            cl3Var.a(new g67(cl3Var, cs6Var, b, i2));
        }
    }

    public final boolean a(int i, e67 e67Var) {
        e67 e67Var2;
        Object obj = this.a;
        jx1 jx1Var = this.d;
        if (e67Var != null) {
            e67Var2 = jx1Var.t(obj, e67Var);
            if (e67Var2 == null) {
                return false;
            }
        } else {
            e67Var2 = null;
        }
        int v = jx1Var.v(i, obj);
        cl3 cl3Var = this.b;
        if (cl3Var.a != v || !Objects.equals(cl3Var.b, e67Var2)) {
            this.b = new cl3(jx1Var.c.c, v, e67Var2);
        }
        cl3 cl3Var2 = this.c;
        if (cl3Var2.a != v || !Objects.equals(cl3Var2.b, e67Var2)) {
            this.c = new cl3(jx1Var.d.c, v, e67Var2);
            return true;
        }
        return true;
    }

    public final h57 b(h57 h57Var, e67 e67Var) {
        long j = h57Var.f;
        jx1 jx1Var = this.d;
        Object obj = this.a;
        long u = jx1Var.u(obj, j);
        long j2 = h57Var.g;
        long u2 = jx1Var.u(obj, j2);
        if (u == j && u2 == j2) {
            return h57Var;
        }
        return new h57(h57Var.a, h57Var.b, h57Var.c, h57Var.d, h57Var.e, u, u2);
    }

    @Override // defpackage.k67
    public final void d(int i, e67 e67Var, h57 h57Var) {
        if (a(i, e67Var)) {
            cl3 cl3Var = this.b;
            h57 b = b(h57Var, e67Var);
            cl3Var.getClass();
            cl3Var.a(new iu1(8, cl3Var, b));
        }
    }

    @Override // defpackage.k67
    public final void e(int i, e67 e67Var, h57 h57Var) {
        if (a(i, e67Var)) {
            cl3 cl3Var = this.b;
            h57 b = b(h57Var, e67Var);
            e67 e67Var2 = cl3Var.b;
            e67Var2.getClass();
            cl3Var.a(new ua2(5, cl3Var, e67Var2, b));
        }
    }

    @Override // defpackage.k67
    public final void j(int i, e67 e67Var, cs6 cs6Var, h57 h57Var) {
        if (a(i, e67Var)) {
            cl3 cl3Var = this.b;
            h57 b = b(h57Var, e67Var);
            cl3Var.getClass();
            cl3Var.a(new h67(cl3Var, cs6Var, b, 1));
        }
    }

    @Override // defpackage.k67
    public final void m(int i, e67 e67Var, cs6 cs6Var, h57 h57Var) {
        if (a(i, e67Var)) {
            cl3 cl3Var = this.b;
            h57 b = b(h57Var, e67Var);
            cl3Var.getClass();
            cl3Var.a(new h67(cl3Var, cs6Var, b, 0));
        }
    }

    @Override // defpackage.k67
    public final void o(int i, e67 e67Var, cs6 cs6Var, h57 h57Var, IOException iOException, boolean z) {
        if (a(i, e67Var)) {
            cl3 cl3Var = this.b;
            h57 b = b(h57Var, e67Var);
            cl3Var.getClass();
            cl3Var.a(new i67(cl3Var, cs6Var, b, iOException, z));
        }
    }
}
