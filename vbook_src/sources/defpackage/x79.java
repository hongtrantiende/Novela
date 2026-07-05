package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x79  reason: default package */
/* loaded from: classes.dex */
public final class x79 implements fjc {
    public final fx9 a;
    public final fx9 b;
    public final n73 c = new n73();
    public final AtomicReference d = new AtomicReference(w79.a);

    public x79(fx9 fx9Var) {
        this.a = fx9Var;
        this.b = fx9Var;
    }

    @Override // defpackage.fjc
    public final void a(long j, int i, int i2, int i3, ejc ejcVar) {
        h().a(j, i, i2, i3, ejcVar);
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == w79.b) {
            this.b.F(false);
            atomicReference.set(w79.c);
        }
    }

    @Override // defpackage.fjc
    public final void b(km8 km8Var, int i, int i2) {
        h().b(km8Var, i, i2);
    }

    @Override // defpackage.fjc
    public final int c(eg2 eg2Var, int i, boolean z) {
        return h().c(eg2Var, i, z);
    }

    @Override // defpackage.fjc
    public final void e(int i, km8 km8Var) {
        h().e(i, km8Var);
    }

    @Override // defpackage.fjc
    public final int f(eg2 eg2Var, int i, boolean z) {
        return h().f(eg2Var, i, z);
    }

    @Override // defpackage.fjc
    public final void g(vq4 vq4Var) {
        this.a.g(vq4Var);
    }

    public final fjc h() {
        if (this.d.get() == w79.c) {
            return this.c;
        }
        return this.b;
    }

    @Override // defpackage.fjc
    public final void d(long j) {
    }
}
