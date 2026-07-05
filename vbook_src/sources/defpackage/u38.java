package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u38  reason: default package */
/* loaded from: classes3.dex */
public final class u38 extends c1 implements w26 {
    public static final u38 b = new c1(r0f.I);

    @Override // defpackage.w26
    public final xg1 attachChild(ah1 ah1Var) {
        return w38.a;
    }

    @Override // defpackage.w26
    public final CancellationException getCancellationException() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.w26
    public final b9a getChildren() {
        return qs3.a;
    }

    @Override // defpackage.w26
    public final kb3 invokeOnCompletion(xt4 xt4Var) {
        return w38.a;
    }

    @Override // defpackage.w26
    public final boolean isActive() {
        return true;
    }

    @Override // defpackage.w26
    public final boolean isCancelled() {
        return false;
    }

    @Override // defpackage.w26
    public final Object join(m42 m42Var) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.w26
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.w26
    public final kb3 invokeOnCompletion(boolean z, boolean z2, xt4 xt4Var) {
        return w38.a;
    }

    @Override // defpackage.w26
    public final void cancel(CancellationException cancellationException) {
    }
}
