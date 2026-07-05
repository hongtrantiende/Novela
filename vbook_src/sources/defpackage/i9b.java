package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i9b  reason: default package */
/* loaded from: classes.dex */
public final class i9b implements fz1 {
    public final l97 a;

    public i9b(l97 l97Var) {
        this.a = l97Var;
    }

    @Override // defpackage.fz1
    public final Object N(boolean z, lu4 lu4Var, n42 n42Var) {
        l9b l9bVar = (l9b) this.a.a;
        l9bVar.getClass();
        return lu4Var.invoke(new n9b(new h9b(l9bVar.k0())), n42Var);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ((l9b) this.a.a).close();
    }
}
