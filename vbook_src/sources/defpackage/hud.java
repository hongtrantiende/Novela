package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hud  reason: default package */
/* loaded from: classes.dex */
public final class hud implements tcd {
    public static final tu1 b = new tu1(new cv1(24), false, -816668539);
    public static final tu1 c = new tu1(new cv1(25), false, -373907730);
    public static final tu1 d = new tu1(new cv1(26), false, -801177459);
    public static final tu1 e = new tu1(new xu1(12), false, 1993895274);
    public static final tu1 f = new tu1(new wu1(11), false, 1620020791);
    public final /* synthetic */ int a;

    public /* synthetic */ hud(int i) {
        this.a = i;
    }

    public static final void a(List list, bkd bkdVar, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        kq7 kq7Var;
        boolean z2;
        boolean z3;
        hz hzVar;
        rv4Var.g0(-1040364568);
        if (rv4Var.f(list)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.f(bkdVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3 | 384;
        if (rv4Var.h(xt4Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if (rv4Var.h(xt4Var2)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i9 = i8 | i5;
        boolean z4 = true;
        if ((i9 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i9 & 1, z)) {
            if ((i9 & 14) != 4) {
                z2 = false;
            } else {
                z2 = true;
            }
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (z2 || P == obj) {
                P = yae.z(list);
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            qg6 a = tg6.a(0, 3, rv4Var);
            boolean f2 = rv4Var.f(aw7Var);
            Object P2 = rv4Var.P();
            if (f2 || P2 == obj) {
                P2 = new rr3(aw7Var, null, 0);
                rv4Var.o0(P2);
            }
            qo9 o = rqe.o(a, bkdVar, (nu4) P2, rv4Var, i9 & Token.ASSIGN_MOD);
            f25 f25Var = new f25(320.0f);
            hz hzVar2 = new hz(8.0f, true, new vs(2));
            hz hzVar3 = new hz(8.0f, true, new vs(2));
            boolean f3 = rv4Var.f(aw7Var) | rv4Var.f(o);
            if ((i9 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = f3 | z3;
            if ((57344 & i9) != 16384) {
                z4 = false;
            }
            boolean z6 = z5 | z4;
            Object P3 = rv4Var.P();
            if (!z6 && P3 != obj) {
                hzVar = hzVar3;
            } else {
                hzVar = hzVar3;
                Object lr3Var = new lr3(aw7Var, o, xt4Var, xt4Var2, 0);
                rv4Var.o0(lr3Var);
                P3 = lr3Var;
            }
            hz hzVar4 = hzVar;
            kq7 kq7Var2 = kq7.a;
            ade.e(f25Var, kq7Var2, a, bkdVar, hzVar2, hzVar4, null, false, null, (xt4) P3, rv4Var, ((i9 << 6) & 7168) | 1769520, 0, 912);
            kq7Var = kq7Var2;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new wp0(list, bkdVar, kq7Var, xt4Var, xt4Var2, i, 4);
        }
    }

    public static final void b(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        pb2 pb2Var;
        aw7 aw7Var;
        cz7Var.getClass();
        rv4Var.g0(2108929514);
        if (rv4Var.f(cz7Var)) {
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
            sdd a = kv6.a(rv4Var);
            if (a != null) {
                if (a instanceof y35) {
                    pb2Var = ((y35) a).f();
                } else {
                    pb2Var = ob2.b;
                }
                zq3 zq3Var = (zq3) ((fdd) voe.z(cm9.a(zq3.class), a.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z2 = jsc.z(zq3Var.d, rv4Var);
                Object P = rv4Var.P();
                Object obj = ax1.a;
                if (P == obj) {
                    P = yae.z(Boolean.FALSE);
                    rv4Var.o0(P);
                }
                aw7 aw7Var2 = (aw7) P;
                kb kbVar = (kb) rv4Var.j(yb.a);
                s02 s02Var = zq3Var.e;
                boolean f2 = rv4Var.f(kbVar);
                Object P2 = rv4Var.P();
                if (f2 || P2 == obj) {
                    P2 = new wa(8, kbVar, (m42) null);
                    rv4Var.o0(P2);
                }
                jye.b(s02Var, null, (mu4) P2, rv4Var, 0);
                fxe.h(yqe.A((y3b) o2b.f0.getValue(), rv4Var), pna.c, false, jce.E(819212390, new p7(cz7Var, 24), rv4Var), null, jce.E(-23616341, new mr3(aw7Var2, 0), rv4Var), jce.E(-1766293579, new u32(11, zq3Var, z2), rv4Var), rv4Var, 1772592, 20);
                boolean booleanValue = ((Boolean) aw7Var2.getValue()).booleanValue();
                Object P3 = rv4Var.P();
                if (P3 == obj) {
                    aw7Var = aw7Var2;
                    P3 = new zn3(aw7Var, 4);
                    rv4Var.o0(P3);
                } else {
                    aw7Var = aw7Var2;
                }
                xt4 xt4Var = (xt4) P3;
                boolean f3 = rv4Var.f(zq3Var);
                Object P4 = rv4Var.P();
                if (f3 || P4 == obj) {
                    P4 = new qk2(25, zq3Var, aw7Var);
                    rv4Var.o0(P4);
                }
                e(booleanValue, xt4Var, (xt4) P4, rv4Var, 48);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new p7(cz7Var, i, 25);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.ps r20, boolean r21, final defpackage.oyb r22, int r23, int r24, int r25, int r26, defpackage.nq7 r27, defpackage.xt4 r28, defpackage.xt4 r29, defpackage.lu4 r30, defpackage.rv4 r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hud.c(ps, boolean, oyb, int, int, int, int, nq7, xt4, xt4, lu4, rv4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:196:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.ps r50, boolean r51, final defpackage.oyb r52, int r53, int r54, final int r55, final int r56, final defpackage.nq7 r57, final float r58, defpackage.xt4 r59, defpackage.xt4 r60, defpackage.lu4 r61, defpackage.rv4 r62, final int r63, final int r64) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hud.d(ps, boolean, oyb, int, int, int, int, nq7, float, xt4, xt4, lu4, rv4, int, int):void");
    }

    public static final void e(boolean z, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z2;
        rv4Var.g0(646613646);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var.h(xt4Var2)) {
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
            Object[] objArr = new Object[0];
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = new qk3(20);
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) zpe.k(objArr, (vt4) P, rv4Var, 48);
            xb.d(z, xt4Var, jce.E(1662919650, new or3(0, xt4Var2, aw7Var), rv4Var), null, mwe.x(kq7.a, 14), jce.E(213421541, new id1(xt4Var, 2, (byte) 0), rv4Var), rse.d, null, 0L, 0L, nae.e, false, false, jce.E(1246622778, new sp0(aw7Var, 3), rv4Var), rv4Var, (i5 & 14) | 1769904, 8072);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new kr3(z, xt4Var, xt4Var2, i, 0);
        }
    }

    public static final void f(String str, String str2, boolean z, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        rv4 rv4Var2;
        float f2;
        rv4Var.g0(418675071);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i2 | i;
        if (rv4Var.f(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var.g(z)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if (rv4Var.f(nq7Var)) {
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
            if (z) {
                f2 = 132.0f;
            } else {
                f2 = 112.0f;
            }
            rv4Var2 = rv4Var;
            hc2.b(pna.n(nq7Var, f2), kh5.e, jce.E(-475460651, new a1a(z, str, str2, 1), rv4Var), rv4Var2, 3120, 4);
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new rd0(str, str2, z, nq7Var, i, 17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final xu9 g(float[] fArr, x72 x72Var, AbstractList abstractList, float f2, float f3) {
        float f4;
        long k;
        boolean z;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        List A;
        float f5;
        float f6;
        int i2;
        float f7;
        float f8;
        qd2 a;
        yk8 yk8Var;
        x72 x72Var2;
        x72 x72Var3;
        float f9 = 1.0f;
        Float valueOf = Float.valueOf(1.0f);
        x72Var.getClass();
        xu9 xu9Var = null;
        if (fArr.length >= 6) {
            int i3 = 2;
            int i4 = 1;
            if (fArr.length % 2 != 1) {
                if (abstractList != null && abstractList.size() * 2 != fArr.length) {
                    vs.m("perVertexRounding list should be either null or the same size as the number of vertices (vertices.size / 2)");
                    return null;
                }
                ArrayList arrayList3 = new ArrayList();
                int length = fArr.length / 2;
                ArrayList arrayList4 = new ArrayList();
                int i5 = 0;
                int i6 = 0;
                while (i6 < length) {
                    if (abstractList != null && (x72Var3 = (x72) abstractList.get(i6)) != null) {
                        x72Var2 = x72Var3;
                    } else {
                        x72Var2 = x72Var;
                    }
                    int i7 = (((i6 + length) - 1) % length) * 2;
                    int i8 = i6 + 1;
                    int i9 = (i8 % length) * 2;
                    int i10 = i6 * 2;
                    arrayList4.add(new qu9(wi4.a(fArr[i7], fArr[i7 + 1]), wi4.a(fArr[i10], fArr[i10 + 1]), wi4.a(fArr[i9], fArr[i9 + 1]), x72Var2));
                    i6 = i8;
                    f9 = f9;
                }
                float f10 = f9;
                ty5 F = dce.F(0, length);
                ArrayList arrayList5 = new ArrayList(tl1.s(F, 10));
                Iterator it = F.iterator();
                while (true) {
                    sy5 sy5Var = (sy5) it;
                    boolean z2 = sy5Var.c;
                    f4 = nae.e;
                    if (!z2) {
                        break;
                    }
                    int nextInt = sy5Var.nextInt();
                    int i11 = (nextInt + 1) % length;
                    float f11 = ((qu9) arrayList4.get(nextInt)).h + ((qu9) arrayList4.get(i11)).h;
                    float c2 = ((qu9) arrayList4.get(i11)).c() + ((qu9) arrayList4.get(nextInt)).c();
                    int i12 = nextInt * 2;
                    float f12 = fArr[i12];
                    float f13 = fArr[i12 + 1];
                    int i13 = i11 * 2;
                    float f14 = f12 - fArr[i13];
                    float f15 = f13 - fArr[i13 + 1];
                    float f16 = d2d.b;
                    float sqrt = (float) Math.sqrt((f15 * f15) + (f14 * f14));
                    if (f11 > sqrt) {
                        yk8Var = new yk8(Float.valueOf(sqrt / f11), Float.valueOf((float) nae.e));
                    } else if (c2 > sqrt) {
                        yk8Var = new yk8(valueOf, Float.valueOf((sqrt - f11) / (c2 - f11)));
                    } else {
                        yk8Var = new yk8(valueOf, valueOf);
                    }
                    arrayList5.add(yk8Var);
                }
                for (int i14 = 0; i14 < length; i14 = i + 1) {
                    float[] fArr2 = new float[i3];
                    int i15 = i5;
                    int i16 = i15;
                    while (i15 < i3) {
                        xu9 xu9Var2 = xu9Var;
                        yk8 yk8Var2 = (yk8) arrayList5.get((((i14 + length) - 1) + i15) % length);
                        int i17 = i5;
                        float f17 = f4;
                        int i18 = i3;
                        float c3 = a82.c(((qu9) arrayList4.get(i14)).c(), ((qu9) arrayList4.get(i14)).h, ((Number) yk8Var2.b).floatValue(), ((qu9) arrayList4.get(i14)).h * ((Number) yk8Var2.a).floatValue());
                        int i19 = i16 + 1;
                        if (fArr2.length < i19) {
                            fArr2 = Arrays.copyOf(fArr2, Math.max(i19, (fArr2.length * 3) / 2));
                        }
                        fArr2[i16] = c3;
                        i15++;
                        f4 = f17;
                        i16 = i19;
                        i5 = i17;
                        xu9Var = xu9Var2;
                        i3 = i18;
                    }
                    int i20 = i3;
                    xu9 xu9Var3 = xu9Var;
                    int i21 = i5;
                    float f18 = f4;
                    qu9 qu9Var = (qu9) arrayList4.get(i14);
                    if (i16 > 0) {
                        float f19 = fArr2[i21];
                        if (i4 < i16) {
                            float f20 = fArr2[i4];
                            long j = qu9Var.e;
                            long j2 = qu9Var.d;
                            int i22 = i4;
                            float f21 = qu9Var.f;
                            ArrayList arrayList6 = arrayList3;
                            long j3 = qu9Var.b;
                            float min = Math.min(f19, f20);
                            float f22 = qu9Var.h;
                            if (f22 < 1.0E-4f || min < 1.0E-4f || f21 < 1.0E-4f) {
                                i = i14;
                                arrayList = arrayList5;
                                arrayList2 = arrayList4;
                                qu9Var.i = j3;
                                float i23 = nc2.i(j3);
                                float j4 = nc2.j(j3);
                                float i24 = nc2.i(j3);
                                float j5 = nc2.j(j3);
                                A = tl1.A(w9e.a(i23, j4, d2d.b(i23, i24, 0.33333334f), d2d.b(j4, j5, 0.33333334f), d2d.b(i23, i24, 0.6666667f), d2d.b(j4, j5, 0.6666667f), i24, j5));
                            } else {
                                float min2 = Math.min(min, f22);
                                float a2 = qu9Var.a(f19);
                                float a3 = qu9Var.a(f20);
                                float f23 = (f21 * min2) / f22;
                                float f24 = d2d.b;
                                int i25 = i14;
                                float sqrt2 = (float) Math.sqrt((min2 * min2) + (f23 * f23));
                                arrayList = arrayList5;
                                long e2 = nc2.e(2.0f, nc2.m(j2, j));
                                float h = nc2.h(e2);
                                if (h > f18) {
                                    qu9Var.i = nc2.m(j3, nc2.p(sqrt2, nc2.e(h, e2)));
                                    long m = nc2.m(j3, nc2.p(min2, j2));
                                    long m2 = nc2.m(j3, nc2.p(min2, j));
                                    qd2 b2 = qu9.b(min2, a2, qu9Var.b, qu9Var.a, m, m2, qu9Var.i, f23);
                                    qd2 b3 = qu9.b(min2, a3, qu9Var.b, qu9Var.c, m2, m, qu9Var.i, f23);
                                    float a4 = b3.a();
                                    float b4 = b3.b();
                                    float[] fArr3 = b3.a;
                                    qd2 a5 = w9e.a(a4, b4, fArr3[4], fArr3[5], fArr3[i20], fArr3[3], fArr3[i21], fArr3[i22]);
                                    float i26 = nc2.i(qu9Var.i);
                                    float j6 = nc2.j(qu9Var.i);
                                    float a6 = b2.a();
                                    float b5 = b2.b();
                                    float[] fArr4 = a5.a;
                                    float f25 = fArr4[i21];
                                    float f26 = fArr4[i22];
                                    long a7 = d2d.a(a6 - i26, b5 - j6);
                                    float f27 = f25 - i26;
                                    float f28 = f26 - j6;
                                    arrayList2 = arrayList4;
                                    i = i25;
                                    long a8 = d2d.a(f27, f28);
                                    long a9 = wi4.a(-nc2.j(a7), nc2.i(a7));
                                    long a10 = wi4.a(-nc2.j(a8), nc2.i(a8));
                                    if ((nc2.j(a9) * f28) + (nc2.i(a9) * f27) >= f18) {
                                        i2 = i22;
                                    } else {
                                        i2 = i21;
                                    }
                                    float f29 = nc2.f(a7, a8);
                                    if (f29 > 0.999f) {
                                        a = w9e.a(a6, b5, d2d.b(a6, f25, 0.33333334f), d2d.b(b5, f26, 0.33333334f), d2d.b(a6, f25, 0.6666667f), d2d.b(b5, f26, 0.6666667f), f25, f26);
                                    } else {
                                        float sqrt3 = ((((float) Math.sqrt(2.0f * f7)) - ((float) Math.sqrt(f10 - (f29 * f29)))) * ((((float) Math.sqrt((f6 * f6) + (f5 * f5))) * 4.0f) / 3.0f)) / (f10 - f29);
                                        if (i2 != 0) {
                                            f8 = f10;
                                        } else {
                                            f8 = -1.0f;
                                        }
                                        float f30 = sqrt3 * f8;
                                        a = w9e.a(a6, b5, (nc2.i(a9) * f30) + a6, (nc2.j(a9) * f30) + b5, f25 - (nc2.i(a10) * f30), f26 - (nc2.j(a10) * f30), f25, f26);
                                    }
                                    A = tl1.B(b2, a, a5);
                                } else {
                                    vs.m("Can't get the direction of a 0-length vector");
                                    return xu9Var3;
                                }
                            }
                            arrayList6.add(A);
                            f4 = f18;
                            arrayList3 = arrayList6;
                            arrayList5 = arrayList;
                            arrayList4 = arrayList2;
                            i5 = i21;
                            xu9Var = xu9Var3;
                            i4 = i22;
                            i3 = i20;
                        } else {
                            cy7.k("Index must be between 0 and size");
                            return xu9Var3;
                        }
                    } else {
                        cy7.k("Index must be between 0 and size");
                        return xu9Var3;
                    }
                }
                ArrayList arrayList7 = arrayList3;
                int i27 = i3;
                xu9 xu9Var4 = xu9Var;
                int i28 = i4;
                int i29 = i5;
                float f31 = f4;
                ArrayList arrayList8 = new ArrayList();
                int i30 = i29;
                while (i30 < length) {
                    int i31 = i30 + 1;
                    int i32 = i31 % length;
                    int i33 = i30 * 2;
                    long a11 = wi4.a(fArr[i33], fArr[i33 + 1]);
                    int i34 = (((i30 + length) - 1) % length) * 2;
                    long a12 = wi4.a(fArr[i34], fArr[i34 + 1]);
                    int i35 = i32 * 2;
                    long a13 = wi4.a(fArr[i35], fArr[i35 + 1]);
                    float f32 = d2d.b;
                    long l = nc2.l(a11, a12);
                    long l2 = nc2.l(a13, a11);
                    if ((nc2.j(l2) * nc2.i(l)) - (nc2.i(l2) * nc2.j(l)) > f31) {
                        z = i28;
                    } else {
                        z = i29;
                    }
                    arrayList8.add(new jb4((List) arrayList7.get(i30), z));
                    float a14 = ((qd2) sl1.j0((List) arrayList7.get(i30))).a();
                    float b6 = ((qd2) sl1.j0((List) arrayList7.get(i30))).b();
                    float f33 = ((qd2) sl1.c0((List) arrayList7.get(i32))).a[i29];
                    float f34 = ((qd2) sl1.c0((List) arrayList7.get(i32))).a[i28];
                    arrayList8.add(new ob4(tl1.A(w9e.a(a14, b6, d2d.b(a14, f33, 0.33333334f), d2d.b(b6, f34, 0.33333334f), d2d.b(a14, f33, 0.6666667f), d2d.b(b6, f34, 0.6666667f), f33, f34))));
                    i30 = i31;
                }
                if (f2 == Float.MIN_VALUE || f3 == Float.MIN_VALUE) {
                    k = k(fArr);
                } else {
                    k = wi4.a(f2, f3);
                }
                float intBitsToFloat = Float.intBitsToFloat((int) (k >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (k & 4294967295L));
                if (arrayList8.size() >= i27) {
                    jq6 t = tl1.t();
                    int size = arrayList8.size();
                    int i36 = i29;
                    while (i36 < size) {
                        Object obj = arrayList8.get(i36);
                        i36++;
                        for (qd2 qd2Var : ((ob4) obj).a) {
                            t.add(Float.valueOf(qd2Var.a[i29]));
                            t.add(Float.valueOf(qd2Var.a[i28]));
                        }
                    }
                    float[] z0 = sl1.z0(tl1.r(t));
                    if (Float.isNaN(intBitsToFloat)) {
                        intBitsToFloat = Float.intBitsToFloat((int) (k(z0) >> 32));
                    }
                    if (Float.isNaN(intBitsToFloat2)) {
                        intBitsToFloat2 = Float.intBitsToFloat((int) (k(z0) & 4294967295L));
                    }
                    return new xu9(arrayList8, wi4.a(intBitsToFloat, intBitsToFloat2));
                }
                vs.m("Polygons must have at least 2 features");
                return xu9Var4;
            }
            vs.m("The vertices array should have even size");
            return null;
        }
        vs.m("Polygons must have at least 3 vertices");
        return null;
    }

    public static final void h(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        cz7 cz7Var2;
        pb2 pb2Var;
        pb2 pb2Var2;
        cz7Var.getClass();
        rv4Var.g0(-594083339);
        if (rv4Var.f(cz7Var)) {
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
            sdd sddVar = (sdd) rv4Var.j(idd.b);
            if (sddVar == null) {
                rv4Var.e0(1368428688);
                sddVar = kv6.a(rv4Var);
            } else {
                rv4Var.e0(1368426673);
            }
            rv4Var.q(false);
            if (sddVar != null) {
                if (sddVar instanceof y35) {
                    pb2Var = ((y35) sddVar).f();
                } else {
                    pb2Var = ob2.b;
                }
                d1d d1dVar = (d1d) ((fdd) voe.z(cm9.a(d1d.class), sddVar.i(), null, pb2Var, o96.a(rv4Var), null));
                sdd a = kv6.a(rv4Var);
                if (a != null) {
                    if (a instanceof y35) {
                        pb2Var2 = ((y35) a).f();
                    } else {
                        pb2Var2 = ob2.b;
                    }
                    yda ydaVar = (yda) ((fdd) voe.z(cm9.a(yda.class), a.i(), null, pb2Var2, o96.a(rv4Var), null));
                    cz7Var2 = cz7Var;
                    fxe.i(jue.J(pna.c), jce.E(-589073897, new g83(cz7Var2, jsc.z(d1dVar.f, rv4Var), jsc.z(ydaVar.d, rv4Var), ydaVar, 6), rv4Var), rv4Var, 48);
                } else {
                    vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalRootViewModelStoreOwner or LocalViewModelStoreOwner");
                return;
            }
        } else {
            cz7Var2 = cz7Var;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ri9(cz7Var2, i, 2);
        }
    }

    public static final void i(y0d y0dVar, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        float f2;
        float f3;
        int i6;
        List list;
        kq7 kq7Var;
        rv4 rv4Var2 = rv4Var;
        ba5 ba5Var = lre.g;
        lk0 lk0Var = kh5.J;
        rv4Var2.g0(1481152358);
        if (rv4Var2.h(y0dVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var2.h(vt4Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i8 = i7 | i3;
        if (rv4Var2.h(vt4Var2)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i9 = i8 | i4;
        if (rv4Var2.h(vt4Var3)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i10 = i9 | i5;
        if ((i10 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i10 & 1, z)) {
            boolean z2 = y0dVar.a;
            String str = y0dVar.c;
            List<String> list2 = y0dVar.e;
            kq7 kq7Var2 = kq7.a;
            ez ezVar = lz.c;
            if (z2) {
                rv4Var2.e0(-1483840470);
                boolean f4 = rv4Var2.f(list2);
                Object P = rv4Var2.P();
                lh9 lh9Var = ax1.a;
                ArrayList arrayList = P;
                if (f4 || P == lh9Var) {
                    ArrayList arrayList2 = new ArrayList(tl1.s(list2, 10));
                    for (String str2 : list2) {
                        arrayList2.add(new zl1(kve.v(str2)));
                    }
                    rv4Var2.o0(arrayList2);
                    arrayList = arrayList2;
                }
                List list3 = (List) arrayList;
                xn1 a = wn1.a(ezVar, lk0Var, rv4Var2, 48);
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
                jce.F(qw1.f, rv4Var2, a);
                jce.F(qw1.e, rv4Var2, l);
                jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
                jce.C(qw1.h, rv4Var2);
                jce.F(qw1.d, rv4Var2, p);
                float f5 = 12.0f;
                xbe.i(rv4Var2, pna.h(kq7Var2, 12.0f));
                String str3 = y0dVar.h;
                boolean z3 = y0dVar.f;
                Object P2 = rv4Var2.P();
                if (P2 == lh9Var) {
                    i6 = 15;
                    P2 = new cd1(15);
                    rv4Var2.o0(P2);
                } else {
                    i6 = 15;
                }
                f(str3, str, z3, lbe.f(i6, (vt4) P2, kq7Var2, null, false), rv4Var2, 0);
                if (y0dVar.f) {
                    s21.w(rv4Var2, -2091253708, kq7Var2, 10.0f, rv4Var2);
                    oyb oybVar = ((h27) rv4Var2.j(j27.a)).b.n;
                    dq4 dq4Var = dq4.E;
                    long d2 = sve.d(4285352991L);
                    su9 su9Var = uu9.a;
                    list = list3;
                    kq7Var = kq7Var2;
                    f5 = 12.0f;
                    cvb.c("PREMIUM", zbe.z(st0.d(nmd.v(tte.k(kq7Var2, su9Var), sve.d(4294959234L), ba5Var), 1.0f, sve.d(4294964164L), su9Var), 14.0f, 5.0f), d2, null, 0L, null, dq4Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var, 1573254, 0, 131000);
                    rv4Var2 = rv4Var;
                    rv4Var2.q(false);
                } else {
                    list = list3;
                    kq7Var = kq7Var2;
                    rv4Var2.e0(-2090553139);
                    rv4Var2.q(false);
                }
                xbe.i(rv4Var2, pna.h(kq7Var, f5));
                ipe.g(str, l0e.u(pna.f(kq7Var, 1.0f)), list, 0L, 0L, new tlb(3), 0L, 0, false, 1, 0, r0f.A(rv4Var2).e, rv4Var, 48, 3072, 56824);
                cvb.c(y0dVar.d, pna.f(kq7Var, 1.0f), r0f.y(rv4Var).s, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 1, 0, null, r0f.A(rv4Var).k, rv4Var, 48, 24576, 113656);
                xbe.i(rv4Var, pna.h(kq7Var, f5));
                String A = yqe.A((y3b) v1b.b.getValue(), rv4Var);
                oyb oybVar2 = r0f.A(rv4Var).k;
                long j = r0f.y(rv4Var).s;
                su9 su9Var2 = uu9.a;
                cvb.c(A, zbe.z(st0.d(lbe.f(15, vt4Var3, tte.k(kq7Var, su9Var2), null, false), 1.0f, r0f.y(rv4Var).s, su9Var2), 16.0f, 6.0f), j, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 1, 0, null, oybVar2, rv4Var, 0, 24576, 113656);
                rv4Var2 = rv4Var;
                rv4Var2.q(true);
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(-1481161264);
                xn1 a2 = wn1.a(ezVar, lk0Var, rv4Var2, 48);
                int hashCode2 = Long.hashCode(rv4Var2.T);
                xt8 l2 = rv4Var2.l();
                nq7 p2 = lye.p(rv4Var2, nq7Var);
                rw1.k.getClass();
                zx1 zx1Var2 = qw1.b;
                rv4Var2.i0();
                if (rv4Var2.S) {
                    rv4Var2.k(zx1Var2);
                } else {
                    rv4Var2.r0();
                }
                np npVar = qw1.f;
                jce.F(npVar, rv4Var2, a2);
                np npVar2 = qw1.e;
                jce.F(npVar2, rv4Var2, l2);
                Integer valueOf = Integer.valueOf(hashCode2);
                np npVar3 = qw1.g;
                jce.F(npVar3, rv4Var2, valueOf);
                kg kgVar = qw1.h;
                jce.C(kgVar, rv4Var2);
                np npVar4 = qw1.d;
                jce.F(npVar4, rv4Var2, p2);
                xbe.i(rv4Var2, pna.h(kq7Var2, 12.0f));
                nq7 v = nmd.v(tte.k(pna.n(kq7Var2, 80.0f), uu9.a), ((h27) rv4Var2.j(j27.a)).a.a, ba5Var);
                b37 d3 = fu0.d(kh5.a, false);
                int hashCode3 = Long.hashCode(rv4Var2.T);
                xt8 l3 = rv4Var2.l();
                nq7 p3 = lye.p(rv4Var2, v);
                rv4Var2.i0();
                if (rv4Var2.S) {
                    rv4Var2.k(zx1Var2);
                } else {
                    rv4Var2.r0();
                }
                jce.F(npVar, rv4Var2, d3);
                jce.F(npVar2, rv4Var2, l3);
                s21.t(hashCode3, rv4Var2, npVar3, rv4Var2, kgVar);
                jce.F(npVar4, rv4Var2, p3);
                dxe.h(rp5.b((wk3) ok3.C.getValue(), rv4Var2, 0), null, pna.c, null, null, nae.e, null, rv4Var, 440, 120);
                rv4Var2 = rv4Var;
                rs8.u(rv4Var2, true, kq7Var2, 12.0f, rv4Var2);
                nq7 A2 = zbe.A(pna.f(kq7Var2, 1.0f), 16.0f, nae.e, 2);
                gv9 a3 = ev9.a(lz.a, kh5.F, rv4Var2, 0);
                int hashCode4 = Long.hashCode(rv4Var2.T);
                xt8 l4 = rv4Var2.l();
                nq7 p4 = lye.p(rv4Var2, A2);
                rv4Var2.i0();
                if (rv4Var2.S) {
                    rv4Var2.k(zx1Var2);
                } else {
                    rv4Var2.r0();
                }
                jce.F(npVar, rv4Var2, a3);
                jce.F(npVar2, rv4Var2, l4);
                s21.t(hashCode4, rv4Var2, npVar3, rv4Var2, kgVar);
                jce.F(npVar4, rv4Var2, p4);
                String A3 = yqe.A((y3b) x2b.N.getValue(), rv4Var2);
                if (1.0f <= 0.0d) {
                    jv5.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f2 = Float.MAX_VALUE;
                } else {
                    f2 = 1.0f;
                }
                z1d.f(null, A3, false, null, zbe.A(new we6(f2, true), 6.0f, nae.e, 2), null, null, null, vt4Var, rv4Var2, (i10 << 18) & 234881024, 237);
                String A4 = yqe.A((y3b) b3b.A.getValue(), rv4Var2);
                if (1.0f <= 0.0d) {
                    jv5.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f3 = Float.MAX_VALUE;
                } else {
                    f3 = 1.0f;
                }
                z1d.f(null, A4, false, null, zbe.A(new we6(f3, true), 6.0f, nae.e, 2), null, null, null, vt4Var2, rv4Var2, (i10 << 15) & 234881024, 237);
                hl5.v(rv4Var2, true, true, false);
            }
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new wp0(y0dVar, nq7Var, vt4Var, vt4Var2, vt4Var3, i, 24);
        }
    }

    public static final long k(float[] fArr) {
        float f2 = nae.e;
        int i = 0;
        float f3 = 0.0f;
        while (i < fArr.length) {
            int i2 = i + 1;
            f2 += fArr[i];
            i += 2;
            f3 += fArr[i2];
        }
        return wi4.a(f2 / (fArr.length / 2), f3 / (fArr.length / 2));
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static final rm m(vfb vfbVar) {
        vfbVar.getClass();
        rm rmVar = vfbVar.a;
        if (rmVar != null && rmVar.b) {
            return rmVar;
        }
        return null;
    }

    public static final uv5 n(String str, oyb oybVar, r13 r13Var, uvb uvbVar) {
        long j = uvb.a(uvbVar, str, oybVar, 0L, 1020).c;
        return new uv5(new pw8(r13Var.P(r13Var.y0((int) (j >> 32)) + 12.0f), r13Var.P(((rg3) hxe.s(new rg3(r13Var.y0((int) (j & 4294967295L))), new rg3(20.0f))).a), 4), new tu1(new vc5(str, oybVar, 0), true, -604344154));
    }

    public static final void o(zj3 zj3Var) {
        if (((mq7) zj3Var).a.J) {
            voe.s(zj3Var, 1).L1();
        }
    }

    public static final long p(rv4 rv4Var) {
        float f2;
        long j = ((h27) rv4Var.j(j27.a)).a.G;
        if (((om3) rv4Var.j(nm3.a)).d()) {
            f2 = 0.28f;
        } else {
            f2 = 0.38f;
        }
        return zl1.b(f2, j);
    }

    public static final moc q(String str) {
        int i;
        int i2;
        Integer R;
        Integer R2;
        String F0 = k4b.F0(str, " ", "");
        List z0 = k4b.z0(F0, new String[]{"x"});
        String str2 = (String) sl1.e0(z0);
        if (str2 != null && (R2 = r4b.R(10, str2)) != null) {
            i = R2.intValue();
        } else {
            i = 0;
        }
        String str3 = (String) sl1.k0(z0);
        if (str3 != null && (R = r4b.R(10, str3)) != null) {
            i2 = R.intValue();
        } else {
            i2 = 0;
        }
        if (k4b.V(F0, "x", false)) {
            str = k4b.J0(str, " ");
        }
        return new moc(str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static Uri r(Uri uri) {
        if (uri.isHierarchical() && uri.getQueryParameter("CMCD") != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.clearQuery();
            for (String str : uri.getQueryParameterNames()) {
                if (!str.equals("CMCD")) {
                    for (String str2 : uri.getQueryParameters(str)) {
                        buildUpon.appendQueryParameter(str, str2);
                    }
                }
            }
            return buildUpon.build();
        }
        return uri;
    }

    public qz4 j(Context context, Looper looper, yv yvVar, Object obj, wz4 wz4Var, xz4 xz4Var) {
        qz4 kwdVar;
        int i = this.a;
        switch (i) {
            case 0:
                wka wkaVar = (wka) obj;
                yvVar.getClass();
                Integer num = (Integer) yvVar.f;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new uka(context, looper, yvVar, bundle, wz4Var, xz4Var);
            case 1:
                throw s21.i(obj);
            case 4:
                return new cwd(context, looper, yvVar, (dwd) obj, (oud) wz4Var, (oud) xz4Var);
            case 7:
                return new ewd(context, looper, yvVar, (GoogleSignInOptions) obj, (oud) wz4Var, (oud) xz4Var);
            case 10:
                ws wsVar = (ws) obj;
                return new qz4(context, looper, 51, yvVar, wz4Var, xz4Var, 0);
            case 11:
                ws wsVar2 = (ws) obj;
                return new qz4(context, looper, Token.EXPR_RESULT, yvVar, wz4Var, xz4Var, 0);
            default:
                oud oudVar = (oud) wz4Var;
                oud oudVar2 = (oud) xz4Var;
                switch (i) {
                    case 2:
                        ws wsVar3 = (ws) obj;
                        return new qz4(context, looper, 449, yvVar, oudVar, oudVar2, 0);
                    case 3:
                        return new qvd(context, looper, yvVar, (flb) obj, oudVar, oudVar2);
                    case 4:
                    case 7:
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                    case 5:
                        iwd iwdVar = (iwd) obj;
                        kwdVar = new kwd(context, looper, yvVar, oudVar, oudVar2);
                        break;
                    case 6:
                        wwd wwdVar = (wwd) obj;
                        kwdVar = new wvd(context, looper, yvVar, oudVar, oudVar2);
                        break;
                    case 8:
                        tvd tvdVar = (tvd) obj;
                        kwdVar = new gwd(context, looper, yvVar, oudVar, oudVar2);
                        break;
                    case 9:
                        ws wsVar4 = (ws) obj;
                        return new qz4(context, looper, 457, yvVar, oudVar, oudVar2, 0);
                }
                return kwdVar;
        }
    }
}
