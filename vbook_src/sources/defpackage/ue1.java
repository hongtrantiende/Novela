package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ue1  reason: default package */
/* loaded from: classes3.dex */
public final class ue1 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ aw7 c;
    public final /* synthetic */ z86 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ue1(aw7 aw7Var, z86 z86Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = aw7Var;
        this.d = z86Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        z86 z86Var = this.d;
        aw7 aw7Var = this.c;
        switch (i) {
            case 0:
                return new ue1(aw7Var, z86Var, m42Var, 0);
            case 1:
                return new ue1(aw7Var, z86Var, m42Var, 1);
            case 2:
                return new ue1(aw7Var, z86Var, m42Var, 2);
            default:
                return new ue1(aw7Var, z86Var, m42Var, 3);
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
                return ((ue1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((ue1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((ue1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((ue1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        z86 z86Var = this.d;
        aw7 aw7Var = this.c;
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
                sj4 A = z1d.A(yae.G(new ae1(aw7Var, 3)));
                te1 te1Var = new te1(z86Var, 0);
                this.b = 1;
                if (A.a(te1Var, this) == n82Var) {
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
                sj4 A2 = z1d.A(yae.G(new ae1(aw7Var, 4)));
                te1 te1Var2 = new te1(z86Var, 1);
                this.b = 1;
                if (A2.a(te1Var2, this) == n82Var) {
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
                sj4 A3 = z1d.A(yae.G(new ea3(aw7Var, 0)));
                te1 te1Var3 = new te1(z86Var, 2);
                this.b = 1;
                if (A3.a(te1Var3, this) == n82Var) {
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
                sj4 A4 = z1d.A(yae.G(new p0c(aw7Var, 24)));
                te1 te1Var4 = new te1(z86Var, 3);
                this.b = 1;
                if (A4.a(te1Var4, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
