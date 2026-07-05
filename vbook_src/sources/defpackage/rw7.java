package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rw7  reason: default package */
/* loaded from: classes3.dex */
public final class rw7 implements e61, zed {
    public final f61 a;
    public final /* synthetic */ sw7 b;

    public rw7(sw7 sw7Var, f61 f61Var) {
        this.b = sw7Var;
        this.a = f61Var;
    }

    @Override // defpackage.e61
    public final boolean a(Throwable th) {
        return this.a.a(th);
    }

    @Override // defpackage.zed
    public final void b(f5a f5aVar, int i) {
        this.a.b(f5aVar, i);
    }

    @Override // defpackage.e61
    public final lie g(Object obj, mu4 mu4Var) {
        sw7 sw7Var = this.b;
        pl7 pl7Var = new pl7(sw7Var, this);
        lie G = this.a.G((pvc) obj, pl7Var);
        if (G != null) {
            sw7.F.set(sw7Var, null);
        }
        return G;
    }

    @Override // defpackage.m42
    public final d82 getContext() {
        return this.a.e;
    }

    @Override // defpackage.e61
    public final void m(Object obj, mu4 mu4Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sw7.F;
        sw7 sw7Var = this.b;
        atomicReferenceFieldUpdater.set(sw7Var, null);
        cl7 cl7Var = new cl7(5, sw7Var, this);
        f61 f61Var = this.a;
        f61Var.D(pvc.a, f61Var.c, new qo4(cl7Var, 6));
    }

    @Override // defpackage.e61
    public final void n(Object obj) {
        this.a.n(obj);
    }

    @Override // defpackage.m42
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
