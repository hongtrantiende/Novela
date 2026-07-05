package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: le0  reason: default package */
/* loaded from: classes3.dex */
public final class le0 extends b36 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater G = AtomicReferenceFieldUpdater.newUpdater(le0.class, Object.class, "_disposer$volatile");
    public static final /* synthetic */ long H = u4f.a.objectFieldOffset(le0.class.getDeclaredField("_disposer$volatile"));
    public final f61 D;
    public kb3 E;
    public final /* synthetic */ ne0 F;
    private volatile /* synthetic */ Object _disposer$volatile;

    public le0(ne0 ne0Var, f61 f61Var) {
        this.F = ne0Var;
        this.D = f61Var;
    }

    @Override // defpackage.b36
    public final boolean q() {
        return false;
    }

    @Override // defpackage.b36
    public final void r(Throwable th) {
        f61 f61Var = this.D;
        if (th != null) {
            lie G2 = f61Var.G(new ft1(th, false), null);
            if (G2 != null) {
                f61Var.n(G2);
                me0 s = s();
                if (s != null) {
                    s.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ne0.b;
        ne0 ne0Var = this.F;
        if (atomicIntegerFieldUpdater.decrementAndGet(ne0Var) == 0) {
            gz2[] gz2VarArr = ne0Var.a;
            ArrayList arrayList = new ArrayList(gz2VarArr.length);
            for (gz2 gz2Var : gz2VarArr) {
                arrayList.add(gz2Var.getCompleted());
            }
            f61Var.resumeWith(arrayList);
        }
    }

    public final me0 s() {
        G.getClass();
        return (me0) u4f.a.getObjectVolatile(this, H);
    }

    public final void t(me0 me0Var) {
        G.getClass();
        u4f.a.putObjectVolatile(this, H, me0Var);
    }
}
