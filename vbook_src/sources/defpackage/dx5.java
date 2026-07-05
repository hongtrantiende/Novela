package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dx5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dx5 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ex5 b;

    public /* synthetic */ dx5(ex5 ex5Var, int i) {
        this.a = i;
        this.b = ex5Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        ex5 ex5Var = this.b;
        rnc rncVar = (rnc) obj;
        switch (i) {
            case 0:
                rncVar.getClass();
                ex5 ex5Var2 = (ex5) rncVar;
                qid qidVar = ex5Var.L;
                if (!c16.i(ex5Var2.K, qidVar)) {
                    ex5Var2.K = qidVar;
                    ex5Var2.I1();
                }
                return qnc.b;
            default:
                rncVar.getClass();
                ex5Var.K = ((ex5) rncVar).L;
                return Boolean.FALSE;
        }
    }
}
