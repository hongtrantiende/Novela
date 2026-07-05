package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xa1  reason: default package */
/* loaded from: classes3.dex */
public class xa1 extends wa1 {
    public final lu4 d;

    public xa1(lu4 lu4Var, d82 d82Var, int i, py0 py0Var) {
        super(d82Var, i, py0Var);
        this.d = lu4Var;
    }

    @Override // defpackage.wa1
    public Object h(y69 y69Var, m42 m42Var) {
        Object invoke = this.d.invoke(y69Var, m42Var);
        if (invoke == n82.a) {
            return invoke;
        }
        return pvc.a;
    }

    @Override // defpackage.wa1
    public wa1 i(d82 d82Var, int i, py0 py0Var) {
        return new xa1(this.d, d82Var, i, py0Var);
    }

    @Override // defpackage.wa1
    public final String toString() {
        return "block[" + this.d + "] -> " + super.toString();
    }
}
