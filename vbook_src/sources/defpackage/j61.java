package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j61  reason: default package */
/* loaded from: classes.dex */
public final class j61 implements b82, c82 {
    public static final hq7 b = new Object();
    public static final j61 c = new j61(1);
    public final /* synthetic */ int a;

    public /* synthetic */ j61(int i) {
        this.a = i;
    }

    @Override // defpackage.d82
    public final Object fold(Object obj, lu4 lu4Var) {
        switch (this.a) {
            case 0:
                return lu4Var.invoke(obj, this);
            default:
                return lu4Var.invoke(obj, this);
        }
    }

    @Override // defpackage.d82
    public final /* bridge */ b82 get(c82 c82Var) {
        switch (this.a) {
            case 0:
                return nq2.x(this, c82Var);
            default:
                return nq2.x(this, c82Var);
        }
    }

    @Override // defpackage.b82
    public final c82 getKey() {
        switch (this.a) {
            case 0:
                return b;
            default:
                return this;
        }
    }

    @Override // defpackage.d82
    public final /* bridge */ d82 minusKey(c82 c82Var) {
        switch (this.a) {
            case 0:
                return nq2.B(this, c82Var);
            default:
                return nq2.B(this, c82Var);
        }
    }

    @Override // defpackage.d82
    public final /* bridge */ d82 plus(d82 d82Var) {
        switch (this.a) {
            case 0:
                return nq2.C(this, d82Var);
            default:
                return nq2.C(this, d82Var);
        }
    }
}
