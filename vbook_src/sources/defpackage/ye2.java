package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ye2  reason: default package */
/* loaded from: classes3.dex */
public final class ye2 extends aab implements xt4 {
    public final /* synthetic */ ef2 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ m82 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye2(ef2 ef2Var, float f, m82 m82Var, m42 m42Var) {
        super(1, m42Var);
        this.a = ef2Var;
        this.b = f;
        this.c = m82Var;
    }

    @Override // defpackage.hh0
    public final m42 create(m42 m42Var) {
        return new ye2(this.a, this.b, this.c, m42Var);
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        pvc pvcVar = pvc.a;
        ((ye2) create((m42) obj)).invokeSuspend(pvcVar);
        return pvcVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        hre.r(obj);
        ef2 ef2Var = this.a;
        ef2Var.r.d();
        m82 m82Var = ef2Var.a;
        z87.v(m82Var, null, null, new db(ef2Var, null, 10), 3);
        xe2 xe2Var = new xe2(ef2Var, ((Number) dce.p(new Float(this.b), ef2Var.b)).floatValue(), null, 0);
        m82 m82Var2 = this.c;
        z87.v(m82Var2, null, null, xe2Var, 3);
        if (((Number) ef2Var.m.e()).floatValue() != nae.e) {
            z87.v(m82Var2, null, null, new nt0(ef2Var, null, 1), 3);
        }
        z87.v(m82Var, null, null, new cv0(ef2Var, null, 24), 3);
        return pvc.a;
    }
}
