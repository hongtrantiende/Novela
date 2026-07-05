package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hk1  reason: default package */
/* loaded from: classes.dex */
public final class hk1 implements AutoCloseable, m82 {
    public final d82 a;

    public hk1(d82 d82Var) {
        d82Var.getClass();
        this.a = d82Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        k27.m(this.a, null);
    }

    @Override // defpackage.m82
    public final d82 q() {
        return this.a;
    }
}
