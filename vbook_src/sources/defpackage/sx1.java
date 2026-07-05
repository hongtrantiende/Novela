package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sx1  reason: default package */
/* loaded from: classes.dex */
public final class sx1 implements qe8, b82 {
    public static final ox9 b = new ox9(19);
    public final rv4 a;

    public sx1(rv4 rv4Var) {
        this.a = rv4Var;
    }

    @Override // defpackage.qe8
    public final List c(Integer num) {
        return this.a.I();
    }

    @Override // defpackage.qe8
    public final boolean e() {
        return this.a.C;
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
