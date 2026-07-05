package defpackage;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mue  reason: default package */
/* loaded from: classes.dex */
public abstract class mue {
    public static final tu1 a = new tu1(new dv1(10), false, -614669105);
    public static final tu1 b = new tu1(new dv1(11), false, -2064167214);
    public static final tu1 c = new tu1(new ev1(3), false, 297857878);
    public static final tu1 d = new tu1(new ev1(4), false, 382569386);
    public static final aga e = new aga(1);

    public static final void a(String str, cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        pb2 pb2Var;
        final boolean z3;
        str.getClass();
        cz7Var.getClass();
        rv4Var.g0(-918582581);
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
            vkd vkdVar = (vkd) rv4Var.j(ikd.a);
            if ((i5 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = new op0(str, 23);
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
                final o34 o34Var = (o34) ((fdd) voe.z(cm9.a(o34.class), a2.i(), null, pb2Var, o96.a(rv4Var), vt4Var));
                final aw7 z4 = jsc.z(o34Var.e, rv4Var);
                if (vkdVar != vkd.a && vkdVar != vkd.b) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                Object[] objArr = new Object[0];
                Object P2 = rv4Var.P();
                if (P2 == lh9Var) {
                    P2 = new k24(1);
                    rv4Var.o0(P2);
                }
                final aw7 aw7Var = (aw7) zpe.k(objArr, (vt4) P2, rv4Var, 48);
                fxe.h(((n34) z4.getValue()).a, pna.c, true, jce.E(768980431, new p7(cz7Var, 26), rv4Var), jce.E(635770950, new l34(z3, aw7Var, 0), rv4Var), null, jce.E(-431137312, new nu4() { // from class: m34
                    @Override // defpackage.nu4
                    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
                        boolean z5;
                        int i6;
                        rh8 rh8Var = (rh8) obj2;
                        rv4 rv4Var2 = (rv4) obj3;
                        int intValue = ((Integer) obj4).intValue();
                        ((ou0) obj).getClass();
                        rh8Var.getClass();
                        if ((intValue & 48) == 0) {
                            if (rv4Var2.f(rh8Var)) {
                                i6 = 32;
                            } else {
                                i6 = 16;
                            }
                            intValue |= i6;
                        }
                        if ((intValue & Token.TARGET) != 144) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (rv4Var2.U(intValue & 1, z5)) {
                            Object P3 = rv4Var2.P();
                            Object obj5 = ax1.a;
                            if (P3 == obj5) {
                                P3 = new sk1(0);
                                rv4Var2.o0(P3);
                            }
                            sk1 sk1Var = (sk1) P3;
                            aw7 aw7Var2 = aw7.this;
                            String str2 = ((n34) aw7Var2.getValue()).a;
                            boolean f = rv4Var2.f(aw7Var2) | rv4Var2.f(sk1Var);
                            Object P4 = rv4Var2.P();
                            if (f || P4 == obj5) {
                                P4 = new db(sk1Var, aw7Var2, null, 15);
                                rv4Var2.o0(P4);
                            }
                            yte.g((lu4) P4, rv4Var2, str2);
                            gv9 a3 = ev9.a(lz.a, kh5.F, rv4Var2, 0);
                            int hashCode = Long.hashCode(rv4Var2.T);
                            xt8 l = rv4Var2.l();
                            nq7 p = lye.p(rv4Var2, kq7.a);
                            rw1.k.getClass();
                            vt4 vt4Var2 = qw1.b;
                            rv4Var2.i0();
                            if (rv4Var2.S) {
                                rv4Var2.k(vt4Var2);
                            } else {
                                rv4Var2.r0();
                            }
                            jce.F(qw1.f, rv4Var2, a3);
                            jce.F(qw1.e, rv4Var2, l);
                            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
                            jce.C(qw1.h, rv4Var2);
                            jce.F(qw1.d, rv4Var2, p);
                            Object P5 = rv4Var2.P();
                            if (P5 == obj5) {
                                P5 = new ro3(yo3.b, 510);
                                rv4Var2.o0(P5);
                            }
                            ze4 ze4Var = pna.c;
                            vae.c(sk1Var, (ro3) P5, zbe.x(ze4Var, rh8Var), rv4Var2, 0);
                            boolean z6 = z3;
                            Object obj6 = o34Var;
                            if (!z6) {
                                rv4Var2.e0(845451219);
                                String str3 = ((n34) aw7Var2.getValue()).a;
                                List list = ((n34) aw7Var2.getValue()).b;
                                boolean f2 = rv4Var2.f(obj6);
                                Object P6 = rv4Var2.P();
                                if (f2 || P6 == obj5) {
                                    P6 = new cq2(obj6, 24);
                                    rv4Var2.o0(P6);
                                }
                                mue.c(str3, list, ze4Var, (xt4) P6, rv4Var2, 384);
                                rv4Var2.q(false);
                            } else {
                                rv4Var2.e0(845807750);
                                rv4Var2.q(false);
                            }
                            rv4Var2.q(true);
                            if (z6) {
                                rv4Var2.e0(-2058314165);
                                aw7 aw7Var3 = aw7Var;
                                boolean booleanValue = ((Boolean) aw7Var3.getValue()).booleanValue();
                                boolean f3 = rv4Var2.f(aw7Var3);
                                Object P7 = rv4Var2.P();
                                if (f3 || P7 == obj5) {
                                    P7 = new zn3(aw7Var3, 17);
                                    rv4Var2.o0(P7);
                                }
                                nmd.f(booleanValue, (xt4) P7, null, true, 0L, 0L, nae.e, 0L, 360.0f, jce.E(417089236, new ax(1, obj6, aw7Var3, aw7Var2), rv4Var2), rv4Var2, 905972736, 244);
                                rv4Var2.q(false);
                            } else {
                                rv4Var2.e0(-2057697854);
                                rv4Var2.q(false);
                            }
                        } else {
                            rv4Var2.X();
                        }
                        return pvc.a;
                    }
                }, rv4Var), rv4Var, 1600944, 32);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new yp0(str, cz7Var, i, 6);
        }
    }

