package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bk8  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class bk8 implements xt4 {
    public final /* synthetic */ vt4 C;
    public final /* synthetic */ xt4 D;
    public final /* synthetic */ xt4 E;
    public final /* synthetic */ yya F;
    public final /* synthetic */ aw7 G;
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ su0 c;
    public final /* synthetic */ lu4 d;
    public final /* synthetic */ lu4 e;
    public final /* synthetic */ mu4 f;

    public /* synthetic */ bk8(List list, su0 su0Var, lu4 lu4Var, lu4 lu4Var2, mu4 mu4Var, vt4 vt4Var, xt4 xt4Var, xt4 xt4Var2, yya yyaVar, aw7 aw7Var, int i) {
        this.a = i;
        this.b = list;
        this.c = su0Var;
        this.d = lu4Var;
        this.e = lu4Var2;
        this.f = mu4Var;
        this.C = vt4Var;
        this.D = xt4Var;
        this.E = xt4Var2;
        this.F = yyaVar;
        this.G = aw7Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                ri6 ri6Var = (ri6) obj;
                ri6Var.getClass();
                j35 j35Var = new j35(29);
                List list = this.b;
                ri6Var.z(list.size(), new oj7(11, j35Var, list), new pj7(15, list), new tu1(new gk8(list, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, 1), true, 2039820996));
                return pvcVar;
            default:
                ri6 ri6Var2 = (ri6) obj;
                ri6Var2.getClass();
                j35 j35Var2 = new j35(28);
                List list2 = this.b;
                ri6Var2.z(list2.size(), new oj7(9, j35Var2, list2), new pj7(13, list2), new tu1(new gk8(list2, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, 0), true, 2039820996));
                return pvcVar;
        }
    }
}
