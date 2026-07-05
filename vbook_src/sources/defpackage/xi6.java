package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xi6  reason: default package */
/* loaded from: classes3.dex */
public final class xi6 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ yya c;
    public final /* synthetic */ aw7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xi6(yya yyaVar, aw7 aw7Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = yyaVar;
        this.d = aw7Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        aw7 aw7Var = this.d;
        yya yyaVar = this.c;
        switch (i) {
            case 0:
                return new xi6(yyaVar, aw7Var, m42Var, 0);
            case 1:
                return new xi6(yyaVar, aw7Var, m42Var, 1);
            case 2:
                return new xi6(yyaVar, aw7Var, m42Var, 2);
            default:
                return new xi6(yyaVar, aw7Var, m42Var, 3);
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
                return ((xi6) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((xi6) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((xi6) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((xi6) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.d;
        yya yyaVar = this.c;
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
                s02 G = yae.G(new jw0(yyaVar, 25));
                zr2 zr2Var = new zr2(aw7Var, 2);
                this.b = 1;
                if (G.a(zr2Var, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 1:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                s02 G2 = yae.G(new jw0(yyaVar, 26));
                zr2 zr2Var2 = new zr2(aw7Var, 3);
                this.b = 1;
                if (G2.a(zr2Var2, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
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
                s02 G3 = yae.G(new jw0(yyaVar, 27));
                zr2 zr2Var3 = new zr2(aw7Var, 4);
                this.b = 1;
                if (G3.a(zr2Var3, this) == n82Var) {
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
                s02 G4 = yae.G(new jw0(yyaVar, 28));
                zr2 zr2Var4 = new zr2(aw7Var, 5);
                this.b = 1;
                if (G4.a(zr2Var4, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
