package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ud3  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ud3 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ae3 b;
    public final /* synthetic */ List c;

    public /* synthetic */ ud3(ae3 ae3Var, List list, int i) {
        this.a = i;
        this.b = ae3Var;
        this.c = list;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = 0;
        List list = this.c;
        ae3 ae3Var = this.b;
        switch (i) {
            case 0:
                ((vjc) obj).getClass();
                ii2 ii2Var = ae3Var.a;
                ii2Var.E.a0();
                for (Object obj2 : list) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        kd3 kd3Var = (kd3) obj2;
                        lm2 lm2Var = ii2Var.E;
                        String str = kd3Var.a;
                        String str2 = kd3Var.b;
                        String str3 = kd3Var.c;
                        boolean z = kd3Var.d;
                        long j = i2;
                        yj1 yj1Var = by5.a;
                        lm2Var.k0(new cn2(str, str2, str3, z, j, yj1Var.k().b(), yj1Var.k().b()));
                        i2 = i3;
                    } else {
                        tl1.M();
                        throw null;
                    }
                }
                return pvcVar;
            default:
                ((vjc) obj).getClass();
                ii2 ii2Var2 = ae3Var.a;
                ii2Var2.E.a0();
                if (list != null) {
                    for (Object obj3 : list) {
                        int i4 = i2 + 1;
                        if (i2 >= 0) {
                            nd3 nd3Var = (nd3) obj3;
                            lm2 lm2Var2 = ii2Var2.E;
                            String B = ube.B();
                            String str4 = nd3Var.a;
                            String str5 = nd3Var.b;
                            boolean z2 = nd3Var.c;
                            long j2 = i2;
                            yj1 yj1Var2 = by5.a;
                            lm2Var2.k0(new cn2(B, str4, str5, z2, j2, yj1Var2.k().b(), yj1Var2.k().b()));
                            i2 = i4;
                        } else {
                            tl1.M();
                            throw null;
                        }
                    }
                }
                return pvcVar;
        }
    }
}
