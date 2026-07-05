package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ayc  reason: default package */
/* loaded from: classes.dex */
public final class ayc implements b82 {
    public final ayc a;
    public final gh2 b;

    public ayc(ayc aycVar, gh2 gh2Var) {
        this.a = aycVar;
        this.b = gh2Var;
    }

    public final void a(gh2 gh2Var) {
        if (this.b != gh2Var) {
            ayc aycVar = this.a;
            if (aycVar != null) {
                aycVar.a(gh2Var);
                return;
            }
            return;
        }
        vs.k("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
    }

    @Override // defpackage.d82
    public final Object fold(Object obj, lu4 lu4Var) {
        return lu4Var.invoke(obj, this);
    }

    @Override // defpackage.d82
    public final /* bridge */ b82 get(c82 c82Var) {
        return nq2.x(this, c82Var);
    }

    @Override // defpackage.b82
    public final c82 getKey() {
        return zj1.H;
    }

    @Override // defpackage.d82
    public final /* bridge */ d82 minusKey(c82 c82Var) {
        return nq2.B(this, c82Var);
    }

    @Override // defpackage.d82
    public final /* bridge */ d82 plus(d82 d82Var) {
        return nq2.C(this, d82Var);
    }
}
