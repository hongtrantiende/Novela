package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: via  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class via implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aia b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ xt4 d;

    public /* synthetic */ via(aia aiaVar, xt4 xt4Var, xt4 xt4Var2, int i) {
        this.a = i;
        this.b = aiaVar;
        this.c = xt4Var;
        this.d = xt4Var2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        List list;
        List list2;
        xt4 xt4Var;
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                vf6 vf6Var = (vf6) obj;
                vf6Var.getClass();
                aia aiaVar = this.b;
                List list3 = aiaVar.h;
                List list4 = aiaVar.j;
                List list5 = aiaVar.i;
                List list6 = aiaVar.g;
                boolean isEmpty = list3.isEmpty();
                xt4 xt4Var2 = this.c;
                xt4 xt4Var3 = this.d;
                if (!isEmpty) {
                    vf6.y(vf6Var, "last_add_list1", new gda(11), cae.i, 4);
                    List list7 = aiaVar.h;
                    vf6Var.z(list7.size(), new oj7(18, new gda(14), list7), null, new oj7(19, new gda(15), list7), new tu1(new td0(list7, aiaVar, xt4Var2, xt4Var3, 9), true, -1117249557));
                }
                if (!list6.isEmpty()) {
                    vf6.y(vf6Var, "recent_list1", new gda(16), cae.j, 4);
                    vf6.A(vf6Var, Math.min(6, list6.size()), new aja(aiaVar, 1), new gda(13), new tu1(new zia(aiaVar, xt4Var2, xt4Var3, 2), true, -1378077659), 4);
                }
                if (!list5.isEmpty()) {
                    vf6.y(vf6Var, "last_update_list1", new gda(17), cae.k, 4);
                    vf6.A(vf6Var, Math.min(6, list5.size()), new aja(aiaVar, 2), new gda(13), new tu1(new zia(aiaVar, xt4Var2, xt4Var3, 0), true, 1111386342), 4);
                }
                if (!list4.isEmpty()) {
                    vf6.y(vf6Var, "often_read_list1", new gda(12), cae.l, 4);
                    vf6.A(vf6Var, Math.min(6, list4.size()), new aja(aiaVar, 0), new gda(13), new tu1(new zia(aiaVar, xt4Var2, xt4Var3, 1), true, -694116953), 4);
                }
                return pvcVar;
            default:
                vf6 vf6Var2 = (vf6) obj;
                vf6Var2.getClass();
                aia aiaVar2 = this.b;
                List list8 = aiaVar2.h;
                List list9 = aiaVar2.j;
                List list10 = aiaVar2.i;
                List list11 = aiaVar2.g;
                boolean isEmpty2 = list8.isEmpty();
                xt4 xt4Var4 = this.c;
                xt4 xt4Var5 = this.d;
                if (!isEmpty2) {
                    vf6.y(vf6Var2, "last_add_list2", new gda(25), cae.m, 4);
                    List list12 = aiaVar2.h;
                    list = list10;
                    list2 = list11;
                    xt4Var = xt4Var4;
                    vf6Var2.z(list12.size(), new oj7(20, new gda(27), list12), null, new oj7(21, new gda(28), list12), new tu1(new bq0(list12, xt4Var4, xt4Var5, 4), true, -1117249557));
                } else {
                    list = list10;
                    list2 = list11;
                    xt4Var = xt4Var4;
                }
                if (!list2.isEmpty()) {
                    vf6.y(vf6Var2, "recent_list2", new gda(29), cae.n, 4);
                    vf6.A(vf6Var2, Math.min(6, list2.size()), new aja(aiaVar2, 6), new gda(13), new tu1(new zia(aiaVar2, xt4Var, xt4Var5, 7), true, -676143066), 4);
                }
                if (!list.isEmpty()) {
                    vf6.y(vf6Var2, "last_update_list2", new eja(0), cae.o, 4);
                    vf6.A(vf6Var2, Math.min(6, list.size()), new aja(aiaVar2, 7), new gda(13), new tu1(new zia(aiaVar2, xt4Var, xt4Var5, 5), true, 1813320935), 4);
                }
                if (!list9.isEmpty()) {
                    vf6.y(vf6Var2, "often_read_list2", new gda(26), cae.p, 4);
                    vf6.A(vf6Var2, Math.min(6, list9.size()), new aja(aiaVar2, 5), new gda(13), new tu1(new zia(aiaVar2, xt4Var, xt4Var5, 6), true, 7817640), 4);
                }
                return pvcVar;
        }
    }
}
