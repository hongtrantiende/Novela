package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: so4  reason: default package */
/* loaded from: classes3.dex */
public final class so4 implements nu4 {
    public final /* synthetic */ xt4 C;
    public final /* synthetic */ List a;
    public final /* synthetic */ List b;
    public final /* synthetic */ pc4 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ xt4 e;
    public final /* synthetic */ xt4 f;

    public so4(List list, List list2, pc4 pc4Var, String str, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3) {
        this.a = list;
        this.b = list2;
        this.c = pc4Var;
        this.d = str;
        this.e = xt4Var;
        this.f = xt4Var2;
        this.C = xt4Var3;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        v72 v72Var;
        int i2;
        int i3;
        Object obj5 = (xg6) obj;
        int intValue = ((Number) obj2).intValue();
        rv4 rv4Var = (rv4) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (rv4Var.f(obj5)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (rv4Var.d(intValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i & 1, z)) {
            co4 co4Var = (co4) this.a.get(intValue);
            rv4Var.e0(-309392403);
            if (intValue == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (intValue == tl1.x(this.b)) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z4 = z2;
            String str = co4Var.b;
            String str2 = co4Var.c;
            boolean equals = this.d.equals(str2);
            boolean z5 = co4Var.d;
            ng3 ng3Var = co4Var.e;
            nq7 f = pna.f(kq7.a, 1.0f);
            if (!z4 && !z3) {
                rv4Var.e0(-1949626205);
                v72Var = ((h27) rv4Var.j(j27.a)).c.a;
                rv4Var.q(false);
            } else if (z4 && z3) {
                rv4Var.e0(-1949623586);
                v72Var = ((h27) rv4Var.j(j27.a)).c.d;
                rv4Var.q(false);
            } else if (z4) {
                rv4Var.e0(-308712140);
                f99 f99Var = j27.a;
                v72Var = v72.d(((h27) rv4Var.j(f99Var)).c.d, null, null, ((h27) rv4Var.j(f99Var)).c.a.c, ((h27) rv4Var.j(f99Var)).c.a.d, 3);
                rv4Var.q(false);
            } else if (z3) {
                rv4Var.e0(-1949612094);
                f99 f99Var2 = j27.a;
                v72Var = v72.d(((h27) rv4Var.j(f99Var2)).c.d, ((h27) rv4Var.j(f99Var2)).c.a.a, ((h27) rv4Var.j(f99Var2)).c.a.b, null, null, 12);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1949603965);
                v72Var = ((h27) rv4Var.j(j27.a)).c.a;
                rv4Var.q(false);
            }
            nq7 v = nmd.v(tte.k(f, v72Var), rm1.g(((h27) rv4Var.j(j27.a)).a, 1.0f), lre.g);
            xt4 xt4Var = this.e;
            boolean f2 = rv4Var.f(xt4Var) | rv4Var.h(co4Var);
            Object P = rv4Var.P();
            Object obj6 = ax1.a;
            if (f2 || P == obj6) {
                P = new ro4(xt4Var, co4Var, 0);
                rv4Var.o0(P);
            }
            nq7 z6 = zbe.z(lbe.f(15, (vt4) P, v, null, false), 16.0f, 8.0f);
            xt4 xt4Var2 = this.f;
            boolean f3 = rv4Var.f(xt4Var2) | rv4Var.h(co4Var);
            Object P2 = rv4Var.P();
            if (f3 || P2 == obj6) {
                P2 = new ro4(xt4Var2, co4Var, 1);
                rv4Var.o0(P2);
            }
            vt4 vt4Var = (vt4) P2;
            xt4 xt4Var3 = this.C;
            boolean f4 = rv4Var.f(xt4Var3) | rv4Var.h(co4Var);
            Object P3 = rv4Var.P();
            if (f4 || P3 == obj6) {
                P3 = new ro4(xt4Var3, co4Var, 2);
                rv4Var.o0(P3);
            }
            twe.a(str, str2, this.c, equals, z5, ng3Var, z6, vt4Var, (vt4) P3, rv4Var, 512);
            rv4Var.q(false);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }
}
