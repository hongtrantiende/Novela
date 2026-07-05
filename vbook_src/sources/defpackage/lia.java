package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lia  reason: default package */
/* loaded from: classes3.dex */
public final class lia extends sja {
    public final String E;
    public final wl6 F;
    public final cza G;
    public final s02 H;

    public lia(String str, dn6 dn6Var, wl6 wl6Var, klc klcVar) {
        super(dn6Var, klcVar);
        this.E = str;
        this.F = wl6Var;
        this.G = dza.a(new kia(""));
        this.H = new s02();
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        f(a, ru2.c, new ov9(this, (m42) null, 3));
        k();
    }

    @Override // defpackage.sja
    public final sl4 m() {
        bn6 bn6Var = (bn6) this.F;
        bn6Var.getClass();
        String str = this.E;
        str.getClass();
        gk2 gk2Var = bn6Var.a.c;
        gk2Var.getClass();
        s02 O = v9e.O(new ok2(gk2Var, str, new bk2(8)));
        sw2 sw2Var = ab3.a;
        return v9e.A(O, ru2.c);
    }

    @Override // defpackage.sja
    public final ArrayList n(int i, int i2, int i3, int i4, n42 n42Var) {
        gk2 gk2Var = ((bn6) this.F).a.c;
        gk2Var.getClass();
        String str = this.E;
        str.getClass();
        hl2 hl2Var = hl2.a;
        List<hk2> c = new tk2(gk2Var, str, i2, i, i3, i4, new kk2(gk2Var, 8)).c();
        ArrayList arrayList = new ArrayList(tl1.s(c, 10));
        for (hk2 hk2Var : c) {
            arrayList.add(ote.z(hk2Var));
        }
        return arrayList;
    }
}
