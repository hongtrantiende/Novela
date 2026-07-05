package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bqb  reason: default package */
/* loaded from: classes3.dex */
public final class bqb extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ cqb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bqb(cqb cqbVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = cqbVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        cqb cqbVar = this.c;
        switch (i) {
            case 0:
                return new bqb(cqbVar, m42Var, 0);
            default:
                return new bqb(cqbVar, m42Var, 1);
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
                return ((bqb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((bqb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        bad d;
        int i = this.a;
        Object obj2 = n82.a;
        Object obj3 = pvc.a;
        cqb cqbVar = this.c;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    cza czaVar = cqbVar.C;
                    d = ((yld) cqbVar.d).d(cqbVar.c, true);
                    aqb aqbVar = new aqb(cqbVar, null);
                    this.b = 1;
                    Object k = mwe.k(this, d48.a, xd0.e, new we1(aqbVar, (m42) null, 6), new sj4[]{czaVar, d});
                    Object obj4 = k;
                    if (k != obj2) {
                        obj4 = obj3;
                    }
                    if (obj4 != obj2) {
                        obj4 = obj3;
                    }
                    if (obj4 == obj2) {
                        return obj2;
                    }
                }
                return obj3;
            default:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1 || i3 == 2) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    boolean booleanValue = ((Boolean) cqbVar.C.getValue()).booleanValue();
                    nld nldVar = cqbVar.d;
                    if (booleanValue) {
                        this.b = 1;
                        ((yld) nldVar).a.L.b0("general");
                        if (obj3 == obj2) {
                            return obj2;
                        }
                    } else {
                        String str = cqbVar.c;
                        this.b = 2;
                        ((yld) nldVar).a.L.b0(str);
                        if (obj3 == obj2) {
                            return obj2;
                        }
                    }
                }
                return obj3;
        }
    }
}
