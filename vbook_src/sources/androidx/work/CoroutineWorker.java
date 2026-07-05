package androidx.work;

import android.content.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends lr6 {
    public final WorkerParameters e;
    public final q82 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.e = workerParameters;
        this.f = q82.c;
    }

    @Override // defpackage.lr6
    public final s51 a() {
        f82 d = d();
        y26 c = k27.c();
        d.getClass();
        return que.v(nq2.C(d, c), new r82(this, null, 0));
    }

    @Override // defpackage.lr6
    public final s51 b() {
        d82 d82Var;
        if (!c16.i(d(), q82.c)) {
            d82Var = d();
        } else {
            d82Var = this.e.e;
        }
        d82Var.getClass();
        return que.v(d82Var.plus(k27.c()), new r82(this, null, 1));
    }

    public abstract Object c(m42 m42Var);

    public f82 d() {
        return this.f;
    }
}
