package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dr  reason: default package */
/* loaded from: classes.dex */
public final class dr extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ er b;
    public final /* synthetic */ xt4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dr(er erVar, xt4 xt4Var, int i) {
        super(1);
        this.a = i;
        this.b = erVar;
        this.c = xt4Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        xt4 xt4Var = this.c;
        long j = 0;
        er erVar = this.b;
        switch (i) {
            case 0:
                int intValue = ((Number) obj).intValue();
                yya yyaVar = (yya) erVar.e.g(erVar.a.d.getValue());
                if (yyaVar != null) {
                    j = ((zy5) yyaVar.getValue()).a;
                }
                long j2 = j;
                long j3 = intValue;
                return (Integer) xt4Var.invoke(Integer.valueOf((-((int) (erVar.b.a((j3 << 32) | (j3 & 4294967295L), j2, tc6.a) >> 32))) - intValue));
            case 1:
                int intValue2 = ((Number) obj).intValue();
                yya yyaVar2 = (yya) erVar.e.g(erVar.a.d.getValue());
                if (yyaVar2 != null) {
                    j = ((zy5) yyaVar2.getValue()).a;
                }
                long j4 = j;
                long j5 = intValue2;
                return (Integer) xt4Var.invoke(Integer.valueOf((-((int) (erVar.b.a((j5 << 32) | (j5 & 4294967295L), j4, tc6.a) >> 32))) + ((int) (j4 >> 32))));
            case 2:
                int intValue3 = ((Number) obj).intValue();
                yya yyaVar3 = (yya) erVar.e.g(erVar.a.d.getValue());
                if (yyaVar3 != null) {
                    j = ((zy5) yyaVar3.getValue()).a;
                }
                long j6 = j;
                long j7 = intValue3;
                return (Integer) xt4Var.invoke(Integer.valueOf((-((int) (erVar.b.a((j7 << 32) | (j7 & 4294967295L), j6, tc6.a) & 4294967295L))) - intValue3));
            default:
                int intValue4 = ((Number) obj).intValue();
                yya yyaVar4 = (yya) erVar.e.g(erVar.a.d.getValue());
                if (yyaVar4 != null) {
                    j = ((zy5) yyaVar4.getValue()).a;
                }
                long j8 = j;
                long j9 = intValue4;
                return (Integer) xt4Var.invoke(Integer.valueOf((-((int) (erVar.b.a((j9 << 32) | (j9 & 4294967295L), j8, tc6.a) & 4294967295L))) + ((int) (j8 & 4294967295L))));
        }
    }
}
