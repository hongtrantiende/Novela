package defpackage;

import android.database.sqlite.SQLiteDatabase;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wq9  reason: default package */
/* loaded from: classes3.dex */
public abstract class wq9 {
    public static final float[] a = new float[91];
    public static final tu1 b = new tu1(new nv1(14), false, 1437451163);
    public static final tu1 c = new tu1(new nv1(15), false, -525109986);
    public static final /* synthetic */ int[] d = {1, 2, 3, 4, 5, 6, 7};

    public static void A(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return;
        }
        cy7.k(n(i, i2, "index"));
    }

    public static void B(int i, int i2, int i3) {
        String n;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                n = hma.v("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                n = n(i2, i3, "end index");
            }
        } else {
            n = n(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(n);
    }

    public static void C(String str, boolean z) {
        if (z) {
            return;
        }
        vs.k(str);
    }

    public static void D(boolean z) {
        if (z) {
            return;
        }
        vm1.d();
    }

    public static int E(byte[] bArr) {
        byte b2 = bArr[0];
        int i = b2 & 255;
        if (i < 128) {
            return Character.toUpperCase((char) i);
        }
        if ((b2 & 224) == 192 && bArr.length >= 2) {
            return (bArr[1] & 255) | (i << 8);
        } else if ((b2 & 240) == 224 && bArr.length >= 3) {
            return (bArr[2] & 255) | (i << 16) | ((bArr[1] & 255) << 8);
        } else if ((b2 & 248) == 240 && bArr.length >= 4) {
            return (bArr[3] & 255) | (i << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
        } else {
            return i;
        }
    }

    public static kfc F(double d2, double d3) {
        i45 i;
        boolean z;
        jfc jfcVar = new jfc(d2, d3);
        int i2 = 100;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                int i4 = (i3 + i2) / 2;
                int i5 = i4 + 1;
                if (jfcVar.a(i4) < jfcVar.a(i5)) {
                    z = true;
                } else {
                    z = false;
                }
                if (jfcVar.a(i4) >= jfcVar.b - 0.01d) {
                    if (Math.abs(i3 - 50) >= Math.abs(i2 - 50)) {
                        if (i3 == i4) {
                            i = rqe.i(jfcVar.a, jfcVar.b, i3);
                            break;
                        }
                        i3 = i4;
                    } else {
                        i2 = i4;
                    }
                } else if (z) {
                    i3 = i5;
                } else {
                    i2 = i4;
                }
            } else {
                i = rqe.i(jfcVar.a, jfcVar.b, i3);
                break;
            }
        }
        return new kfc(d2, d3, i);
    }

    public static String G(int i) {
        return hl5.l("activity with result code: ", " indicating not RESULT_OK", i);
    }

    public static final s76 H(s76 s76Var) {
        s76Var.getClass();
        if (s76Var.e().c()) {
            return s76Var;
        }
        return new t68(s76Var);
    }

    public static qla I(byte[] bArr) {
        bArr.getClass();
        HashMap hashMap = new HashMap();
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if ((bArr[i2] & 255) == 255) {
                int i3 = i;
                while (i3 < i2 && bArr[i3] != 0) {
                    i3++;
                }
                pla plaVar = null;
                if (i3 < i2) {
                    String G = r4b.G(i, bArr, i3, 4);
                    if (G.length() != 0) {
                        int i4 = i3 + 1;
                        int i5 = i2 - i4;
                        int[] iArr = new int[i5];
                        for (int i6 = 0; i6 < i5; i6++) {
                            iArr[i6] = bArr[i4 + i6] & 255;
                        }
                        plaVar = new pla(G, iArr);
                    }
                }
                if (plaVar != null) {
                    Integer valueOf = Integer.valueOf(E(r4b.H(plaVar.a)));
                    Object obj = hashMap.get(valueOf);
                    if (obj == null) {
                        obj = new ArrayList();
                        hashMap.put(valueOf, obj);
                    }
                    ((List) obj).add(plaVar);
                }
                i = i2 + 1;
            }
        }
        return new qla(hashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r0 == false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:27:0x006d), top: B:58:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc A[Catch: SQLiteException -> 0x00b7, LOOP:1: B:38:0x00bc->B:43:0x00ce, LOOP_START, PHI: r1 
      PHI: (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:37:0x00ba, B:43:0x00ce] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:27:0x006d), top: B:58:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:27:0x006d), top: B:58:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void J(defpackage.ppe r10, android.database.sqlite.SQLiteDatabase r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String[] r15) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wq9.J(ppe, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    public static int[] K() {
        return (int[]) d.clone();
    }

    public static void L(ppe ppeVar, SQLiteDatabase sQLiteDatabase) {
        if (ppeVar != null) {
            s56 s56Var = ppeVar.E;
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                s56Var.e("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                s56Var.e("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                s56Var.e("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                s56Var.e("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        vs.m("Monitor must not be null");
    }

    public static final void a(String str, String str2, String str3, List list, int i, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        List<String> list2;
        boolean z2;
        ArrayList arrayList;
        boolean z3;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-848037225);
        if (rv4Var2.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (rv4Var2.f(str2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (rv4Var2.f(str3)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i10 = i9 | i5;
        if (rv4Var2.f(list)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i11 = i10 | i6;
        if (rv4Var2.h(vt4Var)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i12 = i11 | i7;
        if ((590995 & i12) != 590994) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i12 & 1, z)) {
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
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
            nq7 k = tte.k(zbe.y(pna.n(zbe.A(kq7Var, nae.e, 12.0f, 1), 56.0f), 6.0f), uu9.a);
            tza tzaVar = j27.a;
            nq7 v = nmd.v(k, ((h27) rv4Var2.j(tzaVar)).a.a, lre.g);
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new cd1(15);
                rv4Var2.o0(P);
            }
            nq7 f = lbe.f(15, (vt4) P, v, null, false);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, f);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, d2);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            do5.a(str2, null, false, null, null, null, pna.c, null, rv4Var, ((i12 >> 3) & 14) | 12582912, 894);
            rv4Var.q(true);
            nq7 A = zbe.A(zbe.C(new we6(1.0f, true), 12.0f, nae.e, nae.e, nae.e, 14), nae.e, 6.0f, 1);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int hashCode3 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p3 = lye.p(rv4Var, A);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a3);
            jce.F(npVar2, rv4Var, l3);
            s21.t(hashCode3, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p3);
            oyb oybVar = ((h27) rv4Var.j(tzaVar)).b.j;
            if ((i12 & 7168) != 2048) {
                z2 = false;
            } else {
                z2 = true;
            }
            Object P2 = rv4Var.P();
            if (!z2 && P2 != lh9Var) {
                list2 = list;
                arrayList = P2;
            } else {
                list2 = list;
                ArrayList arrayList2 = new ArrayList(tl1.s(list2, 10));
                for (String str4 : list2) {
                    arrayList2.add(new zl1(kve.v(str4)));
                }
                rv4Var.o0(arrayList2);
                arrayList = arrayList2;
            }
            ipe.g(str, kq7Var, (List) arrayList, 0L, 0L, null, 0L, 0, false, 1, 0, oybVar, rv4Var, (i12 & 14) | 48, 3072, 57336);
            cvb.c(str3, pna.f(kq7Var, 1.0f), 0L, null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 0, false, 1, 0, null, ((h27) rv4Var.j(j27.a)).b.k, rv4Var, ((i12 >> 6) & 14) | 48, 24576, 113660);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            ar5 c2 = rp5.c((wk3) ok3.I.getValue(), rv4Var2, 0);
            String A2 = yqe.A((y3b) x2b.S.getValue(), rv4Var2);
            nq7 k2 = tte.k(pna.n(kq7Var, 40.0f), uu9.a);
            if ((i12 & 3670016) == 1048576) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P3 = rv4Var2.P();
            if (z3 || P3 == lh9Var) {
                P3 = new hi7(14, vt4Var);
                rv4Var2.o0(P3);
            }
            nk5.a(c2, A2, zbe.y(lbe.f(15, (vt4) P3, k2, null, false), 6.0f), 0L, rv4Var2, 0, 8);
            rv4Var2.q(true);
        } else {
            list2 = list;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ru1(str, str2, str3, list2, i, nq7Var, vt4Var, i2);
        }
    }

    public static final void b(List list, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        rv4Var.g0(942917255);
        if (rv4Var.f(list)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.h(xt4Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i6 = i5 | i3;
        if (rv4Var.h(xt4Var3)) {
            i4 = 16384;
        } else {
            i4 = 8192;
        }
        int i7 = i6 | i4;
        if ((i7 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i7 & 1, z)) {
            boolean z2 = false;
            aw7 D = yae.D(xt4Var, rv4Var);
            aw7 D2 = yae.D(xt4Var2, rv4Var);
            aw7 D3 = yae.D(xt4Var3, rv4Var);
            if ((i7 & 14) == 4) {
                z2 = true;
            }
            boolean f = rv4Var.f(D) | z2 | rv4Var.f(D2) | rv4Var.f(D3);
            Object P = rv4Var.P();
            if (f || P == ax1.a) {
                hq hqVar = new hq(list, D, D2, D3, 16);
                rv4Var.o0(hqVar);
                P = hqVar;
            }
            jce.d(nq7Var, null, null, false, null, null, null, false, null, (xt4) P, rv4Var, 6, 510);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new wp0((Object) list, nq7Var, xt4Var, xt4Var2, (hu4) xt4Var3, i, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.vt4 r27, defpackage.nq7 r28, defpackage.wea r29, defpackage.yf0 r30, long r31, long r33, defpackage.dj4 r35, final defpackage.lu4 r36, defpackage.rv4 r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wq9.c(vt4, nq7, wea, yf0, long, long, dj4, lu4, rv4, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, y36] */
    /* JADX WARN: Type inference failed for: r1v1, types: [r36, s46] */
    public static s46 d(xt4 xt4Var) {
        q36 q36Var = r36.d;
        q36Var.getClass();
        ?? obj = new Object();
        a46 a46Var = q36Var.a;
        obj.a = a46Var.a;
        obj.b = a46Var.e;
        obj.c = a46Var.b;
        obj.d = a46Var.c;
        String str = a46Var.f;
        obj.e = a46Var.g;
        String str2 = a46Var.h;
        yh1 yh1Var = a46Var.l;
        boolean z = a46Var.j;
        obj.f = a46Var.k;
        obj.g = a46Var.i;
        obj.h = a46Var.d;
        wf2 wf2Var = q36Var.b;
        boolean z2 = a46Var.m;
        xt4Var.invoke(obj);
        if (c16.i(str, "    ")) {
            a46 a46Var2 = new a46(obj.a, obj.c, obj.d, obj.h, obj.b, str, obj.e, str2, obj.g, z, obj.f, yh1Var, z2);
            wf2Var.getClass();
            ?? r36Var = new r36(a46Var2, wf2Var);
            if (wf2Var != baa.a) {
                wf2Var.d(new nt5(a46Var2));
            }
            return r36Var;
        }
        vs.m("Indent should not be specified when default printing mode is used");
        return null;
    }

    public static final void e(ar5 ar5Var, String str, int i, nq7 nq7Var, rv4 rv4Var, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        int i9;
        int i10;
        int i11;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(42581922);
        if (rv4Var2.f(ar5Var)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i12 = i4 | i2;
        if (rv4Var2.f(str)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i13 = i12 | i5;
        int i14 = i3 & 4;
        if (i14 != 0) {
            i8 = i13 | 384;
            i6 = i;
        } else {
            i6 = i;
            if (rv4Var2.d(i6)) {
                i7 = 256;
            } else {
                i7 = Token.CASE;
            }
            i8 = i13 | i7;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i8 |= i11;
        }
        if ((i8 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i8 & 1, z)) {
            if (i14 != 0) {
                i10 = 0;
            } else {
                i10 = i6;
            }
            nq7 A = zbe.A(nq7Var, nae.e, 12.0f, 1);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, A);
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
            nk5.a(ar5Var, null, pna.n(kq7Var, 24.0f), 0L, rv4Var2, (i8 & 14) | 432, 8);
            int i15 = i10;
            cvb.c(str, rs8.d(kq7Var, 24.0f, rv4Var2, 1.0f, true), 0L, null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 0, false, 0, 0, null, null, rv4Var, (i8 >> 3) & 14, 0, 261116);
            rv4Var2 = rv4Var;
            if (i15 > 0) {
                rv4Var2.e0(1572797923);
                ctd.a(3072, 7, 0L, 0L, jce.E(-1338754698, new zj7(i15, 9), rv4Var2), rv4Var, null);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(1572891140);
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
            i9 = i15;
        } else {
            rv4Var2.X();
            i9 = i6;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new bt0(ar5Var, str, i9, nq7Var, i2, i3);
        }
    }

    public static final void f(boolean z, String str, String str2, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        int i6;
        str.getClass();
        str2.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        rv4Var.g0(-1572387737);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if ((i & 48) == 0) {
            if (rv4Var.f(str)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i7 |= i6;
        }
        if (rv4Var.f(str2)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
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
        if ((i10 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i10 & 1, z2)) {
            if (ikd.a(rv4Var)) {
                rv4Var.e0(-2089533632);
                h(z, str, str2, xt4Var, xt4Var2, rv4Var, i10 & 65534);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-2089310463);
                g(z, str, str2, xt4Var, xt4Var2, rv4Var, i10 & 65534);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ae7(z, str, str2, xt4Var, xt4Var2, i, 1, (byte) 0);
        }
    }

    public static final void g(boolean z, String str, String str2, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        pb2 pb2Var;
        int i6;
        rv4Var.g0(1965912145);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if ((i & 48) == 0) {
            if (rv4Var.f(str)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i7 |= i6;
        }
        if (rv4Var.f(str2)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
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
        if ((i10 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i10 & 1, z2)) {
            aw7 D = yae.D(xt4Var2, rv4Var);
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                pb2 pb2Var2 = pb2Var;
                b93 b93Var = (b93) ((fdd) voe.z(cm9.a(b93.class), a2.i(), null, pb2Var2, o96.a(rv4Var), null));
                aw7 z3 = jsc.z(b93Var.d, rv4Var);
                z87.a(z, xt4Var, null, null, kh5.c, zl1.b(0.3f, zl1.b), false, false, null, jce.E(-582521421, new ff7(b93Var, str, D, xt4Var, str2, z3, 1), rv4Var), rv4Var, ((i10 >> 6) & Token.ASSIGN_MOD) | 805527552 | (i10 & 14), 460);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ae7(z, str, str2, xt4Var, xt4Var2, i, 3, (byte) 0);
        }
    }

    public static final void h(boolean z, String str, String str2, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        pb2 pb2Var;
        int i6;
        rv4Var.g0(1573669683);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if ((i & 48) == 0) {
            if (rv4Var.f(str)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i7 |= i6;
        }
        if (rv4Var.f(str2)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
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
        if ((i10 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i10 & 1, z2)) {
            aw7 D = yae.D(xt4Var2, rv4Var);
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                pb2 pb2Var2 = pb2Var;
                b93 b93Var = (b93) ((fdd) voe.z(cm9.a(b93.class), a2.i(), null, pb2Var2, o96.a(rv4Var), null));
                z87.a(z, xt4Var, null, null, null, 0L, false, false, null, jce.E(-118359535, new ff7(b93Var, str, D, xt4Var, str2, jsc.z(b93Var.d, rv4Var), 0), rv4Var), rv4Var, 805306368 | (i10 & 14) | ((i10 >> 6) & Token.ASSIGN_MOD), 508);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ae7(z, str, str2, xt4Var, xt4Var2, i, 2, (byte) 0);
        }
    }

    public static final void i(boolean z, xt4 xt4Var, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, vt4 vt4Var5, vt4 vt4Var6, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        xt4Var.getClass();
        vt4Var.getClass();
        vt4Var2.getClass();
        vt4Var3.getClass();
        vt4Var4.getClass();
        vt4Var5.getClass();
        vt4Var6.getClass();
        rv4Var.g0(971115168);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i10 = i | i2;
        if (rv4Var.h(xt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i11 = i10 | i3;
        if (rv4Var.h(vt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i12 = i11 | i4;
        if (rv4Var.h(vt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i13 = i12 | i5;
        if (rv4Var.h(vt4Var3)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i14 = i13 | i6;
        if (rv4Var.h(vt4Var4)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i15 = i14 | i7;
        if (rv4Var.h(vt4Var5)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i16 = i15 | i8;
        if (rv4Var.h(vt4Var6)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i17 = i16 | i9;
        if ((4793491 & i17) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i17 & 1, z2)) {
            if (ikd.a(rv4Var)) {
                rv4Var.e0(-407430337);
                j(z, xt4Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, vt4Var6, rv4Var, i17 & 33554430);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-407072225);
                k(z, xt4Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, vt4Var6, rv4Var, i17 & 33554430);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new fj7(z, xt4Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, vt4Var6, i, 0);
        }
    }

    public static final void j(boolean z, xt4 xt4Var, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, vt4 vt4Var5, vt4 vt4Var6, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        rv4Var.g0(-2058865214);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i10 = i | i2;
        if (rv4Var.h(xt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i11 = i10 | i3;
        if (rv4Var.h(vt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i12 = i11 | i4;
        if (rv4Var.h(vt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i13 = i12 | i5;
        if (rv4Var.h(vt4Var3)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i14 = i13 | i6;
        if (rv4Var.h(vt4Var4)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i15 = i14 | i7;
        if (rv4Var.h(vt4Var5)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i16 = i15 | i8;
        if (rv4Var.h(vt4Var6)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i17 = i16 | i9;
        if ((4793491 & i17) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i17 & 1, z2)) {
            nk0 nk0Var = kh5.b;
            nq7 y = zbe.y(zbe.C(nc2.o(pna.f(kq7.a, 1.0f)), nae.e, 50.0f, nae.e, nae.e, 13), 24.0f);
            eu3 g = zt3.g(null, 3);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new si7(4);
                rv4Var.o0(P);
            }
            eu3 a2 = g.a(zt3.t((xt4) P));
            lz3 i18 = zt3.i(null, 3);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new si7(5);
                rv4Var.o0(P2);
            }
            z87.a(z, xt4Var, a2, i18.a(zt3.x((xt4) P2)), nk0Var, 0L, false, false, y, jce.E(1962444704, new gj7(z, xt4Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, vt4Var6, 0), rv4Var), rv4Var, (i17 & Token.ASSIGN_MOD) | (i17 & 14) | 805334400, 224);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new fj7(z, xt4Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, vt4Var6, i, 1);
        }
    }

    public static final void k(boolean z, xt4 xt4Var, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, vt4 vt4Var5, vt4 vt4Var6, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        rv4Var.g0(197688538);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i10 = i | i2;
        if (rv4Var.h(xt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i11 = i10 | i3;
        if (rv4Var.h(vt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i12 = i11 | i4;
        if (rv4Var.h(vt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i13 = i12 | i5;
        if (rv4Var.h(vt4Var3)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i14 = i13 | i6;
        if (rv4Var.h(vt4Var4)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i15 = i14 | i7;
        if (rv4Var.h(vt4Var5)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i16 = i15 | i8;
        if (rv4Var.h(vt4Var6)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i17 = i16 | i9;
        if ((4793491 & i17) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i17 & 1, z2)) {
            nk0 nk0Var = kh5.c;
            nq7 s = pna.s(zbe.y(zbe.C(nc2.o(kq7.a), nae.e, nae.e, 40.0f, nae.e, 11), 12.0f), 360.0f);
            eu3 g = zt3.g(null, 3);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new si7(6);
                rv4Var.o0(P);
            }
            eu3 a2 = g.a(zt3.t((xt4) P));
            lz3 i18 = zt3.i(null, 3);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new si7(7);
                rv4Var.o0(P2);
            }
            z87.a(z, xt4Var, a2, i18.a(zt3.x((xt4) P2)), nk0Var, 0L, false, false, s, jce.E(-75968840, new gj7(z, xt4Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, vt4Var6, 1), rv4Var), rv4Var, (i17 & Token.ASSIGN_MOD) | (i17 & 14) | 805334400, 224);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new fj7(z, xt4Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, vt4Var6, i, 2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v24 */
    public static final void l(boolean z, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, vt4 vt4Var5, vt4 vt4Var6, vt4 vt4Var7, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        vt4 vt4Var8;
        vt4 vt4Var9;
        vt4 vt4Var10;
        rv4 rv4Var2;
        pb2 pb2Var;
        boolean z3;
        boolean z4;
        float f;
        float f2;
        float f3;
        ?? r1;
        rv4 rv4Var3 = rv4Var;
        rv4Var3.g0(205325773);
        if (rv4Var3.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i10 = i | i2;
        if (rv4Var3.h(vt4Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i11 = i10 | i3;
        if (rv4Var3.h(vt4Var2)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i12 = i11 | i4;
        if (rv4Var3.h(vt4Var3)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i13 = i12 | i5;
        if (rv4Var3.h(vt4Var4)) {
            i6 = 131072;
        } else {
            i6 = Parser.ARGC_LIMIT;
        }
        int i14 = i13 | i6;
        if (rv4Var3.h(vt4Var5)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i15 = i14 | i7;
        if (rv4Var3.h(vt4Var6)) {
            i8 = 8388608;
        } else {
            i8 = 4194304;
        }
        int i16 = i15 | i8;
        if (rv4Var3.h(vt4Var7)) {
            i9 = 67108864;
        } else {
            i9 = 33554432;
        }
        int i17 = i16 | i9;
        if ((38347923 & i17) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var3.U(i17 & 1, z2)) {
            sdd sddVar = (sdd) rv4Var3.j(idd.b);
            if (sddVar == null) {
                rv4Var3.e0(1368428688);
                sddVar = kv6.a(rv4Var3);
            } else {
                rv4Var3.e0(1368426673);
            }
            rv4Var3.q(false);
            if (sddVar != null) {
                if (sddVar instanceof y35) {
                    pb2Var = ((y35) sddVar).f();
                } else {
                    pb2Var = ob2.b;
                }
                d1d d1dVar = (d1d) ((fdd) voe.z(cm9.a(d1d.class), sddVar.i(), null, pb2Var, o96.a(rv4Var3), null));
                Boolean valueOf = Boolean.valueOf(z);
                if ((i17 & 14) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean f4 = z3 | rv4Var3.f(d1dVar);
                Object P = rv4Var3.P();
                Object obj = ax1.a;
                if (f4 || P == obj) {
                    P = new v65(z, d1dVar, (m42) null, 2);
                    rv4Var3.o0(P);
                }
                yte.g((lu4) P, rv4Var3, valueOf);
                aw7 z5 = jsc.z(d1dVar.f, rv4Var3);
                tza tzaVar = j27.a;
                v72 v72Var = ((h27) rv4Var3.j(tzaVar)).c.e;
                kq7 kq7Var = kq7.a;
                nq7 k = tte.k(kq7Var, v72Var);
                long g = rm1.g(((h27) rv4Var3.j(tzaVar)).a, 1.0f);
                ba5 ba5Var = lre.g;
                nq7 v = nmd.v(k, g, ba5Var);
                lk0 lk0Var = kh5.I;
                ez ezVar = lz.c;
                xn1 a2 = wn1.a(ezVar, lk0Var, rv4Var3, 0);
                int hashCode = Long.hashCode(rv4Var3.T);
                xt8 l = rv4Var3.l();
                nq7 p = lye.p(rv4Var3, v);
                rw1.k.getClass();
                zx1 zx1Var = qw1.b;
                rv4Var3.i0();
                if (rv4Var3.S) {
                    rv4Var3.k(zx1Var);
                } else {
                    rv4Var3.r0();
                }
                np npVar = qw1.f;
                jce.F(npVar, rv4Var3, a2);
                np npVar2 = qw1.e;
                jce.F(npVar2, rv4Var3, l);
                Integer valueOf2 = Integer.valueOf(hashCode);
                np npVar3 = qw1.g;
                jce.F(npVar3, rv4Var3, valueOf2);
                kg kgVar = qw1.h;
                jce.C(kgVar, rv4Var3);
                np npVar4 = qw1.d;
                jce.F(npVar4, rv4Var3, p);
                nq7 f5 = pna.f(kq7Var, 1.0f);
                b37 d2 = fu0.d(kh5.a, false);
                int hashCode2 = Long.hashCode(rv4Var3.T);
                xt8 l2 = rv4Var3.l();
                nq7 p2 = lye.p(rv4Var3, f5);
                rv4Var3.i0();
                if (rv4Var3.S) {
                    rv4Var3.k(zx1Var);
                } else {
                    rv4Var3.r0();
                }
                jce.F(npVar, rv4Var3, d2);
                jce.F(npVar2, rv4Var3, l2);
                s21.t(hashCode2, rv4Var3, npVar3, rv4Var3, kgVar);
                jce.F(npVar4, rv4Var3, p2);
                ar5 c2 = rp5.c((wk3) jk3.w.getValue(), rv4Var3, 0);
                String A = yqe.A((y3b) f2b.q0.getValue(), rv4Var3);
                nq7 k2 = tte.k(pna.n(zbe.y(kq7Var, 12.0f), 40.0f), uu9.a);
                if ((i17 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Object P2 = rv4Var3.P();
                if (z4 || P2 == obj) {
                    P2 = new hi7(13, vt4Var);
                    rv4Var3.o0(P2);
                }
                nk5.a(c2, A, zbe.y(lbe.f(15, (vt4) P2, k2, null, false), 8.0f), 0L, rv4Var, 0, 8);
                mfb mfbVar = v1b.a;
                cvb.c(yqe.A((y3b) mfbVar.getValue(), rv4Var), pu0.a.a(kq7Var, kh5.e), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.g, rv4Var, 0, 0, 131068);
                rv4Var.q(true);
                nq7 C = rte.C(nmd.v(tte.k(zbe.A(pna.f(kq7Var, 1.0f), 12.0f, nae.e, 2), ((h27) rv4Var.j(tzaVar)).c.d), rm1.g(((h27) rv4Var.j(tzaVar)).a, 10.0f), ba5Var), rte.u(rv4Var), 14);
                xn1 a3 = wn1.a(ezVar, lk0Var, rv4Var, 0);
                int hashCode3 = Long.hashCode(rv4Var.T);
                xt8 l3 = rv4Var.l();
                nq7 p3 = lye.p(rv4Var, C);
                rv4Var.i0();
                if (rv4Var.S) {
                    rv4Var.k(zx1Var);
                } else {
                    rv4Var.r0();
                }
                jce.F(npVar, rv4Var, a3);
                jce.F(npVar2, rv4Var, l3);
                s21.t(hashCode3, rv4Var, npVar3, rv4Var, kgVar);
                jce.F(npVar4, rv4Var, p3);
                if (((y0d) z5.getValue()).a) {
                    rv4Var.e0(351623622);
                    String str = ((y0d) z5.getValue()).c;
                    String str2 = ((y0d) z5.getValue()).h;
                    String str3 = ((y0d) z5.getValue()).d;
                    List list = ((y0d) z5.getValue()).e;
                    int i18 = ((y0d) z5.getValue()).k + ((y0d) z5.getValue()).j;
                    nq7 A2 = zbe.A(pna.f(kq7Var, 1.0f), 6.0f, nae.e, 2);
                    boolean f6 = rv4Var.f(d1dVar);
                    Object P3 = rv4Var.P();
                    if (f6 || P3 == obj) {
                        P3 = new u76(d1dVar, 12);
                        rv4Var.o0(P3);
                    }
                    f = 6.0f;
                    a(str, str2, str3, list, i18, A2, (vt4) P3, rv4Var, 196608);
                    rv4Var.q(false);
                    f3 = 0.0f;
                    r1 = 0;
                } else {
                    f = 6.0f;
                    rv4Var.e0(352139276);
                    nq7 y = zbe.y(pna.f(kq7Var, 1.0f), 12.0f);
                    gv9 a4 = ev9.a(lz.a, kh5.F, rv4Var, 0);
                    int hashCode4 = Long.hashCode(rv4Var.T);
                    xt8 l4 = rv4Var.l();
                    nq7 p4 = lye.p(rv4Var, y);
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(npVar, rv4Var, a4);
                    jce.F(npVar2, rv4Var, l4);
                    s21.t(hashCode4, rv4Var, npVar3, rv4Var, kgVar);
                    jce.F(npVar4, rv4Var, p4);
                    String A3 = yqe.A((y3b) x2b.N.getValue(), rv4Var);
                    if (1.0f <= 0.0d) {
                        jv5.a("invalid weight; must be greater than zero");
                    }
                    float f7 = Float.MAX_VALUE;
                    if (1.0f > Float.MAX_VALUE) {
                        f2 = Float.MAX_VALUE;
                    } else {
                        f2 = 1.0f;
                    }
                    f3 = 0.0f;
                    r1 = 0;
                    z1d.f(null, A3, false, null, zbe.A(new we6(f2, true), 6.0f, nae.e, 2), null, null, null, vt4Var2, rv4Var, (i17 << 15) & 234881024, 237);
                    String A4 = yqe.A((y3b) b3b.A.getValue(), rv4Var);
                    if (1.0f <= 0.0d) {
                        jv5.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f <= Float.MAX_VALUE) {
                        f7 = 1.0f;
                    }
                    z1d.f(null, A4, false, null, zbe.A(new we6(f7, true), 6.0f, nae.e, 2), null, null, null, vt4Var3, rv4Var, (i17 << 12) & 234881024, 237);
                    rv4Var.q(true);
                    rv4Var.q(false);
                }
                vqe.m(nae.e, 0, 7, 0L, rv4Var, null);
                rv4 rv4Var4 = rv4Var;
                if (((y0d) nk2.p(kq7Var, f, rv4Var4, z5)).a) {
                    rv4Var4.e0(352969239);
                    vt4Var10 = vt4Var4;
                    e(rp5.c((wk3) ok3.Y.getValue(), rv4Var4, r1), yqe.A((y3b) mfbVar.getValue(), rv4Var4), 0, zbe.A(lbe.f(15, vt4Var10, pna.f(kq7Var, 1.0f), null, r1), 12.0f, f3, 2), rv4Var4, 0, 4);
                    rv4Var4.q(r1);
                } else {
                    vt4Var10 = vt4Var4;
                    rv4Var4.e0(353317121);
                    rv4Var4.q(r1);
                }
                vt4Var9 = vt4Var6;
                e(rp5.c((wk3) ok3.R.getValue(), rv4Var4, r1), yqe.A((y3b) x2b.v0.getValue(), rv4Var4), ((y0d) z5.getValue()).k, zbe.A(lbe.f(15, vt4Var9, pna.f(kq7Var, 1.0f), null, r1), 12.0f, f3, 2), rv4Var4, 0, 0);
                if (((y0d) z5.getValue()).a) {
                    rv4Var4.e0(353761661);
                    e(rp5.c((wk3) jk3.u.getValue(), rv4Var4, r1), yqe.A((y3b) x2b.a0.getValue(), rv4Var4), ((y0d) z5.getValue()).j, zbe.A(lbe.f(15, vt4Var5, pna.f(kq7Var, 1.0f), null, r1), 12.0f, f3, 2), rv4Var4, 0, 0);
                    rv4Var4.q(r1);
                } else {
                    rv4Var4.e0(354165281);
                    rv4Var4.q(r1);
                }
                if (((y0d) z5.getValue()).g == 3) {
                    rv4Var4.e0(354228366);
                    vt4Var8 = vt4Var7;
                    e(rp5.c((wk3) ok3.J.getValue(), rv4Var4, r1), yqe.A((y3b) x2b.U.getValue(), rv4Var4), 0, zbe.A(lbe.f(15, vt4Var8, pna.f(kq7Var, 1.0f), null, r1), 12.0f, f3, 2), rv4Var4, 0, 4);
                    rv4Var4.q(r1);
                } else {
                    vt4Var8 = vt4Var7;
                    rv4Var4.e0(354584897);
                    rv4Var4.q(r1);
                }
                e(rp5.c((wk3) ok3.q.getValue(), rv4Var4, r1), yqe.A((y3b) k3b.n0.getValue(), rv4Var4), 0, zbe.A(pna.f(kq7Var, 1.0f), 12.0f, f3, 2), rv4Var4, 3072, 4);
                hl5.w(kq7Var, f, rv4Var4, true);
                hl5.w(kq7Var, 12.0f, rv4Var4, true);
                rv4Var2 = rv4Var4;
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalRootViewModelStoreOwner or LocalViewModelStoreOwner");
                return;
            }
        } else {
            vt4Var8 = vt4Var7;
            vt4Var9 = vt4Var6;
            vt4Var10 = vt4Var4;
            rv4Var3.X();
            rv4Var2 = rv4Var3;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new va4(z, vt4Var, vt4Var2, vt4Var3, vt4Var10, vt4Var5, vt4Var9, vt4Var8, i);
        }
    }

    public static final void m(int i, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, nq7 nq7Var, String str) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        rv4 rv4Var2 = rv4Var;
        str.getClass();
        vt4Var.getClass();
        vt4Var2.getClass();
        rv4Var2.g0(-2113981260);
        if (rv4Var2.f(str)) {
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
        if (rv4Var2.h(vt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if (rv4Var2.h(vt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i9 & 1, z)) {
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
            ar5 c2 = rp5.c((wk3) ok3.i.getValue(), rv4Var2, 0);
            String A = yqe.A((y3b) s2b.v0.getValue(), rv4Var2);
            kq7 kq7Var = kq7.a;
            nq7 k = tte.k(pna.n(kq7Var, 28.0f), uu9.a);
            tza tzaVar = j27.a;
            nk5.a(c2, A, zbe.y(nmd.v(k, rm1.g(((h27) rv4Var2.j(tzaVar)).a, 6.0f), lre.g), 4.0f), 0L, rv4Var2, 0, 8);
            cvb.c(str, rs8.d(kq7Var, 12.0f, rv4Var2, 1.0f, true), 0L, null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.k, rv4Var, i9 & 14, 0, 130044);
            rv4Var2 = rv4Var;
            xbe.i(rv4Var2, pna.s(kq7Var, 12.0f));
            ar5 c3 = rp5.c((wk3) jk3.g.getValue(), rv4Var2, 0);
            mfb mfbVar = x2b.s;
            String A2 = yqe.A((y3b) mfbVar.getValue(), rv4Var2);
            nq7 n = pna.n(kq7Var, 24.0f);
            if ((i9 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = new ge5(22, vt4Var);
                rv4Var2.o0(P);
            }
            nk5.a(c3, A2, lbe.f(15, (vt4) P, n, null, false), 0L, rv4Var2, 0, 8);
            xbe.i(rv4Var2, pna.s(kq7Var, 12.0f));
            ar5 c4 = rp5.c((wk3) jk3.H.getValue(), rv4Var2, 0);
            String A3 = yqe.A((y3b) mfbVar.getValue(), rv4Var2);
            nq7 n2 = pna.n(kq7Var, 24.0f);
            if ((i9 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P2 = rv4Var2.P();
            if (z3 || P2 == lh9Var) {
                P2 = new ge5(23, vt4Var2);
                rv4Var2.o0(P2);
            }
            nk5.a(c4, A3, zbe.y(lbe.f(15, (vt4) P2, n2, null, false), 2.0f), 0L, rv4Var2, 0, 8);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new qp1(str, nq7Var, vt4Var, vt4Var2, i, 8);
        }
    }

    public static String n(int i, int i2, String str) {
        if (i < 0) {
            return hma.v("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return hma.v("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        vs.m(a82.j(i2, "negative size: "));
        return null;
    }

    public static void o(int i, int i2, String str, boolean z) {
        if (z) {
            return;
        }
        vs.m(hma.v(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void p(int i, String str, boolean z) {
        if (z) {
            return;
        }
        vs.m(hma.v(str, Integer.valueOf(i)));
    }

    public static void q(String str, long j, boolean z) {
        if (z) {
            return;
        }
        vs.m(hma.v(str, Long.valueOf(j)));
    }

    public static void r(String str, boolean z) {
        if (z) {
            return;
        }
        vs.m(str);
    }

    public static void s(boolean z) {
        if (z) {
            return;
        }
        p1a.g();
    }

    public static void t(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        vs.m(hma.v(str, Long.valueOf(j), Long.valueOf(j2)));
    }

    public static void u(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        vs.m(hma.v(str, obj));
    }

    public static void v(boolean z, String str, Object obj, Comparable comparable) {
        if (z) {
            return;
        }
        vs.m(hma.v(str, obj, comparable));
    }

    public static void w(int i, int i2) {
        String v;
        if (i >= 0 && i < i2) {
            return;
        }
        if (i >= 0) {
            if (i2 < 0) {
                vs.m(a82.j(i2, "negative size: "));
                return;
            }
            v = hma.v("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            v = hma.v("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(v);
    }

    public static void x(o57 o57Var) {
        o57Var.getClass();
    }

    public static void y(ListenableFuture listenableFuture, String str, Object obj) {
        if (listenableFuture != null) {
            return;
        }
        xk5.k(hma.v(str, obj));
    }

    public static void z(Object obj, String str) {
        if (obj != null) {
            return;
        }
        xk5.k(str);
    }
}
