package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ko1  reason: default package */
/* loaded from: classes.dex */
public final class ko1 extends o06 {
    public final Object C;
    public final Executor c;
    public final /* synthetic */ lo1 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ lo1 f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ko1(lo1 lo1Var, Callable callable) {
        this(lo1Var, e73.a);
        this.e = 1;
        this.f = lo1Var;
        this.C = callable;
    }

    @Override // defpackage.o06
    public final void a(Throwable th) {
        lo1 lo1Var = this.d;
        lo1Var.J = null;
        if (th instanceof ExecutionException) {
            lo1Var.m(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            lo1Var.cancel(false);
        } else {
            lo1Var.m(th);
        }
    }

    @Override // defpackage.o06
    public final void b(Object obj) {
        this.d.J = null;
        int i = this.e;
        lo1 lo1Var = this.f;
        switch (i) {
            case 0:
                lo1Var.n((ListenableFuture) obj);
                return;
            default:
                lo1Var.l(obj);
                return;
        }
    }

    @Override // defpackage.o06
    public final boolean d() {
        return this.d.isDone();
    }

    @Override // defpackage.o06
    public final Object e() {
        int i = this.e;
        Object obj = this.C;
        switch (i) {
            case 0:
                return ((bbf) obj).call();
            default:
                return ((Callable) obj).call();
        }
    }

    @Override // defpackage.o06
    public final String f() {
        int i = this.e;
        Object obj = this.C;
        switch (i) {
            case 0:
                return ((bbf) obj).toString();
            default:
                return ((Callable) obj).toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ko1(lo1 lo1Var, bbf bbfVar, Executor executor) {
        this(lo1Var, executor);
        this.e = 0;
        this.f = lo1Var;
        this.C = bbfVar;
    }

    public ko1(lo1 lo1Var, Executor executor) {
        this.d = lo1Var;
        executor.getClass();
        this.c = executor;
    }
}
