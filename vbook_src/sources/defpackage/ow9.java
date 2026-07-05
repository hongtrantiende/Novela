package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ow9  reason: default package */
/* loaded from: classes3.dex */
public final class ow9 implements m42, o82 {
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(ow9.class, Object.class, "result");
    public final m42 a;
    private volatile Object result;

    public ow9(m42 m42Var) {
        n82 n82Var = n82.a;
        this.a = m42Var;
        this.result = n82Var;
    }

    @Override // defpackage.o82
    public final o82 getCallerFrame() {
        m42 m42Var = this.a;
        if (m42Var instanceof o82) {
            return (o82) m42Var;
        }
        return null;
    }

    @Override // defpackage.m42
    public final d82 getContext() {
        return this.a.getContext();
    }

    @Override // defpackage.m42
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            n82 n82Var = n82.b;
            if (obj2 == n82Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, n82Var, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != n82Var) {
                        break;
                    }
                }
                return;
            }
            n82 n82Var2 = n82.a;
            if (obj2 == n82Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b;
                n82 n82Var3 = n82.c;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, n82Var2, n82Var3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != n82Var2) {
                        break;
                    }
                }
                this.a.resumeWith(obj);
                return;
            }
            vs.k("Already resumed");
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.a;
    }
}
