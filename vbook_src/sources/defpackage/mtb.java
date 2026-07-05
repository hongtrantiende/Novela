package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mtb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mtb implements xt4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ mtb(h35 h35Var, yl9 yl9Var, yl9 yl9Var2, ytb ytbVar, boolean z) {
        this.c = yl9Var;
        this.e = ytbVar;
        this.b = z;
        this.f = h35Var;
        this.d = yl9Var2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        String B;
        long b;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Serializable serializable = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ytb ytbVar = (ytb) obj3;
                y78 y78Var = (y78) obj;
                long a = a7a.a(ytbVar.o(this.b));
                ((yl9) obj4).a = a;
                ytbVar.z((h35) obj2, a);
                ((yl9) serializable).a = 0L;
                ytbVar.w = -1;
                return pvcVar;
            default:
                String str = (String) serializable;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                ((vjc) obj).getClass();
                ii2 ii2Var = ((yld) obj4).a;
                lm2 lm2Var = ii2Var.L;
                lm2Var.getClass();
                str.getClass();
                so2 so2Var = so2.a;
                oo2 oo2Var = (oo2) new po2(lm2Var, str, new ao2(17), 0).e();
                lm2 lm2Var2 = ii2Var.L;
                lm2Var2.g0(str);
                if (oo2Var == null || (B = oo2Var.a) == null) {
                    B = ube.B();
                }
                String str4 = B;
                if (oo2Var != null) {
                    b = oo2Var.f;
                } else {
                    b = by5.a.k().b();
                }
                lm2Var2.m0(new oo2(str4, str2, str, str3, this.b, b));
                return pvcVar;
        }
    }

    public /* synthetic */ mtb(yld yldVar, String str, String str2, String str3, boolean z) {
        this.c = yldVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.b = z;
    }
}
