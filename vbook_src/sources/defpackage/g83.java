package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g83  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class g83 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g83(nnb nnbVar, List list, xt4 xt4Var, vt4 vt4Var) {
        this.a = 18;
        this.b = nnbVar;
        this.d = list;
        this.e = xt4Var;
        this.c = vt4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    private final Object a(Object obj, Object obj2, Object obj3) {
        boolean z;
        zn1 zn1Var;
        lk0 lk0Var;
        kq7 kq7Var;
        vt4 vt4Var;
        rv4 rv4Var;
        ?? r5;
        int i;
        q54 q54Var = (q54) this.b;
        vt4 vt4Var2 = (vt4) this.c;
        lu4 lu4Var = (lu4) this.d;
        xt4 xt4Var = (xt4) this.e;
        zn1 zn1Var2 = (zn1) obj;
        rv4 rv4Var2 = (rv4) obj2;
        int intValue = ((Integer) obj3).intValue();
        lk0 lk0Var2 = kh5.J;
        zn1Var2.getClass();
        if ((intValue & 6) == 0) {
            if (rv4Var2.f(zn1Var2)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        boolean z2 = false;
        if ((intValue & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(intValue & 1, z)) {
            boolean isEmpty = q54Var.a.isEmpty();
            kq7 kq7Var2 = kq7.a;
            if (isEmpty) {
                rv4Var2.e0(1631373775);
                String A = yqe.A((y3b) s2b.Y.getValue(), rv4Var2);
                tza tzaVar = j27.a;
                cvb.c(A, zn1Var2.a(kq7Var2, lk0Var2), zl1.b(0.8f, ((h27) rv4Var2.j(tzaVar)).a.q), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.j, rv4Var2, 0, 0, 131064);
                rv4 rv4Var3 = rv4Var2;
                rv4Var3.q(false);
                zn1Var = zn1Var2;
                lk0Var = lk0Var2;
                kq7Var = kq7Var2;
                r5 = 0;
                vt4Var = vt4Var2;
                rv4Var = rv4Var3;
            } else {
                rv4Var2.e0(1631754238);
                ArrayList arrayList = q54Var.a;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    r54 r54Var = (r54) arrayList.get(i2);
                    nq7 f = pna.f(kq7Var2, 1.0f);
                    tza tzaVar2 = j27.a;
                    nq7 k = tte.k(f, ((h27) rv4Var2.j(tzaVar2)).c.c);
                    int i3 = i2;
                    long g = rm1.g(((h27) rv4Var2.j(tzaVar2)).a, 6.0f);
                    ba5 ba5Var = lre.g;
                    nq7 v = nmd.v(k, g, ba5Var);
                    boolean f2 = rv4Var2.f(lu4Var) | rv4Var2.h(r54Var);
                    Object P = rv4Var2.P();
                    lh9 lh9Var = ax1.a;
                    if (f2 || P == lh9Var) {
                        P = new u93(12, lu4Var, r54Var);
                        rv4Var2.o0(P);
                    }
                    ArrayList arrayList2 = arrayList;
                    nq7 z3 = zbe.z(lbe.f(15, (vt4) P, v, null, false), 14.0f, 12.0f);
                    gv9 a = ev9.a(lz.a, kh5.G, rv4Var2, 48);
                    int hashCode = Long.hashCode(rv4Var2.T);
                    xt8 l = rv4Var2.l();
                    nq7 p = lye.p(rv4Var2, z3);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var2.i0();
                    lu4 lu4Var2 = lu4Var;
                    if (rv4Var2.S) {
                        rv4Var2.k(zx1Var);
                    } else {
                        rv4Var2.r0();
                    }
                    np npVar = qw1.f;
                    jce.F(npVar, rv4Var2, a);
                    np npVar2 = qw1.e;
                    jce.F(npVar2, rv4Var2, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    np npVar3 = qw1.g;
                    jce.F(npVar3, rv4Var2, valueOf);
                    kg kgVar = qw1.h;
                    jce.C(kgVar, rv4Var2);
                    int i4 = size;
                    np npVar4 = qw1.d;
                    zn1 zn1Var3 = zn1Var2;
                    vt4 vt4Var3 = vt4Var2;
                    we6 f3 = s21.f(rv4Var2, p, npVar4, 1.0f, true);
                    lk0 lk0Var3 = lk0Var2;
                    xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
                    kq7 kq7Var3 = kq7Var2;
                    int hashCode2 = Long.hashCode(rv4Var2.T);
                    xt8 l2 = rv4Var2.l();
                    nq7 p2 = lye.p(rv4Var2, f3);
                    rv4Var2.i0();
                    if (rv4Var2.S) {
                        rv4Var2.k(zx1Var);
                    } else {
                        rv4Var2.r0();
                    }
                    jce.F(npVar, rv4Var2, a2);
                    jce.F(npVar2, rv4Var2, l2);
                    s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
                    jce.F(npVar4, rv4Var2, p2);
                    rv4 rv4Var4 = rv4Var2;
                    cvb.c(r54Var.a, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((h27) rv4Var2.j(tzaVar2)).b.j, rv4Var4, 0, 24960, 110590);
                    cvb.c(r54Var.b, null, zl1.b(0.5f, ((zl1) rv4Var4.j(r12.a)).a), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((h27) rv4Var4.j(tzaVar2)).b.l, rv4Var4, 0, 24960, 110586);
                    s21.x(rv4Var4, true, kq7Var3, 8.0f, rv4Var4);
                    nq7 k2 = tte.k(pna.n(kq7Var3, 32.0f), uu9.a);
                    long j = zl1.f;
                    nq7 v2 = nmd.v(k2, zl1.b(0.12f, j), ba5Var);
                    boolean f4 = rv4Var4.f(xt4Var) | rv4Var4.h(r54Var);
                    Object P2 = rv4Var4.P();
                    if (f4 || P2 == lh9Var) {
                        P2 = new u93(13, xt4Var, r54Var);
                        rv4Var4.o0(P2);
                    }
                    nq7 y = zbe.y(lbe.f(15, (vt4) P2, v2, null, false), 6.0f);
                    b37 d = fu0.d(kh5.a, false);
                    int hashCode3 = Long.hashCode(rv4Var4.T);
                    xt8 l3 = rv4Var4.l();
                    nq7 p3 = lye.p(rv4Var4, y);
                    rv4Var4.i0();
                    if (rv4Var4.S) {
                        rv4Var4.k(zx1Var);
                    } else {
                        rv4Var4.r0();
                    }
                    jce.F(npVar, rv4Var4, d);
                    jce.F(npVar2, rv4Var4, l3);
                    s21.t(hashCode3, rv4Var4, npVar3, rv4Var4, kgVar);
                    jce.F(npVar4, rv4Var4, p3);
                    nk5.a(rp5.c((wk3) jk3.H.getValue(), rv4Var4, 0), null, pu0.a.a(pna.n(kq7Var3, 20.0f), kh5.e), j, rv4Var4, 3120, 0);
                    rv4Var2 = rv4Var4;
                    xbe.i(rv4Var2, hl5.e(rv4Var2, true, true, kq7Var3, 8.0f));
                    i2 = i3 + 1;
                    zn1Var2 = zn1Var3;
                    kq7Var2 = kq7Var3;
                    arrayList = arrayList2;
                    lu4Var = lu4Var2;
                    size = i4;
                    vt4Var2 = vt4Var3;
                    lk0Var2 = lk0Var3;
                    z2 = false;
                }
                zn1Var = zn1Var2;
                lk0Var = lk0Var2;
                kq7Var = kq7Var2;
                boolean z4 = z2;
                vt4Var = vt4Var2;
                rv4Var2.q(z4);
                r5 = z4;
                rv4Var = rv4Var2;
            }
            xbe.i(rv4Var, pna.h(kq7Var, 12.0f));
            z1d.f(rp5.c((wk3) jk3.a.getValue(), rv4Var, r5), yqe.A((y3b) v1b.f.getValue(), rv4Var), false, null, zn1Var.a(kq7Var, lk0Var), null, null, null, vt4Var, rv4Var, 0, 236);
        } else {
            rv4Var2.X();
        }
        return pvc.a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        boolean z;
        l54 l54Var = (l54) this.b;
        cz7 cz7Var = (cz7) this.c;
        e13 e13Var = (e13) this.d;
        i44 i44Var = (i44) this.e;
        rv4 rv4Var = (rv4) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((xg6) obj).getClass();
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            nq7 f = pna.f(kq7.a, 1.0f);
            boolean f2 = rv4Var.f(cz7Var) | rv4Var.h(l54Var);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (f2 || P == lh9Var) {
                P = new u93(9, cz7Var, l54Var);
                rv4Var.o0(P);
            }
            vt4 vt4Var = (vt4) P;
            boolean f3 = rv4Var.f(e13Var) | rv4Var.h(l54Var);
            Object P2 = rv4Var.P();
            if (f3 || P2 == lh9Var) {
                P2 = new u93(10, e13Var, l54Var);
                rv4Var.o0(P2);
            }
            vt4 vt4Var2 = (vt4) P2;
            boolean f4 = rv4Var.f(i44Var) | rv4Var.h(l54Var);
            Object P3 = rv4Var.P();
            if (f4 || P3 == lh9Var) {
                P3 = new u93(11, i44Var, l54Var);
                rv4Var.o0(P3);
            }
            oue.j(l54Var, f, vt4Var, vt4Var2, (vt4) P3, rv4Var, 48, 0);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        boolean z;
        iw2 iw2Var = (iw2) this.b;
        rj8 rj8Var = (rj8) this.c;
        cz7 cz7Var = (cz7) this.d;
        aw7 aw7Var = (aw7) this.e;
        rv4 rv4Var = (rv4) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((qr) obj).getClass();
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            long j = ((h27) rv4Var.j(j27.a)).a.h;
            ec6 ec6Var = ((dc6) rv4Var.j(zf0.a)).a;
            dj4 dj4Var = new dj4(2.0f, sve.m, sve.k, sve.l);
            boolean f = rv4Var.f(iw2Var) | rv4Var.f(rj8Var) | rv4Var.f(cz7Var) | rv4Var.f(aw7Var);
            Object P = rv4Var.P();
            if (f || P == ax1.a) {
                P = new xw0(iw2Var, rj8Var, cz7Var, aw7Var);
                rv4Var.o0(P);
            }
            wq9.c((vt4) P, null, null, ec6Var, j, 0L, dj4Var, zve.a, rv4Var, 100663296, Token.SET);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        boolean z;
        String str;
        np npVar;
        float f;
        boolean z2;
        zx1 zx1Var;
        String str2;
        mk0 mk0Var;
        np npVar2;
        zx1 zx1Var2;
        np npVar3;
        np npVar4;
        float f2;
        float f3;
        float f4;
        boolean z3;
        kd4 kd4Var = (kd4) this.b;
        kd4 kd4Var2 = (kd4) this.c;
        s9 s9Var = (s9) this.d;
        yya yyaVar = (yya) this.e;
        rv4 rv4Var = (rv4) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((zn1) obj).getClass();
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            kq7 kq7Var = kq7.a;
            nq7 A = zbe.A(zbe.x(rte.C(pna.f(kq7Var, 1.0f), rte.u(rv4Var), 14), mwe.g(14, rv4Var)), 16.0f, nae.e, 2);
            xn1 a = wn1.a(new hz(12.0f, true, new vs(2)), kh5.I, rv4Var, 6);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, A);
            rw1.k.getClass();
            zx1 zx1Var3 = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var3);
            } else {
                rv4Var.r0();
            }
            np npVar5 = qw1.f;
            jce.F(npVar5, rv4Var, a);
            np npVar6 = qw1.e;
            jce.F(npVar6, rv4Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar7 = qw1.g;
            jce.F(npVar7, rv4Var, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var);
            np npVar8 = qw1.d;
            jce.F(npVar8, rv4Var, p);
            xbe.i(rv4Var, pna.h(kq7Var, 4.0f));
            String str3 = null;
            cvb.c(yqe.A((y3b) v1b.U.getValue(), rv4Var), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).h, rv4Var, 0, 0, 131070);
            String A2 = yqe.A((y3b) v1b.P.getValue(), rv4Var);
            String A3 = yqe.A((y3b) v1b.Q.getValue(), rv4Var);
            f76 f76Var = ((q9) yyaVar.getValue()).a;
            if (f76Var != null) {
                str = f76Var.getName();
            } else {
                str = null;
            }
            boolean f5 = rv4Var.f(kd4Var);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (f5 || P == lh9Var) {
                P = new fe1(kd4Var, 13);
                rv4Var.o0(P);
            }
            ie2.a(0, (vt4) P, rv4Var, null, A2, A3, str);
            String A4 = yqe.A((y3b) v1b.V.getValue(), rv4Var);
            String A5 = yqe.A((y3b) v1b.W.getValue(), rv4Var);
            f76 f76Var2 = ((q9) yyaVar.getValue()).b;
            if (f76Var2 != null) {
                str3 = f76Var2.getName();
            }
            String str4 = str3;
            boolean f6 = rv4Var.f(kd4Var2);
            Object P2 = rv4Var.P();
            if (f6 || P2 == lh9Var) {
                P2 = new fe1(kd4Var2, 14);
                rv4Var.o0(P2);
            }
            ie2.a(0, (vt4) P2, rv4Var, null, A4, A5, str4);
            cvb.c(yqe.A((y3b) v1b.Z.getValue(), rv4Var), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).i, rv4Var, 0, 0, 131070);
            String str5 = ((q9) yyaVar.getValue()).c;
            boolean f7 = rv4Var.f(s9Var);
            Object P3 = rv4Var.P();
            if (!f7 && P3 != lh9Var) {
                npVar = npVar5;
                f = 1.0f;
                z2 = false;
            } else {
                npVar = npVar5;
                f = 1.0f;
                z2 = false;
                mp6 mp6Var = new mp6(1, s9Var, s9.class, "setName", "setName(Ljava/lang/String;)V", 0, 2);
                rv4Var.o0(mp6Var);
                P3 = mp6Var;
            }
            xt4 xt4Var = (xt4) ((i76) P3);
            np npVar9 = npVar;
            uwe.h(str5, xt4Var, pna.f(kq7Var, f), false, false, null, xwe.a, null, null, null, k4b.j0(((q9) yyaVar.getValue()).c), null, null, null, true, 0, 0, r0f.z(rv4Var).b, null, rv4Var, 1573248, 12582912, 6152120);
            nq7 f8 = pna.f(kq7Var, f);
            hz hzVar = new hz(12.0f, true, new vs(2));
            mk0 mk0Var2 = kh5.F;
            gv9 a2 = ev9.a(hzVar, mk0Var2, rv4Var, 6);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, f8);
            rv4Var.i0();
            if (rv4Var.S) {
                zx1Var = zx1Var3;
                rv4Var.k(zx1Var);
            } else {
                zx1Var = zx1Var3;
                rv4Var.r0();
            }
            jce.F(npVar9, rv4Var, a2);
            jce.F(npVar6, rv4Var, l2);
            s21.t(hashCode2, rv4Var, npVar7, rv4Var, kgVar);
            jce.F(npVar8, rv4Var, p2);
            String str6 = ((q9) yyaVar.getValue()).d;
            boolean f9 = rv4Var.f(s9Var);
            Object P4 = rv4Var.P();
            if (!f9 && P4 != lh9Var) {
                npVar4 = npVar8;
                npVar3 = npVar7;
                str2 = str6;
                npVar2 = npVar6;
                mk0Var = mk0Var2;
                zx1Var2 = zx1Var;
                f2 = 1.0f;
            } else {
                str2 = str6;
                mk0Var = mk0Var2;
                npVar2 = npVar6;
                zx1Var2 = zx1Var;
                npVar3 = npVar7;
                npVar4 = npVar8;
                f2 = 1.0f;
                mp6 mp6Var2 = new mp6(1, s9Var, s9.class, "setLanguage", "setLanguage(Ljava/lang/String;)V", 0, 3);
                rv4Var.o0(mp6Var2);
                P4 = mp6Var2;
            }
            xt4 xt4Var2 = (xt4) ((i76) P4);
            if (f2 <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (f2 > Float.MAX_VALUE) {
                f3 = Float.MAX_VALUE;
            } else {
                f3 = f2;
            }
            ie2.c(0, xt4Var2, rv4Var, new we6(f3, true), str2);
            m9 m9Var = ((q9) yyaVar.getValue()).e;
            boolean f10 = rv4Var.f(s9Var);
            Object P5 = rv4Var.P();
            if (f10 || P5 == lh9Var) {
                mp6 mp6Var3 = new mp6(1, s9Var, s9.class, "setGender", "setGender(Lcom/reader/data/reader/text/core/tts/engine/ai/model/AiTtsGender;)V", 0, 4);
                rv4Var.o0(mp6Var3);
                P5 = mp6Var3;
            }
            xt4 xt4Var3 = (xt4) ((i76) P5);
            if (f2 <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (f2 > Float.MAX_VALUE) {
                f4 = Float.MAX_VALUE;
            } else {
                f4 = f2;
            }
            ie2.b(m9Var, xt4Var3, new we6(f4, true), rv4Var, 0);
            rv4Var.q(true);
            nq7 y = zbe.y(nmd.v(tte.k(pna.f(kq7Var, f2), r0f.z(rv4Var).c), rm1.g(r0f.y(rv4Var), 2.0f), lre.g), 12.0f);
            gv9 a3 = ev9.a(new hz(8.0f, true, new vs(2)), mk0Var, rv4Var, 6);
            int hashCode3 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p3 = lye.p(rv4Var, y);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var2);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar9, rv4Var, a3);
            jce.F(npVar2, rv4Var, l3);
            s21.t(hashCode3, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p3);
            nk5.a(rp5.c((wk3) ok3.p.getValue(), rv4Var, 0), null, pna.n(kq7Var, 20.0f), r0f.y(rv4Var).s, rv4Var, 432, 0);
            float f11 = f2;
            cvb.c(yqe.A((y3b) v1b.S.getValue(), rv4Var), null, r0f.y(rv4Var).s, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).l, rv4Var, 0, 0, 131066);
            rv4Var.q(true);
            String A6 = yqe.A((y3b) v1b.I.getValue(), rv4Var);
            q9 q9Var = (q9) yyaVar.getValue();
            if (q9Var.a != null && q9Var.b != null && !k4b.j0(q9Var.c) && !q9Var.f) {
                z3 = true;
            } else {
                z3 = false;
            }
            nq7 f12 = pna.f(kq7Var, f11);
            boolean f13 = rv4Var.f(s9Var);
            Object P6 = rv4Var.P();
            if (f13 || P6 == lh9Var) {
                v7 v7Var = new v7(0, s9Var, s9.class, "confirm", "confirm()V", 0, 27);
                rv4Var.o0(v7Var);
                P6 = v7Var;
            }
            z1d.f(null, A6, z3, null, f12, null, null, null, (vt4) ((i76) P6), rv4Var, 24576, 233);
            hl5.w(kq7Var, 12.0f, rv4Var, true);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        Map map = (Map) this.b;
        m9 m9Var = (m9) this.c;
        xt4 xt4Var = (xt4) this.e;
        aw7 aw7Var = (aw7) this.d;
        rv4 rv4Var = (rv4) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((zn1) obj).getClass();
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            for (Map.Entry entry : map.entrySet()) {
                m9 m9Var2 = (m9) entry.getKey();
                String str = (String) entry.getValue();
                if (m9Var2 == m9Var) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Boolean valueOf = Boolean.valueOf(z2);
                boolean f = rv4Var.f(xt4Var) | rv4Var.d(m9Var2.ordinal());
                Object P = rv4Var.P();
                if (f || P == ax1.a) {
                    P = new se0(19, xt4Var, m9Var2, aw7Var);
                    rv4Var.o0(P);
                }
                iue.g(str, null, null, valueOf, null, (vt4) P, rv4Var, 0, 22);
            }
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        boolean z;
        mv mvVar = (mv) this.b;
        String str = (String) this.c;
        xt4 xt4Var = (xt4) this.e;
        xt4 xt4Var2 = (xt4) this.d;
        rv4 rv4Var = (rv4) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((zn1) obj).getClass();
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            boolean f = rv4Var.f(xt4Var) | rv4Var.f(xt4Var2);
            Object P = rv4Var.P();
            if (f || P == ax1.a) {
                P = new xw1(xt4Var, xt4Var2, 3);
                rv4Var.o0(P);
            }
            c16.a(mvVar, str, (xt4) P, zbe.x(pna.f(kq7.a, 1.0f), mwe.f(14, rv4Var, false)), rv4Var, 0);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        boolean z;
        nnb nnbVar = (nnb) this.b;
        List list = (List) this.d;
        xt4 xt4Var = (xt4) this.e;
        vt4 vt4Var = (vt4) this.c;
        rv4 rv4Var = (rv4) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((xg6) obj).getClass();
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            ctd.u(nnbVar.a, list, zbe.z(pna.f(kq7.a, 1.0f), 12.0f, 8.0f), xt4Var, vt4Var, rv4Var, 0);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        boolean z;
        su0 su0Var = (su0) this.b;
        String str = (String) this.c;
        List list = (List) this.d;
        lu4 lu4Var = (lu4) this.e;
        rv4 rv4Var = (rv4) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((zn1) obj).getClass();
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            s9e.k(str, list, mwe.g(14, rv4Var), pna.j(pna.f(kq7.a, 1.0f), nae.e, su0Var.c() * 0.8f, 1), lu4Var, rv4Var, 0, 0);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        mu4 mu4Var = (mu4) this.b;
        nu4 nu4Var = (nu4) this.c;
        aw7 aw7Var = (aw7) this.e;
        String str = (String) obj;
        String str2 = (String) obj2;
        f76 f76Var = (f76) obj3;
        str.getClass();
        str2.getClass();
        ((aw7) this.d).setValue(Boolean.FALSE);
        if (((pn1) aw7Var.getValue()).a.length() == 0) {
            mu4Var.c(str, str2, f76Var);
        } else {
            nu4Var.h(((pn1) aw7Var.getValue()).a, str, str2, f76Var);
        }
        return pvc.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0326, code lost:
        if (r12 == r11) goto L152;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object q(java.lang.Object r58, java.lang.Object r59, java.lang.Object r60) {
        /*
            Method dump skipped, instructions count: 2599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g83.q(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object r(Object obj, Object obj2, Object obj3) {
        boolean z;
        aw7 aw7Var = (aw7) this.b;
        aw7 aw7Var2 = (aw7) this.c;
        aw7 aw7Var3 = (aw7) this.d;
        yya yyaVar = (yya) this.e;
        rv4 rv4Var = (rv4) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((hv9) obj).getClass();
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            ar5 c = rp5.c((wk3) jk3.P.getValue(), rv4Var, 0);
            boolean f = rv4Var.f(aw7Var);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (f || P == lh9Var) {
                P = new ao7(aw7Var, 27);
                rv4Var.o0(P);
            }
            kwe.d(c, null, 0L, (vt4) P, rv4Var, 0, 6);
            if (!((uja) yyaVar.getValue()).b.isEmpty()) {
                rv4Var.e0(1864970112);
                ar5 c2 = rp5.c((wk3) jk3.b0.getValue(), rv4Var, 0);
                boolean f2 = rv4Var.f(aw7Var2);
                Object P2 = rv4Var.P();
                if (f2 || P2 == lh9Var) {
                    P2 = new ao7(aw7Var2, 28);
                    rv4Var.o0(P2);
                }
                kwe.d(c2, null, 0L, (vt4) P2, rv4Var, 0, 6);
                rv4Var.q(false);
            } else {
                rv4Var.e0(1865158468);
                rv4Var.q(false);
            }
            ar5 c3 = rp5.c((wk3) jk3.H.getValue(), rv4Var, 0);
            long j = ((h27) rv4Var.j(j27.a)).a.w;
            boolean f3 = rv4Var.f(aw7Var3);
            Object P3 = rv4Var.P();
            if (f3 || P3 == lh9Var) {
                P3 = new ao7(aw7Var3, 29);
                rv4Var.o0(P3);
            }
            kwe.d(c3, null, j, (vt4) P3, rv4Var, 0, 2);
            xbe.i(rv4Var, pna.s(kq7.a, 8.0f));
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object s(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        c0b c0bVar = (c0b) this.b;
        xt4 xt4Var = (xt4) this.e;
        vt4 vt4Var = (vt4) this.c;
        wza wzaVar = (wza) this.d;
        rv4 rv4Var = (rv4) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((xg6) obj).getClass();
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            qq0 qq0Var = c0bVar.e;
            if (c0bVar.f == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            owe.a(qq0Var, z2, xt4Var, vt4Var, wzaVar, rv4Var, 0);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object t(Object obj, Object obj2, Object obj3) {
        y5c y5cVar = (y5c) this.b;
        aw7 aw7Var = (aw7) this.d;
        aw7 aw7Var2 = (aw7) this.e;
        y78 y78Var = (y78) obj;
        ikb ikbVar = (ikb) obj2;
        pwb pwbVar = (pwb) obj3;
        ikbVar.getClass();
        pwbVar.getClass();
        boolean booleanValue = ((Boolean) ((yya) this.c).getValue()).booleanValue();
        pvc pvcVar = pvc.a;
        if (booleanValue) {
            aw7Var.setValue(Boolean.FALSE);
            return pvcVar;
        } else if (((Boolean) aw7Var2.getValue()).booleanValue()) {
            return pvcVar;
        } else {
            long j = y78Var.a;
            y5cVar.getClass();
            hk1 a = jdd.a(y5cVar);
            sw2 sw2Var = ab3.a;
            y5cVar.f(a, ru2.c, new lg1(y5cVar, pwbVar, j, ikbVar, (m42) null));
            return pvcVar;
        }
    }

    private final Object u(Object obj, Object obj2, Object obj3) {
        boolean z;
        Object obj4;
        esa esaVar = (esa) this.b;
        ol6 ol6Var = (ol6) this.c;
        jub jubVar = (jub) this.d;
        j88 j88Var = (j88) this.e;
        nq7 nq7Var = (nq7) obj;
        rv4 rv4Var = (rv4) obj2;
        ((Integer) obj3).getClass();
        rv4Var.e0(-84507373);
        boolean booleanValue = ((Boolean) rv4Var.j(dy1.y)).booleanValue();
        boolean g = rv4Var.g(booleanValue);
        Object P = rv4Var.P();
        lh9 lh9Var = ax1.a;
        if (g || P == lh9Var) {
            P = new ee2(booleanValue);
            rv4Var.o0(P);
        }
        ee2 ee2Var = (ee2) P;
        if (esaVar.a == 16) {
            z = false;
        } else {
            z = true;
        }
        if (((zk6) ((oid) rv4Var.j(dy1.u))).c() && ol6Var.b() && fxb.d(jubVar.b) && z) {
            rv4Var.e0(-707487962);
            ps psVar = jubVar.a;
            fxb fxbVar = new fxb(jubVar.b);
            boolean h = rv4Var.h(ee2Var);
            Object P2 = rv4Var.P();
            if (h || P2 == lh9Var) {
                P2 = new ov9(ee2Var, (m42) null, 15);
                rv4Var.o0(P2);
            }
            yte.h(psVar, fxbVar, (lu4) P2, rv4Var);
            boolean h2 = rv4Var.h(ee2Var) | rv4Var.h(j88Var) | rv4Var.f(jubVar) | rv4Var.h(ol6Var) | rv4Var.f(esaVar);
            Object P3 = rv4Var.P();
            if (h2 || P3 == lh9Var) {
                p6 p6Var = new p6(ee2Var, j88Var, jubVar, ol6Var, esaVar, 20);
                rv4Var.o0(p6Var);
                P3 = p6Var;
            }
            obj4 = ote.t(nq7Var, (xt4) P3);
            rv4Var.q(false);
        } else {
            rv4Var.e0(-705473241);
            rv4Var.q(false);
            obj4 = kq7.a;
        }
        rv4Var.q(false);
        return obj4;
    }

    private final Object v(Object obj, Object obj2, Object obj3) {
        boolean z;
        w43 w43Var = (w43) this.b;
        cz7 cz7Var = (cz7) this.c;
        shc shcVar = (shc) this.d;
        p59 p59Var = (p59) this.e;
        rv4 rv4Var = (rv4) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((xg6) obj).getClass();
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            rgc.d(null, jce.E(-978315174, new rj7(w43Var, cz7Var, shcVar, p59Var, 15), rv4Var), rv4Var, 48);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object w(Object obj, Object obj2, Object obj3) {
        boolean z;
        shc shcVar = (shc) this.b;
        w43 w43Var = (w43) this.c;
        List list = (List) this.d;
        aw7 aw7Var = (aw7) this.e;
        rv4 rv4Var = (rv4) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((xg6) obj).getClass();
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            dye.a(jce.E(2086094479, new rj7(shcVar, w43Var, list, aw7Var), rv4Var), rv4Var, 6);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }

    private final Object x(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        List list = (List) this.d;
        qlc qlcVar = (qlc) this.b;
        xt4 xt4Var = (xt4) this.e;
        aw7 aw7Var = (aw7) this.c;
        rv4 rv4Var = (rv4) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((zn1) obj).getClass();
        boolean z3 = true;
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        boolean U = rv4Var.U(intValue & 1, z);
        pvc pvcVar = pvc.a;
        if (U) {
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new zu0();
                rv4Var.o0(P);
            }
            zu0 zu0Var = (zu0) P;
            rv4Var.e0(1445259210);
            int size = list.size();
            int i = 0;
            while (i < size) {
                yk8 yk8Var = (yk8) list.get(i);
                if (qlcVar.h == ((Number) yk8Var.a).intValue()) {
                    z2 = z3;
                } else {
                    z2 = false;
                }
                String A = yqe.A((y3b) yk8Var.b, rv4Var);
                nq7 nq7Var = kq7.a;
                if (z2) {
                    nq7Var = w9e.k(nq7Var, zu0Var);
                }
                Boolean valueOf = Boolean.valueOf(z2);
                boolean f = rv4Var.f(xt4Var) | rv4Var.f(yk8Var);
                Object P2 = rv4Var.P();
                if (f || P2 == lh9Var) {
                    P2 = new x8c(3, xt4Var, yk8Var, aw7Var);
                    rv4Var.o0(P2);
                }
                iue.g(A, null, null, valueOf, nq7Var, (vt4) P2, rv4Var, 0, 6);
                i++;
                lh9Var = lh9Var;
                pvcVar = pvcVar;
                aw7Var = aw7Var;
                size = size;
                z3 = true;
            }
            pvc pvcVar2 = pvcVar;
            lh9 lh9Var2 = lh9Var;
            rv4Var.q(false);
            boolean h = rv4Var.h(zu0Var);
            Object P3 = rv4Var.P();
            if (h || P3 == lh9Var2) {
                P3 = new so7(zu0Var, null, 4);
                rv4Var.o0(P3);
            }
            yte.g((lu4) P3, rv4Var, pvcVar2);
            return pvcVar2;
        }
        rv4Var.X();
        return pvcVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x0528, code lost:
        if (r8 == r7) goto L186;
     */
    @Override // defpackage.mu4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r57, java.lang.Object r58, java.lang.Object r59) {
        /*
            Method dump skipped, instructions count: 3556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g83.c(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ g83(xt4 xt4Var, xt4 xt4Var2, aw7 aw7Var, xt4 xt4Var3) {
        this.a = 4;
        this.e = xt4Var;
        this.b = xt4Var2;
        this.c = aw7Var;
        this.d = xt4Var3;
    }

    public /* synthetic */ g83(lu4 lu4Var, r32 r32Var, mu4 mu4Var, vt4 vt4Var) {
        this.a = 7;
        this.b = lu4Var;
        this.c = r32Var;
        this.d = mu4Var;
        this.e = vt4Var;
    }

    public /* synthetic */ g83(int i, xt4 xt4Var, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.e = xt4Var;
        this.d = obj3;
    }

    public /* synthetic */ g83(Object obj, xt4 xt4Var, hu4 hu4Var, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.e = xt4Var;
        this.c = hu4Var;
        this.d = obj2;
    }

    public /* synthetic */ g83(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ g83(String str, String str2, xt4 xt4Var, lu4 lu4Var) {
        this.a = 14;
        this.b = str;
        this.c = str2;
        this.e = xt4Var;
        this.d = lu4Var;
    }

    public /* synthetic */ g83(List list, qlc qlcVar, xt4 xt4Var, aw7 aw7Var) {
        this.a = 27;
        this.d = list;
        this.b = qlcVar;
        this.e = xt4Var;
        this.c = aw7Var;
    }

    public /* synthetic */ g83(String[] strArr, List list, aw7 aw7Var, aw7 aw7Var2) {
        this.a = 28;
        this.b = strArr;
        this.d = list;
        this.c = aw7Var;
        this.e = aw7Var2;
    }
}
