package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ab1  reason: default package */
/* loaded from: classes3.dex */
public final class ab1 extends za1 {
    public ab1(sj4 sj4Var, d82 d82Var, int i, py0 py0Var, int i2) {
        super(sj4Var, (i2 & 2) != 0 ? gs3.a : d82Var, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? py0.a : py0Var);
    }

    @Override // defpackage.wa1
    public final wa1 i(d82 d82Var, int i, py0 py0Var) {
        return new za1(this.d, d82Var, i, py0Var);
    }

    @Override // defpackage.wa1
    public final sj4 j() {
        return this.d;
    }

    @Override // defpackage.za1
    public final Object l(tj4 tj4Var, m42 m42Var) {
        Object a = this.d.a(tj4Var, m42Var);
        if (a == n82.a) {
            return a;
        }
        return pvc.a;
    }
}
