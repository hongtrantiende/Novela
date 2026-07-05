package defpackage;

import java.util.ArrayList;
import org.mozilla.javascript.ES6Iterator;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xpe  reason: default package */
/* loaded from: classes3.dex */
public abstract class xpe {
    public static final tu1 a = new tu1(new tx0(13), false, -436898065);
    public static final n82 b = n82.a;
    public static final lk c = new lk(1000);
    public static final lk d;
    public static final lk e;

    static {
        new lk(1007);
        d = new lk(1008);
        e = new lk(1002);
    }

    public static xy0 a(int i, int i2, py0 py0Var) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        int i3 = i2 & 2;
        py0 py0Var2 = py0.a;
        if (i3 != 0) {
            py0Var = py0Var2;
        }
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i != Integer.MAX_VALUE) {
                        if (py0Var == py0Var2) {
                            return new xy0(i, null);
                        }
                        return new zy1(i, py0Var, null);
                    }
                    return new xy0(Integer.MAX_VALUE, null);
                } else if (py0Var == py0Var2) {
                    return new xy0(0, null);
                } else {
                    return new zy1(1, py0Var, null);
                }
            } else if (py0Var == py0Var2) {
                return new zy1(1, py0.b, null);
            } else {
                vs.m("CONFLATED capacity cannot be used with non-default onBufferOverflow");
                return null;
            }
        } else if (py0Var == py0Var2) {
            ta1.i.getClass();
            return new xy0(sa1.b, null);
        } else {
            return new zy1(1, py0Var, null);
        }
    }

    public static final void b(int i) {
        if (i > 0) {
            return;
        }
        vs.m("px must be > 0.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    public static final void c(final nq7 nq7Var, rj8 rj8Var, final rh8 rh8Var, final ff8 ff8Var, sqa sqaVar, final boolean z, final wi wiVar, int i, final float f, final oi8 oi8Var, u08 u08Var, final xt4 xt4Var, final lk0 lk0Var, final mk0 mk0Var, final xqa xqaVar, final tu1 tu1Var, rv4 rv4Var, final int i2, final int i3) {
        int i4;
        int i5;
        xqa xqaVar2;
        boolean z2;
        u08 u08Var2;
        sqa sqaVar2;
        rj8 rj8Var2;
        int i6;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        ff8 ff8Var2;
        boolean z16;
        rv4 rv4Var2;
        m82 m82Var;
        int i7;
        rj8 rj8Var3;
        p76 p76Var;
        hj8 hj8Var;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        xi8 xi8Var;
        nq7 nq7Var2;
        boolean z22;
        nq7 a0;
        boolean z23;
        boolean z24;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        rv4Var.g0(-572816025);
        int i18 = 2;
        if ((i2 & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i4 = i2 | i17;
        } else {
            i4 = i2;
        }
        int i19 = 16;
        if ((i2 & 48) == 0) {
            if (rv4Var.f(rj8Var)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i4 |= i16;
        }
        int i20 = i2 & 384;
        int i21 = Token.CASE;
        if (i20 == 0) {
            if (rv4Var.f(rh8Var)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i4 |= i15;
        }
        int i22 = 1024;
        if ((i2 & 3072) == 0) {
            if (rv4Var.g(false)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i4 |= i14;
        }
        int i23 = 8192;
        if ((i2 & 24576) == 0) {
            if (rv4Var.d(ff8Var.ordinal())) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i4 |= i13;
        }
        int i24 = i2 & 196608;
        int i25 = Parser.ARGC_LIMIT;
        if (i24 == 0) {
            if (rv4Var.f(sqaVar)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i4 |= i12;
        }
        int i26 = 524288;
        if ((i2 & 1572864) == 0) {
            if (rv4Var.g(z)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i4 |= i11;
        }
        if ((i2 & 12582912) == 0) {
            if (rv4Var.f(wiVar)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i4 |= i10;
        }
        if ((i2 & 100663296) == 0) {
            if (rv4Var.d(i)) {
                i9 = 67108864;
            } else {
                i9 = 33554432;
            }
            i4 |= i9;
        }
        if ((i2 & 805306368) == 0) {
            if (rv4Var.c(f)) {
                i8 = 536870912;
            } else {
                i8 = 268435456;
            }
            i4 |= i8;
        }
        if ((i3 & 6) == 0) {
            if (rv4Var.f(oi8Var)) {
                i18 = 4;
            }
            i5 = i3 | i18;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            if (rv4Var.h(u08Var)) {
                i19 = 32;
            }
            i5 |= i19;
        }
        if ((i3 & 384) == 0) {
            if (rv4Var.h(xt4Var)) {
                i21 = 256;
            }
            i5 |= i21;
        }
        if ((i3 & 3072) == 0) {
            if (rv4Var.f(lk0Var)) {
                i22 = 2048;
            }
            i5 |= i22;
        }
        if ((i3 & 24576) == 0) {
            if (rv4Var.f(mk0Var)) {
                i23 = 16384;
            }
            i5 |= i23;
        }
        if ((i3 & 196608) == 0) {
            xqaVar2 = xqaVar;
            if (rv4Var.f(xqaVar2)) {
                i25 = 131072;
            }
            i5 |= i25;
        } else {
            xqaVar2 = xqaVar;
        }
        if ((i3 & 1572864) == 0) {
            if (rv4Var.h(tu1Var)) {
                i26 = 1048576;
            }
            i5 |= i26;
        }
        int i27 = i5;
        if ((i4 & 306783379) == 306783378 && (599187 & i27) == 599186) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (rv4Var.U(i4 & 1, z2)) {
            if (i < 0) {
                ov5.a("beyondViewportPageCount should be greater than or equal to 0, you selected " + i);
            }
            int i28 = i4 & Token.ASSIGN_MOD;
            if (i28 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (z3 || P == obj) {
                P = new yh6(rj8Var, 0);
                rv4Var.o0(P);
            }
            vt4 vt4Var = (vt4) P;
            int i29 = i4 >> 3;
            int i30 = i29 & 14;
            int i31 = i27 >> 15;
            int i32 = i30 | (i31 & Token.ASSIGN_MOD) | (i27 & 896);
            aw7 D = yae.D(tu1Var, rv4Var);
            aw7 D2 = yae.D(xt4Var, rv4Var);
            if ((((i32 & 14) ^ 6) > 4 && rv4Var.f(rj8Var)) || (i32 & 6) == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean f2 = z4 | rv4Var.f(D) | rv4Var.f(D2) | rv4Var.f(vt4Var);
            Object P2 = rv4Var.P();
            if (f2 || P2 == obj) {
                r0f r0fVar = r0f.L;
                P2 = new xf6(0, 1, yya.class, yae.r(new mf6(3, yae.r(new pe1(D, D2, vt4Var), r0fVar), rj8Var), r0fVar), ES6Iterator.VALUE_PROPERTY, "getValue()Ljava/lang/Object;");
                rv4Var.o0(P2);
            }
            p76 p76Var2 = (p76) P2;
            Object P3 = rv4Var.P();
            if (P3 == obj) {
                P3 = yte.s(rv4Var);
                rv4Var.o0(P3);
            }
            m82 m82Var2 = (m82) P3;
            if (i28 == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object P4 = rv4Var.P();
            if (z5 || P4 == obj) {
                P4 = new yh6(rj8Var, 1);
                rv4Var.o0(P4);
            }
            vt4 vt4Var2 = (vt4) P4;
            int i33 = i4 >> 9;
            int i34 = i27 << 15;
            int i35 = (i4 & 65520) | (i33 & 458752) | (i33 & 3670016) | ((i27 << 21) & 29360128) | (i34 & 234881024) | (i34 & 1879048192);
            if ((((i35 & Token.ASSIGN_MOD) ^ 48) > 32 && rv4Var.f(rj8Var)) || (i35 & 48) == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            if ((((i35 & 896) ^ 384) > 256 && rv4Var.f(rh8Var)) || (i35 & 384) == 256) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z25 = z7 | z6;
            if ((((i35 & 7168) ^ 3072) > 2048 && rv4Var.g(false)) || (i35 & 3072) == 2048) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z26 = z25 | z8;
            if ((((57344 & i35) ^ 24576) > 16384 && rv4Var.d(ff8Var.ordinal())) || (i35 & 24576) == 16384) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z27 = z26 | z9;
            if ((((i35 & 234881024) ^ 100663296) > 67108864 && rv4Var.f(lk0Var)) || (i35 & 100663296) == 67108864) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z28 = z27 | z10;
            if ((((i35 & 1879048192) ^ 805306368) > 536870912 && rv4Var.f(mk0Var)) || (i35 & 805306368) == 536870912) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z29 = z28 | z11;
            if ((((i35 & 3670016) ^ 1572864) > 1048576 && rv4Var.c(f)) || (i35 & 1572864) == 1048576) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z30 = z29 | z12;
            if ((((i35 & 29360128) ^ 12582912) > 8388608 && rv4Var.f(oi8Var)) || (i35 & 12582912) == 8388608) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z31 = z30 | z13;
            if ((((i31 & 14) ^ 6) > 4 && rv4Var.f(xqaVar2)) || (i31 & 6) == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean f3 = z31 | z14 | rv4Var.f(vt4Var2);
            if ((((i35 & 458752) ^ 196608) > 131072 && rv4Var.d(i)) || (i35 & 196608) == 131072) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean f4 = f3 | z15 | rv4Var.f(m82Var2);
            Object P5 = rv4Var.P();
            if (!f4 && P5 != obj) {
                ff8Var2 = ff8Var;
                m82Var = m82Var2;
                hj8Var = P5;
                rv4Var2 = rv4Var;
                p76Var = p76Var2;
                i7 = 4;
                z16 = true;
                i6 = i;
                rj8Var3 = rj8Var;
            } else {
                i6 = i;
                ff8Var2 = ff8Var;
                z16 = true;
                rv4Var2 = rv4Var;
                m82Var = m82Var2;
                i7 = 4;
                hj8 hj8Var2 = new hj8(rj8Var, ff8Var2, rh8Var, f, oi8Var, p76Var2, vt4Var2, mk0Var, lk0Var, i6, xqaVar2, m82Var);
                rj8Var3 = rj8Var;
                p76Var = p76Var2;
                rv4Var2.o0(hj8Var2);
                hj8Var = hj8Var2;
            }
            uh6 uh6Var = (uh6) hj8Var;
            ff8 ff8Var3 = ff8.a;
            if (ff8Var2 == ff8Var3) {
                z17 = z16;
            } else {
                z17 = false;
            }
            if (((i30 ^ 6) > i7 && rv4Var2.f(rj8Var3)) || (i29 & 6) == i7) {
                z18 = z16;
            } else {
                z18 = false;
            }
            boolean g = z18 | rv4Var2.g(z17);
            Object P6 = rv4Var2.P();
            if (g || P6 == obj) {
                P6 = new ji6(rj8Var3, z17);
                rv4Var2.o0(P6);
            }
            ii6 ii6Var = (ii6) P6;
            if (i28 == 32) {
                z19 = z16;
            } else {
                z19 = false;
            }
            if ((i4 & 458752) == 131072) {
                z20 = z16;
            } else {
                z20 = false;
            }
            boolean z32 = z19 | z20;
            Object P7 = rv4Var2.P();
            if (!z32 && P7 != obj) {
                sqaVar2 = sqaVar;
            } else {
                sqaVar2 = sqaVar;
                P7 = new lk8(sqaVar2, rj8Var3);
                rv4Var2.o0(P7);
            }
            lk8 lk8Var = (lk8) P7;
            hv0 hv0Var = (hv0) rv4Var2.j(jv0.a);
            tc6 tc6Var = (tc6) rv4Var2.j(dy1.n);
            if (i28 == 32) {
                z21 = z16;
            } else {
                z21 = false;
            }
            boolean f5 = z21 | rv4Var2.f(hv0Var) | rv4Var2.d(tc6Var.ordinal());
            Object P8 = rv4Var2.P();
            if (f5 || P8 == obj) {
                P8 = new xi8(rj8Var3, hv0Var, tc6Var);
                rv4Var2.o0(P8);
            }
            xi8 xi8Var2 = P8;
            kq7 kq7Var = kq7.a;
            if (z) {
                rv4Var2.e0(-853734429);
                int i36 = i30 | ((i4 >> 21) & Token.ASSIGN_MOD);
                xi8Var = xi8Var2;
                if ((((i36 & 14) ^ 6) > 4 && rv4Var2.f(rj8Var3)) || (i36 & 6) == 4) {
                    z23 = z16;
                } else {
                    z23 = false;
                }
                boolean z33 = z23;
                if ((((i36 & Token.ASSIGN_MOD) ^ 48) > 32 && rv4Var2.d(i6)) || (i36 & 48) == 32) {
                    z24 = z16;
                } else {
                    z24 = false;
                }
                boolean z34 = z33 | z24;
                Object P9 = rv4Var2.P();
                if (z34 || P9 == obj) {
                    P9 = new wi8(rj8Var3, i6);
                    rv4Var2.o0(P9);
                }
                nq7Var2 = q0f.l((wi8) P9, rj8Var3.v, false, ff8Var2);
                rv4Var2.q(false);
            } else {
                xi8Var = xi8Var2;
                rv4Var2.e0(-853304645);
                rv4Var2.q(false);
                nq7Var2 = kq7Var;
            }
            ff8 ff8Var4 = ff8Var2;
            nq7 q = fca.q(nq7Var.a0(rj8Var3.y).a0(rj8Var3.w), p76Var, ii6Var, ff8Var4, z, false);
            p76 p76Var3 = p76Var;
            if (ff8Var4 == ff8Var3) {
                z22 = z16;
            } else {
                z22 = false;
            }
            if (z) {
                a0 = q.a0(y7a.c(kq7Var, false, new lf0(z22, rj8Var3, m82Var, 3)));
            } else {
                a0 = q.a0(kq7Var);
            }
            rj8 rj8Var4 = rj8Var3;
            nq7 u = tte.u(a0.a0(nq7Var2), rj8Var4, ff8Var4, wiVar, z, false, lk8Var, rj8Var3.p, xi8Var);
            rj8Var2 = rj8Var4;
            u08Var2 = u08Var;
            r1d.e(p76Var3, yae.A(u.a0(dab.b(kq7Var, rj8Var2, new vi(rj8Var2, 4))), u08Var2, null), rj8Var2.t, uh6Var, rv4Var2, 0, 0);
        } else {
            u08Var2 = u08Var;
            sqaVar2 = sqaVar;
            rj8Var2 = rj8Var;
            i6 = i;
            rv4Var.X();
        }
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            final rj8 rj8Var5 = rj8Var2;
            final u08 u08Var3 = u08Var2;
            final int i37 = i6;
            final sqa sqaVar3 = sqaVar2;
            u2.d = new lu4() { // from class: zh6
                @Override // defpackage.lu4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int p = xoe.p(i2 | 1);
                    int p2 = xoe.p(i3);
                    xpe.c(nq7.this, rj8Var5, rh8Var, ff8Var, sqaVar3, z, wiVar, i37, f, oi8Var, u08Var3, xt4Var, lk0Var, mk0Var, xqaVar, tu1Var, (rv4) obj2, p, p2);
                    return pvc.a;
                }
            };
        }
    }

    public static final boolean d(u7a u7aVar) {
        k8a k8aVar = h8a.s;
        tv7 tv7Var = u7aVar.a;
        Object g = tv7Var.g(k8aVar);
        if (g == null) {
            g = null;
        }
        if (!c16.i(g, ox9.c)) {
            if (!tv7Var.b(s7a.g) && !tv7Var.b(s7a.h)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|8))|65|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
        r12 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
        if (r13.f((byte[]) r14.c, r15, r14.b - r15, r0) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cd, code lost:
        if (r15 == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013b, code lost:
        if (r1.a(r0) == r4) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0108 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:15:0x004b, B:50:0x0121, B:44:0x0100, B:46:0x0108, B:20:0x0062), top: B:65:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012a  */
    /* JADX WARN: Type inference failed for: r0v2, types: [u0b, n42] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v27, types: [yl9] */
    /* JADX WARN: Type inference failed for: r12v30, types: [yl9] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r15v5, types: [e10] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [y00] */
    /* JADX WARN: Type inference failed for: r1v9, types: [t10, y00] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x011e -> B:50:0x0121). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.t10 r12, defpackage.f20 r13, int r14, defpackage.n42 r15) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpe.f(t10, f20, int, n42):java.lang.Object");
    }

    public static z35 h(byte[] bArr, byte[] bArr2, e45 e45Var) {
        int i = e45Var.a;
        if (bArr.length > i) {
            e45Var.c();
            e45Var.e = 0;
            e45Var.f = 0L;
            e45Var.g(bArr, bArr.length);
            bArr = e45Var.e().a;
        }
        if (bArr.length < i) {
            byte[] bArr3 = new byte[i];
            b00.U(0, 0, bArr.length, bArr, bArr3);
            bArr = bArr3;
        }
        byte[] bArr4 = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr4[i2] = (byte) (bArr[i2] ^ 92);
        }
        byte[] bArr5 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr5[i3] = (byte) (bArr[i3] ^ 54);
        }
        e45Var.c();
        e45Var.e = 0;
        e45Var.f = 0L;
        e45Var.g(bArr5, i);
        e45Var.g(bArr2, bArr2.length);
        byte[] bArr6 = e45Var.e().a;
        e45Var.c();
        e45Var.e = 0;
        e45Var.f = 0L;
        e45Var.g(bArr4, i);
        e45Var.g(bArr6, bArr6.length);
        return e45Var.e();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:82|83|(2:85|(4:87|(2:89|26)|72|(9:74|(2:76|26)|67|(2:69|26)|62|(2:64|26)|59|34|(1:26)(1:36))))|77|(4:79|(2:81|26)|50|(7:52|(2:54|26)|45|(2:47|26)|42|34|(0)(0)))|55|56|22|23|(3:25|19|(4:21|22|23|(0))(4:32|33|34|(0)(0)))|26) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|8))|92|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:102:?, code lost:
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
        r10 = r9;
        r9 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0187, code lost:
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b3 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:21:0x0050, B:76:0x0139, B:26:0x005f, B:73:0x0125, B:29:0x0068, B:68:0x010a, B:70:0x0112, B:77:0x013c, B:32:0x0071, B:62:0x00f0, B:35:0x007c, B:59:0x00db, B:38:0x0084, B:56:0x00c3, B:41:0x008c, B:51:0x00ab, B:53:0x00b3, B:63:0x00f4, B:65:0x00f8, B:44:0x0093, B:46:0x0097, B:48:0x009b), top: B:97:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f8 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:21:0x0050, B:76:0x0139, B:26:0x005f, B:73:0x0125, B:29:0x0068, B:68:0x010a, B:70:0x0112, B:77:0x013c, B:32:0x0071, B:62:0x00f0, B:35:0x007c, B:59:0x00db, B:38:0x0084, B:56:0x00c3, B:41:0x008c, B:51:0x00ab, B:53:0x00b3, B:63:0x00f4, B:65:0x00f8, B:44:0x0093, B:46:0x0097, B:48:0x009b), top: B:97:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0112 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:21:0x0050, B:76:0x0139, B:26:0x005f, B:73:0x0125, B:29:0x0068, B:68:0x010a, B:70:0x0112, B:77:0x013c, B:32:0x0071, B:62:0x00f0, B:35:0x007c, B:59:0x00db, B:38:0x0084, B:56:0x00c3, B:41:0x008c, B:51:0x00ab, B:53:0x00b3, B:63:0x00f4, B:65:0x00f8, B:44:0x0093, B:46:0x0097, B:48:0x009b), top: B:97:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0169 A[Catch: all -> 0x0048, TryCatch #2 {all -> 0x0048, blocks: (B:16:0x0043, B:83:0x0161, B:85:0x0169, B:86:0x016e), top: B:100:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016e A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #2 {all -> 0x0048, blocks: (B:16:0x0043, B:83:0x0161, B:85:0x0169, B:86:0x016e), top: B:100:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0186 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019a A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v2, types: [v0b, m42, n42] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r10v14, types: [w20] */
    /* JADX WARN: Type inference failed for: r10v20, types: [e10] */
    /* JADX WARN: Type inference failed for: r10v25, types: [f10] */
    /* JADX WARN: Type inference failed for: r10v4, types: [y00] */
    /* JADX WARN: Type inference failed for: r10v48, types: [java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r10v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v56 */
    /* JADX WARN: Type inference failed for: r10v57 */
    /* JADX WARN: Type inference failed for: r10v58 */
    /* JADX WARN: Type inference failed for: r10v9, types: [e10] */
    /* JADX WARN: Type inference failed for: r9v28, types: [y00] */
    /* JADX WARN: Type inference failed for: r9v36, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x015e -> B:83:0x0161). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable i(defpackage.t10 r9, defpackage.n42 r10) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpe.i(t10, n42):java.io.Serializable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Type inference failed for: r4v4, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v2, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable j(defpackage.t10 r4, int r5, defpackage.n42 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.w0b
            if (r0 == 0) goto L13
            r0 = r6
            w0b r0 = (defpackage.w0b) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            w0b r0 = new w0b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            byte[] r4 = r0.a
            defpackage.hre.r(r6)
            return r4
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r6)
            byte[] r6 = new byte[r5]
            r0.a = r6
            r0.c = r2
            java.lang.Object r4 = n(r4, r6, r5, r0)
            n82 r5 = defpackage.n82.a
            if (r4 != r5) goto L40
            return r5
        L40:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpe.j(t10, int, n42):java.io.Serializable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0051 -> B:19:0x005a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(defpackage.t10 r6, byte[] r7, int r8, defpackage.n42 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.x0b
            if (r0 == 0) goto L13
            r0 = r9
            x0b r0 = (defpackage.x0b) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            x0b r0 = new x0b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f
            int r1 = r0.C
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            int r6 = r0.e
            int r7 = r0.d
            int r8 = r0.c
            byte[] r1 = r0.b
            t10 r3 = r0.a
            defpackage.hre.r(r9)
            goto L5a
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            r6 = 0
            return r6
        L36:
            defpackage.hre.r(r9)
            r9 = 0
            r1 = r0
            r0 = r9
        L3c:
            r1.a = r6
            r1.b = r7
            r1.c = r0
            r1.d = r8
            r1.e = r9
            r1.C = r2
            java.lang.Object r3 = r6.g(r7, r9, r8, r1)
            n82 r4 = defpackage.n82.a
            if (r3 != r4) goto L51
            return r4
        L51:
            r5 = r3
            r3 = r6
            r6 = r9
            r9 = r5
            r5 = r1
            r1 = r7
            r7 = r8
            r8 = r0
            r0 = r5
        L5a:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 <= 0) goto L6d
            int r6 = r6 + r9
            int r7 = r7 - r9
            int r8 = r8 + r9
            r9 = r8
            r8 = r7
            r7 = r1
            r1 = r0
            r0 = r9
            r9 = r6
            r6 = r3
            goto L3c
        L6d:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpe.k(t10, byte[], int, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
        if (r11 == r7) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Type inference failed for: r0v2, types: [y0b, n42] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [t10] */
    /* JADX WARN: Type inference failed for: r9v10, types: [t10] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00ae -> B:42:0x00b4). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(defpackage.v20 r9, int r10, defpackage.n42 r11) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpe.l(v20, int, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Type inference failed for: r4v3, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable m(defpackage.t10 r4, byte[] r5, defpackage.n42 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.z0b
            if (r0 == 0) goto L13
            r0 = r6
            z0b r0 = (defpackage.z0b) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            z0b r0 = new z0b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            byte[] r5 = r0.a
            defpackage.hre.r(r6)
            goto L3f
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r6)
            int r6 = r5.length
            r0.a = r5
            r0.c = r2
            java.lang.Object r6 = k(r4, r5, r6, r0)
            n82 r4 = defpackage.n82.a
            if (r6 != r4) goto L3f
            return r4
        L3f:
            java.lang.Number r6 = (java.lang.Number) r6
            int r4 = r6.intValue()
            int r6 = r5.length
            if (r6 != r4) goto L49
            return r5
        L49:
            byte[] r4 = java.util.Arrays.copyOf(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpe.m(t10, byte[], n42):java.io.Serializable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0056 -> B:12:0x0030). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n(defpackage.t10 r6, byte[] r7, int r8, defpackage.n42 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.a1b
            if (r0 == 0) goto L13
            r0 = r9
            a1b r0 = (defpackage.a1b) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            a1b r0 = new a1b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f
            int r1 = r0.C
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L32
            int r6 = r0.e
            int r7 = r0.d
            int r8 = r0.c
            t10 r1 = r0.b
            byte[] r3 = r0.a
            defpackage.hre.r(r9)
            r5 = r0
            r0 = r8
        L30:
            r8 = r5
            goto L5d
        L32:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            r6 = 0
            return r6
        L39:
            defpackage.hre.r(r9)
            r9 = 0
            r1 = r0
            r0 = r8
        L3f:
            if (r8 <= 0) goto L8d
            r1.a = r7
            r1.b = r6
            r1.c = r0
            r1.d = r8
            r1.e = r9
            r1.C = r2
            java.lang.Object r3 = r6.g(r7, r9, r8, r1)
            n82 r4 = defpackage.n82.a
            if (r3 != r4) goto L56
            return r4
        L56:
            r5 = r1
            r1 = r6
            r6 = r9
            r9 = r3
            r3 = r7
            r7 = r8
            goto L30
        L5d:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 < 0) goto L8d
            if (r9 == 0) goto L6f
            int r6 = r6 + r9
            int r7 = r7 - r9
            r9 = r6
            r6 = r1
            r1 = r8
            r8 = r7
            r7 = r3
            goto L3f
        L6f:
            java.io.EOFException r6 = new java.io.EOFException
            java.lang.String r8 = "Not enough data. Expected="
            java.lang.String r9 = ", Read="
            java.lang.StringBuilder r8 = defpackage.hl5.s(r8, r9, r0)
            int r0 = r0 - r7
            r8.append(r0)
            java.lang.String r9 = ", Remaining="
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        L8d:
            pvc r6 = defpackage.pvc.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpe.n(t10, byte[], int, n42):java.lang.Object");
    }

    public static final g08 o(c0a c0aVar, rv4 rv4Var) {
        xz9 xz9Var = new xz9(c0aVar.c);
        ArrayList arrayList = c0aVar.d;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(new xz9((wz9) arrayList.get(i)));
        }
        Object P = rv4Var.P();
        ks3 ks3Var = ks3.a;
        Object obj = ax1.a;
        if (P == obj) {
            P = new g08(xz9Var, arrayList2, ks3Var);
            rv4Var.o0(P);
        }
        g08 g08Var = (g08) P;
        boolean h = rv4Var.h(xz9Var) | rv4Var.h(arrayList2) | rv4Var.h(ks3Var);
        Object P2 = rv4Var.P();
        if (h || P2 == obj) {
            Object xw0Var = new xw0(g08Var, xz9Var, arrayList2, ks3Var, 16);
            rv4Var.o0(xw0Var);
            P2 = xw0Var;
        }
        yte.k((vt4) P2, rv4Var);
        return g08Var;
    }

    public static long p(String str) {
        long j;
        char c2;
        int length = str.length();
        str.getClass();
        long j2 = 0;
        if (length >= 0) {
            if (length <= str.length()) {
                int i = 0;
                while (i < length) {
                    char charAt = str.charAt(i);
                    if (charAt < 128) {
                        j2++;
                    } else {
                        if (charAt < 2048) {
                            j = 2;
                        } else if (charAt >= 55296 && charAt <= 57343) {
                            int i2 = i + 1;
                            if (i2 < length) {
                                c2 = str.charAt(i2);
                            } else {
                                c2 = 0;
                            }
                            if (charAt <= 56319 && c2 >= 56320 && c2 <= 57343) {
                                j2 += 4;
                                i += 2;
                            } else {
                                j2++;
                                i = i2;
                            }
                        } else {
                            j = 3;
                        }
                        j2 += j;
                    }
                    i++;
                }
                return j2;
            }
            p1a.i(str.length(), hl5.s("endIndex > string.length: ", " > ", length));
            return 0L;
        }
        p1a.k(rs8.k("endIndex < beginIndex: ", length, 0, " < "));
        return 0L;
    }

    public static void q(int i, int i2) {
        String q;
        if (i >= 0 && i < i2) {
            return;
        }
        if (i >= 0) {
            if (i2 < 0) {
                vs.m(a82.j(i2, "negative size: "));
                return;
            }
            q = cqe.q("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            q = cqe.q("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(q);
    }

    public static void r(int i, int i2, int i3) {
        String s;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                s = cqe.q("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                s = s(i2, i3, "end index");
            }
        } else {
            s = s(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(s);
    }

    public static String s(int i, int i2, String str) {
        if (i < 0) {
            return cqe.q("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return cqe.q("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        vs.m(a82.j(i2, "negative size: "));
        return null;
    }

    public abstract boolean e(g99 g99Var);

    public abstract Object g(g99 g99Var);
}
