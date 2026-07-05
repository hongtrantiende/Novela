package com.google.android.recaptcha.internal;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class zzbw implements gz2 {
    private final /* synthetic */ at1 zza;

    public zzbw(at1 at1Var) {
        this.zza = at1Var;
    }

    @Override // defpackage.w26
    public final xg1 attachChild(ah1 ah1Var) {
        return this.zza.attachChild(ah1Var);
    }

    @Override // defpackage.gz2
    public final Object await(m42 m42Var) {
        return ((bt1) this.zza).r(m42Var);
    }

    @d23
    public final /* synthetic */ boolean cancel(Throwable th) {
        Throwable x26Var;
        l36 l36Var = (l36) this.zza;
        if (th != null) {
            l36Var.getClass();
            x26Var = l36.f0(l36Var, th);
        } else {
            x26Var = new x26(l36Var, l36Var.v(), null);
        }
        l36Var.t(x26Var);
        return true;
    }

    @Override // defpackage.d82
    public final Object fold(Object obj, lu4 lu4Var) {
        l36 l36Var = (l36) this.zza;
        l36Var.getClass();
        lu4Var.getClass();
        return lu4Var.invoke(obj, l36Var);
    }

    @Override // defpackage.d82
    public final b82 get(c82 c82Var) {
        l36 l36Var = (l36) this.zza;
        l36Var.getClass();
        return nq2.x(l36Var, c82Var);
    }

    @Override // defpackage.w26
    public final CancellationException getCancellationException() {
        return this.zza.getCancellationException();
    }

    @Override // defpackage.w26
    public final b9a getChildren() {
        return this.zza.getChildren();
    }

    @Override // defpackage.gz2
    public final Object getCompleted() {
        return ((bt1) this.zza).A();
    }

    @Override // defpackage.gz2
    public final Throwable getCompletionExceptionOrNull() {
        return ((l36) this.zza).getCompletionExceptionOrNull();
    }

    @Override // defpackage.b82
    public final c82 getKey() {
        this.zza.getClass();
        return r0f.I;
    }

    public final t5a getOnAwait() {
        bt1 bt1Var = (bt1) this.zza;
        bt1Var.getClass();
        i36 i36Var = i36.a;
        jsc.u(3, i36Var);
        j36 j36Var = j36.a;
        jsc.u(3, j36Var);
        return new oaa(bt1Var, i36Var, j36Var, null, 24);
    }

    public final s5a getOnJoin() {
        l36 l36Var = (l36) this.zza;
        l36Var.getClass();
        k36 k36Var = k36.a;
        jsc.u(3, k36Var);
        return new jf8(l36Var, k36Var);
    }

    public final w26 getParent() {
        xg1 H = ((l36) this.zza).H();
        if (H != null) {
            return H.getParent();
        }
        return null;
    }

    @Override // defpackage.w26
    public final kb3 invokeOnCompletion(boolean z, boolean z2, xt4 xt4Var) {
        return ((l36) this.zza).invokeOnCompletion(z, z2, xt4Var);
    }

    @Override // defpackage.w26
    public final boolean isActive() {
        return this.zza.isActive();
    }

    @Override // defpackage.w26
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    public final boolean isCompleted() {
        return ((l36) this.zza).N();
    }

    @Override // defpackage.w26
    public final Object join(m42 m42Var) {
        return this.zza.join(m42Var);
    }

    @Override // defpackage.d82
    public final d82 minusKey(c82 c82Var) {
        l36 l36Var = (l36) this.zza;
        l36Var.getClass();
        return nq2.B(l36Var, c82Var);
    }

    @Override // defpackage.d82
    public final d82 plus(d82 d82Var) {
        return this.zza.plus(d82Var);
    }

    @Override // defpackage.w26
    public final boolean start() {
        return this.zza.start();
    }

    @d23
    public final w26 plus(w26 w26Var) {
        this.zza.getClass();
        return w26Var;
    }

    @Override // defpackage.w26
    public final kb3 invokeOnCompletion(xt4 xt4Var) {
        return this.zza.invokeOnCompletion(xt4Var);
    }

    @Override // defpackage.w26
    public final void cancel(CancellationException cancellationException) {
        this.zza.cancel(cancellationException);
    }

    @d23
    public final /* synthetic */ void cancel() {
        at1 at1Var = this.zza;
        at1Var.getClass();
        ((l36) at1Var).cancel(null);
    }
}
