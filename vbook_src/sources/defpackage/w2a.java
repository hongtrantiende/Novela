package defpackage;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w2a  reason: default package */
/* loaded from: classes.dex */
public final class w2a extends ti3 implements l86, z7a {
    public wi f0;
    public li4 g0;
    public final x08 h0;
    public final wt2 i0;
    public final t3a j0;
    public final t2a k0;
    public final hn4 l0;
    public final i22 m0;
    public el7 n0;
    public v2a o0;
    public ds7 p0;
    public rjc q0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [mq7, f03, ev0] */
    /* JADX WARN: Type inference failed for: r10v0, types: [m03, w2a] */
    /* JADX WARN: Type inference failed for: r1v2, types: [li4] */
    public w2a(wi wiVar, hv0 hv0Var, li4 li4Var, yu7 yu7Var, ff8 ff8Var, x2a x2aVar, boolean z, boolean z2) {
        super(r2a.a, z, yu7Var, ff8Var);
        wt2 wt2Var;
        this.f0 = wiVar;
        this.g0 = li4Var;
        x08 x08Var = new x08();
        this.h0 = x08Var;
        wt2 wt2Var2 = new wt2(ade.y(r2a.d));
        this.i0 = wt2Var2;
        wi wiVar2 = this.f0;
        ?? r1 = this.g0;
        if (r1 == 0) {
            wt2Var = wt2Var2;
        } else {
            wt2Var = r1;
        }
        t3a t3aVar = new t3a(x2aVar, wiVar2, wt2Var, ff8Var, z2, x08Var, this, new u2a(this, 0));
        this.j0 = t3aVar;
        t2a t2aVar = new t2a(t3aVar, z);
        this.k0 = t2aVar;
        hn4 hn4Var = new hn4(2, null, 10);
        H1(hn4Var);
        this.l0 = hn4Var;
        i22 i22Var = new i22(ff8Var, t3aVar, z2, hv0Var, new u2a(this, 1));
        H1(i22Var);
        this.m0 = i22Var;
        H1(new b18(t2aVar, x08Var));
        ?? mq7Var = new mq7();
        mq7Var.K = i22Var;
        H1(mq7Var);
    }

