package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jac  reason: default package */
/* loaded from: classes3.dex */
public final class jac implements m82 {
    public final /* synthetic */ m82 a;
    public final AtomicReference b = new AtomicReference(null);
    public final /* synthetic */ p1a c;
    public final /* synthetic */ m82 d;
    public final /* synthetic */ lu4 e;
    public final /* synthetic */ AtomicReference f;

    public jac(m82 m82Var, p1a p1aVar, m82 m82Var2, lu4 lu4Var, AtomicReference atomicReference) {
        this.c = p1aVar;
        this.d = m82Var2;
        this.e = lu4Var;
        this.f = atomicReference;
        this.a = m82Var;
    }

    public final long a() {
        Long l = (Long) this.b.get();
        if (l != null) {
            long longValue = l.longValue();
            this.c.getClass();
            hq7 hq7Var = wl3.b;
            return jue.P(longValue - System.currentTimeMillis(), am3.MILLISECONDS);
        }
        hq7 hq7Var2 = wl3.b;
        return wl3.c;
    }

    public final void b(long j) {
        if (wl3.e(j) <= 0) {
            k27.n(this.d, new fac("Timed out immediately", this.e.hashCode()));
        } else if (wl3.c(a(), j) >= 0) {
            this.c.getClass();
            this.b.set(Long.valueOf(wl3.e(j) + System.currentTimeMillis()));
            p1a p1aVar = this.c;
            m82 m82Var = this.d;
            w26 w26Var = (w26) this.f.getAndSet(z87.v(m82Var, null, null, new byb(this, p1aVar, m82Var, this.e, null, 7), 3));
            if (w26Var != null) {
                w26Var.cancel(null);
            }
        }
    }

    @Override // defpackage.m82
    public final d82 q() {
        return this.a.q();
    }
}
