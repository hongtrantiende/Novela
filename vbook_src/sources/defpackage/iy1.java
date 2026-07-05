package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iy1  reason: default package */
/* loaded from: classes3.dex */
public final class iy1 extends qf8 {
    public final qf8 a;
    public final z12 b;
    public final d82 c;
    public final ye6 d;

    public iy1(qf8 qf8Var, z12 z12Var, d82 d82Var) {
        qf8Var.getClass();
        z12Var.getClass();
        d82Var.getClass();
        this.a = qf8Var;
        this.b = z12Var;
        this.c = d82Var;
        this.d = ipe.x(sk6.c, new ve(this, 28));
    }

    @Override // defpackage.rf8
    public final Long a() {
        Long a = this.a.a();
        if (a != null) {
            Long j = this.b.j(a.longValue());
            if (j != null && j.longValue() >= 0) {
                return j;
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.rf8
    public final e32 b() {
        return this.a.b();
    }

    @Override // defpackage.rf8
    public final n45 c() {
        return (n45) this.d.getValue();
    }

    @Override // defpackage.rf8
    public final ii5 d() {
        return this.a.d();
    }

    @Override // defpackage.qf8
    public final Object e(f31 f31Var, aab aabVar) {
        Object E = z87.E(this.c, new l(this, f31Var, null, 12), aabVar);
        if (E == n82.a) {
            return E;
        }
        return pvc.a;
    }
}
