package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jl4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jl4 implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ hu4 E;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ nq7 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ jl4(int i, List list, int i2, rj8 rj8Var, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, int i3) {
        this.b = i;
        this.f = list;
        this.c = i2;
        this.C = rj8Var;
        this.d = nq7Var;
        this.D = xt4Var;
        this.E = xt4Var2;
        this.e = i3;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.e;
        hu4 hu4Var = this.E;
        Object obj3 = this.D;
        Object obj4 = this.C;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(i2 | 1);
                s9e.f(this.d, (fz) obj5, (jz) obj4, (mk0) obj3, this.b, this.c, (tu1) hu4Var, (rv4) obj, p);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(i2 | 1);
                nxe.a(this.b, (List) obj5, this.c, (rj8) obj4, this.d, (xt4) obj3, (xt4) hu4Var, (rv4) obj, p2);
                return pvcVar;
        }
    }

    public /* synthetic */ jl4(nq7 nq7Var, fz fzVar, jz jzVar, mk0 mk0Var, int i, int i2, tu1 tu1Var, int i3) {
        this.d = nq7Var;
        this.f = fzVar;
        this.C = jzVar;
        this.D = mk0Var;
        this.b = i;
        this.c = i2;
        this.E = tu1Var;
        this.e = i3;
    }
}
