package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yqe  reason: default package */
/* loaded from: classes.dex */
public abstract class yqe {
    public static final tu1 a = new tu1(new xu1(1), false, -500328360);

    public static final String A(y3b y3bVar, rv4 rv4Var) {
        y3bVar.getClass();
        ns2 s = hma.s(fr9.a, rv4Var);
        Object P = rv4Var.P();
        lh9 lh9Var = ax1.a;
        if (P == lh9Var) {
            P = new n3b(20);
            rv4Var.o0(P);
        }
        vt4 vt4Var = (vt4) P;
        boolean f = rv4Var.f(y3bVar) | rv4Var.h(s);
        Object P2 = rv4Var.P();
        if (f || P2 == lh9Var) {
            P2 = new jk8(y3bVar, s, (m42) null, 26);
            rv4Var.o0(P2);
        }
        return (String) fre.q(y3bVar, vt4Var, (lu4) P2, rv4Var).getValue();
    }

    public static final String B(y3b y3bVar, Object[] objArr, rv4 rv4Var) {
        Object obj;
        Object obj2;
        y3bVar.getClass();
        Object s = hma.s(fr9.a, rv4Var);
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj3 : objArr) {
            arrayList.add(obj3.toString());
        }
        Object P = rv4Var.P();
        Object obj4 = ax1.a;
        if (P == obj4) {
            P = new n3b(20);
            rv4Var.o0(P);
        }
        vt4 vt4Var = (vt4) P;
        boolean f = rv4Var.f(y3bVar) | rv4Var.h(arrayList) | rv4Var.h(s);
        Object P2 = rv4Var.P();
        if (!f && P2 != obj4) {
            obj2 = P2;
            obj = y3bVar;
        } else {
            obj = y3bVar;
            Object z45Var = new z45(obj, arrayList, s, (m42) null, 24);
            rv4Var.o0(z45Var);
            obj2 = z45Var;
        }
        lu4 lu4Var = (lu4) obj2;
        vt4Var.getClass();
        lu4Var.getClass();
        ((tq9) rv4Var.j(vq9.b)).getClass();
        sq9 a2 = tq9.a(rv4Var);
        boolean f2 = rv4Var.f(obj) | rv4Var.f(arrayList) | rv4Var.f(a2);
        Object P3 = rv4Var.P();
        if (f2 || P3 == obj4) {
            P3 = yae.z(z87.C(gs3.a, new gr9(lu4Var, a2, null, 1)));
            rv4Var.o0(P3);
        }
        return (String) ((aw7) P3).getValue();
    }

    public static final char[] C(String str) {
        int length = str.length();
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = str.charAt(i);
        }
        return cArr;
    }

    public static final void D(int i, int i2) {
        boolean z;
        boolean z2 = false;
        if (i > 0 && i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ov5.a("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            z2 = true;
        }
        if (!z2) {
            ov5.a("minLines " + i + " must be less than or equal to maxLines " + i2);
        }
    }

    public static final void E(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i >= 0 && byteBuffer2.remaining() >= i && byteBuffer3.remaining() >= i && byteBuffer.remaining() >= i) {
            for (int i2 = 0; i2 < i; i2++) {
                byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
            }
            return;
        }
        vs.m("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    public static final byte[] F(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (i2 >= 0 && bArr.length - i2 >= i && bArr2.length - i2 >= 0) {
            byte[] bArr3 = new byte[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                bArr3[i3] = (byte) (bArr[i3 + i] ^ bArr2[i3]);
            }
            return bArr3;
        }
        vs.m("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        return null;
    }

    public static final byte[] G(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return F(bArr, 0, bArr2, bArr.length);
        }
        vs.m("The lengths of x and y should match.");
        return null;
    }

    public static byte[] H(byte[]... bArr) {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            if (i <= Integer.MAX_VALUE - bArr2.length) {
                i += bArr2.length;
            } else {
                hfd.j("exceeded size limit");
                return null;
            }
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i2, bArr4.length);
            i2 += bArr4.length;
        }
        return bArr3;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.wb9 r40, defpackage.rh8 r41, defpackage.nq7 r42, defpackage.xt4 r43, defpackage.xt4 r44, defpackage.xt4 r45, defpackage.xt4 r46, defpackage.xt4 r47, defpackage.rv4 r48, int r49) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yqe.a(wb9, rh8, nq7, xt4, xt4, xt4, xt4, xt4, rv4, int):void");
    }

    public static final void b(String str, cz7 cz7Var, rh8 rh8Var, rh8 rh8Var2, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        Object obj;
        boolean z;
        pb2 pb2Var;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        str.getClass();
        cz7Var.getClass();
        rv4Var.g0(-1701204684);
        if ((i & 6) == 0) {
            if (rv4Var.f(str)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(cz7Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(rh8Var)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            obj = rh8Var2;
            if (rv4Var.f(obj)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        } else {
            obj = rh8Var2;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.f(nq7Var)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((i2 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
            }
            rv4Var.r();
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                final m83 m83Var = (m83) ((fdd) voe.z(cm9.a(m83.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z4 = jsc.z(m83Var.U, rv4Var);
                boolean f = rv4Var.f(m83Var);
                Object P = rv4Var.P();
                Object obj2 = ax1.a;
                if (f || P == obj2) {
                    P = new cq2(m83Var, 8);
                    rv4Var.o0(P);
                }
                tte.d(m83Var, null, (xt4) P, rv4Var, 0);
                if (((h83) z4.getValue()).b) {
                    rv4Var.e0(25880184);
                    String str2 = ((h83) z4.getValue()).c;
                    ze4 ze4Var = pna.c;
                    boolean f2 = rv4Var.f(m83Var);
                    Object P2 = rv4Var.P();
                    if (f2 || P2 == obj2) {
                        P2 = new vt4() { // from class: d83
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i8 = r2;
                                pvc pvcVar = pvc.a;
                                m83 m83Var2 = m83Var;
                                switch (i8) {
                                    case 0:
                                        m83Var2.F();
                                        return pvcVar;
                                    case 1:
                                        m83Var2.F();
                                        return pvcVar;
                                    default:
                                        m83Var2.F();
                                        return pvcVar;
                                }
                            }
                        };
                        rv4Var.o0(P2);
                    }
                    c(48, (vt4) P2, rv4Var, ze4Var, str2);
                    rv4Var.q(false);
                } else if (((h83) z4.getValue()).a && ((h83) z4.getValue()).d.isEmpty()) {
                    rv4Var.e0(26148892);
                    e(((i2 >> 3) & Token.ASSIGN_MOD) | ((i2 >> 12) & 14), rv4Var, nq7Var, rh8Var);
                    rv4Var.q(false);
                } else if (((h83) z4.getValue()).d.isEmpty()) {
                    rv4Var.e0(26334334);
                    String A = A((y3b) o2b.K0.getValue(), rv4Var);
                    ze4 ze4Var2 = pna.c;
                    boolean f3 = rv4Var.f(m83Var);
                    Object P3 = rv4Var.P();
                    if (f3 || P3 == obj2) {
                        P3 = new vt4() { // from class: d83
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i8 = r2;
                                pvc pvcVar = pvc.a;
                                m83 m83Var2 = m83Var;
                                switch (i8) {
                                    case 0:
                                        m83Var2.F();
                                        return pvcVar;
                                    case 1:
                                        m83Var2.F();
                                        return pvcVar;
                                    default:
                                        m83Var2.F();
                                        return pvcVar;
                                }
                            }
                        };
                        rv4Var.o0(P3);
                    }
                    c(48, (vt4) P3, rv4Var, ze4Var2, A);
                    rv4Var.q(false);
                } else {
                    rv4Var.e0(26615287);
                    boolean z5 = ((h83) z4.getValue()).a;
                    List list = ((h83) z4.getValue()).d;
                    if ((i2 & Token.ASSIGN_MOD) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((i2 & 14) == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z6 = z2 | z3;
                    Object P4 = rv4Var.P();
                    if (z6 || P4 == obj2) {
                        P4 = new e83(cz7Var, str, 0);
                        rv4Var.o0(P4);
                    }
                    xt4 xt4Var = (xt4) P4;
                    boolean f4 = rv4Var.f(m83Var);
                    Object P5 = rv4Var.P();
                    if (f4 || P5 == obj2) {
                        P5 = new vt4() { // from class: d83
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i8 = r2;
                                pvc pvcVar = pvc.a;
                                m83 m83Var2 = m83Var;
                                switch (i8) {
                                    case 0:
                                        m83Var2.F();
                                        return pvcVar;
                                    case 1:
                                        m83Var2.F();
                                        return pvcVar;
                                    default:
                                        m83Var2.F();
                                        return pvcVar;
                                }
                            }
                        };
                        rv4Var.o0(P5);
                    }
                    int i8 = i2 << 3;
                    d(z5, list, nq7Var, rh8Var, obj, xt4Var, (vt4) P5, rv4Var, ((i2 >> 6) & 896) | (i8 & 7168) | (i8 & 57344));
                    rv4Var.q(false);
                }
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ud1(str, (Object) cz7Var, (Object) rh8Var, (Object) rh8Var2, nq7Var, i, 3);
        }
    }

    public static final void c(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, String str) {
        int i2;
        int i3;
        boolean z;
        String str2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1164031173);
        if (rv4Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var2.h(vt4Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i5 = i4 | i3;
        if ((i5 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i5 & 1, z)) {
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
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
            rv4Var2.e0(1927476148);
            if (str.length() == 0) {
                str2 = A((y3b) s2b.a.getValue(), rv4Var2);
            } else {
                str2 = str;
            }
            rv4Var2.q(false);
            cvb.c(str2, null, 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.f, rv4Var, 0, 0, 130046);
            rv4Var2 = rv4Var;
            xbe.i(rv4Var2, pna.h(kq7.a, 12.0f));
            z1d.f(rp5.c((wk3) ok3.g0.getValue(), rv4Var2, 0), A((y3b) b3b.B.getValue(), rv4Var2), false, null, null, null, null, null, vt4Var, rv4Var2, (i5 << 18) & 234881024, 252);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new k31(str, nq7Var, vt4Var, i, 3);
        }
    }

    public static final void d(boolean z, List list, nq7 nq7Var, rh8 rh8Var, rh8 rh8Var2, xt4 xt4Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean h;
        int i8;
        int i9;
        rv4Var.g0(1150758471);
        if ((i & 6) == 0) {
            if (rv4Var.g(z)) {
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
                h = rv4Var.f(list);
            } else {
                h = rv4Var.h(list);
            }
            if (h) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i7 = 256;
            } else {
                i7 = Token.CASE;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(rh8Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.f(rh8Var2)) {
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
            if (rv4Var.h(vt4Var)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i2 |= i3;
        }
        int i10 = i2;
        if ((599187 & i10) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i10 & 1, z2)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
            }
            rv4Var.r();
            ya9 b = ra9.b(rv4Var);
            ra9.a(z, vt4Var, nq7Var, b, null, jce.E(455358030, new f83(b, z, rh8Var, 0), rv4Var), false, nae.e, jce.E(-390112405, new g83(rh8Var, rh8Var2, list, xt4Var, 0), rv4Var), rv4Var, (i10 & 14) | 100859904 | ((i10 >> 15) & Token.ASSIGN_MOD) | (i10 & 896));
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new qg1(z, list, nq7Var, rh8Var, rh8Var2, xt4Var, vt4Var, i);
        }
    }

    public static final void e(int i, rv4 rv4Var, nq7 nq7Var, rh8 rh8Var) {
        int i2;
        boolean z;
        rv4 rv4Var2;
        nq7 nq7Var2;
        int i3;
        int i4;
        rv4Var.g0(-688748525);
        if ((i & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(rh8Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            rv4Var2 = rv4Var;
            nq7Var2 = nq7Var;
            hc2.b(nq7Var2, null, jce.E(-105102339, new qo4(rh8Var, 12), rv4Var), rv4Var2, (i2 & 14) | 3072, 6);
        } else {
            rv4Var2 = rv4Var;
            nq7Var2 = nq7Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new d33(nq7Var2, rh8Var, i);
        }
    }

    public static final tw3 f(jp5 jp5Var, Throwable th) {
        ml5 ml5Var;
        if (th instanceof o68) {
            xt4 xt4Var = jp5Var.n;
            gp5 gp5Var = jp5Var.t;
            ml5Var = (ml5) xt4Var.invoke(jp5Var);
            if (ml5Var == null) {
                ml5Var = (ml5) gp5Var.j.invoke(jp5Var);
            }
            if (ml5Var == null && (ml5Var = (ml5) jp5Var.m.invoke(jp5Var)) == null) {
                ml5Var = (ml5) gp5Var.i.invoke(jp5Var);
            }
        } else {
            ml5Var = (ml5) jp5Var.m.invoke(jp5Var);
            if (ml5Var == null) {
                ml5Var = (ml5) jp5Var.t.i.invoke(jp5Var);
            }
        }
        return new tw3(ml5Var, jp5Var, th);
    }

    public static final void g(tu1 tu1Var, rv4 rv4Var, int i) {
        boolean z;
        rv4Var.g0(-709502251);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i & 1, z)) {
            tza tzaVar = ay9.a;
            xx9 xx9Var = (xx9) rv4Var.j(tzaVar);
            tx9 v = sve.v(rv4Var);
            Object[] objArr = {xx9Var};
            yy9 yy9Var = new yy9(new j35(10), new j34(18, xx9Var, v));
            boolean h = rv4Var.h(xx9Var) | rv4Var.h(v);
            Object P = rv4Var.P();
            if (h || P == ax1.a) {
                P = new mf6(4, xx9Var, v);
                rv4Var.o0(P);
            }
            qj6 qj6Var = (qj6) zpe.m(objArr, yy9Var, (vt4) P, rv4Var, 0);
            pye.a(tzaVar.a(qj6Var), jce.E(-412824043, new sv4(8, tu1Var, qj6Var), rv4Var), rv4Var, 56);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new x0a(i, 9, tu1Var);
        }
    }

    public static final void h(boolean z, xt4 xt4Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z2;
        rv4Var.g0(1961525456);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var.h(vt4Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i5 = i4 | i3;
        if ((i5 & Token.EXPR_VOID) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i5 & 1, z2)) {
            xb.a(z, xt4Var, null, null, null, null, jsc.c, null, 0L, 0L, nae.e, null, null, null, true, true, jce.E(-1980643724, new zr(7, vt4Var), rv4Var), rv4Var, (i5 & 14) | 1572912, 1794048, 16316);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new n65(z, xt4Var, vt4Var, i, 2);
        }
    }

    public static final void i(int i, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, nq7 nq7Var, boolean z) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        rv4Var.g0(-1270687523);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.h(vt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var.h(vt4Var2)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4 | 3072;
        boolean z3 = false;
        if ((i7 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i7 & 1, z2)) {
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = yae.z(Boolean.FALSE);
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            b37 d = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            kq7 kq7Var = kq7.a;
            nq7 p = lye.p(rv4Var, kq7Var);
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
            ar5 c = rp5.c((wk3) ok3.M.getValue(), rv4Var, 0);
            if ((i7 & 14) == 4) {
                z3 = true;
            }
            Object P2 = rv4Var.P();
            if (z3 || P2 == lh9Var) {
                P2 = new dj0(z, aw7Var, 4);
                rv4Var.o0(P2);
            }
            kwe.d(c, null, 0L, (vt4) P2, rv4Var, 0, 6);
            boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
            Object P3 = rv4Var.P();
            if (P3 == lh9Var) {
                P3 = new ao7(aw7Var, 20);
                rv4Var.o0(P3);
            }
            nq7Var = kq7Var;
            iue.e(booleanValue, null, 0L, null, nae.e, null, (vt4) P3, jce.E(-119335517, new oq5(vt4Var, vt4Var2, aw7Var, 1), rv4Var), rv4Var, 14155776, 62);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        nq7 nq7Var2 = nq7Var;
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new rd0(z, vt4Var, vt4Var2, nq7Var2, i, 16);
        }
    }

    public static final void j(int i, cz7 cz7Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        cz7 cz7Var2;
        boolean z2;
        pb2 pb2Var;
        int i6;
        boolean z3;
        kn6 kn6Var;
        boolean z4;
        boolean z5;
        aw7 aw7Var;
        aw7 aw7Var2;
        eo3 eo3Var;
        Object obj;
        boolean z6;
        String str;
        cz7Var.getClass();
        rv4Var.g0(1901775872);
        if (rv4Var.d(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i3 | i2;
        if (rv4Var.f(cz7Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if ((i8 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i8 & 1, z)) {
            String j = a82.j(i, "qt_dic_");
            int i9 = i8 & 14;
            if (i9 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            Object obj2 = ax1.a;
            if (z2 || P == obj2) {
                P = new rg6(i, 1);
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
                pb2 pb2Var2 = pb2Var;
                q0a a3 = o96.a(rv4Var);
                gi1 a4 = cm9.a(zb9.class);
                zb9 zb9Var = (zb9) ((fdd) voe.z(a4, a2.i(), eub.o(a4.f(), "-", j), pb2Var2, a3, vt4Var));
                aw7 z7 = jsc.z(zb9Var.e, rv4Var);
                eo3 F = nmd.F(rv4Var);
                Object P2 = rv4Var.P();
                if (P2 == obj2) {
                    P2 = yae.z(null);
                    rv4Var.o0(P2);
                }
                aw7 aw7Var3 = (aw7) P2;
                Object P3 = rv4Var.P();
                if (P3 == obj2) {
                    P3 = new zu8(tl1.A("txt"));
                    rv4Var.o0(P3);
                }
                zu8 zu8Var = (zu8) P3;
                boolean f = rv4Var.f(z7) | rv4Var.f(zb9Var);
                Object P4 = rv4Var.P();
                if (f || P4 == obj2) {
                    P4 = new nq3((Object) zb9Var, (Object) z7, aw7Var3, 25);
                    rv4Var.o0(P4);
                }
                kd4 v = w92.v(zu8Var, (xt4) P4, rv4Var, 8);
                f76 f76Var = (f76) aw7Var3.getValue();
                if (f76Var == null) {
                    rv4Var.e0(892351584);
                    rv4Var.q(false);
                    i6 = i8;
                } else {
                    rv4Var.e0(892351585);
                    String name = f76Var.getName();
                    Object P5 = rv4Var.P();
                    if (P5 == obj2) {
                        P5 = new qo7(aw7Var3, 17);
                        rv4Var.o0(P5);
                    }
                    xt4 xt4Var = (xt4) P5;
                    boolean f2 = rv4Var.f(zb9Var) | rv4Var.f(f76Var);
                    i6 = i8;
                    Object P6 = rv4Var.P();
                    if (f2 || P6 == obj2) {
                        P6 = new nq3(zb9Var, f76Var, aw7Var3, 26);
                        rv4Var.o0(P6);
                    }
                    nae.d(name, xt4Var, (xt4) P6, rv4Var, 390);
                    rv4Var.q(false);
                }
                kb kbVar = (kb) rv4Var.j(yb.a);
                s02 s02Var = zb9Var.f;
                boolean f3 = rv4Var.f(kbVar);
                if (i9 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z8 = z3 | f3;
                Object P7 = rv4Var.P();
                if (!z8 && P7 != obj2) {
                    kn6Var = null;
                } else {
                    kn6Var = null;
                    P7 = new vb9(i, kbVar, null);
                    rv4Var.o0(P7);
                }
                jye.b(s02Var, kn6Var, (mu4) P7, rv4Var, 0);
                Object P8 = rv4Var.P();
                if (P8 == obj2) {
                    P8 = yae.z(Boolean.FALSE);
                    rv4Var.o0(P8);
                }
                aw7 aw7Var4 = (aw7) P8;
                if (!((wb9) z7.getValue()).j && !((wb9) z7.getValue()).h) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                boolean f4 = rv4Var.f(z7) | rv4Var.f(zb9Var);
                int i10 = i6 & Token.ASSIGN_MOD;
                if (i10 == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z9 = f4 | z5;
                Object P9 = rv4Var.P();
                if (z9 || P9 == obj2) {
                    aw7Var = z7;
                    aw7Var2 = aw7Var4;
                    eo3Var = F;
                    Object rb9Var = new rb9(zb9Var, cz7Var, aw7Var, aw7Var2, 1);
                    rv4Var.o0(rb9Var);
                    obj = rb9Var;
                } else {
                    aw7Var = z7;
                    aw7Var2 = aw7Var4;
                    obj = P9;
                    eo3Var = F;
                }
                sf0.a(z4, (vt4) obj, rv4Var, 0, 0);
                boolean booleanValue = ((Boolean) aw7Var2.getValue()).booleanValue();
                Object P10 = rv4Var.P();
                if (P10 == obj2) {
                    P10 = new qo7(aw7Var2, 18);
                    rv4Var.o0(P10);
                }
                xt4 xt4Var2 = (xt4) P10;
                if (i10 == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                Object P11 = rv4Var.P();
                if (z6 || P11 == obj2) {
                    P11 = new rp0(cz7Var, aw7Var2, 22);
                    rv4Var.o0(P11);
                }
                h(booleanValue, xt4Var2, (vt4) P11, rv4Var, 48);
                ze4 ze4Var = pna.c;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                str = "VietPhrase.txt";
                            } else {
                                str = "LuatNhan.txt";
                            }
                        } else {
                            str = "PhienAm.txt";
                        }
                    } else {
                        str = "Pronouns.txt";
                    }
                } else {
                    str = "Name.txt";
                }
                aw7 aw7Var5 = aw7Var;
                cz7Var2 = cz7Var;
                fxe.h(str, ze4Var, false, jce.E(1628737796, new rj7(zb9Var, aw7Var5, cz7Var, aw7Var2, 4), rv4Var), jce.E(-1039599365, new ob9(0, zb9Var, v, aw7Var5), rv4Var), jce.E(1981774175, new t81(5, aw7Var5, eo3Var), rv4Var), jce.E(-234641515, new cs1(9, zb9Var, eo3Var, aw7Var5), rv4Var), rv4Var, 1797168, 4);
                boolean f5 = rv4Var.f(zb9Var);
                Object P12 = rv4Var.P();
                if (f5 || P12 == obj2) {
                    P12 = new el7(zb9Var, 7);
                    rv4Var.o0(P12);
                }
                i5 = 0;
                nmd.e(eo3Var, (lu4) P12, rv4Var, 0);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            i5 = 0;
            cz7Var2 = cz7Var;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new sb9(i, cz7Var2, i2, i5);
        }
    }

    public static final void k(zb9 zb9Var, cz7 cz7Var, aw7 aw7Var, aw7 aw7Var2) {
        if (((wb9) aw7Var.getValue()).j) {
            zb9Var.l();
        } else if (((wb9) aw7Var.getValue()).h) {
            aw7Var2.setValue(Boolean.TRUE);
        } else {
            cz7Var.c();
        }
    }

    public static final void l(ac9 ac9Var, final boolean z, final boolean z2, final boolean z3, final boolean z4, final vt4 vt4Var, vt4 vt4Var2, final vt4 vt4Var3, final nq7 nq7Var, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z5;
        ac9 ac9Var2;
        v72 d;
        long j;
        boolean z6;
        boolean z7;
        boolean z8;
        vt4 vt4Var4 = vt4Var2;
        rv4Var.g0(-1500763940);
        if (rv4Var.f(ac9Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i11 = i | i2;
        if (rv4Var.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i12 = i11 | i3;
        if (rv4Var.g(z2)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i13 = i12 | i4;
        if (rv4Var.g(z3)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i14 = i13 | i5;
        if (rv4Var.g(z4)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i15 = i14 | i6;
        if (rv4Var.h(vt4Var)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i16 = i15 | i7;
        if (rv4Var.h(vt4Var4)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i17 = i16 | i8;
        if (rv4Var.h(vt4Var3)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i18 = i17 | i9;
        if (rv4Var.f(nq7Var)) {
            i10 = 67108864;
        } else {
            i10 = 33554432;
        }
        int i19 = i18 | i10;
        if ((38347923 & i19) != 38347922) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (rv4Var.U(i19 & 1, z5)) {
            nq7 f = pna.f(nq7Var, 1.0f);
            if (!z && !z2) {
                rv4Var.e0(874879366);
                d = ((h27) rv4Var.j(j27.a)).c.a;
                rv4Var.q(false);
            } else if (z && z2) {
                rv4Var.e0(874881729);
                d = ((h27) rv4Var.j(j27.a)).c.d;
                rv4Var.q(false);
            } else if (z) {
                rv4Var.e0(1351598025);
                tza tzaVar = j27.a;
                d = v72.d(((h27) rv4Var.j(tzaVar)).c.d, null, null, ((h27) rv4Var.j(tzaVar)).c.a.c, ((h27) rv4Var.j(tzaVar)).c.a.d, 3);
                rv4Var.q(false);
            } else {
                rv4Var.e0(874891789);
                tza tzaVar2 = j27.a;
                d = v72.d(((h27) rv4Var.j(tzaVar2)).c.d, ((h27) rv4Var.j(tzaVar2)).c.a.a, ((h27) rv4Var.j(tzaVar2)).c.a.b, null, null, 12);
                rv4Var.q(false);
            }
            nq7 k = tte.k(f, d);
            if (z4) {
                rv4Var.e0(1352104937);
                long b = zl1.b(0.12f, ((h27) rv4Var.j(j27.a)).a.a);
                rv4Var.q(false);
                j = b;
            } else {
                rv4Var.e0(1352203207);
                long g = rm1.g(((h27) rv4Var.j(j27.a)).a, 1.0f);
                rv4Var.q(false);
                j = g;
            }
            nq7 v = nmd.v(k, j, lre.g);
            if ((i19 & 7168) == 2048) {
                z6 = true;
            } else {
                z6 = false;
            }
            if ((29360128 & i19) == 8388608) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z9 = z6 | z7;
            if ((458752 & i19) == 131072) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z10 = z9 | z8;
            Object P = rv4Var.P();
            if (z10 || P == ax1.a) {
                P = new u90(z3, vt4Var3, vt4Var, 2);
                rv4Var.o0(P);
            }
            nq7 z11 = zbe.z(lbe.h(v, vt4Var3, (vt4) P), 16.0f, 6.0f);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var, 48);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, z11);
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
            rte.d(z3, null, null, null, null, jce.E(1928038936, new bm(z4, vt4Var3), rv4Var), rv4Var, 1572870 | ((i19 >> 6) & Token.ASSIGN_MOD), 30);
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            float f2 = Float.MAX_VALUE;
            if (1.0f <= Float.MAX_VALUE) {
                f2 = 1.0f;
            }
            we6 we6Var = new we6(f2, true);
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
            ac9Var2 = ac9Var;
            String str = ac9Var2.a;
            tza tzaVar3 = j27.a;
            oyb oybVar = ((h27) rv4Var.j(tzaVar3)).b.j;
            long j2 = ((h27) rv4Var.j(tzaVar3)).a.q;
            kq7 kq7Var = kq7.a;
            cvb.c(str, pna.f(kq7Var, 1.0f), j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var, 48, 0, 131064);
            m(ac9Var2.b, pna.f(kq7Var, 1.0f), rv4Var, 48);
            rv4Var.q(true);
            vt4Var4 = vt4Var2;
            rte.d(!z3, null, null, null, null, jce.E(-44806641, new oq3(7, vt4Var4), rv4Var), rv4Var, 1572870, 30);
            rv4Var.q(true);
        } else {
            ac9Var2 = ac9Var;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            final ac9 ac9Var3 = ac9Var2;
            final vt4 vt4Var5 = vt4Var4;
            u.d = new lu4(z, z2, z3, z4, vt4Var, vt4Var5, vt4Var3, nq7Var, i) { // from class: tb9
                public final /* synthetic */ vt4 C;
                public final /* synthetic */ vt4 D;
                public final /* synthetic */ nq7 E;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ vt4 f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p3 = xoe.p(1);
                    yqe.l(ac9.this, this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, (rv4) obj, p3);
                    return pvc.a;
                }
            };
        }
    }

    public static final void m(String str, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(897953410);
        if (rv4Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i3 & 1, z)) {
            if ((i3 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var2.P();
            if (z2 || P == ax1.a) {
                P = nmd.G(str);
                rv4Var2.o0(P);
            }
            List list = (List) P;
            if (list.isEmpty()) {
                rv4Var2.e0(1873901003);
                String A = A((y3b) o2b.z0.getValue(), rv4Var2);
                tza tzaVar = j27.a;
                cvb.c(A, nq7Var, zl1.b(0.5f, ((h27) rv4Var2.j(tzaVar)).a.q), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.j, rv4Var, 48, 0, 131064);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(1874173090);
                s9e.f(zbe.C(nq7Var, nae.e, 2.0f, nae.e, nae.e, 13), new hz(6.0f, true, new vs(2)), new hz(4.0f, true, new vs(2)), null, 0, 0, jce.E(274251929, new la(3, list), rv4Var2), rv4Var2, 1573296);
                rv4Var2.q(false);
            }
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new o7(str, nq7Var, i, 12);
        }
    }

    public static final void n(String str, ce9 ce9Var, ce9 ce9Var2, xt4 xt4Var, rv4 rv4Var, int i) {
        String str2;
        int i2;
        boolean z;
        boolean z2;
        dq4 dq4Var;
        long j;
        long j2;
        long g;
        boolean z3;
        boolean z4;
        int i3;
        int ordinal;
        int i4;
        int i5;
        int i6;
        rv4Var.g0(-1595243451);
        if ((i & 6) == 0) {
            str2 = str;
            if (rv4Var.f(str2)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.d(ce9Var.ordinal())) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (ce9Var2 == null) {
                ordinal = -1;
            } else {
                ordinal = ce9Var2.ordinal();
            }
            if (rv4Var.d(ordinal)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(xt4Var)) {
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
        if (rv4Var.U(i2 & 1, z)) {
            if (ce9Var == ce9Var2) {
                z2 = true;
            } else {
                z2 = false;
            }
            tza tzaVar = j27.a;
            oyb oybVar = ((h27) rv4Var.j(tzaVar)).b.k;
            if (z2) {
                dq4Var = dq4.D;
            } else {
                dq4Var = dq4.e;
            }
            if (z2) {
                rv4Var.e0(-84149630);
                j = ((h27) rv4Var.j(tzaVar)).a.b;
                rv4Var.q(false);
            } else {
                rv4Var.e0(-84085150);
                j = ((h27) rv4Var.j(tzaVar)).a.q;
                rv4Var.q(false);
            }
            nq7 k = tte.k(kq7.a, uu9.a);
            if (z2) {
                rv4Var.e0(-83909132);
                j2 = j;
                g = ((h27) rv4Var.j(tzaVar)).a.a;
                rv4Var.q(false);
            } else {
                j2 = j;
                rv4Var.e0(-83830082);
                g = rm1.g(((h27) rv4Var.j(tzaVar)).a, 6.0f);
                rv4Var.q(false);
            }
            nq7 v = nmd.v(k, g, lre.g);
            if ((i2 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i2 & Token.ASSIGN_MOD) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z5 = z3 | z4;
            Object P = rv4Var.P();
            if (z5 || P == ax1.a) {
                P = new mm7(18, xt4Var, ce9Var);
                rv4Var.o0(P);
            }
            cvb.c(str2, zbe.z(lbe.f(15, (vt4) P, v, null, false), 8.0f, 4.0f), j2, null, 0L, null, dq4Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var, i2 & 14, 0, 131000);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new x90(str, ce9Var, ce9Var2, xt4Var, i, 16);
        }
    }

    public static final void o(ce9 ce9Var, xt4 xt4Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int ordinal;
        int i2;
        int i3;
        boolean z;
        kq7 kq7Var;
        rv4Var.g0(1236087173);
        if (ce9Var == null) {
            ordinal = -1;
        } else {
            ordinal = ce9Var.ordinal();
        }
        if (rv4Var.d(ordinal)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var.h(xt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3 | 384;
        if ((i5 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            gv9 a2 = ev9.a(new hz(4.0f, true, new vs(2)), kh5.F, rv4Var, 6);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            kq7 kq7Var2 = kq7.a;
            nq7 p = lye.p(rv4Var, kq7Var2);
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
            int i6 = i5 << 6;
            int i7 = (i6 & 896) | 54 | (i6 & 7168);
            n("Aa", ce9.a, ce9Var, xt4Var, rv4Var, i7);
            n(".*", ce9.b, ce9Var, xt4Var, rv4Var, i7);
            rv4Var.q(true);
            kq7Var = kq7Var2;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new vg7((Object) ce9Var, xt4Var, (Object) kq7Var, i, 11);
        }
    }

    public static final String p(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "VietPhrase";
                    }
                    return "LuatNhan";
                }
                return "PhienAm";
            }
            return "Pronouns";
        }
        return "Name";
    }

    public static final i73 q(i73 i73Var, i73 i73Var2, c7a c7aVar, long j, f6a f6aVar) {
        if (f6aVar != null) {
            int compare = c7aVar.g.compare(Long.valueOf(f6aVar.c), Long.valueOf(j));
            if (compare < 0) {
                return i73.a;
            }
            if (compare > 0) {
                return i73.c;
            }
            return i73.b;
        }
        return nye.A(i73Var, i73Var2);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(defpackage.zl9 r28, java.util.ArrayList r29) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yqe.r(zl9, java.util.ArrayList):void");
    }

    public static final int s(float f, float f2, float f3, int i, int i2) {
        if (i == i2) {
            return -1;
        }
        int i3 = i - 2;
        if (i3 < 0) {
            i3 = 0;
        }
        float f4 = (f2 * i3) + f;
        int i4 = 1;
        int i5 = i - 1;
        if (i5 <= 1) {
            i4 = i5;
        }
        return k27.A((f3 * i4) + f4);
    }

    public static final int t(long j, fvb fvbVar) {
        int i = (int) (4294967295L & j);
        if (Float.intBitsToFloat(i) <= nae.e) {
            return 0;
        }
        float intBitsToFloat = Float.intBitsToFloat(i);
        it7 it7Var = fvbVar.b;
        if (intBitsToFloat >= it7Var.e) {
            return fvbVar.a.a.b.length();
        }
        return it7Var.g(j);
    }

    public static final Object u(y3b y3bVar, m42 m42Var) {
        tza tzaVar = fr9.a;
        return w(y3bVar, ns2.a, (sq9) vq9.c.invoke(), m42Var);
    }

    public static final Object v(y3b y3bVar, Object[] objArr, m42 m42Var) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(obj.toString());
        }
        tza tzaVar = fr9.a;
        return x(y3bVar, arrayList, ns2.a, (sq9) vq9.c.invoke(), m42Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(defpackage.y3b r4, defpackage.ns2 r5, defpackage.sq9 r6, defpackage.m42 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.z3b
            if (r0 == 0) goto L13
            r0 = r7
            z3b r0 = (defpackage.z3b) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            z3b r0 = new z3b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.b
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r7)
            goto L3e
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r7)
            cr9 r4 = defpackage.vq9.a(r4, r6)
            r0.b = r2
            java.lang.Object r7 = defpackage.b4b.a(r4, r5, r0)
            n82 r4 = defpackage.n82.a
            if (r7 != r4) goto L3e
            return r4
        L3e:
            r7.getClass()
            u3b r7 = (defpackage.u3b) r7
            java.lang.String r4 = r7.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yqe.w(y3b, ns2, sq9, m42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object x(defpackage.y3b r4, java.util.ArrayList r5, defpackage.ns2 r6, defpackage.sq9 r7, defpackage.m42 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.a4b
            if (r0 == 0) goto L13
            r0 = r8
            a4b r0 = (defpackage.a4b) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            a4b r0 = new a4b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            java.util.ArrayList r5 = r0.a
            defpackage.hre.r(r8)
            goto L3e
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r8)
            r0.a = r5
            r0.c = r2
            java.lang.Object r8 = w(r4, r6, r7, r0)
            n82 r4 = defpackage.n82.a
            if (r8 != r4) goto L3e
            return r4
        L3e:
            java.lang.String r8 = (java.lang.String) r8
            gm9 r4 = defpackage.b4b.a
            r8.getClass()
            r5.getClass()
            gm9 r4 = defpackage.b4b.a
            vd1 r6 = new vd1
            r7 = 5
            r6.<init>(r7, r5)
            java.lang.String r4 = r4.h(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yqe.x(y3b, java.util.ArrayList, ns2, sq9, m42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:231:0x0546, code lost:
        if (r13 < ' ') goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x06c1, code lost:
        r32 = r2;
        r33 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ca, code lost:
        if (r5 != 2) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x08d8  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0953  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0958  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0996  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x099c  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x09b3  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x09ef  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0acb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0bf1  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x0b3a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v9, types: [zl9, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.j06 y(byte[] r50) {
        /*
            Method dump skipped, instructions count: 3190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yqe.y(byte[]):j06");
    }

    public static final Object z(xn6 xn6Var, lu4 lu4Var, aab aabVar) {
        Object p;
        if (xn6Var.h != kn6.a && (p = k27.p(new jk8(xn6Var, lu4Var, (m42) null, 13), aabVar)) == n82.a) {
            return p;
        }
        return pvc.a;
    }
}
