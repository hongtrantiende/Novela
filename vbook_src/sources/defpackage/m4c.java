package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m4c  reason: default package */
/* loaded from: classes3.dex */
public final class m4c extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y5c b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4c(float f, y5c y5cVar, m42 m42Var) {
        super(2, m42Var);
        this.a = 0;
        this.c = f;
        this.b = y5cVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new m4c(this.c, this.b, m42Var);
            case 1:
                return new m4c(this.c, 1, m42Var, this.b);
            case 2:
                return new m4c(this.c, 2, m42Var, this.b);
            case 3:
                return new m4c(this.c, 3, m42Var, this.b);
            case 4:
                return new m4c(this.c, 4, m42Var, this.b);
            case 5:
                return new m4c(this.c, 5, m42Var, this.b);
            default:
                return new m4c(this.c, 6, m42Var, this.b);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m82 m82Var = (m82) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                ((m4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ((m4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 2:
                ((m4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 3:
                ((m4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 4:
                ((m4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 5:
                ((m4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((m4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        int i = this.a;
        pvc pvcVar = pvc.a;
        float f = this.c;
        y5c y5cVar = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                if (f < nae.e) {
                    ((qi9) y5cVar.U).a.f.e(xh9.s[4], Boolean.TRUE);
                    cza czaVar = y5cVar.t0;
                    if (czaVar != null) {
                        do {
                            value2 = czaVar.getValue();
                        } while (!czaVar.l(value2, nnb.a((nnb) value2, null, null, null, null, null, null, false, null, nae.e, nae.e, nae.e, nae.e, nae.e, 0, 0, true, nae.e, false, false, 0, 0, 0, 0, false, false, false, false, false, 0, false, nae.e, 0, 0, 0, 0, -32769, 7)));
                    }
                } else {
                    ls0 ls0Var = ((qi9) y5cVar.U).a.f;
                    r76[] r76VarArr = xh9.s;
                    ls0Var.e(r76VarArr[4], Boolean.FALSE);
                    ((qi9) y5cVar.U).a.g.e(r76VarArr[5], Float.valueOf(f));
                    cza czaVar2 = y5cVar.t0;
                    if (czaVar2 != null) {
                        do {
                            value = czaVar2.getValue();
                        } while (!czaVar2.l(value, nnb.a((nnb) value, null, null, null, null, null, null, false, null, nae.e, nae.e, nae.e, nae.e, nae.e, 0, 0, false, this.c, false, false, 0, 0, 0, 0, false, false, false, false, false, 0, false, nae.e, 0, 0, 0, 0, -98305, 7)));
                    }
                }
                return pvcVar;
            case 1:
                hre.r(obj);
                ((mnb) y5cVar.V).a.m.e(qwb.A[14], Float.valueOf(f));
                cza czaVar3 = y5cVar.t0;
                if (czaVar3 != null) {
                    do {
                        value3 = czaVar3.getValue();
                    } while (!czaVar3.l(value3, nnb.a((nnb) value3, null, null, null, null, null, null, false, null, this.c, nae.e, nae.e, nae.e, nae.e, 0, 0, false, nae.e, false, false, 0, 0, 0, 0, false, false, false, false, false, 0, false, nae.e, 0, 0, 0, 0, -257, 7)));
                    y5cVar.N0.b();
                    y5cVar.M0();
                    return pvcVar;
                }
                y5cVar.N0.b();
                y5cVar.M0();
                return pvcVar;
            case 2:
                hre.r(obj);
                ((mnb) y5cVar.V).a.q.e(qwb.A[18], Float.valueOf(f));
                cza czaVar4 = y5cVar.t0;
                if (czaVar4 != null) {
                    do {
                        value4 = czaVar4.getValue();
                    } while (!czaVar4.l(value4, nnb.a((nnb) value4, null, null, null, null, null, null, false, null, nae.e, nae.e, nae.e, nae.e, this.c, 0, 0, false, nae.e, false, false, 0, 0, 0, 0, false, false, false, false, false, 0, false, nae.e, 0, 0, 0, 0, -4097, 7)));
                    y5cVar.N0.b();
                    y5cVar.M0();
                    return pvcVar;
                }
                y5cVar.N0.b();
                y5cVar.M0();
                return pvcVar;
            case 3:
                hre.r(obj);
                ((mnb) y5cVar.V).a.o.e(qwb.A[16], Float.valueOf(f));
                cza czaVar5 = y5cVar.t0;
                if (czaVar5 != null) {
                    do {
                        value5 = czaVar5.getValue();
                    } while (!czaVar5.l(value5, nnb.a((nnb) value5, null, null, null, null, null, null, false, null, nae.e, nae.e, this.c, nae.e, nae.e, 0, 0, false, nae.e, false, false, 0, 0, 0, 0, false, false, false, false, false, 0, false, nae.e, 0, 0, 0, 0, -1025, 7)));
                    y5cVar.N0.b();
                    y5cVar.M0();
                    return pvcVar;
                }
                y5cVar.N0.b();
                y5cVar.M0();
                return pvcVar;
            case 4:
                hre.r(obj);
                ((mnb) y5cVar.V).a.p.e(qwb.A[17], Float.valueOf(f));
                cza czaVar6 = y5cVar.t0;
                if (czaVar6 != null) {
                    do {
                        value6 = czaVar6.getValue();
                    } while (!czaVar6.l(value6, nnb.a((nnb) value6, null, null, null, null, null, null, false, null, nae.e, nae.e, nae.e, this.c, nae.e, 0, 0, false, nae.e, false, false, 0, 0, 0, 0, false, false, false, false, false, 0, false, nae.e, 0, 0, 0, 0, -2049, 7)));
                    y5cVar.N0.b();
                    y5cVar.M0();
                    return pvcVar;
                }
                y5cVar.N0.b();
                y5cVar.M0();
                return pvcVar;
            case 5:
                hre.r(obj);
                ((mnb) y5cVar.V).a.e.e(qwb.A[6], Float.valueOf(f));
                cza czaVar7 = y5cVar.t0;
                if (czaVar7 != null) {
                    do {
                        value7 = czaVar7.getValue();
                    } while (!czaVar7.l(value7, nnb.a((nnb) value7, null, null, null, null, null, null, false, null, nae.e, nae.e, nae.e, nae.e, nae.e, 0, 0, false, nae.e, false, false, 0, 0, 0, 0, false, false, false, false, false, 0, false, this.c, 0, 0, 0, 0, -1073741825, 7)));
                    return pvcVar;
                }
                return pvcVar;
            default:
                hre.r(obj);
                ((mnb) y5cVar.V).a.n.e(qwb.A[15], Float.valueOf(f));
                cza czaVar8 = y5cVar.t0;
                if (czaVar8 != null) {
                    do {
                        value8 = czaVar8.getValue();
                    } while (!czaVar8.l(value8, nnb.a((nnb) value8, null, null, null, null, null, null, false, null, nae.e, this.c, nae.e, nae.e, nae.e, 0, 0, false, nae.e, false, false, 0, 0, 0, 0, false, false, false, false, false, 0, false, nae.e, 0, 0, 0, 0, -513, 7)));
                    y5cVar.N0.b();
                    y5cVar.M0();
                    return pvcVar;
                }
                y5cVar.N0.b();
                y5cVar.M0();
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m4c(float f, int i, m42 m42Var, y5c y5cVar) {
        super(2, m42Var);
        this.a = i;
        this.b = y5cVar;
        this.c = f;
    }
}
