package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z32  reason: default package */
/* loaded from: classes3.dex */
public final class z32 implements nu4 {
    public final /* synthetic */ m32 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ aw7 d;

    public z32(m32 m32Var, boolean z, xt4 xt4Var, aw7 aw7Var) {
        this.a = m32Var;
        this.b = z;
        this.c = xt4Var;
        this.d = aw7Var;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        v72 d;
        int i;
        do9 do9Var = (do9) obj;
        ((Boolean) obj2).getClass();
        rv4 rv4Var = (rv4) obj3;
        int intValue = ((Number) obj4).intValue();
        do9Var.getClass();
        if ((intValue & 6) == 0) {
            if (rv4Var.f(do9Var)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        if ((intValue & Token.DO) != 130) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            nq7 f = pna.f(kq7.a, 1.0f);
            if (!this.b) {
                rv4Var.e0(1115925168);
                d = ((h27) rv4Var.j(j27.a)).c.a;
                rv4Var.q(false);
            } else {
                rv4Var.e0(1115927899);
                f99 f99Var = j27.a;
                d = v72.d(((h27) rv4Var.j(f99Var)).c.d, ((h27) rv4Var.j(f99Var)).c.a.a, ((h27) rv4Var.j(f99Var)).c.a.b, null, null, 12);
                rv4Var.q(false);
            }
            nq7 A = zbe.A(nmd.v(tte.k(f, d), rm1.g(((h27) rv4Var.j(j27.a)).a, 1.0f), lre.g), 12.0f, nae.e, 2);
            xt4 xt4Var = this.c;
            boolean f2 = rv4Var.f(xt4Var);
            aw7 aw7Var = this.d;
            boolean f3 = f2 | rv4Var.f(aw7Var);
            Object P = rv4Var.P();
            Object obj5 = ax1.a;
            if (f3 || P == obj5) {
                P = new y32(0, xt4Var, aw7Var);
                rv4Var.o0(P);
            }
            vt4 vt4Var = (vt4) P;
            boolean f4 = rv4Var.f(aw7Var);
            m32 m32Var = this.a;
            boolean h = f4 | rv4Var.h(m32Var) | rv4Var.f(xt4Var);
            Object P2 = rv4Var.P();
            if (h || P2 == obj5) {
                P2 = new sg0(xt4Var, aw7Var, m32Var, 1);
                rv4Var.o0(P2);
            }
            lpe.g(do9Var, m32Var, A, vt4Var, (xt4) P2, rv4Var, (intValue & 14) | 64);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }
}
