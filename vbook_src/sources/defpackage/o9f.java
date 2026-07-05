package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o9f  reason: default package */
/* loaded from: classes.dex */
public final class o9f extends s9e {
    public final i9f f;
    public final xk9 g;

    public o9f(i9f i9fVar, xk9 xk9Var) {
        this.f = i9fVar;
        this.g = xk9Var;
    }

    public static o9f D(i9f i9fVar, xk9 xk9Var) {
        if (i9fVar.a == ((hlf) xk9Var.b).a.length) {
            return new o9f(i9fVar, xk9Var);
        }
        hfd.j("Key size mismatch");
        return null;
    }

    @Override // defpackage.s9e
    public final bfe B() {
        return this.f;
    }

    @Override // defpackage.s9e
    public final Integer C() {
        return null;
    }
}
