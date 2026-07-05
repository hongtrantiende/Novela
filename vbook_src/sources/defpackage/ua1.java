package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ua1  reason: default package */
/* loaded from: classes3.dex */
public final class ua1 extends wa1 {
    private volatile /* synthetic */ int consumed$volatile;
    public final ta1 d;

    static {
        AtomicIntegerFieldUpdater.newUpdater(ua1.class, "consumed$volatile");
    }

    public /* synthetic */ ua1(ta1 ta1Var) {
        this(ta1Var, gs3.a, -3, py0.a);
    }

    @Override // defpackage.wa1, defpackage.sj4
    public final Object a(tj4 tj4Var, m42 m42Var) {
        int i = this.b;
        n82 n82Var = n82.a;
        if (i == -3) {
            Object z = nmd.z(tj4Var, this.d, false, m42Var);
            if (z == n82Var) {
                return z;
            }
        } else {
            Object a = super.a(tj4Var, m42Var);
            if (a == n82Var) {
                return a;
            }
        }
        return pvc.a;
    }

    @Override // defpackage.wa1
    public final String g() {
        return "channel=" + this.d;
    }

    @Override // defpackage.wa1
    public final Object h(y69 y69Var, m42 m42Var) {
        Object z = nmd.z(new x8a(y69Var), this.d, false, m42Var);
        if (z == n82.a) {
            return z;
        }
        return pvc.a;
    }

    @Override // defpackage.wa1
    public final wa1 i(d82 d82Var, int i, py0 py0Var) {
        return new ua1(this.d, d82Var, i, py0Var);
    }

    @Override // defpackage.wa1
    public final sj4 j() {
        return new ua1(this.d);
    }

    @Override // defpackage.wa1
    public final ta1 k(m82 m82Var) {
        if (this.b == -3) {
            return this.d;
        }
        return super.k(m82Var);
    }

    public ua1(ta1 ta1Var, d82 d82Var, int i, py0 py0Var) {
        super(d82Var, i, py0Var);
        this.d = ta1Var;
    }
}
