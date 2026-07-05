package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vd1  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class vd1 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ vd1(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        List list = this.b;
        switch (i) {
            case 0:
                ri6 ri6Var = (ri6) obj;
                ri6Var.getClass();
                ri6Var.z(list.size(), new x7(11, new c8(10, (byte) 0), list), new y7(14, list), new tu1(new be1(0, list, list), true, 2039820996));
                return pvcVar;
            case 1:
                ri6 ri6Var2 = (ri6) obj;
                ri6Var2.getClass();
                ri6Var2.z(list.size(), new y74(29, new si7(1), list), new w74(28, list), new tu1(new t43(2, list), true, 802480018));
                return pvcVar;
            case 2:
                ri6 ri6Var3 = (ri6) obj;
                ri6Var3.getClass();
                ri6Var3.z(list.size(), new oj7(12, new mx8(6), list), new pj7(16, list), new tu1(new be1(1, list, list), true, 2039820996));
                return pvcVar;
            case 3:
                return s21.m("recent_grid2_", ((cia) list.get(((Integer) obj).intValue())).a);
            case 4:
                return s21.m("recent_grid1_", ((cia) list.get(((Integer) obj).intValue())).a);
            case 5:
                b27 b27Var = (b27) obj;
                b27Var.getClass();
                return (CharSequence) list.get(Integer.parseInt((String) ((z17) b27Var.a()).get(1)) - 1);
            default:
                vf6 vf6Var = (vf6) obj;
                vf6Var.getClass();
                vf6Var.z(list.size(), new poa(17, new tsa(22, (byte) 0), list), null, new zgb(11, list), new tu1(new be1(2, list, list), true, -1942245546));
                return pvcVar;
        }
    }
}
