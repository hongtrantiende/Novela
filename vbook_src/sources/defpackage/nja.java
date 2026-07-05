package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nja  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class nja implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uja b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ xt4 d;

    public /* synthetic */ nja(uja ujaVar, xt4 xt4Var, xt4 xt4Var2, int i) {
        this.a = i;
        this.b = ujaVar;
        this.c = xt4Var;
        this.d = xt4Var2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                vf6 vf6Var = (vf6) obj;
                vf6Var.getClass();
                uja ujaVar = this.b;
                List list = ujaVar.b;
                vf6Var.z(list.size(), new oj7(24, new eja(13), list), null, new oj7(25, new eja(14), list), new tu1(new qja(list, ujaVar, this.c, this.d, 1), true, -1117249557));
                return pvcVar;
            case 1:
                vf6 vf6Var2 = (vf6) obj;
                vf6Var2.getClass();
                List list2 = this.b.b;
                vf6Var2.z(list2.size(), new oj7(28, new eja(15), list2), null, new oj7(29, new eja(8), list2), new tu1(new bq0(list2, this.c, this.d, 5), true, -1117249557));
                return pvcVar;
            case 2:
                vf6 vf6Var3 = (vf6) obj;
                vf6Var3.getClass();
                uja ujaVar2 = this.b;
                List list3 = ujaVar2.b;
                vf6Var3.z(list3.size(), new oj7(22, new eja(9), list3), null, new oj7(23, new eja(10), list3), new tu1(new qja(list3, ujaVar2, this.c, this.d, 0), true, -1117249557));
                return pvcVar;
            default:
                vf6 vf6Var4 = (vf6) obj;
                vf6Var4.getClass();
                uja ujaVar3 = this.b;
                List list4 = ujaVar3.b;
                vf6Var4.z(list4.size(), new oj7(26, new eja(11), list4), null, new oj7(27, new eja(12), list4), new tu1(new qja(list4, ujaVar3, this.c, this.d, 2), true, -1117249557));
                return pvcVar;
        }
    }
}
