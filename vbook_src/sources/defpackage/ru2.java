package defpackage;

import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ru2  reason: default package */
/* loaded from: classes3.dex */
public final class ru2 extends uy3 implements Executor {
    public static final ru2 c = new f82();
    public static final f82 d;

    /* JADX WARN: Type inference failed for: r0v0, types: [f82, ru2] */
    static {
        iwc iwcVar = iwc.c;
        int i = ogb.a;
        if (64 >= i) {
            i = 64;
        }
        d = iwcVar.j0(gue.A(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // defpackage.f82
    public final void C(d82 d82Var, Runnable runnable) {
        d.C(d82Var, runnable);
    }

    @Override // defpackage.f82
    public final void Q(d82 d82Var, Runnable runnable) {
        d.Q(d82Var, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C(gs3.a, runnable);
    }

    @Override // defpackage.f82
    public final f82 j0(int i) {
        return iwc.c.j0(i);
    }

    @Override // defpackage.f82
    public final String toString() {
        return "Dispatchers.IO";
    }
}
