package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cu3  reason: default package */
/* loaded from: classes.dex */
public final class cu3 extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ du3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cu3(du3 du3Var, int i) {
        super(1);
        this.a = i;
        this.b = du3Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        st3 st3Var = st3.c;
        st3 st3Var2 = st3.b;
        st3 st3Var3 = st3.a;
        du3 du3Var = this.b;
        switch (i) {
            case 0:
                qkc qkcVar = (qkc) obj;
                boolean c = qkcVar.c(st3Var3, st3Var2);
                gxa gxaVar = null;
                if (c) {
                    qa1 qa1Var = du3Var.P.a.c;
                    if (qa1Var != null) {
                        gxaVar = qa1Var.c;
                    }
                } else if (qkcVar.c(st3Var2, st3Var)) {
                    qa1 qa1Var2 = du3Var.Q.a.c;
                    if (qa1Var2 != null) {
                        gxaVar = qa1Var2.c;
                    }
                } else {
                    gxaVar = zt3.e;
                }
                if (gxaVar == null) {
                    return zt3.e;
                }
                return gxaVar;
            default:
                qkc qkcVar2 = (qkc) obj;
                if (qkcVar2.c(st3Var3, st3Var2)) {
                    dpa dpaVar = du3Var.P.a.b;
                    if (dpaVar != null) {
                        return dpaVar.b;
                    }
                    return zt3.d;
                } else if (qkcVar2.c(st3Var2, st3Var)) {
                    dpa dpaVar2 = du3Var.Q.a.b;
                    if (dpaVar2 != null) {
                        return dpaVar2.b;
                    }
                    return zt3.d;
                } else {
                    return zt3.d;
                }
        }
    }
}
