package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: il7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class il7 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ nq7 c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ vt4 e;
    public final /* synthetic */ int f;

    public /* synthetic */ il7(List list, nq7 nq7Var, xt4 xt4Var, vt4 vt4Var, int i, int i2) {
        this.a = i2;
        this.b = list;
        this.c = nq7Var;
        this.d = xt4Var;
        this.e = vt4Var;
        this.f = i;
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
                ube.k(this.b, this.c, this.d, this.e, (rv4) obj, p);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(i2 | 1);
                jce.r(this.b, this.c, this.d, this.e, (rv4) obj, p2);
                return pvcVar;
        }
    }
}
