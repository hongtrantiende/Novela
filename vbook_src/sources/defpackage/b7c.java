package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b7c  reason: default package */
/* loaded from: classes3.dex */
public final class b7c implements z6c {
    public final Object a;
    public final ThreadLocal b;
    public final d7c c;

    public b7c(x19 x19Var, ThreadLocal threadLocal) {
        this.a = x19Var;
        this.b = threadLocal;
        this.c = new d7c(threadLocal);
    }

    @Override // defpackage.z6c
    public final void N0(Object obj) {
        this.b.set(obj);
    }

    @Override // defpackage.d82
    public final Object fold(Object obj, lu4 lu4Var) {
        return lu4Var.invoke(obj, this);
    }

    @Override // defpackage.d82
    public final b82 get(c82 c82Var) {
        if (this.c.equals(c82Var)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.b82
    public final c82 getKey() {
        return this.c;
    }

    @Override // defpackage.d82
    public final d82 minusKey(c82 c82Var) {
        if (this.c.equals(c82Var)) {
            return gs3.a;
        }
        return this;
    }

    @Override // defpackage.z6c
    public final Object p0() {
        ThreadLocal threadLocal = this.b;
        Object obj = threadLocal.get();
        threadLocal.set(this.a);
        return obj;
    }

    @Override // defpackage.d82
    public final d82 plus(d82 d82Var) {
        return nq2.C(this, d82Var);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.a + ", threadLocal = " + this.b + ')';
    }
}
