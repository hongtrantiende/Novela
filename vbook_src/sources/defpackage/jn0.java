package defpackage;

import java.util.concurrent.locks.LockSupport;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jn0  reason: default package */
/* loaded from: classes3.dex */
public final class jn0 extends b1 {
    public final lx3 C;
    public final Thread f;

    public jn0(d82 d82Var, Thread thread, lx3 lx3Var) {
        super(d82Var, true);
        this.f = thread;
        this.C = lx3Var;
    }

    @Override // defpackage.l36
    public final void l(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f;
        if (!c16.i(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
