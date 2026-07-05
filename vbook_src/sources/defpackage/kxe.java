package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kxe  reason: default package */
/* loaded from: classes.dex */
public abstract class kxe {
    public static final tu1 a = new tu1(new iv1(17), false, -1708210559);
    public static final tu1 b = new tu1(new iv1(18), false, -999701090);
    public static final tu1 c = new tu1(new jv1(10), false, 1807135386);

    public static final void a(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, cz7 cz7Var, rh8 rh8Var, bkd bkdVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        pb2 pb2Var;
        int i6;
        aw7 aw7Var;
        int i7;
        int i8;
        lh9 lh9Var;
        boolean z2;
        w65 w65Var;
        aw7 aw7Var2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        rv4 rv4Var2 = rv4Var;
        cz7Var.getClass();
        vt4Var.getClass();
        rv4Var2.g0(-310070039);
        if (rv4Var2.f(cz7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i16 = i | i2;
        if (rv4Var2.f(rh8Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i17 = i16 | i3;
        if (rv4Var2.f(bkdVar)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i18 = i17 | i4;
        if (rv4Var2.h(vt4Var)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i19 = i18 | i5;
        if ((i19 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i19 & 1, z)) {
            sdd a2 = kv6.a(rv4Var2);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                w65 w65Var2 = (w65) ((fdd) voe.z(cm9.a(w65.class), a2.i(), null, pb2Var, o96.a(rv4Var2), null));
                aw7 z3 = jsc.z(w65Var2.C, rv4Var2);
                Object[] objArr = new Object[0];
                Object P = rv4Var2.P();
                lh9 lh9Var2 = ax1.a;
                if (P == lh9Var2) {
                    P = new k24(23);
                    rv4Var2.o0(P);
                }
                aw7 aw7Var3 = (aw7) zpe.k(objArr, (vt4) P, rv4Var2, 48);
                Object[] objArr2 = new Object[0];
                Object P2 = rv4Var2.P();
                if (P2 == lh9Var2) {
                    P2 = new k24(24);
                    rv4Var2.o0(P2);
                }
                aw7 aw7Var4 = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var2, 48);
                Object[] objArr3 = new Object[0];
                Object P3 = rv4Var2.P();
                if (P3 == lh9Var2) {
                    P3 = new k24(25);
                    rv4Var2.o0(P3);
                }
                aw7 aw7Var5 = (aw7) zpe.k(objArr3, (vt4) P3, rv4Var2, 48);
                if (((t65) z3.getValue()).a) {
                    rv4Var2.e0(1178692311);
                    rv4Var2.q(false);
                    w65Var = w65Var2;
                    i6 = 0;
                    aw7Var = aw7Var3;
                    i7 = 8;
                    aw7Var2 = aw7Var4;
                    i8 = i19;
                    i9 = 1;
                    lh9Var = lh9Var2;
                } else if (((t65) z3.getValue()).h.isEmpty()) {
                    rv4Var2.e0(1178765967);
                    w65Var = w65Var2;
                    i7 = 8;
                    i8 = i19;
                    aw7Var = aw7Var3;
                    i6 = 0;
                    lh9Var = lh9Var2;
                    jxe.d(owe.G(rv4Var2), yqe.A((y3b) o2b.q0.getValue(), rv4Var2), yqe.A((y3b) o2b.r0.getValue(), rv4Var2), zbe.x(pna.c, rh8Var), yqe.A((y3b) o2b.T.getValue(), rv4Var2), vt4Var, rv4Var2, (i19 << 3) & 458752, 0);
                    rv4Var2.q(false);
                    aw7Var2 = aw7Var4;
                    i9 = 1;
                    rv4Var2 = rv4Var2;
                } else {
                    i6 = 0;
                    aw7Var = aw7Var3;
                    i7 = 8;
                    i8 = i19;
                    lh9Var = lh9Var2;
                    rv4Var2.e0(1179223279);
                    t65 t65Var = (t65) z3.getValue();
                    if ((i8 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Object P4 = rv4Var2.P();
                    if (z2 || P4 == lh9Var) {
                        P4 = new ar0(cz7Var, 9);
                        rv4Var2.o0(P4);
                    }
                    xt4 xt4Var = (xt4) P4;
                    boolean f = rv4Var2.f(aw7Var4) | rv4Var2.f(aw7Var);
                    Object P5 = rv4Var2.P();
                    if (f || P5 == lh9Var) {
                        P5 = new pr0(aw7Var4, aw7Var, 11);
                        rv4Var2.o0(P5);
                    }
                    xt4 xt4Var2 = (xt4) P5;
                    boolean f2 = rv4Var2.f(w65Var2);
                    Object P6 = rv4Var2.P();
                    if (!f2 && P6 != lh9Var) {
                        w65Var = w65Var2;
                    } else {
                        w65Var = w65Var2;
                        P6 = new mz1(1, w65Var, w65.class, "changeSaveReadHistory", "changeSaveReadHistory(Z)V", 0, 23);
                        rv4Var2.o0(P6);
                    }
                    xt4 xt4Var3 = (xt4) ((i76) P6);
                    boolean f3 = rv4Var2.f(aw7Var5);
                    Object P7 = rv4Var2.P();
                    if (f3 || P7 == lh9Var) {
                        P7 = new ea4(aw7Var5, 2);
                        rv4Var2.o0(P7);
                    }
                    aw7Var2 = aw7Var4;
                    i9 = 1;
                    b(t65Var, rh8Var, bkdVar, nq7Var, xt4Var, xt4Var2, xt4Var3, (vt4) P7, rv4Var2, 8 | (i8 & Token.ASSIGN_MOD) | (i8 & 896) | 3072);
                    rv4Var2 = rv4Var2;
                    rv4Var2.q(false);
                }
                String str = (String) aw7Var2.getValue();
                boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
                boolean f4 = rv4Var2.f(aw7Var);
                Object P8 = rv4Var2.P();
                if (f4 || P8 == lh9Var) {
                    P8 = new qp4(aw7Var, 2);
                    rv4Var2.o0(P8);
                }
                xt4 xt4Var4 = (xt4) P8;
                boolean f5 = rv4Var2.f(aw7Var);
                int i20 = i8 & 14;
                if (i20 == 4) {
                    i10 = i9;
                } else {
                    i10 = i6;
                }
                int i21 = f5 | i10;
                Object P9 = rv4Var2.P();
                if (i21 != 0 || P9 == lh9Var) {
                    P9 = new if3(cz7Var, aw7Var, i9);
                    rv4Var2.o0(P9);
                }
                lu4 lu4Var = (lu4) P9;
                boolean f6 = rv4Var2.f(aw7Var);
                if (i20 == 4) {
                    i11 = i9;
                } else {
                    i11 = i6;
                }
                int i22 = f6 | i11;
                Object P10 = rv4Var2.P();
                if (i22 != 0 || P10 == lh9Var) {
                    P10 = new w73(cz7Var, aw7Var, 5);
                    rv4Var2.o0(P10);
                }
                xt4 xt4Var5 = (xt4) P10;
                boolean f7 = rv4Var2.f(aw7Var);
                if (i20 == 4) {
                    i12 = i9;
                } else {
                    i12 = i6;
                }
                int i23 = f7 | i12;
                Object P11 = rv4Var2.P();
                if (i23 != 0 || P11 == lh9Var) {
                    P11 = new w73(cz7Var, aw7Var, 6);
                    rv4Var2.o0(P11);
                }
                xt4 xt4Var6 = (xt4) P11;
                boolean f8 = rv4Var2.f(aw7Var);
                if (i20 == 4) {
                    i13 = i9;
                } else {
                    i13 = i6;
                }
                int i24 = f8 | i13;
                Object P12 = rv4Var2.P();
                if (i24 != 0 || P12 == lh9Var) {
                    P12 = new w73(cz7Var, aw7Var, 7);
                    rv4Var2.o0(P12);
                }
                xt4 xt4Var7 = (xt4) P12;
                boolean f9 = rv4Var2.f(aw7Var);
                if (i20 == 4) {
                    i14 = 1;
                } else {
                    i14 = i6;
                }
                int i25 = f9 | i14;
                Object P13 = rv4Var2.P();
                if (i25 != 0 || P13 == lh9Var) {
                    P13 = new w73(cz7Var, aw7Var, i7);
                    rv4Var2.o0(P13);
                }
                xt4 xt4Var8 = (xt4) P13;
                if (i20 == 4) {
                    i15 = 1;
                } else {
                    i15 = i6;
                }
                Object P14 = rv4Var2.P();
                if (i15 != 0 || P14 == lh9Var) {
                    P14 = new ar0(cz7Var, 8);
                    rv4Var2.o0(P14);
                }
                ube.e(booleanValue, str, xt4Var4, lu4Var, xt4Var5, xt4Var6, xt4Var7, xt4Var8, (xt4) P14, rv4Var2, 0);
                boolean booleanValue2 = ((Boolean) aw7Var5.getValue()).booleanValue();
                boolean f10 = rv4Var2.f(aw7Var5);
                Object P15 = rv4Var2.P();
                if (f10 || P15 == lh9Var) {
                    P15 = new qp4(aw7Var5, 3);
                    rv4Var2.o0(P15);
                }
                xt4 xt4Var9 = (xt4) P15;
                w65 w65Var3 = w65Var;
                boolean f11 = rv4Var2.f(w65Var3) | rv4Var2.f(aw7Var5);
                Object P16 = rv4Var2.P();
                if (f11 || P16 == lh9Var) {
                    P16 = new u93(21, w65Var3, aw7Var5);
                    rv4Var2.o0(P16);
                }
                f(booleanValue2, xt4Var9, (vt4) P16, rv4Var2, i6);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new nf3(cz7Var, rh8Var, bkdVar, nq7Var, vt4Var, i, 2);
        }
    }

    public static final void b(t65 t65Var, rh8 rh8Var, bkd bkdVar, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        Object obj;
        Object obj2;
        Object obj3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        hz hzVar;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean h;
        int i10;
        rv4Var.g0(2028649986);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var.f(t65Var);
            } else {
                h = rv4Var.h(t65Var);
            }
            if (h) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(rh8Var)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(bkdVar)) {
                i8 = 256;
            } else {
                i8 = Token.CASE;
            }
            i2 |= i8;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(nq7Var)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            obj = xt4Var;
            if (rv4Var.h(obj)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        } else {
            obj = xt4Var;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i5 = 131072;
            } else {
                i5 = Parser.ARGC_LIMIT;
            }
            i2 |= i5;
        }
        if ((1572864 & i) == 0) {
            obj2 = xt4Var3;
            if (rv4Var.h(obj2)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        } else {
            obj2 = xt4Var3;
        }
        if ((12582912 & i) == 0) {
            obj3 = vt4Var;
            if (rv4Var.h(obj3)) {
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        } else {
            obj3 = vt4Var;
        }
        int i11 = i2;
        boolean z6 = false;
        if ((i11 & 4793491) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i11 & 1, z)) {
            f25 f25Var = new f25(200.0f);
            hz hzVar2 = new hz(8.0f, true, new vs(2));
            hz hzVar3 = new hz(8.0f, true, new vs(2));
            if ((i11 & 14) != 4 && ((i11 & 8) == 0 || !rv4Var.h(t65Var))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if ((i11 & 57344) == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z7 = z2 | z3;
            if ((i11 & 458752) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z8 = z7 | z4;
            if ((i11 & 29360128) == 8388608) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z9 = z8 | z5;
            if ((i11 & 3670016) == 1048576) {
                z6 = true;
            }
            boolean z10 = z9 | z6;
            Object P = rv4Var.P();
            if (!z10 && P != ax1.a) {
                hzVar = hzVar3;
            } else {
                hzVar = hzVar3;
                p6 p6Var = new p6(t65Var, obj, xt4Var2, obj3, obj2, 10);
                rv4Var.o0(p6Var);
                P = p6Var;
            }
            pc2.d(f25Var, nq7Var, null, rh8Var, hzVar, hzVar2, null, false, 0L, 0L, bkdVar, nae.e, (xt4) P, rv4Var, ((i11 >> 6) & Token.ASSIGN_MOD) | 1769472 | ((i11 << 6) & 7168), (i11 >> 3) & Token.ASSIGN_MOD, 6036);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ua(t65Var, rh8Var, bkdVar, nq7Var, xt4Var, xt4Var2, xt4Var3, vt4Var, i, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.rj8 r26, defpackage.nq7 r27, defpackage.rh8 r28, defpackage.oi8 r29, int r30, float r31, defpackage.mk0 r32, defpackage.sqa r33, boolean r34, defpackage.xt4 r35, defpackage.u08 r36, defpackage.xqa r37, defpackage.wi r38, defpackage.tu1 r39, defpackage.rv4 r40, int r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kxe.c(rj8, nq7, rh8, oi8, int, float, mk0, sqa, boolean, xt4, u08, xqa, wi, tu1, rv4, int, int, int):void");
    }

    public static xc4 d(hn8 hn8Var, pe4 pe4Var, String str, nj9 nj9Var, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            nj9Var = null;
        }
        return new xc4(hn8Var, pe4Var, str, nj9Var);
    }

    public static zta e(bz0 bz0Var, pe4 pe4Var) {
        return new zta(bz0Var, pe4Var, null);
    }

    public static final void f(boolean z, xt4 xt4Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        rv4Var.g0(-217439746);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.h(xt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var.h(vt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i7 & 1, z2)) {
            xb.d(z, xt4Var, jce.E(798866258, new oo7(1, vt4Var, xt4Var), rv4Var), null, null, jce.E(-650631851, new id1(xt4Var, 5, (byte) 0), rv4Var), mue.c, null, 0L, 0L, nae.e, false, false, mue.d, rv4Var, (i7 & 14) | 1769856 | (i7 & Token.ASSIGN_MOD), 8088);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new n65(z, xt4Var, vt4Var, i, 0);
        }
    }

    public static final void g(rhb rhbVar, final rh8 rh8Var, final nq7 nq7Var, final xt4 xt4Var, final vt4 vt4Var, final xt4 xt4Var2, final xt4 xt4Var3, final xt4 xt4Var4, final xt4 xt4Var5, final xt4 xt4Var6, final xt4 xt4Var7, final vt4 vt4Var2, final vt4 vt4Var3, final vt4 vt4Var4, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        boolean z;
        np npVar;
        int i4;
        int i5;
        kq7 kq7Var;
        lk0 lk0Var;
        ez ezVar;
        np npVar2;
        zx1 zx1Var;
        np npVar3;
        np npVar4;
        kg kgVar;
        int i6;
        zx1 zx1Var2;
        zx1 zx1Var3;
        String A;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean h;
        int i16;
        final rhb rhbVar2 = rhbVar;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-145946077);
        int i17 = 4;
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var2.f(rhbVar2);
            } else {
                h = rv4Var2.h(rhbVar2);
            }
            if (h) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i2 = i16 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.f(rh8Var)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i2 |= i15;
        }
        int i18 = i & 384;
        int i19 = Token.CASE;
        if (i18 == 0) {
            if (rv4Var2.f(nq7Var)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i2 |= i14;
        }
        int i20 = 1024;
        if ((i & 3072) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i2 |= i13;
        }
        if ((i & 24576) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i2 |= i12;
        }
        if ((i & 196608) == 0) {
            if (rv4Var2.h(xt4Var2)) {
                i11 = 131072;
            } else {
                i11 = Parser.ARGC_LIMIT;
            }
            i2 |= i11;
        }
        if ((i & 1572864) == 0) {
            if (rv4Var2.h(xt4Var3)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i2 |= i10;
        }
        if ((i & 12582912) == 0) {
            if (rv4Var2.h(xt4Var4)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i2 |= i9;
        }
        if ((i & 100663296) == 0) {
            if (rv4Var2.h(xt4Var5)) {
                i8 = 67108864;
            } else {
                i8 = 33554432;
            }
            i2 |= i8;
        }
        if ((i & 805306368) == 0) {
            if (rv4Var2.h(xt4Var6)) {
                i7 = 536870912;
            } else {
                i7 = 268435456;
            }
            i2 |= i7;
        }
        if (!rv4Var2.h(xt4Var7)) {
            i17 = 2;
        }
        if (rv4Var2.h(vt4Var2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i21 = i17 | i3;
        if (rv4Var2.h(vt4Var3)) {
            i19 = 256;
        }
        int i22 = i21 | i19;
        if (rv4Var2.h(vt4Var4)) {
            i20 = 2048;
        }
        int i23 = i22 | i20;
        if ((306783379 & i2) == 306783378 && (i23 & 1171) == 1170) {
            z = false;
        } else {
            z = true;
        }
        if (rv4Var2.U(i2 & 1, z)) {
            nq7 C = rte.C(nq7Var.a0(pna.c), rte.u(rv4Var2), 14);
            lk0 lk0Var2 = kh5.I;
            ez ezVar2 = lz.c;
            xn1 a2 = wn1.a(ezVar2, lk0Var2, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, C);
            rw1.k.getClass();
            zx1 zx1Var4 = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var4);
            } else {
                rv4Var2.r0();
            }
            np npVar5 = qw1.f;
            jce.F(npVar5, rv4Var2, a2);
            np npVar6 = qw1.e;
            jce.F(npVar6, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar7 = qw1.g;
            jce.F(npVar7, rv4Var2, valueOf);
            kg kgVar2 = qw1.h;
            jce.C(kgVar2, rv4Var2);
            np npVar8 = qw1.d;
            jce.F(npVar8, rv4Var2, p);
            kq7 kq7Var2 = kq7.a;
            xbe.i(rv4Var2, zbe.x(kq7Var2, rh8Var));
            if (!rhbVar2.a.isEmpty()) {
                rv4Var2.e0(-1808820011);
                nq7 y = zbe.y(kq7Var2, 16.0f);
                String A2 = yqe.A((y3b) z1b.V.getValue(), rv4Var2);
                tza tzaVar = j27.a;
                zx1Var = zx1Var4;
                i4 = i2;
                ezVar = ezVar2;
                npVar2 = npVar6;
                npVar3 = npVar7;
                npVar4 = npVar8;
                kgVar = kgVar2;
                npVar = npVar5;
                lk0Var = lk0Var2;
                i5 = i23;
                cvb.c(A2, y, ((h27) rv4Var2.j(tzaVar)).a.a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.h, rv4Var, 48, 0, 131064);
                i(rhbVar2.a, rhbVar2.b, zbe.A(kq7Var2, 16.0f, nae.e, 2), xt4Var, vt4Var, xt4Var2, rv4Var, (i4 & 7168) | 384 | (i4 & 57344) | (458752 & i4));
                xbe.i(rv4Var, pna.h(kq7Var2, 12.0f));
                kq7Var = kq7Var2;
                i6 = 0;
                z1d.f(rp5.c((wk3) ok3.l0.getValue(), rv4Var, 0), yqe.A((y3b) z1b.p.getValue(), rv4Var), false, null, zbe.A(new l95(kh5.K), 24.0f, nae.e, 2), null, null, null, vt4Var4, rv4Var, (i5 << 15) & 234881024, 236);
                rv4Var2 = rv4Var;
                hl5.w(kq7Var, 12.0f, rv4Var2, false);
            } else {
                npVar = npVar5;
                i4 = i2;
                i5 = i23;
                kq7Var = kq7Var2;
                lk0Var = lk0Var2;
                ezVar = ezVar2;
                npVar2 = npVar6;
                zx1Var = zx1Var4;
                npVar3 = npVar7;
                npVar4 = npVar8;
                kgVar = kgVar2;
                i6 = 0;
                rv4Var2.e0(-1807743691);
                rv4Var2.q(false);
            }
            cvb.c(yqe.A((y3b) k3b.k0.getValue(), rv4Var2), zbe.y(kq7Var, 16.0f), r0f.y(rv4Var2).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).h, rv4Var, 48, 0, 131064);
            nq7 k = tte.k(zbe.A(pna.f(kq7Var, 1.0f), 16.0f, nae.e, 2), r0f.z(rv4Var).d);
            lk0 lk0Var3 = lk0Var;
            ez ezVar3 = ezVar;
            xn1 a3 = wn1.a(ezVar3, lk0Var3, rv4Var, i6);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, k);
            rv4Var.i0();
            if (rv4Var.S) {
                zx1Var2 = zx1Var;
                rv4Var.k(zx1Var2);
            } else {
                zx1Var2 = zx1Var;
                rv4Var.r0();
            }
            np npVar9 = npVar;
            jce.F(npVar9, rv4Var, a3);
            np npVar10 = npVar2;
            jce.F(npVar10, rv4Var, l2);
            np npVar11 = npVar3;
            kg kgVar3 = kgVar;
            s21.t(hashCode2, rv4Var, npVar11, rv4Var, kgVar3);
            np npVar12 = npVar4;
            jce.F(npVar12, rv4Var, p2);
            boolean z2 = rhbVar2.c;
            String A3 = yqe.A((y3b) z1b.u.getValue(), rv4Var);
            String A4 = yqe.A((y3b) z1b.v.getValue(), rv4Var);
            nq7 k2 = tte.k(kq7Var, r0f.z(rv4Var).a);
            long g = rm1.g(r0f.y(rv4Var), 1.0f);
            ba5 ba5Var = lre.g;
            zx1 zx1Var5 = zx1Var2;
            l0e.n(null, A3, A4, zbe.z(nmd.v(k2, g, ba5Var), 16.0f, 12.0f), false, z2, xt4Var3, rv4Var, i4 & 3670016, 17);
            xbe.i(rv4Var, pna.h(kq7Var, 4.0f));
            int i24 = i4 >> 9;
            l0e.j(yqe.A((y3b) z1b.P.getValue(), rv4Var), tl1.B(yqe.A((y3b) z1b.R.getValue(), rv4Var), yqe.A((y3b) z1b.S.getValue(), rv4Var), yqe.A((y3b) z1b.Q.getValue(), rv4Var)), rhbVar2.k, zbe.z(a82.g(rv4Var, 1.0f, tte.k(kq7Var, r0f.z(rv4Var).a), ba5Var), 16.0f, 12.0f), xt4Var4, rv4Var, i24 & 57344);
            xbe.i(rv4Var, pna.h(kq7Var, 4.0f));
            l0e.n(null, yqe.A((y3b) z1b.c0.getValue(), rv4Var), yqe.A((y3b) z1b.d0.getValue(), rv4Var), zbe.z(a82.g(rv4Var, 1.0f, tte.k(kq7Var, r0f.z(rv4Var).a), ba5Var), 16.0f, 12.0f), false, !rhbVar2.f, xt4Var7, rv4Var, (i5 << 18) & 3670016, 17);
            rs8.u(rv4Var, true, kq7Var, 12.0f, rv4Var);
            cvb.c(yqe.A((y3b) z1b.W.getValue(), rv4Var), zbe.y(kq7Var, 16.0f), r0f.y(rv4Var).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).h, rv4Var, 48, 0, 131064);
            nq7 k3 = tte.k(zbe.A(pna.f(kq7Var, 1.0f), 16.0f, nae.e, 2), r0f.z(rv4Var).d);
            xn1 a4 = wn1.a(ezVar3, lk0Var3, rv4Var, 0);
            int hashCode3 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p3 = lye.p(rv4Var, k3);
            rv4Var.i0();
            if (rv4Var.S) {
                zx1Var3 = zx1Var5;
                rv4Var.k(zx1Var3);
            } else {
                zx1Var3 = zx1Var5;
                rv4Var.r0();
            }
            jce.F(npVar9, rv4Var, a4);
            jce.F(npVar10, rv4Var, l3);
            s21.t(hashCode3, rv4Var, npVar11, rv4Var, kgVar3);
            jce.F(npVar12, rv4Var, p3);
            zx1 zx1Var6 = zx1Var3;
            l0e.n(null, yqe.A((y3b) z1b.w.getValue(), rv4Var), yqe.A((y3b) z1b.x.getValue(), rv4Var), zbe.z(a82.g(rv4Var, 1.0f, tte.k(kq7Var, r0f.z(rv4Var).a), ba5Var), 16.0f, 12.0f), false, !rhbVar2.d, xt4Var5, rv4Var, (i4 >> 6) & 3670016, 17);
            rs8.u(rv4Var, true, kq7Var, 12.0f, rv4Var);
            cvb.c(yqe.A((y3b) z1b.U.getValue(), rv4Var), zbe.y(kq7Var, 16.0f), r0f.y(rv4Var).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).h, rv4Var, 48, 0, 131064);
            nq7 k4 = tte.k(zbe.A(pna.f(kq7Var, 1.0f), 16.0f, nae.e, 2), r0f.z(rv4Var).d);
            xn1 a5 = wn1.a(ezVar3, lk0Var3, rv4Var, 0);
            int hashCode4 = Long.hashCode(rv4Var.T);
            xt8 l4 = rv4Var.l();
            nq7 p4 = lye.p(rv4Var, k4);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var6);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar9, rv4Var, a5);
            jce.F(npVar10, rv4Var, l4);
            s21.t(hashCode4, rv4Var, npVar11, rv4Var, kgVar3);
            jce.F(npVar12, rv4Var, p4);
            l0e.n(null, yqe.A((y3b) z1b.r.getValue(), rv4Var), yqe.A((y3b) z1b.s.getValue(), rv4Var), zbe.z(a82.g(rv4Var, 1.0f, tte.k(kq7Var, r0f.z(rv4Var).a), ba5Var), 16.0f, 12.0f), false, rhbVar.e, xt4Var6, rv4Var, i24 & 3670016, 17);
            rs8.u(rv4Var, true, kq7Var, 12.0f, rv4Var);
            cvb.c(yqe.A((y3b) z1b.T.getValue(), rv4Var), zbe.y(kq7Var, 16.0f), r0f.y(rv4Var).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).h, rv4Var, 48, 0, 131064);
            nq7 k5 = tte.k(zbe.A(pna.f(kq7Var, 1.0f), 16.0f, nae.e, 2), r0f.z(rv4Var).d);
            xn1 a6 = wn1.a(ezVar3, lk0Var3, rv4Var, 0);
            int hashCode5 = Long.hashCode(rv4Var.T);
            xt8 l5 = rv4Var.l();
            nq7 p5 = lye.p(rv4Var, k5);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var6);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar9, rv4Var, a6);
            jce.F(npVar10, rv4Var, l5);
            s21.t(hashCode5, rv4Var, npVar11, rv4Var, kgVar3);
            jce.F(npVar12, rv4Var, p5);
            rhbVar2 = rhbVar;
            l0e.l(null, yqe.A((y3b) z1b.e0.getValue(), rv4Var), yqe.B((y3b) z1b.f0.getValue(), new Object[]{Integer.valueOf(rhbVar2.j.size())}, rv4Var), zbe.z(a82.g(rv4Var, 1.0f, tte.k(kq7Var, r0f.z(rv4Var).a), ba5Var), 16.0f, 12.0f), vt4Var2, rv4Var, (i5 << 9) & 57344, 1);
            xbe.i(rv4Var, pna.h(kq7Var, 4.0f));
            String A5 = yqe.A((y3b) z1b.y.getValue(), rv4Var);
            if (rhbVar2.g) {
                rv4Var.e0(50345567);
                A = yqe.A((y3b) b3b.a.getValue(), rv4Var);
                rv4Var.q(false);
            } else {
                rv4Var.e0(50419998);
                A = yqe.A((y3b) x2b.L0.getValue(), rv4Var);
                rv4Var.q(false);
            }
            l0e.l(null, A5, eub.o(A, " - ", yqe.B((y3b) z1b.z.getValue(), new Object[]{Integer.valueOf(rhbVar2.i.size())}, rv4Var)), zbe.z(a82.g(rv4Var, 1.0f, tte.k(kq7Var, r0f.z(rv4Var).a), ba5Var), 16.0f, 12.0f), vt4Var3, rv4Var, (i5 << 6) & 57344, 1);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            xbe.i(rv4Var2, mwe.u(zbe.C(kq7Var, nae.e, nae.e, nae.e, 12.0f, 7), false, 8));
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new lu4() { // from class: phb
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p6 = xoe.p(i | 1);
                    kxe.g(rhb.this, rh8Var, nq7Var, xt4Var, vt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, xt4Var6, xt4Var7, vt4Var2, vt4Var3, vt4Var4, (rv4) obj, p6);
                    return pvc.a;
                }
            };
        }
    }

