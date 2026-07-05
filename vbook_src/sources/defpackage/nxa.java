package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nxa  reason: default package */
/* loaded from: classes.dex */
public final class nxa implements m42, o82 {
    public final ya1 a;
    public final d82 b;

    public nxa(ya1 ya1Var, d82 d82Var) {
        this.a = ya1Var;
        this.b = d82Var;
    }

    @Override // defpackage.o82
    public final o82 getCallerFrame() {
        return this.a;
    }

    @Override // defpackage.m42
    public final d82 getContext() {
        return this.b;
    }

    @Override // defpackage.m42
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