    @Override // defpackage.l86
    public final boolean H(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.ti3
    public final Object O1(si3 si3Var, si3 si3Var2) {
        t3a t3aVar = this.j0;
        Object g = t3aVar.g(jw7.b, new jk8(si3Var, t3aVar, (m42) null, 17), si3Var2);
        if (g == n82.a) {
            return g;
        }
        return pvc.a;
    }

    @Override // defpackage.ti3
    public final void U1(th3 th3Var) {
        z87.v(this.h0.c(), null, null, new z38(th3Var, this, null, 17), 3);
    }

    @Override // defpackage.ti3
    public final boolean Z1() {
        boolean z;
        t3a t3aVar = this.j0;
        if (!t3aVar.a.a()) {
            wi wiVar = t3aVar.b;
            if (wiVar != null) {
                z = wiVar.e();
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // defpackage.ti3, defpackage.c19
    public final void b0(r09 r09Var, s09 s09Var, long j) {
        int i;
        List list = r09Var.a;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            } else if (((Boolean) this.N.invoke(new i19(((z09) list.get(i2)).i))).booleanValue()) {
                super.b0(r09Var, s09Var, j);
                break;
            } else {
                i2++;
            }
        }
        if (this.O) {
            if (this.W == null) {
                cx4 cx4Var = new cx4(this);
                H1(cx4Var);
                this.W = cx4Var;
            }
            s09 s09Var2 = s09.a;
            t3a t3aVar = this.j0;
            if (s09Var == s09Var2 && r09Var.f == 6) {
                if (this.p0 == null) {
                    this.p0 = new ds7(t3aVar, new mu9(ViewConfiguration.get(xoe.o(this).getContext())), new su1(2, this, w2a.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 1), voe.v(this).V);
                }
                ds7 ds7Var = this.p0;
                if (ds7Var != null) {
                    m82 v1 = v1();
                    if (ds7Var.h == null) {
                        ds7Var.h = z87.v(v1, null, null, new c95(ds7Var, null, 25), 3);
                    }
                }
            }
            ds7 ds7Var2 = this.p0;
            s09 s09Var3 = s09.b;
            if (ds7Var2 != null && r09Var.f == 6) {
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size2) {
                        if (((z09) list.get(i3)).c()) {
                            break;
                        }
                        i3++;
                    } else {
                        if (s09Var == s09Var2 && ds7Var2.a) {
                            ds7Var2.n(r09Var);
                            u57.a(r09Var);
                        }
                        if (s09Var == s09Var3 && !ds7Var2.a && ds7Var2.n(r09Var)) {
                            u57.a(r09Var);
                        }
                    }
                }
            }
            if (s09Var == s09Var2 && ((i = r09Var.f) == 10 || i == 11 || i == 12)) {
                if (this.q0 == null) {
                    this.q0 = new rjc(t3aVar, new su1(2, this, w2a.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4, 2), voe.v(this).V);
                }
                rjc rjcVar = this.q0;
                if (rjcVar != null) {
                    m82 v12 = v1();
                    if (rjcVar.g == null) {
                        rjcVar.g = z87.v(v12, null, null, new byb(rjcVar, null, 9), 3);
                    }
                }
            }
            rjc rjcVar2 = this.q0;
            if (rjcVar2 != null) {
                int i4 = r09Var.f;
                if (i4 == 10 || i4 == 11 || i4 == 12) {
                    int size3 = list.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        if (((z09) list.get(i5)).c()) {
                            return;
                        }
                    }
                    if (s09Var == s09Var2 && rjcVar2.a) {
                        rjcVar2.l(r09Var);
                        u57.a(r09Var);
                    }
                    if (s09Var == s09Var3 && !rjcVar2.a && rjcVar2.l(r09Var)) {
                        u57.a(r09Var);
                    }
                }
            }
        }
    }

    public final void c2(wi wiVar, hv0 hv0Var, li4 li4Var, yu7 yu7Var, ff8 ff8Var, x2a x2aVar, boolean z, boolean z2) {
        boolean z3;
        li4 li4Var2;
        boolean z4 = true;
        boolean z5 = false;
        if (this.O != z) {
            this.k0.b = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (li4Var == null) {
            li4Var2 = this.i0;
        } else {
            li4Var2 = li4Var;
        }
        t3a t3aVar = this.j0;
        if (!c16.i(t3aVar.a, x2aVar)) {
            t3aVar.a = x2aVar;
            z5 = true;
        }
        t3aVar.b = wiVar;
        if (t3aVar.d != ff8Var) {
            t3aVar.d = ff8Var;
            z5 = true;
        }
        if (t3aVar.e != z2) {
            t3aVar.e = z2;
        } else {
            z4 = z5;
        }
        t3aVar.c = li4Var2;
        t3aVar.f = this.h0;
        i22 i22Var = this.m0;
        i22Var.K = ff8Var;
        i22Var.M = z2;
        i22Var.N = hv0Var;
        this.f0 = wiVar;
        this.g0 = li4Var;
        az9 az9Var = r2a.a;
        ff8 ff8Var2 = t3aVar.d;
        ff8 ff8Var3 = ff8.a;
        if (ff8Var2 != ff8Var3) {
            ff8Var3 = ff8.b;
        }
        b2(az9Var, z, yu7Var, ff8Var3, z4);
        if (z3) {
            this.n0 = null;
            this.o0 = null;
            ak0.t(this);
        }
    }

    @Override // defpackage.l86
    public final boolean g0(KeyEvent keyEvent) {
        float f;
        long floatToRawIntBits;
        float f2;
        boolean z = false;
        if (!this.O || ((!e86.a(gae.i(keyEvent), e86.J) && !e86.a(rae.a(keyEvent.getKeyCode()), e86.I)) || gae.j(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        if (this.j0.d == ff8.a) {
            z = true;
        }
        i22 i22Var = this.m0;
        if (z) {
            int I1 = (int) (i22Var.I1() & 4294967295L);
            if (e86.a(rae.a(keyEvent.getKeyCode()), e86.I)) {
                f2 = I1;
            } else {
                f2 = -I1;
            }
            floatToRawIntBits = (Float.floatToRawIntBits(nae.e) << 32) | (4294967295L & Float.floatToRawIntBits(f2));
        } else {
            int I12 = (int) (i22Var.I1() >> 32);
            if (e86.a(rae.a(keyEvent.getKeyCode()), e86.I)) {
                f = I12;
            } else {
                f = -I12;
            }
            floatToRawIntBits = (Float.floatToRawIntBits(nae.e) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        }
        z87.v(v1(), null, null, new v2a(this, floatToRawIntBits, null, 0), 3);
        return true;
    }

    @Override // defpackage.z7a
    public final void m1(l8a l8aVar) {
        if (this.O && (this.n0 == null || this.o0 == null)) {
            this.n0 = new el7(this, 11);
            this.o0 = new v2a(this, null);
        }
        el7 el7Var = this.n0;
        if (el7Var != null) {
            r76[] r76VarArr = j8a.a;
            l8aVar.a(s7a.d, new g4(null, el7Var));
        }
        v2a v2aVar = this.o0;
        if (v2aVar != null) {
            r76[] r76VarArr2 = j8a.a;
            l8aVar.a(s7a.e, v2aVar);
        }
    }

    @Override // defpackage.f03
    public final void p() {
        n0();
        if (this.J) {
            r13 r13Var = voe.v(this).V;
            wt2 wt2Var = this.i0;
            wt2Var.getClass();
            wt2Var.a = ade.y(r13Var);
        }
        ds7 ds7Var = this.p0;
        if (ds7Var != null) {
            ds7Var.d = voe.v(this).V;
        }
        rjc rjcVar = this.q0;
        if (rjcVar != null) {
            rjcVar.d = voe.v(this).V;
        }
    }

    @Override // defpackage.mq7
    public final boolean w1() {
        return false;
    }

    @Override // defpackage.mq7
    public final void z1() {
        if (this.J) {
            r13 r13Var = voe.v(this).V;
            wt2 wt2Var = this.i0;
            wt2Var.getClass();
            wt2Var.a = ade.y(r13Var);
        }
        ds7 ds7Var = this.p0;
        if (ds7Var != null) {
            ds7Var.d = voe.v(this).V;
        }
        rjc rjcVar = this.q0;
        if (rjcVar != null) {
            rjcVar.d = voe.v(this).V;
        }
    }

    @Override // defpackage.ti3
    public final void T1(long j) {
    }
}
