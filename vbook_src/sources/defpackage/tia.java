package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tia  reason: default package */
/* loaded from: classes3.dex */
public final class tia extends sja {
    public final wl6 E;

    public tia(wl6 wl6Var, dn6 dn6Var, klc klcVar) {
        super(dn6Var, klcVar);
        this.E = wl6Var;
        k();
    }

    @Override // defpackage.sja
    public final sl4 m() {
        return ((bn6) this.E).l();
    }

    @Override // defpackage.sja
    public final ArrayList n(int i, int i2, int i3, int i4, n42 n42Var) {
        gk2 gk2Var = ((bn6) this.E).a.c;
        List list = bn6.c;
        gk2Var.getClass();
        list.getClass();
        pl2 pl2Var = pl2.a;
        List<hk2> c = new wk2(gk2Var, list, i2, i, i3, i4, new kk2(gk2Var, 0)).c();
        ArrayList arrayList = new ArrayList(tl1.s(c, 10));
        for (hk2 hk2Var : c) {
            arrayList.add(ote.z(hk2Var));
        }
        return arrayList;
    }
}
