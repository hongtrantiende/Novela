package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h52  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class h52 implements lu4 {
    public final /* synthetic */ mu4 C;
    public final /* synthetic */ vt4 D;
    public final /* synthetic */ xt4 E;
    public final /* synthetic */ xt4 F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ kj6 c;
    public final /* synthetic */ nq7 d;
    public final /* synthetic */ lu4 e;
    public final /* synthetic */ lu4 f;

    public /* synthetic */ h52(int i, int i2, vt4 vt4Var, xt4 xt4Var, xt4 xt4Var2, lu4 lu4Var, lu4 lu4Var2, mu4 mu4Var, kj6 kj6Var, nq7 nq7Var, List list) {
        this.a = i2;
        this.b = list;
        this.c = kj6Var;
        this.d = nq7Var;
        this.e = lu4Var;
        this.f = lu4Var2;
        this.C = mu4Var;
        this.D = vt4Var;
        this.E = xt4Var;
        this.F = xt4Var2;
        this.G = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.G;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(i2 | 1);
                npe.o(this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, (rv4) obj, p);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(i2 | 1);
                fce.r(this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, (rv4) obj, p2);
                return pvcVar;
        }
    }
}
