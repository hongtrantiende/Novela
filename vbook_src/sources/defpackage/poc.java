package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: poc  reason: default package */
/* loaded from: classes.dex */
public final class poc extends o06 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ qoc d;
    public final Object e;

    public poc(qoc qocVar, Callable callable) {
        this.d = qocVar;
        callable.getClass();
        this.e = callable;
    }

    @Override // defpackage.o06
    public final void a(Throwable th) {
        int i = this.c;
        qoc qocVar = this.d;
        switch (i) {
            case 0:
                qocVar.m(th);
                return;
            default:
                qocVar.m(th);
                return;
        }
    }

    @Override // defpackage.o06
    public final void b(Object obj) {
        int i = this.c;
        qoc qocVar = this.d;
        switch (i) {
            case 0:
                qocVar.n((ListenableFuture) obj);
                return;
            default:
                qocVar.l(obj);
                return;
        }
    }

    @Override // defpackage.o06
    public final boolean d() {
        int i = this.c;
        qoc qocVar = this.d;
        switch (i) {
            case 0:
                return qocVar.isDone();
            default:
                return qocVar.isDone();
        }
    }

    @Override // defpackage.o06
    public final Object e() {
        int i = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                x00 x00Var = (x00) obj;
                ListenableFuture call = x00Var.call();
                wq9.y(call, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", x00Var);
                return call;
            default:
                return ((Callable) obj).call();
        }
    }

    @Override // defpackage.o06
    public final String f() {
        switch (this.c) {
            case 0:
                return ((x00) this.e).toString();
            default:
                return ((Callable) this.e).toString();
        }
    }

    public poc(qoc qocVar, x00 x00Var) {
        this.d = qocVar;
        this.e = x00Var;
    }
}
