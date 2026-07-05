package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bea  reason: default package */
/* loaded from: classes.dex */
public final class bea extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ dea c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bea(dea deaVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = deaVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        dea deaVar = this.c;
        switch (i) {
            case 0:
                return new bea(deaVar, m42Var, 0);
            default:
                return new bea(deaVar, m42Var, 1);
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
                return ((bea) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((bea) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        dea deaVar = this.c;
        n82 n82Var = n82.a;
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
                    sj4 data = deaVar.b.getData();
                    aea aeaVar = new aea(deaVar.c);
                    this.b = 1;
                    if (data.a(aeaVar, this) == n82Var) {
                        return n82Var;
                    }
                }
                return pvc.a;
            default:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                sj4 data2 = deaVar.b.getData();
                this.b = 1;
                Object C = z1d.C(data2, this);
                if (C == n82Var) {
                    return n82Var;
                }
                return C;
        }
    }
}
