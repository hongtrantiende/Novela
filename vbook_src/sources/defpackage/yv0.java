package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yv0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class yv0 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ xt4 c;

    public /* synthetic */ yv0(xt4 xt4Var, List list, int i) {
        this.a = i;
        this.c = xt4Var;
        this.b = list;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        xt4 xt4Var = this.c;
        List list = this.b;
        switch (i) {
            case 0:
                vf6 vf6Var = (vf6) obj;
                vf6Var.getClass();
                vf6Var.z(list.size(), new x7(5, new nj0(17), list), null, new y7(8, list), new tu1(new xa(list, xt4Var, 2), true, -1117249557));
                return pvcVar;
            case 1:
                wj6 wj6Var = (wj6) obj;
                wj6Var.getClass();
                wj6.y(wj6Var, list.size(), null, new tu1(new u32(1, xt4Var, list), true, 398555585), 14);
                return pvcVar;
            case 2:
                ri6 ri6Var = (ri6) obj;
                ri6Var.getClass();
                ri6Var.z(list.size(), new x7(28, new pg2(22), list), new y7(29, list), new tu1(new k64(list, list, xt4Var, 0), true, 2039820996));
                return pvcVar;
            case 3:
                ri6 ri6Var2 = (ri6) obj;
                ri6Var2.getClass();
                if (list.isEmpty()) {
                    ri6.y(ri6Var2, "empty", sze.b, 2);
                }
                ri6Var2.z(list.size(), null, new w74(29, list), new tu1(new xa(list, xt4Var, 8), true, 802480018));
                return pvcVar;
            case 4:
                xt4Var.invoke(list.get(((Integer) obj).intValue()));
                return pvcVar;
            case 5:
                xt4Var.invoke(list.get(((Integer) obj).intValue()));
                return pvcVar;
            case 6:
                xt4Var.invoke(list.get(((Integer) obj).intValue()));
                return pvcVar;
            case 7:
                xt4Var.invoke(list.get(((Integer) obj).intValue()));
                return pvcVar;
            case 8:
                xt4Var.invoke(list.get(((Integer) obj).intValue()));
                return pvcVar;
            case 9:
                ri6 ri6Var3 = (ri6) obj;
                ri6Var3.getClass();
                ri6Var3.z(list.size(), new oj7(17, new gda(9), list), new pj7(21, list), new tu1(new xa(list, xt4Var, 9), true, 802480018));
                return pvcVar;
            default:
                ri6 ri6Var4 = (ri6) obj;
                ri6Var4.getClass();
                ri6Var4.z(list.size(), new poa(2, new eja(26), list), new pj7(25, list), new tu1(new xa(list, xt4Var, 10), true, 802480018));
                return pvcVar;
        }
    }

    public /* synthetic */ yv0(List list, xt4 xt4Var, int i) {
        this.a = i;
        this.b = list;
        this.c = xt4Var;
    }
}
