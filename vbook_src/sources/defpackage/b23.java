package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b23  reason: default package */
/* loaded from: classes.dex */
public final class b23 {
    public static final tu1 b = new tu1(new iv1(28), false, -1434476760);
    public static final tu1 c = new tu1(new jv1(20), false, 728904364);
    public static final tu1 d = new tu1(new jv1(21), false, -1776618128);
    public static final tu1 e = new tu1(new jv1(22), false, -1266646759);
    public static final Object f = new Object();
    public static final Object g = new Object();
    public static final Object h = new Object();
    public static final Object i = new Object();
    public static final Object j = new Object();
    public final /* synthetic */ int a;

    public /* synthetic */ b23(int i2) {
        this.a = i2;
    }

    public static final void a(dub dubVar, nq7 nq7Var, oyb oybVar, hy0 hy0Var, dmb dmbVar, zm4 zm4Var, vt4 vt4Var, xt4 xt4Var, boolean z, lu4 lu4Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z2;
        Object obj;
        boolean z3;
        boolean z4;
        nq7 nq7Var2;
        boolean z5;
        int i4;
        Object obj2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        vt4Var.getClass();
        xt4Var.getClass();
        rv4Var.g0(-1227307613);
        if ((i2 & 6) == 0) {
            if (rv4Var.f(dubVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i3 = i15 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i3 |= i14;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.f(oybVar)) {
                i13 = 256;
            } else {
                i13 = Token.CASE;
            }
            i3 |= i13;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var.f(hy0Var)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i3 |= i12;
        }
        if ((i2 & 24576) == 0) {
            if (rv4Var.f(dmbVar)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i3 |= i11;
        }
        if ((196608 & i2) == 0) {
            if (rv4Var.f(zm4Var)) {
                i10 = 131072;
            } else {
                i10 = Parser.ARGC_LIMIT;
            }
            i3 |= i10;
        }
        if ((1572864 & i2) == 0) {
            if (rv4Var.h(vt4Var)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        }
        if ((12582912 & i2) == 0) {
            if (rv4Var.h(xt4Var)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i3 |= i8;
        }
        if ((100663296 & i2) == 0) {
            z2 = z;
            if (rv4Var.g(z2)) {
                i7 = 67108864;
            } else {
                i7 = 33554432;
            }
            i3 |= i7;
        } else {
            z2 = z;
        }
        if ((805306368 & i2) == 0) {
            obj = lu4Var;
            if (rv4Var.h(obj)) {
                i6 = 536870912;
            } else {
                i6 = 268435456;
            }
            i3 |= i6;
        } else {
            obj = lu4Var;
        }
        if ((306783379 & i3) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i3 & 1, z3)) {
            rv4Var.Z();
            if ((i2 & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
            }
            rv4Var.r();
            aw7 D = yae.D(vt4Var, rv4Var);
            aw7 D2 = yae.D(Boolean.valueOf(z2), rv4Var);
            Object P = rv4Var.P();
            Object obj3 = ax1.a;
            Object obj4 = P;
            if (P == obj3) {
                Object og0Var = new og0(D2, D);
                rv4Var.o0(og0Var);
                obj4 = og0Var;
            }
            og0 og0Var2 = (og0) obj4;
            int i16 = i3;
            fxb fxbVar = new fxb(dubVar.d().e);
            int i17 = i16 & 14;
            if (i17 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P2 = rv4Var.P();
            Object obj5 = P2;
            if (z4 || P2 == obj3) {
                Object rg0Var = new rg0(dubVar, null, 0);
                rv4Var.o0(rg0Var);
                obj5 = rg0Var;
            }
            yte.g((lu4) obj5, rv4Var, fxbVar);
            if (zm4Var != null) {
                nq7Var2 = mwe.n(nq7Var, zm4Var);
            } else {
                nq7Var2 = nq7Var;
            }
            if (i17 == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean f2 = rv4Var.f(D2) | z5 | rv4Var.f(D);
            Object P3 = rv4Var.P();
            if (!f2 && P3 != obj3) {
                i4 = 0;
                obj2 = P3;
            } else {
                i4 = 0;
                Object sg0Var = new sg0(dubVar, D2, D, 0);
                rv4Var.o0(sg0Var);
                obj2 = sg0Var;
            }
            nq7 m = tye.m(nq7Var2, (xt4) obj2);
            t86 t86Var = new t86(i4, 6, Token.INC);
            boolean f3 = rv4Var.f(D2);
            if (i17 == 4) {
                i5 = 1;
            } else {
                i5 = i4;
            }
            int i18 = (f3 ? 1 : 0) | i5;
            if ((i16 & 29360128) == 8388608) {
                i4 = 1;
            }
            int i19 = i18 | i4;
            Object P4 = rv4Var.P();
            Object obj6 = P4;
            if (i19 != 0 || P4 == obj3) {
                Object pg0Var = new pg0(dubVar, xt4Var, D2);
                rv4Var.o0(pg0Var);
                obj6 = pg0Var;
            }
            hj0.a(dubVar, m, false, z, og0Var2, oybVar, t86Var, (pg0) obj6, null, obj, hy0Var, dmbVar, null, rv4Var, 1597440 | i17 | ((i16 >> 15) & 7168) | ((i16 << 9) & 458752) | (i16 & 1879048192), (i16 >> 6) & 1008);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new qg0(dubVar, nq7Var, oybVar, hy0Var, dmbVar, zm4Var, vt4Var, xt4Var, z, lu4Var, i2);
        }
    }

    public static final void b(nq7 nq7Var, na5 na5Var, xt4 xt4Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        boolean z;
        nq7 nq7Var2;
        boolean z2;
        boolean z3;
        na5Var.getClass();
        xt4Var.getClass();
        rv4Var.g0(-645862604);
        if (rv4Var.f(na5Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i2 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i6 = i5 | i4;
        if ((i6 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i6 & 1, z)) {
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = ox9.B(tl1.B(new zl1(sve.d(4294901824L)), new zl1(sve.d(4294902015L)), new zl1(sve.d(4286578943L)), new zl1(sve.d(4278190335L)), new zl1(sve.d(4278223103L)), new zl1(sve.d(4278255615L)), new zl1(sve.d(4278255488L)), new zl1(sve.d(4278255360L)), new zl1(sve.d(4286643968L)), new zl1(sve.d(4294967040L)), new zl1(sve.d(4294934528L)), new zl1(sve.d(4294901760L))), nae.e, 14);
                rv4Var.o0(P);
            }
            hy0 hy0Var = (hy0) P;
            nq7Var2 = nq7Var;
            nq7 a0 = nq7Var2.a0(pna.c);
            if ((i6 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P2 = rv4Var.P();
            if (z2 || P2 == lh9Var) {
                P2 = new sc(1, xt4Var);
                rv4Var.o0(P2);
            }
            nq7 b2 = dab.b(a0, pvc.a, (PointerInputEventHandler) P2);
            if ((i6 & Token.ASSIGN_MOD) != 32) {
                z3 = false;
            } else {
                z3 = true;
            }
            Object P3 = rv4Var.P();
            if (z3 || P3 == lh9Var) {
                P3 = new oc(hy0Var, na5Var, 1);
                rv4Var.o0(P3);
            }
            bce.a(b2, (xt4) P3, rv4Var, 0);
        } else {
            nq7Var2 = nq7Var;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new pc(nq7Var2, na5Var, xt4Var, i2, 1);
        }
    }

    public static final g6a c(b7a b7aVar, rt0 rt0Var) {
        boolean z;
        if (b7aVar.i() == jd2.a) {
            z = true;
        } else {
            z = false;
        }
        return new g6a(e(b7aVar.k(), z, true, b7aVar.l(), rt0Var), e(b7aVar.h(), z, false, b7aVar.g(), rt0Var), z);
    }

    public static final f6a d(b7a b7aVar, z5a z5aVar, f6a f6aVar) {
        int i2;
        int g2;
        int i3;
        boolean z;
        if (b7aVar.a()) {
            i2 = z5aVar.c;
        } else {
            i2 = z5aVar.d;
        }
        int i4 = i2;
        if (b7aVar.a()) {
            g2 = b7aVar.l();
        } else {
            g2 = b7aVar.g();
        }
        int i5 = z5aVar.b;
        fvb fvbVar = z5aVar.f;
        int i6 = z5aVar.e;
        if (g2 != i5) {
            return z5aVar.a(i4);
        }
        t93 t93Var = new t93(z5aVar, i4, 7);
        sk6 sk6Var = sk6.c;
        ye6 x = ipe.x(sk6Var, t93Var);
        if (b7aVar.a()) {
            i3 = z5aVar.d;
        } else {
            i3 = z5aVar.c;
        }
        ye6 x2 = ipe.x(sk6Var, new cn7(z5aVar, i4, i3, b7aVar, x));
        if (z5aVar.a != f6aVar.c) {
            return (f6a) x2.getValue();
        }
        if (i4 == i6) {
            return f6aVar;
        }
        if (((Number) x.getValue()).intValue() != fvbVar.b.d(i6)) {
            return (f6a) x2.getValue();
        }
        int i7 = f6aVar.b;
        long k = fvbVar.k(i7);
        boolean a = b7aVar.a();
        if (i6 != -1) {
            if (i4 != i6) {
                if (z5aVar.b() == jd2.a) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(a ^ z)) {
                }
            }
            return z5aVar.a(i4);
        }
        int i8 = fxb.c;
        if (i7 != ((int) (k >> 32)) && i7 != ((int) (k & 4294967295L))) {
            return z5aVar.a(i4);
        }
        return (f6a) x2.getValue();
    }

    public static final f6a e(z5a z5aVar, boolean z, boolean z2, int i2, rt0 rt0Var) {
        int i3;
        long j2;
        if (z2) {
            i3 = z5aVar.c;
        } else {
            i3 = z5aVar.d;
        }
        if (i2 != z5aVar.b) {
            return z5aVar.a(i3);
        }
        long c2 = rt0Var.c(z5aVar, i3);
        if (z ^ z2) {
            int i4 = fxb.c;
            j2 = c2 >> 32;
        } else {
            int i5 = fxb.c;
            j2 = 4294967295L & c2;
        }
        return z5aVar.a((int) j2);
    }

    public static final f6a g(f6a f6aVar, z5a z5aVar, int i2) {
        return new f6a(z5aVar.f.a(i2), i2, f6aVar.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (r2.b == r5.b) goto L3;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v3, types: [vl9, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.g6a h(defpackage.g6a r8, defpackage.b7a r9) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b23.h(g6a, b7a):g6a");
    }

    public static String i(b31 b31Var) {
        StringBuilder sb = new StringBuilder(b31Var.size());
        for (int i2 = 0; i2 < b31Var.size(); i2++) {
            byte a = b31Var.a(i2);
            if (a != 34) {
                if (a != 39) {
                    if (a != 92) {
                        switch (a) {
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
                                if (a >= 32 && a <= 126) {
                                    sb.append((char) a);
                                    continue;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((a >>> 6) & 3) + 48));
                                    sb.append((char) (((a >>> 3) & 7) + 48));
                                    sb.append((char) ((a & 7) + 48));
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

    public static final float j(float f2) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f2) & 8589934591L) / 3)) + 709952852);
        float f3 = intBitsToFloat - ((intBitsToFloat - (f2 / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f3 - ((f3 - (f2 / (f3 * f3))) * 0.33333334f);
    }

    public static final Rect k(TextPaint textPaint, CharSequence charSequence, int i2, int i3) {
        int i4 = i2;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i4 - 1, i3, MetricAffectingSpan.class) != i3) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i4 < i3) {
                    int nextSpanTransition = spanned.nextSpanTransition(i4, i3, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i4, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        ff.r(textPaint2, charSequence, i4, nextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i4, nextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i4 = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            ff.r(textPaint, charSequence, i4, i3, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i4, i3, rect3);
        return rect3;
    }

    public static final void l(frb frbVar, int i2, int i3) {
        fxb fxbVar = frbVar.C;
        int min = Math.min(i2, i3);
        int max = Math.max(i2, i3);
        frbVar.c(min, max, "");
        if (fxbVar != null) {
            long j2 = uwe.j(min, max, 0, fxbVar.a);
            if (fxb.d(j2)) {
                frbVar.f(null);
            } else {
                frbVar.e(fxb.g(j2), null, fxb.f(j2));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        if (r8 == r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        r6.f(null);
        r6.E = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(defpackage.frb r6, int r7, int r8, java.lang.CharSequence r9) {
        /*
            int r0 = java.lang.Math.min(r7, r8)
            int r7 = java.lang.Math.max(r7, r8)
            r8 = 0
            r1 = r0
        La:
            if (r1 >= r7) goto L23
            int r2 = r9.length()
            if (r8 >= r2) goto L23
            char r2 = r9.charAt(r8)
            tb1 r3 = r6.c
            char r3 = r3.charAt(r1)
            if (r2 != r3) goto L23
            int r8 = r8 + 1
            int r1 = r1 + 1
            goto La
        L23:
            int r2 = r9.length()
        L27:
            if (r7 <= r1) goto L40
            if (r2 <= r8) goto L40
            int r3 = r2 + (-1)
            char r3 = r9.charAt(r3)
            tb1 r4 = r6.c
            int r5 = r7 + (-1)
            char r4 = r4.charAt(r5)
            if (r3 != r4) goto L40
            int r2 = r2 + (-1)
            int r7 = r7 + (-1)
            goto L27
        L40:
            if (r1 != r7) goto L4c
            if (r8 == r2) goto L45
            goto L4c
        L45:
            r7 = 0
            r6.f(r7)
            r6.E = r7
            goto L53
        L4c:
            java.lang.CharSequence r8 = r9.subSequence(r8, r2)
            r6.c(r1, r7, r8)
        L53:
            int r7 = r9.length()
            int r7 = r7 + r0
            long r7 = defpackage.sze.a(r7, r7)
            r6.g(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b23.m(frb, int, int, java.lang.CharSequence):void");
    }

    public static final float o(float f2, float f3, float f4) {
        return (f4 * f3) + ((1.0f - f4) * f2);
    }

    public static final int p(float f2, int i2, int i3) {
        return i2 + ((int) Math.round((i3 - i2) * f2));
    }

    public static final una q(w22 w22Var, rv4 rv4Var) {
        Object a12Var;
        w22Var.getClass();
        boolean equals = w22Var.equals(r0f.E);
        boolean g2 = rv4Var.g(equals);
        Object P = rv4Var.P();
        if (g2 || P == ax1.a) {
            if (equals) {
                a12Var = una.p;
            } else {
                a12Var = new a12();
            }
            P = a12Var;
            rv4Var.o0(P);
        }
        return (una) P;
    }

    public static final long r(dub dubVar) {
        dubVar.getClass();
        long j2 = dubVar.d().e;
        int i2 = fxb.c;
        int i3 = ((int) (j2 >> 32)) - 1;
        int i4 = 0;
        if (i3 < 0) {
            i3 = 0;
        }
        int i5 = ((int) (dubVar.d().e & 4294967295L)) - 1;
        if (i5 >= 0) {
            i4 = i5;
        }
        return sze.a(i3, i4);
    }

    public static final String s(dub dubVar) {
        dubVar.getClass();
        return k4b.t0(dubVar.d().d.toString(), "\u200b");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084 A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v1, types: [spd, c1, d82] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.n42 r8) {
        /*
            d82 r0 = r8.getContext()
            defpackage.k27.q(r0)
            m42 r8 = defpackage.w92.t(r8)
            boolean r1 = r8 instanceof defpackage.ta3
            if (r1 == 0) goto L12
            ta3 r8 = (defpackage.ta3) r8
            goto L13
        L12:
            r8 = 0
        L13:
            n82 r1 = defpackage.n82.a
            pvc r2 = defpackage.pvc.a
            if (r8 != 0) goto L1b
        L19:
            r8 = r2
            goto L81
        L1b:
            f82 r3 = r8.d
            boolean r4 = defpackage.ua3.c(r3, r0)
            r5 = 1
            if (r4 == 0) goto L2c
            r8.f = r2
            r8.c = r5
            r3.Q(r0, r8)
            goto L65
        L2c:
            spd r4 = new spd
            bl8 r6 = defpackage.spd.c
            r4.<init>(r6)
            d82 r0 = r0.plus(r4)
            r8.f = r2
            r8.c = r5
            r3.Q(r0, r8)
            boolean r0 = r4.b
            if (r0 == 0) goto L65
            lx3 r0 = defpackage.c7c.a()
            rz r3 = r0.e
            if (r3 == 0) goto L4f
            boolean r3 = r3.isEmpty()
            goto L50
        L4f:
            r3 = r5
        L50:
            if (r3 == 0) goto L53
            goto L19
        L53:
            long r3 = r0.c
            r6 = 4294967296(0x100000000, double:2.121995791E-314)
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 < 0) goto L67
            r8.f = r2
            r8.c = r5
            r0.I0(r8)
        L65:
            r8 = r1
            goto L81
        L67:
            r0.V0(r5)
            r8.run()     // Catch: java.lang.Throwable -> L77
        L6d:
            boolean r3 = r0.k1()     // Catch: java.lang.Throwable -> L77
            if (r3 != 0) goto L6d
        L73:
            r0.y0(r5)
            goto L19
        L77:
            r3 = move-exception
            r8.h(r3)     // Catch: java.lang.Throwable -> L7c
            goto L73
        L7c:
            r8 = move-exception
            r0.y0(r5)
            throw r8
        L81:
            if (r8 != r1) goto L84
            return r8
        L84:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b23.t(n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.iw9 r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b23.f(iw9, java.lang.Object):void");
    }

    public void n(cw9 cw9Var, Object obj) {
        String str;
        cw9Var.getClass();
        if (obj == null) {
            return;
        }
        switch (this.a) {
            case 0:
                str = "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
                break;
            case 1:
                str = "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
                break;
            case 2:
                str = "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
                break;
            case 3:
                str = "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
                break;
            case 4:
                str = "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                break;
            default:
                str = "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
                break;
        }
        iw9 h1 = cw9Var.h1(str);
        try {
            f(h1, obj);
            h1.Z0();
            dxe.r(h1, null);
        } finally {
        }
    }
}