    public static final void h(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        cz7 cz7Var2;
        pb2 pb2Var;
        vhb vhbVar;
        aw7 aw7Var;
        rv4 rv4Var2 = rv4Var;
        cz7Var.getClass();
        rv4Var2.g0(-883703675);
        if (rv4Var2.f(cz7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i3 & 1, z)) {
            sdd a2 = kv6.a(rv4Var2);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                vhb vhbVar2 = (vhb) ((fdd) voe.z(cm9.a(vhb.class), a2.i(), null, pb2Var, o96.a(rv4Var2), null));
                aw7 z2 = jsc.z(vhbVar2.f, rv4Var2);
                Object[] objArr = new Object[0];
                Object P = rv4Var2.P();
                lh9 lh9Var = ax1.a;
                if (P == lh9Var) {
                    P = new tab(29);
                    rv4Var2.o0(P);
                }
                aw7 aw7Var2 = (aw7) zpe.k(objArr, (vt4) P, rv4Var2, 48);
                boolean f = rv4Var2.f(vhbVar2);
                Object P2 = rv4Var2.P();
                if (f || P2 == lh9Var) {
                    P2 = new ahb(vhbVar2, null, 2);
                    rv4Var2.o0(P2);
                }
                yte.g((lu4) P2, rv4Var2, pvc.a);
                s02 s02Var = vhbVar2.C;
                boolean f2 = rv4Var2.f(aw7Var2);
                Object P3 = rv4Var2.P();
                if (f2 || P3 == lh9Var) {
                    P3 = new u7(aw7Var2, (m42) null, 9);
                    rv4Var2.o0(P3);
                }
                jye.b(s02Var, null, (mu4) P3, rv4Var2, 0);
                if (((Boolean) aw7Var2.getValue()).booleanValue()) {
                    rv4Var2.e0(1733916646);
                    boolean f3 = rv4Var2.f(aw7Var2);
                    Object P4 = rv4Var2.P();
                    if (f3 || P4 == lh9Var) {
                        P4 = new jia(aw7Var2, 25);
                        rv4Var2.o0(P4);
                    }
                    vhbVar = vhbVar2;
                    aw7Var = z2;
                    xb.d(true, (xt4) P4, jce.E(-589688244, new if3(aw7Var2, cz7Var), rv4Var2), null, null, jce.E(1720510633, new sp0(aw7Var2, 21), rv4Var2), bbe.c, null, 0L, 0L, nae.e, false, false, bbe.d, rv4Var, 1769862, 8088);
                    rv4Var2 = rv4Var;
                    rv4Var2.q(false);
                } else {
                    vhbVar = vhbVar2;
                    aw7Var = z2;
                    rv4Var2.e0(1734769053);
                    rv4Var2.q(false);
                }
                cz7Var2 = cz7Var;
                fxe.h(yqe.A((y3b) f3b.w0.getValue(), rv4Var2), pna.c, false, jce.E(-864026879, new ri9(cz7Var2, 18), rv4Var2), null, null, jce.E(-305950896, new cs1(vhbVar, cz7Var2, aw7Var, 17), rv4Var2), rv4Var2, 1575984, 52);
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
            u.d = new ri9(cz7Var2, i, 19);
        }
    }

