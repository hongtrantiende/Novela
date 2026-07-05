package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jt0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jt0 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yya b;

    public /* synthetic */ jt0(yya yyaVar, int i) {
        this.a = i;
        this.b = yyaVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        yya yyaVar = this.b;
        switch (i) {
            case 0:
                t15 t15Var = (t15) obj;
                t15Var.getClass();
                t15Var.x(pt0.e(yyaVar));
                return pvcVar;
            case 1:
                t15 t15Var2 = (t15) obj;
                t15Var2.getClass();
                t15Var2.x(pt0.e(yyaVar));
                return pvcVar;
            case 2:
                ak3 ak3Var = (ak3) obj;
                long j = ((zl1) yyaVar.getValue()).a;
                if (!zl1.c(j, zl1.i)) {
                    ak3.R0(ak3Var, j, 0L, 0L, nae.e, null, 0, Token.ELSE);
                }
                return pvcVar;
            case 3:
                ((xt4) yyaVar.getValue()).invoke(obj);
                return pvcVar;
            case 4:
                t15 t15Var3 = (t15) obj;
                t15Var3.getClass();
                t15Var3.v(((Number) yyaVar.getValue()).floatValue());
                t15Var3.l(((Number) yyaVar.getValue()).floatValue());
                return pvcVar;
            case 5:
                return ((qc9) ((zw7) yyaVar.getValue()).b.get(((Integer) obj).intValue())).a;
            case 6:
                ((t15) obj).q(((Number) yyaVar.getValue()).floatValue());
                return pvcVar;
            case 7:
                ((t15) obj).q(((Number) yyaVar.getValue()).floatValue());
                return pvcVar;
            case 8:
                t15 t15Var4 = (t15) obj;
                t15Var4.getClass();
                t15Var4.C(((Number) yyaVar.getValue()).floatValue());
                return pvcVar;
            case 9:
                t15 t15Var5 = (t15) obj;
                t15Var5.getClass();
                t15Var5.v(((Number) yyaVar.getValue()).floatValue());
                t15Var5.l(((Number) yyaVar.getValue()).floatValue());
                return pvcVar;
            default:
                t15 t15Var6 = (t15) obj;
                t15Var6.getClass();
                t15Var6.h(((Number) yyaVar.getValue()).floatValue());
                return pvcVar;
        }
    }
}
