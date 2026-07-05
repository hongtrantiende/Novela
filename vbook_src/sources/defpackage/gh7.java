package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gh7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gh7 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ nq7 e;
    public final /* synthetic */ int f;

    public /* synthetic */ gh7(int i, int i2, xt4 xt4Var, nq7 nq7Var, List list) {
        this.a = 2;
        this.c = list;
        this.b = i;
        this.e = nq7Var;
        this.d = xt4Var;
        this.f = i2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(i2 | 1);
                z87.m(this.b, p, this.d, (rv4) obj, this.e, this.c);
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(i2 | 1);
                oc2.r(this.b, p2, this.d, (rv4) obj, this.e, this.c);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p3 = xoe.p(i2 | 1);
                cq7.a(this.b, p3, this.d, (rv4) obj, this.e, this.c);
                return pvcVar;
        }
    }

    public /* synthetic */ gh7(int i, List list, xt4 xt4Var, nq7 nq7Var, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = list;
        this.d = xt4Var;
        this.e = nq7Var;
        this.f = i2;
    }
}
