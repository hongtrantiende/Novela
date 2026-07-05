package defpackage;

import android.database.SQLException;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oue  reason: default package */
/* loaded from: classes3.dex */
public abstract class oue {
    public static final tu1 a = new tu1(new ev1(5), false, 937242461);

    public static final e32 A(gh5 gh5Var) {
        gh5Var.getClass();
        String v = gh5Var.c.v("Content-Type");
        if (v != null) {
            e32 e32Var = e32.e;
            return h9a.Q(v);
        }
        return null;
    }

    public static final void B(gh5 gh5Var, e32 e32Var) {
        gh5Var.getClass();
        e32Var.getClass();
        gh5Var.c.H("Content-Type", e32Var.toString());
    }

    public static final void C(cw9 cw9Var, String str) {
        cw9Var.getClass();
        iw9 h1 = cw9Var.h1(str);
        try {
            h1.Z0();
            dxe.r(h1, null);
        } finally {
        }
    }

    public static final long D(lm3 lm3Var, sm3 sm3Var) {
        Double d;
        en1 en1Var;
        sm3Var.getClass();
        xt4 xt4Var = lm3Var.j;
        HashMap hashMap = lm3Var.k;
        i45 i45Var = (i45) hashMap.get(sm3Var);
        if (i45Var == null) {
            if (sm3Var.l == xm1.d) {
                en1Var = ube.b;
            } else {
                en1Var = ube.a;
            }
            i45Var = en1Var.e(lm3Var, sm3Var);
            if (hashMap.size() > 4) {
                hashMap.clear();
            }
            hashMap.put(sm3Var, i45Var);
        }
        int i = i45Var.a;
        if (xt4Var != null) {
            d = (Double) xt4Var.invoke(sm3Var);
        } else {
            d = null;
        }
        if (xt4Var != null && d != null) {
            i = (i & 16777215) | (dce.n((int) Math.rint(d.doubleValue() * 255.0d), 0, 255) << 24);
        }
        return sve.b(i);
    }

    public static final long E(float f, long j, long j2) {
        return (Float.floatToRawIntBits(b23.o(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f)) << 32) | (Float.floatToRawIntBits(b23.o(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f)) & 4294967295L);
    }

