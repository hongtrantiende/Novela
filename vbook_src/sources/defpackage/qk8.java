package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qk8  reason: default package */
/* loaded from: classes.dex */
public final class qk8 extends aab implements lu4 {
    public final /* synthetic */ long C;
    public final /* synthetic */ sk8 D;
    public /* synthetic */ Object a;
    public final /* synthetic */ qi8 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk8(qi8 qi8Var, float f, float f2, float f3, float f4, long j, sk8 sk8Var, m42 m42Var) {
        super(2, m42Var);
        this.b = qi8Var;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.C = j;
        this.D = sk8Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        qk8 qk8Var = new qk8(this.b, this.c, this.d, this.e, this.f, this.C, this.D, m42Var);
        qk8Var.a = obj;
        return qk8Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        pvc pvcVar = pvc.a;
        ((qk8) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        return pvcVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        m82 m82Var = (m82) this.a;
        hre.r(obj);
        qi8 qi8Var = this.b;
        lq a = tc4.a(qi8Var.b.h(), 0.01f);
        lq a2 = tc4.a(qi8Var.c.h(), 0.01f);
        a.i(new Float(this.c), new Float(this.d));
        a2.i(new Float(this.e), new Float(this.f));
        z87.v(m82Var, null, null, new pk8(a, this.C, this.D, qi8Var, null, 0), 3);
        z87.v(m82Var, null, null, new pk8(a2, this.C, this.D, qi8Var, null, 1), 3);
        return pvc.a;
    }
}
