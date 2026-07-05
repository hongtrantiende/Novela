package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cz6  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class cz6 implements lu4 {
    public final /* synthetic */ int C;
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ rh8 c;
    public final /* synthetic */ nq7 d;
    public final /* synthetic */ mu4 e;
    public final /* synthetic */ xt4 f;

    public /* synthetic */ cz6(List list, rh8 rh8Var, nq7 nq7Var, mu4 mu4Var, xt4 xt4Var, int i, int i2) {
        this.a = i2;
        this.b = list;
        this.c = rh8Var;
        this.d = nq7Var;
        this.e = mu4Var;
        this.f = xt4Var;
        this.C = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.C;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(i2 | 1);
                yz1.a(this.b, this.c, this.d, this.e, this.f, (rv4) obj, p);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(i2 | 1);
                hu7.d(this.b, this.c, this.d, this.e, this.f, (rv4) obj, p2);
                return pvcVar;
        }
    }
}
