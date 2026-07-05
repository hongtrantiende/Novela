package defpackage;

import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eh  reason: default package */
/* loaded from: classes3.dex */
public abstract class eh {
    public static final kk0 a = new kk0(-1.0f);
    public static final kk0 b = new kk0(1.0f);
    public static final tu1 c = new tu1(new lv1(29), false, 2136575966);

    public static final long A(long j, long j2) {
        int i = az5.c;
        return c(k27.A(lz9.b(j2) * ((int) (j >> 32))), k27.A(lz9.c(j2) * ((int) (j & 4294967295L))));
    }

    public static final j62 B(m62 m62Var) {
        fa7 fa7Var;
        m62Var.getClass();
        long j = m62Var.a;
        String str = m62Var.b;
        String str2 = m62Var.c;
        String str3 = m62Var.d;
        String str4 = m62Var.e;
        ia7 ia7Var = m62Var.f;
        if (ia7Var != null) {
            fa7Var = fre.v(ia7Var);
        } else {
            fa7Var = null;
        }
        int i = m62Var.g;
        bzc bzcVar = null;
        int i2 = m62Var.h;
        fa7 fa7Var2 = fa7Var;
        boolean z = m62Var.i;
        vzc vzcVar = m62Var.j;
        if (vzcVar != null) {
            bzcVar = fpe.y(vzcVar);
        }
        return new j62(j, str, str2, str3, str4, fa7Var2, i, i2, z, bzcVar, m62Var.k, m62Var.l);
    }

    public static final String C(long j) {
        StringBuilder sb = new StringBuilder();
        int i = az5.c;
        sb.append((int) (j >> 32));
        sb.append('x');
        sb.append((int) (j & 4294967295L));
        return sb.toString();
    }

