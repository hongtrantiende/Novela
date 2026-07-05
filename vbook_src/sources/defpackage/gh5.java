package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gh5  reason: default package */
/* loaded from: classes3.dex */
public final class gh5 {
    public final xtc a = new xtc();
    public pg5 b = pg5.b;
    public final o45 c = new c3e(8);
    public Object d = fs3.a;
    public b9b e = rse.b();
    public final uy1 f = new uy1();

    public final oe4 a() {
        rf8 rf8Var;
        vyc b = this.a.b();
        pg5 pg5Var = this.b;
        r45 Y = this.c.Y();
        Object obj = this.d;
        if (obj instanceof rf8) {
            rf8Var = (rf8) obj;
        } else {
            rf8Var = null;
        }
        if (rf8Var != null) {
            return new oe4(b, pg5Var, Y, rf8Var, this.e, this.f);
        }
        cp8.u(this.d, "No request transformation found: ");
        return null;
    }

    public final void b(isc iscVar) {
        uy1 uy1Var = this.f;
        if (iscVar != null) {
            uy1Var.f(wp9.a, iscVar);
            return;
        }
        h40 h40Var = wp9.a;
        uy1Var.getClass();
        h40Var.getClass();
        uy1Var.d().remove(h40Var);
    }

    public final void c(df5 df5Var, Object obj) {
        ((Map) this.f.a(ef5.a, new k85(10))).put(df5Var, obj);
    }

    public final void d(pg5 pg5Var) {
        pg5Var.getClass();
        this.b = pg5Var;
    }

    public final void e(gh5 gh5Var) {
        gh5Var.getClass();
        this.b = gh5Var.b;
        this.d = gh5Var.d;
        uy1 uy1Var = gh5Var.f;
        b((isc) uy1Var.e(wp9.a));
        xtc xtcVar = gh5Var.a;
        xtc xtcVar2 = this.a;
        obe.B(xtcVar2, xtcVar);
        List list = xtcVar2.h;
        list.getClass();
        xtcVar2.h = list;
        hu7.h(this.c, gh5Var.c);
        uy1 uy1Var2 = this.f;
        uy1Var2.getClass();
        uy1Var.getClass();
        for (h40 h40Var : sl1.C0(uy1Var.d().keySet())) {
            h40Var.getClass();
            uy1Var2.f(h40Var, uy1Var.c(h40Var));
        }
    }
}
