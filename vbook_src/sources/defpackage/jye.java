package defpackage;

import android.graphics.Paint;
import android.text.Layout;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jye  reason: default package */
/* loaded from: classes.dex */
public abstract class jye {
    public static final tu1 a = new tu1(new kv1(0), false, 970505348);
    public static final tu1 b = new tu1(new jv1(26), false, -1924794564);
    public static final tu1 c = new tu1(new jv1(27), false, 1007383208);
    public static final tu1 d = new tu1(new kv1(1), false, -1504792289);

    public static final void a(int i, int i2, int i3, vt4 vt4Var, xt4 xt4Var, xt4 xt4Var2, lu4 lu4Var, lu4 lu4Var2, mu4 mu4Var, rv4 rv4Var, kj6 kj6Var, nq7 nq7Var, List list) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z;
        kj6 kj6Var2;
        boolean z2;
        rv4 rv4Var2 = rv4Var;
        List list2 = list;
        rv4Var2.g0(2116509187);
        int i13 = 2;
        if (rv4Var2.f(list2)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i14 = i3 | i4;
        int i15 = 16;
        if (rv4Var.f(kj6Var)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i16 = i14 | i5;
        if (rv4Var2.d(i)) {
            i6 = 256;
        } else {
            i6 = Token.CASE;
        }
        int i17 = i16 | i6;
        if (rv4Var2.d(i2)) {
            i7 = 2048;
        } else {
            i7 = 1024;
        }
        int i18 = i17 | i7;
        if (rv4Var2.f(nq7Var)) {
            i8 = 16384;
        } else {
            i8 = 8192;
        }
        int i19 = i18 | i8;
        if (rv4Var2.c(nae.e)) {
            i9 = 131072;
        } else {
            i9 = Parser.ARGC_LIMIT;
        }
        int i20 = i19 | i9;
        if (rv4Var2.h(lu4Var)) {
            i10 = 1048576;
        } else {
            i10 = 524288;
        }
        int i21 = i20 | i10;
        if (rv4Var2.h(mu4Var)) {
            i11 = 67108864;
        } else {
            i11 = 33554432;
        }
        int i22 = i21 | i11;
        if (rv4Var2.h(vt4Var)) {
            i12 = 536870912;
        } else {
            i12 = 268435456;
        }
        int i23 = i22 | i12;
        if (rv4Var2.h(xt4Var)) {
            i13 = 4;
        }
        if (rv4Var2.h(xt4Var2)) {
            i15 = 32;
        }
        int i24 = i13 | i15;
        if ((306783379 & i23) == 306783378 && (i24 & 19) == 18) {
            z = false;
        } else {
            z = true;
        }
        if (rv4Var2.U(i23 & 1, z)) {
            b37 d2 = fu0.d(kh5.a, false);
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
            jce.F(qw1.f, rv4Var2, d2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            if (i != 0) {
                if (i != 1) {
                    rv4Var2.e0(864095877);
                    rv4Var2.q(false);
                    z2 = true;
                } else {
                    rv4Var2.e0(863555485);
                    ze4 ze4Var = pna.c;
                    int i25 = i23 << 3;
                    int i26 = (i25 & 896) | ((i23 >> 9) & 14) | 3072 | (i25 & Token.ASSIGN_MOD);
                    int i27 = i23 >> 6;
                    int i28 = i24 << 24;
                    int i29 = i26 | (57344 & i27) | 196608 | (3670016 & i27) | (29360128 & i27) | (234881024 & i28) | (i28 & 1879048192);
                    z2 = true;
                    fce.p(i2, list2, kj6Var, ze4Var, lu4Var, lu4Var2, mu4Var, vt4Var, xt4Var, xt4Var2, rv4Var2, i29);
                    rv4Var2 = rv4Var2;
                    rv4Var2.q(false);
                    list2 = list;
                }
            } else {
                z2 = true;
                rv4Var2.e0(862915273);
                ze4 ze4Var2 = pna.c;
                int i30 = i23 << 3;
                int i31 = ((i23 >> 9) & 14) | 3072 | (i30 & Token.ASSIGN_MOD) | (i30 & 896);
                int i32 = i23 >> 3;
                npe.e(i2, (57344 & i32) | i31 | (458752 & i32) | 1572864 | (i32 & 29360128) | (i32 & 234881024) | ((i24 << 27) & 1879048192), (i24 >> 3) & 14, vt4Var, xt4Var, xt4Var2, lu4Var, lu4Var2, mu4Var, rv4Var2, kj6Var, ze4Var2, list);
                list2 = list;
                rv4Var2.q(false);
            }
            kj6Var2 = kj6Var;
            cae.e(kj6Var2, list2, rv4Var2, ((i23 >> 3) & 14) | ((i23 << 3) & Token.ASSIGN_MOD));
            rv4Var2.q(z2);
        } else {
            kj6Var2 = kj6Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new nm5(i, i2, i3, vt4Var, xt4Var, xt4Var2, lu4Var, lu4Var2, mu4Var, kj6Var2, nq7Var, list2);
        }
    }

    public static final void b(sj4 sj4Var, kn6 kn6Var, mu4 mu4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        kn6 kn6Var2;
        boolean z2;
        sj4Var.getClass();
        mu4Var.getClass();
        rv4Var.g0(1098310001);
        if (rv4Var.f(sj4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2 | 48;
        if (rv4Var.f(mu4Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i5 = i4 | i3;
        boolean z3 = false;
        if ((i5 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            un6 un6Var = (un6) rv4Var.j(nu6.a);
            xn6 k = un6Var.k();
            boolean h = rv4Var.h(un6Var);
            if ((i5 & 14) != 4) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean z4 = z2 | h;
            if ((i5 & 896) == 256) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            Object P = rv4Var.P();
            if (z5 || P == ax1.a) {
                Object uw2Var = new uw2(un6Var, sj4Var, mu4Var, null, 14);
                rv4Var.o0(uw2Var);
                P = uw2Var;
            }
            yte.i(sj4Var, mu4Var, k, (lu4) P, rv4Var);
            kn6Var2 = kn6.d;
        } else {
            rv4Var.X();
            kn6Var2 = kn6Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ax(sj4Var, kn6Var2, mu4Var, i, 15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:259:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x09c9  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x09ee  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0a04  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0a06  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0a30  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0a32  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0a52  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0a54  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0ac8  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0aca  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0b2c  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0b2e  */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r20v1, types: [m42] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.ur5 r57, final defpackage.cz7 r58, defpackage.nq7 r59, defpackage.rv4 r60, int r61) {
        /*
            Method dump skipped, instructions count: 3023
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jye.c(ur5, cz7, nq7, rv4, int):void");
    }

    public static final void d(aw7 aw7Var, boolean z) {
        aw7Var.setValue(Boolean.valueOf(z));
    }

    public static final void e(String str, xy4 xy4Var, nyb nybVar, int i, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        rv4Var.g0(-192911377);
        if (rv4Var.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2 | 48;
        if (rv4Var.f(nybVar)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        if (((i5 | i4) & 1171) == 1170 && rv4Var.E()) {
            rv4Var.X();
        } else {
            rv4Var.Z();
            if ((i2 & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
            } else {
                xy4Var = vy4.a;
            }
            rv4Var.r();
            bvb bvbVar = bvb.a;
            rv4Var.f0(-1115894518);
            rv4Var.f0(1886828752);
            if (rv4Var.a instanceof my) {
                rv4Var.c0();
                if (rv4Var.S) {
                    rv4Var.k(new ik(bvbVar, 12));
                } else {
                    rv4Var.r0();
                }
                jce.F(f8a.U, rv4Var, str);
                jce.F(f8a.V, rv4Var, xy4Var);
                jce.F(f8a.W, rv4Var, nybVar);
                f8a f8aVar = f8a.X;
                if (rv4Var.S || !c16.i(rv4Var.P(), Integer.valueOf(i))) {
                    rv4Var.o0(Integer.valueOf(i));
                    rv4Var.b(Integer.valueOf(i), f8aVar);
                }
                hl5.v(rv4Var, true, false, false);
            } else {
                p17.h();
                throw null;
            }
        }
        xy4 xy4Var2 = xy4Var;
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new j6b(str, xy4Var2, nybVar, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.v20 r7, defpackage.j6d r8, boolean r9, boolean r10, boolean r11, java.util.List r12, defpackage.n42 r13) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jye.f(v20, j6d, boolean, boolean, boolean, java.util.List, n42):java.lang.Object");
    }

    public static /* synthetic */ Object g(v20 v20Var, j6d j6dVar, boolean z, boolean z2, boolean z3, List list, n42 n42Var, int i) {
        if ((i & 2) != 0) {
            j6dVar = null;
        }
        return f(v20Var, j6dVar, z, z2, z3, list, n42Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(defpackage.gab r6, defpackage.hh0 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.s6a
            if (r0 == 0) goto L13
            r0 = r7
            s6a r0 = (defpackage.s6a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            s6a r0 = new s6a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            gab r6 = r0.a
            defpackage.hre.r(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.hre.r(r7)
        L31:
            r0.a = r6
            r0.c = r2
            s09 r7 = defpackage.s09.b
            java.lang.Object r7 = r6.j(r7, r0)
            n82 r1 = defpackage.n82.a
            if (r7 != r1) goto L40
            return r1
        L40:
            r09 r7 = (defpackage.r09) r7
            java.util.List r1 = r7.a
            int r3 = r1.size()
            r4 = 0
        L49:
            if (r4 >= r3) goto L5b
            java.lang.Object r5 = r1.get(r4)
            z09 r5 = (defpackage.z09) r5
            boolean r5 = defpackage.ie2.j(r5)
            if (r5 != 0) goto L58
            goto L31
        L58:
            int r4 = r4 + 1
            goto L49
        L5b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jye.h(gab, hh0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
        if (r15 == r6) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095 A[Catch: CancellationException -> 0x0032, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:13:0x002d, B:49:0x00c4, B:51:0x00cc, B:53:0x00d9, B:55:0x00e5, B:56:0x00e8, B:57:0x00eb, B:59:0x00ef, B:32:0x0091, B:34:0x0095, B:35:0x0097, B:37:0x009b, B:39:0x009f, B:41:0x00a3, B:43:0x00a7, B:45:0x00ab, B:46:0x00b0, B:25:0x0051, B:27:0x005f, B:29:0x0064, B:28:0x0062), top: B:63:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b A[Catch: CancellationException -> 0x0032, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:13:0x002d, B:49:0x00c4, B:51:0x00cc, B:53:0x00d9, B:55:0x00e5, B:56:0x00e8, B:57:0x00eb, B:59:0x00ef, B:32:0x0091, B:34:0x0095, B:35:0x0097, B:37:0x009b, B:39:0x009f, B:41:0x00a3, B:43:0x00a7, B:45:0x00ab, B:46:0x00b0, B:25:0x0051, B:27:0x005f, B:29:0x0064, B:28:0x0062), top: B:63:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f A[Catch: CancellationException -> 0x0032, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:13:0x002d, B:49:0x00c4, B:51:0x00cc, B:53:0x00d9, B:55:0x00e5, B:56:0x00e8, B:57:0x00eb, B:59:0x00ef, B:32:0x0091, B:34:0x0095, B:35:0x0097, B:37:0x009b, B:39:0x009f, B:41:0x00a3, B:43:0x00a7, B:45:0x00ab, B:46:0x00b0, B:25:0x0051, B:27:0x005f, B:29:0x0064, B:28:0x0062), top: B:63:0x0023 }] */
    /* JADX WARN: Type inference failed for: r13v6, types: [yl9, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(defpackage.gab r11, defpackage.npb r12, defpackage.r09 r13, int r14, defpackage.hh0 r15) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jye.i(gab, npb, r09, int, hh0):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kj] */
    public static final Object j(d19 d19Var, wr7 wr7Var, npb npbVar, m42 m42Var) {
        hab habVar = (hab) d19Var;
        habVar.getClass();
        ucd ucdVar = voe.v(habVar).X;
        ?? obj = new Object();
        obj.b = ucdVar;
        Object h = yae.h(d19Var, new gm0(obj, wr7Var, npbVar, null, 4), m42Var);
        if (h == n82.a) {
            return h;
        }
        return pvc.a;
    }

    public static byte[] k(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    public static String l(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static final float m(int i, float f) {
        if (Float.isNaN(f)) {
            return f;
        }
        double pow = Math.pow(10.0d, i);
        return (float) (Math.rint(f * pow) / pow);
    }

    public static final float n(Layout layout, int i, Paint paint) {
        int i2;
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = ivb.a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= nae.e) {
            return nae.e;
        }
        int lineStart = layout.getLineStart(i);
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + lineStart) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment == null) {
            i2 = -1;
        } else {
            i2 = tt5.a[paragraphAlignment.ordinal()];
        }
        if (i2 == 1) {
            return a82.z(layout.getWidth(), measureText, 2.0f, Math.abs(lineLeft));
        }
        return (layout.getWidth() - measureText) + Math.abs(lineLeft);
    }

    public static final float o(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = ivb.a;
        if (layout.getEllipsisCount(i) > 0) {
            int i2 = -1;
            if (layout.getParagraphDirection(i) == -1 && layout.getWidth() < layout.getLineRight(i)) {
                float primaryHorizontal = layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i));
                float measureText = paint.measureText("…") + (layout.getLineRight(i) - primaryHorizontal);
                Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
                if (paragraphAlignment != null) {
                    i2 = tt5.a[paragraphAlignment.ordinal()];
                }
                if (i2 == 1) {
                    width = layout.getWidth() - layout.getLineRight(i);
                    width2 = (layout.getWidth() - measureText) / 2.0f;
                } else {
                    width = layout.getWidth() - layout.getLineRight(i);
                    width2 = layout.getWidth() - measureText;
                }
                return width - width2;
            }
            return nae.e;
        }
        return nae.e;
    }

    public static double[] p(double[] dArr, double[][] dArr2) {
        dArr.getClass();
        double d2 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d3 = dArr[1];
        double d4 = dArr3[1] * d3;
        double d5 = dArr[2];
        double d6 = (dArr3[2] * d5) + d4 + (dArr3[0] * d2);
        double[] dArr4 = dArr2[1];
        double d7 = (dArr4[2] * d5) + (dArr4[1] * d3) + (dArr4[0] * d2);
        double[] dArr5 = dArr2[2];
        return new double[]{d6, d7, (d5 * dArr5[2]) + (d3 * dArr5[1]) + (d2 * dArr5[0])};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080 A[Catch: all -> 0x0044, TryCatch #1 {all -> 0x0044, blocks: (B:20:0x0040, B:31:0x0078, B:33:0x0080, B:35:0x008c, B:37:0x0098, B:28:0x0060), top: B:69:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f9 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002d, B:54:0x00e1, B:56:0x00e9, B:58:0x00ed, B:60:0x00f9, B:62:0x0105, B:50:0x00bc), top: B:69:0x0021 }] */
    /* JADX WARN: Type inference failed for: r11v3, types: [vl9, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(defpackage.gab r9, defpackage.wr7 r10, defpackage.kj r11, defpackage.r09 r12, defpackage.hh0 r13) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jye.q(gab, wr7, kj, r09, hh0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(defpackage.v20 r13, boolean r14, boolean r15, defpackage.lu4 r16, defpackage.n42 r17) {
        /*
            r0 = r17
            boolean r1 = r0 instanceof defpackage.brd
            if (r1 == 0) goto L16
            r1 = r0
            brd r1 = (defpackage.brd) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.c = r2
        L14:
            r8 = r1
            goto L1c
        L16:
            brd r1 = new brd
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r8.b
            int r1 = r8.c
            r10 = 0
            r11 = 2
            r2 = 1
            n82 r12 = defpackage.n82.a
            if (r1 == 0) goto L3d
            if (r1 == r2) goto L35
            if (r1 != r11) goto L2f
            defpackage.hre.r(r0)
            return r0
        L2f:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r13)
            return r10
        L35:
            aab r13 = r8.a
            lu4 r13 = (defpackage.lu4) r13
            defpackage.hre.r(r0)
            goto L59
        L3d:
            defpackage.hre.r(r0)
            r0 = r16
            aab r0 = (defpackage.aab) r0
            r8.a = r0
            r8.c = r2
            r5 = 0
            r9 = 34
            r3 = 0
            r7 = 0
            r2 = r13
            r4 = r14
            r6 = r15
            java.lang.Object r0 = g(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 != r12) goto L57
            goto L65
        L57:
            r13 = r16
        L59:
            j6d r0 = (defpackage.j6d) r0
            r8.a = r10
            r8.c = r11
            java.lang.Object r13 = r13.invoke(r0, r8)
            if (r13 != r12) goto L66
        L65:
            return r12
        L66:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jye.r(v20, boolean, boolean, lu4, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (r13 == r9) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(defpackage.j6d r10, boolean r11, boolean r12, defpackage.n42 r13) {
        /*
            boolean r0 = r13 instanceof defpackage.zqd
            if (r0 == 0) goto L14
            r0 = r13
            zqd r0 = (defpackage.zqd) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.e = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            zqd r0 = new zqd
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r13 = r7.d
            int r0 = r7.e
            r1 = 0
            r2 = 2
            r3 = 1
            n82 r9 = defpackage.n82.a
            if (r0 == 0) goto L3f
            if (r0 == r3) goto L33
            if (r0 != r2) goto L2d
            defpackage.hre.r(r13)
            return r13
        L2d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r10)
            return r1
        L33:
            boolean r12 = r7.c
            boolean r11 = r7.b
            j6d r10 = r7.a
            defpackage.hre.r(r13)
        L3c:
            r3 = r11
            r5 = r12
            goto L53
        L3f:
            defpackage.hre.r(r13)
            l6d r13 = defpackage.l6d.READ
            r7.a = r10
            r7.b = r11
            r7.c = r12
            r7.e = r3
            java.lang.Object r13 = r10.f(r13, r7)
            if (r13 != r9) goto L3c
            goto L65
        L53:
            v20 r13 = (defpackage.v20) r13
            r7.a = r1
            r7.e = r2
            r4 = 1
            r6 = 0
            r8 = 32
            r2 = r10
            r1 = r13
            java.lang.Object r10 = g(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r10 != r9) goto L66
        L65:
            return r9
        L66:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jye.s(j6d, boolean, boolean, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(1:(1:(2:13|14)(2:16|17))(2:18|19))(4:20|21|22|(1:25)(1:24)))(1:27))(1:31)|28|29))|38|6|7|(0)(0)|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        if (r12 == r6) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
        if (r12 != r6) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0081, code lost:
        r9 = r8.b;
        r0.a = r9;
        r0.c = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
        if (r9.a(r0) == r6) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
        throw r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Type inference failed for: r0v2, types: [ard, java.lang.Object, n42] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r11v1, types: [lu4] */
    /* JADX WARN: Type inference failed for: r11v3, types: [lu4] */
    /* JADX WARN: Type inference failed for: r8v0, types: [j6d] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v6, types: [b6d] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [b6d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.j6d r8, boolean r9, boolean r10, defpackage.byb r11, defpackage.n42 r12) {
        /*
            boolean r0 = r12 instanceof defpackage.ard
            if (r0 == 0) goto L13
            r0 = r12
            ard r0 = (defpackage.ard) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ard r0 = new ard
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.b
            int r1 = r0.c
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            n82 r6 = defpackage.n82.a
            if (r1 == 0) goto L57
            if (r1 == r5) goto L4e
            if (r1 == r4) goto L41
            if (r1 == r3) goto L3b
            if (r1 == r2) goto L33
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            r8 = 0
            return r8
        L33:
            java.lang.Object r8 = r0.a
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            defpackage.hre.r(r12)
            goto L8e
        L3b:
            java.lang.Object r8 = r0.a
            defpackage.hre.r(r12)
            return r8
        L41:
            java.lang.Object r8 = r0.a
            j6d r8 = (defpackage.j6d) r8
            defpackage.hre.r(r12)     // Catch: java.lang.Throwable -> L49
            goto L73
        L49:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L81
        L4e:
            java.lang.Object r8 = r0.a
            r11 = r8
            lu4 r11 = (defpackage.lu4) r11
            defpackage.hre.r(r12)
            goto L65
        L57:
            defpackage.hre.r(r12)
            r0.a = r11
            r0.c = r5
            java.lang.Object r12 = s(r8, r9, r10, r0)
            if (r12 != r6) goto L65
            goto L8d
        L65:
            r8 = r12
            j6d r8 = (defpackage.j6d) r8
            r0.a = r8     // Catch: java.lang.Throwable -> L49
            r0.c = r4     // Catch: java.lang.Throwable -> L49
            java.lang.Object r12 = r11.invoke(r8, r0)     // Catch: java.lang.Throwable -> L49
            if (r12 != r6) goto L73
            goto L8d
        L73:
            b6d r8 = r8.b
            r0.a = r12
            r0.c = r3
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r6) goto L80
            goto L8d
        L80:
            return r12
        L81:
            b6d r9 = r9.b
            r0.a = r8
            r0.c = r2
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r6) goto L8e
        L8d:
            return r6
        L8e:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jye.t(j6d, boolean, boolean, byb, n42):java.lang.Object");
    }

    public static final wl8 u(Object... objArr) {
        return new wl8(2, new ArrayList(new oz(objArr, false)));
    }

    public static final nq7 v(nq7 nq7Var, sfc sfcVar, xt4 xt4Var, btb btbVar, xt4 xt4Var2) {
        return nq7Var.a0(new dpb(sfcVar, xt4Var, btbVar, xt4Var2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
        if (r15 == r6) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067 A[Catch: CancellationException -> 0x0031, TryCatch #0 {CancellationException -> 0x0031, blocks: (B:13:0x002c, B:36:0x00a1, B:38:0x00a9, B:40:0x00b5, B:42:0x00c1, B:43:0x00c4, B:44:0x00c7, B:45:0x00cb, B:20:0x0040, B:26:0x0063, B:28:0x0067, B:33:0x0086, B:23:0x004a), top: B:50:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(defpackage.gab r12, defpackage.npb r13, defpackage.r09 r14, defpackage.hh0 r15) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jye.w(gab, npb, r09, hh0):java.lang.Object");
    }

    public static final rk9 x(rk9 rk9Var, sc6 sc6Var, sc6 sc6Var2) {
        if (sc6Var.t() && sc6Var2.t()) {
            return npe.n(sc6Var2.f0(obe.t(sc6Var).L(rk9Var.j())), rk9Var.h());
        }
        return rk9.e;
    }
}
