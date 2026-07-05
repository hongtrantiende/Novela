package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bz6  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class bz6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw7 b;
    public final /* synthetic */ vo9 c;
    public final /* synthetic */ mu4 d;
    public final /* synthetic */ xt4 e;

    public /* synthetic */ bz6(aw7 aw7Var, vo9 vo9Var, mu4 mu4Var, xt4 xt4Var, int i) {
        this.a = i;
        this.b = aw7Var;
        this.c = vo9Var;
        this.d = mu4Var;
        this.e = xt4Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        ri6 ri6Var = (ri6) obj;
        switch (i) {
            case 0:
                ri6Var.getClass();
                aw7 aw7Var = this.b;
                List list = (List) aw7Var.getValue();
                ri6Var.z(list.size(), new y74(18, new j35(12), list), new w74(16, list), new tu1(new gz6(list, this.c, aw7Var, this.d, this.e, 0), true, 2039820996));
                return pvcVar;
            default:
                ri6Var.getClass();
                aw7 aw7Var2 = this.b;
                List list2 = (List) aw7Var2.getValue();
                ri6Var.z(list2.size(), new oj7(15, new mx8(10), list2), new pj7(19, list2), new tu1(new gz6(list2, this.c, aw7Var2, this.d, this.e, 1), true, 2039820996));
                return pvcVar;
        }
    }
}
