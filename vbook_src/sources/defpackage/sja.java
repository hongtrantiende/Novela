package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sja  reason: default package */
/* loaded from: classes3.dex */
public abstract class sja extends fdd {
    public ilc C;
    public long D;
    public final dn6 c;
    public final klc d;
    public final cza e = dza.a(new uja(null, 0, 0, false, false, false, false, 511));
    public oia f;

    public sja(dn6 dn6Var, klc klcVar) {
        this.c = dn6Var;
        this.d = klcVar;
    }

    public static final ArrayList j(sja sjaVar, List list, ilc ilcVar) {
        sjaVar.getClass();
        ArrayList arrayList = new ArrayList(tl1.s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vl6 vl6Var = (vl6) it.next();
            arrayList.add(c16.z(vl6Var, ((plc) sjaVar.d).h(vl6Var.b, ilcVar.a, vl6Var.C, ilcVar.a(vl6Var.m), ilcVar.c)));
        }
        return arrayList;
    }

    @Override // defpackage.fdd
    public final void e(Throwable th) {
        th.getClass();
        npe.u(th);
    }

    public final void k() {
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        f(a, ru2.c, new ov9(this, (m42) null, 5));
    }

    public final void l() {
        oia oiaVar;
        ilc ilcVar;
        uja ujaVar = (uja) this.e.getValue();
        if (ujaVar.h && !ujaVar.i && (oiaVar = this.f) != null && (ilcVar = this.C) != null) {
            hk1 a = jdd.a(this);
            sw2 sw2Var = ab3.a;
            f(a, ru2.c, new z45(this, ujaVar, oiaVar, ilcVar, (m42) null, 22));
        }
    }

    public abstract sl4 m();

    public abstract ArrayList n(int i, int i2, int i3, int i4, n42 n42Var);
}
