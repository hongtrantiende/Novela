package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;
import com.reader.app.widget.tts.TTSNextChapterAction;
import com.reader.app.widget.tts.TTSPreviousChapterAction;
import com.vbook.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iue  reason: default package */
/* loaded from: classes3.dex */
public abstract class iue {
    public static final tu1 a = new tu1(new dv1(8), false, -429899989);
    public static final tu1 b = new tu1(new dv1(9), false, 1281378378);
    public static final tu1 c = new tu1(new cv1(29), false, 692659866);

    public static final void A(t14 t14Var, nq7 nq7Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        kq7 kq7Var;
        boolean z2;
        rv4Var.g0(973581623);
        if (rv4Var.h(t14Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2 | 48;
        if (rv4Var.h(xt4Var)) {
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
        if (rv4Var.U(i5 & 1, z)) {
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var, 0);
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
            int i6 = i5 & 14;
            int i7 = i5 & 896;
            B(t14Var, null, xt4Var, rv4Var, 8 | i6 | i7);
            nq7 f = pna.f(kq7Var2, 1.0f);
            boolean z3 = false;
            hz hzVar = new hz(8.0f, true, new vs(2));
            if (i6 != 4 && !rv4Var.h(t14Var)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i7 == 256) {
                z3 = true;
            }
            boolean z4 = z2 | z3;
            Object P = rv4Var.P();
            if (z4 || P == ax1.a) {
                P = new j14(t14Var, xt4Var, 1);
                rv4Var.o0(P);
            }
            kq7Var = kq7Var2;
            jce.e(f, null, null, false, hzVar, null, null, false, null, (xt4) P, rv4Var, 24582, 494);
            rv4Var.q(true);
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new k14(t14Var, kq7Var, xt4Var, i, 2);
        }
    }

    public static final void B(t14 t14Var, nq7 nq7Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4 rv4Var2;
        kq7 kq7Var;
        kq7 kq7Var2;
        int i3;
        String str;
        boolean z2;
        boolean z3;
        int i4;
        boolean h;
        int i5;
        rv4Var.g0(1840479920);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var.f(t14Var);
            } else {
                h = rv4Var.h(t14Var);
            }
            if (h) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        int i6 = i2 | 48;
        if ((i & 384) == 0) {
            if (rv4Var.h(xt4Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i6 |= i4;
        }
        if ((i6 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i6 & 1, z)) {
            String str2 = t14Var.b;
            int i7 = i6;
            String str3 = t14Var.b;
            String str4 = t14Var.c;
            if (str2.length() == 0 && str4.length() == 0) {
                ek9 u = rv4Var.u();
                if (u != null) {
                    u.d = new gk7(t14Var, xt4Var, i);
                    return;
                }
                return;
            }
            kq7 kq7Var3 = kq7.a;
            nq7 A = zbe.A(pna.f(kq7Var3, 1.0f), nae.e, 8.0f, 1);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var, 48);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, A);
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
            we6 f = s21.f(rv4Var, p, npVar4, 1.0f, true);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, f);
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
            if (str3.length() > 0) {
                rv4Var.e0(-1846383204);
                str = str4;
                kq7Var2 = kq7Var3;
                i3 = i7;
                z2 = false;
                cvb.c(str3, null, 0L, null, 0L, null, dq4.C, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((h27) rv4Var.j(j27.a)).b.g, rv4Var, 1572864, 24960, 110526);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                rv4Var2 = rv4Var;
                kq7Var2 = kq7Var3;
                i3 = i7;
                str = str4;
                z2 = false;
                rv4Var2.e0(-1846107924);
                rv4Var2.q(false);
            }
            if (str.length() > 0) {
                rv4Var2.e0(-1846033028);
                tza tzaVar = j27.a;
                rv4 rv4Var3 = rv4Var2;
                cvb.c(str, null, zl1.b(0.6f, ((h27) rv4Var2.j(tzaVar)).a.q), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((h27) rv4Var2.j(tzaVar)).b.l, rv4Var3, 0, 24960, 110586);
                rv4Var2 = rv4Var3;
                rv4Var2.q(z2);
            } else {
                rv4Var2.e0(-1845726996);
                rv4Var2.q(z2);
            }
            rv4Var2.q(true);
            g14 g14Var = t14Var.e;
            if (g14Var != null) {
                rv4Var2.e0(-1739320761);
                String A2 = yqe.A((y3b) b3b.X.getValue(), rv4Var2);
                tza tzaVar2 = j27.a;
                oyb oybVar = ((h27) rv4Var2.j(tzaVar2)).b.m;
                long j = ((h27) rv4Var2.j(tzaVar2)).a.a;
                nq7 k = tte.k(kq7Var2, uu9.a);
                if ((i3 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                boolean h2 = z3 | rv4Var2.h(g14Var);
                Object P = rv4Var2.P();
                if (h2 || P == ax1.a) {
                    P = new u93(8, xt4Var, g14Var);
                    rv4Var2.o0(P);
                }
                cvb.c(A2, zbe.z(q1d.b(k, z2, nae.e, (vt4) P, 3), 12.0f, 6.0f), j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var, 0, 0, 131064);
                rv4Var2 = rv4Var;
                rv4Var2.q(z2);
            } else {
                rv4Var2.e0(-1738927402);
                rv4Var2.q(z2);
            }
            rv4Var2.q(true);
            kq7Var = kq7Var2;
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
            kq7Var = nq7Var;
        }
        ek9 u2 = rv4Var2.u();
        if (u2 != null) {
            u2.d = new va((Object) t14Var, kq7Var, (hu4) xt4Var, i, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void C(defpackage.nq7 r57, boolean r58, float r59, boolean r60, defpackage.rv4 r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iue.C(nq7, boolean, float, boolean, rv4, int, int):void");
    }

    public static final void D(xy4 xy4Var, rq9 rq9Var, final String str, final boolean z, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        final float f;
        rv4Var.g0(1694932250);
        if (rv4Var.f(xy4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.f(rq9Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var.f(str)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if (rv4Var.g(z)) {
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
            tza tzaVar = by1.e;
            final rq9 rq9Var2 = ((tm3) rv4Var.j(tzaVar)).g;
            final rq9 rq9Var3 = ((tm3) rv4Var.j(tzaVar)).h;
            final rq9 rq9Var4 = ((tm3) rv4Var.j(tzaVar)).c;
            final rq9 rq9Var5 = ((tm3) rv4Var.j(tzaVar)).d;
            if (z) {
                f = 12.0f;
            } else {
                f = 60.0f;
            }
            w92.b(xwe.k(hc2.h(aye.e(xy4Var, rq9Var), 28.0f), 12.0f), null, jce.E(-1405851400, new lu4() { // from class: mib
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    boolean z3;
                    rv4 rv4Var2 = (rv4) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z3)) {
                        vy4 vy4Var = vy4.a;
                        iue.a(s9e.r(vy4Var), str, 28.0f, rv4Var2, 0);
                        kwe.b(s9e.r(vy4Var), 2, 1, jce.E(1735493826, new qib(z, rq9Var4, rq9Var5, f, rq9Var2, rq9Var3), rv4Var2), rv4Var2, 3072, 0);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, 384, 2);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new jib(xy4Var, rq9Var, str, z, i, 1);
        }
    }

    public static final void E(int i, rv4 rv4Var, xy4 xy4Var, rq9 rq9Var, final rq9 rq9Var2, lid lidVar, final String str, final String str2, final String str3, final boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        rv4Var.g0(769195277);
        if (rv4Var.f(xy4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i10 = i | i2;
        if (rv4Var.f(lidVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i11 = i10 | i3;
        if (rv4Var.f(rq9Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i12 = i11 | i4;
        if (rv4Var.f(str)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i13 = i12 | i5;
        if (rv4Var.f(str2)) {
            i6 = 131072;
        } else {
            i6 = Parser.ARGC_LIMIT;
        }
        int i14 = i13 | i6;
        if (rv4Var.f(str3)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i15 = i14 | i7;
        if (rv4Var.g(z)) {
            i8 = 8388608;
        } else {
            i8 = 4194304;
        }
        int i16 = i15 | i8;
        if (rv4Var.f(rq9Var2)) {
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
        if (rv4Var.U(i17 & 1, z2)) {
            tza tzaVar = by1.e;
            final rq9 rq9Var3 = ((tm3) rv4Var.j(tzaVar)).g;
            final rq9 rq9Var4 = ((tm3) rv4Var.j(tzaVar)).h;
            final rq9 rq9Var5 = ((tm3) rv4Var.j(tzaVar)).c;
            final rq9 rq9Var6 = ((tm3) rv4Var.j(tzaVar)).d;
            float H = H(lidVar.a(), 28.0f);
            final float I = I(H, 56.0f);
            final float I2 = I(H, 44.0f);
            final float I3 = I(H(I2 - 16.0f, 18.0f), 26.0f);
            w92.b(xwe.k(hc2.h(aye.e(xy4Var, rq9Var), 60.0f), 16.0f), null, jce.E(-936402193, new lu4() { // from class: kib
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    boolean z3;
                    rv4 rv4Var2 = (rv4) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z3)) {
                        xy4 h = hc2.h(s9e.r(vy4.a), 60.0f);
                        final float f = I;
                        final String str4 = str3;
                        final float f2 = I2;
                        final boolean z4 = z;
                        final rq9 rq9Var7 = rq9Var5;
                        final rq9 rq9Var8 = rq9Var6;
                        final float f3 = I3;
                        final rq9 rq9Var9 = rq9Var3;
                        final rq9 rq9Var10 = rq9Var4;
                        final String str5 = str;
                        final rq9 rq9Var11 = rq9Var2;
                        final String str6 = str2;
                        jue.y(h, 1, 1, jce.E(865949523, new mu4() { // from class: pib
                            @Override // defpackage.mu4
                            public final Object c(Object obj3, Object obj4, Object obj5) {
                                boolean z5;
                                boolean h2;
                                int i18;
                                iv9 iv9Var = (iv9) obj3;
                                rv4 rv4Var3 = (rv4) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                iv9Var.getClass();
                                if ((intValue2 & 6) == 0) {
                                    if ((intValue2 & 8) == 0) {
                                        h2 = rv4Var3.f(iv9Var);
                                    } else {
                                        h2 = rv4Var3.h(iv9Var);
                                    }
                                    if (h2) {
                                        i18 = 4;
                                    } else {
                                        i18 = 2;
                                    }
                                    intValue2 |= i18;
                                }
                                if ((intValue2 & 19) != 18) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (rv4Var3.U(intValue2 & 1, z5)) {
                                    iue.a(s9e.w(f), str4, 60.0f, rv4Var3, 0);
                                    ube.p(s9e.z(12.0f), rv4Var3, 0);
                                    kwe.b(iv9.a(), 0, 0, jce.E(795173961, new bib(str5, rq9Var11, str6, 0), rv4Var3), rv4Var3, 3072, 6);
                                    ube.p(s9e.z(8.0f), rv4Var3, 0);
                                    float f4 = f2;
                                    xy4 w = s9e.w(f4);
                                    boolean z6 = z4;
                                    rq9 rq9Var12 = rq9Var7;
                                    rq9 rq9Var13 = rq9Var8;
                                    float f5 = f3;
                                    iue.y(w, z6, rq9Var12, rq9Var13, 10.0f, f5, rv4Var3, 24576, 0);
                                    ube.p(s9e.z(8.0f), rv4Var3, 0);
                                    iue.v(s9e.w(f4), rq9Var9, rq9Var10, 10.0f, f5, rv4Var3, 3072, 0);
                                } else {
                                    rv4Var3.X();
                                }
                                return pvc.a;
                            }
                        }, rv4Var2), rv4Var2, 3072, 0);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, 384, 2);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new yhb(xy4Var, lidVar, rq9Var, str, str2, str3, z, rq9Var2, i);
        }
    }

    public static final void F(xy4 xy4Var, lid lidVar, final String str, rq9 rq9Var, final String str2, final boolean z, final rq9 rq9Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        rv4Var.g0(764279012);
        if (rv4Var.f(xy4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (rv4Var.f(lidVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if (rv4Var.f(str)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i11 = i10 | i4;
        if (rv4Var.f(rq9Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (rv4Var.f(str2)) {
            i6 = 131072;
        } else {
            i6 = Parser.ARGC_LIMIT;
        }
        int i13 = i12 | i6;
        if (rv4Var.g(z)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i14 = i13 | i7;
        if (rv4Var.f(rq9Var2)) {
            i8 = 8388608;
        } else {
            i8 = 4194304;
        }
        int i15 = i14 | i8;
        if ((4793491 & i15) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i15 & 1, z2)) {
            tza tzaVar = by1.e;
            final rq9 rq9Var3 = ((tm3) rv4Var.j(tzaVar)).g;
            final rq9 rq9Var4 = ((tm3) rv4Var.j(tzaVar)).h;
            final rq9 rq9Var5 = ((tm3) rv4Var.j(tzaVar)).c;
            final rq9 rq9Var6 = ((tm3) rv4Var.j(tzaVar)).d;
            final float I = I(H(lidVar.a(), 28.0f), 48.0f);
            final float I2 = I(H(I - 16.0f, 18.0f), 26.0f);
            w92.b(xwe.k(hc2.h(aye.e(xy4Var, rq9Var), 60.0f), 16.0f), null, jce.E(-1109266878, new lu4() { // from class: hib
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    boolean z3;
                    rv4 rv4Var2 = (rv4) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z3)) {
                        xy4 h = hc2.h(s9e.r(vy4.a), 60.0f);
                        final float f = I;
                        final boolean z4 = z;
                        final rq9 rq9Var7 = rq9Var5;
                        final rq9 rq9Var8 = rq9Var6;
                        final float f2 = I2;
                        final rq9 rq9Var9 = rq9Var3;
                        final rq9 rq9Var10 = rq9Var4;
                        final String str3 = str;
                        final rq9 rq9Var11 = rq9Var2;
                        final String str4 = str2;
                        jue.y(h, 1, 1, jce.E(-1263324066, new mu4() { // from class: sib
                            @Override // defpackage.mu4
                            public final Object c(Object obj3, Object obj4, Object obj5) {
                                boolean z5;
                                boolean h2;
                                int i16;
                                iv9 iv9Var = (iv9) obj3;
                                rv4 rv4Var3 = (rv4) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                iv9Var.getClass();
                                if ((intValue2 & 6) == 0) {
                                    if ((intValue2 & 8) == 0) {
                                        h2 = rv4Var3.f(iv9Var);
                                    } else {
                                        h2 = rv4Var3.h(iv9Var);
                                    }
                                    if (h2) {
                                        i16 = 4;
                                    } else {
                                        i16 = 2;
                                    }
                                    intValue2 |= i16;
                                }
                                if ((intValue2 & 19) != 18) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (rv4Var3.U(intValue2 & 1, z5)) {
                                    kwe.b(iv9.a(), 0, 0, jce.E(-918471896, new bib(str3, rq9Var11, str4, 4), rv4Var3), rv4Var3, 3072, 6);
                                    ube.p(s9e.z(8.0f), rv4Var3, 0);
                                    float f3 = f;
                                    xy4 w = s9e.w(f3);
                                    boolean z6 = z4;
                                    rq9 rq9Var12 = rq9Var7;
                                    rq9 rq9Var13 = rq9Var8;
                                    float f4 = f2;
                                    iue.y(w, z6, rq9Var12, rq9Var13, 10.0f, f4, rv4Var3, 24576, 0);
                                    ube.p(s9e.z(8.0f), rv4Var3, 0);
                                    iue.v(s9e.w(f3), rq9Var9, rq9Var10, 10.0f, f4, rv4Var3, 3072, 0);
                                } else {
                                    rv4Var3.X();
                                }
                                return pvc.a;
                            }
                        }, rv4Var2), rv4Var2, 3072, 0);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, 384, 2);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new xa4(xy4Var, lidVar, str, rq9Var, str2, z, rq9Var2, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0157  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x011e -> B:48:0x0125). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G(android.content.Context r19, defpackage.io5 r20, defpackage.nl1 r21, java.lang.Object r22, defpackage.m10 r23, defpackage.aw7 r24, defpackage.n42 r25) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iue.G(android.content.Context, io5, nl1, java.lang.Object, m10, aw7, n42):java.lang.Object");
    }

    public static final float H(float f, float f2) {
        if (rg3.a(f, f2) > 0) {
            return f;
        }
        return f2;
    }

    public static final float I(float f, float f2) {
        if (rg3.a(f, f2) < 0) {
            return f;
        }
        return f2;
    }

    public static final void J(ArrayList arrayList, ArrayList arrayList2, dc5 dc5Var) {
        if (arrayList.isEmpty()) {
            arrayList2.add(dc5Var);
        } else {
            ((dd5) sl1.j0(arrayList)).d.add(dc5Var);
        }
    }

    public static final void K(int i, int i2) {
        if (i >= 0 && i < i2) {
            return;
        }
        cy7.k(rs8.k("index: ", i, i2, ", size: "));
    }

    public static final void L(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return;
        }
        cy7.k(rs8.k("index: ", i, i2, ", size: "));
    }

    public static final void M(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            }
            vs.m(rs8.k("fromIndex: ", i, i2, " > toIndex: "));
            return;
        }
        cp8.k(i3, hl5.r(i, i2, "fromIndex: ", ", toIndex: ", ", size: "));
    }

    public static final void N(vf6 vf6Var, t14 t14Var, tu1 tu1Var) {
        vf6.y(vf6Var, t14Var.a, new dw3(14), new tu1(new z0a(tu1Var, 1), true, 1440031063), 4);
        S(vf6Var, t14Var);
    }

    public static final un6 O(View view) {
        un6 un6Var;
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            if (tag instanceof un6) {
                un6Var = (un6) tag;
            } else {
                un6Var = null;
            }
            if (un6Var != null) {
                return un6Var;
            }
            ViewParent q = gue.q(view);
            if (q instanceof View) {
                view = (View) q;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static Drawable P(Context context, int i) {
        return dr9.c().d(context, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.c37 Q(defpackage.bv9 r25, int r26, int r27, int r28, int r29, int r30, defpackage.e37 r31, java.util.List r32, defpackage.mw8[] r33, int r34, int r35, int[] r36, int r37) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iue.Q(bv9, int, int, int, int, int, e37, java.util.List, mw8[], int, int, int[], int):c37");
    }

    public static final void R(mq7 mq7Var, vt4 vt4Var) {
        s78 s78Var = mq7Var.C;
        if (s78Var == null) {
            s78Var = new s78((r78) mq7Var);
            mq7Var.C = s78Var;
        }
        yg8 snapshotObserver = ((rg) voe.w(mq7Var)).getSnapshotObserver();
        snapshotObserver.a.d(s78Var, vt3.P, vt4Var);
    }

    public static final void S(vf6 vf6Var, t14 t14Var) {
        vf6.y(vf6Var, t14Var.a.concat("-spacer"), new dw3(16), rte.a, 4);
    }

    public static final void a(final xy4 xy4Var, final String str, final float f, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        boolean z;
        String str2;
        int i4;
        rv4Var.g0(-773043010);
        if (rv4Var.f(xy4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (rv4Var.f(str)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if ((i & 384) == 0) {
            if (rv4Var.c(f)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i6 |= i4;
        }
        boolean z2 = false;
        int i7 = 1;
        if ((i6 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i6 & 1, z)) {
            Context context = (Context) rv4Var.j(by1.b);
            if ((i6 & Token.ASSIGN_MOD) == 32) {
                z2 = true;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = null;
                if (str != null) {
                    if (!k4b.j0(str)) {
                        str2 = str;
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        try {
                            BitmapFactory.decodeFile(str2, options);
                            if (options.outWidth > 0 && options.outHeight > 0) {
                                while (true) {
                                    int i8 = i7 * 2;
                                    if (options.outWidth / i8 < 512 || options.outHeight / i8 < 512) {
                                        break;
                                    }
                                    i7 = i8;
                                }
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inSampleSize = i7;
                                P = BitmapFactory.decodeFile(str2, options2);
                            }
                        } catch (Exception | OutOfMemoryError unused) {
                        }
                    }
                }
                rv4Var.o0(P);
            }
            tza tzaVar = by1.e;
            w92.b(xy4Var, null, jce.E(560214940, new vc3((Bitmap) P, context, f, ((tm3) rv4Var.j(tzaVar)).u, ((tm3) rv4Var.j(tzaVar)).v), rv4Var), rv4Var, (i6 & 14) | 384, 2);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: uib
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p = xoe.p(i | 1);
                    iue.a(xy4.this, str, f, (rv4) obj, p);
                    return pvc.a;
                }
            };
        }
    }

    public static final void b(t14 t14Var, nq7 nq7Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        kq7 kq7Var;
        boolean z2;
        ArrayList arrayList = t14Var.f;
        rv4Var.g0(1172757961);
        if (rv4Var.h(t14Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i | 48;
        if (rv4Var.h(xt4Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i5 = i4 | i3;
        boolean z3 = true;
        if ((i5 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            if (arrayList.isEmpty()) {
                ek9 u = rv4Var.u();
                if (u != null) {
                    u.d = new h14(t14Var, xt4Var, i);
                    return;
                }
                return;
            }
            int i6 = i5 & 14;
            if (i6 != 4 && !rv4Var.h(t14Var)) {
                z2 = false;
            } else {
                z2 = true;
            }
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (z2 || P == obj) {
                P = new t42(t14Var, 15);
                rv4Var.o0(P);
            }
            m71 p = voe.p((vt4) P, rv4Var);
            Integer valueOf = Integer.valueOf(arrayList.size());
            if (i6 != 4 && !rv4Var.h(t14Var)) {
                z3 = false;
            }
            boolean h = rv4Var.h(p) | z3;
            Object P2 = rv4Var.P();
            if (h || P2 == obj) {
                P2 = new pf(t14Var, p, (m42) null, 5);
                rv4Var.o0(P2);
            }
            yte.g((lu4) P2, rv4Var, valueOf);
            kq7 kq7Var2 = kq7.a;
            nq7 h2 = pna.h(pna.f(kq7Var2, 1.0f), 200.0f);
            gxa v = tte.v(nae.e, 1500.0f, 5, null);
            yy9 yy9Var = m71.b;
            kq7Var = kq7Var2;
            ade.c(p, h2, 340.0f, 8.0f, hxe.k(p.a, new lh9(18), axa.a(rv4Var), v, rv4Var, 3072, 16), false, nae.e, nae.e, null, jce.E(1911252941, new l14(t14Var, xt4Var, 0), rv4Var), rv4Var, 805309832);
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            u2.d = new k14(t14Var, kq7Var, xt4Var, i, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, cya] */
    public static final void c(t14 t14Var, nq7 nq7Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        kq7 kq7Var;
        boolean z2;
        boolean z3;
        rv4Var.g0(-893446551);
        if (rv4Var.h(t14Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2 | 48;
        if (rv4Var.h(xt4Var)) {
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
        if (rv4Var.U(i5 & 1, z)) {
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var, 0);
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
            int i6 = i5 & 14;
            int i7 = i5 & 896;
            B(t14Var, null, xt4Var, rv4Var, 8 | i6 | i7);
            ?? obj = new Object();
            nq7 f = pna.f(pna.h(kq7Var2, 100.0f), 1.0f);
            hz hzVar = new hz(8.0f, true, new vs(2));
            if (i6 != 4 && !rv4Var.h(t14Var)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i7 == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z4 = z3 | z2;
            Object P = rv4Var.P();
            if (z4 || P == ax1.a) {
                P = new j14(t14Var, xt4Var, 0);
                rv4Var.o0(P);
            }
            kq7Var = kq7Var2;
            hma.j(obj, f, null, null, hzVar, 8.0f, null, false, null, (xt4) P, rv4Var, 1769520);
            rv4Var.q(true);
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new k14(t14Var, kq7Var, xt4Var, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r5v4 */
    public static final void d(r10 r10Var, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, dc dcVar, w22 w22Var, nl1 nl1Var, t1a t1aVar, rv4 rv4Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        nq7 nq7Var2;
        jp5 jp5Var;
        boolean z;
        boolean z2;
        boolean z3;
        int i11;
        btd btdVar;
        float f;
        jp5 jp5Var2;
        boolean z4;
        rv4 rv4Var2;
        int i12;
        int i13;
        int i14;
        io5 io5Var = r10Var.c;
        o7b o7bVar = nl1Var.b;
        rv4Var.g0(2116747689);
        if (rv4Var.f(r10Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i15 = i | i3;
        int i16 = 1024;
        if (rv4Var.h(xt4Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i17 = i15 | i4;
        if (rv4Var.h(xt4Var2)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i18 = i17 | i5;
        if (rv4Var.f(dcVar)) {
            i6 = 131072;
        } else {
            i6 = Parser.ARGC_LIMIT;
        }
        int i19 = i18 | i6;
        if (rv4Var.c(1.0f)) {
            i7 = 8388608;
        } else {
            i7 = 4194304;
        }
        int i20 = i19 | i7;
        if (rv4Var.f(null)) {
            i8 = 67108864;
        } else {
            i8 = 33554432;
        }
        int i21 = i20 | i8;
        if (rv4Var.d(1)) {
            i9 = 536870912;
        } else {
            i9 = 268435456;
        }
        int i22 = i21 | i9;
        if ((i2 & 6) == 0) {
            if (rv4Var.f(nl1Var)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i2 | i14;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.f(t1aVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.h(null)) {
                i12 = 256;
            } else {
                i12 = Token.CASE;
            }
            i10 |= i12;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var.h(null)) {
                i16 = 2048;
            }
            i10 |= i16;
        }
        if ((i22 & 306783379) == 306783378 && (i10 & 1171) == 1170 && rv4Var.E()) {
            rv4Var.X();
            rv4Var2 = rv4Var;
        } else {
            btd btdVar2 = nl1Var.a;
            btdVar2.j(w22Var);
            btdVar2.h(dcVar);
            btdVar2.l((tc6) rv4Var.j(dy1.n));
            boolean f2 = rv4Var.f(io5Var);
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (f2 || P == obj) {
                P = new kl1(io5Var);
                rv4Var.o0(P);
            }
            o7bVar.d((kl1) P);
            Object P2 = rv4Var.P();
            if (P2 == obj) {
                P2 = yae.z(null);
                rv4Var.o0(P2);
            }
            aw7 aw7Var = P2;
            nq7Var.getClass();
            if ((btdVar2.L.h() & 16) == 0) {
                nq7Var2 = nq7Var.a0(new es7(btdVar2));
            } else {
                nq7Var2 = nq7Var;
            }
            int i23 = i10;
            b37 d = fu0.d(kh5.a, false);
            int e = p17.e(rv4Var);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, nq7Var2);
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
            np npVar = qw1.g;
            if (rv4Var.S || !c16.i(rv4Var.P(), Integer.valueOf(e))) {
                rv4Var.o0(Integer.valueOf(e));
                rv4Var.b(Integer.valueOf(e), npVar);
            }
            jce.F(qw1.d, rv4Var, p);
            tza tzaVar = gh.b;
            Context context = (Context) rv4Var.j(tzaVar);
            Object P3 = rv4Var.P();
            if (P3 == obj) {
                P3 = yte.s(rv4Var);
                rv4Var.o0(P3);
            }
            m82 m82Var = (m82) P3;
            Object obj2 = r10Var.a;
            rv4Var.e0(-2017296513);
            if (obj2 instanceof jp5) {
                rv4Var.e0(-1930960060);
                jp5Var = (jp5) obj2;
                if (jp5Var.s.i != null) {
                    rv4Var.e0(-1930920008);
                    rv4Var.q(false);
                    rv4Var.q(false);
                    rv4Var.q(false);
                } else {
                    rv4Var.e0(-1930871834);
                    una q = b23.q(w22Var, rv4Var);
                    boolean f3 = rv4Var.f(jp5Var) | rv4Var.f(q);
                    Object P4 = rv4Var.P();
                    if (f3 || P4 == obj) {
                        fp5 a2 = jp5.a(jp5Var);
                        a2.n = q;
                        P4 = a2.a();
                        rv4Var.o0(P4);
                    }
                    jp5Var = (jp5) P4;
                    hl5.v(rv4Var, false, false, false);
                }
            } else {
                rv4Var.e0(-1930613666);
                Context context2 = (Context) rv4Var.j(tzaVar);
                una q2 = b23.q(w22Var, rv4Var);
                boolean f4 = rv4Var.f(context2) | rv4Var.f(obj2) | rv4Var.f(q2);
                Object P5 = rv4Var.P();
                if (f4 || P5 == obj) {
                    fp5 fp5Var = new fp5(context2);
                    fp5Var.c = obj2;
                    fp5Var.n = q2;
                    P5 = fp5Var.a();
                    rv4Var.o0(P5);
                }
                jp5Var = P5;
                rv4Var.q(false);
                rv4Var.q(false);
            }
            jp5 jp5Var3 = jp5Var;
            boolean h = rv4Var.h(m82Var) | rv4Var.h(context);
            if ((i22 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            boolean z5 = h | z;
            if ((i23 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z6 = z5 | z2;
            if ((i22 & 57344) == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z7 = z6 | z3;
            Object P6 = rv4Var.P();
            if (!z7 && P6 != obj) {
                i11 = 16;
                btdVar = btdVar2;
                f = 1.0f;
                jp5Var2 = jp5Var3;
                z4 = true;
            } else {
                i11 = 16;
                btdVar = btdVar2;
                f = 1.0f;
                jp5Var2 = jp5Var3;
                z4 = true;
                hm0 hm0Var = new hm0(m82Var, xt4Var2, context, r10Var, nl1Var, aw7Var, 3);
                rv4Var.o0(hm0Var);
                P6 = hm0Var;
            }
            int i24 = i22 >> 6;
            jp5 jp5Var4 = jp5Var2;
            n10 g = zve.g(jp5Var4, io5Var, xt4Var, (xt4) P6, w22Var, rv4Var, 0);
            pu0 pu0Var = pu0.a;
            nq7 b2 = pu0Var.b();
            una unaVar = jp5Var4.s.i;
            if (unaVar != null && (unaVar instanceof a12)) {
                b2 = pbe.l(b2, new u0(unaVar, i11));
            }
            b2.getClass();
            nq7 a0 = b2.a0(new zrd(btdVar, z4, null, null));
            a0.getClass();
            lye.a(g, zj0.n(a0, btdVar, false), dcVar, w22Var, f, false, true, rv4Var, (i24 & 7168) | 113270832 | (458752 & i24) | (3670016 & i24));
            rv4Var2 = rv4Var;
            nq7 n = zj0.n(pu0Var.b(), btdVar, z4);
            n.getClass();
            o7bVar.getClass();
            fu0.a(n.a0(new d7b(btdVar, o7bVar)), rv4Var2, 0);
            if (t1aVar != null) {
                rv4Var2.e0(750618999);
                fu0.a(pu0Var.b().a0(new krd(btdVar, t1aVar)), rv4Var2, 0);
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(750784291);
                rv4Var2.q(false);
            }
            rv4Var2.q(z4);
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ua(r10Var, nq7Var, xt4Var, xt4Var2, dcVar, w22Var, nl1Var, t1aVar, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final boolean r23, defpackage.dc r24, long r25, defpackage.nq7 r27, float r28, defpackage.rh8 r29, final defpackage.vt4 r30, final defpackage.tu1 r31, defpackage.rv4 r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iue.e(boolean, dc, long, nq7, float, rh8, vt4, tu1, rv4, int, int):void");
    }

    public static final void f(tu1 tu1Var, lu4 lu4Var, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        lu4 lu4Var2;
        kq7 kq7Var;
        vt4Var.getClass();
        rv4Var.g0(-766207653);
        int i5 = i | 48;
        int i6 = i2 & 4;
        if (i6 != 0) {
            i5 = i | 432;
        } else if ((i & 384) == 0) {
            if (rv4Var.h(lu4Var)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i5 |= i3;
        }
        int i7 = i5 | 27648;
        if (rv4Var.h(vt4Var)) {
            i4 = 131072;
        } else {
            i4 = Parser.ARGC_LIMIT;
        }
        int i8 = i7 | i4;
        if ((74899 & i8) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i8 & 1, z)) {
            if (i6 != 0) {
                lu4Var2 = null;
            } else {
                lu4Var2 = lu4Var;
            }
            kq7 kq7Var2 = kq7.a;
            h(tu1Var, null, lu4Var2, null, kq7Var2, vt4Var, rv4Var, i8 & 524286);
            kq7Var = kq7Var2;
        } else {
            rv4Var.X();
            lu4Var2 = lu4Var;
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new xj7(tu1Var, lu4Var2, kq7Var, vt4Var, i, i2, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(java.lang.String r16, java.lang.String r17, defpackage.lu4 r18, java.lang.Boolean r19, defpackage.nq7 r20, defpackage.vt4 r21, defpackage.rv4 r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iue.g(java.lang.String, java.lang.String, lu4, java.lang.Boolean, nq7, vt4, rv4, int, int):void");
    }

    public static final void h(tu1 tu1Var, lu4 lu4Var, lu4 lu4Var2, Boolean bool, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        Object obj;
        boolean z;
        long j;
        boolean z2;
        long j2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        rv4Var.g0(-1783779311);
        if ((i & 6) == 0) {
            if (rv4Var.h(tu1Var)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            obj = lu4Var;
            if (rv4Var.h(obj)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        } else {
            obj = lu4Var;
        }
        if ((i & 384) == 0) {
            if (rv4Var.h(lu4Var2)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(bool)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(vt4Var)) {
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
        if (rv4Var.U(i2 & 1, z)) {
            Boolean bool2 = Boolean.TRUE;
            if (c16.i(bool, bool2)) {
                rv4Var.e0(-519957032);
                j = ((h27) rv4Var.j(j27.a)).a.a;
            } else {
                rv4Var.e0(-519955782);
                j = ((h27) rv4Var.j(j27.a)).a.q;
            }
            rv4Var.q(false);
            nq7 z3 = zbe.z(nq7Var, 6.0f, 1.0f);
            tza tzaVar = j27.a;
            nq7 k = tte.k(z3, ((h27) rv4Var.j(tzaVar)).c.b);
            if (c16.i(bool, bool2)) {
                rv4Var.e0(-519947868);
                j2 = zl1.b(0.14f, ((h27) rv4Var.j(tzaVar)).a.a);
                z2 = false;
                rv4Var.q(false);
            } else {
                z2 = false;
                rv4Var.e0(-519946884);
                rv4Var.q(false);
                j2 = zl1.h;
            }
            nq7 j3 = pna.j(zbe.z(lbe.f(15, vt4Var, nmd.v(k, j2, lre.g), null, z2), 12.0f, 6.0f), 36.0f, nae.e, 2);
            b37 d = fu0.d(kh5.a, z2);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, j3);
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
            pye.a(r12.a.a(new zl1(j)), jce.E(-2031223721, new i31(lu4Var2, bool, tu1Var, obj, 17), rv4Var), rv4Var, 56);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ru1(tu1Var, lu4Var, lu4Var2, bool, nq7Var, vt4Var, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(int r35, int r36, defpackage.rg3 r37, defpackage.r14 r38, defpackage.vt4 r39, defpackage.rv4 r40, defpackage.nq7 r41) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iue.i(int, int, rg3, r14, vt4, rv4, nq7):void");
    }

    public static final void j(String str, cz7 cz7Var, rh8 rh8Var, bkd bkdVar, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        bkd bkdVar2;
        boolean z;
        boolean z2;
        pb2 pb2Var;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        str.getClass();
        cz7Var.getClass();
        rv4Var.g0(1053838554);
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
            bkdVar2 = bkdVar;
            if (rv4Var.f(bkdVar2)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        } else {
            bkdVar2 = bkdVar;
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
            String concat = "explore-".concat(str);
            int i8 = i2 & 14;
            if (i8 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (z2 || P == obj) {
                P = new op0(str, 21);
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
                gi1 a4 = cm9.a(v14.class);
                v14 v14Var = (v14) ((fdd) voe.z(a4, a2.i(), eub.o(a4.f(), "-", concat), pb2Var2, a3, vt4Var));
                aw7 z6 = jsc.z(v14Var.e, rv4Var);
                if (((u14) z6.getValue()).a && ((u14) z6.getValue()).d.a.isEmpty()) {
                    rv4Var.e0(-1306100313);
                    n(zbe.x(nq7Var.a0(pna.c), rh8Var), rv4Var, 0);
                    rv4Var.q(false);
                } else if (((u14) z6.getValue()).b && ((u14) z6.getValue()).d.a.isEmpty()) {
                    rv4Var.e0(-1305940601);
                    String str2 = ((u14) z6.getValue()).c;
                    nq7 x = zbe.x(nq7Var.a0(pna.c), rh8Var);
                    boolean f = rv4Var.f(v14Var);
                    Object P2 = rv4Var.P();
                    if (f || P2 == obj) {
                        P2 = new v7(0, v14Var, v14.class, "refresh", "refresh()V", 0, 18);
                        rv4Var.o0(P2);
                    }
                    k(0, (vt4) ((i76) P2), rv4Var, x, str2);
                    rv4Var.q(false);
                } else {
                    rv4Var.e0(-1305691330);
                    s14 s14Var = ((u14) z6.getValue()).d;
                    if (((u14) z6.getValue()).a && !((u14) z6.getValue()).d.a.isEmpty()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    nq7 a0 = nq7Var.a0(pna.c);
                    boolean f2 = rv4Var.f(v14Var);
                    Object P3 = rv4Var.P();
                    if (f2 || P3 == obj) {
                        P3 = new v7(0, v14Var, v14.class, "refresh", "refresh()V", 0, 19);
                        rv4Var.o0(P3);
                    }
                    vt4 vt4Var2 = (vt4) ((i76) P3);
                    if (i8 == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if ((i2 & Token.ASSIGN_MOD) == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean z7 = z4 | z5;
                    Object P4 = rv4Var.P();
                    if (z7 || P4 == obj) {
                        P4 = new e83(cz7Var, str);
                        rv4Var.o0(P4);
                    }
                    l(s14Var, z3, rh8Var, bkdVar2, a0, vt4Var2, (xt4) P4, rv4Var, (i2 & 896) | 8 | (i2 & 7168));
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
            u.d = new ud1(str, (Object) cz7Var, (Object) rh8Var, (Object) bkdVar, nq7Var, i, 5);
        }
    }

    public static final void k(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, String str) {
        int i2;
        int i3;
        int i4;
        boolean z;
        String str2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1795500879);
        if (rv4Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.f(nq7Var)) {
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
            rv4Var2.e0(-1573090912);
            if (str.length() == 0) {
                str2 = yqe.A((y3b) s2b.a.getValue(), rv4Var2);
            } else {
                str2 = str;
            }
            rv4Var2.q(false);
            cvb.c(str2, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.j, rv4Var, 0, 0, 131070);
            rv4Var2 = rv4Var;
            xbe.i(rv4Var2, pna.h(kq7.a, 12.0f));
            z1d.f(rp5.c((wk3) ok3.g0.getValue(), rv4Var2, 0), yqe.A((y3b) b3b.B.getValue(), rv4Var2), false, null, null, null, null, null, vt4Var, rv4Var2, (i7 << 18) & 234881024, 252);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new k31(str, nq7Var, vt4Var, i, 6);
        }
    }

    public static final void l(s14 s14Var, boolean z, rh8 rh8Var, bkd bkdVar, nq7 nq7Var, vt4 vt4Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        Object obj;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean h;
        int i9;
        rv4Var.g0(31265205);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var.f(s14Var);
            } else {
                h = rv4Var.h(s14Var);
            }
            if (h) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.g(z)) {
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
            obj = bkdVar;
            if (rv4Var.f(obj)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        } else {
            obj = bkdVar;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.f(nq7Var)) {
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
            if (rv4Var.h(xt4Var)) {
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
            ya9 b2 = ra9.b(rv4Var);
            ra9.a(z, vt4Var, nq7Var, b2, null, jce.E(1982783822, new f83(b2, z, rh8Var, 1), rv4Var), false, nae.e, jce.E(1452162577, new g83(rh8Var, obj, s14Var, xt4Var, 9), rv4Var), rv4Var, ((i10 >> 3) & 14) | 100859904 | ((i10 >> 12) & Token.ASSIGN_MOD) | ((i10 >> 6) & 896));
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new qg1(s14Var, z, rh8Var, bkdVar, nq7Var, vt4Var, xt4Var, i);
        }
    }

    public static final void m(r14 r14Var, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        kq7 kq7Var;
        boolean z2;
        rv4 rv4Var2 = rv4Var;
        String str = r14Var.d;
        String str2 = r14Var.c;
        String str3 = r14Var.a;
        rv4Var2.g0(1752740399);
        if (rv4Var2.f(r14Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2 | 48;
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
            kq7 kq7Var2 = kq7.a;
            nq7 k = tte.k(pna.f(kq7Var2, 1.0f), r0f.z(rv4Var2).b);
            if ((i5 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var2.P();
            if (z2 || P == ax1.a) {
                P = new jf3(10, vt4Var);
                rv4Var2.o0(P);
            }
            nq7 A = zbe.A(q1d.b(k, false, nae.e, (vt4) P, 3), nae.e, 4.0f, 1);
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
            nq7 k2 = tte.k(jsc.t(0.6666667f, pna.s(kq7Var2, 56.0f), false), r0f.z(rv4Var2).b);
            b37 d = fu0.d(kh5.a, false);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, k2);
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
            do5.d(str3, r14Var.b, r14Var.e, r0f.d, pna.c, rv4Var2, 27648);
            rv4Var2.q(true);
            xbe.i(rv4Var2, pna.s(kq7Var2, 12.0f));
            we6 we6Var = new we6(1.0f, true);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, we6Var);
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
            cvb.c(str3, null, 0L, null, 0L, null, dq4.f, null, 0L, null, null, 0L, 2, false, 2, 0, null, r0f.A(rv4Var2).j, rv4Var, 1572864, 24960, 110526);
            rv4Var2 = rv4Var;
            if (str2.length() > 0) {
                rv4Var2.e0(1213876105);
                cvb.c(str2, null, zl1.b(0.6f, r0f.y(rv4Var2).q), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, r0f.A(rv4Var2).l, rv4Var, 0, 24960, 110586);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(1214182137);
                rv4Var2.q(false);
            }
            if (str.length() > 0) {
                rv4Var2.e0(1214248229);
                cvb.c(str, null, r0f.y(rv4Var2).a, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, r0f.A(rv4Var2).o, rv4Var, 0, 24960, 110586);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(1214527353);
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
            rv4Var2.q(true);
            kq7Var = kq7Var2;
        } else {
            rv4Var2.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ax(r14Var, kq7Var, vt4Var, i, 16);
        }
    }

    public static final void n(nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        mk0 mk0Var = kh5.F;
        rv4Var.g0(233755074);
        if (rv4Var.f(nq7Var)) {
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
            nq7 A = zbe.A(nq7Var, 12.0f, nae.e, 2);
            xn1 a2 = wn1.a(new hz(16.0f, true, new vs(2)), kh5.I, rv4Var, 6);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, A);
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
            kq7 kq7Var = kq7.a;
            dpe.f(null, tte.k(pna.h(pna.f(kq7Var, 1.0f), 200.0f), ((h27) rv4Var.j(j27.a)).c.c), rv4Var, 0, 1);
            dpe.g(pna.h(pna.s(kq7Var, 120.0f), 20.0f), null, rv4Var, 6, 2);
            hz hzVar = new hz(8.0f, true, new vs(2));
            nq7 q = rte.q(kq7Var, rte.u(rv4Var), 14);
            gv9 a3 = ev9.a(hzVar, mk0Var, rv4Var, 6);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, q);
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
            rv4Var.e0(489460808);
            for (int i4 = 0; i4 < 4; i4++) {
                x(pna.s(kq7Var, 120.0f), rv4Var, 6);
            }
            rv4Var.q(false);
            rv4Var.q(true);
            dpe.g(pna.h(pna.s(kq7Var, 80.0f), 20.0f), null, rv4Var, 6, 2);
            hz hzVar2 = new hz(8.0f, true, new vs(2));
            nq7 q2 = rte.q(kq7Var, rte.u(rv4Var), 14);
            gv9 a4 = ev9.a(hzVar2, mk0Var, rv4Var, 6);
            int hashCode3 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p3 = lye.p(rv4Var, q2);
            rw1.k.getClass();
            zx1 zx1Var2 = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var2);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, a4);
            jce.F(qw1.e, rv4Var, l3);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode3));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p3);
            rv4Var.e0(59677386);
            for (rg3 rg3Var : tl1.B(new rg3(60.0f), new rg3(80.0f), new rg3(50.0f), new rg3(70.0f), new rg3(55.0f))) {
                dpe.g(pna.h(pna.s(kq7Var, rg3Var.a), 36.0f), uu9.a, rv4Var, 0, 0);
            }
            rv4Var.q(false);
            rv4Var.q(true);
            dpe.g(pna.h(pna.s(kq7Var, 100.0f), 20.0f), null, rv4Var, 6, 2);
            hz hzVar3 = new hz(8.0f, true, new vs(2));
            nq7 q3 = rte.q(kq7Var, rte.u(rv4Var), 14);
            gv9 a5 = ev9.a(hzVar3, mk0Var, rv4Var, 6);
            int hashCode4 = Long.hashCode(rv4Var.T);
            xt8 l4 = rv4Var.l();
            nq7 p4 = lye.p(rv4Var, q3);
            rw1.k.getClass();
            zx1 zx1Var3 = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var3);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, a5);
            jce.F(qw1.e, rv4Var, l4);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode4));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p4);
            rv4Var.e0(1109545165);
            for (int i5 = 0; i5 < 3; i5++) {
                x(new we6(1.0f, true), rv4Var, 0);
            }
            hl5.v(rv4Var, false, true, true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new oa(nq7Var, i, 7);
        }
    }

    public static final void o(int i, int i2, rg3 rg3Var, r14 r14Var, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var) {
        int i3;
        boolean z;
        kq7 kq7Var;
        nq7 nq7Var2;
        boolean z2;
        lk0 lk0Var;
        kg kgVar;
        np npVar;
        np npVar2;
        pu0 pu0Var;
        kq7 kq7Var2;
        np npVar3;
        np npVar4;
        zx1 zx1Var;
        nk0 nk0Var;
        int i4;
        int i5;
        boolean h;
        int i6;
        int i7;
        r14 r14Var2 = r14Var;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(900554823);
        if ((i2 & 6) == 0) {
            if (rv4Var2.d(i)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i2 & 64) == 0) {
                h = rv4Var2.f(r14Var2);
            } else {
                h = rv4Var2.h(r14Var2);
            }
            if (h) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        int i8 = i3 | 384;
        if ((i2 & 3072) == 0) {
            if (rv4Var2.f(rg3Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i8 |= i5;
        }
        if ((i2 & 24576) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i8 |= i4;
        }
        if ((i8 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i8 & 1, z)) {
            kq7 kq7Var3 = kq7.a;
            if (rg3Var != null) {
                nq7Var2 = pna.s(kq7Var3, rg3Var.a);
            } else {
                nq7Var2 = kq7Var3;
            }
            if ((i8 & 57344) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var2.P();
            if (z2 || P == ax1.a) {
                P = new jf3(9, vt4Var);
                rv4Var2.o0(P);
            }
            nq7 b2 = q1d.b(nq7Var2, false, nae.e, (vt4) P, 3);
            lk0 lk0Var2 = kh5.I;
            ez ezVar = lz.c;
            xn1 a2 = wn1.a(ezVar, lk0Var2, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, b2);
            rw1.k.getClass();
            zx1 zx1Var2 = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var2);
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
            nq7 k = tte.k(jsc.t(0.6666667f, pna.f(kq7Var3, 1.0f), false), r0f.z(rv4Var2).b);
            nk0 nk0Var2 = kh5.a;
            b37 d = fu0.d(nk0Var2, false);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, k);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var2);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar5, rv4Var2, d);
            jce.F(npVar6, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar7, rv4Var2, kgVar2);
            jce.F(npVar8, rv4Var2, p2);
            String str = r14Var2.a;
            String str2 = r14Var2.d;
            do5.d(str, r14Var2.b, r14Var2.e, r0f.d, pna.c, rv4Var2, 27648);
            int length = str2.length();
            pu0 pu0Var2 = pu0.a;
            if (length > 0) {
                rv4Var2.e0(2017488074);
                kgVar = kgVar2;
                npVar2 = npVar8;
                zx1Var = zx1Var2;
                npVar4 = npVar6;
                kq7Var2 = kq7Var3;
                npVar3 = npVar5;
                npVar = npVar7;
                pu0Var = pu0Var2;
                lk0Var = lk0Var2;
                cvb.c(str2, pu0Var2.a(zbe.z(nmd.v(zbe.y(kq7Var3, 4.0f), zl1.b(0.8f, zl1.b), r0f.z(rv4Var2).a), 4.0f, 2.0f), nk0Var2), zl1.e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).l, rv4Var, 384, 0, 131064);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                lk0Var = lk0Var2;
                kgVar = kgVar2;
                npVar = npVar7;
                npVar2 = npVar8;
                pu0Var = pu0Var2;
                kq7Var2 = kq7Var3;
                npVar3 = npVar5;
                npVar4 = npVar6;
                zx1Var = zx1Var2;
                rv4Var2.e0(2018044927);
                rv4Var2.q(false);
            }
            nq7 y = zbe.y(pu0Var.a(kq7Var2, kh5.C), 8.0f);
            abf abfVar = f27.a;
            xu9 xu9Var = f27.j;
            if (xu9Var == null) {
                nk0Var = nk0Var2;
                xu9Var = abf.n(abfVar, tl1.B(new e27((Float.floatToRawIntBits(1.096f) & 4294967295L) | (Float.floatToRawIntBits(0.5f) << 32), new x72(0.151f, 0.524f)), new e27((Float.floatToRawIntBits(0.5f) & 4294967295L) | (Float.floatToRawIntBits(0.04f) << 32), new x72(2, 0.159f))), 2, 12).b();
                f27.j = xu9Var;
            } else {
                nk0Var = nk0Var2;
            }
            nq7 n = pna.n(nmd.v(tte.k(y, aye.s(xu9Var, rv4Var2)), r0f.y(rv4Var2).a, lre.g), 40.0f);
            b37 d2 = fu0.d(nk0Var, false);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, n);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar3, rv4Var2, d2);
            jce.F(npVar4, rv4Var2, l3);
            kg kgVar3 = kgVar;
            np npVar9 = npVar;
            s21.t(hashCode3, rv4Var2, npVar9, rv4Var2, kgVar3);
            np npVar10 = npVar2;
            jce.F(npVar10, rv4Var2, p3);
            String valueOf2 = String.valueOf(i + 1);
            oyb oybVar = r0f.A(rv4Var2).e;
            dq4 dq4Var = dq4.D;
            cvb.c(valueOf2, pu0Var.a(kq7Var2, kh5.e), zl1.e, null, zr1.q(18), null, dq4Var, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, oybVar, rv4Var, 1597824, 0, 129960);
            xbe.i(rv4Var, hl5.e(rv4Var, true, true, kq7Var2, 4.0f));
            nq7 f = pna.f(kq7Var2, 1.0f);
            xn1 a3 = wn1.a(ezVar, lk0Var, rv4Var, 0);
            int hashCode4 = Long.hashCode(rv4Var.T);
            xt8 l4 = rv4Var.l();
            nq7 p4 = lye.p(rv4Var, f);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar3, rv4Var, a3);
            jce.F(npVar4, rv4Var, l4);
            s21.t(hashCode4, rv4Var, npVar9, rv4Var, kgVar3);
            jce.F(npVar10, rv4Var, p4);
            r14Var2 = r14Var;
            cvb.c(r14Var2.a, pna.f(kq7Var2, 1.0f), r0f.y(rv4Var).q, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, r0f.A(rv4Var).k, rv4Var, 48, 24960, 110584);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            rv4Var2.q(true);
            kq7Var = kq7Var2;
        } else {
            rv4Var2.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new n14(i, r14Var2, kq7Var, rg3Var, vt4Var, i2);
        }
    }

    public static final void p(int i, rv4 rv4Var, xy4 xy4Var, rq9 rq9Var, final rq9 rq9Var2, lid lidVar, final String str, final String str2, final String str3, final boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        final float f;
        rv4Var.g0(-2080043407);
        if (rv4Var.f(xy4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i10 = i | i2;
        if (rv4Var.f(lidVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i11 = i10 | i3;
        if (rv4Var.f(str)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i12 = i11 | i4;
        if (rv4Var.f(str2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i13 = i12 | i5;
        if (rv4Var.f(str3)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i14 = i13 | i6;
        if (rv4Var.g(z)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i15 = i14 | i7;
        if (rv4Var.f(rq9Var)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i16 = i15 | i8;
        if (rv4Var.f(rq9Var2)) {
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
        if (rv4Var.U(i17 & 1, z2)) {
            tza tzaVar = by1.e;
            final rq9 rq9Var3 = ((tm3) rv4Var.j(tzaVar)).g;
            final rq9 rq9Var4 = ((tm3) rv4Var.j(tzaVar)).h;
            final rq9 rq9Var5 = ((tm3) rv4Var.j(tzaVar)).c;
            final rq9 rq9Var6 = ((tm3) rv4Var.j(tzaVar)).d;
            if (z) {
                f = 16.0f;
            } else {
                f = 60.0f;
            }
            final float I = I(H(lidVar.a() - 80.0f, 68.0f), 96.0f);
            w92.b(xwe.k(hc2.h(aye.e(xy4Var, rq9Var), 28.0f), 16.0f), null, jce.E(-1655946541, new lu4() { // from class: nib
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    boolean z3;
                    rv4 rv4Var2 = (rv4) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z3)) {
                        xy4 r = s9e.r(vy4.a);
                        final float f2 = I;
                        final String str4 = str3;
                        final String str5 = str;
                        final rq9 rq9Var7 = rq9Var2;
                        final String str6 = str2;
                        final rq9 rq9Var8 = rq9Var3;
                        final rq9 rq9Var9 = rq9Var4;
                        final boolean z4 = z;
                        final rq9 rq9Var10 = rq9Var5;
                        final rq9 rq9Var11 = rq9Var6;
                        final float f3 = f;
                        kwe.b(r, 0, 1, jce.E(938278345, new mu4() { // from class: rib
                            @Override // defpackage.mu4
                            public final Object c(Object obj3, Object obj4, Object obj5) {
                                boolean z5;
                                boolean h;
                                int i18;
                                yn1 yn1Var = (yn1) obj3;
                                rv4 rv4Var3 = (rv4) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                yn1Var.getClass();
                                if ((intValue2 & 6) == 0) {
                                    if ((intValue2 & 8) == 0) {
                                        h = rv4Var3.f(yn1Var);
                                    } else {
                                        h = rv4Var3.h(yn1Var);
                                    }
                                    if (h) {
                                        i18 = 4;
                                    } else {
                                        i18 = 2;
                                    }
                                    intValue2 |= i18;
                                }
                                if ((intValue2 & 19) != 18) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (rv4Var3.U(intValue2 & 1, z5)) {
                                    xy4 s = s9e.s(new u55(u63.a));
                                    final float f4 = f2;
                                    final String str7 = str4;
                                    final String str8 = str5;
                                    final rq9 rq9Var12 = rq9Var7;
                                    final String str9 = str6;
                                    jue.y(s, 0, 1, jce.E(1813359917, new mu4() { // from class: vib
                                        @Override // defpackage.mu4
                                        public final Object c(Object obj6, Object obj7, Object obj8) {
                                            boolean z6;
                                            boolean h2;
                                            int i19;
                                            iv9 iv9Var = (iv9) obj6;
                                            rv4 rv4Var4 = (rv4) obj7;
                                            int intValue3 = ((Integer) obj8).intValue();
                                            iv9Var.getClass();
                                            if ((intValue3 & 6) == 0) {
                                                if ((intValue3 & 8) == 0) {
                                                    h2 = rv4Var4.f(iv9Var);
                                                } else {
                                                    h2 = rv4Var4.h(iv9Var);
                                                }
                                                if (h2) {
                                                    i19 = 4;
                                                } else {
                                                    i19 = 2;
                                                }
                                                intValue3 |= i19;
                                            }
                                            if ((intValue3 & 19) != 18) {
                                                z6 = true;
                                            } else {
                                                z6 = false;
                                            }
                                            if (rv4Var4.U(intValue3 & 1, z6)) {
                                                iue.a(s9e.w(f4), str7, 16.0f, rv4Var4, 384);
                                                ube.p(s9e.z(16.0f), rv4Var4, 0);
                                                kwe.b(iv9.a(), 0, 0, jce.E(841579171, new bib(str8, rq9Var12, str9, 2), rv4Var4), rv4Var4, 3072, 6);
                                            } else {
                                                rv4Var4.X();
                                            }
                                            return pvc.a;
                                        }
                                    }, rv4Var3), rv4Var3, 3072, 2);
                                    vy4 vy4Var = vy4.a;
                                    ube.p(s9e.t(vy4Var, 12.0f), rv4Var3, 0);
                                    jue.y(s9e.t(s9e.s(vy4Var), 64.0f), 0, 1, jce.E(-1617783004, new qib(rq9Var8, rq9Var9, z4, rq9Var10, rq9Var11, f3, 1), rv4Var3), rv4Var3, 3072, 2);
                                } else {
                                    rv4Var3.X();
                                }
                                return pvc.a;
                            }
                        }, rv4Var2), rv4Var2, 3072, 2);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, 384, 2);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new yhb(xy4Var, lidVar, str, str2, str3, z, rq9Var, rq9Var2, i);
        }
    }

    public static final void q(xy4 xy4Var, rq9 rq9Var, String str, boolean z, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        rv4Var.g0(974712268);
        if (rv4Var.f(xy4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.f(rq9Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var.f(str)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if (rv4Var.g(z)) {
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
            tza tzaVar = by1.e;
            w92.b(xwe.k(hc2.h(aye.e(xy4Var, rq9Var), 360.0f), 16.0f), null, jce.E(1983065646, new iib(str, ((tm3) rv4Var.j(tzaVar)).g, ((tm3) rv4Var.j(tzaVar)).h, z, ((tm3) rv4Var.j(tzaVar)).c, ((tm3) rv4Var.j(tzaVar)).d), rv4Var), rv4Var, 384, 2);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new jib(xy4Var, rq9Var, str, z, i, 0);
        }
    }

    public static final void r(xy4 xy4Var, rq9 rq9Var, String str, boolean z, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        rv4Var.g0(-1668059191);
        if (rv4Var.f(xy4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.f(rq9Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var.f(str)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if (rv4Var.g(z)) {
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
            tza tzaVar = by1.e;
            w92.b(xwe.k(hc2.h(aye.e(xy4Var, rq9Var), 60.0f), 16.0f), null, jce.E(1042185639, new iib(str, z, ((tm3) rv4Var.j(tzaVar)).c, ((tm3) rv4Var.j(tzaVar)).d, ((tm3) rv4Var.j(tzaVar)).g, ((tm3) rv4Var.j(tzaVar)).h), rv4Var), rv4Var, 384, 2);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new jib(xy4Var, rq9Var, str, z, i, 2);
        }
    }

    public static final void s(t14 t14Var, nq7 nq7Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        kq7 kq7Var;
        boolean z2;
        rv4Var.g0(890458239);
        if (rv4Var.h(t14Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2 | 48;
        if (rv4Var.h(xt4Var)) {
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
        if (rv4Var.U(i5 & 1, z)) {
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var, 0);
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
            int i6 = i5 & 14;
            int i7 = i5 & 896;
            B(t14Var, null, xt4Var, rv4Var, 8 | i6 | i7);
            nq7 f = pna.f(kq7Var2, 1.0f);
            boolean z3 = false;
            hz hzVar = new hz(8.0f, true, new vs(2));
            if (i6 != 4 && !rv4Var.h(t14Var)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i7 == 256) {
                z3 = true;
            }
            boolean z4 = z2 | z3;
            Object P = rv4Var.P();
            if (z4 || P == ax1.a) {
                P = new j14(t14Var, xt4Var, 2);
                rv4Var.o0(P);
            }
            kq7Var = kq7Var2;
            jce.e(f, null, null, false, hzVar, null, null, false, null, (xt4) P, rv4Var, 24582, 494);
            rv4Var.q(true);
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new k14(t14Var, kq7Var, xt4Var, i, 3);
        }
    }

    public static final void t(int i, rv4 rv4Var, xy4 xy4Var, rq9 rq9Var, rq9 rq9Var2, String str, String str2, String str3, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        float f;
        rv4Var.g0(215922432);
        if (rv4Var.f(xy4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (rv4Var.f(str)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if (rv4Var.f(str2)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i11 = i10 | i4;
        if (rv4Var.f(str3)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (rv4Var.f(rq9Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if (rv4Var.g(z)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i14 = i13 | i7;
        if (rv4Var.f(rq9Var2)) {
            i8 = 8388608;
        } else {
            i8 = 4194304;
        }
        int i15 = i14 | i8;
        if ((4793491 & i15) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i15 & 1, z2)) {
            tza tzaVar = by1.e;
            rq9 rq9Var3 = ((tm3) rv4Var.j(tzaVar)).g;
            rq9 rq9Var4 = ((tm3) rv4Var.j(tzaVar)).h;
            rq9 rq9Var5 = ((tm3) rv4Var.j(tzaVar)).c;
            rq9 rq9Var6 = ((tm3) rv4Var.j(tzaVar)).d;
            if (z) {
                f = 14.0f;
            } else {
                f = 60.0f;
            }
            w92.b(xwe.k(hc2.h(aye.e(xy4Var, rq9Var), 28.0f), 16.0f), null, jce.E(738601438, new eib(str3, str, rq9Var2, str2, rq9Var3, rq9Var4, z, rq9Var5, rq9Var6, f, 1), rv4Var), rv4Var, 384, 2);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new gib(xy4Var, str, str2, str3, rq9Var, z, rq9Var2, i);
        }
    }

    public static final void u(int i, rv4 rv4Var, xy4 xy4Var, rq9 rq9Var, rq9 rq9Var2, String str, String str2, String str3, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        float f;
        rv4Var.g0(-853982244);
        if (rv4Var.f(xy4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (rv4Var.f(str)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if (rv4Var.f(str2)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i11 = i10 | i4;
        if (rv4Var.f(rq9Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (rv4Var.f(str3)) {
            i6 = 131072;
        } else {
            i6 = Parser.ARGC_LIMIT;
        }
        int i13 = i12 | i6;
        if (rv4Var.g(z)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i14 = i13 | i7;
        if (rv4Var.f(rq9Var2)) {
            i8 = 8388608;
        } else {
            i8 = 4194304;
        }
        int i15 = i14 | i8;
        if ((4793491 & i15) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i15 & 1, z2)) {
            tza tzaVar = by1.e;
            rq9 rq9Var3 = ((tm3) rv4Var.j(tzaVar)).g;
            rq9 rq9Var4 = ((tm3) rv4Var.j(tzaVar)).h;
            rq9 rq9Var5 = ((tm3) rv4Var.j(tzaVar)).c;
            rq9 rq9Var6 = ((tm3) rv4Var.j(tzaVar)).d;
            if (z) {
                f = 14.0f;
            } else {
                f = 60.0f;
            }
            w92.b(xwe.k(hc2.h(aye.e(xy4Var, rq9Var), 28.0f), 16.0f), null, jce.E(-1830802242, new eib(str3, str, rq9Var2, str2, rq9Var3, rq9Var4, z, rq9Var5, rq9Var6, f, 0), rv4Var), rv4Var, 384, 2);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new gib(xy4Var, str, str2, rq9Var, str3, z, rq9Var2, i);
        }
    }

    public static final void v(xy4 xy4Var, nm1 nm1Var, nm1 nm1Var2, float f, float f2, rv4 rv4Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        rv4Var.g0(-490673597);
        if (rv4Var.f(xy4Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i3 | i;
        if (rv4Var.f(nm1Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (rv4Var.f(nm1Var2)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i9 = i8 | i5;
        int i10 = i2 & 16;
        if (i10 != 0) {
            i9 |= 24576;
        } else if ((i & 24576) == 0) {
            if (rv4Var.c(f2)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i9 |= i6;
        }
        if ((i9 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i9 & 1, z)) {
            if (i10 != 0) {
                f2 = 20.0f;
            }
            Context context = (Context) rv4Var.j(by1.b);
            Object P = rv4Var.P();
            if (P == ax1.a) {
                pv9 pv9Var = new pv9(TTSNextChapterAction.class, jce.z((q5[]) Arrays.copyOf(new q5[0], 0)));
                rv4Var.o0(pv9Var);
                P = pv9Var;
            }
            w92.b(hc2.h(aye.e(xy4Var, nm1Var), f).d(new o5((k5) P)), cc.d, jce.E(-2125686235, new cib(context, f2, nm1Var2, 0), rv4Var), rv4Var, 384, 0);
        } else {
            rv4Var.X();
        }
        float f3 = f2;
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new dib(xy4Var, nm1Var, nm1Var2, f, f3, i, i2, 0);
        }
    }

    public static final void w(xy4 xy4Var, lid lidVar, rq9 rq9Var, final String str, final boolean z, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        rv4Var.g0(-1440398011);
        if (rv4Var.f(xy4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var.f(lidVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (rv4Var.f(rq9Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i9 = i8 | i4;
        if (rv4Var.f(str)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i10 = i9 | i5;
        if (rv4Var.g(z)) {
            i6 = 131072;
        } else {
            i6 = Parser.ARGC_LIMIT;
        }
        int i11 = i10 | i6;
        if ((74899 & i11) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i11 & 1, z2)) {
            tza tzaVar = by1.e;
            final rq9 rq9Var2 = ((tm3) rv4Var.j(tzaVar)).c;
            final rq9 rq9Var3 = ((tm3) rv4Var.j(tzaVar)).d;
            final float I = I(H(((rg3) hxe.u(new rg3(H((ug3.b(lidVar.a) - 16.0f) - 16.0f, 24.0f)), new rg3(lidVar.a()))).a, 24.0f), 56.0f);
            final float I2 = I(H(I - 16.0f, 18.0f), 36.0f);
            w92.b(xwe.k(hc2.h(aye.e(xy4Var, rq9Var), 60.0f), 16.0f), cc.d, jce.E(661188903, new lu4() { // from class: lib
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    boolean z3;
                    rv4 rv4Var2 = (rv4) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z3)) {
                        iue.a(s9e.r(vy4.a), str, 60.0f, rv4Var2, 0);
                        float f = I;
                        iue.y(s9e.w(f), z, rq9Var2, rq9Var3, iue.I(f, 30.0f), I2, rv4Var2, 0, 0);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, 384, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new b62(xy4Var, lidVar, rq9Var, str, z, i);
        }
    }

    public static final void x(nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        int i3;
        rv4Var.g0(-836460119);
        if ((i & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            xn1 a2 = wn1.a(new hz(6.0f, true, new vs(2)), kh5.I, rv4Var, 6);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, nq7Var);
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
            kq7 kq7Var = kq7.a;
            dpe.f(null, tte.k(jsc.t(0.6666667f, pna.f(kq7Var, 1.0f), false), ((h27) rv4Var.j(j27.a)).c.b), rv4Var, 0, 1);
            dpe.g(pna.h(pna.f(kq7Var, 0.8f), 14.0f), null, rv4Var, 6, 2);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new sh(nq7Var, i, 4, (byte) 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void y(final defpackage.xy4 r16, final boolean r17, final defpackage.nm1 r18, final defpackage.nm1 r19, final float r20, float r21, defpackage.rv4 r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iue.y(xy4, boolean, nm1, nm1, float, float, rv4, int, int):void");
    }

    public static final void z(xy4 xy4Var, nm1 nm1Var, nm1 nm1Var2, float f, float f2, rv4 rv4Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        float f3;
        float f4;
        rv4Var.g0(-2061697721);
        if (rv4Var.f(xy4Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i3 | i;
        if (rv4Var.f(nm1Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (rv4Var.f(nm1Var2)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i9 = i8 | i5;
        int i10 = i2 & 16;
        if (i10 != 0) {
            i9 |= 24576;
        } else if ((i & 24576) == 0) {
            if (rv4Var.c(f2)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i9 |= i6;
        }
        if ((i9 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i9 & 1, z)) {
            if (i10 != 0) {
                f4 = 20.0f;
            } else {
                f4 = f2;
            }
            Context context = (Context) rv4Var.j(by1.b);
            Object P = rv4Var.P();
            if (P == ax1.a) {
                pv9 pv9Var = new pv9(TTSPreviousChapterAction.class, jce.z((q5[]) Arrays.copyOf(new q5[0], 0)));
                rv4Var.o0(pv9Var);
                P = pv9Var;
            }
            w92.b(hc2.h(aye.e(xy4Var, nm1Var), f).d(new o5((k5) P)), cc.d, jce.E(-1800803287, new cib(context, f4, nm1Var2, 1), rv4Var), rv4Var, 384, 0);
            f3 = f4;
        } else {
            rv4Var.X();
            f3 = f2;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new dib(xy4Var, nm1Var, nm1Var2, f, f3, i, i2, 1);
        }
    }
}
