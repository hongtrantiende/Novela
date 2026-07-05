package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nm5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class nm5 implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ vt4 E;
    public final /* synthetic */ xt4 F;
    public final /* synthetic */ xt4 G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ nq7 e;
    public final /* synthetic */ lu4 f;

    public /* synthetic */ nm5(int i, int i2, int i3, vt4 vt4Var, xt4 xt4Var, xt4 xt4Var2, lu4 lu4Var, lu4 lu4Var2, mu4 mu4Var, kj6 kj6Var, nq7 nq7Var, List list) {
        this.c = list;
        this.d = kj6Var;
        this.b = i;
        this.H = i2;
        this.e = nq7Var;
        this.f = lu4Var;
        this.C = lu4Var2;
        this.D = mu4Var;
        this.E = vt4Var;
        this.F = xt4Var;
        this.G = xt4Var2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.H;
        pvc pvcVar = pvc.a;
        Object obj3 = this.D;
        Object obj4 = this.C;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(12582913);
                int i3 = this.b;
                int i4 = this.H;
                vt4 vt4Var = this.E;
                xt4 xt4Var = this.F;
                xt4 xt4Var2 = this.G;
                lu4 lu4Var = this.f;
                jye.a(i3, i4, p, vt4Var, xt4Var, xt4Var2, lu4Var, (lu4) obj4, (mu4) obj3, (rv4) obj, (kj6) obj5, this.e, this.c);
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(i2 | 1);
                fce.p(this.b, this.c, (kj6) obj5, this.e, this.f, (lu4) obj4, (mu4) obj3, this.E, this.F, this.G, (rv4) obj, p2);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p3 = xoe.p(this.b | 1);
                int p4 = xoe.p(i2);
                qre.k((ArrayList) obj5, this.e, (dc) obj4, this.c, (List) obj3, this.F, this.G, this.f, this.E, (rv4) obj, p3, p4);
                return pvcVar;
        }
    }

    public /* synthetic */ nm5(int i, int i2, vt4 vt4Var, xt4 xt4Var, xt4 xt4Var2, lu4 lu4Var, lu4 lu4Var2, mu4 mu4Var, kj6 kj6Var, nq7 nq7Var, List list) {
        this.b = i;
        this.c = list;
        this.d = kj6Var;
        this.e = nq7Var;
        this.f = lu4Var;
        this.C = lu4Var2;
        this.D = mu4Var;
        this.E = vt4Var;
        this.F = xt4Var;
        this.G = xt4Var2;
        this.H = i2;
    }

    public /* synthetic */ nm5(ArrayList arrayList, nq7 nq7Var, dc dcVar, List list, List list2, xt4 xt4Var, xt4 xt4Var2, lu4 lu4Var, vt4 vt4Var, int i, int i2) {
        this.d = arrayList;
        this.e = nq7Var;
        this.C = dcVar;
        this.c = list;
        this.D = list2;
        this.F = xt4Var;
        this.G = xt4Var2;
        this.f = lu4Var;
        this.E = vt4Var;
        this.b = i;
        this.H = i2;
    }
}
