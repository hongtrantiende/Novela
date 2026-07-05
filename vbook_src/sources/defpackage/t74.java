package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t74  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class t74 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v84 b;

    public /* synthetic */ t74(v84 v84Var, int i) {
        this.a = i;
        this.b = v84Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        v84 v84Var = this.b;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                hk1 a = jdd.a(v84Var);
                sw2 sw2Var = ab3.a;
                v84Var.f(a, ru2.c, new gx(v84Var, booleanValue, (m42) null, 4));
                return pvcVar;
            case 1:
                String str = (String) obj;
                str.getClass();
                fdd.g(v84Var, jdd.a(v84Var), new s84(v84Var, str, null, 2));
                return pvcVar;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                v84Var.H = str2;
                v84Var.f(jdd.a(v84Var), ab3.a, new q84(v84Var, null, 3));
                return pvcVar;
            case 3:
                l54 l54Var = (l54) obj;
                l54Var.getClass();
                hk1 a2 = jdd.a(v84Var);
                sw2 sw2Var2 = ab3.a;
                v84Var.f(a2, ru2.c, new uw2(v84Var, l54Var, (m42) null, 21));
                return pvcVar;
            case 4:
                int intValue = ((Integer) obj).intValue();
                hk1 a3 = jdd.a(v84Var);
                sw2 sw2Var3 = ab3.a;
                v84Var.f(a3, ru2.c, new rr0(v84Var, intValue, (m42) null, 2));
                return pvcVar;
            case 5:
                String str3 = (String) obj;
                str3.getClass();
                hk1 a4 = jdd.a(v84Var);
                sw2 sw2Var4 = ab3.a;
                v84Var.f(a4, ru2.c, new s84(v84Var, str3, null, 1));
                return pvcVar;
            case 6:
                String str4 = (String) obj;
                str4.getClass();
                hk1 a5 = jdd.a(v84Var);
                sw2 sw2Var5 = ab3.a;
                v84Var.f(a5, ru2.c, new s84(v84Var, str4, null, 0));
                return pvcVar;
            default:
                f76 f76Var = (f76) obj;
                if (f76Var != null) {
                    hk1 a6 = jdd.a(v84Var);
                    sw2 sw2Var6 = ab3.a;
                    v84Var.f(a6, ru2.c, new uw2(v84Var, f76Var, (m42) null, 20));
                }
                return pvcVar;
        }
    }
}
