package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iwc  reason: default package */
/* loaded from: classes3.dex */
public final class iwc extends f82 {
    public static final iwc c = new f82();

    @Override // defpackage.f82
    public final void C(d82 d82Var, Runnable runnable) {
        sw2.d.c.q(runnable, true, false);
    }

    @Override // defpackage.f82
    public final void Q(d82 d82Var, Runnable runnable) {
        sw2.d.c.q(runnable, true, true);
    }

    @Override // defpackage.f82
    public final f82 j0(int i) {
        yte.p(i);
        if (i >= alb.d) {
            return this;
        }
        return super.j0(i);
    }

    @Override // defpackage.f82
    public final String toString() {
        return "Dispatchers.IO";
    }
}
