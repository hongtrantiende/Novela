package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x24  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class x24 implements lu4 {
    public final /* synthetic */ hu4 C;
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ x24(int i, boolean z, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, int i2) {
        this.a = 2;
        this.c = i;
        this.b = z;
        this.e = nq7Var;
        this.f = xt4Var;
        this.C = xt4Var2;
        this.d = i2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        pvc pvcVar = pvc.a;
        hu4 hu4Var = this.C;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(i2 | 1);
                bze.c((String) obj4, this.b, (vt4) obj3, (lu4) hu4Var, (rv4) obj, p, this.d);
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(i2 | 1);
                ade.j((List) obj4, this.b, (nq7) obj3, (xt4) hu4Var, (rv4) obj, p2, this.d);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p3 = xoe.p(this.d | 1);
                cq7.f(this.c, this.b, (nq7) obj4, (xt4) obj3, (xt4) hu4Var, (rv4) obj, p3);
                return pvcVar;
        }
    }

    public /* synthetic */ x24(Object obj, boolean z, Object obj2, hu4 hu4Var, int i, int i2, int i3) {
        this.a = i3;
        this.e = obj;
        this.b = z;
        this.f = obj2;
        this.C = hu4Var;
        this.c = i;
        this.d = i2;
    }
}
