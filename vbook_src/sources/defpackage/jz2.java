package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jz2  reason: default package */
/* loaded from: classes.dex */
public final class jz2 extends f82 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(jz2.class, "d");
    public final f82 c;
    public volatile /* synthetic */ int d = 1;

    public jz2(f82 f82Var) {
        this.c = f82Var;
    }

    @Override // defpackage.f82
    public final void C(d82 d82Var, Runnable runnable) {
        y0().C(d82Var, runnable);
    }

    @Override // defpackage.f82
    public final void Q(d82 d82Var, Runnable runnable) {
        y0().Q(d82Var, runnable);
    }

    @Override // defpackage.f82
    public final boolean V(d82 d82Var) {
        return y0().V(d82Var);
    }

    @Override // defpackage.f82
    public final f82 j0(int i) {
        return y0().j0(i);
    }

    @Override // defpackage.f82
    public final String toString() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.c + ")";
    }

    public final f82 y0() {
        if (e.get(this) == 1) {
            return ab3.b;
        }
        return this.c;
    }
}
