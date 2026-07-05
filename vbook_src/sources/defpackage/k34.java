package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k34  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class k34 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;
    public final /* synthetic */ xt4 d;

    public /* synthetic */ k34(int i, xt4 xt4Var, String str, List list) {
        this.a = i;
        this.b = list;
        this.c = str;
        this.d = xt4Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        xt4 xt4Var = this.d;
        String str = this.c;
        List list = this.b;
        ri6 ri6Var = (ri6) obj;
        switch (i) {
            case 0:
                ri6Var.getClass();
                ri6Var.z(list.size(), null, new y7(28, list), new tu1(new zm7(1, xt4Var, str, list), true, 802480018));
                return pvcVar;
            case 1:
                ri6Var.getClass();
                ri6Var.z(list.size(), new oj7(1, new si7(12), list), new pj7(1, list), new tu1(new zm7(2, xt4Var, str, list), true, 802480018));
                return pvcVar;
            case 2:
                ri6Var.getClass();
                ri6Var.z(list.size(), null, new pj7(4, list), new tu1(new zm7(0, xt4Var, str, list), true, 802480018));
                return pvcVar;
            default:
                ri6Var.getClass();
                ri6Var.z(list.size(), new oj7(5, new bo7(5), list), new pj7(9, list), new tu1(new zm7(3, xt4Var, str, list), true, 802480018));
                return pvcVar;
        }
    }
}
