package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: px0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class px0 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;
    public final /* synthetic */ nq7 d;
    public final /* synthetic */ xt4 e;

    public /* synthetic */ px0(int i, int i2, xt4 xt4Var, nq7 nq7Var, String str, List list) {
        this.a = i2;
        this.b = str;
        this.c = list;
        this.d = nq7Var;
        this.e = xt4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(1);
                b16.f(this.b, this.c, this.d, this.e, (rv4) obj, p);
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(1);
                b16.e(this.b, this.c, this.d, this.e, (rv4) obj, p2);
                return pvcVar;
            case 2:
                ((Integer) obj2).getClass();
                int p3 = xoe.p(385);
                mue.c(this.b, this.c, this.d, this.e, (rv4) obj, p3);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p4 = xoe.p(1);
                cae.o(this.b, this.c, this.d, this.e, (rv4) obj, p4);
                return pvcVar;
        }
    }
}
