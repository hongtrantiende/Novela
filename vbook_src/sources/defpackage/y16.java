package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y16  reason: default package */
/* loaded from: classes3.dex */
public final class y16 extends b36 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater E = AtomicIntegerFieldUpdater.newUpdater(y16.class, "_invoked$volatile");
    public final xt4 D;
    private volatile /* synthetic */ int _invoked$volatile;

    public y16(xt4 xt4Var) {
        this.D = xt4Var;
    }

    @Override // defpackage.b36
    public final boolean q() {
        return true;
    }

    @Override // defpackage.b36
    public final void r(Throwable th) {
        if (E.compareAndSet(this, 0, 1)) {
            this.D.invoke(th);
        }
    }
}
