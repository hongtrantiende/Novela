package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h43  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class h43 implements xt4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ xt4 b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ h43(k23 k23Var, lu4 lu4Var, v43 v43Var, xt4 xt4Var, lu4 lu4Var2, rh8 rh8Var, xt4 xt4Var2) {
        this.d = k23Var;
        this.e = lu4Var;
        this.C = v43Var;
        this.b = xt4Var;
        this.f = lu4Var2;
        this.D = rh8Var;
        this.c = xt4Var2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj2 = this.D;
        Object obj3 = this.C;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i) {
            case 0:
                k23 k23Var = (k23) obj6;
                lu4 lu4Var = (lu4) obj5;
                v43 v43Var = (v43) obj3;
                lu4 lu4Var2 = (lu4) obj4;
                vf6 vf6Var = (vf6) obj;
                vf6Var.getClass();
                vf6.y(vf6Var, "header", new bq2(23), new tu1(new j43(k23Var, v43Var, (rh8) obj2, this.c, 1), true, 238848286), 4);
                List list = k23Var.p;
                List list2 = k23Var.s;
                List list3 = k23Var.q;
                List list4 = k23Var.r;
                if (!list.isEmpty()) {
                    bce.o(vf6Var, k23Var.p, lu4Var);
                }
                if (k23Var.f.length() > 0) {
                    vf6.y(vf6Var, "info", new bq2(24), new tu1(new k43(k23Var, 2), true, 407015024), 4);
                }
                if (k23Var.g.length() > 0) {
                    vf6.y(vf6Var, "introduction", new bq2(25), new tu1(new k43(k23Var, 3), true, 645881457), 4);
                }
                if (!list4.isEmpty()) {
                    vf6Var.z(list4.size(), null, null, new y7(20, list4), new tu1(new t43(1, list4), true, -1117249557));
                }
                if (!list3.isEmpty()) {
                    String str = v43Var.b;
                    str.getClass();
                    obe.A(vf6Var, str, list3, this.b, lu4Var);
                }
                if (!list2.isEmpty()) {
                    String str2 = v43Var.b;
                    str2.getClass();
                    fbe.H(vf6Var, str2, list2, new cd1(15), lu4Var2);
                }
                return pvcVar;
            default:
                String str3 = (String) obj6;
                List list5 = (List) obj5;
                List list6 = (List) obj4;
                xt4 xt4Var = (xt4) obj3;
                xt4 xt4Var2 = (xt4) obj2;
                ri6 ri6Var = (ri6) obj;
                ri6Var.getClass();
                if (str3.length() == 0 && !list5.isEmpty()) {
                    ri6.y(ri6Var, null, kve.a, 3);
                }
                int size = list5.size();
                w74 w74Var = new w74(9, list5);
                xt4 xt4Var3 = this.b;
                xt4 xt4Var4 = this.c;
                ri6Var.z(size, null, w74Var, new tu1(new gr0(list5, xt4Var3, xt4Var4, xt4Var, 1), true, 802480018));
                if (str3.length() == 0 && !list6.isEmpty()) {
                    ri6.y(ri6Var, null, kve.b, 3);
                }
                ri6Var.z(list6.size(), null, new w74(10, list6), new tu1(new gr0(list6, xt4Var2, xt4Var4, xt4Var, 2), true, 802480018));
                return pvcVar;
        }
    }

    public /* synthetic */ h43(String str, List list, List list2, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4) {
        this.d = str;
        this.e = list;
        this.f = list2;
        this.b = xt4Var;
        this.c = xt4Var2;
        this.C = xt4Var3;
        this.D = xt4Var4;
    }
}
