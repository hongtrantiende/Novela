package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rh  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class rh implements lu4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ nq7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rh(int i, int i2, long j, nq7 nq7Var, List list) {
        this.b = nq7Var;
        this.c = j;
        this.f = list;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.d;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(i2 | 1);
                vh.a((l88) obj3, this.b, this.c, (rv4) obj, p, this.e);
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(i2 | 1);
                eg0.f(this.b, this.c, (List) obj3, (rv4) obj, p2, this.e);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p3 = xoe.p(i2 | 1);
                hre.b(this.c, this.b, (tu1) obj3, (rv4) obj, p3, this.e);
                return pvcVar;
        }
    }

    public /* synthetic */ rh(long j, nq7 nq7Var, tu1 tu1Var, int i, int i2) {
        this.c = j;
        this.b = nq7Var;
        this.f = tu1Var;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ rh(l88 l88Var, nq7 nq7Var, long j, int i, int i2) {
        this.f = l88Var;
        this.b = nq7Var;
        this.c = j;
        this.d = i;
        this.e = i2;
    }
}
