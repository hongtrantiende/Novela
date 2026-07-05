package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pa6  reason: default package */
/* loaded from: classes3.dex */
public final class pa6 implements b82 {
    public static final lh9 b = new lh9(27);
    public final d82 a;

    public pa6(d82 d82Var) {
        d82Var.getClass();
        this.a = d82Var;
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
        return b;
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
