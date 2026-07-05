package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nd0  reason: default package */
/* loaded from: classes3.dex */
public final class nd0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ pgd c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nd0(pgd pgdVar, String str, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = pgdVar;
        this.d = str;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        String str = this.d;
        pgd pgdVar = this.c;
        switch (i) {
            case 0:
                return new nd0(pgdVar, str, m42Var, 0);
            case 1:
                return new nd0(pgdVar, str, m42Var, 1);
            case 2:
                return new nd0(pgdVar, str, m42Var, 2);
            default:
                return new nd0(pgdVar, str, m42Var, 3);
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
                return ((nd0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((nd0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((nd0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((nd0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        String str = this.d;
        pgd pgdVar = this.c;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                pgdVar.b(str);
                if (pvcVar == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 1:
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
                this.b = 1;
                Object a = pgdVar.a(str, this);
                if (a == n82Var) {
                    return n82Var;
                }
                return a;
            case 2:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                pgdVar.b(str);
                if (pvcVar == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                pgdVar.b(str);
                if (pvcVar == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
