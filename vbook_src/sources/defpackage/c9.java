package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c9  reason: default package */
/* loaded from: classes.dex */
public final class c9 extends dpe {
    public final AtomicReferenceFieldUpdater d;
    public final AtomicIntegerFieldUpdater e;

    public c9(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.d = atomicReferenceFieldUpdater;
        this.e = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.dpe
    public final void m(lo1 lo1Var, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.d;
            if (atomicReferenceFieldUpdater.compareAndSet(lo1Var, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(lo1Var) == null);
    }

    @Override // defpackage.dpe
    public final int n(lo1 lo1Var) {
        return this.e.decrementAndGet(lo1Var);
    }
}