    public static List F(Object... objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return Collections.unmodifiableList(Arrays.asList(objArr));
            }
            return Collections.singletonList(objArr[0]);
        }
        return Collections.EMPTY_LIST;
    }

    public static final yy9 G(lu4 lu4Var, xt4 xt4Var) {
        tb tbVar = new tb(4, lu4Var);
        jsc.u(1, xt4Var);
        return new yy9(tbVar, xt4Var);
    }

    public static tb7 H(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = a2d.a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                st0.w("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(gv8.d(new km8(Base64.decode(split[1], 0))));
                } catch (RuntimeException e) {
                    st0.x("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new xed(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new tb7(arrayList);
    }

    public static l97 I(km8 km8Var, boolean z, boolean z2) {
        if (z) {
            M(3, km8Var, false);
        }
        km8Var.x((int) km8Var.q(), StandardCharsets.UTF_8);
        long q = km8Var.q();
        String[] strArr = new String[(int) q];
        for (int i = 0; i < q; i++) {
            strArr[i] = km8Var.x((int) km8Var.q(), StandardCharsets.UTF_8);
        }
        if (z2 && (km8Var.z() & 1) == 0) {
            throw xm8.a(null, "framing bit expected to be set");
        }
        return new l97(strArr);
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static final void J(vf6 vf6Var, final jub jubVar, final int i, final int i2, final boolean z, final boolean z2, List list, Set set, boolean z3, xt4 xt4Var, vt4 vt4Var, final xt4 xt4Var2, xt4 xt4Var3, vt4 vt4Var2, final xt4 xt4Var4) {
        int i3;
        ps psVar;
        int i4;
        boolean z4;
        List list2 = list;
        Set set2 = set;
        vf6Var.getClass();
        jubVar.getClass();
        ps psVar2 = jubVar.a;
        set2.getClass();
        vt4Var.getClass();
        xt4Var3.getClass();
        vt4Var2.getClass();
        int i5 = 4;
        if (list2 == null) {
            vf6.y(vf6Var, "toc_loading", new dva(19), cbe.b, 4);
            return;
        }
        ?? r4 = 1;
        if (list2.isEmpty() && psVar2.b.length() == 0) {
            vf6.y(vf6Var, "toc_error", new dva(23), new tu1(new oq3(10, vt4Var), true, -1268837290), 4);
            return;
        }
        vf6.y(vf6Var, "toc_header", new dva(24), new tu1(new mu4() { // from class: sjb
            @Override // defpackage.mu4
            public final Object c(Object obj, Object obj2, Object obj3) {
                boolean z5;
                int i6;
                int i7;
                kq7 kq7Var;
                float f;
                y3b y3bVar;
                y3b y3bVar2;
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((yf6) obj).getClass();
                if ((intValue & 17) != 16) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (rv4Var.U(intValue & 1, z5)) {
                    kq7 kq7Var2 = kq7.a;
                    nq7 A = zbe.A(nmd.v(tte.k(zbe.A(pna.f(kq7Var2, 1.0f), 16.0f, nae.e, 2), v72.d(r0f.z(rv4Var).d, null, null, new sg3(nae.e), new sg3(nae.e), 3)), rm1.g(r0f.y(rv4Var), 2.0f), lre.g), 16.0f, nae.e, 2);
                    xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var, 0);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l = rv4Var.l();
                    nq7 p = lye.p(rv4Var, A);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    np npVar = qw1.f;
                    jce.F(npVar, rv4Var, a2);
                    np npVar2 = qw1.e;
                    jce.F(npVar2, rv4Var, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    np npVar3 = qw1.g;
                    jce.F(npVar3, rv4Var, valueOf);
                    kg kgVar = qw1.h;
                    jce.C(kgVar, rv4Var);
                    np npVar4 = qw1.d;
                    jce.F(npVar4, rv4Var, p);
                    nq7 f2 = hl5.f(kq7Var2, 16.0f, rv4Var, kq7Var2, 1.0f);
                    gv9 a3 = ev9.a(lz.a, kh5.G, rv4Var, 48);
                    int hashCode2 = Long.hashCode(rv4Var.T);
                    xt8 l2 = rv4Var.l();
                    nq7 p2 = lye.p(rv4Var, f2);
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(npVar, rv4Var, a3);
                    jce.F(npVar2, rv4Var, l2);
                    s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
                    jce.F(npVar4, rv4Var, p2);
                    cvb.c(yqe.A((y3b) o3b.K.getValue(), rv4Var), null, r0f.y(rv4Var).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).g, rv4Var, 0, 0, 131066);
                    rv4 rv4Var2 = rv4Var;
                    int i8 = i2;
                    int i9 = i;
                    if (!z2) {
                        rv4Var2.e0(356558320);
                        if (i8 == 4) {
                            y3bVar2 = (y3b) o2b.F0.getValue();
                        } else {
                            y3bVar2 = (y3b) f2b.g0.getValue();
                        }
                        i7 = i9;
                        kq7Var = kq7Var2;
                        i6 = i8;
                        cvb.c(yqe.B(y3bVar2, new Object[]{Integer.valueOf(i9)}, rv4Var2), zbe.C(kq7Var2, 12.0f, nae.e, nae.e, nae.e, 14), r0f.y(rv4Var2).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).h, rv4Var2, 48, 0, 131064);
                        rv4Var2 = rv4Var2;
                        rv4Var2.q(false);
                    } else {
                        i6 = i8;
                        i7 = i9;
                        kq7Var = kq7Var2;
                        rv4Var2.e0(357035782);
                        rv4Var2.q(false);
                    }
                    xbe.i(rv4Var2, new we6(1.0f, true));
                    boolean z6 = z;
                    if (z6) {
                        f = 180.0f;
                    } else {
                        f = nae.e;
                    }
                    yya b = nq.b(f, null, null, rv4Var2, 0, 30);
                    ar5 c = rp5.c((wk3) rk3.e.getValue(), rv4Var2, 0);
                    kq7 kq7Var3 = kq7Var;
                    nq7 t = tte.t(pna.n(kq7Var3, 24.0f), ((Number) b.getValue()).floatValue());
                    xt4 xt4Var5 = xt4Var2;
                    boolean f3 = rv4Var2.f(xt4Var5) | rv4Var2.g(z6);
                    Object P = rv4Var2.P();
                    if (f3 || P == ax1.a) {
                        P = new up0(20, xt4Var5, z6);
                        rv4Var2.o0(P);
                    }
                    nk5.a(c, null, q1d.b(t, false, nae.e, (vt4) P, 3), 0L, rv4Var2, 48, 8);
                    rs8.u(rv4Var2, true, kq7Var3, 12.0f, rv4Var2);
                    if (i6 == 4) {
                        y3bVar = (y3b) b3b.N.getValue();
                    } else {
                        y3bVar = (y3b) b3b.L.getValue();
                    }
                    xxe.m(jub.this, yqe.B(y3bVar, new Object[]{Integer.valueOf(i7)}, rv4Var2), 0L, rm1.g(r0f.y(rv4Var2), 6.0f), null, null, zbe.A(pna.f(kq7Var3, 1.0f), nae.e, 8.0f, 1), null, xt4Var4, null, rv4Var2, 1572864, 692);
                    hl5.w(kq7Var3, 8.0f, rv4Var2, true);
                } else {
                    rv4Var.X();
                }
                return pvc.a;
            }
        }, true, 328259382), 4);
        int size = list2.size();
        byte b = 0;
        int i6 = 0;
        while (i6 < size) {
            u43 u43Var = (u43) list2.get(i6);
            List list3 = u43Var.b;
            if (u43Var.a.length() > 0) {
                vf6.y(vf6Var, a82.j(i6, "section_"), new dva(25), new tu1(new tl7(xt4Var, i6, set2, u43Var), r4, 1368268602), i5);
            }
            if (!set2.contains(Integer.valueOf(i6))) {
                nd1 nd1Var = new nd1(z, 7, b);
                gjb gjbVar = new gjb(r4);
                int size2 = list3.size();
                poa poaVar = new poa(7, nd1Var, list3);
                aw0 aw0Var = new aw0(6, gjbVar, list3);
                zgb zgbVar = new zgb(2, list3);
                boolean z5 = r4;
                int i7 = i6;
                z4 = z5;
                psVar = psVar2;
                i4 = i7;
                vf6Var.z(size2, poaVar, aw0Var, zgbVar, new tu1(new tjb(list3, list3, i7, list2, xt4Var3), z4, -1942245546));
            } else {
                psVar = psVar2;
                i4 = i6;
                z4 = r4;
            }
            i6 = i4 + 1;
            list2 = list;
            r4 = z4;
            psVar2 = psVar;
            i5 = 4;
            b = 0;
            set2 = set;
        }
        ps psVar3 = psVar2;
        boolean z6 = r4;
        if (psVar3.b.length() > 0 && list.isEmpty()) {
            i3 = 4;
            vf6.y(vf6Var, "search_empty", new dva(20), cbe.c, 4);
        } else {
            i3 = 4;
        }
        if (z3) {
            vf6.y(vf6Var, "loading_chapter", new dva(21), cbe.d, i3);
        }
        if (z2 && psVar3.b.length() == 0) {
            vf6.y(vf6Var, "see_all_chapter", new dva(22), new tu1(new oq3(9, vt4Var2), z6, 3401667), 4);
        }
    }

    public static final void K(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i);
        sb.append(", message: ".concat(str));
        throw new SQLException(sb.toString());
    }

    public static final void L(gh5 gh5Var, String str) {
        gh5Var.getClass();
        gh5Var.c.H("User-Agent", str);
    }

    public static boolean M(int i, km8 km8Var, boolean z) {
        if (km8Var.a() < 7) {
            if (!z) {
                throw xm8.a(null, "too short header: " + km8Var.a());
            }
            return false;
        } else if (km8Var.z() != i) {
            if (!z) {
                throw xm8.a(null, "expected header type " + Integer.toHexString(i));
            }
            return false;
        } else if (km8Var.z() == 118 && km8Var.z() == 111 && km8Var.z() == 114 && km8Var.z() == 98 && km8Var.z() == 105 && km8Var.z() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw xm8.a(null, "expected characters 'vorbis'");
        }
    }

    public static final void a(final List list, nq7 nq7Var, final xt4 xt4Var, final xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        long a2;
        rv4Var.g0(-1190070089);
        if (rv4Var.f(list)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if (rv4Var.h(xt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        boolean z2 = true;
        if ((i9 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i9 & 1, z)) {
            if ((i9 & 14) != 4) {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new k71(11, list);
                rv4Var.o0(P);
            }
            m71 p = voe.p((vt4) P, rv4Var);
            if (((vkd) rv4Var.j(ikd.a)) == vkd.a) {
                a2 = ote.a(250.0f, 200.0f);
            } else {
                a2 = ote.a(300.0f, 200.0f);
            }
            final long j = a2;
            gxa v = tte.v(nae.e, 1500.0f, 5, null);
            yy9 yy9Var = m71.b;
            ade.c(p, nq7Var, 300.0f, 12.0f, hxe.k(p.a, new lh9(18), axa.a(rv4Var), v, rv4Var, 3072, 16), false, nae.e, nae.e, null, jce.E(491388979, new nu4() { // from class: fja
                @Override // defpackage.nu4
                public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i10;
                    boolean z3;
                    float f;
                    np npVar;
                    Object obj5;
                    np npVar2;
                    vt4 vt4Var;
                    int i11;
                    boolean h;
                    int i12;
                    y61 y61Var = (y61) obj;
                    int intValue = ((Integer) obj2).intValue();
                    rv4 rv4Var2 = (rv4) obj3;
                    int intValue2 = ((Integer) obj4).intValue();
                    y61Var.getClass();
                    if ((intValue2 & 6) == 0) {
                        if ((intValue2 & 8) == 0) {
                            h = rv4Var2.f(y61Var);
                        } else {
                            h = rv4Var2.h(y61Var);
                        }
                        if (h) {
                            i12 = 4;
                        } else {
                            i12 = 2;
                        }
                        i10 = i12 | intValue2;
                    } else {
                        i10 = intValue2;
                    }
                    if ((intValue2 & 48) == 0) {
                        if (rv4Var2.d(intValue)) {
                            i11 = 32;
                        } else {
                            i11 = 16;
                        }
                        i10 |= i11;
                    }
                    if ((i10 & Token.EXPR_VOID) != 146) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (rv4Var2.U(i10 & 1, z3)) {
                        cia ciaVar = (cia) list.get(intValue);
                        f99 f99Var = j27.a;
                        vw4 a3 = y61Var.a(((h27) rv4Var2.j(f99Var)).c.d, rv4Var2);
                        kq7 kq7Var = kq7.a;
                        nq7 o = pna.o(j, pna.f(kq7Var, 1.0f));
                        xt4 xt4Var3 = xt4Var;
                        boolean f2 = rv4Var2.f(xt4Var3) | rv4Var2.h(ciaVar);
                        Object P2 = rv4Var2.P();
                        Object obj6 = ax1.a;
                        if (f2 || P2 == obj6) {
                            P2 = new gja(xt4Var3, ciaVar, 0);
                            rv4Var2.o0(P2);
                        }
                        vt4 vt4Var2 = (vt4) P2;
                        xt4 xt4Var4 = xt4Var2;
                        boolean f3 = rv4Var2.f(xt4Var4) | rv4Var2.h(ciaVar);
                        Object P3 = rv4Var2.P();
                        if (f3 || P3 == obj6) {
                            P3 = new gja(xt4Var4, ciaVar, 1);
                            rv4Var2.o0(P3);
                        }
                        nq7 k = tte.k(q1d.c(0, vt4Var2, (vt4) P3, rv4Var2, o), a3);
                        b37 d = fu0.d(kh5.a, false);
                        int hashCode = Long.hashCode(rv4Var2.T);
                        xt8 l = rv4Var2.l();
                        nq7 p2 = lye.p(rv4Var2, k);
                        rw1.k.getClass();
                        vt4 vt4Var3 = qw1.b;
                        rv4Var2.i0();
                        if (rv4Var2.S) {
                            rv4Var2.k(vt4Var3);
                        } else {
                            rv4Var2.r0();
                        }
                        np npVar3 = qw1.f;
                        jce.F(npVar3, rv4Var2, d);
                        np npVar4 = qw1.e;
                        jce.F(npVar4, rv4Var2, l);
                        Integer valueOf = Integer.valueOf(hashCode);
                        np npVar5 = qw1.g;
                        jce.F(npVar5, rv4Var2, valueOf);
                        kg kgVar = qw1.h;
                        jce.C(kgVar, rv4Var2);
                        np npVar6 = qw1.d;
                        jce.F(npVar6, rv4Var2, p2);
                        String str = ciaVar.a;
                        String str2 = ciaVar.b;
                        do5.c(str, str2, ciaVar.c, ciaVar.e, r0f.d, pna.c, rv4Var2, 221184);
                        Object P4 = rv4Var2.P();
                        if (P4 == obj6) {
                            Float valueOf2 = Float.valueOf((float) nae.e);
                            long j2 = zl1.b;
                            npVar = npVar6;
                            obj5 = obj6;
                            npVar2 = npVar5;
                            f = 1.0f;
                            P4 = ox9.C(new yk8[]{new yk8(valueOf2, new zl1(zl1.b(nae.e, j2))), new yk8(Float.valueOf(0.4f), new zl1(zl1.b(0.6f, j2))), new yk8(Float.valueOf(1.0f), new zl1(zl1.b(1.0f, j2)))});
                            rv4Var2.o0(P4);
                        } else {
                            f = 1.0f;
                            npVar = npVar6;
                            obj5 = obj6;
                            npVar2 = npVar5;
                        }
                        nq7 a4 = pu0.a.a(nmd.u(pna.f(kq7Var, f), (hy0) P4), kh5.D);
                        mk0 mk0Var = kh5.F;
                        dz dzVar = lz.a;
                        gv9 a5 = ev9.a(dzVar, mk0Var, rv4Var2, 0);
                        int hashCode2 = Long.hashCode(rv4Var2.T);
                        xt8 l2 = rv4Var2.l();
                        nq7 p3 = lye.p(rv4Var2, a4);
                        rv4Var2.i0();
                        if (rv4Var2.S) {
                            rv4Var2.k(vt4Var3);
                        } else {
                            rv4Var2.r0();
                        }
                        jce.F(npVar3, rv4Var2, a5);
                        jce.F(npVar4, rv4Var2, l2);
                        np npVar7 = npVar2;
                        s21.t(hashCode2, rv4Var2, npVar7, rv4Var2, kgVar);
                        nq7 y = zbe.y(s21.f(rv4Var2, p3, npVar, f, true), 4.0f);
                        xn1 a6 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
                        int hashCode3 = Long.hashCode(rv4Var2.T);
                        xt8 l3 = rv4Var2.l();
                        nq7 p4 = lye.p(rv4Var2, y);
                        rv4Var2.i0();
                        if (rv4Var2.S) {
                            rv4Var2.k(vt4Var3);
                        } else {
                            rv4Var2.r0();
                        }
                        jce.F(npVar3, rv4Var2, a6);
                        jce.F(npVar4, rv4Var2, l3);
                        s21.t(hashCode3, rv4Var2, npVar7, rv4Var2, kgVar);
                        jce.F(npVar, rv4Var2, p4);
                        oyb oybVar = ((h27) rv4Var2.j(f99Var)).b.k;
                        long j3 = zl1.e;
                        np npVar8 = npVar;
                        Object obj7 = obj5;
                        cvb.c(str2, zbe.A(pna.f(kq7Var, f), 8.0f, nae.e, 2), j3, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, oybVar, rv4Var2, 432, 24576, 114680);
                        cvb.c(ciaVar.k, zbe.A(pna.f(kq7Var, 1.0f), 8.0f, nae.e, 2), j3, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((h27) rv4Var2.j(f99Var)).b.l, rv4Var2, 432, 24576, 114680);
                        rv4Var2.q(true);
                        nk0 nk0Var = kh5.e;
                        nq7 y2 = zbe.y(new k5d(kh5.H), 4.0f);
                        b37 d2 = fu0.d(nk0Var, false);
                        int hashCode4 = Long.hashCode(rv4Var2.T);
                        xt8 l4 = rv4Var2.l();
                        nq7 p5 = lye.p(rv4Var2, y2);
                        rv4Var2.i0();
                        if (rv4Var2.S) {
                            vt4Var = vt4Var3;
                            rv4Var2.k(vt4Var);
                        } else {
                            vt4Var = vt4Var3;
                            rv4Var2.r0();
                        }
                        jce.F(npVar3, rv4Var2, d2);
                        jce.F(npVar4, rv4Var2, l4);
                        s21.t(hashCode4, rv4Var2, npVar7, rv4Var2, kgVar);
                        jce.F(npVar8, rv4Var2, p5);
                        long b = zl1.b(0.2f, j3);
                        nq7 n = pna.n(kq7Var, 20.0f);
                        boolean h2 = rv4Var2.h(ciaVar);
                        Object P5 = rv4Var2.P();
                        if (h2 || P5 == obj7) {
                            P5 = new ak9(ciaVar, 17);
                            rv4Var2.o0(P5);
                        }
                        vt4 vt4Var4 = vt4Var;
                        r79.b((vt4) P5, n, j3, 1.5f, b, 0, 1.0f, rv4Var2, 1600944, 32);
                        gv9 a7 = ev9.a(dzVar, kh5.G, rv4Var2, 48);
                        int hashCode5 = Long.hashCode(rv4Var2.T);
                        xt8 l5 = rv4Var2.l();
                        nq7 p6 = lye.p(rv4Var2, kq7Var);
                        rv4Var2.i0();
                        if (rv4Var2.S) {
                            rv4Var2.k(vt4Var4);
                        } else {
                            rv4Var2.r0();
                        }
                        jce.F(npVar3, rv4Var2, a7);
                        jce.F(npVar4, rv4Var2, l5);
                        s21.t(hashCode5, rv4Var2, npVar7, rv4Var2, kgVar);
                        jce.F(npVar8, rv4Var2, p6);
                        cvb.c(String.valueOf(ciaVar.i), null, j3, null, zr1.q(9), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(f99Var)).b.l, rv4Var2, 24960, 0, 131050);
                        cvb.c("%", null, j3, null, zr1.q(6), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(f99Var)).b.l, rv4Var2, 24966, 0, 131050);
                        rv4Var2.q(true);
                        rv4Var2.q(true);
                        rv4Var2.q(true);
                        rv4Var2.q(true);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, 805309832 | (i9 & Token.ASSIGN_MOD));
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new rj7((Object) list, nq7Var, xt4Var, xt4Var2, i, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static final void b(t23 t23Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        t23 t23Var2;
        rv4 rv4Var2;
        dz dzVar;
        np npVar;
        np npVar2;
        kg kgVar;
        np npVar3;
        zx1 zx1Var;
        kq7 kq7Var;
        char c;
        boolean z2;
        int i4;
        kq7 kq7Var2;
        ?? r0;
        kq7 kq7Var3;
        float f;
        rv4 rv4Var3 = rv4Var;
        String str = t23Var.d;
        long j = t23Var.e;
        rv4Var3.g0(-965591933);
        if (rv4Var3.f(t23Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var3.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var3.U(i6 & 1, z)) {
            mk0 mk0Var = kh5.G;
            dz dzVar2 = lz.a;
            gv9 a2 = ev9.a(dzVar2, mk0Var, rv4Var3, 48);
            int hashCode = Long.hashCode(rv4Var3.T);
            xt8 l = rv4Var3.l();
            nq7 p = lye.p(rv4Var3, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var2 = qw1.b;
            rv4Var3.i0();
            if (rv4Var3.S) {
                rv4Var3.k(zx1Var2);
            } else {
                rv4Var3.r0();
            }
            np npVar4 = qw1.f;
            jce.F(npVar4, rv4Var3, a2);
            np npVar5 = qw1.e;
            jce.F(npVar5, rv4Var3, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar6 = qw1.g;
            jce.F(npVar6, rv4Var3, valueOf);
            kg kgVar2 = qw1.h;
            jce.C(kgVar2, rv4Var3);
            np npVar7 = qw1.d;
            jce.F(npVar7, rv4Var3, p);
            we6 we6Var = new we6(1.0f, true);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var3, 0);
            int hashCode2 = Long.hashCode(rv4Var3.T);
            xt8 l2 = rv4Var3.l();
            nq7 p2 = lye.p(rv4Var3, we6Var);
            rv4Var3.i0();
            if (rv4Var3.S) {
                rv4Var3.k(zx1Var2);
            } else {
                rv4Var3.r0();
            }
            jce.F(npVar4, rv4Var3, a3);
            jce.F(npVar5, rv4Var3, l2);
            s21.t(hashCode2, rv4Var3, npVar6, rv4Var3, kgVar2);
            jce.F(npVar7, rv4Var3, p2);
            kq7 kq7Var4 = kq7.a;
            nq7 f2 = pna.f(kq7Var4, 1.0f);
            gv9 a4 = ev9.a(dzVar2, mk0Var, rv4Var3, 48);
            int hashCode3 = Long.hashCode(rv4Var3.T);
            xt8 l3 = rv4Var3.l();
            nq7 p3 = lye.p(rv4Var3, f2);
            rv4Var3.i0();
            if (rv4Var3.S) {
                rv4Var3.k(zx1Var2);
            } else {
                rv4Var3.r0();
            }
            jce.F(npVar4, rv4Var3, a4);
            jce.F(npVar5, rv4Var3, l3);
            s21.t(hashCode3, rv4Var3, npVar6, rv4Var3, kgVar2);
            jce.F(npVar7, rv4Var3, p3);
            if (t23Var.g) {
                rv4Var3.e0(1477736944);
                ar5 c2 = rp5.c((wk3) ok3.X.getValue(), rv4Var3, 0);
                long j2 = ((h27) rv4Var3.j(j27.a)).a.q;
                if (j > 0) {
                    f = 0.8f;
                } else {
                    f = 1.0f;
                }
                long b = zl1.b(f, j2);
                kq7Var = kq7Var4;
                zx1Var = zx1Var2;
                npVar = npVar4;
                dzVar = dzVar2;
                npVar2 = npVar5;
                npVar3 = npVar6;
                kgVar = kgVar2;
                nk5.a(c2, null, pna.n(kq7Var, 18.0f), b, rv4Var3, 432, 0);
                c = 0;
                z2 = false;
                rs8.v(kq7Var, 4.0f, rv4Var3, false);
            } else {
                dzVar = dzVar2;
                npVar = npVar4;
                npVar2 = npVar5;
                kgVar = kgVar2;
                npVar3 = npVar6;
                zx1Var = zx1Var2;
                kq7Var = kq7Var4;
                c = 0;
                z2 = false;
                rv4Var3.e0(1478153057);
                rv4Var3.q(false);
            }
            String str2 = t23Var.b;
            float f3 = 1.0f;
            nq7 f4 = pna.f(kq7Var, 1.0f);
            if (t23Var.c == 0) {
                i4 = 5;
            } else {
                i4 = 3;
            }
            long j3 = r0f.y(rv4Var3).q;
            int i7 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i7 > 0) {
                f3 = 0.8f;
            }
            long b2 = zl1.b(f3, j3);
            kg kgVar3 = kgVar;
            kq7 kq7Var5 = kq7Var;
            np npVar8 = npVar2;
            np npVar9 = npVar3;
            np npVar10 = npVar;
            cvb.c(str2, f4, b2, null, 0L, null, null, null, 0L, null, new tlb(i4), 0L, 0, false, 0, 0, null, null, rv4Var, 48, 0, 261112);
            rv4 rv4Var4 = rv4Var;
            rv4Var4.q(true);
            if (i7 > 0) {
                rv4Var4.e0(2006638863);
                nq7 f5 = pna.f(kq7Var5, 1.0f);
                gv9 a5 = ev9.a(dzVar, mk0Var, rv4Var4, 48);
                int hashCode4 = Long.hashCode(rv4Var4.T);
                xt8 l4 = rv4Var4.l();
                nq7 p4 = lye.p(rv4Var4, f5);
                rv4Var4.i0();
                if (rv4Var4.S) {
                    rv4Var4.k(zx1Var);
                } else {
                    rv4Var4.r0();
                }
                jce.F(npVar10, rv4Var4, a5);
                jce.F(npVar8, rv4Var4, l4);
                s21.t(hashCode4, rv4Var4, npVar9, rv4Var4, kgVar3);
                jce.F(npVar7, rv4Var4, p4);
                nk5.a(rp5.c((wk3) ok3.i.getValue(), rv4Var4, 0), null, pna.n(kq7Var5, 12.0f), zl1.b(0.5f, r0f.y(rv4Var4).q), rv4Var4, 432, 0);
                xbe.i(rv4Var4, pna.s(kq7Var5, 2.0f));
                boolean e = rv4Var4.e(j);
                Object P = rv4Var4.P();
                if (e || P == ax1.a) {
                    P = zj1.f(j, "HH:mm dd/MM/yyyy");
                    rv4Var4.o0(P);
                }
                kq7Var2 = kq7Var5;
                r0 = 0;
                cvb.c((String) P, null, zl1.b(0.5f, r0f.y(rv4Var4).q), null, zr1.q(9), null, null, null, 0L, null, new tlb(5), 0L, 0, false, 1, 0, null, r0f.A(rv4Var4).l, rv4Var, 24576, 24576, 113642);
                rv4Var4 = rv4Var;
                rv4Var4.q(true);
                rv4Var4.q(false);
            } else {
                kq7Var2 = kq7Var5;
                r0 = 0;
                rv4Var4.e0(2007705573);
                rv4Var4.q(false);
            }
            if (str.length() > 0) {
                kq7 kq7Var6 = kq7Var2;
                s21.w(rv4Var4, 2007767449, kq7Var6, 4.0f, rv4Var4);
                kq7Var3 = kq7Var6;
                cvb.c(str, pna.f(kq7Var6, 1.0f), zl1.b(0.5f, r0f.y(rv4Var4).q), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var4).l, rv4Var, 48, 0, 131064);
                rv4Var4 = rv4Var;
                rv4Var4.q(r0);
            } else {
                kq7Var3 = kq7Var2;
                rv4Var4.e0(2008117253);
                rv4Var4.q(r0);
            }
            rv4Var4.q(true);
            t23Var2 = t23Var;
            if (t23Var2.f) {
                rv4Var4.e0(842426300);
                nk5.a(rp5.c((wk3) ok3.G.getValue(), rv4Var4, r0), null, pna.n(kq7Var3, 24.0f), zl1.b(0.7f, r0f.y(rv4Var4).q), rv4Var4, 432, 0);
                rv4Var4.q(r0);
            } else {
                rv4Var4.e0(842681275);
                rv4Var4.q(r0);
            }
            rv4Var4.q(true);
            rv4Var2 = rv4Var4;
        } else {
            t23Var2 = t23Var;
            rv4Var3.X();
            rv4Var2 = rv4Var3;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new f58(t23Var2, nq7Var, i, 13);
        }
    }

    public static final void c(final nq7 nq7Var, final boolean z, final boolean z2, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        rv4Var.g0(-30253805);
        if (rv4Var.f(nq7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (rv4Var.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var.g(z2)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i7 & 1, z3)) {
            mk0 mk0Var = kh5.G;
            dz dzVar = lz.a;
            gv9 a2 = ev9.a(dzVar, mk0Var, rv4Var, 48);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var, p);
            we6 we6Var = new we6(1.0f, true);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, we6Var);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a3);
            jce.F(npVar2, rv4Var, l2);
            s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p2);
            kq7 kq7Var = kq7.a;
            dpe.g(pna.h(pna.f(kq7Var, 1.0f), 20.0f), null, rv4Var, 6, 2);
            nq7 f = hl5.f(kq7Var, 4.0f, rv4Var, kq7Var, 1.0f);
            gv9 a4 = ev9.a(dzVar, mk0Var, rv4Var, 48);
            int hashCode3 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p3 = lye.p(rv4Var, f);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a4);
            jce.F(npVar2, rv4Var, l3);
            s21.t(hashCode3, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p3);
            dpe.g(pna.n(kq7Var, 14.0f), null, rv4Var, 6, 2);
            xbe.i(rv4Var, pna.s(kq7Var, 4.0f));
            dpe.g(pna.h(pna.f(kq7Var, 0.5f), 16.0f), null, rv4Var, 6, 2);
            rv4Var.q(true);
            if (z) {
                s21.w(rv4Var, -1378685078, kq7Var, 4.0f, rv4Var);
                dpe.g(pna.h(pna.f(kq7Var, 0.8f), 14.0f), null, rv4Var, 6, 2);
                z4 = false;
                rv4Var.q(false);
            } else {
                z4 = false;
                rv4Var.e0(-1378532279);
                rv4Var.q(false);
            }
            rv4Var.q(true);
            if (z2) {
                rs8.s(rv4Var, -1272192043, kq7Var, 12.0f, rv4Var);
                dpe.g(pna.n(kq7Var, 24.0f), null, rv4Var, 6, 2);
                rv4Var.q(z4);
            } else {
                rv4Var.e0(-1272070957);
                rv4Var.q(z4);
            }
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4(z, z2, i) { // from class: rjb
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p4 = xoe.p(1);
                    oue.c(nq7.this, this.b, this.c, (rv4) obj, p4);
                    return pvc.a;
                }
            };
        }
    }

    public static final void d(ar5 ar5Var, String str, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i) {
        Object obj;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-822472021);
        if ((i & 6) == 0) {
            obj = ar5Var;
            if (rv4Var2.f(obj)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            obj = ar5Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.f(str)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i2 & 1, z)) {
            nq7 z2 = zbe.z(lbe.f(15, vt4Var, nq7Var, null, false), 8.0f, 16.0f);
            xn1 a2 = wn1.a(lz.c, kh5.J, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, z2);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            kq7 kq7Var = kq7.a;
            nk5.a(obj, null, pna.n(kq7Var, 24.0f), 0L, rv4Var2, (i2 & 14) | 432, 8);
            xbe.i(rv4Var2, pna.h(kq7Var, 4.0f));
            cvb.c(str, null, 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.k, rv4Var, (i2 >> 3) & 14, 0, 130046);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new y34(ar5Var, str, nq7Var, vt4Var, i, 0);
        }
    }

    public static final void e(d84 d84Var, c84 c84Var, nq7 nq7Var, lu4 lu4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        rv4Var.g0(-216271855);
        if (rv4Var.f(d84Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (rv4Var.h(c84Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var.h(lu4Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i7 = i6 | i4;
        if ((i7 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i7 & 1, z)) {
            l(yqe.A((y3b) s2b.W.getValue(), rv4Var), nq7Var, jce.E(445483270, new ld1(18, c84Var, d84Var, lu4Var), rv4Var), rv4Var, 432);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new i31(d84Var, c84Var, nq7Var, lu4Var, i, 18);
        }
    }

    public static final void f(q34 q34Var, p34 p34Var, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        rv4Var.g0(-993237254);
        if (rv4Var.f(q34Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var.f(p34Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i9 = i8 | i4;
        if (rv4Var.h(xt4Var2)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i10 = i9 | i5;
        if (rv4Var.h(xt4Var3)) {
            i6 = 131072;
        } else {
            i6 = Parser.ARGC_LIMIT;
        }
        int i11 = i10 | i6;
        if ((74899 & i11) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i11 & 1, z)) {
            l(yqe.A((y3b) s2b.R.getValue(), rv4Var), nq7Var, jce.E(-1492475601, new w81(p34Var, q34Var, xt4Var, xt4Var2, xt4Var3, 5), rv4Var), rv4Var, 432);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new bn7(q34Var, p34Var, nq7Var, xt4Var, xt4Var2, xt4Var3, i, 4);
        }
    }

    public static final void g(String str, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        rv4Var.g0(-862175090);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (P == obj) {
                P = yte.s(rv4Var);
                rv4Var.o0(P);
            }
            Object obj2 = (m82) P;
            Object[] objArr = new Object[0];
            Object P2 = rv4Var.P();
            if (P2 == obj) {
                P2 = new k24(2);
                rv4Var.o0(P2);
            }
            aw7 aw7Var = (aw7) zpe.k(objArr, (vt4) P2, rv4Var, 48);
            Object P3 = rv4Var.P();
            if (P3 == obj) {
                P3 = yae.z("");
                rv4Var.o0(P3);
            }
            aw7 aw7Var2 = (aw7) P3;
            int i4 = i3 & 14;
            if (i4 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P4 = rv4Var.P();
            if (z2 || P4 == obj) {
                P4 = new uw2(str, aw7Var2, (m42) null, 16);
                rv4Var.o0(P4);
            }
            yte.g((lu4) P4, rv4Var, str);
            l(yqe.A((y3b) s2b.T.getValue(), rv4Var), nq7Var, jce.E(1047633593, new ld1(aw7Var2, aw7Var, str, 17), rv4Var), rv4Var, 432);
            String str2 = (String) aw7Var2.getValue();
            boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
            boolean f = rv4Var.f(aw7Var);
            Object P5 = rv4Var.P();
            if (f || P5 == obj) {
                P5 = new zn3(aw7Var, 18);
                rv4Var.o0(P5);
            }
            xt4 xt4Var = (xt4) P5;
            boolean h = rv4Var.h(obj2);
            if (i4 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z4 = h | z3;
            Object P6 = rv4Var.P();
            if (z4 || P6 == obj) {
                P6 = new nq3(obj2, aw7Var2, str, 2);
                rv4Var.o0(P6);
            }
            oc2.j(0, xt4Var, (xt4) P6, rv4Var, str2, booleanValue);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new o7(str, nq7Var, i, 4);
        }
    }

    public static final void h(String str, cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        cz7 cz7Var2;
        boolean z2;
        pb2 pb2Var;
        boolean z3;
        str.getClass();
        cz7Var.getClass();
        rv4Var.g0(-1706672914);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (rv4Var.f(cz7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            if ((i5 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (z2 || P == obj) {
                P = new op0(str, 24);
                rv4Var.o0(P);
            }
            vt4 vt4Var = (vt4) P;
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                i44 i44Var = (i44) ((fdd) voe.z(cm9.a(i44.class), a2.i(), null, pb2Var, o96.a(rv4Var), vt4Var));
                aw7 z4 = jsc.z(i44Var.C, rv4Var);
                e13 y = k27.y(rv4Var);
                Object[] objArr = new Object[0];
                yy9 yy9Var = fo3.e;
                Object P2 = rv4Var.P();
                if (P2 == obj) {
                    P2 = new qx6(25);
                    rv4Var.o0(P2);
                }
                fo3 fo3Var = (fo3) zpe.m(objArr, yy9Var, (vt4) P2, rv4Var, 384);
                cz7Var2 = cz7Var;
                fxe.h(yqe.A((y3b) o2b.N.getValue(), rv4Var), pna.c, false, jce.E(838711026, new p7(cz7Var, 27), rv4Var), vte.a, null, jce.E(-1423204669, new jb2(z4, cz7Var, y, i44Var, fo3Var), rv4Var), rv4Var, 1600560, 36);
                boolean f = rv4Var.f(i44Var);
                if ((i5 & Token.ASSIGN_MOD) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z5 = f | z3;
                Object P3 = rv4Var.P();
                if (z5 || P3 == obj) {
                    P3 = new j34(1, i44Var, cz7Var2);
                    rv4Var.o0(P3);
                }
                k27.e(y, (xt4) P3, rv4Var, 0);
                boolean f2 = rv4Var.f(i44Var);
                Object P4 = rv4Var.P();
                if (f2 || P4 == obj) {
                    P4 = new sj(i44Var, 14);
                    rv4Var.o0(P4);
                }
                ctd.j(fo3Var, (lu4) P4, rv4Var, 0);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            cz7Var2 = cz7Var;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new yp0(str, cz7Var2, i, 7);
        }
    }

    public static final void i(String str, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        kq7 kq7Var;
        rv4Var.g0(-305031495);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2 | 48;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            tza tzaVar = j27.a;
            oyb oybVar = ((h27) rv4Var.j(tzaVar)).b.k;
            long b = zl1.b(0.65f, ((h27) rv4Var.j(tzaVar)).a.q);
            kq7 kq7Var2 = kq7.a;
            cvb.c(str, zbe.z(nmd.v(tte.k(pna.f(kq7Var2, 1.0f), ((h27) rv4Var.j(tzaVar)).c.c), rm1.g(((h27) rv4Var.j(tzaVar)).a, 6.0f), lre.g), 14.0f, 12.0f), b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var, i3 & 14, 0, 131064);
            kq7Var = kq7Var2;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new o7(str, kq7Var, i, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(defpackage.l54 r57, defpackage.nq7 r58, defpackage.vt4 r59, defpackage.vt4 r60, defpackage.vt4 r61, defpackage.rv4 r62, int r63, int r64) {
        /*
            Method dump skipped, instructions count: 1460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oue.j(l54, nq7, vt4, vt4, vt4, rv4, int, int):void");
    }

    public static final void k(nq7 nq7Var, tu1 tu1Var, rv4 rv4Var, int i) {
        boolean z;
        rv4Var.g0(1373963882);
        int i2 = i | 6;
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            kq7 kq7Var = kq7.a;
            nq7 f = pna.f(kq7Var, 1.0f);
            tza tzaVar = j27.a;
            nq7 v = nmd.v(tte.k(f, ((h27) rv4Var.j(tzaVar)).c.c), rm1.g(((h27) rv4Var.j(tzaVar)).a, 6.0f), lre.g);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, v);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, a2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            tu1Var.c(zn1.a, rv4Var, 54);
            rv4Var.q(true);
            nq7Var = kq7Var;
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new a62(nq7Var, tu1Var, i, 2);
        }
    }

    public static final void l(String str, nq7 nq7Var, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        tu1 tu1Var2;
        int i3;
        int i4;
        int i5;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-928399489);
        if ((i & 6) == 0) {
            if (rv4Var2.f(str)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.h(tu1Var)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i2 |= i3;
        }
        if ((i2 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i2 & 1, z)) {
            tza tzaVar = j27.a;
            nq7 y = zbe.y(nmd.v(tte.k(nq7Var, ((h27) rv4Var2.j(tzaVar)).c.d), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 2.0f), lre.g), 18.0f);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, y);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            oyb oybVar = ((h27) rv4Var2.j(tzaVar)).b.g;
            kq7 kq7Var = kq7.a;
            cvb.c(str, pna.f(kq7Var, 1.0f), ((h27) rv4Var2.j(tzaVar)).a.a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var, (i2 & 14) | 48, 0, 131064);
            rv4Var2 = rv4Var;
            xbe.i(rv4Var2, pna.h(kq7Var, 20.0f));
            tu1Var2 = tu1Var;
            tu1Var2.c(zn1.a, rv4Var2, Integer.valueOf(((i2 >> 3) & Token.ASSIGN_MOD) | 6));
            rv4Var2.q(true);
        } else {
            tu1Var2 = tu1Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new a44(str, nq7Var, tu1Var2, i);
        }
    }

    public static final void m(q54 q54Var, nq7 nq7Var, vt4 vt4Var, lu4 lu4Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        q54 q54Var2;
        xt4 xt4Var2;
        lu4 lu4Var2;
        vt4 vt4Var2;
        rv4Var.g0(1875484875);
        if (rv4Var.h(q54Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i2 | i;
        if (rv4Var.h(vt4Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i7 = i6 | i3;
        if (rv4Var.h(lu4Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if (rv4Var.h(xt4Var)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i9 = i8 | i5;
        if ((i9 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i9 & 1, z)) {
            String A = yqe.A((y3b) s2b.X.getValue(), rv4Var);
            q54Var2 = q54Var;
            xt4Var2 = xt4Var;
            g83 g83Var = new g83(q54Var2, vt4Var, lu4Var, xt4Var2, 11);
            vt4Var2 = vt4Var;
            lu4Var2 = lu4Var;
            l(A, nq7Var, jce.E(199585984, g83Var, rv4Var), rv4Var, 432);
        } else {
            q54Var2 = q54Var;
            xt4Var2 = xt4Var;
            lu4Var2 = lu4Var;
            vt4Var2 = vt4Var;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new wp0(q54Var2, nq7Var, vt4Var2, lu4Var2, xt4Var2, i);
        }
    }

    public static final void n(String str, nq7 nq7Var, long j, long j2, rv4 rv4Var, int i, int i2) {
        int i3;
        long j3;
        long j4;
        boolean z;
        nq7 nq7Var2;
        long j5;
        long j6;
        int i4;
        kq7 kq7Var;
        int i5;
        int i6;
        int i7;
        rv4Var.g0(1219270835);
        if ((i & 6) == 0) {
            if (rv4Var.f(str)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i;
        } else {
            i3 = i;
        }
        int i8 = i3 | 48;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j3 = j;
                if (rv4Var.e(j3)) {
                    i6 = 256;
                    i8 |= i6;
                }
            } else {
                j3 = j;
            }
            i6 = Token.CASE;
            i8 |= i6;
        } else {
            j3 = j;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                j4 = j2;
                if (rv4Var.e(j4)) {
                    i5 = 2048;
                    i8 |= i5;
                }
            } else {
                j4 = j2;
            }
            i5 = 1024;
            i8 |= i5;
        } else {
            j4 = j2;
        }
        if ((i8 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i8 & 1, z)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                if ((i2 & 4) != 0) {
                    i8 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i8 &= -7169;
                }
                i4 = i8;
                kq7Var = nq7Var;
            } else {
                if ((i2 & 4) != 0) {
                    j3 = rm1.g(((h27) rv4Var.j(j27.a)).a, 6.0f);
                    i8 &= -897;
                }
                int i9 = i2 & 8;
                kq7 kq7Var2 = kq7.a;
                if (i9 != 0) {
                    j4 = rm1.b(((h27) rv4Var.j(j27.a)).a.h, rv4Var);
                    i8 &= -7169;
                }
                i4 = i8;
                kq7Var = kq7Var2;
            }
            rv4Var.r();
            long q = zr1.q(10);
            tza tzaVar = j27.a;
            long j7 = j4;
            cvb.c(str, zbe.z(nmd.v(tte.k(kq7Var, ((h27) rv4Var.j(tzaVar)).c.a), j3, lre.g), 7.0f, 2.0f), j7, null, q, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((h27) rv4Var.j(tzaVar)).b.l, rv4Var, (i4 & 14) | 24576 | ((i4 >> 3) & 896), 24576, 114664);
            j6 = j7;
            nq7Var2 = kq7Var;
            j5 = j3;
        } else {
            rv4Var.X();
            nq7Var2 = nq7Var;
            j5 = j3;
            j6 = j4;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new x34(str, nq7Var2, j5, j6, i, i2, 0);
        }
    }

    public static final void o(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, String str) {
        int i2;
        int i3;
        boolean z;
        vt4 vt4Var2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-2127158768);
        if (rv4Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2 | 48;
        if (rv4Var.f(nq7Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i5 = i4 | i3 | 3072;
        if ((i5 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i5 & 1, z)) {
            Object P = rv4Var2.P();
            if (P == ax1.a) {
                P = new cd1(15);
                rv4Var2.o0(P);
            }
            vt4 vt4Var3 = (vt4) P;
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            cvb.c(str, new we6(1.0f, true), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.g, rv4Var2, i5 & 14, 0, 131068);
            rv4Var2 = rv4Var2;
            rv4Var2.e0(-1784333042);
            rv4Var2.q(false);
            rv4Var2.q(true);
            vt4Var2 = vt4Var3;
        } else {
            rv4Var2.X();
            vt4Var2 = vt4Var;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new k31(str, nq7Var, vt4Var2, i, 14);
        }
    }

    public static final long p(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final void q(su0 su0Var, aia aiaVar, rh8 rh8Var, bkd bkdVar, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean h;
        int i8;
        int i9;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1603587550);
        if ((i & 6) == 0) {
            if (rv4Var2.f(su0Var)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                h = rv4Var2.f(aiaVar);
            } else {
                h = rv4Var2.h(aiaVar);
            }
            if (h) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            obj = rh8Var;
            if (rv4Var2.f(obj)) {
                i7 = 256;
            } else {
                i7 = Token.CASE;
            }
            i2 |= i7;
        } else {
            obj = rh8Var;
        }
        if ((i & 3072) == 0) {
            obj2 = bkdVar;
            if (rv4Var2.f(obj2)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        } else {
            obj2 = bkdVar;
        }
        if ((i & 24576) == 0) {
            obj3 = nq7Var;
            if (rv4Var2.f(obj3)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        } else {
            obj3 = nq7Var;
        }
        if ((196608 & i) == 0) {
            obj4 = xt4Var;
            if (rv4Var2.h(obj4)) {
                i4 = 131072;
            } else {
                i4 = Parser.ARGC_LIMIT;
            }
            i2 |= i4;
        } else {
            obj4 = xt4Var;
        }
        if ((1572864 & i) == 0) {
            obj5 = xt4Var2;
            if (rv4Var2.h(obj5)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i2 |= i3;
        } else {
            obj5 = xt4Var2;
        }
        if ((599187 & i2) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i2 & 1, z)) {
            int i10 = aiaVar.b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            rv4Var2.e0(-442648540);
                            rv4Var2.q(false);
                        } else {
                            rv4Var2.e0(-443000452);
                            rh8 rh8Var2 = obj;
                            bkd bkdVar2 = obj2;
                            nq7 nq7Var2 = obj3;
                            xt4 xt4Var3 = obj4;
                            v(aiaVar, tg6.a(0, 3, rv4Var2), rh8Var2, bkdVar2, nq7Var2, xt4Var3, obj5, rv4Var2, (i2 & 3670016) | ((i2 >> 3) & 14) | (i2 & 896) | (i2 & 7168) | (i2 & 57344) | (i2 & 458752));
                            rv4Var2.q(false);
                        }
                    } else {
                        rv4Var2.e0(-443401220);
                        u(aiaVar, tg6.a(0, 3, rv4Var2), rh8Var, bkdVar, nq7Var, xt4Var, xt4Var2, rv4Var2, ((i2 >> 3) & 14) | (i2 & 896) | (i2 & 7168) | (i2 & 57344) | (i2 & 458752) | (i2 & 3670016));
                        rv4Var2.q(false);
                    }
                } else {
                    rv4Var2.e0(-443801988);
                    qg6 a2 = tg6.a(0, 3, rv4Var2);
                    int i11 = i2 & Token.ELSE;
                    int i12 = i2 << 3;
                    s(su0Var, aiaVar, a2, rh8Var, bkdVar, nq7Var, xt4Var, xt4Var2, rv4Var2, i11 | (i12 & 7168) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128));
                    rv4Var2 = rv4Var2;
                    rv4Var2.q(false);
                }
            } else {
                rv4Var2.e0(-444202756);
                qg6 a3 = tg6.a(0, 3, rv4Var2);
                int i13 = i2 & Token.ELSE;
                int i14 = i2 << 3;
                r(su0Var, aiaVar, a3, rh8Var, bkdVar, nq7Var, xt4Var, xt4Var2, rv4Var2, i13 | (i14 & 7168) | (i14 & 57344) | (i14 & 458752) | (i14 & 3670016) | (i14 & 29360128));
                rv4Var2 = rv4Var2;
                rv4Var2.q(false);
            }
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new i81((Object) su0Var, (Object) aiaVar, (Object) rh8Var, (Object) bkdVar, (Object) nq7Var, (hu4) xt4Var, (hu4) xt4Var2, i, 9);
        }
    }

    public static final void r(su0 su0Var, aia aiaVar, qg6 qg6Var, rh8 rh8Var, bkd bkdVar, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        Object obj;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean h;
        int i9;
        int i10;
        rv4Var.g0(-1004804133);
        if ((i & 6) == 0) {
            if (rv4Var.f(su0Var)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                h = rv4Var.f(aiaVar);
            } else {
                h = rv4Var.h(aiaVar);
            }
            if (h) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(qg6Var)) {
                i8 = 256;
            } else {
                i8 = Token.CASE;
            }
            i2 |= i8;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(rh8Var)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.f(bkdVar)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.f(nq7Var)) {
                i5 = 131072;
            } else {
                i5 = Parser.ARGC_LIMIT;
            }
            i2 |= i5;
        }
        if ((1572864 & i) == 0) {
            obj = xt4Var;
            if (rv4Var.h(obj)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        } else {
            obj = xt4Var;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        int i11 = i2;
        boolean z4 = false;
        if ((4793491 & i11) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i11 & 1, z)) {
            float n = dce.n(aiaVar.c, 80, Context.VERSION_ES6);
            int d = ((int) (su0Var.d() / n)) * 3;
            f25 f25Var = new f25(n);
            if ((i11 & Token.ASSIGN_MOD) != 32 && ((i11 & 64) == 0 || !rv4Var.h(aiaVar))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if ((3670016 & i11) == 1048576) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = z2 | z3;
            if ((29360128 & i11) == 8388608) {
                z4 = true;
            }
            boolean d2 = z5 | z4 | rv4Var.d(d);
            Object P = rv4Var.P();
            if (d2 || P == ax1.a) {
                xia xiaVar = new xia(aiaVar, d, obj, xt4Var2, 1);
                rv4Var.o0(xiaVar);
                P = xiaVar;
            }
            pc2.d(f25Var, nq7Var, qg6Var, rh8Var, null, null, null, false, 0L, 0L, bkdVar, nae.e, (xt4) P, rv4Var, ((i11 >> 12) & Token.ASSIGN_MOD) | (i11 & 896) | (i11 & 7168), (i11 >> 9) & Token.ASSIGN_MOD, 6128);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new yia(su0Var, aiaVar, qg6Var, rh8Var, bkdVar, nq7Var, xt4Var, xt4Var2, i, 1);
        }
    }

    public static final void s(su0 su0Var, aia aiaVar, qg6 qg6Var, rh8 rh8Var, bkd bkdVar, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        Object obj;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean h;
        int i9;
        int i10;
        rv4Var.g0(-302869540);
        if ((i & 6) == 0) {
            if (rv4Var.f(su0Var)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                h = rv4Var.f(aiaVar);
            } else {
                h = rv4Var.h(aiaVar);
            }
            if (h) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(qg6Var)) {
                i8 = 256;
            } else {
                i8 = Token.CASE;
            }
            i2 |= i8;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(rh8Var)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.f(bkdVar)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.f(nq7Var)) {
                i5 = 131072;
            } else {
                i5 = Parser.ARGC_LIMIT;
            }
            i2 |= i5;
        }
        if ((1572864 & i) == 0) {
            obj = xt4Var;
            if (rv4Var.h(obj)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        } else {
            obj = xt4Var;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        int i11 = i2;
        boolean z4 = false;
        if ((4793491 & i11) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i11 & 1, z)) {
            float n = dce.n(aiaVar.c, 80, Context.VERSION_ES6);
            int d = ((int) (su0Var.d() / n)) * 3;
            f25 f25Var = new f25(n);
            if ((i11 & Token.ASSIGN_MOD) != 32 && ((i11 & 64) == 0 || !rv4Var.h(aiaVar))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if ((3670016 & i11) == 1048576) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = z2 | z3;
            if ((29360128 & i11) == 8388608) {
                z4 = true;
            }
            boolean d2 = z5 | z4 | rv4Var.d(d);
            Object P = rv4Var.P();
            if (d2 || P == ax1.a) {
                xia xiaVar = new xia(aiaVar, d, obj, xt4Var2, 0);
                rv4Var.o0(xiaVar);
                P = xiaVar;
            }
            pc2.d(f25Var, nq7Var, qg6Var, rh8Var, null, null, null, false, 0L, 0L, bkdVar, nae.e, (xt4) P, rv4Var, ((i11 >> 12) & Token.ASSIGN_MOD) | (i11 & 896) | (i11 & 7168), (i11 >> 9) & Token.ASSIGN_MOD, 6128);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new yia(su0Var, aiaVar, qg6Var, rh8Var, bkdVar, nq7Var, xt4Var, xt4Var2, i, 0);
        }
    }

    public static final void t(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, cz7 cz7Var, rh8 rh8Var, bkd bkdVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        cz7 cz7Var2;
        pb2 pb2Var;
        pb2 pb2Var2;
        boolean z2;
        lh9 lh9Var;
        int i6;
        aw7 aw7Var;
        aw7 aw7Var2;
        rv4 rv4Var2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        cz7Var.getClass();
        vt4Var.getClass();
        rv4Var.g0(-256079254);
        if (rv4Var.f(cz7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i13 = i | i2;
        if (rv4Var.f(rh8Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i14 = i13 | i3;
        if (rv4Var.f(bkdVar)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i15 = i14 | i4;
        if (rv4Var.h(vt4Var)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i16 = i15 | i5;
        if ((i16 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i16 & 1, z)) {
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                lja ljaVar = (lja) ((fdd) voe.z(cm9.a(lja.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                sdd sddVar = (sdd) rv4Var.j(idd.b);
                if (sddVar == null) {
                    rv4Var.e0(1368428688);
                    sddVar = kv6.a(rv4Var);
                } else {
                    rv4Var.e0(1368426673);
                }
                rv4Var.q(false);
                if (sddVar != null) {
                    if (sddVar instanceof y35) {
                        pb2Var2 = ((y35) sddVar).f();
                    } else {
                        pb2Var2 = ob2.b;
                    }
                    pb2 pb2Var3 = pb2Var2;
                    q0a a3 = o96.a(rv4Var);
                    aw7 z3 = jsc.z(ljaVar.f, rv4Var);
                    jsc.z(((d1d) ((fdd) voe.z(cm9.a(d1d.class), sddVar.i(), null, pb2Var3, a3, null))).f, rv4Var);
                    Object[] objArr = new Object[0];
                    Object P = rv4Var.P();
                    lh9 lh9Var2 = ax1.a;
                    if (P == lh9Var2) {
                        P = new mia(4);
                        rv4Var.o0(P);
                    }
                    aw7 aw7Var3 = (aw7) zpe.k(objArr, (vt4) P, rv4Var, 48);
                    Object[] objArr2 = new Object[0];
                    Object P2 = rv4Var.P();
                    if (P2 == lh9Var2) {
                        P2 = new mia(5);
                        rv4Var.o0(P2);
                    }
                    aw7 aw7Var4 = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var, 48);
                    if (((aia) z3.getValue()).g.isEmpty() && ((aia) z3.getValue()).h.isEmpty() && ((aia) z3.getValue()).i.isEmpty() && ((aia) z3.getValue()).j.isEmpty()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (((aia) z3.getValue()).a) {
                        rv4Var.e0(-994308842);
                        rv4Var.q(false);
                        lh9Var = lh9Var2;
                        rv4Var2 = rv4Var;
                        cz7Var2 = cz7Var;
                        aw7Var2 = aw7Var3;
                        aw7Var = aw7Var4;
                        i6 = 0;
                    } else if (z2) {
                        rv4Var.e0(-994259304);
                        i6 = 0;
                        lh9Var = lh9Var2;
                        jxe.d(owe.D(rv4Var), yqe.A((y3b) o2b.s0.getValue(), rv4Var), yqe.A((y3b) o2b.t0.getValue(), rv4Var), zbe.x(pna.c, rh8Var), yqe.A((y3b) o2b.T.getValue(), rv4Var), vt4Var, rv4Var, (i16 << 3) & 458752, 0);
                        rv4Var.q(false);
                        rv4Var2 = rv4Var;
                        cz7Var2 = cz7Var;
                        aw7Var2 = aw7Var3;
                        aw7Var = aw7Var4;
                    } else {
                        lh9Var = lh9Var2;
                        i6 = 0;
                        rv4Var.e0(-993813307);
                        tw5 tw5Var = new tw5(rh8Var, bkdVar, cz7Var, aw7Var4, aw7Var3, z3, 1);
                        cz7Var2 = cz7Var;
                        aw7Var = aw7Var4;
                        aw7Var2 = aw7Var3;
                        rv4Var2 = rv4Var;
                        hc2.b(nq7Var, null, jce.E(1122588033, tw5Var, rv4Var), rv4Var2, 3078, 6);
                        rv4Var2.q(false);
                    }
                    String str = (String) aw7Var.getValue();
                    boolean booleanValue = ((Boolean) aw7Var2.getValue()).booleanValue();
                    boolean f = rv4Var2.f(aw7Var2);
                    Object P3 = rv4Var2.P();
                    if (f || P3 == lh9Var) {
                        P3 = new jia(aw7Var2, 4);
                        rv4Var2.o0(P3);
                    }
                    xt4 xt4Var = (xt4) P3;
                    boolean f2 = rv4Var2.f(aw7Var2);
                    int i17 = i16 & 14;
                    if (i17 == 4) {
                        i7 = 1;
                    } else {
                        i7 = i6;
                    }
                    int i18 = f2 | i7;
                    Object P4 = rv4Var2.P();
                    if (i18 != 0 || P4 == lh9Var) {
                        P4 = new if3(cz7Var2, aw7Var2, 6);
                        rv4Var2.o0(P4);
                    }
                    lu4 lu4Var = (lu4) P4;
                    boolean f3 = rv4Var2.f(aw7Var2);
                    if (i17 == 4) {
                        i8 = 1;
                    } else {
                        i8 = i6;
                    }
                    int i19 = f3 | i8;
                    Object P5 = rv4Var2.P();
                    if (i19 != 0 || P5 == lh9Var) {
                        P5 = new w73(cz7Var2, aw7Var2, 28);
                        rv4Var2.o0(P5);
                    }
                    xt4 xt4Var2 = (xt4) P5;
                    boolean f4 = rv4Var2.f(aw7Var2);
                    if (i17 == 4) {
                        i9 = 1;
                    } else {
                        i9 = i6;
                    }
                    int i20 = f4 | i9;
                    Object P6 = rv4Var2.P();
                    if (i20 != 0 || P6 == lh9Var) {
                        P6 = new w73(cz7Var2, aw7Var2, 29);
                        rv4Var2.o0(P6);
                    }
                    xt4 xt4Var3 = (xt4) P6;
                    boolean f5 = rv4Var2.f(aw7Var2);
                    if (i17 == 4) {
                        i10 = 1;
                    } else {
                        i10 = i6;
                    }
                    int i21 = f5 | i10;
                    Object P7 = rv4Var2.P();
                    if (i21 != 0 || P7 == lh9Var) {
                        P7 = new hja(cz7Var2, aw7Var2, i6);
                        rv4Var2.o0(P7);
                    }
                    xt4 xt4Var4 = (xt4) P7;
                    boolean f6 = rv4Var2.f(aw7Var2);
                    if (i17 == 4) {
                        i11 = 1;
                    } else {
                        i11 = i6;
                    }
                    int i22 = f6 | i11;
                    Object P8 = rv4Var2.P();
                    if (i22 == 0 && P8 != lh9Var) {
                        i12 = 1;
                    } else {
                        i12 = 1;
                        P8 = new hja(cz7Var2, aw7Var2, 1);
                        rv4Var2.o0(P8);
                    }
                    xt4 xt4Var5 = (xt4) P8;
                    if (i17 == 4) {
                        i6 = i12;
                    }
                    Object P9 = rv4Var2.P();
                    if (i6 != 0 || P9 == lh9Var) {
                        P9 = new ar0(cz7Var2, 22);
                        rv4Var2.o0(P9);
                    }
                    ube.e(booleanValue, str, xt4Var, lu4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, (xt4) P9, rv4Var2, 0);
                } else {
                    vs.k("No ViewModelStoreOwner was provided via LocalRootViewModelStoreOwner or LocalViewModelStoreOwner");
                    return;
                }
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            cz7Var2 = cz7Var;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new nf3(cz7Var2, rh8Var, bkdVar, nq7Var, vt4Var, i, 6);
        }
    }

    public static final void u(aia aiaVar, qg6 qg6Var, rh8 rh8Var, bkd bkdVar, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        Object obj;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean h;
        int i9;
        rv4Var.g0(683620644);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var.f(aiaVar);
            } else {
                h = rv4Var.h(aiaVar);
            }
            if (h) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(qg6Var)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(rh8Var)) {
                i7 = 256;
            } else {
                i7 = Token.CASE;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            obj = bkdVar;
            if (rv4Var.f(obj)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        } else {
            obj = bkdVar;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.f(nq7Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(xt4Var)) {
                i4 = 131072;
            } else {
                i4 = Parser.ARGC_LIMIT;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i2 |= i3;
        }
        boolean z4 = true;
        if ((599187 & i2) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            f25 f25Var = new f25(dce.n(aiaVar.c, 180, 400));
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !rv4Var.h(aiaVar))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if ((458752 & i2) == 131072) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = z2 | z3;
            if ((3670016 & i2) != 1048576) {
                z4 = false;
            }
            boolean z6 = z5 | z4;
            Object P = rv4Var.P();
            if (z6 || P == ax1.a) {
                P = new via(aiaVar, xt4Var, xt4Var2, 0);
                rv4Var.o0(P);
            }
            int i10 = i2 << 3;
            pc2.d(f25Var, nq7Var, qg6Var, rh8Var, null, null, null, false, 0L, 0L, obj, nae.e, (xt4) P, rv4Var, ((i2 >> 9) & Token.ASSIGN_MOD) | (i10 & 896) | (i10 & 7168), (i2 >> 6) & Token.ASSIGN_MOD, 6128);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new wia(aiaVar, qg6Var, rh8Var, bkdVar, nq7Var, xt4Var, xt4Var2, i, 0);
        }
    }

    public static final void v(aia aiaVar, qg6 qg6Var, rh8 rh8Var, bkd bkdVar, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        Object obj;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean h;
        int i9;
        rv4Var.g0(1385555237);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var.f(aiaVar);
            } else {
                h = rv4Var.h(aiaVar);
            }
            if (h) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(qg6Var)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(rh8Var)) {
                i7 = 256;
            } else {
                i7 = Token.CASE;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            obj = bkdVar;
            if (rv4Var.f(obj)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        } else {
            obj = bkdVar;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.f(nq7Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(xt4Var)) {
                i4 = 131072;
            } else {
                i4 = Parser.ARGC_LIMIT;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i2 |= i3;
        }
        if ((599187 & i2) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            f25 f25Var = new f25(dce.n(aiaVar.c, 150, 400));
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !rv4Var.h(aiaVar))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if ((458752 & i2) == 131072) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = z2 | z3;
            if ((3670016 & i2) == 1048576) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z6 = z5 | z4;
            Object P = rv4Var.P();
            if (z6 || P == ax1.a) {
                P = new via(aiaVar, xt4Var, xt4Var2, 1);
                rv4Var.o0(P);
            }
            int i10 = i2 << 3;
            pc2.d(f25Var, nq7Var, qg6Var, rh8Var, null, null, null, false, 0L, 0L, obj, nae.e, (xt4) P, rv4Var, ((i2 >> 9) & Token.ASSIGN_MOD) | (i10 & 896) | (i10 & 7168), (i2 >> 6) & Token.ASSIGN_MOD, 6128);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new wia(aiaVar, qg6Var, rh8Var, bkdVar, nq7Var, xt4Var, xt4Var2, i, 1);
        }
    }

    public static final void w(nq7 nq7Var, rv4 rv4Var, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ba5 ba5Var = lre.g;
        lk0 lk0Var = kh5.I;
        rv4Var.g0(-1895040672);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i & 1, z)) {
            ez ezVar = lz.c;
            xn1 a2 = wn1.a(ezVar, lk0Var, rv4Var, 0);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var, p);
            kq7 kq7Var = kq7.a;
            nq7 f = pna.f(kq7Var, 1.0f);
            tza tzaVar = j27.a;
            nq7 A = zbe.A(nmd.v(tte.k(f, v72.d(((h27) rv4Var.j(tzaVar)).c.d, null, null, new sg3(nae.e), new sg3(nae.e), 3)), rm1.g(((h27) rv4Var.j(tzaVar)).a, 2.0f), ba5Var), 16.0f, nae.e, 2);
            xn1 a3 = wn1.a(ezVar, lk0Var, rv4Var, 0);
            ez ezVar2 = ezVar;
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, A);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a3);
            jce.F(npVar2, rv4Var, l2);
            s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p2);
            nq7 f2 = hl5.f(kq7Var, 16.0f, rv4Var, kq7Var, 1.0f);
            gv9 a4 = ev9.a(lz.a, kh5.G, rv4Var, 48);
            int hashCode3 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p3 = lye.p(rv4Var, f2);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a4);
            jce.F(npVar2, rv4Var, l3);
            s21.t(hashCode3, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p3);
            dpe.g(pna.p(kq7Var, 150.0f, 30.0f), null, rv4Var, 6, 2);
            xbe.i(rv4Var, pna.s(kq7Var, 12.0f));
            dpe.g(pna.p(kq7Var, 72.0f, 22.0f), null, rv4Var, 6, 2);
            xbe.i(rv4Var, new we6(1.0f, true));
            dpe.g(pna.n(kq7Var, 24.0f), null, rv4Var, 6, 2);
            rs8.u(rv4Var, true, kq7Var, 12.0f, rv4Var);
            dpe.g(pna.h(pna.f(kq7Var, 1.0f), 52.0f), null, rv4Var, 6, 2);
            float f3 = 8.0f;
            xbe.i(rv4Var, pna.h(kq7Var, 8.0f));
            rv4Var.q(true);
            rv4Var.e0(859815679);
            int i2 = 0;
            while (i2 < 12) {
                if (i2 == 11) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                nq7 f4 = pna.f(kq7Var, 1.0f);
                ez ezVar3 = ezVar2;
                xn1 a5 = wn1.a(ezVar3, lk0Var, rv4Var, 0);
                int i3 = i2;
                int hashCode4 = Long.hashCode(rv4Var.T);
                xt8 l4 = rv4Var.l();
                nq7 p4 = lye.p(rv4Var, f4);
                rw1.k.getClass();
                zx1 zx1Var2 = qw1.b;
                rv4Var.i0();
                if (rv4Var.S) {
                    rv4Var.k(zx1Var2);
                } else {
                    rv4Var.r0();
                }
                jce.F(qw1.f, rv4Var, a5);
                jce.F(qw1.e, rv4Var, l4);
                jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode4));
                jce.C(qw1.h, rv4Var);
                jce.F(qw1.d, rv4Var, p4);
                tza tzaVar2 = j27.a;
                kq7 kq7Var2 = kq7Var;
                vqe.m(nae.e, 0, 2, rm1.g(((h27) rv4Var.j(tzaVar2)).a, f3), rv4Var, zbe.A(nmd.v(kq7Var, rm1.g(((h27) rv4Var.j(tzaVar2)).a, 2.0f), ba5Var), 16.0f, nae.e, 2));
                nq7 z5 = zbe.z(nmd.v(r1d.m(pna.f(kq7Var2, 1.0f), z2, new gjb(2), rv4Var, 6), rm1.g(((h27) rv4Var.j(tzaVar2)).a, 2.0f), ba5Var), 16.0f, 8.0f);
                if (i3 % 3 == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i3 % 4 == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                c(z5, z3, z4, rv4Var, 0);
                rv4Var.q(true);
                i2 = i3 + 1;
                ezVar2 = ezVar3;
                kq7Var = kq7Var2;
                f3 = 8.0f;
            }
            rv4Var.q(false);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new oa(nq7Var, i, 28);
        }
    }

    public static final void x(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var) {
        int i2;
        boolean z;
        nq7 nq7Var2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(609551011);
        if (rv4Var2.h(vt4Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i3 = i2 | i;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i3 & 1, z)) {
            tza tzaVar = j27.a;
            nq7 y = zbe.y(nmd.v(tte.k(nq7Var, ((h27) rv4Var2.j(tzaVar)).c.d), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 2.0f), lre.g), 16.0f);
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, y);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            cvb.c(yqe.A((y3b) o3b.N.getValue(), rv4Var2), null, 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.g, rv4Var2, 0, 0, 130046);
            rv4Var2 = rv4Var2;
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var2, pna.h(kq7Var, 24.0f));
            nq7Var2 = nq7Var;
            z1d.f(rp5.c((wk3) ok3.g0.getValue(), rv4Var2, 0), yqe.A((y3b) b3b.B.getValue(), rv4Var2), false, null, null, null, null, null, vt4Var, rv4Var2, (i3 << 21) & 234881024, 252);
            hl5.w(kq7Var, 12.0f, rv4Var2, true);
        } else {
            nq7Var2 = nq7Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new u81(nq7Var2, vt4Var, i, 12);
        }
    }

    public static final Long y(og5 og5Var) {
        og5Var.getClass();
        String b = og5Var.a().b("Content-Length");
        if (b != null) {
            return r4b.T(10, b);
        }
        return null;
    }

    public static final e32 z(og5 og5Var) {
        og5Var.getClass();
        String b = og5Var.a().b("Content-Type");
        if (b != null) {
            e32 e32Var = e32.e;
            return h9a.Q(b);
        }
        return null;
    }
}
