package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tl1  reason: default package */
/* loaded from: classes.dex */
public abstract class tl1 {
    public static final tu1 a = new tu1(new wu1(12), false, -1431088190);
    public static final tu1 b = new tu1(new xu1(13), false, -45746142);

    public static List A(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public static List B(Object... objArr) {
        if (objArr.length > 0) {
            List asList = Arrays.asList(objArr);
            asList.getClass();
            return asList;
        }
        return ks3.a;
    }

    public static ArrayList C(Object... objArr) {
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new oz(objArr, true));
    }

    public static final List D(List list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return list;
            }
            return A(list.get(0));
        }
        return ks3.a;
    }

    public static pg5 E(String str) {
        str.getClass();
        pg5 pg5Var = pg5.b;
        if (str.equals(pg5Var.a)) {
            return pg5Var;
        }
        pg5 pg5Var2 = pg5.c;
        if (str.equals(pg5Var2.a)) {
            return pg5Var2;
        }
        pg5 pg5Var3 = pg5.d;
        if (str.equals(pg5Var3.a)) {
            return pg5Var3;
        }
        pg5 pg5Var4 = pg5.e;
        if (str.equals(pg5Var4.a)) {
            return pg5Var4;
        }
        pg5 pg5Var5 = pg5.i;
        if (str.equals(pg5Var5.a)) {
            return pg5Var5;
        }
        pg5 pg5Var6 = pg5.f;
        if (str.equals(pg5Var6.a)) {
            return pg5Var6;
        }
        pg5 pg5Var7 = pg5.g;
        if (str.equals(pg5Var7.a)) {
            return pg5Var7;
        }
        pg5 pg5Var8 = pg5.j;
        if (str.equals(pg5Var8.a)) {
            return pg5Var8;
        }
        pg5 pg5Var9 = pg5.h;
        if (str.equals(pg5Var9.a)) {
            return pg5Var9;
        }
        return new pg5(str);
    }

    public static final void F(int i, int i2) {
        if (i2 >= 0) {
            if (i2 <= i) {
                return;
            }
            cy7.k(hl5.i(i2, i, "toIndex (", ") is greater than size (", ")."));
            return;
        }
        vs.m(hl5.l("fromIndex (0) is greater than toIndex (", ").", i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x018f, code lost:
        if (r26.f(r3) == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
        if (r26.g(r10) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r26.g(r15) == false) goto L123;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.pm1 G(long r18, boolean r20, boolean r21, defpackage.dl8 r22, double r23, defpackage.xt4 r25, defpackage.rv4 r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl1.G(long, boolean, boolean, dl8, double, xt4, rv4, int, int, int):pm1");
    }

    public static final List H(List list) {
        String str;
        list.getClass();
        if (!list.isEmpty()) {
            pm0[] pm0VarArr = new pm0[6];
            jt1[] jt1VarArr = new jt1[6];
            for (int i = 0; i < 6; i++) {
                jt1 jt1Var = new jt1((char) 0, 6);
                jt1Var.c = null;
                jt1Var.b = 1;
                jt1VarArr[i] = jt1Var;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                xl0 xl0Var = (xl0) it.next();
                int i2 = xl0Var.d.a;
                hn0 hn0Var = xl0Var.b;
                if (!hn0Var.a()) {
                    for (int i3 = 0; i3 < 6; i3++) {
                        jt1 jt1Var2 = jt1VarArr[i3];
                        jt1Var2.c = null;
                        jt1Var2.b = 1;
                    }
                    for (int i4 = 0; i4 < 6; i4++) {
                        pm0VarArr[i4] = null;
                    }
                    arrayList.add(xl0Var);
                } else {
                    Object obj = kh5.W;
                    if (i2 != 0) {
                        int i5 = i2 - 1;
                        while (true) {
                            if (-1 >= i5) {
                                break;
                            }
                            pm0 pm0Var = pm0VarArr[i5];
                            if (pm0Var != null) {
                                str = pm0Var.a;
                            } else {
                                str = null;
                            }
                            if (str != null) {
                                obj = new pm0(str);
                                break;
                            }
                            i5--;
                        }
                    }
                    if (hn0Var instanceof dn0) {
                        jt1 jt1Var3 = jt1VarArr[i2];
                        jt1Var3.getClass();
                        if (!c16.i(jt1Var3.c, obj)) {
                            jt1Var3.c = obj;
                            jt1Var3.b = 1;
                        }
                        int i6 = jt1Var3.b;
                        jt1Var3.b = i6 + 1;
                        if (((dn0) hn0Var).a == i6) {
                            arrayList.add(xl0Var);
                        } else {
                            arrayList.add(xl0.a(xl0Var, new dn0(i6), null, null, 13));
                            z = true;
                        }
                    } else {
                        jt1 jt1Var4 = jt1VarArr[i2];
                        jt1Var4.getClass();
                        jt1Var4.c = obj;
                        jt1Var4.b = 1;
                        arrayList.add(xl0Var);
                    }
                    pm0VarArr[i2] = new pm0(xl0Var.a);
                    int i7 = i2 + 1;
                    if (i7 <= 5) {
                        while (true) {
                            pm0VarArr[i7] = null;
                            if (i7 != 5) {
                                i7++;
                            }
                        }
                    }
                }
            }
            if (z) {
                return arrayList;
            }
        }
        return list;
    }

    public static final qv5 I(qv5 qv5Var, int i, int i2) {
        iyb a2;
        String str = qv5Var.a;
        if (i == 0 && i2 == str.length()) {
            return qv5Var;
        }
        if (i >= i2) {
            return new qv5("", ks3.a);
        }
        List<iyb> list = qv5Var.b;
        ArrayList arrayList = new ArrayList();
        for (iyb iybVar : list) {
            int max = Math.max(iybVar.a, i);
            int min = Math.min(iybVar.b, i2);
            if (max >= min) {
                a2 = null;
            } else {
                a2 = iyb.a(iybVar, max - i, min - i);
            }
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return new qv5(str.substring(i, i2), arrayList);
    }

    public static final qw5 J(File file) {
        file.getClass();
        return new qw5(new FileInputStream(file), dac.d);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [dac, java.lang.Object] */
    public static final qw5 K(InputStream inputStream) {
        inputStream.getClass();
        return new qw5(inputStream, new Object());
    }

    public static void L() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void M() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final void a(cia ciaVar, boolean z, boolean z2, boolean z3, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        float f;
        pu0 pu0Var;
        float f2;
        rv4 rv4Var2 = rv4Var;
        ba5 ba5Var = lre.g;
        ciaVar.getClass();
        String str = ciaVar.b;
        int i9 = ciaVar.g;
        xt4Var.getClass();
        xt4Var2.getClass();
        rv4Var2.g0(2069607715);
        if (rv4Var2.f(ciaVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i10 = i | i2;
        if (rv4Var2.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i11 = i10 | i3;
        if (rv4Var2.g(z2)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i12 = i11 | i4;
        if (rv4Var2.g(z3)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i13 = i12 | i5;
        if (rv4Var2.f(nq7Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i14 = i13 | i6;
        if (rv4Var2.h(xt4Var)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i15 = i14 | i7;
        if (rv4Var2.h(xt4Var2)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i16 = i15 | i8;
        if ((599187 & i16) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (rv4Var2.U(i16 & 1, z4)) {
            if ((458752 & i16) == 131072) {
                z5 = true;
            } else {
                z5 = false;
            }
            int i17 = i16 & 14;
            if (i17 != 4) {
                z6 = false;
            } else {
                z6 = true;
            }
            boolean z9 = z6 | z5;
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (z9 || P == lh9Var) {
                P = new gja(xt4Var, ciaVar, 6);
                rv4Var2.o0(P);
            }
            vt4 vt4Var = (vt4) P;
            if ((3670016 & i16) == 1048576) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (i17 != 4) {
                z8 = false;
            } else {
                z8 = true;
            }
            boolean z10 = z7 | z8;
            Object P2 = rv4Var2.P();
            if (z10 || P2 == lh9Var) {
                P2 = new gja(xt4Var2, ciaVar, 7);
                rv4Var2.o0(P2);
            }
            nq7 c = q1d.c((i16 >> 12) & 14, vt4Var, (vt4) P2, rv4Var2, nq7Var);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, c);
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
            nq7 t = jsc.t(0.6666667f, pna.f(kq7Var, 1.0f), false);
            tza tzaVar = j27.a;
            nq7 k = tte.k(t, ((h27) rv4Var2.j(tzaVar)).c.b);
            nk0 nk0Var = kh5.a;
            b37 d = fu0.d(nk0Var, false);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, k);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, d);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            do5.c(ciaVar.a, str, ciaVar.c, ciaVar.e, r0f.d, pna.c, rv4Var2, 221184);
            pu0 pu0Var2 = pu0.a;
            if (z) {
                rv4Var2.e0(-659919623);
                pu0Var = pu0Var2;
                f = 0.9f;
                cvb.c(yqe.B((y3b) b3b.i.getValue(), new Object[]{Integer.valueOf(ciaVar.i)}, rv4Var2), zbe.z(nmd.v(tte.k(pu0Var2.a(kq7Var, kh5.c), bue.c(7, 8.0f)), zl1.b(0.9f, zl1.b), ba5Var), 6.0f, 2.0f), zl1.e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.o, rv4Var, 384, 0, 131064);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                f = 0.9f;
                pu0Var = pu0Var2;
                rv4Var2.e0(-659442533);
                rv4Var2.q(false);
            }
            if (z2 && i9 > 0) {
                rv4Var2.e0(-659347983);
                String valueOf2 = String.valueOf(i9);
                long j = zl1.e;
                oyb oybVar = ((h27) rv4Var2.j(tzaVar)).b.o;
                nq7 z11 = zbe.z(nmd.v(tte.k(pu0Var.a(kq7Var, kh5.E), bue.c(14, nae.e)), zl1.b(f, zl1.b), ba5Var), 6.0f, 2.0f);
                f2 = 2.0f;
                cvb.c(valueOf2, z11, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var, 384, 0, 131064);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                f2 = 2.0f;
                rv4Var2.e0(-658893957);
                rv4Var2.q(false);
            }
            if (z3 && ciaVar.h > 0) {
                rv4Var2.e0(-658822812);
                rv4 rv4Var3 = rv4Var2;
                ctd.a(3072, 6, 0L, 0L, jce.E(179236967, new pl7(ciaVar, 10), rv4Var2), rv4Var3, zbe.y(pu0Var.a(kq7Var, nk0Var), 4.0f));
                rv4Var2 = rv4Var3;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(-658585445);
                rv4Var2.q(false);
            }
            rs8.u(rv4Var2, true, kq7Var, f2, rv4Var2);
            cvb.c(str, pna.f(kq7Var, 1.0f), 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 2, false, 2, 0, null, ((h27) rv4Var2.j(tzaVar)).b.k, rv4Var, 48, 24960, 109564);
            cvb.c(ciaVar.k, pna.f(kq7Var, 1.0f), zl1.b(0.6f, ((zl1) rv4Var.j(r12.a)).a), null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 2, false, 1, 0, null, ((h27) rv4Var.j(tzaVar)).b.l, rv4Var, 48, 24960, 109560);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new mja(ciaVar, z, z2, z3, nq7Var, xt4Var, xt4Var2, i, 1);
        }
    }

    public static final void b(cia ciaVar, boolean z, boolean z2, boolean z3, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i9;
        pu0 pu0Var;
        float f;
        float f2;
        rv4 rv4Var2 = rv4Var;
        ba5 ba5Var = lre.g;
        ciaVar.getClass();
        String str = ciaVar.b;
        int i10 = ciaVar.g;
        int i11 = ciaVar.h;
        xt4Var.getClass();
        xt4Var2.getClass();
        rv4Var2.g0(-886596158);
        if (rv4Var2.f(ciaVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i12 = i | i2;
        if (rv4Var2.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i13 = i12 | i3;
        if (rv4Var2.g(z2)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i14 = i13 | i4;
        if (rv4Var2.g(z3)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i15 = i14 | i5;
        if (rv4Var2.f(nq7Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i16 = i15 | i6;
        if (rv4Var2.h(xt4Var)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i17 = i16 | i7;
        if (rv4Var2.h(xt4Var2)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i18 = i17 | i8;
        if ((599187 & i18) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (rv4Var2.U(i18 & 1, z4)) {
            if ((458752 & i18) == 131072) {
                z5 = true;
            } else {
                z5 = false;
            }
            int i19 = i18 & 14;
            if (i19 != 4) {
                z6 = false;
            } else {
                z6 = true;
            }
            boolean z9 = z5 | z6;
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (z9 || P == lh9Var) {
                P = new gja(xt4Var, ciaVar, 8);
                rv4Var2.o0(P);
            }
            vt4 vt4Var = (vt4) P;
            if ((3670016 & i18) == 1048576) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (i19 != 4) {
                z8 = false;
            } else {
                z8 = true;
            }
            boolean z10 = z7 | z8;
            Object P2 = rv4Var2.P();
            if (z10 || P2 == lh9Var) {
                P2 = new gja(xt4Var2, ciaVar, 9);
                rv4Var2.o0(P2);
            }
            nq7 c = q1d.c((i18 >> 12) & 14, vt4Var, (vt4) P2, rv4Var2, nq7Var);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, c);
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
            nq7 t = jsc.t(0.6666667f, pna.f(kq7Var, 1.0f), false);
            tza tzaVar = j27.a;
            nq7 k = tte.k(t, ((h27) rv4Var2.j(tzaVar)).c.b);
            nk0 nk0Var = kh5.a;
            b37 d = fu0.d(nk0Var, false);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, k);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, d);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            do5.c(ciaVar.a, str, ciaVar.c, ciaVar.e, r0f.d, pna.c, rv4Var2, 221184);
            pu0 pu0Var2 = pu0.a;
            if (z) {
                rv4Var2.e0(-625095686);
                pu0Var = pu0Var2;
                cvb.c(yqe.B((y3b) b3b.i.getValue(), new Object[]{Integer.valueOf(ciaVar.i)}, rv4Var2), zbe.z(nmd.v(tte.k(pu0Var2.a(kq7Var, kh5.c), bue.c(7, 8.0f)), zl1.b(0.9f, zl1.b), ba5Var), 6.0f, 2.0f), zl1.e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.o, rv4Var, 384, 0, 131064);
                rv4Var2 = rv4Var;
                i9 = 0;
                rv4Var2.q(false);
            } else {
                i9 = 0;
                pu0Var = pu0Var2;
                rv4Var2.e0(-624618596);
                rv4Var2.q(false);
            }
            nq7 k2 = tte.k(pu0Var.a(kq7Var, nk0Var), bue.c(11, nae.e));
            gv9 a3 = ev9.a(lz.a, kh5.F, rv4Var2, i9);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, k2);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l3);
            s21.t(hashCode3, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p3);
            if (z3 && i11 > 0) {
                rv4Var2.e0(-1018565065);
                f = 0.0f;
                f2 = 2.0f;
                cvb.c(String.valueOf(i11), zbe.z(nmd.v(kq7Var, zl1.b(0.9f, zl1.f), ba5Var), 4.0f, 2.0f), zl1.e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.o, rv4Var, 384, 0, 131064);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                f = 0.0f;
                f2 = 2.0f;
                rv4Var2.e0(-1018169536);
                rv4Var2.q(false);
            }
            if (z2 && i10 > 0) {
                rv4Var2.e0(-1018070088);
                cvb.c(String.valueOf(i10), zbe.z(nmd.v(kq7Var, zl1.b(0.9f, zl1.b), ba5Var), 6.0f, f2), zl1.e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.o, rv4Var, 384, 0, 131064);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(-1017675520);
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
            Object P3 = rv4Var2.P();
            if (P3 == lh9Var) {
                Float valueOf2 = Float.valueOf(f);
                long j = zl1.b;
                P3 = ox9.C(new yk8[]{new yk8(valueOf2, new zl1(zl1.b(f, j))), new yk8(Float.valueOf(0.4f), new zl1(zl1.b(0.6f, j))), new yk8(Float.valueOf(1.0f), new zl1(zl1.b(1.0f, j)))});
                rv4Var2.o0(P3);
            }
            cvb.c(str, zbe.y(nmd.u(pu0Var.a(pna.f(kq7Var, 1.0f), kh5.D), (hy0) P3), 4.0f), zl1.e, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 2, false, 2, 0, null, ((h27) rv4Var2.j(tzaVar)).b.l, rv4Var, 384, 24960, 109560);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new mja(ciaVar, z, z2, z3, nq7Var, xt4Var, xt4Var2, i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    public static final void c(cia ciaVar, boolean z, boolean z2, boolean z3, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z4;
        cia ciaVar2;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        pu0 pu0Var;
        ?? r8;
        boolean z9;
        mk0 mk0Var;
        dz dzVar;
        np npVar;
        np npVar2;
        kg kgVar;
        np npVar3;
        float f;
        int i9;
        float f2;
        rv4 rv4Var2 = rv4Var;
        ciaVar.getClass();
        String str = ciaVar.b;
        int i10 = ciaVar.g;
        int i11 = ciaVar.h;
        xt4Var.getClass();
        xt4Var2.getClass();
        rv4Var2.g0(-1039861637);
        if (rv4Var2.f(ciaVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i12 = i | i2;
        if (rv4Var2.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i13 = i12 | i3;
        if (rv4Var2.g(z2)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i14 = i13 | i4;
        if (rv4Var2.g(z3)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i15 = i14 | i5;
        if (rv4Var2.f(nq7Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i16 = i15 | i6;
        if (rv4Var2.h(xt4Var)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i17 = i16 | i7;
        if (rv4Var2.h(xt4Var2)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i18 = i17 | i8;
        if ((599187 & i18) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (rv4Var2.U(i18 & 1, z4)) {
            nq7 k = tte.k(nq7Var, r0f.z(rv4Var2).d);
            long g = rm1.g(r0f.y(rv4Var2), 1.0f);
            ba5 ba5Var = lre.g;
            nq7 v = nmd.v(k, g, ba5Var);
            if ((458752 & i18) == 131072) {
                z5 = true;
            } else {
                z5 = false;
            }
            int i19 = i18 & 14;
            if (i19 != 4) {
                z6 = false;
            } else {
                z6 = true;
            }
            boolean z10 = z6 | z5;
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (z10 || P == lh9Var) {
                P = new gja(xt4Var, ciaVar, 2);
                rv4Var2.o0(P);
            }
            vt4 vt4Var = (vt4) P;
            if ((3670016 & i18) == 1048576) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (i19 != 4) {
                z8 = false;
            } else {
                z8 = true;
            }
            boolean z11 = z7 | z8;
            Object P2 = rv4Var2.P();
            if (z11 || P2 == lh9Var) {
                P2 = new gja(xt4Var2, ciaVar, 3);
                rv4Var2.o0(P2);
            }
            nq7 z12 = zbe.z(q1d.c(0, vt4Var, (vt4) P2, rv4Var2, v), 12.0f, 12.0f);
            mk0 mk0Var2 = kh5.G;
            dz dzVar2 = lz.a;
            gv9 a2 = ev9.a(dzVar2, mk0Var2, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, z12);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar4 = qw1.f;
            jce.F(npVar4, rv4Var2, a2);
            np npVar5 = qw1.e;
            jce.F(npVar5, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar6 = qw1.g;
            jce.F(npVar6, rv4Var2, valueOf);
            kg kgVar2 = qw1.h;
            jce.C(kgVar2, rv4Var2);
            np npVar7 = qw1.d;
            jce.F(npVar7, rv4Var2, p);
            kq7 kq7Var = kq7.a;
            nq7 t = jsc.t(0.6666667f, tte.k(pna.s(kq7Var, 56.0f), r0f.z(rv4Var2).b), false);
            b37 d = fu0.d(kh5.a, false);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, t);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar4, rv4Var2, d);
            jce.F(npVar5, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar6, rv4Var2, kgVar2);
            jce.F(npVar7, rv4Var2, p2);
            do5.c(ciaVar.a, str, ciaVar.c, ciaVar.e, r0f.d, pna.c, rv4Var2, 221184);
            pu0 pu0Var2 = pu0.a;
            if (z) {
                rv4Var2.e0(-1336819318);
                String B = yqe.B((y3b) b3b.i.getValue(), new Object[]{Integer.valueOf(ciaVar.i)}, rv4Var2);
                long j = zl1.e;
                oyb oybVar = r0f.A(rv4Var2).o;
                pu0Var = pu0Var2;
                cvb.c(B, zbe.z(nmd.v(tte.k(pu0Var2.a(kq7Var, kh5.c), bue.c(7, 4.0f)), zl1.b(0.9f, zl1.b), ba5Var), 6.0f, 1.0f), j, null, zr1.q(9), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var, 24960, 0, 131048);
                rv4Var2 = rv4Var;
                r8 = 0;
                rv4Var2.q(false);
            } else {
                pu0Var = pu0Var2;
                r8 = 0;
                rv4Var2.e0(-1336306671);
                rv4Var2.q(false);
            }
            nq7 k2 = tte.k(pu0Var.a(kq7Var, kh5.C), bue.c(13, nae.e));
            mk0 mk0Var3 = kh5.F;
            gv9 a3 = ev9.a(dzVar2, mk0Var3, rv4Var2, r8);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, k2);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar4, rv4Var2, a3);
            jce.F(npVar5, rv4Var2, l3);
            s21.t(hashCode3, rv4Var2, npVar6, rv4Var2, kgVar2);
            jce.F(npVar7, rv4Var2, p3);
            if (z3 && i11 > 0) {
                rv4Var2.e0(1069793091);
                String valueOf2 = String.valueOf(i11);
                long j2 = zl1.e;
                oyb oybVar2 = r0f.A(rv4Var2).o;
                npVar2 = npVar7;
                mk0Var = mk0Var3;
                kgVar = kgVar2;
                z9 = false;
                dzVar = dzVar2;
                npVar = npVar6;
                cvb.c(valueOf2, zbe.z(nmd.v(kq7Var, zl1.b(0.9f, zl1.f), ba5Var), 4.0f, 1.0f), j2, null, zr1.q(9), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar2, rv4Var, 24960, 0, 131048);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                z9 = r8;
                mk0Var = mk0Var3;
                dzVar = dzVar2;
                npVar = npVar6;
                npVar2 = npVar7;
                kgVar = kgVar2;
                rv4Var2.e0(1070228021);
                rv4Var2.q(z9);
            }
            if (z2 && i10 > 0) {
                rv4Var2.e0(1070328740);
                npVar3 = npVar5;
                cvb.c(String.valueOf(i10), zbe.z(nmd.v(kq7Var, zl1.b(0.9f, zl1.b), ba5Var), 4.0f, 1.0f), zl1.e, null, zr1.q(9), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).o, rv4Var, 24960, 0, 131048);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                npVar3 = npVar5;
                rv4Var2.e0(1070762709);
                rv4Var2.q(z9);
            }
            rv4Var2.q(true);
            rv4Var2.q(true);
            xbe.i(rv4Var2, pna.s(kq7Var, 14.0f));
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            } else {
                f = 1.0f;
            }
            we6 we6Var = new we6(f, true);
            xn1 a4 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode4 = Long.hashCode(rv4Var2.T);
            xt8 l4 = rv4Var2.l();
            nq7 p4 = lye.p(rv4Var2, we6Var);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar4, rv4Var2, a4);
            np npVar8 = npVar3;
            jce.F(npVar8, rv4Var2, l4);
            s21.t(hashCode4, rv4Var2, npVar, rv4Var2, kgVar);
            jce.F(npVar2, rv4Var2, p4);
            np npVar9 = npVar2;
            cvb.c(str, pna.f(kq7Var, 1.0f), 0L, null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 2, 0, null, r0f.A(rv4Var2).i, rv4Var, 48, 24960, 109564);
            rv4 rv4Var3 = rv4Var;
            xbe.i(rv4Var3, pna.h(kq7Var, 6.0f));
            if (ciaVar.k.length() > 0) {
                rv4Var3.e0(532172865);
                ciaVar2 = ciaVar;
                cvb.c(ciaVar.k, pna.f(kq7Var, 1.0f), zl1.b(0.5f, r0f.y(rv4Var3).o), null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 1, 0, null, r0f.A(rv4Var3).l, rv4Var, 48, 24960, 109560);
                rv4Var3 = rv4Var;
                i9 = 0;
                rv4Var3.q(false);
            } else {
                ciaVar2 = ciaVar;
                i9 = 0;
                rv4Var3.e0(532586529);
                rv4Var3.q(false);
            }
            nq7 f3 = hl5.f(kq7Var, 4.0f, rv4Var3, kq7Var, 1.0f);
            gv9 a5 = ev9.a(dzVar, mk0Var, rv4Var3, i9);
            int hashCode5 = Long.hashCode(rv4Var3.T);
            xt8 l5 = rv4Var3.l();
            nq7 p5 = lye.p(rv4Var3, f3);
            rv4Var3.i0();
            if (rv4Var3.S) {
                rv4Var3.k(zx1Var);
            } else {
                rv4Var3.r0();
            }
            jce.F(npVar4, rv4Var3, a5);
            jce.F(npVar8, rv4Var3, l5);
            s21.t(hashCode5, rv4Var3, npVar, rv4Var3, kgVar);
            jce.F(npVar9, rv4Var3, p5);
            String str2 = ciaVar2.d;
            oyb oybVar3 = r0f.A(rv4Var3).l;
            long b2 = zl1.b(0.5f, r0f.y(rv4Var3).o);
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = 1.0f;
            }
            cvb.c(str2, new we6(f2, true), b2, null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 1, 0, null, oybVar3, rv4Var, 0, 24960, 109560);
            rv4Var2 = rv4Var;
            if (ciaVar2.j <= 0) {
                rv4Var2.e0(138990453);
                tc4.l(ciaVar2.j, null, false, zl1.b(0.5f, r0f.y(rv4Var2).o), 0L, 0L, 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).l, rv4Var, 0, 0, 131062);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(139238949);
                rv4Var2.q(false);
            }
            hl5.v(rv4Var2, true, true, true);
        } else {
            ciaVar2 = ciaVar;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new mja(ciaVar2, z, z2, z3, nq7Var, xt4Var, xt4Var2, i, 0);
        }
    }

    public static final void d(cia ciaVar, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        int i6;
        boolean z4;
        boolean z5;
        boolean z6;
        rv4 rv4Var2 = rv4Var;
        ciaVar.getClass();
        String str = ciaVar.k;
        int i7 = ciaVar.i;
        xt4Var.getClass();
        xt4Var2.getClass();
        rv4Var2.g0(-188015442);
        if (rv4Var2.f(ciaVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (rv4Var2.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (rv4Var2.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i10 = i9 | i4;
        if (rv4Var2.h(xt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i10 | i5;
        if ((i11 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i11 & 1, z)) {
            tza tzaVar = j27.a;
            nq7 v = nmd.v(tte.k(nq7Var, ((h27) rv4Var2.j(tzaVar)).c.d), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 1.0f), lre.g);
            if ((i11 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i12 = i11 & 14;
            if (i12 != 4) {
                z3 = false;
            } else {
                z3 = true;
            }
            boolean z7 = z2 | z3;
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (!z7 && P != lh9Var) {
                i6 = 4;
            } else {
                i6 = 4;
                P = new gja(xt4Var, ciaVar, 4);
                rv4Var2.o0(P);
            }
            vt4 vt4Var = (vt4) P;
            if ((i11 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i12 != i6) {
                z5 = false;
            } else {
                z5 = true;
            }
            boolean z8 = z4 | z5;
            Object P2 = rv4Var2.P();
            if (z8 || P2 == lh9Var) {
                P2 = new gja(xt4Var2, ciaVar, 5);
                rv4Var2.o0(P2);
            }
            nq7 z9 = zbe.z(q1d.c(0, vt4Var, (vt4) P2, rv4Var2, v), 12.0f, 12.0f);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, z9);
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
            String str2 = ciaVar.b;
            oyb oybVar = ((h27) rv4Var2.j(tzaVar)).b.i;
            kq7 kq7Var = kq7.a;
            cvb.c(str2, pna.f(kq7Var, 1.0f), 0L, null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 2, 0, null, oybVar, rv4Var2, 48, 24960, 109564);
            xbe.i(rv4Var2, pna.h(kq7Var, 6.0f));
            boolean d = rv4Var2.d(i7) | rv4Var2.f(str);
            if (i12 != 4) {
                z6 = false;
            } else {
                z6 = true;
            }
            boolean z10 = d | z6;
            Object P3 = rv4Var2.P();
            if (z10 || P3 == lh9Var) {
                ns nsVar = new ns();
                int j = nsVar.j(new uva(0L, 0L, dq4.D, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
                try {
                    nsVar.f(i7 + "% ");
                    nsVar.h(j);
                    nsVar.f(str);
                    P3 = nsVar.k();
                    rv4Var2.o0(P3);
                } catch (Throwable th) {
                    nsVar.h(j);
                    throw th;
                }
            }
            cvb.d((ps) P3, pna.f(kq7Var, 1.0f), zl1.b(0.5f, ((zl1) rv4Var2.j(r12.a)).a), 0L, 0L, new tlb(5), 0L, 2, false, 2, 0, null, null, ((h27) rv4Var2.j(tzaVar)).b.l, rv4Var2, 48, 24960, 240632);
            rv4Var2 = rv4Var2;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new rj7((Object) ciaVar, nq7Var, xt4Var, xt4Var2, i, 7);
        }
    }

    public static final void e(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4 rv4Var2;
        pb2 pb2Var;
        cz7Var.getClass();
        rv4Var.g0(-1743944617);
        if (rv4Var.f(cz7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                rv4Var2 = rv4Var;
                fxe.h(yqe.A((y3b) f3b.C.getValue(), rv4Var), pna.c, false, jce.E(2051270867, new p7(cz7Var, 28), rv4Var), null, yte.b, jce.E(488536738, new zd1(jsc.z(((n44) ((fdd) voe.z(cm9.a(n44.class), a2.i(), null, pb2Var, o96.a(rv4Var), null))).c, rv4Var), 2), rv4Var), rv4Var2, 1772592, 20);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new p7(cz7Var, i, 29);
        }
    }

    public static final void f(uja ujaVar, qg6 qg6Var, rh8 rh8Var, bkd bkdVar, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        nq7 nq7Var2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        rv4Var.g0(-3948995);
        if ((i & 6) == 0) {
            if (rv4Var.f(ujaVar)) {
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
            if (rv4Var.f(bkdVar)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            nq7Var2 = nq7Var;
            if (rv4Var.f(nq7Var2)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        } else {
            nq7Var2 = nq7Var;
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
        boolean z4 = false;
        if ((599187 & i2) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            f25 f25Var = new f25(dce.n(ujaVar.d, 80, Context.VERSION_ES6));
            hz hzVar = new hz(8.0f, true, new vs(2));
            hz hzVar2 = new hz(8.0f, true, new vs(2));
            if ((i2 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((458752 & i2) == 131072) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = z2 | z3;
            if ((3670016 & i2) == 1048576) {
                z4 = true;
            }
            boolean z6 = z5 | z4;
            Object P = rv4Var.P();
            if (z6 || P == ax1.a) {
                P = new nja(ujaVar, xt4Var, xt4Var2, 2);
                rv4Var.o0(P);
            }
            int i10 = i2 << 3;
            pc2.d(f25Var, nq7Var2, qg6Var, rh8Var, hzVar2, hzVar, null, false, 0L, 0L, bkdVar, nae.e, (xt4) P, rv4Var, ((i2 >> 9) & Token.ASSIGN_MOD) | 1769472 | (i10 & 896) | (i10 & 7168), (i2 >> 6) & Token.ASSIGN_MOD, 6032);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new oja(ujaVar, qg6Var, rh8Var, bkdVar, nq7Var, xt4Var, xt4Var2, i, 2);
        }
    }

    public static final void g(uja ujaVar, qg6 qg6Var, rh8 rh8Var, bkd bkdVar, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        nq7 nq7Var2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        rv4Var.g0(-706544834);
        if ((i & 6) == 0) {
            if (rv4Var.f(ujaVar)) {
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
            if (rv4Var.f(bkdVar)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            nq7Var2 = nq7Var;
            if (rv4Var.f(nq7Var2)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        } else {
            nq7Var2 = nq7Var;
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
            f25 f25Var = new f25(dce.n(ujaVar.d, 80, Context.VERSION_ES6));
            hz hzVar = new hz(8.0f, true, new vs(2));
            hz hzVar2 = new hz(8.0f, true, new vs(2));
            if ((i2 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
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
                P = new nja(ujaVar, xt4Var, xt4Var2, 0);
                rv4Var.o0(P);
            }
            int i10 = i2 << 3;
            pc2.d(f25Var, nq7Var2, qg6Var, rh8Var, hzVar2, hzVar, null, false, 0L, 0L, bkdVar, nae.e, (xt4) P, rv4Var, ((i2 >> 9) & Token.ASSIGN_MOD) | 1769472 | (i10 & 896) | (i10 & 7168), (i2 >> 6) & Token.ASSIGN_MOD, 6032);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new oja(ujaVar, qg6Var, rh8Var, bkdVar, nq7Var, xt4Var, xt4Var2, i, 0);
        }
    }

    public static final void h(uja ujaVar, rh8 rh8Var, bkd bkdVar, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        int i3;
        rv4 rv4Var2;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        rv4 rv4Var3 = rv4Var;
        ujaVar.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        rv4Var3.g0(-1925418977);
        if ((i & 6) == 0) {
            if (rv4Var3.f(ujaVar)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var3.f(rh8Var)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i & 384) == 0) {
            if (rv4Var3.f(bkdVar)) {
                i8 = 256;
            } else {
                i8 = Token.CASE;
            }
            i2 |= i8;
        }
        if ((i & 3072) == 0) {
            if (rv4Var3.f(nq7Var)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            if (rv4Var3.h(xt4Var)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((196608 & i) == 0) {
            if (rv4Var3.h(xt4Var2)) {
                i5 = 131072;
            } else {
                i5 = Parser.ARGC_LIMIT;
            }
            i2 |= i5;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var3.h(vt4Var)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        }
        int i11 = i2;
        if ((599187 & i11) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var3.U(i11 & 1, z)) {
            qg6 a2 = tg6.a(0, 3, rv4Var3);
            if (ujaVar.h) {
                rv4Var3.e0(-868184689);
                i3 = 1;
                rv4Var2 = rv4Var3;
                z2 = false;
                ej6.b(a2, 10, vt4Var, rv4Var2, ((i11 >> 12) & 896) | 48, 0);
                rv4Var2.q(false);
            } else {
                i3 = 1;
                rv4Var2 = rv4Var3;
                z2 = false;
                rv4Var2.e0(-868103965);
                rv4Var2.q(false);
            }
            int i12 = ujaVar.c;
            if (i12 != 0) {
                if (i12 != i3) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            rv4Var2.e0(-866522717);
                            rv4Var2.q(z2);
                            rv4Var3 = rv4Var2;
                        } else {
                            rv4Var2.e0(-866861175);
                            int i13 = i11 << 3;
                            int i14 = (i11 & 14) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13) | (3670016 & i13);
                            rv4Var3 = rv4Var2;
                            j(ujaVar, a2, rh8Var, bkdVar, nq7Var, xt4Var, xt4Var2, rv4Var3, i14);
                            rv4Var3.q(z2);
                        }
                    } else {
                        rv4Var2.e0(-867248055);
                        int i15 = i11 << 3;
                        rv4Var3 = rv4Var2;
                        i(ujaVar, a2, rh8Var, bkdVar, nq7Var, xt4Var, xt4Var2, rv4Var3, (i11 & 14) | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | (i15 & 3670016));
                        rv4Var3.q(z2);
                    }
                } else {
                    rv4Var2.e0(-867634935);
                    int i16 = i11 << 3;
                    rv4Var3 = rv4Var2;
                    g(ujaVar, a2, rh8Var, bkdVar, nq7Var, xt4Var, xt4Var2, rv4Var3, (i11 & 14) | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (458752 & i16) | (i16 & 3670016));
                    rv4Var3.q(z2);
                }
            } else {
                rv4Var2.e0(-868021815);
                int i17 = i11 << 3;
                rv4Var3 = rv4Var2;
                f(ujaVar, a2, rh8Var, bkdVar, nq7Var, xt4Var, xt4Var2, rv4Var3, (i11 & 14) | (i17 & 896) | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (i17 & 3670016));
                rv4Var3.q(z2);
            }
        } else {
            rv4Var3.X();
        }
        ek9 u = rv4Var3.u();
        if (u != null) {
            u.d = new i81((Object) ujaVar, (Object) rh8Var, (Object) bkdVar, (Object) nq7Var, xt4Var, (hu4) xt4Var2, (hu4) vt4Var, i, 10);
        }
    }

    public static final void i(uja ujaVar, qg6 qg6Var, rh8 rh8Var, bkd bkdVar, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        nq7 nq7Var2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        rv4Var.g0(2033667045);
        if ((i & 6) == 0) {
            if (rv4Var.f(ujaVar)) {
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
            if (rv4Var.f(bkdVar)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            nq7Var2 = nq7Var;
            if (rv4Var.f(nq7Var2)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        } else {
            nq7Var2 = nq7Var;
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
        boolean z4 = false;
        if ((599187 & i2) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            f25 f25Var = new f25(dce.n(ujaVar.d, 180, 400));
            hz hzVar = new hz(8.0f, true, new vs(2));
            hz hzVar2 = new hz(8.0f, true, new vs(2));
            if ((i2 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((458752 & i2) == 131072) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = z2 | z3;
            if ((3670016 & i2) == 1048576) {
                z4 = true;
            }
            boolean z6 = z5 | z4;
            Object P = rv4Var.P();
            if (z6 || P == ax1.a) {
                P = new nja(ujaVar, xt4Var, xt4Var2, 3);
                rv4Var.o0(P);
            }
            int i10 = i2 << 3;
            pc2.d(f25Var, nq7Var2, qg6Var, rh8Var, hzVar2, hzVar, null, false, 0L, 0L, bkdVar, nae.e, (xt4) P, rv4Var, ((i2 >> 9) & Token.ASSIGN_MOD) | 1769472 | (i10 & 896) | (i10 & 7168), (i2 >> 6) & Token.ASSIGN_MOD, 6032);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new oja(ujaVar, qg6Var, rh8Var, bkdVar, nq7Var, xt4Var, xt4Var2, i, 3);
        }
    }

    public static final void j(uja ujaVar, qg6 qg6Var, rh8 rh8Var, bkd bkdVar, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        nq7 nq7Var2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        rv4Var.g0(1331071206);
        if ((i & 6) == 0) {
            if (rv4Var.f(ujaVar)) {
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
            if (rv4Var.f(bkdVar)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            nq7Var2 = nq7Var;
            if (rv4Var.f(nq7Var2)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        } else {
            nq7Var2 = nq7Var;
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
        boolean z4 = false;
        if ((599187 & i2) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            f25 f25Var = new f25(dce.n(ujaVar.d, 150, 400));
            hz hzVar = new hz(8.0f, true, new vs(2));
            hz hzVar2 = new hz(8.0f, true, new vs(2));
            if ((i2 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((458752 & i2) == 131072) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = z2 | z3;
            if ((3670016 & i2) == 1048576) {
                z4 = true;
            }
            boolean z6 = z5 | z4;
            Object P = rv4Var.P();
            if (z6 || P == ax1.a) {
                P = new nja(ujaVar, xt4Var, xt4Var2, 1);
                rv4Var.o0(P);
            }
            int i10 = i2 << 3;
            pc2.d(f25Var, nq7Var2, qg6Var, rh8Var, hzVar2, hzVar, null, false, 0L, 0L, bkdVar, nae.e, (xt4) P, rv4Var, ((i2 >> 9) & Token.ASSIGN_MOD) | 1769472 | (i10 & 896) | (i10 & 7168), (i2 >> 6) & Token.ASSIGN_MOD, 6032);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new oja(ujaVar, qg6Var, rh8Var, bkdVar, nq7Var, xt4Var, xt4Var2, i, 1);
        }
    }

    public static final void k(uja ujaVar, boolean z, rh8 rh8Var, bkd bkdVar, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        rv4 rv4Var2 = rv4Var;
        ujaVar.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        vt4Var.getClass();
        rv4Var2.g0(1742015156);
        if ((i & 6) == 0) {
            if (rv4Var2.f(ujaVar)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.f(rh8Var)) {
                i9 = 256;
            } else {
                i9 = Token.CASE;
            }
            i2 |= i9;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.f(bkdVar)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        }
        if ((i & 24576) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i2 |= i7;
        }
        if ((196608 & i) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i6 = 131072;
            } else {
                i6 = Parser.ARGC_LIMIT;
            }
            i2 |= i6;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var2.h(xt4Var2)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i2 |= i4;
        }
        if ((100663296 & i) == 0) {
            if (rv4Var2.h(vt4Var2)) {
                i3 = 67108864;
            } else {
                i3 = 33554432;
            }
            i2 |= i3;
        }
        if ((38347907 & i2) != 38347906) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i2 & 1, z2)) {
            if (ujaVar.a) {
                rv4Var2.e0(284020387);
                rv4Var2.q(false);
            } else if (ujaVar.b.isEmpty()) {
                rv4Var2.e0(284092338);
                jxe.d(owe.F(rv4Var2), yqe.A((y3b) o2b.A0.getValue(), rv4Var2), yqe.A((y3b) o2b.B0.getValue(), rv4Var2), zbe.x(pna.c, rh8Var), yqe.A((y3b) o2b.T.getValue(), rv4Var2), vt4Var, rv4Var2, (i2 >> 6) & 458752, 0);
                rv4Var2 = rv4Var2;
                rv4Var2.q(false);
            } else {
                int i11 = i2;
                rv4Var2.e0(284526803);
                int i12 = i11 >> 3;
                h(ujaVar, rh8Var, bkdVar, nq7Var, xt4Var, xt4Var2, vt4Var2, rv4Var2, (i11 & 14) | (i12 & Token.ASSIGN_MOD) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752) | (3670016 & (i11 >> 6)));
                rv4Var2.q(false);
            }
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new pja(ujaVar, z, rh8Var, bkdVar, nq7Var, xt4Var, xt4Var2, vt4Var, vt4Var2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(long r21, final float r23, int r24, defpackage.nq7 r25, defpackage.rv4 r26, int r27, int r28) {
        /*
            r3 = r26
            r0 = 729509429(0x2b7b6e35, float:8.9326056E-13)
            r3.g0(r0)
            r0 = r28 & 1
            if (r0 != 0) goto L16
            r0 = r21
            boolean r2 = r3.e(r0)
            if (r2 == 0) goto L18
            r2 = 4
            goto L19
        L16:
            r0 = r21
        L18:
            r2 = 2
        L19:
            r2 = r27 | r2
            r2 = r2 | 384(0x180, float:5.38E-43)
            r4 = r2 & 1171(0x493, float:1.641E-42)
            r5 = 1170(0x492, float:1.64E-42)
            r6 = 1
            if (r4 == r5) goto L26
            r4 = r6
            goto L27
        L26:
            r4 = 0
        L27:
            r2 = r2 & r6
            boolean r2 = r3.U(r2, r4)
            if (r2 == 0) goto L78
            r3.Z()
            r2 = r27 & 1
            if (r2 == 0) goto L43
            boolean r2 = r3.B()
            if (r2 == 0) goto L3c
            goto L43
        L3c:
            r3.X()
            r8 = r24
        L41:
            r11 = r0
            goto L56
        L43:
            r2 = r28 & 1
            if (r2 == 0) goto L53
            tza r0 = defpackage.j27.a
            java.lang.Object r0 = r3.j(r0)
            h27 r0 = (defpackage.h27) r0
            pm1 r0 = r0.a
            long r0 = r0.a
        L53:
            r2 = 3
            r8 = r2
            goto L41
        L56:
            r3.r()
            av5 r9 = defpackage.qye.n(r6, r3)
            nfd r7 = new nfd
            r10 = r23
            r7.<init>()
            r0 = 1768622495(0x696b099f, float:1.7758938E25)
            tu1 r2 = defpackage.jce.E(r0, r7, r3)
            r4 = 3078(0xc06, float:4.313E-42)
            r5 = 6
            r1 = 0
            r0 = r25
            defpackage.hc2.b(r0, r1, r2, r3, r4, r5)
            r17 = r8
            r14 = r11
            goto L7e
        L78:
            r26.X()
            r17 = r24
            r14 = r0
        L7e:
            ek9 r0 = r26.u()
            if (r0 == 0) goto L93
            vb3 r13 = new vb3
            r16 = r23
            r18 = r25
            r19 = r27
            r20 = r28
            r13.<init>(r14, r16, r17, r18, r19, r20)
            r0.d = r13
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl1.l(long, float, int, nq7, rv4, int, int):void");
    }

    public static ArrayList m(Object... objArr) {
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new oz(objArr, true));
    }

    public static int n(xt4 xt4Var, List list, int i) {
        list.getClass();
        F(list.size(), i);
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int intValue = ((Number) xt4Var.invoke(list.get(i4))).intValue();
            if (intValue < 0) {
                i3 = i4 + 1;
            } else if (intValue > 0) {
                i2 = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i3 + 1);
    }

    public static int o(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        F(arrayList.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int j = hxe.j((Comparable) arrayList.get(i3), comparable);
            if (j < 0) {
                i2 = i3 + 1;
            } else if (j > 0) {
                i = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public static final lj9 p(yma ymaVar) {
        ymaVar.getClass();
        return new lj9(ymaVar);
    }

    public static final mj9 q(osa osaVar) {
        osaVar.getClass();
        return new mj9(osaVar);
    }

    public static jq6 r(List list) {
        list.getClass();
        jq6 jq6Var = (jq6) list;
        jq6Var.f();
        jq6Var.c = true;
        if (jq6Var.b > 0) {
            return jq6Var;
        }
        return jq6.d;
    }

    public static int s(Iterable iterable, int i) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i;
    }

    public static jq6 t() {
        return new jq6(10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v26, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v50, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r122v0, types: [xt4] */
    /* JADX WARN: Type inference failed for: r12v33, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v34, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v38, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v21, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v26, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v31, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v41, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v22, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [en1] */
    /* JADX WARN: Type inference failed for: r1v26, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v35, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v40, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v44, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v46, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v48, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v49, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v52, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v53, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v67, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v71, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v73, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v66, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v157, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v161, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v33, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v38, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v40, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v42, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v43, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v47, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v52, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v57, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v61, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v62, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v63, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v95, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v62, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v72, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v76, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v73, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v77, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v79, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v88, types: [km3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v22, types: [km3, java.lang.Object] */
    public static final pm1 u(long j, boolean z, boolean z2, dl8 dl8Var, double d, xm1 xm1Var, rm3 rm3Var, xt4 xt4Var) {
        b4d b4dVar;
        b4d b4dVar2;
        b4d b4dVar3;
        b4d b4dVar4;
        b4d b4dVar5;
        b4d b4dVar6;
        sm3 sm3Var;
        mn1 mn1Var;
        mn1 mn1Var2;
        mn1 mn1Var3;
        mn1 mn1Var4;
        mn1 mn1Var5;
        mn1 mn1Var6;
        b4d b4dVar7;
        mn1 mn1Var7;
        mn1 mn1Var8;
        mn1 mn1Var9;
        mn1 mn1Var10;
        mn1 mn1Var11;
        mn1 mn1Var12;
        xm1 xm1Var2;
        mn1 mn1Var13;
        mn1 mn1Var14;
        mn1 mn1Var15;
        mn1 mn1Var16;
        mn1 mn1Var17;
        mn1 mn1Var18;
        mn1 mn1Var19;
        mn1 mn1Var20;
        mn1 mn1Var21;
        mn1 mn1Var22;
        mn1 mn1Var23;
        mn1 mn1Var24;
        mn1 mn1Var25;
        mn1 mn1Var26;
        mn1 mn1Var27;
        mn1 mn1Var28;
        mn1 mn1Var29;
        mn1 mn1Var30;
        mn1 mn1Var31;
        mn1 mn1Var32;
        mn1 mn1Var33;
        mn1 mn1Var34;
        mn1 mn1Var35;
        mn1 mn1Var36;
        mn1 mn1Var37;
        mn1 mn1Var38;
        mn1 mn1Var39;
        mn1 mn1Var40;
        mn1 mn1Var41;
        mn1 mn1Var42;
        mn1 mn1Var43;
        mn1 mn1Var44;
        mn1 mn1Var45;
        mn1 mn1Var46;
        mn1 mn1Var47;
        mn1 mn1Var48;
        b4d b4dVar8;
        long D;
        long e;
        long D2;
        long D3;
        pm1 pm1Var;
        mn1 mn1Var49;
        mn1 mn1Var50;
        mn1 mn1Var51;
        mn1 mn1Var52;
        mn1 mn1Var53;
        mn1 mn1Var54;
        dl8Var.getClass();
        xm1Var.getClass();
        rm3Var.getClass();
        mn1 mn1Var55 = ube.b;
        ?? r1 = ube.a;
        i45 i45Var = new i45(sve.x(j));
        int ordinal = dl8Var.ordinal();
        b4d b4dVar9 = b4d.c;
        b4d b4dVar10 = b4d.b;
        b4d b4dVar11 = b4d.d;
        b4d b4dVar12 = b4d.e;
        b4d b4dVar13 = b4d.D;
        b4d b4dVar14 = b4d.E;
        b4d b4dVar15 = b4d.a;
        b4d b4dVar16 = b4d.f;
        b4d b4dVar17 = b4d.C;
        xm1 xm1Var3 = xm1.d;
        switch (ordinal) {
            case 0:
                b4dVar = b4dVar11;
                b4dVar2 = b4dVar12;
                b4dVar3 = b4dVar13;
                b4dVar4 = b4dVar14;
                b4dVar5 = b4dVar15;
                b4dVar6 = b4dVar16;
                if (xm1Var == xm1Var3) {
                    mn1Var = mn1Var55;
                } else {
                    mn1Var = r1;
                }
                kfc h = mn1Var.h(b4dVar9, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var2 = mn1Var55;
                } else {
                    mn1Var2 = r1;
                }
                kfc i = mn1Var2.i(b4dVar9, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var3 = mn1Var55;
                } else {
                    mn1Var3 = r1;
                }
                kfc j2 = mn1Var3.j(b4dVar9, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var4 = mn1Var55;
                } else {
                    mn1Var4 = r1;
                }
                kfc f = mn1Var4.f(b4dVar9, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var5 = mn1Var55;
                } else {
                    mn1Var5 = r1;
                }
                kfc g = mn1Var5.g(b4dVar9, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var6 = mn1Var55;
                } else {
                    mn1Var6 = r1;
                }
                sm3Var = new sm3(i45Var, b4dVar9, z, d, rm3Var, xm1Var, h, i, j2, f, g, mn1Var6.d(b4dVar9, i45Var, z, rm3Var, d));
                b4dVar7 = b4dVar9;
                break;
            case 1:
                b4dVar = b4dVar11;
                b4dVar2 = b4dVar12;
                b4dVar3 = b4dVar13;
                b4dVar4 = b4dVar14;
                b4dVar5 = b4dVar15;
                b4dVar6 = b4dVar16;
                if (xm1Var == xm1Var3) {
                    mn1Var7 = mn1Var55;
                } else {
                    mn1Var7 = r1;
                }
                kfc h2 = mn1Var7.h(b4dVar10, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var8 = mn1Var55;
                } else {
                    mn1Var8 = r1;
                }
                kfc i2 = mn1Var8.i(b4dVar10, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var9 = mn1Var55;
                } else {
                    mn1Var9 = r1;
                }
                kfc j3 = mn1Var9.j(b4dVar10, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var10 = mn1Var55;
                } else {
                    mn1Var10 = r1;
                }
                kfc f2 = mn1Var10.f(b4dVar10, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var11 = mn1Var55;
                } else {
                    mn1Var11 = r1;
                }
                kfc g2 = mn1Var11.g(b4dVar10, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var12 = mn1Var55;
                } else {
                    mn1Var12 = r1;
                }
                xm1Var2 = xm1Var;
                sm3Var = new sm3(i45Var, b4dVar10, z, d, rm3Var, xm1Var2, h2, i2, j3, f2, g2, mn1Var12.d(b4dVar10, i45Var, z, rm3Var, d));
                b4dVar10 = b4dVar10;
                b4dVar7 = b4dVar9;
                break;
            case 2:
                b4dVar2 = b4dVar12;
                b4dVar3 = b4dVar13;
                b4dVar4 = b4dVar14;
                b4dVar5 = b4dVar15;
                b4dVar6 = b4dVar16;
                if (xm1Var == xm1Var3) {
                    mn1Var13 = mn1Var55;
                } else {
                    mn1Var13 = r1;
                }
                kfc h3 = mn1Var13.h(b4dVar11, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var14 = mn1Var55;
                } else {
                    mn1Var14 = r1;
                }
                kfc i3 = mn1Var14.i(b4dVar11, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var15 = mn1Var55;
                } else {
                    mn1Var15 = r1;
                }
                kfc j4 = mn1Var15.j(b4dVar11, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var16 = mn1Var55;
                } else {
                    mn1Var16 = r1;
                }
                kfc f3 = mn1Var16.f(b4dVar11, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var17 = mn1Var55;
                } else {
                    mn1Var17 = r1;
                }
                kfc g3 = mn1Var17.g(b4dVar11, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var18 = mn1Var55;
                } else {
                    mn1Var18 = r1;
                }
                xm1Var2 = xm1Var;
                sm3Var = new sm3(i45Var, b4dVar11, z, d, rm3Var, xm1Var2, h3, i3, j4, f3, g3, mn1Var18.d(b4dVar11, i45Var, z, rm3Var, d));
                b4dVar = b4dVar11;
                b4dVar7 = b4dVar9;
                break;
            case 3:
                b4dVar3 = b4dVar13;
                b4dVar4 = b4dVar14;
                b4dVar5 = b4dVar15;
                b4dVar6 = b4dVar16;
                if (xm1Var == xm1Var3) {
                    mn1Var19 = mn1Var55;
                } else {
                    mn1Var19 = r1;
                }
                kfc h4 = mn1Var19.h(b4dVar12, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var20 = mn1Var55;
                } else {
                    mn1Var20 = r1;
                }
                kfc i4 = mn1Var20.i(b4dVar12, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var21 = mn1Var55;
                } else {
                    mn1Var21 = r1;
                }
                kfc j5 = mn1Var21.j(b4dVar12, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var22 = mn1Var55;
                } else {
                    mn1Var22 = r1;
                }
                kfc f4 = mn1Var22.f(b4dVar12, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var23 = mn1Var55;
                } else {
                    mn1Var23 = r1;
                }
                kfc g4 = mn1Var23.g(b4dVar12, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var24 = mn1Var55;
                } else {
                    mn1Var24 = r1;
                }
                sm3Var = new sm3(i45Var, b4dVar12, z, d, rm3Var, xm1Var, h4, i4, j5, f4, g4, mn1Var24.d(b4dVar12, i45Var, z, rm3Var, d));
                b4dVar2 = b4dVar12;
                b4dVar7 = b4dVar9;
                b4dVar = b4dVar11;
                break;
            case 4:
                b4dVar4 = b4dVar14;
                b4dVar5 = b4dVar15;
                b4dVar6 = b4dVar16;
                if (xm1Var == xm1Var3) {
                    mn1Var25 = mn1Var55;
                } else {
                    mn1Var25 = r1;
                }
                kfc h5 = mn1Var25.h(b4dVar13, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var26 = mn1Var55;
                } else {
                    mn1Var26 = r1;
                }
                kfc i5 = mn1Var26.i(b4dVar13, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var27 = mn1Var55;
                } else {
                    mn1Var27 = r1;
                }
                kfc j6 = mn1Var27.j(b4dVar13, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var28 = mn1Var55;
                } else {
                    mn1Var28 = r1;
                }
                kfc f5 = mn1Var28.f(b4dVar13, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var29 = mn1Var55;
                } else {
                    mn1Var29 = r1;
                }
                kfc g5 = mn1Var29.g(b4dVar13, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var30 = mn1Var55;
                } else {
                    mn1Var30 = r1;
                }
                sm3Var = new sm3(i45Var, b4dVar13, z, d, rm3Var, xm1Var, h5, i5, j6, f5, g5, mn1Var30.d(b4dVar13, i45Var, z, rm3Var, d));
                b4dVar3 = b4dVar13;
                b4dVar7 = b4dVar9;
                b4dVar = b4dVar11;
                b4dVar2 = b4dVar12;
                break;
            case 5:
                b4dVar5 = b4dVar15;
                b4dVar6 = b4dVar16;
                if (xm1Var == xm1Var3) {
                    mn1Var31 = mn1Var55;
                } else {
                    mn1Var31 = r1;
                }
                kfc h6 = mn1Var31.h(b4dVar14, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var32 = mn1Var55;
                } else {
                    mn1Var32 = r1;
                }
                kfc i6 = mn1Var32.i(b4dVar14, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var33 = mn1Var55;
                } else {
                    mn1Var33 = r1;
                }
                kfc j7 = mn1Var33.j(b4dVar14, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var34 = mn1Var55;
                } else {
                    mn1Var34 = r1;
                }
                kfc f6 = mn1Var34.f(b4dVar14, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var35 = mn1Var55;
                } else {
                    mn1Var35 = r1;
                }
                kfc g6 = mn1Var35.g(b4dVar14, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var36 = mn1Var55;
                } else {
                    mn1Var36 = r1;
                }
                sm3Var = new sm3(i45Var, b4dVar14, z, d, rm3Var, xm1Var, h6, i6, j7, f6, g6, mn1Var36.d(b4dVar14, i45Var, z, rm3Var, d));
                b4dVar4 = b4dVar14;
                b4dVar7 = b4dVar9;
                b4dVar = b4dVar11;
                b4dVar2 = b4dVar12;
                b4dVar3 = b4dVar13;
                break;
            case 6:
                b4dVar6 = b4dVar16;
                if (xm1Var == xm1Var3) {
                    mn1Var37 = mn1Var55;
                } else {
                    mn1Var37 = r1;
                }
                kfc h7 = mn1Var37.h(b4dVar15, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var38 = mn1Var55;
                } else {
                    mn1Var38 = r1;
                }
                kfc i7 = mn1Var38.i(b4dVar15, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var39 = mn1Var55;
                } else {
                    mn1Var39 = r1;
                }
                kfc j8 = mn1Var39.j(b4dVar15, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var40 = mn1Var55;
                } else {
                    mn1Var40 = r1;
                }
                kfc f7 = mn1Var40.f(b4dVar15, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var41 = mn1Var55;
                } else {
                    mn1Var41 = r1;
                }
                kfc g7 = mn1Var41.g(b4dVar15, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var42 = mn1Var55;
                } else {
                    mn1Var42 = r1;
                }
                sm3Var = new sm3(i45Var, b4dVar15, z, d, rm3Var, xm1Var, h7, i7, j8, f7, g7, mn1Var42.d(b4dVar15, i45Var, z, rm3Var, d));
                b4dVar5 = b4dVar15;
                b4dVar7 = b4dVar9;
                b4dVar = b4dVar11;
                b4dVar2 = b4dVar12;
                b4dVar3 = b4dVar13;
                b4dVar4 = b4dVar14;
                break;
            case 7:
                if (xm1Var == xm1Var3) {
                    mn1Var43 = mn1Var55;
                } else {
                    mn1Var43 = r1;
                }
                kfc h8 = mn1Var43.h(b4dVar16, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var44 = mn1Var55;
                } else {
                    mn1Var44 = r1;
                }
                kfc i8 = mn1Var44.i(b4dVar16, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var45 = mn1Var55;
                } else {
                    mn1Var45 = r1;
                }
                kfc j9 = mn1Var45.j(b4dVar16, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var46 = mn1Var55;
                } else {
                    mn1Var46 = r1;
                }
                kfc f8 = mn1Var46.f(b4dVar16, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var47 = mn1Var55;
                } else {
                    mn1Var47 = r1;
                }
                kfc g8 = mn1Var47.g(b4dVar16, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var48 = mn1Var55;
                } else {
                    mn1Var48 = r1;
                }
                sm3Var = new sm3(i45Var, b4dVar16, z, d, rm3Var, xm1Var, h8, i8, j9, f8, g8, mn1Var48.d(b4dVar16, i45Var, z, rm3Var, d));
                b4dVar6 = b4dVar16;
                b4dVar7 = b4dVar9;
                b4dVar = b4dVar11;
                b4dVar2 = b4dVar12;
                b4dVar3 = b4dVar13;
                b4dVar4 = b4dVar14;
                b4dVar5 = b4dVar15;
                break;
            case 8:
                if (xm1Var == xm1Var3) {
                    mn1Var49 = mn1Var55;
                } else {
                    mn1Var49 = r1;
                }
                kfc h9 = mn1Var49.h(b4dVar17, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var50 = mn1Var55;
                } else {
                    mn1Var50 = r1;
                }
                kfc i9 = mn1Var50.i(b4dVar17, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var51 = mn1Var55;
                } else {
                    mn1Var51 = r1;
                }
                kfc j10 = mn1Var51.j(b4dVar17, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var52 = mn1Var55;
                } else {
                    mn1Var52 = r1;
                }
                kfc f9 = mn1Var52.f(b4dVar17, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var53 = mn1Var55;
                } else {
                    mn1Var53 = r1;
                }
                kfc g9 = mn1Var53.g(b4dVar17, i45Var, z, rm3Var, d);
                if (xm1Var == xm1Var3) {
                    mn1Var54 = mn1Var55;
                } else {
                    mn1Var54 = r1;
                }
                sm3Var = new sm3(i45Var, b4dVar17, z, d, rm3Var, xm1Var, h9, i9, j10, f9, g9, mn1Var54.d(b4dVar17, i45Var, z, rm3Var, d));
                b4dVar7 = b4dVar9;
                b4dVar = b4dVar11;
                b4dVar2 = b4dVar12;
                b4dVar3 = b4dVar13;
                b4dVar4 = b4dVar14;
                b4dVar5 = b4dVar15;
                b4dVar6 = b4dVar16;
                break;
            default:
                xk5.o();
                return null;
        }
        i45 i45Var2 = new i45(sve.x(j));
        switch (dl8Var.ordinal()) {
            case 0:
                b4dVar8 = b4dVar7;
                break;
            case 1:
                b4dVar8 = b4dVar10;
                break;
            case 2:
                b4dVar8 = b4dVar;
                break;
            case 3:
                b4dVar8 = b4dVar2;
                break;
            case 4:
                b4dVar8 = b4dVar3;
                break;
            case 5:
                b4dVar8 = b4dVar4;
                break;
            case 6:
                b4dVar8 = b4dVar5;
                break;
            case 7:
                b4dVar8 = b4dVar6;
                break;
            case 8:
                b4dVar8 = b4dVar17;
                break;
            default:
                xk5.o();
                return null;
        }
        sm3 sm3Var2 = new sm3(i45Var2, b4dVar8, z, d, sm3Var.e, sm3Var.f, sm3Var.g, sm3Var.h, sm3Var.i, rm3Var, xm1Var, sm3Var.k);
        mn1 mn1Var56 = hc2.d;
        if (z2 && z) {
            D = zl1.b;
        } else {
            D = oue.D(mn1Var56.a(), sm3Var2);
        }
        long j11 = D;
        long D4 = oue.D(mn1Var56.b(), sm3Var2);
        long D5 = oue.D(mn1Var56.c(), sm3Var2);
        ?? obj = new Object();
        obj.a = "inverse_on_surface";
        obj.b = new in1(14);
        obj.f = new in1(15);
        obj.h = new in1(16);
        lm3 a2 = obj.a();
        ?? obj2 = new Object();
        obj2.a = "inverse_on_surface";
        obj2.b = new cn1(8);
        obj2.c = new cn1(9);
        obj2.f = new cn1(10);
        obj2.h = new cn1(11);
        long e2 = nk2.e(obj2, a2, sm3Var2);
        ?? obj3 = new Object();
        obj3.a = "inverse_primary";
        obj3.b = new in1(3);
        obj3.c = new in1(4);
        obj3.f = new in1(5);
        obj3.h = new in1(6);
        lm3 a3 = obj3.a();
        ?? obj4 = new Object();
        obj4.a = "inverse_primary";
        obj4.b = new dn1(7);
        obj4.c = new dn1(8);
        obj4.f = new dn1(9);
        obj4.h = new dn1(10);
        long e3 = nk2.e(obj4, a3, sm3Var2);
        long D6 = oue.D(mn1Var56.m(), sm3Var2);
        if (z2 && z) {
            e = zl1.e;
        } else {
            km3 b2 = mn1Var56.D().b();
            b2.a = "on_background";
            b2.c = new fn1(14);
            lm3 a4 = b2.a();
            ?? obj5 = new Object();
            obj5.a = "on_background";
            obj5.b = new bn1(27);
            obj5.c = new bn1(28);
            obj5.f = new bn1(29);
            obj5.h = new cn1(0);
            e = nk2.e(obj5, a4, sm3Var2);
        }
        long j12 = e;
        ?? obj6 = new Object();
        obj6.a = "on_error";
        obj6.b = new fn1(23);
        obj6.f = new fn1(24);
        obj6.h = new fn1(25);
        lm3 a5 = obj6.a();
        ?? obj7 = new Object();
        obj7.a = "on_error";
        obj7.b = new bn1(16);
        obj7.c = new bn1(17);
        obj7.f = new bn1(18);
        obj7.h = new bn1(19);
        long e4 = nk2.e(obj7, a5, sm3Var2);
        ?? obj8 = new Object();
        obj8.a = "on_error_container";
        obj8.b = new kn1(24);
        obj8.f = new kn1(25);
        obj8.h = new kn1(26);
        lm3 a6 = obj8.a();
        ?? obj9 = new Object();
        obj9.a = "on_error_container";
        obj9.b = new an1(0);
        obj9.c = new an1(1);
        obj9.f = new an1(2);
        obj9.h = new an1(3);
        long e5 = nk2.e(obj9, a6, sm3Var2);
        ?? obj10 = new Object();
        obj10.a = "on_primary";
        obj10.b = new fn1(10);
        obj10.f = new fn1(11);
        obj10.h = new fn1(12);
        lm3 a7 = obj10.a();
        ?? obj11 = new Object();
        obj11.a = "on_primary";
        obj11.b = new cn1(16);
        obj11.c = new cn1(17);
        obj11.f = new cn1(18);
        obj11.h = new cn1(19);
        long e6 = nk2.e(obj11, a7, sm3Var2);
        ?? obj12 = new Object();
        obj12.a = "on_primary_container";
        obj12.b = new dn1(28);
        obj12.f = new dn1(29);
        obj12.h = new fn1(0);
        lm3 a8 = obj12.a();
        ?? obj13 = new Object();
        obj13.a = "on_primary_container";
        obj13.b = new cn1(2);
        obj13.c = new cn1(3);
        obj13.f = new cn1(4);
        obj13.h = new cn1(5);
        long e7 = nk2.e(obj13, a8, sm3Var2);
        ?? obj14 = new Object();
        obj14.a = "on_secondary";
        obj14.b = new fn1(27);
        obj14.f = new hn1(8);
        obj14.h = new hn1(16);
        lm3 a9 = obj14.a();
        ?? obj15 = new Object();
        obj15.a = "on_secondary";
        obj15.b = new dn1(11);
        obj15.c = new dn1(13);
        obj15.f = new dn1(14);
        obj15.h = new dn1(15);
        long e8 = nk2.e(obj15, a9, sm3Var2);
        ?? obj16 = new Object();
        obj16.a = "on_secondary_container";
        obj16.b = new in1(17);
        obj16.f = new in1(18);
        obj16.h = new in1(19);
        lm3 a10 = obj16.a();
        ?? obj17 = new Object();
        obj17.a = "on_secondary_container";
        obj17.b = new dn1(3);
        obj17.c = new dn1(4);
        obj17.f = new dn1(5);
        obj17.h = new dn1(6);
        long e9 = nk2.e(obj17, a10, sm3Var2);
        if (z2 && z) {
            D2 = zl1.e;
        } else {
            D2 = oue.D(mn1Var56.D(), sm3Var2);
        }
        long j13 = D2;
        ?? obj18 = new Object();
        obj18.a = "on_surface_variant";
        obj18.b = new fn1(5);
        obj18.e = new fn1(6);
        obj18.f = new fn1(7);
        obj18.h = new fn1(8);
        lm3 a11 = obj18.a();
        ?? obj19 = new Object();
        obj19.a = "on_surface_variant";
        obj19.b = new an1(16);
        obj19.c = new an1(17);
        obj19.f = new m0(1, mn1Var56, en1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 13);
        obj19.h = new an1(18);
        long e10 = nk2.e(obj19, a11, sm3Var2);
        ?? obj20 = new Object();
        obj20.a = "on_tertiary";
        obj20.b = new dn1(25);
        obj20.f = new dn1(26);
        obj20.h = new dn1(27);
        lm3 a12 = obj20.a();
        ?? obj21 = new Object();
        obj21.a = "on_tertiary";
        obj21.b = new an1(12);
        obj21.c = new an1(13);
        obj21.f = new an1(14);
        obj21.h = new an1(15);
        long e11 = nk2.e(obj21, a12, sm3Var2);
        ?? obj22 = new Object();
        obj22.a = "on_tertiary_container";
        obj22.b = new in1(23);
        obj22.f = new in1(24);
        obj22.h = new in1(25);
        lm3 a13 = obj22.a();
        ?? obj23 = new Object();
        obj23.a = "on_tertiary_container";
        obj23.b = new zm1(26);
        obj23.c = new zm1(27);
        obj23.f = new zm1(28);
        obj23.h = new zm1(29);
        long e12 = nk2.e(obj23, a13, sm3Var2);
        ?? obj24 = new Object();
        obj24.a = "outline";
        obj24.b = new ln1(1);
        obj24.e = new ln1(2);
        obj24.f = new ln1(3);
        obj24.h = new ln1(4);
        lm3 a14 = obj24.a();
        ?? obj25 = new Object();
        obj25.a = "outline";
        obj25.b = new cn1(23);
        obj25.c = new cn1(24);
        obj25.f = new m0(1, mn1Var56, en1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 14);
        obj25.h = new cn1(25);
        long e13 = nk2.e(obj25, a14, sm3Var2);
        ?? obj26 = new Object();
        obj26.a = "outline_variant";
        obj26.b = new fn1(26);
        obj26.e = new fn1(28);
        obj26.f = new fn1(29);
        obj26.h = new hn1(0);
        lm3 a15 = obj26.a();
        ?? obj27 = new Object();
        obj27.a = "outline_variant";
        obj27.b = new an1(29);
        obj27.c = new bn1(0);
        obj27.f = new m0(1, mn1Var56, en1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 15);
        obj27.h = new bn1(2);
        long e14 = nk2.e(obj27, a15, sm3Var2);
        long D7 = oue.D(mn1Var56.o(), sm3Var2);
        long D8 = oue.D(mn1Var56.p(), sm3Var2);
        ?? obj28 = new Object();
        obj28.a = "scrim";
        obj28.b = new v71(19);
        obj28.c = new bn1(1);
        long D9 = oue.D(obj28.a(), sm3Var2);
        long D10 = oue.D(mn1Var56.s(), sm3Var2);
        long D11 = oue.D(mn1Var56.t(), sm3Var2);
        if (z2 && z) {
            D3 = zl1.b;
        } else {
            D3 = oue.D(mn1Var56.G(), sm3Var2);
        }
        km3 b3 = mn1Var56.o().b();
        b3.a = "surface_tint";
        lm3 a16 = b3.a();
        ?? obj29 = new Object();
        obj29.a = "surface_tint";
        obj29.b = new cn1(22);
        obj29.c = new dn1(2);
        obj29.d = true;
        long e15 = nk2.e(obj29, a16, sm3Var2);
        long D12 = oue.D(mn1Var56.w(), sm3Var2);
        long D13 = oue.D(mn1Var56.x(), sm3Var2);
        ?? obj30 = new Object();
        obj30.a = "surface_container";
        obj30.b = new kn1(3);
        obj30.c = new kn1(4);
        obj30.d = true;
        obj30.e = new kn1(5);
        lm3 a17 = obj30.a();
        ?? obj31 = new Object();
        obj31.a = "surface_container";
        obj31.b = new cn1(20);
        obj31.c = new cn1(21);
        obj31.d = true;
        long e16 = nk2.e(obj31, a17, sm3Var2);
        long D14 = oue.D(mn1Var56.H(), sm3Var2);
        long D15 = oue.D(mn1Var56.I(), sm3Var2);
        ?? obj32 = new Object();
        obj32.a = "surface_container_low";
        obj32.b = new kn1(13);
        obj32.c = new kn1(14);
        obj32.d = true;
        obj32.e = new kn1(15);
        lm3 a18 = obj32.a();
        ?? obj33 = new Object();
        obj33.a = "surface_container_low";
        obj33.b = new zm1(13);
        obj33.c = new zm1(14);
        obj33.d = true;
        long e17 = nk2.e(obj33, a18, sm3Var2);
        ?? obj34 = new Object();
        obj34.a = "surface_container_lowest";
        obj34.b = new in1(12);
        obj34.c = new in1(13);
        obj34.d = true;
        lm3 a19 = obj34.a();
        ?? obj35 = new Object();
        obj35.a = "surface_container_lowest";
        obj35.b = new bn1(3);
        obj35.c = new bn1(4);
        obj35.d = true;
        long e18 = nk2.e(obj35, a19, sm3Var2);
        km3 b4 = mn1Var56.I().b();
        b4.a = "surface_variant";
        lm3 a20 = b4.a();
        ?? obj36 = new Object();
        obj36.a = "surface_variant";
        obj36.b = new cn1(1);
        obj36.c = new cn1(12);
        obj36.d = true;
        long e19 = nk2.e(obj36, a20, sm3Var2);
        long D16 = oue.D(mn1Var56.y(), sm3Var2);
        long D17 = oue.D(mn1Var56.z(), sm3Var2);
        long D18 = oue.D(mn1Var56.q(), sm3Var2);
        long D19 = oue.D(mn1Var56.r(), sm3Var2);
        ?? obj37 = new Object();
        obj37.a = "on_primary_fixed";
        obj37.b = new kn1(10);
        obj37.f = new kn1(11);
        obj37.h = new kn1(12);
        lm3 a21 = obj37.a();
        ?? obj38 = new Object();
        obj38.a = "on_primary_fixed";
        obj38.b = new an1(19);
        obj38.c = new an1(21);
        obj38.f = new an1(22);
        obj38.g = new an1(23);
        obj38.h = new an1(24);
        long e20 = nk2.e(obj38, a21, sm3Var2);
        ?? obj39 = new Object();
        obj39.a = "on_primary_fixed_variant";
        obj39.b = new fn1(1);
        obj39.f = new fn1(2);
        obj39.h = new fn1(3);
        lm3 a22 = obj39.a();
        ?? obj40 = new Object();
        obj40.a = "on_primary_fixed_variant";
        obj40.b = new zm1(1);
        obj40.c = new zm1(2);
        obj40.f = new zm1(3);
        obj40.g = new zm1(4);
        obj40.h = new zm1(5);
        long e21 = nk2.e(obj40, a22, sm3Var2);
        long D20 = oue.D(mn1Var56.u(), sm3Var2);
        long D21 = oue.D(mn1Var56.v(), sm3Var2);
        ?? obj41 = new Object();
        obj41.a = "on_secondary_fixed";
        obj41.b = new hn1(7);
        obj41.f = new hn1(9);
        obj41.h = new hn1(10);
        lm3 a23 = obj41.a();
        ?? obj42 = new Object();
        obj42.a = "on_secondary_fixed";
        obj42.b = new bn1(10);
        obj42.c = new bn1(12);
        obj42.f = new bn1(13);
        obj42.g = new bn1(14);
        obj42.h = new bn1(15);
        long e22 = nk2.e(obj42, a23, sm3Var2);
        ?? obj43 = new Object();
        obj43.a = "on_secondary_fixed_variant";
        obj43.b = new kn1(21);
        obj43.f = new kn1(22);
        obj43.h = new kn1(23);
        lm3 a24 = obj43.a();
        ?? obj44 = new Object();
        obj44.a = "on_secondary_fixed_variant";
        obj44.b = new v71(25);
        obj44.c = new v71(26);
        obj44.f = new v71(27);
        obj44.g = new v71(28);
        obj44.h = new zm1(0);
        long e23 = nk2.e(obj44, a24, sm3Var2);
        long D22 = oue.D(mn1Var56.A(), sm3Var2);
        long D23 = oue.D(mn1Var56.B(), sm3Var2);
        ?? obj45 = new Object();
        obj45.a = "on_tertiary_fixed";
        obj45.b = new fn1(4);
        obj45.f = new fn1(13);
        obj45.h = new fn1(20);
        lm3 a25 = obj45.a();
        ?? obj46 = new Object();
        obj46.a = "on_tertiary_fixed";
        obj46.b = new an1(6);
        obj46.c = new an1(7);
        obj46.f = new an1(8);
        obj46.g = new an1(10);
        obj46.h = new an1(11);
        long e24 = nk2.e(obj46, a25, sm3Var2);
        ?? obj47 = new Object();
        obj47.a = "on_tertiary_fixed_variant";
        obj47.b = new hn1(4);
        obj47.f = new hn1(5);
        obj47.h = new hn1(6);
        lm3 a26 = obj47.a();
        ?? obj48 = new Object();
        obj48.a = "on_tertiary_fixed_variant";
        obj48.b = new zm1(21);
        obj48.c = new zm1(22);
        obj48.f = new zm1(23);
        obj48.g = new zm1(24);
        obj48.h = new zm1(25);
        pm1 pm1Var2 = new pm1(D7, e6, D8, e7, e3, D10, e8, D11, e9, D16, e11, D17, e12, j11, j12, D3, j13, e19, e10, e15, D6, e2, D4, e4, D5, e5, e13, e14, D9, D12, D13, e16, D14, D15, e17, e18, D18, D19, e20, e21, D20, D21, e22, e23, D22, D23, e24, nk2.e(obj48, a26, sm3Var2));
        if (xt4Var != 0 && (pm1Var = (pm1) xt4Var.invoke(pm1Var2)) != null) {
            return pm1Var;
        }
        return pm1Var2;
    }

    public static ArrayList v(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            xl1.P(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ty5, ry5] */
    public static ty5 w(Collection collection) {
        collection.getClass();
        return new ry5(0, collection.size() - 1, 1);
    }

    public static int x(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static final int y(cw9 cw9Var) {
        cw9Var.getClass();
        iw9 h1 = cw9Var.h1("SELECT changes()");
        try {
            h1.Z0();
            int i = (int) h1.getLong(0);
            dxe.r(h1, null);
            return i;
        } finally {
        }
    }

    public static final int z(a00 a00Var, Object obj, int i) {
        int i2 = a00Var.c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int p = ipe.p(a00Var.a, i2, i);
            if (p < 0 || c16.i(obj, a00Var.b[p])) {
                return p;
            }
            int i3 = p + 1;
            while (i3 < i2 && a00Var.a[i3] == i) {
                if (c16.i(obj, a00Var.b[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = p - 1; i4 >= 0 && a00Var.a[i4] == i; i4--) {
                if (c16.i(obj, a00Var.b[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            vs.f();
            return 0;
        }
    }
}
