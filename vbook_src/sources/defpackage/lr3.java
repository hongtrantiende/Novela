package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lr3  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lr3 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw7 b;
    public final /* synthetic */ qo9 c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ xt4 e;

    public /* synthetic */ lr3(aw7 aw7Var, qo9 qo9Var, xt4 xt4Var, xt4 xt4Var2, int i) {
        this.a = i;
        this.b = aw7Var;
        this.c = qo9Var;
        this.d = xt4Var;
        this.e = xt4Var2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                vf6 vf6Var = (vf6) obj;
                vf6Var.getClass();
                aw7 aw7Var = this.b;
                List list = (List) aw7Var.getValue();
                vf6Var.z(list.size(), new x7(25, new pg2(17), list), null, new y7(27, list), new tu1(new qr3(list, this.c, aw7Var, this.d, this.e), true, -1942245546));
                return pvcVar;
            default:
                vf6 vf6Var2 = (vf6) obj;
                vf6Var2.getClass();
                aw7 aw7Var2 = this.b;
                List list2 = (List) aw7Var2.getValue();
                vf6Var2.z(list2.size(), new pj7(new dva(13), list2), null, new zgb(0, list2), new tu1(new qr3(list2, this.c, this.d, this.e, aw7Var2), true, -1117249557));
                return pvcVar;
        }
    }
}
