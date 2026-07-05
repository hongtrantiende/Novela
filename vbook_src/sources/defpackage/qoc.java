package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qoc  reason: default package */
/* loaded from: classes.dex */
public final class qoc extends yl4 implements RunnableFuture {
    public volatile o06 E;

    public qoc(Callable callable) {
        this.E = new poc(this, callable);
    }

    @Override // defpackage.x1
    public final void c() {
        o06 o06Var;
        if (p() && (o06Var = this.E) != null) {
            o06Var.c();
        }
        this.E = null;
    }

    @Override // defpackage.x1
    public final String j() {
        o06 o06Var = this.E;
        if (o06Var != null) {
            return "task=[" + o06Var + "]";
        }
        return super.j();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        o06 o06Var = this.E;
        if (o06Var != null) {
            o06Var.run();
        }
        this.E = null;
    }
}