    public static final long b(float f, float f2) {
        long floatToIntBits = (Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32);
        int i = z78.d;
        return floatToIntBits;
    }

    public static final void c(String str, List list, nq7 nq7Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        rv4Var.g0(165979694);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.f(list)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i7 = i6 | i4;
        boolean z4 = true;
        if ((i7 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i7 & 1, z)) {
            if ((i7 & Token.ASSIGN_MOD) != 32) {
                z2 = false;
            } else {
                z2 = true;
            }
            if ((i7 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = z3 | z2;
            if ((i7 & 7168) != 2048) {
                z4 = false;
            }
            boolean z6 = z5 | z4;
            Object P = rv4Var.P();
            if (z6 || P == ax1.a) {
                P = new k34(0, xt4Var, str, list);
                rv4Var.o0(P);
            }
            kqe.a(nq7Var, null, null, null, null, null, false, (xt4) P, rv4Var, 6, 254);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new px0(i, 2, xt4Var, nq7Var, str, list);
        }
    }

    public static final void d(boolean z, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        vt4Var.getClass();
        vt4Var2.getClass();
        vt4Var3.getClass();
        rv4Var.g0(-824872784);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i2 | i;
        if (rv4Var.h(vt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var.h(vt4Var2)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if (rv4Var.h(vt4Var3)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i9 & 1, z2)) {
            if ((i9 & Token.ASSIGN_MOD) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i9 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z6 = z3 | z4;
            if ((i9 & 896) == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z7 = z6 | z5;
            Object P = rv4Var.P();
            if (z7 || P == ax1.a) {
                P = new s86(vt4Var, vt4Var3, vt4Var2, 1);
                rv4Var.o0(P);
            }
            cae.d(z, (xt4) P, rv4Var, i9 & 14, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new rd0(z, vt4Var, vt4Var2, (Object) vt4Var3, i, 20);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a4  */
    /* JADX WARN: Type inference failed for: r11v0, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [zl9, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0176 -> B:133:0x0187). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.smc r22, android.widget.RemoteViews r23, defpackage.xy4 r24, defpackage.bx5 r25) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mue.e(smc, android.widget.RemoteViews, xy4, bx5):void");
    }

    public static final void f(RemoteViews remoteViews, u55 u55Var, int i) {
        a73 a73Var = u55Var.a;
        int i2 = Build.VERSION.SDK_INT;
        u63 u63Var = u63.a;
        y63 y63Var = y63.a;
        if (i2 < 31) {
            List B = tl1.B(y63Var, v63.a, u63Var);
            Map map = re6.a;
            if (!B.contains(a73Var)) {
                hfd.p(a73Var, " requires a complex layout before API 31", "Using a height of ");
            }
        } else if (i2 < 33 && tl1.B(y63Var, u63Var).contains(a73Var)) {
        } else {
            oy.a.b(remoteViews, i, a73Var);
        }
    }

    public static final void g(RemoteViews remoteViews, mid midVar, int i) {
        a73 a73Var = midVar.a;
        int i2 = Build.VERSION.SDK_INT;
        u63 u63Var = u63.a;
        y63 y63Var = y63.a;
        if (i2 < 31) {
            List B = tl1.B(y63Var, v63.a, u63Var);
            Map map = re6.a;
            if (!B.contains(a73Var)) {
                hfd.p(a73Var, " requires a complex layout before API 31", "Using a width of ");
            }
        } else if (i2 < 33 && tl1.B(y63Var, u63Var).contains(a73Var)) {
        } else {
            oy.a.c(remoteViews, i, a73Var);
        }
    }

    public static final boolean h(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = ks3.a;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i = 0;
                while (i < size) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    b8a b8aVar = (b8a) obj2;
                    b8a b8aVar2 = (b8a) obj;
                    arrayList2.add(new y78((Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (b8aVar2.g().f() >> 32)) - Float.intBitsToFloat((int) (b8aVar.g().f() >> 32)))) << 32) | (Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (b8aVar2.g().f() & 4294967295L)) - Float.intBitsToFloat((int) (b8aVar.g().f() & 4294967295L)))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((y78) sl1.c0(list)).a;
            } else {
                if (list.isEmpty()) {
                    er6.c("Empty collection can't be reduced.");
                }
                Object c0 = sl1.c0(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i2 = 1;
                    while (true) {
                        c0 = new y78(y78.j(((y78) c0).a, ((y78) list.get(i2)).a));
                        if (i2 == size2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((y78) c0).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean i(String str, String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                            break;
                        }
                    } else {
                        i2++;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    return c16.i(k4b.N0(str.substring(1, str.length() - 1)).toString(), str2);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static double j(double r10, double r12) {
        /*
            double r0 = defpackage.fca.r(r10, r12)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lc
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
        Lc:
            double r4 = defpackage.fca.g(r10, r12)
            double r2 = java.lang.Math.max(r2, r4)
            double r4 = defpackage.fca.x(r0, r10)
            double r6 = defpackage.fca.x(r2, r10)
            double r10 = java.lang.Math.rint(r10)
            r8 = 4633641066610819072(0x404e000000000000, double:60.0)
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 >= 0) goto L4b
            double r10 = r4 - r6
            double r10 = java.lang.Math.abs(r10)
            r8 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 >= 0) goto L3f
            int r10 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3f
            int r10 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3f
            r10 = 1
            goto L40
        L3f:
            r10 = 0
        L40:
            int r11 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r11 >= 0) goto L54
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 >= 0) goto L54
            if (r10 == 0) goto L55
            goto L54
        L4b:
            int r10 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r10 >= 0) goto L55
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 < 0) goto L54
            goto L55
        L54:
            return r0
        L55:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mue.j(double, double):double");
    }

    public static final String k(Collection collection) {
        collection.getClass();
        if (!collection.isEmpty()) {
            return l4b.x(sl1.i0(collection, ",\n", "\n", "\n", null, 56), "    ").concat("},");
        }
        return " }";
    }

    public static final boolean l(a73 a73Var) {
        boolean i;
        boolean z = true;
        if (a73Var instanceof t63) {
            return true;
        }
        if (c16.i(a73Var, u63.a)) {
            i = true;
        } else {
            i = c16.i(a73Var, v63.a);
        }
        if (!i) {
            z = c16.i(a73Var, y63.a);
        }
        if (z || a73Var == null) {
            return false;
        }
        xk5.o();
        return false;
    }

    public static final void m(cz7 cz7Var, String str, String str2, String str3) {
        cz7Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        cz7Var.a.c(new dp0(str, str2, str3));
    }

    public static final List n(String str) {
        int i;
        int i2;
        List list;
        int i3;
        List list2;
        yk8 yk8Var;
        yk8 yk8Var2;
        ks3 ks3Var = ks3.a;
        if (str == null) {
            return ks3Var;
        }
        k85 k85Var = new k85(8);
        sk6 sk6Var = sk6.c;
        ye6 x = ipe.x(sk6Var, k85Var);
        for (int i4 = 0; i4 <= str.length() - 1; i4 = i) {
            ye6 x2 = ipe.x(sk6Var, new k85(9));
            Integer num = null;
            i = i4;
            while (true) {
                if (i <= str.length() - 1) {
                    char charAt = str.charAt(i);
                    if (charAt != ',') {
                        if (charAt != ';') {
                            i++;
                        } else {
                            if (num == null) {
                                num = Integer.valueOf(i);
                            }
                            int i5 = i + 1;
                            int i6 = i5;
                            while (i6 <= k4b.b0(str)) {
                                char charAt2 = str.charAt(i6);
                                if (charAt2 != ',' && charAt2 != ';') {
                                    if (charAt2 != '=') {
                                        i6++;
                                    } else {
                                        int i7 = i6 + 1;
                                        if (str.length() == i7) {
                                            yk8Var2 = new yk8(Integer.valueOf(i7), "");
                                        } else {
                                            char c2 = '\"';
                                            if (str.charAt(i7) == '\"') {
                                                int i8 = i6 + 2;
                                                StringBuilder sb = new StringBuilder();
                                                while (i8 <= str.length() - 1) {
                                                    char charAt3 = str.charAt(i8);
                                                    if (charAt3 == c2) {
                                                        int i9 = i8 + 1;
                                                        int i10 = i9;
                                                        while (i10 < str.length() && str.charAt(i10) == ' ') {
                                                            i10++;
                                                        }
                                                        if (i10 == str.length() || str.charAt(i10) == ';' || str.charAt(i10) == ',') {
                                                            yk8Var = new yk8(Integer.valueOf(i9), sb.toString());
                                                            break;
                                                        }
                                                    }
                                                    if (charAt3 == '\\' && i8 < str.length() - 3) {
                                                        sb.append(str.charAt(i8 + 1));
                                                        i8 += 2;
                                                    } else {
                                                        sb.append(charAt3);
                                                        i8++;
                                                    }
                                                    c2 = '\"';
                                                }
                                                yk8Var = new yk8(Integer.valueOf(i8), "\"".concat(sb.toString()));
                                            } else {
                                                int i11 = i7;
                                                while (i11 <= str.length() - 1) {
                                                    char charAt4 = str.charAt(i11);
                                                    if (charAt4 != ',' && charAt4 != ';') {
                                                        i11++;
                                                    } else {
                                                        yk8Var = new yk8(Integer.valueOf(i11), k4b.N0(str.substring(i7, i11)).toString());
                                                        break;
                                                    }
                                                }
                                                yk8Var = new yk8(Integer.valueOf(i11), k4b.N0(str.substring(i7, i11)).toString());
                                            }
                                            yk8Var2 = yk8Var;
                                        }
                                        int intValue = ((Number) yk8Var2.a).intValue();
                                        o(x2, str, i5, i6, (String) yk8Var2.b);
                                        i = intValue;
                                    }
                                } else {
                                    o(x2, str, i5, i6, "");
                                    break;
                                }
                            }
                            o(x2, str, i5, i6, "");
                            i = i6;
                        }
                    } else {
                        ArrayList arrayList = (ArrayList) x.getValue();
                        if (num != null) {
                            i3 = num.intValue();
                        } else {
                            i3 = i;
                        }
                        String obj = k4b.N0(str.substring(i4, i3)).toString();
                        if (x2.d()) {
                            list2 = (List) x2.getValue();
                        } else {
                            list2 = ks3Var;
                        }
                        arrayList.add(new j45(obj, list2));
                        i++;
                    }
                } else {
                    ArrayList arrayList2 = (ArrayList) x.getValue();
                    if (num != null) {
                        i2 = num.intValue();
                    } else {
                        i2 = i;
                    }
                    String obj2 = k4b.N0(str.substring(i4, i2)).toString();
                    if (x2.d()) {
                        list = (List) x2.getValue();
                    } else {
                        list = ks3Var;
                    }
                    arrayList2.add(new j45(obj2, list));
                }
            }
        }
        if (x.d()) {
            return (List) x.getValue();
        }
        return ks3Var;
    }

    public static final void o(ye6 ye6Var, String str, int i, int i2, String str2) {
        String obj = k4b.N0(str.substring(i, i2)).toString();
        if (obj.length() == 0) {
            return;
        }
        ((ArrayList) ye6Var.getValue()).add(new k45(obj, str2));
    }

    public static final long p(long j, long j2, int i) {
        if (i % 90 == 0) {
            int i2 = i % 360;
            if (i2 < 0) {
                i2 += 360;
            }
            if (i2 != 90) {
                if (i2 != 180) {
                    if (i2 != 270) {
                        return j;
                    }
                    return b(z78.c(j), mna.b(j2) - z78.b(j));
                }
                return b(mna.b(j2) - z78.b(j), mna.a(j2) - z78.c(j));
            }
            return b(mna.a(j2) - z78.c(j), z78.b(j));
        }
        p1a.k(a82.j(i, "rotation must be a multiple of 90, rotation: "));
        return 0L;
    }

    public static final Object q(lu4 lu4Var) {
        Thread.interrupted();
        return z87.C(gs3.a, new iz7(lu4Var, null, 7));
    }

    public static final void r(v4 v4Var, b8a b8aVar) {
        int size;
        AccessibilityNodeInfo accessibilityNodeInfo = v4Var.a;
        Object g = b8aVar.k().a.g(h8a.f);
        Object obj = null;
        if (g == null) {
            g = null;
        }
        pl1 pl1Var = (pl1) g;
        if (pl1Var != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(pl1Var.a, pl1Var.b, false, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object g2 = b8aVar.k().a.g(h8a.e);
        if (g2 != null) {
            obj = g2;
        }
        if (obj != null) {
            List j = b8a.j(4, b8aVar);
            int size2 = j.size();
            for (int i = 0; i < size2; i++) {
                b8a b8aVar2 = (b8a) j.get(i);
                if (b8aVar2.k().a.c(h8a.K)) {
                    arrayList.add(b8aVar2);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            boolean h = h(arrayList);
            int i2 = 1;
            if (h) {
                size = 1;
            } else {
                size = arrayList.size();
            }
            if (h) {
                i2 = arrayList.size();
            }
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(size, i2, false, 0));
        }
    }

    public static final long s(long j, long j2) {
        return b(lz9.b(j2) * z78.b(j), lz9.c(j2) * z78.c(j));
    }

    public static final String t(long j) {
        if (j != z78.c) {
            StringBuilder sb = new StringBuilder();
            sb.append(yz1.k(2, z78.b(j)));
            sb.append('x');
            sb.append(yz1.k(2, z78.c(j)));
            return sb.toString();
        }
        return "Unspecified";
    }
}
