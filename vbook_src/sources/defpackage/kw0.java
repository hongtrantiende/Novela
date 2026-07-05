package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kw0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kw0 implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ hu4 D;
    public final /* synthetic */ hu4 E;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ nq7 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ kw0(lhd lhdVar, boolean z, boolean z2, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, int i) {
        this.e = lhdVar;
        this.b = z;
        this.d = z2;
        this.c = nq7Var;
        this.f = vt4Var;
        this.C = vt4Var2;
        this.D = vt4Var3;
        this.E = vt4Var4;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        hu4 hu4Var = this.E;
        hu4 hu4Var2 = this.D;
        Object obj3 = this.C;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(9);
                y9e.i((lhd) obj5, this.b, this.d, this.c, (vt4) obj4, (vt4) obj3, (vt4) hu4Var2, (vt4) hu4Var, (rv4) obj, p);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(12585985);
                ape.i(this.b, (yp8) obj5, (List) obj4, this.c, this.d, (String) obj3, (xt4) hu4Var2, (xt4) hu4Var, (rv4) obj, p2);
                return pvcVar;
        }
    }

    public /* synthetic */ kw0(boolean z, yp8 yp8Var, List list, nq7 nq7Var, boolean z2, String str, xt4 xt4Var, xt4 xt4Var2, int i) {
        this.b = z;
        this.e = yp8Var;
        this.f = list;
        this.c = nq7Var;
        this.d = z2;
        this.C = str;
        this.D = xt4Var;
        this.E = xt4Var2;
    }
}
