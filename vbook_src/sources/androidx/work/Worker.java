package androidx.work;

import android.content.Context;
import java.util.concurrent.ExecutorService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public abstract class Worker extends lr6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // defpackage.lr6
    public final s51 a() {
        ExecutorService executorService = this.b.d;
        executorService.getClass();
        return jbe.S(new iu1(17, executorService, new u6d(this, 12)));
    }

    @Override // defpackage.lr6
    public final s51 b() {
        ExecutorService executorService = this.b.d;
        executorService.getClass();
        return jbe.S(new iu1(17, executorService, new imb(this, 22)));
    }

    public abstract jr6 c();
}
