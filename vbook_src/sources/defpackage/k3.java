package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k3  reason: default package */
/* loaded from: classes.dex */
public final class k3 extends zbe {
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;
    public final AtomicReferenceFieldUpdater f;
    public final AtomicReferenceFieldUpdater g;
    public final AtomicReferenceFieldUpdater h;

    public k3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.d = atomicReferenceFieldUpdater;
        this.e = atomicReferenceFieldUpdater2;
        this.f = atomicReferenceFieldUpdater3;
        this.g = atomicReferenceFieldUpdater4;
        this.h = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.zbe
    public final void D(m3 m3Var, m3 m3Var2) {
        this.e.lazySet(m3Var, m3Var2);
    }

    @Override // defpackage.zbe
    public final void E(m3 m3Var, Thread thread) {
        this.d.lazySet(m3Var, thread);
    }

    @Override // defpackage.zbe
    public final boolean q(n3 n3Var, j3 j3Var, j3 j3Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.g;
            if (atomicReferenceFieldUpdater.compareAndSet(n3Var, j3Var, j3Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(n3Var) == j3Var);
        return false;
    }

    @Override // defpackage.zbe
    public final boolean r(n3 n3Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.h;
            if (atomicReferenceFieldUpdater.compareAndSet(n3Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(n3Var) == obj);
        return false;
    }

    @Override // defpackage.zbe
    public final boolean s(n3 n3Var, m3 m3Var, m3 m3Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f;
            if (atomicReferenceFieldUpdater.compareAndSet(n3Var, m3Var, m3Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(n3Var) == m3Var);
        return false;
    }
}