    public static final void i(List list, String str, nq7 nq7Var, xt4 xt4Var, vt4 vt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        vt4 vt4Var2;
        boolean z2;
        boolean z3;
        Object obj;
        String str2;
        String str3;
        String str4;
        boolean z4;
        String str5;
        boolean z5;
        boolean z6;
        boolean z7;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean h;
        int i8;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1629168678);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var2.f(list);
            } else {
                h = rv4Var2.h(list);
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
            if (rv4Var2.f(str)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (rv4Var2.h(xt4Var2)) {
                i3 = 131072;
            } else {
                i3 = Parser.ARGC_LIMIT;
            }
            i2 |= i3;
        }
        if ((74899 & i2) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i2 & 1, z)) {
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = yae.z(Boolean.FALSE);
                rv4Var2.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            int i9 = i2 & Token.ASSIGN_MOD;
            if (i9 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !rv4Var2.f(list))) {
                z3 = false;
            } else {
                z3 = true;
            }
            boolean z8 = z2 | z3;
            Object P2 = rv4Var2.P();
            if (z8 || P2 == lh9Var) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((vyb) obj).a.equals(str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                P2 = (vyb) obj;
                if (P2 == null) {
                    P2 = (vyb) sl1.e0(list);
                }
                rv4Var2.o0(P2);
            }
            vyb vybVar = (vyb) P2;
            if (vybVar != null) {
                str2 = vybVar.a;
            } else {
                str2 = null;
            }
            String str6 = "";
            if (c16.i(str2, "system")) {
                rv4Var2.e0(2031980390);
                str3 = yqe.A((y3b) z1b.H.getValue(), rv4Var2);
                rv4Var2.q(false);
            } else if (c16.i(str2, "ai")) {
                rv4Var2.e0(2031982626);
                str3 = yqe.A((y3b) z1b.F.getValue(), rv4Var2);
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(2031985027);
                rv4Var2.q(false);
                if (vybVar != null) {
                    str3 = vybVar.b;
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    str3 = "";
                }
            }
            if (vybVar != null) {
                str4 = vybVar.a;
            } else {
                str4 = null;
            }
            if (c16.i(str4, "system")) {
                rv4Var2.e0(2031988075);
                str6 = yqe.A((y3b) z1b.I.getValue(), rv4Var2);
                z4 = false;
                rv4Var2.q(false);
            } else {
                z4 = false;
                if (c16.i(str4, "ai")) {
                    rv4Var2.e0(2031990471);
                    str6 = yqe.A((y3b) z1b.G.getValue(), rv4Var2);
                    rv4Var2.q(false);
                } else {
                    rv4Var2.e0(-1432744668);
                    rv4Var2.q(false);
                }
            }
            String str7 = str6;
            boolean i10 = c16.i(str, "system");
            b37 d = fu0.d(kh5.a, z4);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            int i11 = i2;
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, d);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            String str8 = str3;
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            kq7 kq7Var = kq7.a;
            nq7 f = pna.f(kq7Var, 1.0f);
            tza tzaVar = j27.a;
            nq7 v = nmd.v(tte.k(f, ((h27) rv4Var2.j(tzaVar)).c.d), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 3.0f), lre.g);
            Object P3 = rv4Var2.P();
            if (P3 == lh9Var) {
                P3 = new iia(aw7Var, 13);
                rv4Var2.o0(P3);
            }
            nq7 A = zbe.A(lbe.f(15, (vt4) P3, v, null, false), 14.0f, nae.e, 2);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, A);
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
            nq7 e = rs8.e(1.0f, zbe.A(kq7Var, nae.e, 12.0f, 1), true);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, e);
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
            cvb.c(str8, pna.f(kq7Var, 1.0f), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, oyb.a(((h27) rv4Var2.j(tzaVar)).b.j, 0L, 0L, dq4.f, null, null, 0L, null, 0, 0L, null, 16777211), rv4Var, 48, 24576, 114684);
            rv4 rv4Var3 = rv4Var;
            if (str7.length() > 0) {
                rv4Var3.e0(660186062);
                cvb.c(str7, null, zl1.b(0.5f, ((zl1) rv4Var3.j(r12.a)).a), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, ((h27) rv4Var3.j(tzaVar)).b.l, rv4Var, 0, 24960, 110586);
                rv4Var3 = rv4Var;
                rv4Var3.q(false);
            } else {
                rv4Var3.e0(660505672);
                rv4Var3.q(false);
            }
            rv4Var3.q(true);
            if (!i10) {
                rv4Var3.e0(-995944352);
                if (i9 == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if ((i11 & 57344) == 16384) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z9 = z6 | z5;
                if ((i11 & 458752) == 131072) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z10 = z9 | z7;
                Object P4 = rv4Var3.P();
                if (!z10 && P4 != lh9Var) {
                    str5 = str;
                    vt4Var2 = vt4Var;
                } else {
                    str5 = str;
                    vt4Var2 = vt4Var;
                    P4 = new bl7(str5, vt4Var2, xt4Var2);
                    rv4Var3.o0(P4);
                }
                mwe.b((vt4) P4, null, false, null, null, bbe.e, rv4Var, 1572864, 62);
                rv4Var3 = rv4Var;
                rv4Var3.q(false);
            } else {
                str5 = str;
                vt4Var2 = vt4Var;
                rv4Var3.e0(-995281262);
                rv4Var3.q(false);
            }
            nk5.a(rp5.c((wk3) ok3.u.getValue(), rv4Var3, 0), null, pna.n(kq7Var, 18.0f), zl1.b(0.6f, ((h27) rv4Var3.j(tzaVar)).a.q), rv4Var3, 432, 0);
            rv4Var3.q(true);
            boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
            nk0 nk0Var = kh5.f;
            Object P5 = rv4Var3.P();
            if (P5 == lh9Var) {
                P5 = new iia(aw7Var, 14);
                rv4Var3.o0(P5);
            }
            iue.e(booleanValue, nk0Var, 0L, null, nae.e, null, (vt4) P5, jce.E(1582061856, new ox0(list, str5, xt4Var, aw7Var, 5), rv4Var3), rv4Var, 14155824, 60);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            vt4Var2 = vt4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ru1(list, str, nq7Var, xt4Var, vt4Var2, xt4Var2, i, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(defpackage.rj8 r25, defpackage.nq7 r26, defpackage.rh8 r27, defpackage.oi8 r28, int r29, float r30, defpackage.lk0 r31, defpackage.sqa r32, boolean r33, defpackage.xt4 r34, defpackage.u08 r35, defpackage.xqa r36, defpackage.wi r37, defpackage.tu1 r38, defpackage.rv4 r39, int r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kxe.j(rj8, nq7, rh8, oi8, int, float, lk0, sqa, boolean, xt4, u08, xqa, wi, tu1, rv4, int, int, int):void");
    }

    public static final rk9 k(lw8 lw8Var, int i, ikc ikcVar, fvb fvbVar, boolean z, int i2) {
        rk9 rk9Var;
        float f;
        float f2;
        if (fvbVar != null) {
            rk9Var = fvbVar.c(ikcVar.b.w(i));
        } else {
            rk9Var = rk9.e;
        }
        float f3 = rk9Var.a;
        int X0 = lw8Var.X0(2.0f);
        if (z) {
            f = (i2 - f3) - X0;
        } else {
            f = f3;
        }
        if (z) {
            f2 = i2 - f3;
        } else {
            f2 = X0 + f3;
        }
        return rk9.b(rk9Var, f, f2, nae.e, 10);
    }

    public static final byte[] l(String str) {
        str.getClass();
        e31 e31Var = e31.d;
        e31 l = p40.l(str);
        if (l != null) {
            return l.s();
        }
        return null;
    }

    public static final String m(byte[] bArr) {
        bArr.getClass();
        e31 e31Var = e31.d;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        return new e31(Arrays.copyOf(copyOf, copyOf.length)).a();
    }

    public static final ar5 n(it1 it1Var) {
        it1Var.getClass();
        int ordinal = it1Var.ordinal();
        if (ordinal != 9) {
            if (ordinal != 13) {
                switch (ordinal) {
                    case 1:
                    case 2:
                        ar5 ar5Var = dce.e;
                        if (ar5Var != null) {
                            return ar5Var;
                        }
                        zq5 zq5Var = new zq5("accountBox", 24.0f, 24.0f, 960.0f, 960.0f, 0L, 0, false, 224);
                        esa esaVar = new esa(sve.d(4293125091L));
                        int i = k4d.a;
                        hy d = s21.d(200.0f, 721.69f);
                        d.l(54.0f, -53.0f, 125.5f, -83.5f);
                        d.m(154.5f, -30.5f);
                        d.l(83.0f, nae.e, 154.5f, 30.5f);
                        d.m(125.5f, 83.5f);
                        d.p(-509.38f);
                        d.l(nae.e, -4.62f, -3.85f, -8.46f);
                        d.l(-3.84f, -3.85f, -8.46f, -3.85f);
                        d.e(212.31f);
                        d.l(-4.62f, nae.e, -8.46f, 3.85f);
                        d.l(-3.85f, 3.84f, -3.85f, 8.46f);
                        d.p(509.38f);
                        d.b();
                        d.j(280.0f, -200.15f);
                        d.l(54.15f, nae.e, 92.08f, -37.92f);
                        d.k(610.0f, 445.69f, 610.0f, 391.54f);
                        d.m(-37.92f, -92.08f);
                        d.l(-37.93f, -37.92f, -92.08f, -37.92f);
                        d.m(-92.08f, 37.92f);
                        d.k(350.0f, 337.39f, 350.0f, 391.54f);
                        d.m(37.92f, 92.08f);
                        d.l(37.93f, 37.92f, 92.08f, 37.92f);
                        d.b();
                        d.i(212.31f, 820.0f);
                        d.k(182.0f, 820.0f, 161.0f, 799.0f);
                        d.l(-21.0f, -21.0f, -21.0f, -51.31f);
                        d.p(-535.38f);
                        d.k(140.0f, 182.0f, 161.0f, 161.0f);
                        d.l(21.0f, -21.0f, 51.31f, -21.0f);
                        d.f(535.38f);
                        d.k(778.0f, 140.0f, 799.0f, 161.0f);
                        d.l(21.0f, 21.0f, 21.0f, 51.31f);
                        d.p(535.38f);
                        d.k(820.0f, 778.0f, 799.0f, 799.0f);
                        d.l(-21.0f, 21.0f, -51.31f, 21.0f);
                        d.e(212.31f);
                        d.b();
                        d.j(34.77f, -60.0f);
                        d.f(465.84f);
                        d.k(662.0f, 713.31f, 601.89f, 690.5f);
                        d.k(541.77f, 667.69f, 480.0f, 667.69f);
                        d.l(-61.0f, nae.e, -122.12f, 22.81f);
                        d.l(-61.11f, 22.81f, -110.8f, 69.5f);
                        d.b();
                        d.i(480.0f, 461.54f);
                        d.l(-28.85f, nae.e, -49.42f, -20.58f);
                        d.k(410.0f, 420.39f, 410.0f, 391.54f);
                        d.m(20.58f, -49.42f);
                        d.l(20.57f, -20.58f, 49.42f, -20.58f);
                        d.m(49.42f, 20.58f);
                        d.k(550.0f, 362.69f, 550.0f, 391.54f);
                        d.m(-20.58f, 49.42f);
                        d.l(-20.57f, 20.58f, -49.42f, 20.58f);
                        d.b();
                        d.j(nae.e, -0.69f);
                        d.b();
                        zq5.d(zq5Var, d.a, 0, esaVar, null, nae.e, 0, 0, 4.0f);
                        ar5 e = zq5Var.e();
                        dce.e = e;
                        return e;
                    case 3:
                        ar5 ar5Var2 = k27.g;
                        if (ar5Var2 != null) {
                            return ar5Var2;
                        }
                        zq5 zq5Var2 = new zq5("build", 24.0f, 24.0f, 960.0f, 960.0f, 0L, 0, false, 224);
                        esa esaVar2 = new esa(sve.d(4293125091L));
                        int i2 = k4d.a;
                        hy d2 = s21.d(357.69f, 590.0f);
                        d2.l(-95.83f, nae.e, -162.91f, -67.08f);
                        d2.l(-67.09f, -67.09f, -67.09f, -162.92f);
                        d2.l(nae.e, -16.67f, 2.43f, -33.33f);
                        d2.l(2.42f, -16.67f, 8.11f, -31.98f);
                        d2.l(3.85f, -9.23f, 10.39f, -13.65f);
                        d2.l(6.53f, -4.42f, 14.76f, -6.42f);
                        d2.l(8.24f, -2.0f, 16.58f, 0.3f);
                        d2.l(8.35f, 2.31f, 15.19f, 9.16f);
                        d2.h(106.54f, 105.77f);
                        d2.g(387.54f, 304.0f);
                        d2.g(282.15f, 198.23f);
                        d2.l(-6.84f, -6.85f, -9.15f, -15.46f);
                        d2.l(-2.31f, -8.61f, -0.31f, -16.77f);
                        d2.l(2.0f, -8.15f, 6.62f, -14.69f);
                        d2.l(4.61f, -6.54f, 13.46f, -10.39f);
                        d2.l(15.31f, -6.07f, 31.85f, -8.5f);
                        d2.l(16.53f, -2.42f, 33.07f, -2.42f);
                        d2.l(95.84f, nae.e, 162.92f, 67.08f);
                        d2.l(67.08f, 67.09f, 67.08f, 162.92f);
                        d2.l(nae.e, 25.31f, -4.77f, 47.15f);
                        d2.l(-4.77f, 21.85f, -14.31f, 42.24f);
                        d2.g(786.0f, 665.54f);
                        d2.l(25.15f, 25.05f, 25.15f, 61.33f);
                        d2.m(-25.07f, 61.44f);
                        d2.l(-25.07f, 25.15f, -61.38f, 25.15f);
                        d2.m(-61.47f, -25.77f);
                        d2.g(447.08f, 570.92f);
                        d2.l(-21.16f, 9.16f, -43.01f, 14.12f);
                        d2.l(-21.86f, 4.96f, -46.38f, 4.96f);
                        d2.b();
                        d2.j(nae.e, -60.0f);
                        d2.l(26.26f, nae.e, 52.52f, -7.81f);
                        d2.l(26.25f, -7.8f, 48.02f, -24.42f);
                        d2.h(248.39f, 248.39f);
                        d2.l(7.3f, 7.3f, 18.3f, 7.0f);
                        d2.l(11.0f, -0.31f, 18.31f, -7.62f);
                        d2.l(7.31f, -7.31f, 7.31f, -18.31f);
                        d2.m(-7.31f, -18.31f);
                        d2.g(494.85f, 461.15f);
                        d2.l(16.84f, -20.77f, 24.84f, -47.27f);
                        d2.l(8.0f, -26.5f, 8.0f, -53.88f);
                        d2.l(nae.e, -66.54f, -47.54f, -117.77f);
                        d2.k(432.61f, 191.0f, 359.84f, 192.0f);
                        d2.h(86.7f, 86.69f);
                        d2.l(10.84f, 10.85f, 10.84f, 25.31f);
                        d2.l(nae.e, 14.46f, -10.84f, 25.31f);
                        d2.g(327.0f, 448.85f);
                        d2.l(-10.85f, 10.84f, -25.31f, 10.84f);
                        d2.l(-14.46f, nae.e, -25.31f, -10.84f);
                        d2.h(-86.69f, -86.7f);
                        d2.l(0.15f, 77.0f, 51.77f, 122.43f);
                        d2.k(293.08f, 530.0f, 357.69f, 530.0f);
                        d2.b();
                        d2.j(110.16f, -60.62f);
                        d2.b();
                        zq5.d(zq5Var2, d2.a, 0, esaVar2, null, nae.e, 0, 0, 4.0f);
                        ar5 e2 = zq5Var2.e();
                        k27.g = e2;
                        return e2;
                    case 4:
                    case 5:
                        ar5 ar5Var3 = sye.c;
                        if (ar5Var3 != null) {
                            return ar5Var3;
                        }
                        zq5 zq5Var3 = new zq5("info", 24.0f, 24.0f, 960.0f, 960.0f, 0L, 0, false, 224);
                        esa esaVar3 = new esa(sve.d(4293125091L));
                        int i3 = k4d.a;
                        hy d3 = s21.d(480.01f, 670.0f);
                        d3.l(12.76f, nae.e, 21.37f, -8.63f);
                        d3.k(510.0f, 652.75f, 510.0f, 640.0f);
                        d3.p(-170.0f);
                        d3.l(nae.e, -12.75f, -8.63f, -21.38f);
                        d3.l(-8.63f, -8.62f, -21.38f, -8.62f);
                        d3.l(-12.76f, nae.e, -21.37f, 8.62f);
                        d3.k(450.0f, 457.25f, 450.0f, 470.0f);
                        d3.p(170.0f);
                        d3.l(nae.e, 12.75f, 8.63f, 21.37f);
                        d3.l(8.63f, 8.63f, 21.38f, 8.63f);
                        d3.b();
                        d3.i(480.0f, 371.54f);
                        d3.l(13.73f, nae.e, 23.02f, -9.29f);
                        d3.m(9.29f, -23.02f);
                        d3.l(nae.e, -13.73f, -9.29f, -23.02f);
                        d3.l(-9.29f, -9.28f, -23.02f, -9.28f);
                        d3.m(-23.02f, 9.28f);
                        d3.l(-9.29f, 9.29f, -9.29f, 23.02f);
                        d3.m(9.29f, 23.02f);
                        d3.l(9.29f, 9.29f, 23.02f, 9.29f);
                        d3.b();
                        d3.j(0.07f, 488.46f);
                        d3.l(-78.84f, nae.e, -148.21f, -29.92f);
                        d3.m(-120.68f, -81.21f);
                        d3.l(-51.31f, -51.29f, -81.25f, -120.63f);
                        d3.k(100.0f, 558.9f, 100.0f, 480.07f);
                        d3.l(nae.e, -78.84f, 29.92f, -148.21f);
                        d3.m(81.21f, -120.68f);
                        d3.l(51.29f, -51.31f, 120.63f, -81.25f);
                        d3.k(401.1f, 100.0f, 479.93f, 100.0f);
                        d3.l(78.84f, nae.e, 148.21f, 29.92f);
                        d3.m(120.68f, 81.21f);
                        d3.l(51.31f, 51.29f, 81.25f, 120.63f);
                        d3.k(860.0f, 401.1f, 860.0f, 479.93f);
                        d3.l(nae.e, 78.84f, -29.92f, 148.21f);
                        d3.m(-81.21f, 120.68f);
                        d3.l(-51.29f, 51.31f, -120.63f, 81.25f);
                        d3.k(558.9f, 860.0f, 480.07f, 860.0f);
                        d3.b();
                        d3.j(-0.07f, -60.0f);
                        d3.l(134.0f, nae.e, 227.0f, -93.0f);
                        d3.m(93.0f, -227.0f);
                        d3.l(nae.e, -134.0f, -93.0f, -227.0f);
                        d3.m(-227.0f, -93.0f);
                        d3.l(-134.0f, nae.e, -227.0f, 93.0f);
                        d3.m(-93.0f, 227.0f);
                        d3.l(nae.e, 134.0f, 93.0f, 227.0f);
                        d3.m(227.0f, 93.0f);
                        d3.b();
                        d3.j(nae.e, -320.0f);
                        d3.b();
                        zq5.d(zq5Var3, d3.a, 0, esaVar3, null, nae.e, 0, 0, 4.0f);
                        ar5 e3 = zq5Var3.e();
                        sye.c = e3;
                        return e3;
                    case 6:
                    case 7:
                        ar5 ar5Var4 = xve.j;
                        if (ar5Var4 != null) {
                            return ar5Var4;
                        }
                        zq5 zq5Var4 = new zq5("edit", 24.0f, 24.0f, 960.0f, 960.0f, 0L, 0, false, 224);
                        esa esaVar4 = new esa(sve.d(4293125091L));
                        int i4 = k4d.a;
                        hy hyVar = new hy(2);
                        hyVar.i(200.0f, 760.0f);
                        hyVar.f(50.46f);
                        hyVar.h(409.46f, -409.46f);
                        hyVar.h(-50.46f, -50.46f);
                        hyVar.g(200.0f, 709.54f);
                        hyVar.o(760.0f);
                        hyVar.b();
                        hyVar.j(-23.84f, 60.0f);
                        hyVar.l(-15.37f, nae.e, -25.76f, -10.4f);
                        hyVar.l(-10.4f, -10.39f, -10.4f, -25.76f);
                        hyVar.p(-69.3f);
                        hyVar.l(nae.e, -14.63f, 5.62f, -27.89f);
                        hyVar.l(5.61f, -13.26f, 15.46f, -23.11f);
                        hyVar.h(506.54f, -506.31f);
                        hyVar.l(9.07f, -8.24f, 20.03f, -12.73f);
                        hyVar.l(10.97f, -4.5f, 23.0f, -4.5f);
                        hyVar.m(23.3f, 4.27f);
                        hyVar.l(11.28f, 4.27f, 19.97f, 13.58f);
                        hyVar.h(48.85f, 49.46f);
                        hyVar.l(9.31f, 8.69f, 13.27f, 20.0f);
                        hyVar.l(3.96f, 11.31f, 3.96f, 22.62f);
                        hyVar.l(nae.e, 12.07f, -4.12f, 23.03f);
                        hyVar.l(-4.12f, 10.97f, -13.11f, 20.04f);
                        hyVar.g(296.46f, 798.92f);
                        hyVar.l(-9.85f, 9.85f, -23.11f, 15.46f);
                        hyVar.l(-13.26f, 5.62f, -27.89f, 5.62f);
                        hyVar.f(-69.3f);
                        hyVar.b();
                        hyVar.j(584.22f, -570.15f);
                        hyVar.h(-50.23f, -50.23f);
                        hyVar.h(50.23f, 50.23f);
                        hyVar.b();
                        hyVar.j(-126.13f, 75.9f);
                        hyVar.h(-24.79f, -25.67f);
                        hyVar.h(50.46f, 50.46f);
                        hyVar.h(-25.67f, -24.79f);
                        hyVar.b();
                        zq5.d(zq5Var4, hyVar.a, 0, esaVar4, null, nae.e, 0, 0, 4.0f);
                        ar5 e4 = zq5Var4.e();
                        xve.j = e4;
                        return e4;
                    default:
                        ar5 ar5Var5 = vae.g;
                        if (ar5Var5 != null) {
                            return ar5Var5;
                        }
                        zq5 zq5Var5 = new zq5("keyboardArrowRight", 24.0f, 24.0f, 960.0f, 960.0f, 0L, 0, false, 224);
                        esa esaVar5 = new esa(sve.d(4293125091L));
                        int i5 = k4d.a;
                        hy hyVar2 = new hy(2);
                        hyVar2.i(517.85f, 480.0f);
                        hyVar2.g(354.92f, 317.08f);
                        hyVar2.l(-8.3f, -8.31f, -8.5f, -20.89f);
                        hyVar2.l(-0.19f, -12.57f, 8.5f, -21.27f);
                        hyVar2.l(8.7f, -8.69f, 21.08f, -8.69f);
                        hyVar2.l(12.38f, nae.e, 21.08f, 8.69f);
                        hyVar2.h(179.77f, 179.77f);
                        hyVar2.l(5.61f, 5.62f, 7.92f, 11.85f);
                        hyVar2.l(2.31f, 6.23f, 2.31f, 13.46f);
                        hyVar2.m(-2.31f, 13.46f);
                        hyVar2.l(-2.31f, 6.23f, -7.92f, 11.85f);
                        hyVar2.g(397.08f, 685.08f);
                        hyVar2.l(-8.31f, 8.3f, -20.89f, 8.5f);
                        hyVar2.l(-12.57f, 0.19f, -21.27f, -8.5f);
                        hyVar2.l(-8.69f, -8.7f, -8.69f, -21.08f);
                        hyVar2.l(nae.e, -12.38f, 8.69f, -21.08f);
                        hyVar2.g(517.85f, 480.0f);
                        hyVar2.b();
                        zq5.d(zq5Var5, hyVar2.a, 0, esaVar5, null, nae.e, 0, 0, 4.0f);
                        ar5 e5 = zq5Var5.e();
                        vae.g = e5;
                        return e5;
                }
            }
            ar5 ar5Var6 = lpe.d;
            if (ar5Var6 != null) {
                return ar5Var6;
            }
            zq5 zq5Var6 = new zq5("star", 24.0f, 24.0f, 960.0f, 960.0f, 0L, 0, false, 224);
            esa esaVar6 = new esa(sve.d(4293125091L));
            int i6 = k4d.a;
            hy hyVar3 = new hy(2);
            hyVar3.j(354.0f, -287.0f);
            hyVar3.h(126.0f, -76.0f);
            hyVar3.h(126.0f, 77.0f);
            hyVar3.h(-33.0f, -144.0f);
            hyVar3.h(111.0f, -96.0f);
            hyVar3.h(-146.0f, -13.0f);
            hyVar3.h(-58.0f, -136.0f);
            hyVar3.h(-58.0f, 135.0f);
            hyVar3.h(-146.0f, 13.0f);
            hyVar3.h(111.0f, 97.0f);
            hyVar3.h(-33.0f, 143.0f);
            hyVar3.b();
            hyVar3.j(126.0f, -5.46f);
            hyVar3.h(-155.61f, 93.84f);
            hyVar3.l(-8.7f, 5.08f, -17.43f, 4.27f);
            hyVar3.l(-8.73f, -0.81f, -15.8f, -5.88f);
            hyVar3.l(-7.08f, -5.08f, -10.93f, -13.27f);
            hyVar3.l(-3.84f, -8.19f, -1.23f, -18.12f);
            hyVar3.h(41.31f, -176.69f);
            hyVar3.h(-137.38f, -118.92f);
            hyVar3.l(-7.7f, -6.69f, -9.81f, -15.5f);
            hyVar3.l(-2.12f, -8.81f, 1.11f, -17.12f);
            hyVar3.l(3.23f, -8.3f, 9.31f, -13.57f);
            hyVar3.m(16.62f, -6.89f);
            hyVar3.h(181.3f, -15.84f);
            hyVar3.g(451.85f, 197.0f);
            hyVar3.l(3.84f, -9.31f, 11.65f, -13.77f);
            hyVar3.l(7.81f, -4.46f, 16.5f, -4.46f);
            hyVar3.l(8.69f, nae.e, 16.5f, 4.46f);
            hyVar3.l(7.81f, 4.46f, 11.65f, 13.77f);
            hyVar3.h(70.39f, 166.85f);
            hyVar3.h(181.3f, 15.84f);
            hyVar3.l(10.54f, 1.62f, 16.62f, 6.89f);
            hyVar3.l(6.08f, 5.27f, 9.31f, 13.57f);
            hyVar3.l(3.23f, 8.31f, 1.11f, 17.12f);
            hyVar3.l(-2.11f, 8.81f, -9.81f, 15.5f);
            hyVar3.g(639.69f, 551.69f);
            hyVar3.g(681.0f, 728.38f);
            hyVar3.l(2.61f, 9.93f, -1.23f, 18.12f);
            hyVar3.l(-3.85f, 8.19f, -10.93f, 13.27f);
            hyVar3.l(-7.07f, 5.07f, -15.8f, 5.88f);
            hyVar3.l(-8.73f, 0.81f, -17.43f, -4.27f);
            hyVar3.g(480.0f, 667.54f);
            hyVar3.b();
            hyVar3.i(480.0f, 490.0f);
            hyVar3.b();
            zq5.d(zq5Var6, hyVar3.a, 0, esaVar6, null, nae.e, 0, 0, 4.0f);
            ar5 e6 = zq5Var6.e();
            lpe.d = e6;
            return e6;
        }
        ar5 ar5Var7 = pc2.i;
        if (ar5Var7 != null) {
            return ar5Var7;
        }
        zq5 zq5Var7 = new zq5("settings", 24.0f, 24.0f, 960.0f, 960.0f, 0L, 0, false, 224);
        esa esaVar7 = new esa(sve.d(4293125091L));
        int i7 = k4d.a;
        hy d4 = s21.d(435.69f, 860.0f);
        d4.l(-20.46f, nae.e, -35.34f, -13.58f);
        d4.l(-14.89f, -13.57f, -18.12f, -33.42f);
        d4.h(-9.77f, -74.85f);
        d4.l(-16.07f, -5.38f, -32.96f, -15.07f);
        d4.l(-16.88f, -9.7f, -30.19f, -20.77f);
        d4.g(240.0f, 731.77f);
        d4.l(-18.85f, 8.31f, -37.88f, 1.61f);
        d4.l(-19.04f, -6.69f, -29.58f, -24.3f);
        d4.h(-45.08f, -78.16f);
        d4.l(-10.54f, -17.61f, -6.07f, -37.27f);
        d4.l(4.46f, -19.65f, 20.46f, -32.42f);
        d4.h(59.92f, -45.0f);
        d4.l(-1.38f, -8.92f, -1.96f, -17.92f);
        d4.l(-0.58f, -9.0f, -0.58f, -17.93f);
        d4.l(nae.e, -8.53f, 0.58f, -17.34f);
        d4.m(1.96f, -19.27f);
        d4.h(-59.92f, -45.0f);
        d4.l(-16.0f, -12.77f, -20.27f, -32.62f);
        d4.l(-4.27f, -19.84f, 6.27f, -37.46f);
        d4.h(44.69f, -77.0f);
        d4.l(10.54f, -17.23f, 29.58f, -24.11f);
        d4.l(19.03f, -6.89f, 37.88f, 1.42f);
        d4.h(68.92f, 29.08f);
        d4.l(14.47f, -11.46f, 30.89f, -20.96f);
        d4.m(32.27f, -15.27f);
        d4.g(382.23f, 147.0f);
        d4.l(3.23f, -19.85f, 18.12f, -33.42f);
        d4.k(415.23f, 100.0f, 435.69f, 100.0f);
        d4.f(88.62f);
        d4.l(20.46f, nae.e, 35.34f, 13.58f);
        d4.l(14.89f, 13.57f, 18.12f, 33.42f);
        d4.h(9.77f, 75.23f);
        d4.l(18.0f, 6.54f, 32.57f, 15.27f);
        d4.l(14.58f, 8.73f, 29.43f, 20.58f);
        d4.g(720.39f, 229.0f);
        d4.l(18.84f, -8.31f, 37.88f, -1.42f);
        d4.l(19.04f, 6.88f, 29.57f, 24.11f);
        d4.h(44.7f, 77.39f);
        d4.l(10.54f, 17.61f, 6.07f, 37.27f);
        d4.l(-4.46f, 19.65f, -20.46f, 32.42f);
        d4.h(-61.46f, 46.15f);
        d4.l(2.15f, 9.69f, 2.35f, 18.12f);
        d4.l(0.19f, 8.42f, 0.19f, 16.96f);
        d4.l(nae.e, 8.15f, -0.39f, 16.58f);
        d4.l(-0.38f, 8.42f, -2.76f, 19.27f);
        d4.h(60.3f, 45.38f);
        d4.l(16.0f, 12.77f, 20.66f, 32.42f);
        d4.l(4.65f, 19.66f, -5.89f, 37.27f);
        d4.h(-45.31f, 77.77f);
        d4.l(-10.53f, 17.62f, -29.76f, 24.31f);
        d4.l(-19.23f, 6.69f, -38.08f, -1.62f);
        d4.h(-68.46f, -29.46f);
        d4.l(-14.85f, 11.85f, -30.31f, 20.96f);
        d4.l(-15.46f, 9.12f, -31.69f, 14.89f);
        d4.g(577.77f, 813.0f);
        d4.l(-3.23f, 19.85f, -18.12f, 33.42f);
        d4.k(544.77f, 860.0f, 524.31f, 860.0f);
        d4.f(-88.62f);
        d4.b();
        d4.j(4.31f, -60.0f);
        d4.f(78.62f);
        d4.g(533.0f, 692.85f);
        d4.l(30.62f, -8.0f, 55.96f, -22.73f);
        d4.l(25.35f, -14.74f, 48.89f, -37.89f);
        d4.g(737.23f, 674.0f);
        d4.h(39.39f, -68.0f);
        d4.h(-86.77f, -65.38f);
        d4.l(5.0f, -15.54f, 6.8f, -30.47f);
        d4.l(1.81f, -14.92f, 1.81f, -30.15f);
        d4.l(nae.e, -15.62f, -1.81f, -30.15f);
        d4.l(-1.8f, -14.54f, -6.8f, -29.7f);
        d4.g(777.38f, 354.0f);
        d4.g(738.0f, 286.0f);
        d4.h(-100.54f, 42.38f);
        d4.l(-20.08f, -21.46f, -48.11f, -37.92f);
        d4.l(-28.04f, -16.46f, -56.73f, -23.31f);
        d4.g(520.0f, 160.0f);
        d4.f(-79.38f);
        d4.h(-13.24f, 106.77f);
        d4.l(-30.61f, 7.23f, -56.53f, 22.15f);
        d4.l(-25.93f, 14.93f, -49.47f, 38.46f);
        d4.g(222.0f, 286.0f);
        d4.h(-39.38f, 68.0f);
        d4.g(269.0f, 418.38f);
        d4.l(-5.0f, 14.24f, -7.0f, 29.62f);
        d4.m(-2.0f, 32.38f);
        d4.l(nae.e, 15.62f, 2.0f, 30.62f);
        d4.l(2.0f, 15.0f, 6.62f, 29.62f);
        d4.h(-86.0f, 65.38f);
        d4.g(222.0f, 674.0f);
        d4.h(99.0f, -42.0f);
        d4.l(22.77f, 23.38f, 48.69f, 38.31f);
        d4.l(25.93f, 14.92f, 57.31f, 22.92f);
        d4.g(440.0f, 800.0f);
        d4.b();
        d4.j(40.46f, -200.0f);
        d4.l(49.92f, nae.e, 84.96f, -35.04f);
        d4.l(35.04f, -35.04f, 35.04f, -84.96f);
        d4.l(nae.e, -49.92f, -35.04f, -84.96f);
        d4.k(530.38f, 360.0f, 480.46f, 360.0f);
        d4.l(-50.54f, nae.e, -85.27f, 35.04f);
        d4.a.add(new un8(360.46f, 480.0f));
        d4.l(nae.e, 49.92f, 34.73f, 84.96f);
        d4.k(429.92f, 600.0f, 480.46f, 600.0f);
        d4.b();
        d4.i(480.0f, 480.0f);
        d4.b();
        zq5.d(zq5Var7, d4.a, 0, esaVar7, null, nae.e, 0, 0, 4.0f);
        ar5 e7 = zq5Var7.e();
        pc2.i = e7;
        return e7;
    }

    public static final nq7 o(nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, long j) {
        nq7Var.getClass();
        xt4Var.getClass();
        return yz6.b(nq7Var, xt4Var, xt4Var2, null, false, j, null, 512);
    }

    public static final String p(byte[] bArr) {
        e31 e31Var = e31.d;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        return new e31(Arrays.copyOf(copyOf, copyOf.length)).d("MD5").f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x030b A[LOOP:8: B:90:0x01e8->B:171:0x030b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0325 A[EDGE_INSN: B:273:0x0325->B:173:0x0325 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.j06 q(byte[] r39) {
        /*
            Method dump skipped, instructions count: 1240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kxe.q(byte[]):j06");
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [aa5, bma] */
    public static final h2a r(int i, rv4 rv4Var, kj6 kj6Var) {
        h2a h2aVar;
        kj6Var.getClass();
        rv4Var.e0(927400620);
        boolean d = rv4Var.d(i);
        Object P = rv4Var.P();
        lh9 lh9Var = ax1.a;
        if (d || P == lh9Var) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                h2aVar = new h2a(kj6Var);
                            } else {
                                h2aVar = new c92(kj6Var, 1);
                            }
                        } else {
                            h2aVar = new c92(kj6Var, 2);
                        }
                    } else {
                        ?? aa5Var = new aa5(kj6Var);
                        aa5Var.z = 1;
                        aa5Var.A = 1;
                        h2aVar = aa5Var;
                    }
                } else {
                    h2aVar = new c92(kj6Var, 0);
                }
            } else {
                h2aVar = new c92(kj6Var, 3);
            }
            P = h2aVar;
            rv4Var.o0(P);
        }
        h2a h2aVar2 = (h2a) P;
        Object P2 = rv4Var.P();
        if (P2 == lh9Var) {
            P2 = yte.s(rv4Var);
            rv4Var.o0(P2);
        }
        h2aVar2.b = (m82) P2;
        h2aVar2.a.setValue(kj6Var);
        rv4Var.q(false);
        return h2aVar2;
    }

    public static final ArrayList s(String str, hl8 hl8Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ArrayList arrayList;
        int i7;
        String str2;
        ArrayList arrayList2 = new ArrayList();
        if (str.length() > 0) {
            arrayList2.add(new zj5(ak5.c, str, null, 2, Integer.valueOf(i + 1), null, null, null, null, 4068));
        }
        ArrayList arrayList3 = hl8Var.a;
        ArrayList arrayList4 = hl8Var.b;
        if (!arrayList3.isEmpty()) {
            int size = arrayList3.size();
            int i8 = -1;
            int i9 = -1;
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList3.get(i10);
                i10++;
                ah9 ah9Var = (ah9) obj;
                int i11 = ah9Var.a;
                if (i11 > i8) {
                    i8 = i11;
                }
                int i12 = ah9Var.b;
                if (i12 > i9) {
                    i9 = i12;
                }
            }
            int size2 = arrayList4.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList4.get(i13);
                i13++;
                s97 s97Var = (s97) obj2;
                int i14 = s97Var.c;
                if (i14 > i8) {
                    i8 = i14;
                }
                int i15 = s97Var.d;
                if (i15 > i9) {
                    i9 = i15;
                }
            }
            if (i8 >= 0 && i9 >= 0) {
                if (i8 >= 100000 || i9 >= 1000) {
                    i8 = Math.min(i8, 99999);
                    i9 = Math.min(i9, 999);
                }
                int i16 = i8 + 1;
                String[][] strArr = new String[i16];
                for (int i17 = 0; i17 < i16; i17++) {
                    int i18 = i9 + 1;
                    String[] strArr2 = new String[i18];
                    for (int i19 = 0; i19 < i18; i19++) {
                        strArr2[i19] = "";
                    }
                    strArr[i17] = strArr2;
                }
                int size3 = arrayList3.size();
                int i20 = 0;
                while (i20 < size3) {
                    Object obj3 = arrayList3.get(i20);
                    i20++;
                    ah9 ah9Var2 = (ah9) obj3;
                    int i21 = ah9Var2.a;
                    if (i21 <= i8 && (i6 = ah9Var2.b) <= i9) {
                        String[] strArr3 = strArr[i21];
                        Object obj4 = ah9Var2.c;
                        if (obj4 == null) {
                            arrayList = arrayList3;
                            i7 = size3;
                            str2 = "";
                        } else if (obj4 instanceof Double) {
                            Number number = (Number) obj4;
                            double doubleValue = number.doubleValue();
                            if (!Double.isNaN(doubleValue) && !Double.isInfinite(doubleValue) && doubleValue == Math.floor(doubleValue)) {
                                double doubleValue2 = number.doubleValue();
                                long j = (long) doubleValue2;
                                arrayList = arrayList3;
                                i7 = size3;
                                int i22 = (j > doubleValue2 ? 1 : (j == doubleValue2 ? 0 : -1));
                                if (i22 == 0) {
                                    str2 = String.valueOf(j);
                                } else if (!Double.isNaN(doubleValue2) && !Double.isInfinite(doubleValue2) && doubleValue2 == Math.floor(doubleValue2) && i22 == 0) {
                                    str2 = String.valueOf(j);
                                } else {
                                    str2 = String.valueOf(doubleValue2);
                                }
                            } else {
                                arrayList = arrayList3;
                                i7 = size3;
                                double doubleValue3 = number.doubleValue();
                                if (doubleValue3 != 0.0d && !Double.isNaN(doubleValue3) && !Double.isInfinite(doubleValue3)) {
                                    int floor = 14 - ((int) Math.floor(Math.log10(Math.abs(doubleValue3))));
                                    double d = 1.0d;
                                    if (floor < 0) {
                                        while (true) {
                                            int i23 = floor + 1;
                                            if (floor >= 0) {
                                                break;
                                            }
                                            d /= 10.0d;
                                            floor = i23;
                                        }
                                    } else {
                                        while (true) {
                                            int i24 = floor - 1;
                                            if (floor <= 0) {
                                                break;
                                            }
                                            d *= 10.0d;
                                            floor = i24;
                                        }
                                    }
                                    doubleValue3 = Math.rint(doubleValue3 * d) / d;
                                }
                                if (!Double.isNaN(doubleValue3) && !Double.isInfinite(doubleValue3) && doubleValue3 == Math.floor(doubleValue3)) {
                                    long j2 = (long) doubleValue3;
                                    if (j2 == doubleValue3) {
                                        str2 = String.valueOf(j2);
                                    }
                                }
                                str2 = String.valueOf(doubleValue3);
                            }
                        } else {
                            arrayList = arrayList3;
                            i7 = size3;
                            if (obj4 instanceof Boolean) {
                                if (((Boolean) obj4).booleanValue()) {
                                    str2 = "TRUE";
                                } else {
                                    str2 = "FALSE";
                                }
                            } else {
                                str2 = (String) obj4;
                            }
                        }
                        strArr3[i6] = str2;
                        arrayList3 = arrayList;
                        size3 = i7;
                    }
                }
                HashMap hashMap = new HashMap();
                HashSet hashSet = new HashSet();
                int size4 = arrayList4.size();
                int i25 = 0;
                while (i25 < size4) {
                    Object obj5 = arrayList4.get(i25);
                    int i26 = i25 + 1;
                    s97 s97Var2 = (s97) obj5;
                    int min = Math.min(s97Var2.a, i8);
                    int min2 = Math.min(s97Var2.b, i9);
                    int min3 = Math.min(s97Var2.c, i8);
                    int min4 = Math.min(s97Var2.d, i9);
                    ArrayList arrayList5 = arrayList4;
                    int i27 = size4;
                    hashMap.put(min + "," + min2, new yk8(Integer.valueOf((min4 - min2) + 1), Integer.valueOf((min3 - min) + 1)));
                    if (min <= min3) {
                        int i28 = min;
                        while (true) {
                            if (min2 <= min4) {
                                int i29 = min2;
                                while (true) {
                                    if (i28 != min || i29 != min2) {
                                        hashSet.add(i28 + "," + i29);
                                    }
                                    if (i29 == min4) {
                                        break;
                                    }
                                    i29++;
                                }
                            }
                            if (i28 != min3) {
                                i28++;
                            }
                        }
                    }
                    arrayList4 = arrayList5;
                    size4 = i27;
                    i25 = i26;
                }
                if (i8 >= 0) {
                    int i30 = 0;
                    int i31 = -1;
                    i2 = -1;
                    while (true) {
                        String[] strArr4 = strArr[i30];
                        int length = strArr4.length;
                        int i32 = 0;
                        while (true) {
                            if (i32 >= length) {
                                break;
                            } else if (!c16.i(strArr4[i32], "")) {
                                if (i31 == -1) {
                                    i31 = i30;
                                }
                                i2 = i30;
                            } else {
                                i32++;
                            }
                        }
                        if (i30 == i8) {
                            break;
                        }
                        i30++;
                    }
                    i3 = i31;
                } else {
                    i2 = -1;
                    i3 = -1;
                }
                if (i3 != -1) {
                    ArrayList arrayList6 = new ArrayList();
                    if (i3 <= i2) {
                        while (true) {
                            ArrayList arrayList7 = new ArrayList();
                            if (i9 >= 0) {
                                int i33 = 0;
                                while (true) {
                                    String str3 = i3 + "," + i33;
                                    if (!hashSet.contains(str3)) {
                                        yk8 yk8Var = (yk8) hashMap.get(str3);
                                        String str4 = strArr[i3][i33];
                                        if (yk8Var != null) {
                                            i4 = ((Number) yk8Var.a).intValue();
                                        } else {
                                            i4 = 1;
                                        }
                                        if (yk8Var != null) {
                                            i5 = ((Number) yk8Var.b).intValue();
                                        } else {
                                            i5 = 1;
                                        }
                                        arrayList7.add(new ka1(str4, i4, i5));
                                    }
                                    if (i33 == i9) {
                                        break;
                                    }
                                    i33++;
                                }
                            }
                            arrayList6.add(arrayList7);
                            if (i3 == i2) {
                                break;
                            }
                            i3++;
                        }
                    }
                    if (!arrayList6.isEmpty()) {
                        ck5 b2 = mjb.b(arrayList6);
                        if (b2.a > 0) {
                            arrayList2.add(new zj5(ak5.b, null, b2, null, Integer.valueOf(i + 1), null, null, null, null, 4074));
                        }
                    }
                }
            }
        }
        return arrayList2;
    }

    public static final CharSequence t(CharSequence charSequence) {
        if (charSequence.length() <= 5000) {
            return charSequence;
        }
        if (Character.isHighSurrogate(charSequence.charAt(4999)) && Character.isLowSurrogate(charSequence.charAt(5000))) {
            return k4b.K0(charSequence, 4999);
        }
        return k4b.K0(charSequence, 5000);
    }
}
