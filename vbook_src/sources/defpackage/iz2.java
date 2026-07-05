package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iz2  reason: default package */
/* loaded from: classes.dex */
public final class iz2 implements d82 {
    public final d82 a;

    public iz2(d82 d82Var) {
        this.a = d82Var;
    }

    public final boolean equals(Object obj) {
        return c16.i(this.a, obj);
    }

    @Override // defpackage.d82
    public final Object fold(Object obj, lu4 lu4Var) {
        return this.a.fold(obj, lu4Var);
    }

    @Override // defpackage.d82
    public final b82 get(c82 c82Var) {
        return this.a.get(c82Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.d82
    public final d82 minusKey(c82 c82Var) {
        f82 f82Var;
        d82 minusKey = this.a.minusKey(c82Var);
        int i = j2d.b;
        abf abfVar = abf.d;
        b82 b82Var = get(abfVar);
        f82 f82Var2 = null;
        if (b82Var instanceof f82) {
            f82Var = (f82) b82Var;
        } else {
            f82Var = null;
        }
        b82 b82Var2 = minusKey.get(abfVar);
        if (b82Var2 instanceof f82) {
            f82Var2 = (f82) b82Var2;
        }
        if ((f82Var instanceof jz2) && f82Var != f82Var2) {
            ((jz2) f82Var).d = 0;
        }
        return new iz2(minusKey);
    }

    @Override // defpackage.d82
    public final d82 plus(d82 d82Var) {
        f82 f82Var;
        d82 plus = this.a.plus(d82Var);
        int i = j2d.b;
        abf abfVar = abf.d;
        b82 b82Var = get(abfVar);
        f82 f82Var2 = null;
        if (b82Var instanceof f82) {
            f82Var = (f82) b82Var;
        } else {
            f82Var = null;
        }
        b82 b82Var2 = plus.get(abfVar);
        if (b82Var2 instanceof f82) {
            f82Var2 = (f82) b82Var2;
        }
        if ((f82Var instanceof jz2) && f82Var != f82Var2) {
            ((jz2) f82Var).d = 0;
        }
        return new iz2(plus);
    }

    public final String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.a + ")";
    }
}
