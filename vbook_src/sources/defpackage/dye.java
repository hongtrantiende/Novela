package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.ListIterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dye  reason: default package */
/* loaded from: classes.dex */
public abstract class dye {
    public static final tu1 a = new tu1(new iv1(29), false, -767946677);
    public static final tu1 b = new tu1(new jv1(23), false, 1666920775);
    public static final tu1 c = new tu1(new jv1(24), false, 631720707);
    public static final tu1 d = new tu1(new jv1(25), false, -1916154502);
    public static final hid e = new hid(0.31006f, 0.31616f);
    public static final hid f = new hid(0.34567f, 0.3585f);
    public static final hid g = new hid(0.32168f, 0.33767f);
    public static final hid h = new hid(0.31271f, 0.32902f);
    public static final float[] i = {0.964212f, 1.0f, 0.825188f};

    public static final long A(long j) {
        if (j != z78.c) {
            float b2 = z78.b(j);
            return (Float.floatToRawIntBits(z78.c(j)) & 4294967295L) | (Float.floatToRawIntBits(b2) << 32);
        }
        return 9205357640488583168L;
    }

    public static final void a(tu1 tu1Var, rv4 rv4Var, int i2) {
        boolean z;
        rv4Var.g0(-1162635549);
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            pye.a(o7a.a.a(null), tu1Var, rv4Var, 56);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new x0a(i2, 15, tu1Var);
        }
    }

    public static final void b(nq7 nq7Var, tu1 tu1Var, rv4 rv4Var, int i2, int i3) {
        int i4;
        int i5;
        boolean z;
        int i6;
        rv4Var.g0(1949207773);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.h(tu1Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i4 & 1, z)) {
            if (i7 != 0) {
                nq7Var = kq7.a;
            }
            Object[] objArr = new Object[0];
            yy9 yy9Var = q7a.d;
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = new zt9(20);
                rv4Var.o0(P);
            }
            c(nq7Var, (q7a) zpe.m(objArr, yy9Var, (vt4) P, rv4Var, 384), tu1Var, rv4Var, ((i4 << 6) & 7168) | (i4 & 14));
        } else {
            rv4Var.X();
        }
        nq7 nq7Var2 = nq7Var;
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ns1(i2, i3, 5, nq7Var2, tu1Var);
        }
    }

    public static final void c(nq7 nq7Var, final q7a q7aVar, tu1 tu1Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        boolean i4;
        int i5;
        int i6;
        int i7;
        rv4Var.g0(-1922770793);
        if ((i2 & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.h(q7aVar)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        int i8 = i3 | 384;
        if ((i2 & 3072) == 0) {
            if (rv4Var.h(tu1Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i8 |= i5;
        }
        if ((i8 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i8 & 1, z)) {
            Object[] objArr = new Object[0];
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (P == obj) {
                P = new zt9(18);
                rv4Var.o0(P);
            }
            n7a n7aVar = (n7a) zpe.m(objArr, n7a.l, (vt4) P, rv4Var, 384);
            Object P2 = rv4Var.P();
            if (P2 == obj) {
                P2 = new f7a(n7aVar);
                rv4Var.o0(P2);
            }
            final f7a f7aVar = (f7a) P2;
            rv4Var.e0(714821931);
            rv4Var.q(false);
            Object obj2 = (pj1) rv4Var.j(dy1.f);
            Object P3 = rv4Var.P();
            if (P3 == obj) {
                P3 = yte.s(rv4Var);
                rv4Var.o0(P3);
            }
            m82 m82Var = (m82) P3;
            f7aVar.e = (s35) rv4Var.j(dy1.l);
            boolean f2 = rv4Var.f(m82Var) | rv4Var.f(obj2);
            Object P4 = rv4Var.P();
            if (f2 || P4 == obj) {
                P4 = new cn9(7, m82Var, obj2);
                rv4Var.o0(P4);
            }
            f7aVar.f = (xt4) P4;
            v2c v2cVar = (v2c) rv4Var.j(dy1.r);
            f7aVar.o(q7aVar.a());
            boolean h2 = rv4Var.h(q7aVar) | rv4Var.h(f7aVar);
            Object P5 = rv4Var.P();
            if (h2 || P5 == obj) {
                P5 = new xt4() { // from class: k6a
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v3, types: [ks3] */
                    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj3) {
                        Object obj4;
                        int i9;
                        int i10 = r3;
                        f7a f7aVar2 = f7aVar;
                        q7a q7aVar2 = q7aVar;
                        switch (i10) {
                            case 0:
                                q7aVar2.a.setValue((g6a) obj3);
                                n7a n7aVar2 = f7aVar2.a;
                                if (f7aVar2.i() != null && n7aVar2.a().e != 0) {
                                    obj4 = new ArrayList();
                                    ArrayList e2 = n7aVar2.e(f7aVar2.m());
                                    ListIterator listIterator = e2.listIterator(e2.size());
                                    while (true) {
                                        if (listIterator.hasPrevious()) {
                                            g6a g6aVar = (g6a) n7aVar2.a().e(((cu7) listIterator.previous()).a);
                                            if (g6aVar != null && g6aVar.a.b != g6aVar.b.b) {
                                                i9 = listIterator.nextIndex();
                                            }
                                        } else {
                                            i9 = -1;
                                        }
                                    }
                                    if (i9 != -1) {
                                        int size = e2.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            cu7 cu7Var = (cu7) e2.get(i11);
                                            g6a g6aVar2 = (g6a) n7aVar2.a().e(cu7Var.a);
                                            if (g6aVar2 != null) {
                                                ps e3 = cu7Var.e();
                                                long a2 = sze.a(g6aVar2.a.b, g6aVar2.b.b);
                                                obj4.add(e3.subSequence(fxb.g(a2), fxb.f(a2)));
                                            }
                                        }
                                    }
                                } else {
                                    obj4 = ks3.a;
                                }
                                q7aVar2.c.setValue(obj4);
                                return pvc.a;
                            default:
                                ib3 ib3Var = (ib3) obj3;
                                f7a f7aVar3 = q7aVar2.b;
                                if (f7aVar3 != null && f7aVar3 != f7aVar2) {
                                    vs.k("A SelectionState can only be bound to one SelectionContainer. Please use rememberSelectionState() to create a unique state for each container.");
                                    return null;
                                } else if (f7aVar3 != null && f7aVar3 != f7aVar2) {
                                    vs.k("A SelectionState can only be bound to one SelectionContainer. Please use rememberSelectionState() to create a unique state for each container.");
                                    return null;
                                } else {
                                    q7aVar2.b = f7aVar2;
                                    return new qf0(9, q7aVar2, f7aVar2);
                                }
                        }
                    }
                };
                rv4Var.o0(P5);
            }
            f7aVar.d = new cn9(8, f7aVar, (xt4) P5);
            rv4Var.e0(715702021);
            f7aVar.Q = yx8.b(e6a.b, null, rv4Var, 54);
            rv4Var.q(false);
            f7aVar.P = m82Var;
            f7aVar.k();
            w42 w42Var = new w42(2, f7aVar, new j6a(f7aVar, 2));
            nq7 nq7Var2 = kq7.a;
            nq7 l = tye.l(dab.b(iwe.i(mwe.n(obe.y(dab.b(nq7Var2, pvc.a, w42Var), new m6a(f7aVar, 4)), f7aVar.D), new m6a(f7aVar, 5)).a0(gn4.b), 8675309, new sc(2, new m6a(f7aVar, 6))), new lv0(f7aVar, 3));
            if (f7aVar.h() != null && f7aVar.j()) {
                g6a i9 = f7aVar.i();
                if (i9 == null) {
                    i4 = true;
                } else {
                    i4 = c16.i(i9.a, i9.b);
                }
                if (!i4 && yz6.a()) {
                    nq7Var2 = lye.j(nq7Var2, new pl7(f7aVar, 8));
                }
            }
            oc2.s(nq7Var.a0(f(l.a0(nq7Var2), new el7(f7aVar, 12))), jce.E(464404577, new l6a(f7aVar, n7aVar, tu1Var), rv4Var), rv4Var, 48);
            boolean h3 = rv4Var.h(q7aVar) | rv4Var.h(f7aVar);
            Object P6 = rv4Var.P();
            if (h3 || P6 == obj) {
                P6 = new xt4() { // from class: k6a
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v3, types: [ks3] */
                    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj3) {
                        Object obj4;
                        int i92;
                        int i10 = r3;
                        f7a f7aVar2 = f7aVar;
                        q7a q7aVar2 = q7aVar;
                        switch (i10) {
                            case 0:
                                q7aVar2.a.setValue((g6a) obj3);
                                n7a n7aVar2 = f7aVar2.a;
                                if (f7aVar2.i() != null && n7aVar2.a().e != 0) {
                                    obj4 = new ArrayList();
                                    ArrayList e2 = n7aVar2.e(f7aVar2.m());
                                    ListIterator listIterator = e2.listIterator(e2.size());
                                    while (true) {
                                        if (listIterator.hasPrevious()) {
                                            g6a g6aVar = (g6a) n7aVar2.a().e(((cu7) listIterator.previous()).a);
                                            if (g6aVar != null && g6aVar.a.b != g6aVar.b.b) {
                                                i92 = listIterator.nextIndex();
                                            }
                                        } else {
                                            i92 = -1;
                                        }
                                    }
                                    if (i92 != -1) {
                                        int size = e2.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            cu7 cu7Var = (cu7) e2.get(i11);
                                            g6a g6aVar2 = (g6a) n7aVar2.a().e(cu7Var.a);
                                            if (g6aVar2 != null) {
                                                ps e3 = cu7Var.e();
                                                long a2 = sze.a(g6aVar2.a.b, g6aVar2.b.b);
                                                obj4.add(e3.subSequence(fxb.g(a2), fxb.f(a2)));
                                            }
                                        }
                                    }
                                } else {
                                    obj4 = ks3.a;
                                }
                                q7aVar2.c.setValue(obj4);
                                return pvc.a;
                            default:
                                ib3 ib3Var = (ib3) obj3;
                                f7a f7aVar3 = q7aVar2.b;
                                if (f7aVar3 != null && f7aVar3 != f7aVar2) {
                                    vs.k("A SelectionState can only be bound to one SelectionContainer. Please use rememberSelectionState() to create a unique state for each container.");
                                    return null;
                                } else if (f7aVar3 != null && f7aVar3 != f7aVar2) {
                                    vs.k("A SelectionState can only be bound to one SelectionContainer. Please use rememberSelectionState() to create a unique state for each container.");
                                    return null;
                                } else {
                                    q7aVar2.b = f7aVar2;
                                    return new qf0(9, q7aVar2, f7aVar2);
                                }
                        }
                    }
                };
                rv4Var.o0(P6);
            }
            yte.c(q7aVar, f7aVar, (xt4) P6, rv4Var);
            boolean h4 = rv4Var.h(f7aVar);
            Object P7 = rv4Var.P();
            if (h4 || P7 == obj) {
                P7 = new m6a(f7aVar, 0);
                rv4Var.o0(P7);
            }
            yte.b(f7aVar, (xt4) P7, rv4Var);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new va(nq7Var, (Object) q7aVar, (hu4) tu1Var, i2, 25);
        }
    }

    public static final boolean d(oyb oybVar) {
        ur3 ur3Var;
        ox8 ox8Var;
        gy8 gy8Var = oybVar.c;
        if (gy8Var != null && (ox8Var = gy8Var.b) != null) {
            ur3Var = new ur3(ox8Var.b);
        } else {
            ur3Var = null;
        }
        boolean z = false;
        if (ur3Var != null && ur3Var.a == 1) {
            z = true;
        }
        return !z;
    }

    public static final int[] e(String str) {
        int[] iArr = new int[256];
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = -1;
        }
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            iArr[str.charAt(i3)] = i3;
        }
        return iArr;
    }

    public static final nq7 f(nq7 nq7Var, lu4 lu4Var) {
        return nq7Var.a0(new f8(lu4Var));
    }

    public static final float[] g(cs5 cs5Var, long j) {
        cs5Var.getClass();
        long j2 = cs5Var.c;
        long j3 = cs5Var.b;
        int i2 = cs5Var.a;
        if (i2 == 0) {
            if (y78.d(j3, (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L))) {
                return m27.a;
            }
        }
        float[] a2 = l27.a();
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * ((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) * ((int) (j >> 32))) << 32);
        int i3 = (int) (floatToRawIntBits >> 32);
        int i4 = (int) (floatToRawIntBits & 4294967295L);
        l27.k(a2, Float.intBitsToFloat(i3), Float.intBitsToFloat(i4));
        l27.g(i2, a2);
        l27.h(a2, Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)));
        l27.k(a2, -Float.intBitsToFloat(i3), -Float.intBitsToFloat(i4));
        return a2;
    }

    public static final LinkedHashMap h(ArrayList arrayList) {
        String str = hn8.b;
        hn8 d2 = fn8.d("/", false);
        LinkedHashMap t = o17.t(new yk8(d2, new vpd(d2, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (vpd vpdVar : sl1.u0(arrayList, new roa(19))) {
            if (((vpd) t.put(vpdVar.a, vpdVar)) == null) {
                while (true) {
                    hn8 hn8Var = vpdVar.a;
                    hn8 c2 = hn8Var.c();
                    if (c2 != null) {
                        vpd vpdVar2 = (vpd) t.get(c2);
                        if (vpdVar2 != null) {
                            vpdVar2.q.add(hn8Var);
                            break;
                        }
                        vpd vpdVar3 = new vpd(c2, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        t.put(c2, vpdVar3);
                        vpdVar3.q.add(hn8Var);
                        vpdVar = vpdVar3;
                    }
                }
            }
        }
        return t;
    }

    public static void i(long j, String str) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    public static void j(boolean z) {
        if (z) {
            return;
        }
        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
    }

    public static final qu3 k(Enum[] enumArr) {
        enumArr.getClass();
        return new qu3(enumArr);
    }

    public static String l(c31 c31Var) {
        StringBuilder sb = new StringBuilder(c31Var.size());
        for (int i2 = 0; i2 < c31Var.size(); i2++) {
            byte a2 = c31Var.a(i2);
            if (a2 != 34) {
                if (a2 != 39) {
                    if (a2 != 92) {
                        switch (a2) {
                            case 7:
                                sb.append("\\a");
                                continue;
                            case 8:
                                sb.append("\\b");
                                continue;
                            case 9:
                                sb.append("\\t");
                                continue;
                            case 10:
                                sb.append("\\n");
                                continue;
                            case 11:
                                sb.append("\\v");
                                continue;
                            case 12:
                                sb.append("\\f");
                                continue;
                            case 13:
                                sb.append("\\r");
                                continue;
                            default:
                                if (a2 >= 32 && a2 <= 126) {
                                    sb.append((char) a2);
                                    continue;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((a2 >>> 6) & 3) + 48));
                                    sb.append((char) (((a2 >>> 3) & 7) + 48));
                                    sb.append((char) ((a2 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    public static final String m(int i2) {
        nqe.u(16);
        String num = Integer.toString(i2, 16);
        num.getClass();
        return "0x".concat(num);
    }

    public static final fqd n(hn8 hn8Var, pe4 pe4Var, xt4 xt4Var) {
        Throwable th;
        Throwable th2;
        int q;
        pe4Var.getClass();
        x56 N0 = pe4Var.N0(hn8Var);
        try {
            long size = N0.size();
            long j = size - 22;
            if (j >= 0) {
                long max = Math.max(size - 65558, 0L);
                while (true) {
                    mj9 mj9Var = new mj9(N0.G(j));
                    if (mj9Var.q() == 101010256) {
                        int G = mj9Var.G() & 65535;
                        int G2 = mj9Var.G() & 65535;
                        long G3 = mj9Var.G() & 65535;
                        if (G3 == (mj9Var.G() & 65535) && G == 0 && G2 == 0) {
                            mj9Var.skip(4L);
                            int G4 = mj9Var.G() & 65535;
                            od0 od0Var = new od0(G3, 4294967295L & mj9Var.q(), G4);
                            mj9Var.Q(G4);
                            mj9Var.close();
                            long j2 = j - 20;
                            if (j2 > 0) {
                                mj9 mj9Var2 = new mj9(N0.G(j2));
                                if (mj9Var2.q() == 117853008) {
                                    int q2 = mj9Var2.q();
                                    long C = mj9Var2.C();
                                    if (mj9Var2.q() == 1 && q2 == 0) {
                                        mj9 mj9Var3 = new mj9(N0.G(C));
                                        try {
                                        } catch (Throwable th3) {
                                            try {
                                                mj9Var3.close();
                                            } catch (Throwable th4) {
                                                pye.e(th3, th4);
                                            }
                                            th2 = th3;
                                        }
                                        if (mj9Var3.q() == 101075792) {
                                            mj9Var3.skip(12L);
                                            int q3 = mj9Var3.q();
                                            int q4 = mj9Var3.q();
                                            long C2 = mj9Var3.C();
                                            if (C2 == mj9Var3.C() && q3 == 0 && q4 == 0) {
                                                mj9Var3.skip(8L);
                                                od0 od0Var2 = new od0(C2, mj9Var3.C(), G4);
                                                try {
                                                    mj9Var3.close();
                                                    th2 = null;
                                                } catch (Throwable th5) {
                                                    th2 = th5;
                                                }
                                                od0Var = od0Var2;
                                                if (th2 != null) {
                                                    throw th2;
                                                }
                                            } else {
                                                throw new IOException("unsupported zip: spanned");
                                            }
                                        } else {
                                            throw new IOException("bad zip: expected " + m(101075792) + " but was " + m(q));
                                        }
                                    } else {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                }
                                try {
                                    mj9Var2.close();
                                    th = null;
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                                if (th != null) {
                                    throw th;
                                }
                            }
                            ArrayList arrayList = new ArrayList();
                            mj9 mj9Var4 = new mj9(N0.G(od0Var.c));
                            long j3 = od0Var.b;
                            for (long j4 = 0; j4 < j3; j4++) {
                                vpd o = o(mj9Var4);
                                if (o.h < od0Var.c) {
                                    if (((Boolean) xt4Var.invoke(o)).booleanValue()) {
                                        arrayList.add(o);
                                    }
                                } else {
                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                }
                            }
                            try {
                                mj9Var4.close();
                                th = null;
                            } catch (Throwable th7) {
                                th = th7;
                            }
                            if (th == null) {
                                fqd fqdVar = new fqd(hn8Var, pe4Var, h(arrayList));
                                try {
                                    N0.close();
                                } catch (Throwable unused) {
                                }
                                return fqdVar;
                            }
                            throw th;
                        }
                        throw new IOException("unsupported zip: spanned");
                    }
                    mj9Var.close();
                    j--;
                    if (j < max) {
                        throw new IOException("not a zip: end of central directory signature not found");
                    }
                }
            } else {
                throw new IOException("not a zip: size=" + N0.size());
            }
        } catch (Throwable th8) {
            if (N0 != null) {
                try {
                    N0.close();
                } catch (Throwable th9) {
                    pye.e(th8, th9);
                }
            }
            throw th8;
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [vl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [yl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [yl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [yl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [zl9, java.lang.Object] */
    public static final vpd o(final mj9 mj9Var) {
        long j;
        int q = mj9Var.q();
        if (q == 33639248) {
            mj9Var.skip(4L);
            short G = mj9Var.G();
            int i2 = G & 65535;
            if ((G & 1) == 0) {
                int G2 = mj9Var.G() & 65535;
                int G3 = mj9Var.G() & 65535;
                int G4 = mj9Var.G() & 65535;
                long q2 = mj9Var.q() & 4294967295L;
                final ?? obj = new Object();
                obj.a = mj9Var.q() & 4294967295L;
                final ?? obj2 = new Object();
                obj2.a = mj9Var.q() & 4294967295L;
                int G5 = mj9Var.G() & 65535;
                int G6 = mj9Var.G() & 65535;
                mj9Var.skip(8L);
                final ?? obj3 = new Object();
                obj3.a = mj9Var.q() & 4294967295L;
                String Q = mj9Var.Q(mj9Var.G() & 65535);
                if (!k4b.W(Q, (char) 0)) {
                    if (obj2.a == 4294967295L) {
                        j = 8;
                    } else {
                        j = 0;
                    }
                    if (obj.a == 4294967295L) {
                        j += 8;
                    }
                    if (obj3.a == 4294967295L) {
                        j += 8;
                    }
                    final long j2 = j;
                    final ?? obj4 = new Object();
                    final ?? obj5 = new Object();
                    final ?? obj6 = new Object();
                    final ?? obj7 = new Object();
                    p(mj9Var, G5, new lu4() { // from class: hqd
                        @Override // defpackage.lu4
                        public final Object invoke(Object obj8, Object obj9) {
                            long j3;
                            int intValue = ((Integer) obj8).intValue();
                            long longValue = ((Long) obj9).longValue();
                            mj9 mj9Var2 = mj9Var;
                            if (intValue != 1) {
                                if (intValue == 10) {
                                    if (longValue >= 4) {
                                        mj9Var2.skip(4L);
                                        dye.p(mj9Var2, (int) (longValue - 4), new gqd(obj4, mj9Var2, obj5, obj6));
                                    } else {
                                        fb4.k("bad zip: NTFS extra too short");
                                        return null;
                                    }
                                }
                            } else {
                                vl9 vl9Var = vl9.this;
                                if (!vl9Var.a) {
                                    vl9Var.a = true;
                                    if (longValue >= j2) {
                                        yl9 yl9Var = obj2;
                                        long j4 = yl9Var.a;
                                        if (j4 == 4294967295L) {
                                            j4 = mj9Var2.C();
                                        }
                                        yl9Var.a = j4;
                                        yl9 yl9Var2 = obj;
                                        long j5 = 0;
                                        if (yl9Var2.a == 4294967295L) {
                                            j3 = mj9Var2.C();
                                        } else {
                                            j3 = 0;
                                        }
                                        yl9Var2.a = j3;
                                        yl9 yl9Var3 = obj3;
                                        if (yl9Var3.a == 4294967295L) {
                                            j5 = mj9Var2.C();
                                        }
                                        yl9Var3.a = j5;
                                    } else {
                                        fb4.k("bad zip: zip64 extra too short");
                                        return null;
                                    }
                                } else {
                                    fb4.k("bad zip: zip64 extra repeated");
                                    return null;
                                }
                            }
                            return pvc.a;
                        }
                    });
                    if (j2 > 0 && !obj7.a) {
                        fb4.k("bad zip: zip64 extra required but absent");
                        return null;
                    }
                    String Q2 = mj9Var.Q(G6);
                    String str = hn8.b;
                    return new vpd(fn8.d("/", false).e(Q), r4b.I(Q, "/", false), Q2, q2, obj.a, obj2.a, G2, obj3.a, G4, G3, (Long) obj4.a, (Long) obj5.a, (Long) obj6.a, 57344);
                }
                fb4.k("bad zip: filename contains 0x00");
                return null;
            }
            fb4.k("unsupported zip: general purpose bit flag=".concat(m(i2)));
            return null;
        }
        throw new IOException("bad zip: expected " + m(33639248) + " but was " + m(q));
    }

    public static final void p(mj9 mj9Var, int i2, lu4 lu4Var) {
        my0 my0Var = mj9Var.b;
        long j = i2;
        while (j != 0) {
            if (j >= 4) {
                int G = mj9Var.G() & 65535;
                long G2 = mj9Var.G() & 65535;
                long j2 = j - 4;
                if (j2 >= G2) {
                    mj9Var.w(G2);
                    long j3 = my0Var.b;
                    lu4Var.invoke(Integer.valueOf(G), Long.valueOf(G2));
                    long j4 = (my0Var.b + G2) - j3;
                    int i3 = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
                    if (i3 >= 0) {
                        if (i3 > 0) {
                            my0Var.skip(j4);
                        }
                        j = j2 - G2;
                    } else {
                        fb4.k(a82.j(G, "unsupported zip: too many bytes processed for "));
                        return;
                    }
                } else {
                    fb4.k("bad zip: truncated value in extra field");
                    return;
                }
            } else {
                fb4.k("bad zip: truncated header in extra field");
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [zl9, java.lang.Object] */
    public static final vpd q(mj9 mj9Var, vpd vpdVar) {
        int q = mj9Var.q();
        if (q == 67324752) {
            mj9Var.skip(2L);
            short G = mj9Var.G();
            int i2 = G & 65535;
            if ((G & 1) == 0) {
                mj9Var.skip(18L);
                int G2 = mj9Var.G() & 65535;
                mj9Var.skip(mj9Var.G() & 65535);
                if (vpdVar == null) {
                    mj9Var.skip(G2);
                    return null;
                }
                ?? obj = new Object();
                ?? obj2 = new Object();
                ?? obj3 = new Object();
                p(mj9Var, G2, new gqd(mj9Var, (zl9) obj, (zl9) obj2, (zl9) obj3));
                return new vpd(vpdVar.a, vpdVar.b, vpdVar.c, vpdVar.d, vpdVar.e, vpdVar.f, vpdVar.g, vpdVar.h, vpdVar.i, vpdVar.j, vpdVar.k, vpdVar.l, vpdVar.m, (Integer) obj.a, (Integer) obj2.a, (Integer) obj3.a);
            }
            fb4.k("unsupported zip: general purpose bit flag=".concat(m(i2)));
            return null;
        }
        String m = m(67324752);
        String m2 = m(q);
        throw new IOException("bad zip: expected " + m + " but was " + m2);
    }

    public static final uy5 r(sk9 sk9Var) {
        sk9Var.getClass();
        return new uy5(k27.A(sk9Var.a), k27.A(sk9Var.b), k27.A(sk9Var.c), k27.A(sk9Var.d));
    }

    public static final akc s(zjc zjcVar) {
        zjcVar.getClass();
        long j = zjcVar.a;
        long a2 = mz9.a(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        long t = t(zjcVar.b);
        float f2 = zjcVar.c;
        long j2 = zjcVar.d;
        long a3 = ekc.a(ckc.b(j2), ckc.c(j2));
        long j3 = zjcVar.e;
        return new akc(a2, t, f2, a3, ekc.a(ckc.b(j3), ckc.c(j3)));
    }

    public static final long t(long j) {
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            return mue.b(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
        int i2 = z78.d;
        return z78.c;
    }

    public static final long u(long j) {
        return eh.c((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final uy5 v(vy5 vy5Var) {
        vy5Var.getClass();
        return new uy5(vy5Var.a, vy5Var.b, vy5Var.c, vy5Var.d);
    }

    public static final rk9 w(sk9 sk9Var) {
        sk9Var.getClass();
        return new rk9(sk9Var.a, sk9Var.b, sk9Var.c, sk9Var.d);
    }

    public static final zjc x(akc akcVar) {
        akcVar.getClass();
        long z = z(akcVar.a);
        long A = A(akcVar.b);
        float f2 = akcVar.c;
        long j = akcVar.d;
        int i2 = dkc.b;
        long j2 = y9e.j(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        long j3 = akcVar.e;
        return new zjc(z, A, f2, j2, y9e.j(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L))));
    }

    public static final long y(long j) {
        int i2 = az5.c;
        return (((int) (j & 4294967295L)) & 4294967295L) | (((int) (j >> 32)) << 32);
    }

    public static final long z(long j) {
        float b2 = lz9.b(j);
        long floatToRawIntBits = (Float.floatToRawIntBits(lz9.c(j)) & 4294967295L) | (Float.floatToRawIntBits(b2) << 32);
        int i2 = kz9.c;
        return floatToRawIntBits;
    }
}