    public static final long D(long j) {
        int i = az5.c;
        return ctd.p((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static String E(String str) {
        if (!str.isEmpty()) {
            try {
                zhe zheVar = new zhe();
                zheVar.zza(str);
                if (!TextUtils.isEmpty(zheVar.b)) {
                    return zheVar.b;
                }
                throw new Exception("No error message: ".concat(str));
            } catch (Exception e) {
                throw new Exception(s21.m("Json conversion failed! ", e.getMessage()), e);
            }
        }
        return null;
    }

    public static l1e F(String str, l1e l1eVar) {
        try {
            return l1eVar.zza(str);
        } catch (Exception e) {
            throw new Exception(s21.m("Json conversion failed! ", e.getMessage()), e);
        }
    }

    public static final void a(ar5 ar5Var, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Object obj;
        int i6;
        int i7;
        boolean z;
        nq7 nq7Var2;
        Object obj2;
        vt4 vt4Var3;
        ar5Var.getClass();
        rv4Var.g0(-1142947757);
        if (rv4Var.f(ar5Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i | i3;
        int i9 = i2 & 2;
        if (i9 != 0) {
            i8 |= 48;
        } else if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i8 |= i4;
        }
        if (rv4Var.h(vt4Var)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i10 = i8 | i5;
        int i11 = i2 & 8;
        if (i11 != 0) {
            i7 = i10 | 3072;
            obj = vt4Var2;
        } else {
            obj = vt4Var2;
            if (rv4Var.h(obj)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i7 = i10 | i6;
        }
        if ((i7 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i7 & 1, z)) {
            if (i9 != 0) {
                nq7Var2 = kq7.a;
            } else {
                nq7Var2 = nq7Var;
            }
            if (i11 != 0) {
                Object P = rv4Var.P();
                if (P == ax1.a) {
                    P = new cd1(15);
                    rv4Var.o0(P);
                }
                vt4Var3 = (vt4) P;
            } else {
                vt4Var3 = obj;
            }
            nq7 n = pna.n(nq7Var2, 32.0f);
            su9 su9Var = uu9.a;
            nq7 h = lbe.h(tte.k(n, su9Var), vt4Var3, vt4Var);
            tza tzaVar = j27.a;
            nk5.a(ar5Var, null, zbe.y(nmd.v(zbe.y(nmd.v(h, rm1.g(((h27) rv4Var.j(tzaVar)).a, 16.0f), lre.g), 1.0f), rm1.g(((h27) rv4Var.j(tzaVar)).a, 8.0f), su9Var), 6.0f), ((h27) rv4Var.j(tzaVar)).a.q, rv4Var, (i7 & 14) | 48, 0);
            obj2 = vt4Var3;
        } else {
            rv4Var.X();
            nq7Var2 = nq7Var;
            obj2 = obj;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new xj7(ar5Var, nq7Var2, vt4Var, obj2, i, i2, 10);
        }
    }

    public static BitmapShader b(jj jjVar) {
        return new BitmapShader(ay5.a(jjVar), kte.k(0), kte.k(0));
    }

    public static final long c(int i, int i2) {
        long j = (i2 & 4294967295L) | (i << 32);
        int i3 = az5.c;
        return j;
    }

    public static final LinearGradient d(int i, long j, long j2, List list, List list2) {
        float[] fArr;
        ase.D(list, list2);
        if (Build.VERSION.SDK_INT >= 29) {
            long[] B = ase.B(list);
            if (list2 != null) {
                fArr = sl1.z0(list2);
            } else {
                fArr = null;
            }
            return d15.a.a(j, j2, B, fArr, i);
        }
        int u = ase.u(list);
        return new LinearGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (4294967295L & j2)), ase.x(u, list), ase.y(u, list2, list), kte.k(i));
    }

    public static /* synthetic */ LinearGradient e(int i, long j, long j2, List list, List list2) {
        if ((i & 8) != 0) {
            list2 = null;
        }
        return d(0, j, j2, list, list2);
    }

    public static final void f(rp6 rp6Var, np6 np6Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        rp6 rp6Var2;
        kq7 kq7Var;
        boolean z2;
        c81 c81Var;
        int i4;
        float f;
        zp6 zp6Var;
        aw7 aw7Var;
        f81 f81Var;
        zm4 zm4Var;
        zm4 zm4Var2;
        boolean z3;
        boolean z4;
        String str;
        int i5;
        np npVar;
        kq7 kq7Var2;
        np npVar2;
        np npVar3;
        boolean z5;
        int i6;
        lh9 lh9Var;
        int i7;
        boolean z6;
        boolean z7;
        boolean z8;
        rv4 rv4Var2 = rv4Var;
        Float valueOf = Float.valueOf(Float.MAX_VALUE);
        rp6Var.getClass();
        zp6 zp6Var2 = rp6Var.d;
        rv4Var2.g0(1197167086);
        if (rv4Var2.f(rp6Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (rv4Var2.f(np6Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3 | 384;
        if ((i9 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i9 & 1, z)) {
            tza tzaVar = jt6.a;
            p71 p71Var = ((e81) rv4Var2.j(tzaVar)).a;
            f81 f81Var2 = ((e81) rv4Var2.j(tzaVar)).b;
            c81 c81Var2 = (c81) rv4Var2.j(it6.a);
            r13 r13Var = (r13) rv4Var2.j(dy1.h);
            float L0 = r13Var.L0(320.0f);
            float L02 = r13Var.L0(220.0f);
            Object P = rv4Var2.P();
            lh9 lh9Var2 = ax1.a;
            if (P == lh9Var2) {
                P = yae.z(valueOf);
                rv4Var2.o0(P);
            }
            aw7 aw7Var2 = (aw7) P;
            Object P2 = rv4Var2.P();
            if (P2 == lh9Var2) {
                P2 = yae.z(valueOf);
                rv4Var2.o0(P2);
            }
            aw7 aw7Var3 = (aw7) P2;
            Object P3 = rv4Var2.P();
            if (P3 == lh9Var2) {
                P3 = s21.e(rv4Var2);
            }
            zm4 zm4Var3 = (zm4) P3;
            Object P4 = rv4Var2.P();
            if (P4 == lh9Var2) {
                P4 = s21.e(rv4Var2);
            }
            zm4 zm4Var4 = (zm4) P4;
            if ((i9 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P5 = rv4Var2.P();
            if (!z2 && P5 != lh9Var2) {
                f81Var = f81Var2;
                zp6Var = zp6Var2;
                zm4Var2 = zm4Var4;
                zm4Var = zm4Var3;
                c81Var = c81Var2;
                aw7Var = aw7Var2;
                i4 = i9;
                f = L02;
            } else {
                c81Var = c81Var2;
                i4 = i9;
                f = L02;
                zp6Var = zp6Var2;
                aw7Var = aw7Var2;
                f81Var = f81Var2;
                ol olVar = new ol(rp6Var, zm4Var3, zm4Var4, (m42) null, 15);
                zm4Var = zm4Var3;
                zm4Var2 = zm4Var4;
                rv4Var2.o0(olVar);
                P5 = olVar;
            }
            pvc pvcVar = pvc.a;
            yte.g((lu4) P5, rv4Var2, pvcVar);
            ze4 ze4Var = pna.c;
            int i10 = i4 & Token.ASSIGN_MOD;
            if (i10 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P6 = rv4Var2.P();
            if (z3 || P6 == lh9Var2) {
                P6 = new vi(np6Var, 5);
                rv4Var2.o0(P6);
            }
            nq7 b2 = dab.b(ze4Var, pvcVar, (PointerInputEventHandler) P6);
            Object P7 = rv4Var2.P();
            if (P7 == lh9Var2) {
                P7 = new pr0(aw7Var, aw7Var3, 14);
                rv4Var2.o0(P7);
            }
            nq7 y = obe.y(b2, (xt4) P7);
            b37 d = fu0.d(kh5.a, false);
            aw7 aw7Var4 = aw7Var;
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
            np npVar4 = qw1.f;
            jce.F(npVar4, rv4Var2, d);
            np npVar5 = qw1.e;
            jce.F(npVar5, rv4Var2, l);
            Integer valueOf2 = Integer.valueOf(hashCode);
            np npVar6 = qw1.g;
            jce.F(npVar6, rv4Var2, valueOf2);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar7 = qw1.d;
            jce.F(npVar7, rv4Var2, p);
            boolean c2 = rv4Var2.c(f) | rv4Var2.c(L0) | rv4Var2.c(((Number) aw7Var4.getValue()).floatValue()) | rv4Var2.c(((Number) aw7Var3.getValue()).floatValue());
            Object P8 = rv4Var2.P();
            if (c2 || P8 == lh9Var2) {
                float floatValue = ((Number) aw7Var4.getValue()).floatValue();
                float floatValue2 = (((Number) aw7Var3.getValue()).floatValue() - L0) / 2.0f;
                if (floatValue2 < nae.e) {
                    floatValue2 = 0.0f;
                }
                float f2 = (floatValue - f) / 2.0f;
                if (f2 < nae.e) {
                    f2 = 0.0f;
                }
                y78 y78Var = new y78((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(floatValue2) << 32));
                rv4Var2.o0(y78Var);
                P8 = y78Var;
            }
            long j = ((y78) P8).a;
            su9 a2 = uu9.a(8.0f);
            boolean e = rv4Var2.e(j);
            Object P9 = rv4Var2.P();
            if (e || P9 == lh9Var2) {
                P9 = new th(j, 12);
                rv4Var2.o0(P9);
            }
            kq7 kq7Var3 = kq7.a;
            nq7 v = nmd.v(st0.s(pna.j(pna.s(lbe.p(kq7Var3, (xt4) P9), 320.0f), nae.e, 260.0f, 1), 8.0f, a2, 28), p71Var.d, a2);
            Object P10 = rv4Var2.P();
            if (P10 == lh9Var2) {
                P10 = yw2.d;
                rv4Var2.o0(P10);
            }
            nq7 y2 = zbe.y(dab.b(v, pvcVar, (PointerInputEventHandler) P10), 12.0f);
            xn1 a3 = wn1.a(new hz(8.0f, true, new vs(2)), kh5.I, rv4Var2, 6);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, y2);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar4, rv4Var2, a3);
            jce.F(npVar5, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar6, rv4Var2, kgVar);
            jce.F(npVar7, rv4Var2, p2);
            String str2 = c81Var.q;
            String str3 = rp6Var.a;
            if (i10 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P11 = rv4Var2.P();
            if (!z4 && P11 != lh9Var2) {
                str = str3;
                i5 = i10;
                npVar2 = npVar5;
                npVar3 = npVar4;
                npVar = npVar6;
                kq7Var2 = kq7Var3;
            } else {
                str = str3;
                i5 = i10;
                npVar = npVar6;
                kq7Var2 = kq7Var3;
                npVar2 = npVar5;
                npVar3 = npVar4;
                mp6 mp6Var = new mp6(1, np6Var, np6.class, "updateTitle", "updateTitle(Ljava/lang/String;)V", 0, 0);
                rv4Var2.o0(mp6Var);
                P11 = mp6Var;
            }
            f81 f81Var3 = f81Var;
            h(str2, str, (xt4) ((i76) P11), oyb.a(f81Var3.a, p71Var.c, 0L, null, null, null, 0L, null, 0, 0L, null, 16777214), oyb.a(f81Var3.i, p71Var.g, 0L, null, null, null, 0L, null, 0, 0L, null, 16777214), p71Var.p, p71Var.k, zm4Var, rv4Var2, 12582912);
            String str4 = c81Var.r;
            String str5 = rp6Var.b;
            int i11 = i5;
            if (i11 == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object P12 = rv4Var2.P();
            if (!z5 && P12 != lh9Var2) {
                i6 = i11;
            } else {
                i6 = i11;
                mp6 mp6Var2 = new mp6(1, np6Var, np6.class, "updateUrl", "updateUrl(Ljava/lang/String;)V", 0, 1);
                rv4Var2.o0(mp6Var2);
                P12 = mp6Var2;
            }
            rp6Var2 = rp6Var;
            h(str4, str5, (xt4) ((i76) P12), oyb.a(f81Var3.a, p71Var.c, 0L, null, null, null, 0L, null, 0, 0L, null, 16777214), oyb.a(f81Var3.i, p71Var.g, 0L, null, null, null, 0L, null, 0, 0L, null, 16777214), p71Var.p, p71Var.k, zm4Var2, rv4Var2, 12582912);
            if (zp6Var != null && !k4b.j0(rp6Var2.b)) {
                rv4Var2.e0(1136882299);
                qye.b((String) c81Var.s.invoke(zp6Var), null, oyb.a(f81Var3.i, p71Var.v, 0L, null, null, null, 0L, null, 0, 0L, null, 16777214), null, 0, false, 0, 0, null, rv4Var, 0, 1018);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(1137094680);
                rv4Var2.q(false);
            }
            kq7 kq7Var4 = kq7Var2;
            nq7 f3 = pna.f(kq7Var4, 1.0f);
            gv9 a4 = ev9.a(new hz(6.0f, true, new q6(kh5.K, 1)), kh5.G, rv4Var2, 54);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, f3);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar3, rv4Var2, a4);
            jce.F(npVar2, rv4Var2, l3);
            s21.t(hashCode3, rv4Var2, npVar, rv4Var2, kgVar);
            jce.F(npVar7, rv4Var2, p3);
            if (rp6Var2.g) {
                rv4Var2.e0(607998670);
                String str6 = c81Var.p;
                i7 = i6;
                if (i7 == 32) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                Object P13 = rv4Var2.P();
                lh9Var = lh9Var2;
                if (z8 || P13 == lh9Var) {
                    P13 = new v7(0, np6Var, np6.class, "remove", "remove()V", 0, 23);
                    rv4Var2.o0(P13);
                }
                g(str6, true, false, (vt4) ((i76) P13), rv4Var2, 432);
                z6 = false;
                rv4Var2.q(false);
            } else {
                lh9Var = lh9Var2;
                i7 = i6;
                z6 = false;
                rv4Var2.e0(608250452);
                rv4Var2.q(false);
            }
            String str7 = c81Var.o;
            if (i7 == 32) {
                z7 = true;
            } else {
                z7 = z6;
            }
            Object P14 = rv4Var2.P();
            if (z7 || P14 == lh9Var) {
                P14 = new v7(0, np6Var, np6.class, "dismiss", "dismiss()V", 0, 24);
                rv4Var2.o0(P14);
            }
            g(str7, true, false, (vt4) ((i76) P14), rv4Var2, 432);
            String str8 = c81Var.n;
            boolean z9 = rp6Var2.f;
            if (i7 == 32) {
                z6 = true;
            }
            Object P15 = rv4Var2.P();
            if (z6 || P15 == lh9Var) {
                P15 = new v7(0, np6Var, np6.class, "apply", "apply()V", 0, 25);
                rv4Var2.o0(P15);
            }
            g(str8, z9, true, (vt4) ((i76) P15), rv4Var2, 384);
            hl5.v(rv4Var2, true, true, true);
            kq7Var = kq7Var4;
        } else {
            rp6Var2 = rp6Var;
            rv4Var2.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ax(rp6Var2, np6Var, kq7Var, i, 23);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(java.lang.String r31, boolean r32, boolean r33, defpackage.vt4 r34, defpackage.rv4 r35, int r36) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eh.g(java.lang.String, boolean, boolean, vt4, rv4, int):void");
    }

    public static final void h(final String str, final String str2, final xt4 xt4Var, final oyb oybVar, final oyb oybVar2, final long j, final long j2, final zm4 zm4Var, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1841979397);
        if (rv4Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (rv4Var2.f(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if (rv4Var2.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i11 = i10 | i4;
        if (rv4Var2.f(oybVar)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (rv4Var2.f(oybVar2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if (rv4Var2.e(j)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i14 = i13 | i7;
        if (rv4Var2.e(j2)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i15 = i14 | i8;
        if ((4793491 & i15) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i15 & 1, z)) {
            xn1 a2 = wn1.a(new hz(4.0f, true, new vs(2)), kh5.I, rv4Var2, 6);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            kq7 kq7Var = kq7.a;
            nq7 p = lye.p(rv4Var2, kq7Var);
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
            qye.b(str, null, oybVar2, null, 0, false, 0, 0, null, rv4Var2, (i15 & 14) | ((i15 >> 6) & 896), 1018);
            esa esaVar = new esa(j);
            nq7 n = mwe.n(zbe.z(st0.d(pna.j(pna.f(kq7Var, 1.0f), 38.0f, nae.e, 2), 1.0f, j2, uu9.a(6.0f)), 8.0f, 8.0f), zm4Var);
            int i16 = i15 >> 3;
            hj0.c(str2, xt4Var, n, false, false, oybVar, null, null, true, 0, 0, null, null, null, esaVar, null, rv4Var, (i16 & Token.ASSIGN_MOD) | (i16 & 14) | 100663296 | ((i15 << 6) & 458752), 0, 48856);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new lu4(str, str2, xt4Var, oybVar, oybVar2, j, j2, zm4Var, i) { // from class: lp6
                public final /* synthetic */ long C;
                public final /* synthetic */ zm4 D;
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ xt4 c;
                public final /* synthetic */ oyb d;
                public final /* synthetic */ oyb e;
                public final /* synthetic */ long f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p2 = xoe.p(12582913);
                    eh.h(this.a, this.b, this.c, this.d, this.e, this.f, this.C, this.D, (rv4) obj, p2);
                    return pvc.a;
                }
            };
        }
    }

    public static final void i(final boolean z, final String str, final String str2, final int i, final int i2, final boolean z2, final amc amcVar, final nq7 nq7Var, final vt4 vt4Var, final vt4 vt4Var2, final xt4 xt4Var, final vt4 vt4Var3, final vt4 vt4Var4, final vt4 vt4Var5, final vt4 vt4Var6, final vt4 vt4Var7, final vt4 vt4Var8, rv4 rv4Var, final int i3, final int i4) {
        int i5;
        Object obj;
        int i6;
        Object obj2;
        nq7 nq7Var2;
        int i7;
        rv4 rv4Var2 = rv4Var;
        amcVar.getClass();
        vt4Var.getClass();
        vt4Var2.getClass();
        xt4Var.getClass();
        vt4Var3.getClass();
        vt4Var4.getClass();
        vt4Var5.getClass();
        vt4Var6.getClass();
        vt4Var7.getClass();
        vt4Var8.getClass();
        rv4Var2.g0(1876207986);
        if ((i3 & 6) == 0) {
            i5 = (rv4Var2.g(z) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            obj = str;
            i5 |= rv4Var2.f(obj) ? 32 : 16;
        } else {
            obj = str;
        }
        if ((i3 & 384) == 0) {
            i5 |= rv4Var2.f(str2) ? 256 : Token.CASE;
        }
        if ((i3 & 3072) == 0) {
            i5 |= rv4Var2.d(i) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= rv4Var2.d(i2) ? 16384 : 8192;
        }
        int i8 = i3 & 196608;
        int i9 = Parser.ARGC_LIMIT;
        if (i8 == 0) {
            i5 |= rv4Var2.g(z2) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= rv4Var2.f(amcVar) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= rv4Var2.f(nq7Var) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= rv4Var2.h(vt4Var) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= rv4Var2.h(vt4Var2) ? 536870912 : 268435456;
        }
        int i10 = i5;
        if ((i4 & 6) == 0) {
            i6 = i4 | (rv4Var2.h(xt4Var) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= rv4Var2.h(vt4Var3) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            obj2 = vt4Var4;
            i6 |= rv4Var2.h(obj2) ? 256 : Token.CASE;
        } else {
            obj2 = vt4Var4;
        }
        if ((i4 & 3072) == 0) {
            i6 |= rv4Var2.h(vt4Var5) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= rv4Var2.h(vt4Var6) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            if (rv4Var2.h(vt4Var7)) {
                i9 = 131072;
            }
            i6 |= i9;
        }
        if ((i4 & 1572864) == 0) {
            i6 |= rv4Var2.h(vt4Var8) ? 1048576 : 524288;
        }
        int i11 = i6;
        if (rv4Var2.U(i10 & 1, ((i10 & 306783379) == 306783378 && (i11 & 599187) == 599186) ? false : true)) {
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            kq7 kq7Var = kq7.a;
            nq7 f = pna.f(kq7Var, 1.0f);
            eu3 g = zt3.g(null, 3);
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                nq7Var2 = f;
                i7 = 3;
                P = new txb(3);
                rv4Var2.o0(P);
            } else {
                nq7Var2 = f;
                i7 = 3;
            }
            eu3 a3 = g.a(zt3.t((xt4) P));
            lz3 i12 = zt3.i(null, i7);
            Object P2 = rv4Var2.P();
            if (P2 == lh9Var) {
                P2 = new txb(4);
                rv4Var2.o0(P2);
            }
            rte.e(z, nq7Var2, a3, i12.a(zt3.x((xt4) P2)), null, jce.E(-2055345692, new y2c(vt4Var6, vt4Var, vt4Var2, vt4Var3, z2, xt4Var, obj2, vt4Var5, obj, str2), rv4Var2), rv4Var, 1600902 | ((i10 << 3) & Token.ASSIGN_MOD), 16);
            nq7 f2 = pna.f(kq7Var, 1.0f);
            nk0 nk0Var = kh5.a;
            b37 d = fu0.d(nk0Var, false);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, f2);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, d);
            jce.F(npVar2, rv4Var, l2);
            s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p2);
            boolean z3 = amcVar.a && z;
            pu0 pu0Var = pu0.a;
            ch0.k(z3, amcVar, pu0Var.a(kq7Var, nk0Var), vt4Var8, rv4Var, ((i10 >> 15) & Token.ASSIGN_MOD) | ((i11 >> 9) & 7168));
            int i13 = i10 >> 6;
            aze.j(z, i, i2, pu0Var.a(kq7Var, kh5.c), vt4Var7, rv4Var, (i10 & 14) | (i13 & Token.ASSIGN_MOD) | (i13 & 896) | (57344 & (i11 >> 3)));
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new lu4() { // from class: z2c
                @Override // defpackage.lu4
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int p3 = xoe.p(i3 | 1);
                    int p4 = xoe.p(i4);
                    eh.i(z, str, str2, i, i2, z2, amcVar, nq7Var, vt4Var, vt4Var2, xt4Var, vt4Var3, vt4Var4, vt4Var5, vt4Var6, vt4Var7, vt4Var8, (rv4) obj3, p3, p4);
                    return pvc.a;
                }
            };
        }
    }

    public static final void j(final boolean z, final gcd gcdVar, final int i, final int i2, final int i3, final String str, final String str2, final float f, final boolean z2, final float f2, final float f3, final List list, final int i4, final List list2, final nq7 nq7Var, final boolean z3, final vt4 vt4Var, final vt4 vt4Var2, final xt4 xt4Var, final vt4 vt4Var3, final vt4 vt4Var4, final xt4 xt4Var2, final xt4 xt4Var3, final xt4 xt4Var4, final vt4 vt4Var5, final vt4 vt4Var6, final vt4 vt4Var7, final vt4 vt4Var8, final xt4 xt4Var5, final boolean z4, final vt4 vt4Var9, final vt4 vt4Var10, rv4 rv4Var, final int i5, final int i6, final int i7) {
        int i8;
        int i9;
        str.getClass();
        str2.getClass();
        vt4Var.getClass();
        vt4Var2.getClass();
        xt4Var.getClass();
        vt4Var3.getClass();
        vt4Var4.getClass();
        xt4Var2.getClass();
        xt4Var3.getClass();
        xt4Var4.getClass();
        rv4Var.g0(555886357);
        int i10 = i5 | (rv4Var.g(z) ? 4 : 2) | (rv4Var.f(gcdVar) ? 32 : 16);
        boolean d = rv4Var.d(i);
        int i11 = Token.CASE;
        int i12 = i10 | (d ? 256 : 128) | (rv4Var.d(i2) ? 2048 : 1024) | (rv4Var.d(i3) ? 16384 : 8192);
        int i13 = i5 & 196608;
        int i14 = Parser.ARGC_LIMIT;
        if (i13 == 0) {
            i12 |= rv4Var.f(str) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i12 |= rv4Var.f(str2) ? 1048576 : 524288;
        }
        int i15 = i12 | (rv4Var.c(f) ? 8388608 : 4194304) | (rv4Var.g(z2) ? 67108864 : 33554432) | (rv4Var.c(f2) ? 536870912 : 268435456);
        if ((i6 & 6) == 0) {
            i8 = i6 | (rv4Var.c(f3) ? 4 : 2);
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= (i6 & 64) == 0 ? rv4Var.f(list) : rv4Var.h(list) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i8 |= rv4Var.d(i4) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i8 |= (i6 & 4096) == 0 ? rv4Var.f(list2) : rv4Var.h(list2) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i8 |= rv4Var.f(nq7Var) ? 16384 : 8192;
        }
        if ((i6 & 196608) == 0) {
            i8 |= rv4Var.g(z3) ? 131072 : 65536;
        }
        if ((i6 & 1572864) == 0) {
            i8 |= rv4Var.h(vt4Var) ? 1048576 : 524288;
        }
        if ((i6 & 12582912) == 0) {
            i8 |= rv4Var.h(vt4Var2) ? 8388608 : 4194304;
        }
        if ((i6 & 100663296) == 0) {
            i8 |= rv4Var.h(xt4Var) ? 67108864 : 33554432;
        }
        if ((i6 & 805306368) == 0) {
            i8 |= rv4Var.h(vt4Var3) ? 536870912 : 268435456;
        }
        int i16 = i7 | (rv4Var.h(vt4Var4) ? 4 : 2);
        if ((i7 & 48) == 0) {
            i16 |= rv4Var.h(xt4Var2) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            if (rv4Var.h(xt4Var3)) {
                i11 = 256;
            }
            i16 |= i11;
        }
        if ((i7 & 3072) == 0) {
            i16 |= rv4Var.h(xt4Var4) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i16 |= rv4Var.h(vt4Var5) ? 16384 : 8192;
        }
        if ((i7 & 196608) == 0) {
            if (rv4Var.h(vt4Var6)) {
                i14 = 131072;
            }
            i16 |= i14;
        }
        if ((i7 & 1572864) == 0) {
            i16 |= rv4Var.h(vt4Var7) ? 1048576 : 524288;
        }
        int i17 = i16 | (rv4Var.h(vt4Var8) ? 8388608 : 4194304) | (rv4Var.h(xt4Var5) ? 67108864 : 33554432) | (rv4Var.g(z4) ? 536870912 : 268435456);
        int i18 = (rv4Var.h(vt4Var9) ? 4 : 2) | (rv4Var.h(vt4Var10) ? 32 : 16);
        if (rv4Var.U(i15 & 1, ((i15 & 306783379) == 306783378 && (i8 & 306783379) == 306783378 && (i17 & 306783379) == 306783378 && (i18 & 19) == 18) ? false : true)) {
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (P == obj) {
                P = yae.z(Boolean.FALSE);
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            int i19 = i15 >> 3;
            Object P2 = rv4Var.P();
            if (P2 == obj) {
                P2 = new t7d();
                rv4Var.o0(P2);
            }
            t7d t7dVar = (t7d) P2;
            Object P3 = rv4Var.P();
            if (P3 == obj) {
                P3 = yte.s(rv4Var);
                rv4Var.o0(P3);
            }
            m82 m82Var = (m82) P3;
            t7dVar.getClass();
            m82Var.getClass();
            t7dVar.i = m82Var;
            int i20 = (i19 & 14) ^ 6;
            boolean h = ((i20 > 4 && rv4Var.f(gcdVar)) || (i19 & 6) == 4) | rv4Var.h(t7dVar);
            Object P4 = rv4Var.P();
            if (h || P4 == obj) {
                P4 = new v7d(gcdVar, t7dVar, null, 0);
                rv4Var.o0(P4);
            }
            yte.g((lu4) P4, rv4Var, gcdVar);
            boolean h2 = ((i20 > 4 && rv4Var.f(gcdVar)) || (i19 & 6) == 4) | rv4Var.h(t7dVar);
            Object P5 = rv4Var.P();
            if (h2 || P5 == obj) {
                P5 = new v7d(gcdVar, t7dVar, null, 1);
                rv4Var.o0(P5);
            }
            yte.g((lu4) P5, rv4Var, gcdVar);
            boolean h3 = ((i20 > 4 && rv4Var.f(gcdVar)) || (i19 & 6) == 4) | rv4Var.h(t7dVar);
            Object P6 = rv4Var.P();
            if (h3 || P6 == obj) {
                P6 = new v7d(gcdVar, t7dVar, null, 2);
                rv4Var.o0(P6);
            }
            yte.g((lu4) P6, rv4Var, gcdVar);
            boolean h4 = ((i20 > 4 && rv4Var.f(gcdVar)) || (i19 & 6) == 4) | rv4Var.h(t7dVar);
            Object P7 = rv4Var.P();
            if (h4 || P7 == obj) {
                P7 = new v7d(gcdVar, t7dVar, null, 3);
                rv4Var.o0(P7);
            }
            yte.g((lu4) P7, rv4Var, gcdVar);
            boolean h5 = ((i20 > 4 && rv4Var.f(gcdVar)) || (i19 & 6) == 4) | rv4Var.h(t7dVar);
            Object P8 = rv4Var.P();
            if (h5 || P8 == obj) {
                i9 = 4;
                P8 = new v7d(gcdVar, t7dVar, null, 4);
                rv4Var.o0(P8);
            } else {
                i9 = 4;
            }
            yte.g((lu4) P8, rv4Var, gcdVar);
            boolean h6 = ((i20 > i9 && rv4Var.f(gcdVar)) || (i19 & 6) == i9) | rv4Var.h(t7dVar);
            Object P9 = rv4Var.P();
            if (h6 || P9 == obj) {
                P9 = new v7d(gcdVar, t7dVar, null, 5);
                rv4Var.o0(P9);
            }
            yte.g((lu4) P9, rv4Var, gcdVar);
            Boolean valueOf = Boolean.valueOf(z4);
            boolean h7 = ((i17 & 1879048192) == 536870912) | rv4Var.h(t7dVar);
            Object P10 = rv4Var.P();
            if (h7 || P10 == obj) {
                P10 = new v65(z4, t7dVar, (m42) null, 9);
                rv4Var.o0(P10);
            }
            yte.g((lu4) P10, rv4Var, valueOf);
            boolean z5 = !z4;
            boolean h8 = ((i17 & 3670016) == 1048576) | rv4Var.h(t7dVar);
            Object P11 = rv4Var.P();
            if (h8 || P11 == obj) {
                P11 = new f7d(vt4Var7, t7dVar, 3);
                rv4Var.o0(P11);
            }
            vt4 vt4Var11 = (vt4) P11;
            boolean h9 = ((i17 & 458752) == 131072) | rv4Var.h(t7dVar);
            Object P12 = rv4Var.P();
            if (h9 || P12 == obj) {
                P12 = new f7d(vt4Var6, t7dVar, 7);
                rv4Var.o0(P12);
            }
            vt4 vt4Var12 = (vt4) P12;
            boolean h10 = ((i17 & 57344) == 16384) | rv4Var.h(t7dVar) | ((i15 & Token.ASSIGN_MOD) == 32);
            Object P13 = rv4Var.P();
            if (h10 || P13 == obj) {
                P13 = new n7d(t7dVar, vt4Var5, gcdVar, 2);
                rv4Var.o0(P13);
            }
            yae.d(z5, vt4Var11, vt4Var12, (vt4) P13, rv4Var, 0, 0);
            boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
            Object P14 = rv4Var.P();
            if (P14 == obj) {
                P14 = new ozc(aw7Var, 15);
                rv4Var.o0(P14);
            }
            int i21 = i15 << 3;
            int i22 = (i15 & 14) | 64 | (i21 & 896) | (i21 & 7168) | ((i8 >> 3) & 57344);
            int i23 = i15 << 6;
            int i24 = i22 | (i23 & 458752) | (i23 & 3670016) | (i23 & 29360128) | (i23 & 234881024) | (i23 & 1879048192);
            int i25 = i15 >> 24;
            int i26 = i8 << 6;
            int i27 = (i25 & Token.ASSIGN_MOD) | (i25 & 14) | 805306368 | (i26 & 896) | (i26 & 7168) | (i26 & 57344) | (i26 & 458752) | (i26 & 3670016) | (i26 & 234881024);
            int i28 = i8 >> 9;
            int i29 = ((i17 >> 15) & 1022) | ((i8 >> 18) & 7168) | (i28 & 57344) | (i28 & 458752);
            int i30 = i17 << 18;
            int i31 = i18 << 6;
            k(z, t7dVar, gcdVar, i, z3, i2, i3, str, str2, f, z2, f2, f3, list, i4, list2, nq7Var, booleanValue, vt4Var, (xt4) P14, vt4Var6, vt4Var7, vt4Var8, vt4Var3, vt4Var2, xt4Var, vt4Var4, xt4Var2, xt4Var3, xt4Var4, vt4Var5, xt4Var5, vt4Var9, vt4Var10, rv4Var, i24, i27, i29 | (i30 & 3670016) | (29360128 & i30) | (i30 & 234881024) | (i30 & 1879048192), ((i17 >> 12) & 14) | ((i17 >> 21) & Token.ASSIGN_MOD) | (i31 & 896) | (i31 & 7168));
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: i7d
                @Override // defpackage.lu4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int p = xoe.p(i5 | 1);
                    int p2 = xoe.p(i6);
                    int p3 = xoe.p(i7);
                    eh.j(z, gcdVar, i, i2, i3, str, str2, f, z2, f2, f3, list, i4, list2, nq7Var, z3, vt4Var, vt4Var2, xt4Var, vt4Var3, vt4Var4, xt4Var2, xt4Var3, xt4Var4, vt4Var5, vt4Var6, vt4Var7, vt4Var8, xt4Var5, z4, vt4Var9, vt4Var10, (rv4) obj2, p, p2, p3);
                    return pvc.a;
                }
            };
        }
    }

    public static final void k(final boolean z, final t7d t7dVar, final gcd gcdVar, final int i, final boolean z2, final int i2, final int i3, final String str, final String str2, final float f, final boolean z3, final float f2, final float f3, final List list, final int i4, final List list2, final nq7 nq7Var, final boolean z4, final vt4 vt4Var, final xt4 xt4Var, final vt4 vt4Var2, final vt4 vt4Var3, final vt4 vt4Var4, final vt4 vt4Var5, final vt4 vt4Var6, final xt4 xt4Var2, final vt4 vt4Var7, final xt4 xt4Var3, final xt4 xt4Var4, final xt4 xt4Var5, final vt4 vt4Var8, final xt4 xt4Var6, final vt4 vt4Var9, final vt4 vt4Var10, rv4 rv4Var, final int i5, final int i6, final int i7, final int i8) {
        int i9;
        int i10;
        int i11;
        t7d t7dVar2;
        rv4 rv4Var2;
        int i12;
        lh9 lh9Var;
        int i13;
        pu0 pu0Var;
        kq7 kq7Var;
        dx4 dx4Var;
        int i14;
        boolean z5;
        final gcd gcdVar2 = gcdVar;
        nk0 nk0Var = kh5.f;
        rv4Var.g0(-1217328845);
        int i15 = (rv4Var.g(z) ? 4 : 2) | i5 | (rv4Var.h(t7dVar) ? 32 : 16);
        int i16 = i5 & 384;
        int i17 = Token.CASE;
        if (i16 == 0) {
            i15 |= rv4Var.f(gcdVar2) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i15 |= rv4Var.d(i) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i15 |= rv4Var.g(z2) ? 16384 : 8192;
        }
        if ((i5 & 196608) == 0) {
            i15 |= rv4Var.d(i2) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i15 |= rv4Var.d(i3) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i15 |= rv4Var.f(str) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i15 |= rv4Var.f(str2) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i15 |= rv4Var.c(f) ? 536870912 : 268435456;
        }
        if ((i6 & 6) == 0) {
            i9 = i6 | (rv4Var.g(z3) ? 4 : 2);
        } else {
            i9 = i6;
        }
        if ((i6 & 48) == 0) {
            i9 |= rv4Var.c(f2) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i9 |= rv4Var.c(f3) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i9 |= (i6 & 4096) == 0 ? rv4Var.f(list) : rv4Var.h(list) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i9 |= rv4Var.d(i4) ? 16384 : 8192;
        }
        if ((i6 & 196608) == 0) {
            i9 |= (i6 & 262144) == 0 ? rv4Var.f(list2) : rv4Var.h(list2) ? 131072 : 65536;
        }
        if ((i6 & 1572864) == 0) {
            i9 |= rv4Var.f(nq7Var) ? 1048576 : 524288;
        }
        if ((i6 & 12582912) == 0) {
            i9 |= rv4Var.g(z4) ? 8388608 : 4194304;
        }
        if ((i6 & 100663296) == 0) {
            i9 |= rv4Var.h(vt4Var) ? 67108864 : 33554432;
        }
        if ((i6 & 805306368) == 0) {
            i9 |= rv4Var.h(xt4Var) ? 536870912 : 268435456;
        }
        if ((i7 & 6) == 0) {
            i10 = i7 | (rv4Var.h(vt4Var2) ? 4 : 2);
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= rv4Var.h(vt4Var3) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= rv4Var.h(vt4Var4) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i10 |= rv4Var.h(vt4Var5) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i10 |= rv4Var.h(vt4Var6) ? 16384 : 8192;
        }
        if ((i7 & 196608) == 0) {
            i10 |= rv4Var.h(xt4Var2) ? 131072 : 65536;
        }
        if ((i7 & 1572864) == 0) {
            i10 |= rv4Var.h(vt4Var7) ? 1048576 : 524288;
        }
        if ((i7 & 12582912) == 0) {
            i10 |= rv4Var.h(xt4Var3) ? 8388608 : 4194304;
        }
        if ((i7 & 100663296) == 0) {
            i10 |= rv4Var.h(xt4Var4) ? 67108864 : 33554432;
        }
        if ((i7 & 805306368) == 0) {
            i10 |= rv4Var.h(xt4Var5) ? 536870912 : 268435456;
        }
        if ((i8 & 6) == 0) {
            i11 = i8 | (rv4Var.h(vt4Var8) ? 4 : 2);
        } else {
            i11 = i8;
        }
        if ((i8 & 48) == 0) {
            i11 |= rv4Var.h(xt4Var6) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            if (rv4Var.h(vt4Var9)) {
                i17 = 256;
            }
            i11 |= i17;
        }
        if ((i8 & 3072) == 0) {
            i11 |= rv4Var.h(vt4Var10) ? 2048 : 1024;
        }
        int i18 = i11;
        if (rv4Var.U(i15 & 1, ((i15 & 306783379) == 306783378 && (i9 & 306783379) == 306783378 && (i10 & 306783379) == 306783378 && (i18 & 1171) == 1170) ? false : true)) {
            Object P = rv4Var.P();
            lh9 lh9Var2 = ax1.a;
            if (P == lh9Var2) {
                P = new dx4();
                rv4Var.o0(P);
            }
            final dx4 dx4Var2 = (dx4) P;
            dx4Var2.d.i(f);
            dx4Var2.e.i(f2);
            boolean z6 = t7dVar.c.h() > 0;
            Object P2 = rv4Var.P();
            if (P2 == lh9Var2) {
                P2 = hl5.g(f2 > nae.e ? f2 : 1.0f, rv4Var);
            }
            final dm8 dm8Var = (dm8) P2;
            if (f2 > nae.e) {
                dm8Var.i(f2);
            }
            final aw7 z7 = jsc.z(gcdVar2.m, rv4Var);
            final aw7 z8 = jsc.z(gcdVar2.l, rv4Var);
            float f4 = z ? 16.0f : 12.0f;
            float f5 = z ? 24.0f : 16.0f;
            float f6 = z ? 32.0f : 24.0f;
            final float f7 = z ? 64.0f : 48.0f;
            float f8 = z ? 104.0f : 80.0f;
            float f9 = z ? 24.0f : 16.0f;
            nq7 a0 = nq7Var.a0(pna.c);
            b37 d = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, a0);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            boolean z9 = !z4;
            int i19 = i15 & Token.ASSIGN_MOD;
            boolean z10 = i19 == 32 || rv4Var.h(t7dVar);
            Object P3 = rv4Var.P();
            if (z10 || P3 == lh9Var2) {
                P3 = new j7d(t7dVar, 2);
                rv4Var.o0(P3);
            }
            vt4 vt4Var11 = (vt4) P3;
            int i20 = i15 & 896;
            boolean z11 = i20 == 256;
            Object P4 = rv4Var.P();
            if (z11 || P4 == lh9Var2) {
                P4 = new xt4() { // from class: c7d
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj) {
                        int i21 = r2;
                        pvc pvcVar = pvc.a;
                        am3 am3Var = am3.SECONDS;
                        gcd gcdVar3 = gcdVar2;
                        int intValue = ((Integer) obj).intValue();
                        switch (i21) {
                            case 0:
                                hq7 hq7Var = wl3.b;
                                gcdVar3.b(jue.O(intValue, am3Var));
                                return pvcVar;
                            default:
                                hq7 hq7Var2 = wl3.b;
                                gcdVar3.b(jue.O(-intValue, am3Var));
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P4);
            }
            xt4 xt4Var7 = (xt4) P4;
            boolean z12 = i20 == 256;
            Object P5 = rv4Var.P();
            if (z12 || P5 == lh9Var2) {
                P5 = new xt4() { // from class: c7d
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj) {
                        int i21 = r2;
                        pvc pvcVar = pvc.a;
                        am3 am3Var = am3.SECONDS;
                        gcd gcdVar3 = gcdVar2;
                        int intValue = ((Integer) obj).intValue();
                        switch (i21) {
                            case 0:
                                hq7 hq7Var = wl3.b;
                                gcdVar3.b(jue.O(intValue, am3Var));
                                return pvcVar;
                            default:
                                hq7 hq7Var2 = wl3.b;
                                gcdVar3.b(jue.O(-intValue, am3Var));
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P5);
            }
            xt4 xt4Var8 = (xt4) P5;
            boolean z13 = ((i10 & 1879048192) == 536870912) | ((i9 & 14) == 4) | ((i10 & 234881024) == 67108864);
            Object P6 = rv4Var.P();
            if (z13 || P6 == lh9Var2) {
                P6 = new lf0(z3, xt4Var5, xt4Var4, 6);
                rv4Var.o0(P6);
            }
            ch0.l(dx4Var2, i2, i3, z9, z6, vt4Var11, xt4Var7, xt4Var8, xt4Var3, (xt4) P6, vt4Var9, vt4Var10, rv4Var, ((i15 >> 12) & 1008) | ((i10 << 3) & 234881024), (i18 >> 6) & Token.ELSE);
            rv4Var2 = rv4Var;
            kq7 kq7Var2 = kq7.a;
            pu0 pu0Var2 = pu0.a;
            if (z4) {
                rv4Var2.e0(70887299);
                i14 = 0;
                rte.c(t7dVar.b(), pu0Var2.a(kq7Var2, nk0Var), zt3.g(null, 3), zt3.i(null, 3), null, jce.E(-506870292, new mu4() { // from class: d7d
                    @Override // defpackage.mu4
                    public final Object c(Object obj, Object obj2, Object obj3) {
                        boolean z14;
                        boolean z15;
                        int i21 = r3;
                        pvc pvcVar = pvc.a;
                        kq7 kq7Var3 = kq7.a;
                        lh9 lh9Var3 = ax1.a;
                        final t7d t7dVar3 = t7dVar;
                        final xt4 xt4Var9 = xt4Var;
                        switch (i21) {
                            case 0:
                                rv4 rv4Var3 = (rv4) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                ((qr) obj).getClass();
                                if ((intValue & 17) != 16) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (rv4Var3.U(intValue & 1, z14)) {
                                    ar5 c2 = rp5.c((wk3) ok3.G.getValue(), rv4Var3, 0);
                                    boolean f10 = rv4Var3.f(xt4Var9) | rv4Var3.h(t7dVar3);
                                    Object P7 = rv4Var3.P();
                                    if (f10 || P7 == lh9Var3) {
                                        P7 = new vt4() { // from class: g7d
                                            @Override // defpackage.vt4
                                            public final Object invoke() {
                                                int i22 = r3;
                                                pvc pvcVar2 = pvc.a;
                                                t7d t7dVar4 = t7dVar3;
                                                xt4 xt4Var10 = xt4Var9;
                                                switch (i22) {
                                                    case 0:
                                                        xt4Var10.invoke(Boolean.FALSE);
                                                        t7d.e(t7dVar4);
                                                        return pvcVar2;
                                                    default:
                                                        xt4Var10.invoke(Boolean.TRUE);
                                                        t7d.e(t7dVar4);
                                                        return pvcVar2;
                                                }
                                            }
                                        };
                                        rv4Var3.o0(P7);
                                    }
                                    ote.b(nae.e, 0, 24, (vt4) P7, rv4Var3, c2, zbe.C(mwe.u(kq7Var3, false, 4), nae.e, nae.e, 16.0f, nae.e, 11), false);
                                } else {
                                    rv4Var3.X();
                                }
                                return pvcVar;
                            default:
                                rv4 rv4Var4 = (rv4) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                ((qr) obj).getClass();
                                if ((intValue2 & 17) != 16) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (rv4Var4.U(intValue2 & 1, z15)) {
                                    ar5 c3 = rp5.c((wk3) ok3.H.getValue(), rv4Var4, 0);
                                    boolean f11 = rv4Var4.f(xt4Var9) | rv4Var4.h(t7dVar3);
                                    Object P8 = rv4Var4.P();
                                    if (f11 || P8 == lh9Var3) {
                                        P8 = new vt4() { // from class: g7d
                                            @Override // defpackage.vt4
                                            public final Object invoke() {
                                                int i22 = r3;
                                                pvc pvcVar2 = pvc.a;
                                                t7d t7dVar4 = t7dVar3;
                                                xt4 xt4Var10 = xt4Var9;
                                                switch (i22) {
                                                    case 0:
                                                        xt4Var10.invoke(Boolean.FALSE);
                                                        t7d.e(t7dVar4);
                                                        return pvcVar2;
                                                    default:
                                                        xt4Var10.invoke(Boolean.TRUE);
                                                        t7d.e(t7dVar4);
                                                        return pvcVar2;
                                                }
                                            }
                                        };
                                        rv4Var4.o0(P8);
                                    }
                                    ote.b(nae.e, 0, 24, (vt4) P8, rv4Var4, c3, zbe.C(mwe.u(kq7Var3, false, 4), nae.e, nae.e, 16.0f, nae.e, 11), false);
                                } else {
                                    rv4Var4.X();
                                }
                                return pvcVar;
                        }
                    }
                }, rv4Var2), rv4Var2, 200064, 16);
                rv4Var2.q(false);
                kq7Var = kq7Var2;
                t7dVar2 = t7dVar;
                i12 = i20;
                pu0Var = pu0Var2;
                lh9Var = lh9Var2;
                dx4Var = dx4Var2;
                i13 = i19;
            } else {
                rv4Var2.e0(72085914);
                i12 = i20;
                lh9Var = lh9Var2;
                final float f10 = f4;
                i13 = i19;
                rte.c(t7dVar.b(), pu0Var2.a(pna.f(kq7Var2, 1.0f), kh5.b), zt3.g(null, 3), zt3.i(null, 3), null, jce.E(1514778421, new mu4() { // from class: e7d
                    /* JADX WARN: Removed duplicated region for block: B:32:0x0244  */
                    /* JADX WARN: Removed duplicated region for block: B:41:0x0292  */
                    /* JADX WARN: Removed duplicated region for block: B:48:0x02c6  */
                    /* JADX WARN: Removed duplicated region for block: B:53:0x02f4  */
                    /* JADX WARN: Type inference failed for: r15v3 */
                    /* JADX WARN: Type inference failed for: r15v4, types: [boolean, int] */
                    /* JADX WARN: Type inference failed for: r15v7 */
                    @Override // defpackage.mu4
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object c(java.lang.Object r34, java.lang.Object r35, java.lang.Object r36) {
                        /*
                            Method dump skipped, instructions count: 801
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.e7d.c(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, rv4Var2), rv4Var2, 200064, 16);
                rte.c(t7dVar.b(), pu0Var2.a(kq7Var2, kh5.d), zt3.g(null, 3), zt3.i(null, 3), null, jce.E(1247042412, new vi9(i, 1, vt4Var7, t7dVar), rv4Var2), rv4Var2, 200064, 16);
                rte.c(t7dVar.b(), pu0Var2.a(kq7Var2, nk0Var), zt3.g(null, 3), zt3.i(null, 3), null, jce.E(1080090285, new mu4() { // from class: d7d
                    @Override // defpackage.mu4
                    public final Object c(Object obj, Object obj2, Object obj3) {
                        boolean z14;
                        boolean z15;
                        int i21 = r3;
                        pvc pvcVar = pvc.a;
                        kq7 kq7Var3 = kq7.a;
                        lh9 lh9Var3 = ax1.a;
                        final t7d t7dVar3 = t7dVar;
                        final xt4 xt4Var9 = xt4Var;
                        switch (i21) {
                            case 0:
                                rv4 rv4Var3 = (rv4) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                ((qr) obj).getClass();
                                if ((intValue & 17) != 16) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (rv4Var3.U(intValue & 1, z14)) {
                                    ar5 c2 = rp5.c((wk3) ok3.G.getValue(), rv4Var3, 0);
                                    boolean f102 = rv4Var3.f(xt4Var9) | rv4Var3.h(t7dVar3);
                                    Object P7 = rv4Var3.P();
                                    if (f102 || P7 == lh9Var3) {
                                        P7 = new vt4() { // from class: g7d
                                            @Override // defpackage.vt4
                                            public final Object invoke() {
                                                int i22 = r3;
                                                pvc pvcVar2 = pvc.a;
                                                t7d t7dVar4 = t7dVar3;
                                                xt4 xt4Var10 = xt4Var9;
                                                switch (i22) {
                                                    case 0:
                                                        xt4Var10.invoke(Boolean.FALSE);
                                                        t7d.e(t7dVar4);
                                                        return pvcVar2;
                                                    default:
                                                        xt4Var10.invoke(Boolean.TRUE);
                                                        t7d.e(t7dVar4);
                                                        return pvcVar2;
                                                }
                                            }
                                        };
                                        rv4Var3.o0(P7);
                                    }
                                    ote.b(nae.e, 0, 24, (vt4) P7, rv4Var3, c2, zbe.C(mwe.u(kq7Var3, false, 4), nae.e, nae.e, 16.0f, nae.e, 11), false);
                                } else {
                                    rv4Var3.X();
                                }
                                return pvcVar;
                            default:
                                rv4 rv4Var4 = (rv4) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                ((qr) obj).getClass();
                                if ((intValue2 & 17) != 16) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (rv4Var4.U(intValue2 & 1, z15)) {
                                    ar5 c3 = rp5.c((wk3) ok3.H.getValue(), rv4Var4, 0);
                                    boolean f11 = rv4Var4.f(xt4Var9) | rv4Var4.h(t7dVar3);
                                    Object P8 = rv4Var4.P();
                                    if (f11 || P8 == lh9Var3) {
                                        P8 = new vt4() { // from class: g7d
                                            @Override // defpackage.vt4
                                            public final Object invoke() {
                                                int i22 = r3;
                                                pvc pvcVar2 = pvc.a;
                                                t7d t7dVar4 = t7dVar3;
                                                xt4 xt4Var10 = xt4Var9;
                                                switch (i22) {
                                                    case 0:
                                                        xt4Var10.invoke(Boolean.FALSE);
                                                        t7d.e(t7dVar4);
                                                        return pvcVar2;
                                                    default:
                                                        xt4Var10.invoke(Boolean.TRUE);
                                                        t7d.e(t7dVar4);
                                                        return pvcVar2;
                                                }
                                            }
                                        };
                                        rv4Var4.o0(P8);
                                    }
                                    ote.b(nae.e, 0, 24, (vt4) P8, rv4Var4, c3, zbe.C(mwe.u(kq7Var3, false, 4), nae.e, nae.e, 16.0f, nae.e, 11), false);
                                } else {
                                    rv4Var4.X();
                                }
                                return pvcVar;
                        }
                    }
                }, rv4Var2), rv4Var2, 200064, 16);
                final boolean z14 = z6;
                final float f11 = f5;
                final float f12 = f6;
                rte.c(t7dVar.b(), pu0Var2.a(kq7Var2, kh5.e), zt3.g(null, 3), zt3.i(null, 3), null, jce.E(913138158, new mu4() { // from class: q7d
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r15v4 */
                    /* JADX WARN: Type inference failed for: r15v5, types: [boolean, int] */
                    /* JADX WARN: Type inference failed for: r15v8 */
                    @Override // defpackage.mu4
                    public final Object c(Object obj, Object obj2, Object obj3) {
                        boolean z15;
                        np npVar;
                        boolean z16;
                        t7d t7dVar3;
                        Object obj4;
                        int i21;
                        kg kgVar;
                        float f13;
                        boolean z17;
                        kg kgVar2;
                        np npVar2;
                        gcd gcdVar3;
                        boolean z18;
                        boolean z19;
                        wk3 wk3Var;
                        float f14;
                        ?? r15;
                        boolean z20;
                        rv4 rv4Var3 = (rv4) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        ((qr) obj).getClass();
                        if ((intValue & 17) != 16) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (rv4Var3.U(intValue & 1, z15)) {
                            gv9 a2 = ev9.a(new hz(f11, true, new vs(2)), kh5.G, rv4Var3, 48);
                            int hashCode2 = Long.hashCode(rv4Var3.T);
                            xt8 l2 = rv4Var3.l();
                            nq7 p2 = lye.p(rv4Var3, kq7.a);
                            rw1.k.getClass();
                            zx1 zx1Var2 = qw1.b;
                            rv4Var3.i0();
                            if (rv4Var3.S) {
                                rv4Var3.k(zx1Var2);
                            } else {
                                rv4Var3.r0();
                            }
                            np npVar3 = qw1.f;
                            jce.F(npVar3, rv4Var3, a2);
                            np npVar4 = qw1.e;
                            jce.F(npVar4, rv4Var3, l2);
                            Integer valueOf = Integer.valueOf(hashCode2);
                            np npVar5 = qw1.g;
                            jce.F(npVar5, rv4Var3, valueOf);
                            kg kgVar3 = qw1.h;
                            jce.C(kgVar3, rv4Var3);
                            np npVar6 = qw1.d;
                            jce.F(npVar6, rv4Var3, p2);
                            boolean z21 = z;
                            float f15 = f12;
                            t7d t7dVar4 = t7dVar;
                            Object obj5 = ax1.a;
                            if (z21) {
                                rv4Var3.e0(-620411182);
                                ar5 c2 = rp5.c((wk3) ok3.s0.getValue(), rv4Var3, 0);
                                vt4 vt4Var12 = vt4Var2;
                                boolean f16 = rv4Var3.f(vt4Var12) | rv4Var3.h(t7dVar4);
                                Object P7 = rv4Var3.P();
                                if (f16 || P7 == obj5) {
                                    P7 = new f7d(vt4Var12, t7dVar4, 1);
                                    rv4Var3.o0(P7);
                                }
                                vt4 vt4Var13 = (vt4) P7;
                                z16 = z21;
                                kgVar = kgVar3;
                                npVar = npVar6;
                                obj4 = obj5;
                                t7dVar3 = t7dVar4;
                                ote.i(f15, 0, 10, vt4Var13, rv4Var3, c2, null, false);
                                i21 = 0;
                                rv4Var3.q(false);
                            } else {
                                npVar = npVar6;
                                z16 = z21;
                                t7dVar3 = t7dVar4;
                                obj4 = obj5;
                                i21 = 0;
                                kgVar = kgVar3;
                                rv4Var3.e0(-620013328);
                                rv4Var3.q(false);
                            }
                            boolean z22 = z14;
                            gcd gcdVar4 = gcdVar;
                            if (z22) {
                                rv4Var3.e0(-619954087);
                                ar5 c3 = rp5.c((wk3) ok3.h0.getValue(), rv4Var3, i21);
                                boolean f17 = rv4Var3.f(gcdVar4);
                                int i22 = i3;
                                boolean d2 = f17 | rv4Var3.d(i22) | rv4Var3.h(t7dVar3);
                                Object P8 = rv4Var3.P();
                                if (!d2 && P8 != obj4) {
                                    z20 = false;
                                } else {
                                    z20 = false;
                                    P8 = new m7d(gcdVar4, i22, t7dVar3, 0);
                                    rv4Var3.o0(P8);
                                }
                                z17 = z22;
                                kgVar2 = kgVar;
                                gcdVar3 = gcdVar4;
                                npVar2 = npVar5;
                                ote.i(f15, 0, 10, (vt4) P8, rv4Var3, c3, null, false);
                                f13 = f15;
                                rv4Var3.q(z20);
                            } else {
                                f13 = f15;
                                z17 = z22;
                                kgVar2 = kgVar;
                                npVar2 = npVar5;
                                gcdVar3 = gcdVar4;
                                rv4Var3.e0(-619532208);
                                rv4Var3.q(i21);
                            }
                            if (!((Boolean) z7.getValue()).booleanValue() && !((Boolean) z8.getValue()).booleanValue()) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            nq7 k = tte.k(pna.n(st0.v(z18), f7), uu9.a);
                            boolean h = rv4Var3.h(t7dVar3);
                            vt4 vt4Var14 = vt4Var8;
                            boolean f18 = h | rv4Var3.f(vt4Var14) | rv4Var3.f(gcdVar3);
                            Object P9 = rv4Var3.P();
                            if (!f18 && P9 != obj4) {
                                z19 = false;
                            } else {
                                z19 = false;
                                P9 = new n7d(t7dVar3, vt4Var14, gcdVar3, 0);
                                rv4Var3.o0(P9);
                            }
                            nq7 f19 = lbe.f(15, (vt4) P9, k, null, z19);
                            tza tzaVar = j27.a;
                            nq7 y = zbe.y(nmd.v(f19, zl1.b(0.4f, ((h27) rv4Var3.j(tzaVar)).a.p), lre.g), 8.0f);
                            b37 d3 = fu0.d(kh5.e, false);
                            int hashCode3 = Long.hashCode(rv4Var3.T);
                            xt8 l3 = rv4Var3.l();
                            nq7 p3 = lye.p(rv4Var3, y);
                            rv4Var3.i0();
                            if (rv4Var3.S) {
                                rv4Var3.k(zx1Var2);
                            } else {
                                rv4Var3.r0();
                            }
                            jce.F(npVar3, rv4Var3, d3);
                            jce.F(npVar4, rv4Var3, l3);
                            s21.t(hashCode3, rv4Var3, npVar2, rv4Var3, kgVar2);
                            jce.F(npVar, rv4Var3, p3);
                            if (t7dVar3.a()) {
                                wk3Var = (wk3) ok3.d0.getValue();
                            } else if (((Boolean) t7dVar3.d.getValue()).booleanValue()) {
                                wk3Var = (wk3) ok3.W.getValue();
                            } else {
                                wk3Var = (wk3) ok3.a0.getValue();
                            }
                            nk5.a(rp5.c(wk3Var, rv4Var3, 0), null, pna.c, ((h27) rv4Var3.j(tzaVar)).a.q, rv4Var3, 432, 0);
                            rv4Var3.q(true);
                            if (z17) {
                                rv4Var3.e0(-618114020);
                                ar5 c4 = rp5.c((wk3) ok3.c.getValue(), rv4Var3, 0);
                                boolean f20 = rv4Var3.f(gcdVar3);
                                int i23 = i2;
                                boolean d4 = f20 | rv4Var3.d(i23) | rv4Var3.h(t7dVar3);
                                Object P10 = rv4Var3.P();
                                if (d4 || P10 == obj4) {
                                    P10 = new m7d(gcdVar3, i23, t7dVar3, 1);
                                    rv4Var3.o0(P10);
                                }
                                f14 = f13;
                                ote.i(f14, 0, 10, (vt4) P10, rv4Var3, c4, null, false);
                                r15 = 0;
                                rv4Var3.q(false);
                            } else {
                                f14 = f13;
                                r15 = 0;
                                rv4Var3.e0(-617695024);
                                rv4Var3.q(false);
                            }
                            if (z16) {
                                rv4Var3.e0(-617645734);
                                ar5 c5 = rp5.c((wk3) ok3.r0.getValue(), rv4Var3, r15);
                                vt4 vt4Var15 = vt4Var3;
                                boolean f21 = rv4Var3.f(vt4Var15) | rv4Var3.h(t7dVar3);
                                Object P11 = rv4Var3.P();
                                if (f21 || P11 == obj4) {
                                    P11 = new f7d(vt4Var15, t7dVar3, 2);
                                    rv4Var3.o0(P11);
                                }
                                ote.i(f14, 0, 10, (vt4) P11, rv4Var3, c5, null, false);
                                rv4Var3.q(false);
                            } else {
                                rv4Var3.e0(-617255568);
                                rv4Var3.q(r15);
                            }
                            rv4Var3.q(true);
                        } else {
                            rv4Var3.X();
                        }
                        return pvc.a;
                    }
                }, rv4Var), rv4Var, 200064, 16);
                pu0Var = pu0Var2;
                kq7Var = kq7Var2;
                final boolean z15 = z6;
                t7dVar2 = t7dVar;
                gcdVar2 = gcdVar;
                dx4Var = dx4Var2;
                rv4Var2 = rv4Var;
                rte.c(t7dVar.b(), pu0Var2.a(pna.f(kq7Var2, 1.0f), kh5.D), zt3.g(null, 3), zt3.i(null, 3), null, jce.E(746186031, new mu4() { // from class: r7d
                    /* JADX WARN: Removed duplicated region for block: B:20:0x016c  */
                    /* JADX WARN: Removed duplicated region for block: B:35:0x01ee  */
                    /* JADX WARN: Removed duplicated region for block: B:38:0x0222  */
                    /* JADX WARN: Removed duplicated region for block: B:40:0x022a  */
                    /* JADX WARN: Type inference failed for: r1v15 */
                    /* JADX WARN: Type inference failed for: r1v7 */
                    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, int] */
                    @Override // defpackage.mu4
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object c(java.lang.Object r44, java.lang.Object r45, java.lang.Object r46) {
                        /*
                            Method dump skipped, instructions count: 691
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.r7d.c(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, rv4Var2), rv4Var2, 200064, 16);
                i14 = 0;
                rv4Var2.q(false);
            }
            ch0.f(dx4Var, null, rv4Var2, i14);
            kq7 kq7Var3 = kq7Var;
            pu0 pu0Var3 = pu0Var;
            ch0.e(dx4Var, pu0Var3.a(kq7Var3, ((cf3) dx4Var.f.getValue()) == cf3.b ? kh5.d : nk0Var), rv4Var2, i14);
            ch0.g(dx4Var, pu0Var3.a(kq7Var3, kh5.e), rv4Var2, i14);
            long h = t7dVar2.b.h();
            float f13 = t7dVar2.b() ? f8 : 0.0f;
            nq7 C = zbe.C(pu0Var3.a(kq7Var3, kh5.E), nae.e, nae.e, f9, f9, 3);
            int i21 = (i12 == 256 ? 1 : i14) | ((i13 == 32 || rv4Var2.h(t7dVar2)) ? 1 : 1);
            Object P7 = rv4Var2.P();
            if (i21 != 0 || P7 == lh9Var) {
                z5 = true;
                P7 = new h7d(gcdVar2, t7dVar2, 1);
                rv4Var2.o0(P7);
            } else {
                z5 = true;
            }
            ote.d(h, list2, (xt4) P7, C, f13, rv4Var2, (i9 >> 12) & Token.ASSIGN_MOD);
            rv4Var2.q(z5);
        } else {
            t7dVar2 = t7dVar;
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            final t7d t7dVar3 = t7dVar2;
            final gcd gcdVar3 = gcdVar2;
            u.d = new lu4() { // from class: s7d
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p2 = xoe.p(i5 | 1);
                    int p3 = xoe.p(i6);
                    int p4 = xoe.p(i7);
                    int p5 = xoe.p(i8);
                    eh.k(z, t7dVar3, gcdVar3, i, z2, i2, i3, str, str2, f, z3, f2, f3, list, i4, list2, nq7Var, z4, vt4Var, xt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, vt4Var6, xt4Var2, vt4Var7, xt4Var3, xt4Var4, xt4Var5, vt4Var8, xt4Var6, vt4Var9, vt4Var10, (rv4) obj, p2, p3, p4, p5);
                    return pvc.a;
                }
            };
        }
    }

    public static final boolean l(View view, View view2) {
        if (!view2.equals(view)) {
            for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static final void m(float[] fArr, float f, float f2, float[] fArr2) {
        l27.f(fArr2);
        l27.k(fArr2, f, f2);
        x(fArr, fArr2);
    }

    public static final float n(int i, int i2, float[] fArr, float[] fArr2) {
        int i3 = i * 4;
        float f = (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + f;
    }

    public static final yk8 o(byte[] bArr, int i, int i2) {
        int i3 = (i2 * 8) + i;
        if (i3 + 8 > bArr.length) {
            return new yk8(0L, 0);
        }
        return new yk8(Long.valueOf(yae.J(bArr, i3)), Integer.valueOf((int) yae.J(bArr, i3 + 4)));
    }

    public static final hk2 p(wab wabVar) {
        wabVar.getClass();
        String str = wabVar.a;
        Map map = wabVar.b;
        Map map2 = wabVar.c;
        String str2 = wabVar.d;
        int i = wabVar.e;
        int i2 = wabVar.f;
        List list = wabVar.g;
        String str3 = wabVar.h;
        String str4 = wabVar.i;
        String str5 = wabVar.j;
        String str6 = wabVar.k;
        String str7 = wabVar.l;
        int i3 = wabVar.m;
        int i4 = wabVar.n;
        Map map3 = wabVar.o;
        boolean z = wabVar.p;
        String str8 = wabVar.q;
        String str9 = wabVar.r;
        int i5 = wabVar.s;
        return new hk2(wabVar.t, i, i2, i3, i4, i5, wabVar.u, wabVar.B, wabVar.v, wabVar.w, wabVar.E, wabVar.F, wabVar.G, wabVar.H, wabVar.I, str, str2, str3, str4, str5, str6, str7, str8, str9, list, map, map2, map3, wabVar.C, wabVar.D, z, wabVar.x, wabVar.y, wabVar.z, wabVar.A);
    }

    public static final boolean q(long j) {
        int i = az5.c;
        if (((int) (j >> 32)) > 0 && ((int) (j & 4294967295L)) > 0) {
            return false;
        }
        return true;
    }

    public static final boolean r(long j) {
        int i = az5.c;
        if (((int) (j >> 32)) > 0 && ((int) (j & 4294967295L)) > 0) {
            return true;
        }
        return false;
    }

    public static final void s(cz7 cz7Var, String str) {
        cz7Var.getClass();
        str.getClass();
        cz7Var.a.c(new np0(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0143 A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:3:0x0004, B:5:0x000e, B:11:0x0019, B:13:0x0023, B:16:0x0029, B:18:0x0033, B:20:0x0037, B:23:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0051, B:31:0x005d, B:37:0x0068, B:39:0x0072, B:43:0x007b, B:45:0x0085, B:49:0x008e, B:51:0x0098, B:55:0x00a1, B:57:0x00ab, B:60:0x00b1, B:62:0x00bb, B:68:0x00c7, B:72:0x00d2, B:74:0x00dc, B:76:0x00e0, B:79:0x00e6, B:83:0x00f6, B:86:0x00fe, B:88:0x0108, B:90:0x010c, B:93:0x0112, B:96:0x0120, B:97:0x0124, B:99:0x012f, B:101:0x0133, B:103:0x0143, B:106:0x0149, B:107:0x0154, B:109:0x015a, B:111:0x0164, B:114:0x016a, B:119:0x0174, B:122:0x017c, B:125:0x0183, B:126:0x0185, B:128:0x0190, B:130:0x0194), top: B:139:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0149 A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:3:0x0004, B:5:0x000e, B:11:0x0019, B:13:0x0023, B:16:0x0029, B:18:0x0033, B:20:0x0037, B:23:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0051, B:31:0x005d, B:37:0x0068, B:39:0x0072, B:43:0x007b, B:45:0x0085, B:49:0x008e, B:51:0x0098, B:55:0x00a1, B:57:0x00ab, B:60:0x00b1, B:62:0x00bb, B:68:0x00c7, B:72:0x00d2, B:74:0x00dc, B:76:0x00e0, B:79:0x00e6, B:83:0x00f6, B:86:0x00fe, B:88:0x0108, B:90:0x010c, B:93:0x0112, B:96:0x0120, B:97:0x0124, B:99:0x012f, B:101:0x0133, B:103:0x0143, B:106:0x0149, B:107:0x0154, B:109:0x015a, B:111:0x0164, B:114:0x016a, B:119:0x0174, B:122:0x017c, B:125:0x0183, B:126:0x0185, B:128:0x0190, B:130:0x0194), top: B:139:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0183 A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:3:0x0004, B:5:0x000e, B:11:0x0019, B:13:0x0023, B:16:0x0029, B:18:0x0033, B:20:0x0037, B:23:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0051, B:31:0x005d, B:37:0x0068, B:39:0x0072, B:43:0x007b, B:45:0x0085, B:49:0x008e, B:51:0x0098, B:55:0x00a1, B:57:0x00ab, B:60:0x00b1, B:62:0x00bb, B:68:0x00c7, B:72:0x00d2, B:74:0x00dc, B:76:0x00e0, B:79:0x00e6, B:83:0x00f6, B:86:0x00fe, B:88:0x0108, B:90:0x010c, B:93:0x0112, B:96:0x0120, B:97:0x0124, B:99:0x012f, B:101:0x0133, B:103:0x0143, B:106:0x0149, B:107:0x0154, B:109:0x015a, B:111:0x0164, B:114:0x016a, B:119:0x0174, B:122:0x017c, B:125:0x0183, B:126:0x0185, B:128:0x0190, B:130:0x0194), top: B:139:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0190 A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:3:0x0004, B:5:0x000e, B:11:0x0019, B:13:0x0023, B:16:0x0029, B:18:0x0033, B:20:0x0037, B:23:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0051, B:31:0x005d, B:37:0x0068, B:39:0x0072, B:43:0x007b, B:45:0x0085, B:49:0x008e, B:51:0x0098, B:55:0x00a1, B:57:0x00ab, B:60:0x00b1, B:62:0x00bb, B:68:0x00c7, B:72:0x00d2, B:74:0x00dc, B:76:0x00e0, B:79:0x00e6, B:83:0x00f6, B:86:0x00fe, B:88:0x0108, B:90:0x010c, B:93:0x0112, B:96:0x0120, B:97:0x0124, B:99:0x012f, B:101:0x0133, B:103:0x0143, B:106:0x0149, B:107:0x0154, B:109:0x015a, B:111:0x0164, B:114:0x016a, B:119:0x0174, B:122:0x017c, B:125:0x0183, B:126:0x0185, B:128:0x0190, B:130:0x0194), top: B:139:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x017c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:3:0x0004, B:5:0x000e, B:11:0x0019, B:13:0x0023, B:16:0x0029, B:18:0x0033, B:20:0x0037, B:23:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0051, B:31:0x005d, B:37:0x0068, B:39:0x0072, B:43:0x007b, B:45:0x0085, B:49:0x008e, B:51:0x0098, B:55:0x00a1, B:57:0x00ab, B:60:0x00b1, B:62:0x00bb, B:68:0x00c7, B:72:0x00d2, B:74:0x00dc, B:76:0x00e0, B:79:0x00e6, B:83:0x00f6, B:86:0x00fe, B:88:0x0108, B:90:0x010c, B:93:0x0112, B:96:0x0120, B:97:0x0124, B:99:0x012f, B:101:0x0133, B:103:0x0143, B:106:0x0149, B:107:0x0154, B:109:0x015a, B:111:0x0164, B:114:0x016a, B:119:0x0174, B:122:0x017c, B:125:0x0183, B:126:0x0185, B:128:0x0190, B:130:0x0194), top: B:139:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d A[Catch: all -> 0x0011, TRY_LEAVE, TryCatch #0 {all -> 0x0011, blocks: (B:3:0x0004, B:5:0x000e, B:11:0x0019, B:13:0x0023, B:16:0x0029, B:18:0x0033, B:20:0x0037, B:23:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0051, B:31:0x005d, B:37:0x0068, B:39:0x0072, B:43:0x007b, B:45:0x0085, B:49:0x008e, B:51:0x0098, B:55:0x00a1, B:57:0x00ab, B:60:0x00b1, B:62:0x00bb, B:68:0x00c7, B:72:0x00d2, B:74:0x00dc, B:76:0x00e0, B:79:0x00e6, B:83:0x00f6, B:86:0x00fe, B:88:0x0108, B:90:0x010c, B:93:0x0112, B:96:0x0120, B:97:0x0124, B:99:0x012f, B:101:0x0133, B:103:0x0143, B:106:0x0149, B:107:0x0154, B:109:0x015a, B:111:0x0164, B:114:0x016a, B:119:0x0174, B:122:0x017c, B:125:0x0183, B:126:0x0185, B:128:0x0190, B:130:0x0194), top: B:139:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072 A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:3:0x0004, B:5:0x000e, B:11:0x0019, B:13:0x0023, B:16:0x0029, B:18:0x0033, B:20:0x0037, B:23:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0051, B:31:0x005d, B:37:0x0068, B:39:0x0072, B:43:0x007b, B:45:0x0085, B:49:0x008e, B:51:0x0098, B:55:0x00a1, B:57:0x00ab, B:60:0x00b1, B:62:0x00bb, B:68:0x00c7, B:72:0x00d2, B:74:0x00dc, B:76:0x00e0, B:79:0x00e6, B:83:0x00f6, B:86:0x00fe, B:88:0x0108, B:90:0x010c, B:93:0x0112, B:96:0x0120, B:97:0x0124, B:99:0x012f, B:101:0x0133, B:103:0x0143, B:106:0x0149, B:107:0x0154, B:109:0x015a, B:111:0x0164, B:114:0x016a, B:119:0x0174, B:122:0x017c, B:125:0x0183, B:126:0x0185, B:128:0x0190, B:130:0x0194), top: B:139:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085 A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:3:0x0004, B:5:0x000e, B:11:0x0019, B:13:0x0023, B:16:0x0029, B:18:0x0033, B:20:0x0037, B:23:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0051, B:31:0x005d, B:37:0x0068, B:39:0x0072, B:43:0x007b, B:45:0x0085, B:49:0x008e, B:51:0x0098, B:55:0x00a1, B:57:0x00ab, B:60:0x00b1, B:62:0x00bb, B:68:0x00c7, B:72:0x00d2, B:74:0x00dc, B:76:0x00e0, B:79:0x00e6, B:83:0x00f6, B:86:0x00fe, B:88:0x0108, B:90:0x010c, B:93:0x0112, B:96:0x0120, B:97:0x0124, B:99:0x012f, B:101:0x0133, B:103:0x0143, B:106:0x0149, B:107:0x0154, B:109:0x015a, B:111:0x0164, B:114:0x016a, B:119:0x0174, B:122:0x017c, B:125:0x0183, B:126:0x0185, B:128:0x0190, B:130:0x0194), top: B:139:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098 A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:3:0x0004, B:5:0x000e, B:11:0x0019, B:13:0x0023, B:16:0x0029, B:18:0x0033, B:20:0x0037, B:23:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0051, B:31:0x005d, B:37:0x0068, B:39:0x0072, B:43:0x007b, B:45:0x0085, B:49:0x008e, B:51:0x0098, B:55:0x00a1, B:57:0x00ab, B:60:0x00b1, B:62:0x00bb, B:68:0x00c7, B:72:0x00d2, B:74:0x00dc, B:76:0x00e0, B:79:0x00e6, B:83:0x00f6, B:86:0x00fe, B:88:0x0108, B:90:0x010c, B:93:0x0112, B:96:0x0120, B:97:0x0124, B:99:0x012f, B:101:0x0133, B:103:0x0143, B:106:0x0149, B:107:0x0154, B:109:0x015a, B:111:0x0164, B:114:0x016a, B:119:0x0174, B:122:0x017c, B:125:0x0183, B:126:0x0185, B:128:0x0190, B:130:0x0194), top: B:139:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:3:0x0004, B:5:0x000e, B:11:0x0019, B:13:0x0023, B:16:0x0029, B:18:0x0033, B:20:0x0037, B:23:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0051, B:31:0x005d, B:37:0x0068, B:39:0x0072, B:43:0x007b, B:45:0x0085, B:49:0x008e, B:51:0x0098, B:55:0x00a1, B:57:0x00ab, B:60:0x00b1, B:62:0x00bb, B:68:0x00c7, B:72:0x00d2, B:74:0x00dc, B:76:0x00e0, B:79:0x00e6, B:83:0x00f6, B:86:0x00fe, B:88:0x0108, B:90:0x010c, B:93:0x0112, B:96:0x0120, B:97:0x0124, B:99:0x012f, B:101:0x0133, B:103:0x0143, B:106:0x0149, B:107:0x0154, B:109:0x015a, B:111:0x0164, B:114:0x016a, B:119:0x0174, B:122:0x017c, B:125:0x0183, B:126:0x0185, B:128:0x0190, B:130:0x0194), top: B:139:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7 A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:3:0x0004, B:5:0x000e, B:11:0x0019, B:13:0x0023, B:16:0x0029, B:18:0x0033, B:20:0x0037, B:23:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0051, B:31:0x005d, B:37:0x0068, B:39:0x0072, B:43:0x007b, B:45:0x0085, B:49:0x008e, B:51:0x0098, B:55:0x00a1, B:57:0x00ab, B:60:0x00b1, B:62:0x00bb, B:68:0x00c7, B:72:0x00d2, B:74:0x00dc, B:76:0x00e0, B:79:0x00e6, B:83:0x00f6, B:86:0x00fe, B:88:0x0108, B:90:0x010c, B:93:0x0112, B:96:0x0120, B:97:0x0124, B:99:0x012f, B:101:0x0133, B:103:0x0143, B:106:0x0149, B:107:0x0154, B:109:0x015a, B:111:0x0164, B:114:0x016a, B:119:0x0174, B:122:0x017c, B:125:0x0183, B:126:0x0185, B:128:0x0190, B:130:0x0194), top: B:139:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d2 A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:3:0x0004, B:5:0x000e, B:11:0x0019, B:13:0x0023, B:16:0x0029, B:18:0x0033, B:20:0x0037, B:23:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0051, B:31:0x005d, B:37:0x0068, B:39:0x0072, B:43:0x007b, B:45:0x0085, B:49:0x008e, B:51:0x0098, B:55:0x00a1, B:57:0x00ab, B:60:0x00b1, B:62:0x00bb, B:68:0x00c7, B:72:0x00d2, B:74:0x00dc, B:76:0x00e0, B:79:0x00e6, B:83:0x00f6, B:86:0x00fe, B:88:0x0108, B:90:0x010c, B:93:0x0112, B:96:0x0120, B:97:0x0124, B:99:0x012f, B:101:0x0133, B:103:0x0143, B:106:0x0149, B:107:0x0154, B:109:0x015a, B:111:0x0164, B:114:0x016a, B:119:0x0174, B:122:0x017c, B:125:0x0183, B:126:0x0185, B:128:0x0190, B:130:0x0194), top: B:139:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0 A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:3:0x0004, B:5:0x000e, B:11:0x0019, B:13:0x0023, B:16:0x0029, B:18:0x0033, B:20:0x0037, B:23:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0051, B:31:0x005d, B:37:0x0068, B:39:0x0072, B:43:0x007b, B:45:0x0085, B:49:0x008e, B:51:0x0098, B:55:0x00a1, B:57:0x00ab, B:60:0x00b1, B:62:0x00bb, B:68:0x00c7, B:72:0x00d2, B:74:0x00dc, B:76:0x00e0, B:79:0x00e6, B:83:0x00f6, B:86:0x00fe, B:88:0x0108, B:90:0x010c, B:93:0x0112, B:96:0x0120, B:97:0x0124, B:99:0x012f, B:101:0x0133, B:103:0x0143, B:106:0x0149, B:107:0x0154, B:109:0x015a, B:111:0x0164, B:114:0x016a, B:119:0x0174, B:122:0x017c, B:125:0x0183, B:126:0x0185, B:128:0x0190, B:130:0x0194), top: B:139:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6 A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:3:0x0004, B:5:0x000e, B:11:0x0019, B:13:0x0023, B:16:0x0029, B:18:0x0033, B:20:0x0037, B:23:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0051, B:31:0x005d, B:37:0x0068, B:39:0x0072, B:43:0x007b, B:45:0x0085, B:49:0x008e, B:51:0x0098, B:55:0x00a1, B:57:0x00ab, B:60:0x00b1, B:62:0x00bb, B:68:0x00c7, B:72:0x00d2, B:74:0x00dc, B:76:0x00e0, B:79:0x00e6, B:83:0x00f6, B:86:0x00fe, B:88:0x0108, B:90:0x010c, B:93:0x0112, B:96:0x0120, B:97:0x0124, B:99:0x012f, B:101:0x0133, B:103:0x0143, B:106:0x0149, B:107:0x0154, B:109:0x015a, B:111:0x0164, B:114:0x016a, B:119:0x0174, B:122:0x017c, B:125:0x0183, B:126:0x0185, B:128:0x0190, B:130:0x0194), top: B:139:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f6 A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:3:0x0004, B:5:0x000e, B:11:0x0019, B:13:0x0023, B:16:0x0029, B:18:0x0033, B:20:0x0037, B:23:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0051, B:31:0x005d, B:37:0x0068, B:39:0x0072, B:43:0x007b, B:45:0x0085, B:49:0x008e, B:51:0x0098, B:55:0x00a1, B:57:0x00ab, B:60:0x00b1, B:62:0x00bb, B:68:0x00c7, B:72:0x00d2, B:74:0x00dc, B:76:0x00e0, B:79:0x00e6, B:83:0x00f6, B:86:0x00fe, B:88:0x0108, B:90:0x010c, B:93:0x0112, B:96:0x0120, B:97:0x0124, B:99:0x012f, B:101:0x0133, B:103:0x0143, B:106:0x0149, B:107:0x0154, B:109:0x015a, B:111:0x0164, B:114:0x016a, B:119:0x0174, B:122:0x017c, B:125:0x0183, B:126:0x0185, B:128:0x0190, B:130:0x0194), top: B:139:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fe A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:3:0x0004, B:5:0x000e, B:11:0x0019, B:13:0x0023, B:16:0x0029, B:18:0x0033, B:20:0x0037, B:23:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0051, B:31:0x005d, B:37:0x0068, B:39:0x0072, B:43:0x007b, B:45:0x0085, B:49:0x008e, B:51:0x0098, B:55:0x00a1, B:57:0x00ab, B:60:0x00b1, B:62:0x00bb, B:68:0x00c7, B:72:0x00d2, B:74:0x00dc, B:76:0x00e0, B:79:0x00e6, B:83:0x00f6, B:86:0x00fe, B:88:0x0108, B:90:0x010c, B:93:0x0112, B:96:0x0120, B:97:0x0124, B:99:0x012f, B:101:0x0133, B:103:0x0143, B:106:0x0149, B:107:0x0154, B:109:0x015a, B:111:0x0164, B:114:0x016a, B:119:0x0174, B:122:0x017c, B:125:0x0183, B:126:0x0185, B:128:0x0190, B:130:0x0194), top: B:139:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010c A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:3:0x0004, B:5:0x000e, B:11:0x0019, B:13:0x0023, B:16:0x0029, B:18:0x0033, B:20:0x0037, B:23:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0051, B:31:0x005d, B:37:0x0068, B:39:0x0072, B:43:0x007b, B:45:0x0085, B:49:0x008e, B:51:0x0098, B:55:0x00a1, B:57:0x00ab, B:60:0x00b1, B:62:0x00bb, B:68:0x00c7, B:72:0x00d2, B:74:0x00dc, B:76:0x00e0, B:79:0x00e6, B:83:0x00f6, B:86:0x00fe, B:88:0x0108, B:90:0x010c, B:93:0x0112, B:96:0x0120, B:97:0x0124, B:99:0x012f, B:101:0x0133, B:103:0x0143, B:106:0x0149, B:107:0x0154, B:109:0x015a, B:111:0x0164, B:114:0x016a, B:119:0x0174, B:122:0x017c, B:125:0x0183, B:126:0x0185, B:128:0x0190, B:130:0x0194), top: B:139:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0112 A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:3:0x0004, B:5:0x000e, B:11:0x0019, B:13:0x0023, B:16:0x0029, B:18:0x0033, B:20:0x0037, B:23:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0051, B:31:0x005d, B:37:0x0068, B:39:0x0072, B:43:0x007b, B:45:0x0085, B:49:0x008e, B:51:0x0098, B:55:0x00a1, B:57:0x00ab, B:60:0x00b1, B:62:0x00bb, B:68:0x00c7, B:72:0x00d2, B:74:0x00dc, B:76:0x00e0, B:79:0x00e6, B:83:0x00f6, B:86:0x00fe, B:88:0x0108, B:90:0x010c, B:93:0x0112, B:96:0x0120, B:97:0x0124, B:99:0x012f, B:101:0x0133, B:103:0x0143, B:106:0x0149, B:107:0x0154, B:109:0x015a, B:111:0x0164, B:114:0x016a, B:119:0x0174, B:122:0x017c, B:125:0x0183, B:126:0x0185, B:128:0x0190, B:130:0x0194), top: B:139:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0120 A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:3:0x0004, B:5:0x000e, B:11:0x0019, B:13:0x0023, B:16:0x0029, B:18:0x0033, B:20:0x0037, B:23:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0051, B:31:0x005d, B:37:0x0068, B:39:0x0072, B:43:0x007b, B:45:0x0085, B:49:0x008e, B:51:0x0098, B:55:0x00a1, B:57:0x00ab, B:60:0x00b1, B:62:0x00bb, B:68:0x00c7, B:72:0x00d2, B:74:0x00dc, B:76:0x00e0, B:79:0x00e6, B:83:0x00f6, B:86:0x00fe, B:88:0x0108, B:90:0x010c, B:93:0x0112, B:96:0x0120, B:97:0x0124, B:99:0x012f, B:101:0x0133, B:103:0x0143, B:106:0x0149, B:107:0x0154, B:109:0x015a, B:111:0x0164, B:114:0x016a, B:119:0x0174, B:122:0x017c, B:125:0x0183, B:126:0x0185, B:128:0x0190, B:130:0x0194), top: B:139:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012f A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:3:0x0004, B:5:0x000e, B:11:0x0019, B:13:0x0023, B:16:0x0029, B:18:0x0033, B:20:0x0037, B:23:0x003d, B:25:0x0043, B:27:0x004d, B:29:0x0051, B:31:0x005d, B:37:0x0068, B:39:0x0072, B:43:0x007b, B:45:0x0085, B:49:0x008e, B:51:0x0098, B:55:0x00a1, B:57:0x00ab, B:60:0x00b1, B:62:0x00bb, B:68:0x00c7, B:72:0x00d2, B:74:0x00dc, B:76:0x00e0, B:79:0x00e6, B:83:0x00f6, B:86:0x00fe, B:88:0x0108, B:90:0x010c, B:93:0x0112, B:96:0x0120, B:97:0x0124, B:99:0x012f, B:101:0x0133, B:103:0x0143, B:106:0x0149, B:107:0x0154, B:109:0x015a, B:111:0x0164, B:114:0x016a, B:119:0x0174, B:122:0x017c, B:125:0x0183, B:126:0x0185, B:128:0x0190, B:130:0x0194), top: B:139:0x0004 }] */
    /* JADX WARN: Type inference failed for: r10v11, types: [ks3] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.vv8 t(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eh.t(java.lang.String):vv8");
    }

    public static final int u(byte[] bArr, int i, int i2) {
        int i3 = (i2 * 4) + i;
        if (i3 + 4 <= bArr.length) {
            return yae.v(bArr, i3);
        }
        return 0;
    }

    public static Map v(d56 d56Var) {
        i56 i56Var;
        if (d56Var == null) {
            return ls3.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : d56Var.a.entrySet()) {
            String str = (String) entry.getKey();
            k46 k46Var = (k46) entry.getValue();
            Integer num = null;
            if (k46Var instanceof t36) {
                Object e0 = sl1.e0((List) k46Var);
                if (e0 instanceof i56) {
                    i56Var = (i56) e0;
                } else {
                    i56Var = null;
                }
                if (i56Var != null) {
                    num = l46.e(i56Var);
                }
            } else if (k46Var instanceof i56) {
                num = l46.e((i56) k46Var);
            }
            if (num != null) {
                linkedHashMap.put(str, num);
            }
        }
        return linkedHashMap;
    }

    public static Map w(d56 d56Var) {
        i56 i56Var;
        if (d56Var == null) {
            return ls3.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : d56Var.a.entrySet()) {
            String str = (String) entry.getKey();
            k46 k46Var = (k46) entry.getValue();
            Integer num = null;
            if (k46Var instanceof i56) {
                i56Var = (i56) k46Var;
            } else {
                i56Var = null;
            }
            if (i56Var != null) {
                num = l46.e(i56Var);
            }
            if (num != null) {
                linkedHashMap.put(str, num);
            }
        }
        return linkedHashMap;
    }

    public static final void x(float[] fArr, float[] fArr2) {
        float n = n(0, 0, fArr2, fArr);
        float n2 = n(0, 1, fArr2, fArr);
        float n3 = n(0, 2, fArr2, fArr);
        float n4 = n(0, 3, fArr2, fArr);
        float n5 = n(1, 0, fArr2, fArr);
        float n6 = n(1, 1, fArr2, fArr);
        float n7 = n(1, 2, fArr2, fArr);
        float n8 = n(1, 3, fArr2, fArr);
        float n9 = n(2, 0, fArr2, fArr);
        float n10 = n(2, 1, fArr2, fArr);
        float n11 = n(2, 2, fArr2, fArr);
        float n12 = n(2, 3, fArr2, fArr);
        float n13 = n(3, 0, fArr2, fArr);
        float n14 = n(3, 1, fArr2, fArr);
        float n15 = n(3, 2, fArr2, fArr);
        float n16 = n(3, 3, fArr2, fArr);
        fArr[0] = n;
        fArr[1] = n2;
        fArr[2] = n3;
        fArr[3] = n4;
        fArr[4] = n5;
        fArr[5] = n6;
        fArr[6] = n7;
        fArr[7] = n8;
        fArr[8] = n9;
        fArr[9] = n10;
        fArr[10] = n11;
        fArr[11] = n12;
        fArr[12] = n13;
        fArr[13] = n14;
        fArr[14] = n15;
        fArr[15] = n16;
    }

    public static final long y(int i, long j) {
        if (i % 180 == 0) {
            return j;
        }
        int i2 = az5.c;
        return c((int) (4294967295L & j), (int) (j >> 32));
    }

    public static String z(k46 k46Var) {
        i56 i56Var;
        if (k46Var instanceof i56) {
            i56Var = (i56) k46Var;
        } else {
            i56Var = null;
        }
        if (i56Var != null) {
            if (!i56Var.b()) {
                i56Var = null;
            }
            if (i56Var != null) {
                return i56Var.a();
            }
        }
        return null;
    }
}
