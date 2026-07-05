package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o91  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class o91 implements xt4 {
    public final /* synthetic */ long C;
    public final /* synthetic */ List D;
    public final /* synthetic */ String E;
    public final /* synthetic */ zc4 F;
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ List e;
    public final /* synthetic */ hk2 f;

    public /* synthetic */ o91(oaa oaaVar, String str, String str2, hk2 hk2Var, String str3, long j, List list, List list2, String str4) {
        this.a = 0;
        this.F = oaaVar;
        this.b = str;
        this.c = str2;
        this.f = hk2Var;
        this.d = str3;
        this.C = j;
        this.e = list;
        this.D = list2;
        this.E = str4;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        String str;
        String str2;
        int i = this.a;
        String str3 = "";
        String str4 = this.E;
        String str5 = this.d;
        pvc pvcVar = pvc.a;
        List<tp2> list = this.D;
        List<sm2> list2 = this.e;
        String str6 = this.c;
        String str7 = this.b;
        zc4 zc4Var = this.F;
        switch (i) {
            case 0:
                ((vjc) obj).getClass();
                ii2 ii2Var = (ii2) ((oaa) zc4Var).c;
                gk2 gk2Var = ii2Var.c;
                Map singletonMap = Collections.singletonMap("raw", str7);
                singletonMap.getClass();
                Map singletonMap2 = Collections.singletonMap("raw", str6);
                singletonMap2.getClass();
                hk2 hk2Var = this.f;
                ks3 ks3Var = ks3.a;
                String str8 = this.d;
                ls3 ls3Var = ls3.a;
                long j = this.C;
                gk2Var.x0(hk2.a(hk2Var, singletonMap, singletonMap2, null, 0, 0, ks3Var, str8, null, "PDF", null, 0, 0, null, false, 1, false, false, false, ls3Var, j, j, -537920711, 1));
                for (sm2 sm2Var : list2) {
                    ii2Var.C.z0(sm2Var);
                }
                int i2 = 0;
                for (Object obj2 : list) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        gk2 gk2Var2 = ii2Var.U;
                        String str9 = this.E;
                        String m = a82.m(str9, "_", i2);
                        Map singletonMap3 = Collections.singletonMap("raw", (String) obj2);
                        singletonMap3.getClass();
                        String str10 = "0#" + (i2 / list.size());
                        yj1 yj1Var = by5.a;
                        gk2Var2.F0(new tp2(m, str9, singletonMap3, str10, "", 0, yj1Var.k().b(), yj1Var.k().b()));
                        i2 = i3;
                    } else {
                        tl1.M();
                        throw null;
                    }
                }
                return pvcVar;
            case 1:
                t6f t6fVar = (t6f) zc4Var;
                ((vjc) obj).getClass();
                ii2 ii2Var2 = (ii2) t6fVar.e;
                gk2 gk2Var3 = ii2Var2.c;
                Map singletonMap4 = Collections.singletonMap("raw", str7);
                singletonMap4.getClass();
                Map singletonMap5 = Collections.singletonMap("raw", str6);
                singletonMap5.getClass();
                String str11 = (String) t6fVar.d;
                if (str5.length() == 0) {
                    if (str4 != null) {
                        str3 = str4;
                    }
                    str = str3;
                } else {
                    str = str5;
                }
                int size = list2.size();
                hk2 hk2Var2 = this.f;
                ls3 ls3Var2 = ls3.a;
                long j2 = this.C;
                gk2Var3.x0(hk2.a(hk2Var2, singletonMap4, singletonMap5, null, 0, 0, null, str, null, str11, null, 0, 0, null, false, size, false, false, false, ls3Var2, j2, j2, -537920647, 1));
                for (sm2 sm2Var2 : list2) {
                    ii2Var2.C.z0(sm2Var2);
                }
                for (tp2 tp2Var : list) {
                    ii2Var2.U.F0(tp2Var);
                }
                return pvcVar;
            default:
                ((vjc) obj).getClass();
                ii2 ii2Var3 = (ii2) ((bm1) zc4Var).c;
                gk2 gk2Var4 = ii2Var3.c;
                Map singletonMap6 = Collections.singletonMap("raw", str7);
                singletonMap6.getClass();
                Map singletonMap7 = Collections.singletonMap("raw", str6);
                singletonMap7.getClass();
                if (str5.length() == 0) {
                    if (str4 != null) {
                        str3 = str4;
                    }
                    str2 = str3;
                } else {
                    str2 = str5;
                }
                int size2 = list2.size();
                hk2 hk2Var3 = this.f;
                ls3 ls3Var3 = ls3.a;
                long j3 = this.C;
                gk2Var4.x0(hk2.a(hk2Var3, singletonMap6, singletonMap7, null, 0, 0, null, str2, null, "HTML", null, 0, 0, null, false, size2, false, false, false, ls3Var3, j3, j3, -537920647, 1));
                for (sm2 sm2Var3 : list2) {
                    ii2Var3.C.z0(sm2Var3);
                }
                for (tp2 tp2Var2 : list) {
                    ii2Var3.U.F0(tp2Var2);
                }
                return pvcVar;
        }
    }

    public /* synthetic */ o91(zc4 zc4Var, String str, String str2, String str3, List list, hk2 hk2Var, long j, List list2, String str4, int i) {
        this.a = i;
        this.F = zc4Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = hk2Var;
        this.C = j;
        this.D = list2;
        this.E = str4;
    }
}
