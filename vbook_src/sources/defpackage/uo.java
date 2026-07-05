package defpackage;

import android.view.Choreographer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uo  reason: default package */
/* loaded from: classes.dex */
public final class uo implements Choreographer.FrameCallback {
    public final /* synthetic */ f61 a;
    public final /* synthetic */ xt4 b;

    public uo(f61 f61Var, vo voVar, xt4 xt4Var) {
        this.a = f61Var;
        this.b = xt4Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object gs9Var;
        try {
            gs9Var = this.b.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        this.a.resumeWith(gs9Var);
    }
}
