package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rp5  reason: default package */
/* loaded from: classes3.dex */
public abstract class rp5 {
    public static final mfb a = new mfb(new k85(20));
    public static final mfb b = new mfb(new k85(21));
    public static final mfb c = new mfb(new k85(22));
    public static final ij1 d = new ij1(11);

    public static final nl5 a(wk3 wk3Var, rv4 rv4Var, int i) {
        boolean z;
        lu4 z45Var;
        ns2 ns2Var;
        wk3 wk3Var2;
        wk3Var.getClass();
        ns2 s = hma.s(fr9.a, rv4Var);
        ((tq9) rv4Var.j(vq9.b)).getClass();
        sq9 a2 = tq9.a(rv4Var);
        Object P = rv4Var.P();
        lh9 lh9Var = ax1.a;
        if (P == lh9Var) {
            P = new k85(24);
            rv4Var.o0(P);
        }
        vt4 vt4Var = (vt4) P;
        if ((((i & 14) ^ 6) > 4 && rv4Var.f(wk3Var)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        boolean f = z | rv4Var.f(a2) | rv4Var.h(s);
        Object P2 = rv4Var.P();
        if (!f && P2 != lh9Var) {
            z45Var = P2;
            ns2Var = s;
            wk3Var2 = wk3Var;
        } else {
            ns2Var = s;
            wk3Var2 = wk3Var;
            z45Var = new z45(wk3Var2, a2, ns2Var, (m42) null, 4);
            rv4Var.o0(z45Var);
        }
        return (nl5) fre.p(wk3Var2, ns2Var, a2, vt4Var, z45Var, rv4Var).getValue();
    }

    public static final vk8 b(wk3 wk3Var, rv4 rv4Var, int i) {
        boolean z;
        vk8 vk8Var;
        wk3Var.getClass();
        rv4Var.e0(-1508925367);
        ((tq9) rv4Var.j(vq9.b)).getClass();
        sq9 a2 = tq9.a(rv4Var);
        int i2 = i & 14;
        int i3 = i2 ^ 6;
        boolean z2 = true;
        if ((i3 > 4 && rv4Var.f(wk3Var)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        boolean f = z | rv4Var.f(a2);
        Object P = rv4Var.P();
        Object obj = ax1.a;
        if (f || P == obj) {
            P = vq9.a(wk3Var, a2).b;
            rv4Var.o0(P);
        }
        String str = (String) P;
        if (r4b.I(str, ".xml", true)) {
            rv4Var.e0(-1267601485);
            vk8Var = ase.z(c(wk3Var, rv4Var, i2), rv4Var);
            rv4Var.q(false);
        } else if (r4b.I(str, ".svg", true)) {
            rv4Var.e0(-1267490226);
            ns2 s = hma.s(fr9.a, rv4Var);
            r13 r13Var = (r13) rv4Var.j(dy1.h);
            Object P2 = rv4Var.P();
            if (P2 == obj) {
                P2 = new k85(25);
                rv4Var.o0(P2);
            }
            vt4 vt4Var = (vt4) P2;
            if ((i3 <= 4 || !rv4Var.f(wk3Var)) && (i & 6) != 4) {
                z2 = false;
            }
            boolean h = rv4Var.h(s) | z2 | rv4Var.f(r13Var);
            Object P3 = rv4Var.P();
            if (h || P3 == obj) {
                Object qp5Var = new qp5(wk3Var, s, r13Var, null, 0);
                s = s;
                r13Var = r13Var;
                rv4Var.o0(qp5Var);
                P3 = qp5Var;
            }
            vk8Var = (vk8) fre.p(wk3Var, s, r13Var, vt4Var, (lu4) P3, rv4Var).getValue();
            rv4Var.q(false);
        } else {
            rv4Var.e0(-1267441060);
            sl0 sl0Var = new sl0(a(wk3Var, rv4Var, i2));
            rv4Var.q(false);
            rv4Var.q(false);
            return sl0Var;
        }
        rv4Var.q(false);
        return vk8Var;
    }

    public static final ar5 c(wk3 wk3Var, rv4 rv4Var, int i) {
        boolean z;
        lu4 qp5Var;
        r13 r13Var;
        ns2 ns2Var;
        wk3 wk3Var2;
        wk3Var.getClass();
        ns2 s = hma.s(fr9.a, rv4Var);
        r13 r13Var2 = (r13) rv4Var.j(dy1.h);
        Object P = rv4Var.P();
        lh9 lh9Var = ax1.a;
        if (P == lh9Var) {
            P = new k85(23);
            rv4Var.o0(P);
        }
        vt4 vt4Var = (vt4) P;
        if ((((i & 14) ^ 6) > 4 && rv4Var.f(wk3Var)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        boolean h = z | rv4Var.h(s) | rv4Var.f(r13Var2);
        Object P2 = rv4Var.P();
        if (!h && P2 != lh9Var) {
            qp5Var = P2;
            r13Var = r13Var2;
            ns2Var = s;
            wk3Var2 = wk3Var;
        } else {
            r13Var = r13Var2;
            ns2Var = s;
            wk3Var2 = wk3Var;
            qp5Var = new qp5(wk3Var2, ns2Var, r13Var, null, 1);
            rv4Var.o0(qp5Var);
        }
        return (ar5) fre.p(wk3Var2, ns2Var, r13Var, vt4Var, qp5Var, rv4Var).getValue();
    }
}
