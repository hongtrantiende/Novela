package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m1  reason: default package */
/* loaded from: classes.dex */
public final class m1 extends lbe {
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;
    public final AtomicReferenceFieldUpdater f;
    public final AtomicReferenceFieldUpdater g;
    public final AtomicReferenceFieldUpdater h;

    public m1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.d = atomicReferenceFieldUpdater;
        this.e = atomicReferenceFieldUpdater2;
        this.f = atomicReferenceFieldUpdater3;
        this.g = atomicReferenceFieldUpdater4;
        this.h = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.lbe
    public final boolean b(x1 x1Var, l1 l1Var, l1 l1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.g;
            if (atomicReferenceFieldUpdater.compareAndSet(x1Var, l1Var, l1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(x1Var) == l1Var);
        return false;
    }

    @Override // defpackage.lbe
    public final boolean c(x1 x1Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.h;
            if (atomicReferenceFieldUpdater.compareAndSet(x1Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(x1Var) == obj);
        return false;
    }

    @Override // defpackage.lbe
    public final boolean d(x1 x1Var, w1 w1Var, w1 w1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f;
            if (atomicReferenceFieldUpdater.compareAndSet(x1Var, w1Var, w1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(x1Var) == w1Var);
        return false;
    }

    @Override // defpackage.lbe
    public final l1 l(x1 x1Var) {
        return (l1) this.g.getAndSet(x1Var, l1.d);
    }

    @Override // defpackage.lbe
    public final w1 m(x1 x1Var) {
        return (w1) this.f.getAndSet(x1Var, w1.c);
    }

    @Override // defpackage.lbe
    public final void r(w1 w1Var, w1 w1Var2) {
        this.e.lazySet(w1Var, w1Var2);
    }

    @Override // defpackage.lbe
    public final void s(w1 w1Var, Thread thread) {
        this.d.lazySet(w1Var, thread);
    }
}
