package defpackage;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bbe  reason: default package */
/* loaded from: classes3.dex */
public abstract class bbe {
    public static final tu1 a = new tu1(new pv1(27), false, -1459611537);
    public static final tu1 b = new tu1(new pv1(28), false, 850587340);
    public static final tu1 c = new tu1(new rv1(9), false, 1058921160);
    public static final tu1 d = new tu1(new rv1(10), false, -609989388);
    public static final tu1 e = new tu1(new rv1(11), false, -1645288681);
    public static final int[] f = {13, 15, 14};

    public static final long A(byte[] bArr, int i) {
        bArr.getClass();
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static String B(qpe qpeVar) {
        StringBuilder sb = new StringBuilder(qpeVar.d());
        for (int i = 0; i < qpeVar.d(); i++) {
            byte a2 = qpeVar.a(i);
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

    public static final void a(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var) {
        int i2;
        boolean z;
        rv4 rv4Var2;
        rv4Var.g0(-659368939);
        if (rv4Var.h(vt4Var)) {
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
        if (rv4Var.U(i3 & 1, z)) {
            rv4Var2 = rv4Var;
            hc2.b(pna.f(kq7.a, 1.0f), null, jce.E(-1738384513, new t81(nq7Var, vt4Var, 14), rv4Var), rv4Var2, 3078, 6);
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new u81(nq7Var, vt4Var, i, 0);
        }
    }

    public static final void b(cia ciaVar, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        nq7 nq7Var2;
        rv4 rv4Var2;
        rv4Var.g0(2082250958);
        if (rv4Var.f(ciaVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (rv4Var.f(nq7Var)) {
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
            if (ciaVar != null) {
                rv4Var.e0(125738556);
                nq7Var2 = nq7Var;
                rv4Var2 = rv4Var;
                do5.c(ciaVar.a, ciaVar.b, ciaVar.c, ciaVar.e, r0f.d, nq7Var2, rv4Var2, ((i5 << 12) & 458752) | 24576);
                rv4Var2.q(false);
            } else {
                nq7Var2 = nq7Var;
                rv4Var2 = rv4Var;
                rv4Var2.e0(125984076);
                fu0.a(nq7Var2, rv4Var2, (i5 >> 3) & 14);
                rv4Var2.q(false);
            }
        } else {
            nq7Var2 = nq7Var;
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ah7(ciaVar, nq7Var2, i, 14);
        }
    }

    public static final void c(cz7 cz7Var, rh8 rh8Var, bkd bkdVar, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        nq7 nq7Var2;
        pb2 pb2Var;
        aw7 aw7Var;
        Object obj;
        boolean z2;
        cz7Var.getClass();
        rv4Var.g0(1591188759);
        if (rv4Var.f(cz7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.f(rh8Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var.f(bkdVar)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        if ((i7 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i7 & 1, z)) {
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                final g91 g91Var = (g91) ((fdd) voe.z(cm9.a(g91.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z3 = jsc.z(g91Var.e, rv4Var);
                Object[] objArr = new Object[0];
                Object P = rv4Var.P();
                Object obj2 = ax1.a;
                if (P == obj2) {
                    P = new mf0(22);
                    rv4Var.o0(P);
                }
                aw7 aw7Var2 = (aw7) zpe.k(objArr, (vt4) P, rv4Var, 48);
                b37 d2 = fu0.d(kh5.a, false);
                int hashCode = Long.hashCode(rv4Var.T);
                xt8 l = rv4Var.l();
                nq7Var2 = nq7Var;
                nq7 p = lye.p(rv4Var, nq7Var2);
                rw1.k.getClass();
                vt4 vt4Var = qw1.b;
                rv4Var.i0();
                if (rv4Var.S) {
                    rv4Var.k(vt4Var);
                } else {
                    rv4Var.r0();
                }
                jce.F(qw1.f, rv4Var, d2);
                jce.F(qw1.e, rv4Var, l);
                jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
                jce.C(qw1.h, rv4Var);
                jce.F(qw1.d, rv4Var, p);
                if (((d91) z3.getValue()).a) {
                    rv4Var.e0(-825137917);
                    rv4Var.q(false);
                    aw7Var = aw7Var2;
                    obj = obj2;
                } else if (((d91) z3.getValue()).b.isEmpty()) {
                    rv4Var.e0(-825048916);
                    ar5 F = owe.F(rv4Var);
                    String A = yqe.A((y3b) o2b.i0.getValue(), rv4Var);
                    String A2 = yqe.A((y3b) o2b.j0.getValue(), rv4Var);
                    String A3 = yqe.A((y3b) v1b.i.getValue(), rv4Var);
                    nq7 x = zbe.x(zbe.A(pna.c, 12.0f, nae.e, 2), rh8Var);
                    boolean f2 = rv4Var.f(aw7Var2);
                    Object P2 = rv4Var.P();
                    if (f2 || P2 == obj2) {
                        P2 = new en(aw7Var2, 28);
                        rv4Var.o0(P2);
                    }
                    aw7Var = aw7Var2;
                    jxe.d(F, A, A2, x, A3, (vt4) P2, rv4Var, 0, 0);
                    rv4Var.q(false);
                    obj = obj2;
                } else {
                    aw7Var = aw7Var2;
                    obj = obj2;
                    rv4Var.e0(-824430125);
                    List list = ((d91) z3.getValue()).b;
                    ze4 ze4Var = pna.c;
                    if ((i7 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Object P3 = rv4Var.P();
                    if (z2 || P3 == obj) {
                        P3 = new ar0(cz7Var, 1);
                        rv4Var.o0(P3);
                    }
                    xt4 xt4Var = (xt4) P3;
                    boolean f3 = rv4Var.f(aw7Var);
                    Object P4 = rv4Var.P();
                    if (f3 || P4 == obj) {
                        P4 = new en(aw7Var, 29);
                        rv4Var.o0(P4);
                    }
                    vt4 vt4Var2 = (vt4) P4;
                    boolean f4 = rv4Var.f(g91Var);
                    Object P5 = rv4Var.P();
                    if (f4 || P5 == obj) {
                        P5 = new xt4() { // from class: v81
                            @Override // defpackage.xt4
                            public final Object invoke(Object obj3) {
                                Object value;
                                int i8 = r2;
                                pvc pvcVar = pvc.a;
                                g91 g91Var2 = g91Var;
                                switch (i8) {
                                    case 0:
                                        List list2 = (List) obj3;
                                        list2.getClass();
                                        cza czaVar = g91Var2.e;
                                        if (czaVar != null) {
                                            do {
                                                value = czaVar.getValue();
                                            } while (!czaVar.l(value, new d91(list2, ((d91) value).a)));
                                            hk1 a3 = jdd.a(g91Var2);
                                            sw2 sw2Var = ab3.a;
                                            g91Var2.f(a3, ru2.c, new cv0(g91Var2, list2, null, 6));
                                            return pvcVar;
                                        }
                                        hk1 a32 = jdd.a(g91Var2);
                                        sw2 sw2Var2 = ab3.a;
                                        g91Var2.f(a32, ru2.c, new cv0(g91Var2, list2, null, 6));
                                        return pvcVar;
                                    default:
                                        String str = (String) obj3;
                                        str.getClass();
                                        fdd.g(g91Var2, jdd.a(g91Var2), new n0(g91Var2, str, null, 18));
                                        return pvcVar;
                                }
                            }
                        };
                        rv4Var.o0(P5);
                    }
                    e(list, rh8Var, bkdVar, ze4Var, xt4Var, vt4Var2, (xt4) P5, rv4Var, (i7 & Token.ASSIGN_MOD) | 3072 | (i7 & 896));
                    rv4Var.q(false);
                }
                rv4Var.q(true);
                String A4 = yqe.A((y3b) v1b.i.getValue(), rv4Var);
                boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
                boolean f5 = rv4Var.f(aw7Var);
                Object P6 = rv4Var.P();
                if (f5 || P6 == obj) {
                    P6 = new s7(aw7Var, 15);
                    rv4Var.o0(P6);
                }
                xt4 xt4Var2 = (xt4) P6;
                boolean f6 = rv4Var.f(g91Var);
                Object P7 = rv4Var.P();
                if (f6 || P7 == obj) {
                    P7 = new xt4() { // from class: v81
                        @Override // defpackage.xt4
                        public final Object invoke(Object obj3) {
                            Object value;
                            int i8 = r2;
                            pvc pvcVar = pvc.a;
                            g91 g91Var2 = g91Var;
                            switch (i8) {
                                case 0:
                                    List list2 = (List) obj3;
                                    list2.getClass();
                                    cza czaVar = g91Var2.e;
                                    if (czaVar != null) {
                                        do {
                                            value = czaVar.getValue();
                                        } while (!czaVar.l(value, new d91(list2, ((d91) value).a)));
                                        hk1 a32 = jdd.a(g91Var2);
                                        sw2 sw2Var2 = ab3.a;
                                        g91Var2.f(a32, ru2.c, new cv0(g91Var2, list2, null, 6));
                                        return pvcVar;
                                    }
                                    hk1 a322 = jdd.a(g91Var2);
                                    sw2 sw2Var22 = ab3.a;
                                    g91Var2.f(a322, ru2.c, new cv0(g91Var2, list2, null, 6));
                                    return pvcVar;
                                default:
                                    String str = (String) obj3;
                                    str.getClass();
                                    fdd.g(g91Var2, jdd.a(g91Var2), new n0(g91Var2, str, null, 18));
                                    return pvcVar;
                            }
                        }
                    };
                    rv4Var.o0(P7);
                }
                w92.e(booleanValue, A4, null, xt4Var2, (xt4) P7, rv4Var, 0, 4);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            nq7Var2 = nq7Var;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new i31(cz7Var, rh8Var, bkdVar, nq7Var2, i, 14);
        }
    }

    public static final void d(s81 s81Var, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(598184291);
        if (rv4Var2.f(s81Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var2.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var2.h(vt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i7 & 1, z)) {
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
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
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            kq7 kq7Var = kq7.a;
            hc2.b(pna.f(kq7Var, 1.0f), null, jce.E(1031788567, new t81(0, vt4Var, s81Var), rv4Var2), rv4Var2, 3078, 6);
            cvb.c(s81Var.b, l0e.u(zbe.A(kq7Var, 8.0f, nae.e, 2).a0(pna.c)), 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 1, 0, null, ((h27) rv4Var2.j(j27.a)).b.k, rv4Var, 48, 24576, 113660);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ax(s81Var, nq7Var, vt4Var, i, 12);
        }
    }

    public static final void e(List list, rh8 rh8Var, bkd bkdVar, nq7 nq7Var, xt4 xt4Var, vt4 vt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        Object obj;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean h;
        int i8;
        rv4Var.g0(1821825498);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var.f(list);
            } else {
                h = rv4Var.h(list);
            }
            if (h) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(rh8Var)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(nq7Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.h(xt4Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(vt4Var)) {
                i4 = 131072;
            } else {
                i4 = Parser.ARGC_LIMIT;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            obj = xt4Var2;
            if (rv4Var.h(obj)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i2 |= i3;
        } else {
            obj = xt4Var2;
        }
        int i9 = i2;
        if ((599059 & i9) != 599058) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i9 & 1, z)) {
            hc2.b(nq7Var, null, jce.E(-924422716, new w81(rh8Var, list, obj, yae.D(xt4Var, rv4Var), vt4Var, 0), rv4Var), rv4Var, ((i9 >> 9) & 14) | 3072, 6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new i81((Object) list, (Object) rh8Var, (Object) bkdVar, (Object) nq7Var, xt4Var, (hu4) vt4Var, (hu4) xt4Var2, i, 1);
        }
    }

    public static final void f(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        pb2 pb2Var;
        cz7Var.getClass();
        rv4Var.g0(-1607211371);
        if (rv4Var.f(cz7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        boolean z2 = true;
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
                rq4 rq4Var = (rq4) ((fdd) voe.z(cm9.a(rq4.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z3 = jsc.z(rq4Var.d, rv4Var);
                kb kbVar = (kb) rv4Var.j(yb.a);
                s02 s02Var = rq4Var.e;
                boolean f2 = rv4Var.f(kbVar);
                if ((i3 & 14) != 4) {
                    z2 = false;
                }
                boolean z4 = f2 | z2;
                Object P = rv4Var.P();
                if (z4 || P == ax1.a) {
                    P = new we1(kbVar, cz7Var, (m42) null, 7);
                    rv4Var.o0(P);
                }
                jye.b(s02Var, null, (mu4) P, rv4Var, 0);
                fxe.h(yqe.A((y3b) s2b.o0.getValue(), rv4Var), null, false, jce.E(1777397265, new h64(cz7Var, 6), rv4Var), null, null, jce.E(1742382240, new u32(2, rq4Var, z3), rv4Var), rv4Var, 1575936, 54);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new h64(cz7Var, i, 7);
        }
    }

    public static final void g(boolean z, String str, xt4 xt4Var, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        pb2 pb2Var;
        boolean z3;
        boolean z4;
        tx5 tx5Var;
        String str2;
        Object obj;
        boolean z5;
        boolean z6;
        xt4Var.getClass();
        vt4Var.getClass();
        vt4Var2.getClass();
        rv4Var.g0(-1644972621);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.f(str)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var.h(vt4Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if (rv4Var.h(vt4Var2)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i9 = i8 | i5;
        if ((i9 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i9 & 1, z2)) {
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                tx5 tx5Var2 = (tx5) ((fdd) voe.z(cm9.a(tx5.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z7 = jsc.z(tx5Var2.e, rv4Var);
                Boolean valueOf = Boolean.valueOf(z);
                int i10 = i9 & 14;
                if (i10 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i9 & Token.ASSIGN_MOD) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean f2 = z4 | z3 | rv4Var.f(tx5Var2);
                Object P = rv4Var.P();
                Object obj2 = ax1.a;
                if (!f2 && P != obj2) {
                    str2 = str;
                    obj = P;
                    tx5Var = tx5Var2;
                } else {
                    tx5Var = tx5Var2;
                    Object er0Var = new er0(z, str, tx5Var, (m42) null, 4);
                    str2 = str;
                    rv4Var.o0(er0Var);
                    obj = er0Var;
                }
                yte.h(valueOf, str2, (lu4) obj, rv4Var);
                if (((sx5) z7.getValue()).b == ux5.b) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (((sx5) z7.getValue()).b == ux5.d) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean g = rv4Var.g(z6);
                Object P2 = rv4Var.P();
                if (g || P2 == obj2) {
                    P2 = new ti7(1, xt4Var, z6);
                    rv4Var.o0(P2);
                }
                xb.a(z, (xt4) P2, jce.E(1257931196, new fw0(z5, z6, tx5Var, vt4Var, xt4Var, vt4Var2, 4), rv4Var), null, null, jce.E(2005766399, new vi7(1, xt4Var, z6), rv4Var), eze.d, null, 0L, 0L, nae.e, null, null, null, false, false, jce.E(-1292174505, new wi7(str, z7, 1), rv4Var), rv4Var, i10 | 1769856, 1572864, 65432);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new xi7(z, str, xt4Var, vt4Var, vt4Var2, i, 1);
        }
    }

    public static final int h(int i) {
        return ((i & 65535) << 8) | 7;
    }

    public static final void i(l54 l54Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        int i3;
        boolean z2;
        String str;
        String str2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-2061895851);
        if (rv4Var2.f(l54Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i4 & 1, z)) {
            kq7 kq7Var = kq7.a;
            nq7 z3 = zbe.z(nmd.v(tte.k(pna.f(kq7Var, 1.0f), r0f.z(rv4Var2).a), rm1.g(r0f.y(rv4Var2), 1.0f), lre.g), 12.0f, 8.0f);
            mk0 mk0Var = kh5.G;
            dz dzVar = lz.a;
            gv9 a2 = ev9.a(dzVar, mk0Var, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, z3);
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
            String str3 = l54Var.a;
            String str4 = l54Var.m;
            String str5 = l54Var.k;
            do5.a(new h54(l54Var.r, str3, l54Var.c), r0f.d, false, null, null, eze.e, tte.k(pna.n(kq7Var, 60.0f), r0f.z(rv4Var).d), null, rv4Var, 1572912, 828);
            we6 d2 = rs8.d(kq7Var, 14.0f, rv4Var, 1.0f, true);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, d2);
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
            nq7 f2 = pna.f(kq7Var, 1.0f);
            gv9 a4 = ev9.a(dzVar, mk0Var, rv4Var, 48);
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
            if (str5.length() > 0) {
                rv4Var.e0(-1170394754);
                do5.e(str5, pna.n(kq7Var, 24.0f), rv4Var, 48);
                rs8.v(kq7Var, 8.0f, rv4Var, false);
            } else {
                rv4Var.e0(-1170163153);
                rv4Var.q(false);
            }
            String str6 = l54Var.b;
            if (k4b.j0(str6)) {
                str6 = str4;
            }
            i3 = 1;
            cvb.c(str6, l0e.u(pna.f(kq7Var, 1.0f)), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, oyb.a(r0f.A(rv4Var).j, 0L, 0L, dq4.f, null, null, 0L, null, 0, 0L, null, 16777211), rv4Var, 48, 24576, 114684);
            rs8.u(rv4Var, true, kq7Var, 6.0f, rv4Var);
            nq7 f3 = pna.f(kq7Var, 1.0f);
            gv9 a5 = ev9.a(dzVar, mk0Var, rv4Var, 48);
            int hashCode4 = Long.hashCode(rv4Var.T);
            xt8 l4 = rv4Var.l();
            nq7 p4 = lye.p(rv4Var, f3);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a5);
            jce.F(npVar2, rv4Var, l4);
            s21.t(hashCode4, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p4);
            if (l54Var.n) {
                rv4Var.e0(-1214873891);
                j("DEV", null, r0f.y(rv4Var).l, r0f.y(rv4Var).m, rv4Var, 6, 2);
                z2 = false;
                rs8.v(kq7Var, 4.0f, rv4Var, false);
            } else {
                z2 = false;
                rv4Var.e0(-1214540424);
                rv4Var.q(false);
            }
            if (l54Var.h) {
                rv4Var.e0(-1214492095);
                j("18+", null, zl1.f, zl1.e, rv4Var, 3462, 2);
                rs8.v(kq7Var, 4.0f, rv4Var, z2);
            } else {
                rv4Var.e0(-1214223976);
                rv4Var.q(z2);
            }
            String str7 = (String) sl1.f0(l54Var.i - 1, cqe.m((q3b) nz.c.getValue(), rv4Var));
            if (str7 != null) {
                str = str7.toUpperCase(Locale.ROOT);
                str.getClass();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            j(str, null, 0L, 0L, rv4Var, 0, 14);
            if (!k4b.j0(l54Var.f)) {
                rs8.s(rv4Var, -1213956787, kq7Var, 4.0f, rv4Var);
                j(l54Var.f, null, 0L, 0L, rv4Var, 0, 14);
                rv4Var.q(z2);
            } else {
                rv4Var.e0(-1213823208);
                rv4Var.q(z2);
            }
            rs8.u(rv4Var, true, kq7Var, 4.0f, rv4Var);
            String str8 = l54Var.d;
            if (k4b.j0(str8)) {
                str2 = str4;
            } else {
                str2 = str8;
            }
            cvb.c(str2, null, zl1.b(0.5f, ((zl1) rv4Var.j(r12.a)).a), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, r0f.A(rv4Var).l, rv4Var, 0, 24960, 110586);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            i3 = 1;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new yi7(l54Var, i, i3);
        }
    }

    public static final void j(String str, nq7 nq7Var, long j, long j2, rv4 rv4Var, int i, int i2) {
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
        rv4Var.g0(-1782988020);
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
            u.d = new x34(str, nq7Var2, j5, j6, i, i2, 2);
        }
    }

    public static final void k(List list, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        List list2;
        rv4Var.g0(772637271);
        if (rv4Var.f(list)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2;
        boolean z2 = false;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            String B = yqe.B((y3b) x2b.A.getValue(), new Object[]{Integer.valueOf(list.size())}, rv4Var);
            tza tzaVar = j27.a;
            cvb.c(B, null, ((h27) rv4Var.j(tzaVar)).a.s, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.k, rv4Var, 0, 0, 131066);
            kq7 kq7Var = kq7.a;
            nq7 j = pna.j(hl5.f(kq7Var, 8.0f, rv4Var, kq7Var, 1.0f), nae.e, 320.0f, 1);
            hz hzVar = new hz(8.0f, true, new vs(2));
            if ((i3 & 14) == 4) {
                z2 = true;
            }
            Object P = rv4Var.P();
            if (!z2 && P != ax1.a) {
                list2 = list;
            } else {
                list2 = list;
                P = new vd1(1, list2);
                rv4Var.o0(P);
            }
            jce.d(j, null, null, false, hzVar, null, null, false, null, (xt4) P, rv4Var, 24582, 494);
        } else {
            list2 = list;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new zi7(i, list2);
        }
    }

    public static final boolean l(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static gsa m(List list, List list2) {
        yk8 yk8Var;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            List list3 = (List) it.next();
            int size = list3.size();
            int i = 0;
            while (i < size) {
                int intValue = ((Number) list3.get(i)).intValue();
                i++;
                int intValue2 = ((Number) list3.get(i % list3.size())).intValue();
                if (intValue < intValue2) {
                    yk8Var = new yk8(Integer.valueOf(intValue), Integer.valueOf(intValue2));
                } else {
                    yk8Var = new yk8(Integer.valueOf(intValue2), Integer.valueOf(intValue));
                }
                linkedHashSet.add(yk8Var);
            }
        }
        return new gsa(list, list2, sl1.C0(linkedHashSet));
    }

    public static final void n(long j, long j2, long j3) {
        if ((j2 | j3) >= 0 && j2 <= j && j - j2 >= j3) {
            return;
        }
        StringBuilder o = rs8.o(j, "size=", " offset=");
        o.append(j2);
        o.append(" byteCount=");
        o.append(j3);
        throw new ArrayIndexOutOfBoundsException(o.toString());
    }

    public static final File o(Context context, String str) {
        context.getClass();
        str.getClass();
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(str));
    }

    public static n89 p(String str) {
        return new n89(str, "DAV:", "d", (String) null, 24);
    }

    public static final int q(String str, h02 h02Var) {
        if (str.length() == 1) {
            char charAt = str.charAt(0);
            if (charAt != 'F') {
                if (charAt != 'S' && charAt != 'Z' && charAt != 'I') {
                    if (charAt != 'J') {
                        switch (charAt) {
                            case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                            case Token.ENUM_NEXT /* 67 */:
                                break;
                            case Token.ENUM_ID /* 68 */:
                                return 3;
                            default:
                                vs.m("bad type");
                                return 0;
                        }
                    } else {
                        return 4;
                    }
                }
                return 1;
            }
            return 2;
        }
        return h(h02Var.a(str));
    }

    public static final String r(int i, h02 h02Var) {
        if ((i & 255) == 7) {
            return (String) h02Var.k(i >>> 8);
        }
        vs.m("expecting object type");
        return null;
    }

    public static boolean s(int i) {
        if (i != 3 && i != 4) {
            return false;
        }
        return true;
    }

    public static final g96 t(float f2, float f3, int i, xt4 xt4Var) {
        float f4;
        i96 i96Var = new i96();
        xt4Var.invoke(i96Var);
        int i2 = i96Var.a;
        while (true) {
            ArrayList arrayList = i96Var.c;
            if (i2 >= tl1.x(arrayList)) {
                break;
            }
            int i3 = i2 + 1;
            if (((h96) arrayList.get(i3)).a != i96Var.b) {
                break;
            }
            i2 = i3;
        }
        int i4 = i96Var.a;
        int i5 = i2 - i4;
        if (i == 0) {
            float f5 = nae.e;
            if (f3 != nae.e) {
                int i6 = i5 % 2;
                if (i6 + ((((i6 ^ 2) & ((-i6) | i6)) >> 31) & 2) != 0) {
                    f5 = f3 / 2.0f;
                }
            }
            f4 = (((f2 / 2.0f) - ((i96Var.b / 2.0f) * i5)) - f5) - ((i5 / 2) * f3);
        } else {
            float f6 = i96Var.b;
            if (i == 1) {
                f4 = f2 - (f6 / 2.0f);
            } else {
                f4 = f6 / 2.0f;
            }
        }
        return new g96(i96.b(i4, f4, i4, i2, i96Var.b, f2, f3, i96Var.c));
    }

    public static final f96 u(f96 f96Var, f96 f96Var2, float f2) {
        boolean z;
        boolean z2;
        f96 f96Var3;
        float o = b23.o(f96Var.a, f96Var2.a, f2);
        float o2 = b23.o(f96Var.b, f96Var2.b, f2);
        float o3 = b23.o(f96Var.c, f96Var2.c, f2);
        int i = (f2 > 0.5f ? 1 : (f2 == 0.5f ? 0 : -1));
        if (i < 0) {
            z = f96Var.d;
        } else {
            z = f96Var2.d;
        }
        if (i < 0) {
            z2 = f96Var.e;
        } else {
            z2 = f96Var2.e;
        }
        if (i < 0) {
            f96Var3 = f96Var;
        } else {
            f96Var3 = f96Var2;
        }
        return new f96(o, o2, o3, z, z2, f96Var3.f, b23.o(f96Var.g, f96Var2.g, f2));
    }

    public static final int v(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static final String w(byte b2) {
        char[] cArr = fca.b;
        return new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]});
    }

    public static final String x(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = fca.b;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        return r4b.D(cArr2, i2, 8);
    }

    public static String y(int i, h02 h02Var) {
        int i2 = i & 255;
        switch (i2) {
            case 0:
                return "top";
            case 1:
                return "int";
            case 2:
                return "float";
            case 3:
                return "double";
            case 4:
                return "long";
            case 5:
                return "null";
            case 6:
                return "uninitialized_this";
            default:
                if (i2 == 7) {
                    return r(i, h02Var);
                }
                if (i2 == 8) {
                    return "uninitialized";
                }
                vs.m("bad type");
                return null;
        }
    }

    public static final int z(byte[] bArr, int i) {
        bArr.getClass();
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }
}
