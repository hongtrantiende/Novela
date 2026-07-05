package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z9b  reason: default package */
/* loaded from: classes3.dex */
public final class z9b extends qv8 {
    public int C;
    public final List b;
    public final y9b c;
    public Object d;
    public final m42[] e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9b(Object obj, Object obj2, List list) {
        super(obj2);
        obj.getClass();
        obj2.getClass();
        list.getClass();
        this.b = list;
        this.c = new y9b(this);
        this.d = obj;
        this.e = new m42[list.size()];
        this.f = -1;
    }

    @Override // defpackage.qv8
    public final Object a(Object obj, n42 n42Var) {
        this.C = 0;
        if (this.b.size() == 0) {
            return obj;
        }
        obj.getClass();
        this.d = obj;
        if (this.f < 0) {
            return c(n42Var);
        }
        vs.k("Already started");
        return null;
    }

    @Override // defpackage.qv8
    public final Object b() {
        return this.d;
    }

    @Override // defpackage.qv8
    public final Object c(m42 m42Var) {
        Object obj;
        int i = this.C;
        int size = this.b.size();
        n82 n82Var = n82.a;
        if (i == size) {
            obj = this.d;
        } else {
            m42Var.getClass();
            int i2 = this.f + 1;
            this.f = i2;
            m42[] m42VarArr = this.e;
            m42VarArr[i2] = m42Var;
            if (e(true)) {
                int i3 = this.f;
                if (i3 >= 0) {
                    this.f = i3 - 1;
                    m42VarArr[i3] = null;
                    obj = this.d;
                } else {
                    vs.k("No more continuations to resume");
                    return null;
                }
            } else {
                obj = n82Var;
            }
        }
        if (obj == n82Var) {
            m42Var.getClass();
        }
        return obj;
    }

    @Override // defpackage.qv8
    public final Object d(m42 m42Var, Object obj) {
        obj.getClass();
        this.d = obj;
        return c(m42Var);
    }

    public final boolean e(boolean z) {
        mu4 mu4Var;
        Object obj;
        y9b y9bVar;
        do {
            int i = this.C;
            List list = this.b;
            if (i == list.size()) {
                if (!z) {
                    f(this.d);
                    return false;
                }
                return true;
            }
            this.C = i + 1;
            mu4Var = (mu4) list.get(i);
            try {
                obj = this.d;
                y9bVar = this.c;
                mu4Var.getClass();
                obj.getClass();
                y9bVar.getClass();
                jsc.u(3, mu4Var);
            } catch (Throwable th) {
                f(new gs9(th));
                return false;
            }
        } while (mu4Var.c(this, obj, y9bVar) != n82.a);
        return false;
    }

    public final void f(Object obj) {
        int i = this.f;
        if (i >= 0) {
            m42[] m42VarArr = this.e;
            m42 m42Var = m42VarArr[i];
            m42Var.getClass();
            int i2 = this.f;
            this.f = i2 - 1;
            m42VarArr[i2] = null;
            o42 o42Var = (o42) m42Var.getContext().get(abf.d);
            if (o42Var instanceof f82) {
                if (((f82) o42Var).V(m42Var.getContext())) {
                    m42Var = w92.t(m42Var);
                }
            } else {
                m42Var = w92.t(m42Var);
            }
            Throwable a = hs9.a(obj);
            if (a == null) {
                m42Var.resumeWith(obj);
                return;
            }
            try {
                a.getCause();
            } catch (Throwable unused) {
            }
            m42Var.resumeWith(new gs9(a));
            return;
        }
        vs.k("No more continuations to resume");
    }

    @Override // defpackage.m82
    public final d82 q() {
        return this.c.getContext();
    }
}
