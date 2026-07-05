package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dd3  reason: default package */
/* loaded from: classes.dex */
public final class dd3 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ ied c;
    public final /* synthetic */ iw2 d;
    public final /* synthetic */ yya e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dd3(ied iedVar, iw2 iw2Var, yya yyaVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = iedVar;
        this.d = iw2Var;
        this.e = yyaVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new dd3(this.c, this.d, this.e, m42Var, 0);
            default:
                return new dd3(this.c, this.d, this.e, m42Var, 1);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        n82 n82Var = n82.a;
        pvc pvcVar = pvc.a;
        m82 m82Var = (m82) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                ((dd3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return n82Var;
            default:
                ((dd3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return n82Var;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        yya yyaVar = this.e;
        iw2 iw2Var = this.d;
        ied iedVar = this.c;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hre.r(obj);
                } else {
                    hre.r(obj);
                    jj9 jj9Var = iedVar.f;
                    cd3 cd3Var = new cd3(iw2Var, yyaVar, 0);
                    this.b = 1;
                    if (jj9Var.a.a(cd3Var, this) == n82Var) {
                        return n82Var;
                    }
                }
                ls2.c();
                return null;
            default:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    throw a82.e(obj);
                }
                hre.r(obj);
                cd3 cd3Var2 = new cd3(iw2Var, yyaVar, 1);
                this.b = 1;
                ((pga) iedVar.h.d).a(cd3Var2, this);
                return n82Var;
        }
    }
}
