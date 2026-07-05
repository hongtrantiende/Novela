package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dv4  reason: default package */
/* loaded from: classes.dex */
public abstract class dv4 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [yl4, i0, g0, java.lang.Runnable] */
    public static g0 a(ListenableFuture listenableFuture, Class cls, c10 c10Var, Executor executor) {
        int i = i0.H;
        ?? i0Var = new i0(listenableFuture, cls, c10Var);
        listenableFuture.a(i0Var, jqe.D(executor, i0Var));
        return i0Var;
    }

    public static Object b(Future future) {
        if (future.isDone()) {
            return bce.p(future);
        }
        vs.k(hma.v("Future was expected to be done: %s", future));
        return null;
    }

    public static fs5 c(Object obj) {
        if (obj == null) {
            return fs5.b;
        }
        return new fs5(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [cv4, com.google.common.util.concurrent.ListenableFuture, java.lang.Object, java.lang.Runnable] */
    public static ListenableFuture d(ListenableFuture listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        ?? obj = new Object();
        obj.D = listenableFuture;
        listenableFuture.a(obj, e73.a);
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [yl4, java.lang.Runnable, u3, t3] */
    public static t3 e(ListenableFuture listenableFuture, tu4 tu4Var, Executor executor) {
        int i = u3.G;
        ?? u3Var = new u3(listenableFuture, tu4Var);
        listenableFuture.a(u3Var, jqe.D(executor, u3Var));
        return u3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [yl4, s3, java.lang.Runnable, u3] */
    public static s3 f(ListenableFuture listenableFuture, c10 c10Var, Executor executor) {
        int i = u3.G;
        executor.getClass();
        ?? u3Var = new u3(listenableFuture, c10Var);
        listenableFuture.a(u3Var, jqe.D(executor, u3Var));
        return u3Var;
    }
}
