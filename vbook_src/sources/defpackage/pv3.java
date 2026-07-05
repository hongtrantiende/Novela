package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pv3  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class pv3 implements xt4 {
    public final /* synthetic */ zc4 C;
    public final /* synthetic */ List D;
    public final /* synthetic */ List E;
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ String b;
    public final /* synthetic */ hk2 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ long f;

    public /* synthetic */ pv3(bm1 bm1Var, String str, String str2, hk2 hk2Var, String str3, long j, List list, List list2) {
        this.C = bm1Var;
        this.b = str;
        this.d = str2;
        this.c = hk2Var;
        this.e = str3;
        this.f = j;
        this.D = list;
        this.E = list2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        String str;
        int i = this.a;
        pvc pvcVar = pvc.a;
        List<tp2> list = this.E;
        List<sm2> list2 = this.D;
        String str2 = this.d;
        String str3 = this.b;
        zc4 zc4Var = this.C;
        switch (i) {
            case 0:
                ((vjc) obj).getClass();
                ii2 ii2Var = (ii2) ((bm1) zc4Var).c;
                gk2 gk2Var = ii2Var.c;
                Map singletonMap = Collections.singletonMap("raw", str3);
                singletonMap.getClass();
                Map singletonMap2 = Collections.singletonMap("raw", str2);
                singletonMap2.getClass();
                int size = list2.size();
                hk2 hk2Var = this.c;
                ks3 ks3Var = ks3.a;
                String str4 = this.e;
                ls3 ls3Var = ls3.a;
                long j = this.f;
                gk2Var.x0(hk2.a(hk2Var, singletonMap, singletonMap2, null, 0, 0, ks3Var, str4, null, "EPUB", null, 0, 0, null, false, size, false, false, false, ls3Var, j, j, -537920711, 1));
                for (sm2 sm2Var : list2) {
                    ii2Var.C.z0(sm2Var);
                }
                for (tp2 tp2Var : list) {
                    ii2Var.U.F0(tp2Var);
                }
                return pvcVar;
            case 1:
                ArrayList arrayList = (ArrayList) list2;
                ArrayList arrayList2 = (ArrayList) list;
                ((vjc) obj).getClass();
                ii2 ii2Var2 = ((nrc) zc4Var).b;
                gk2 gk2Var2 = ii2Var2.c;
                Map singletonMap3 = Collections.singletonMap("raw", str3);
                singletonMap3.getClass();
                int size2 = arrayList.size();
                hk2 hk2Var2 = this.c;
                Map map = hk2Var2.D;
                if (str2.equals("detect_by_regex")) {
                    str = "false";
                } else {
                    str = "true";
                }
                Map singletonMap4 = Collections.singletonMap("includeChapterName", str);
                singletonMap4.getClass();
                LinkedHashMap u = o17.u(map, singletonMap4);
                String str5 = this.e;
                long j2 = this.f;
                gk2Var2.x0(hk2.a(hk2Var2, singletonMap3, null, null, 0, 0, null, str5, null, "TXT", null, 0, 0, null, false, size2, false, false, false, u, j2, j2, -537920643, 1));
                int size3 = arrayList.size();
                int i2 = 0;
                while (i2 < size3) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    ii2Var2.C.z0((sm2) obj2);
                }
                int size4 = arrayList2.size();
                int i3 = 0;
                while (i3 < size4) {
                    Object obj3 = arrayList2.get(i3);
                    i3++;
                    ii2Var2.U.F0((tp2) obj3);
                }
                return pvcVar;
            default:
                ((vjc) obj).getClass();
                ii2 ii2Var3 = (ii2) ((bm1) zc4Var).c;
                gk2 gk2Var3 = ii2Var3.c;
                Map singletonMap5 = Collections.singletonMap("raw", str3);
                singletonMap5.getClass();
                Map singletonMap6 = Collections.singletonMap("raw", str2);
                singletonMap6.getClass();
                hk2 hk2Var3 = this.c;
                ks3 ks3Var2 = ks3.a;
                String str6 = this.e;
                ls3 ls3Var2 = ls3.a;
                long j3 = this.f;
                gk2Var3.x0(hk2.a(hk2Var3, singletonMap5, singletonMap6, null, 0, 0, ks3Var2, str6, null, "ZIP", null, 0, 0, null, false, 1, false, false, false, ls3Var2, j3, j3, -537920711, 1));
                for (sm2 sm2Var2 : list2) {
                    ii2Var3.C.z0(sm2Var2);
                }
                int i4 = 0;
                for (Object obj4 : list) {
                    int i5 = i4 + 1;
                    if (i4 >= 0) {
                        gk2 gk2Var4 = ii2Var3.U;
                        String m = a82.m(hk2Var3.a, "_", i4);
                        String str7 = hk2Var3.a;
                        Map singletonMap7 = Collections.singletonMap("raw", (String) obj4);
                        singletonMap7.getClass();
                        String str8 = "0#" + (i4 / list.size());
                        yj1 yj1Var = by5.a;
                        gk2Var4.F0(new tp2(m, str7, singletonMap7, str8, "", 0, yj1Var.k().b(), yj1Var.k().b()));
                        i4 = i5;
                    } else {
                        tl1.M();
                        throw null;
                    }
                }
                return pvcVar;
        }
    }

    public /* synthetic */ pv3(bm1 bm1Var, String str, String str2, List list, hk2 hk2Var, String str3, long j, List list2) {
        this.C = bm1Var;
        this.b = str;
        this.d = str2;
        this.D = list;
        this.c = hk2Var;
        this.e = str3;
        this.f = j;
        this.E = list2;
    }

    public /* synthetic */ pv3(nrc nrcVar, String str, ArrayList arrayList, hk2 hk2Var, String str2, String str3, long j, ArrayList arrayList2) {
        this.C = nrcVar;
        this.b = str;
        this.D = arrayList;
        this.c = hk2Var;
        this.d = str2;
        this.e = str3;
        this.f = j;
        this.E = arrayList2;
    }
}
