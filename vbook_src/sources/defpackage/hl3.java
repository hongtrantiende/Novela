package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hl3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hl3 implements lu4 {
    public final /* synthetic */ float C;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ nq7 e;
    public final /* synthetic */ long f;

    public /* synthetic */ hl3(long j, List list, xt4 xt4Var, nq7 nq7Var, float f, int i) {
        this.a = 3;
        this.f = j;
        this.b = list;
        this.d = xt4Var;
        this.e = nq7Var;
        this.C = f;
        this.c = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(1);
                rte.h((Integer) obj4, this.c, (kj6) obj3, this.e, this.f, this.C, (rv4) obj, p);
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(1);
                rte.h((Integer) obj4, this.c, (kj6) obj3, this.e, this.f, this.C, (rv4) obj, p2);
                return pvcVar;
            case 2:
                ((Integer) obj2).getClass();
                int p3 = xoe.p(1);
                rte.h((Integer) obj4, this.c, (kj6) obj3, this.e, this.f, this.C, (rv4) obj, p3);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p4 = xoe.p(this.c | 1);
                ote.d(this.f, (List) obj4, (xt4) obj3, this.e, this.C, (rv4) obj, p4);
                return pvcVar;
        }
    }

    public /* synthetic */ hl3(Integer num, int i, kj6 kj6Var, nq7 nq7Var, long j, float f, int i2, int i3) {
        this.a = i3;
        this.b = num;
        this.c = i;
        this.d = kj6Var;
        this.e = nq7Var;
        this.f = j;
        this.C = f;
    }
}
