package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bze  reason: default package */
/* loaded from: classes.dex */
public abstract class bze {
    public static final tu1 b = new tu1(new kv1(17), false, -692029410);
    public static final tu1 c = new tu1(new lv1(18), false, -221917022);
    public static final tu1 d = new tu1(new kv1(18), false, 1416696485);
    public static final txb e = new txb(18);
    public final /* synthetic */ int a = 10;

    public static final void a(String str, String str2, nq7 nq7Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1685744902);
        if (rv4Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var2.f(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var2.f(nq7Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if (rv4Var2.h(xt4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i9 & 1, z)) {
            int i10 = i9 >> 6;
            xn1 a = wn1.a(lz.c, kh5.I, rv4Var2, 0);
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
            tza tzaVar = j27.a;
            cvb.c(str, null, zl1.b(0.5f, ((h27) rv4Var2.j(tzaVar)).a.q), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.l, rv4Var2, i9 & 14, 0, 131066);
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var2, pna.h(kq7Var, 8.0f));
            uwe.h(str2, xt4Var, pna.f(kq7Var, 1.0f), false, false, null, null, null, null, null, false, null, new t86(3, 0, Token.EXPORT), null, true, 0, 0, ((h27) rv4Var2.j(tzaVar)).c.b, null, rv4Var2, ((i9 >> 3) & 14) | 384 | (i10 & Token.ASSIGN_MOD), 12779520, 6127608);
            rv4Var2 = rv4Var2;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new v24(str, str2, nq7Var, xt4Var, i, 0);
        }
    }

    public static final void b(boolean z, n24 n24Var, xt4 xt4Var, mu4 mu4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        boolean z4;
        n24Var.getClass();
        String str = n24Var.u;
        String str2 = n24Var.t;
        f24 f24Var = n24Var.s;
        xt4Var.getClass();
        mu4Var.getClass();
        rv4Var.g0(1176072922);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.f(n24Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if (rv4Var.h(mu4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        boolean z5 = false;
        if ((i9 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i9 & 1, z2)) {
            boolean d2 = rv4Var.d(f24Var.ordinal());
            int i10 = i9 & 14;
            if (i10 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z6 = d2 | z3;
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z6 || P == lh9Var) {
                P = yae.z(f24Var);
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            boolean f = rv4Var.f(str2);
            if (i10 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z7 = f | z4;
            Object P2 = rv4Var.P();
            if (z7 || P2 == lh9Var) {
                P2 = yae.z(str2);
                rv4Var.o0(P2);
            }
            aw7 aw7Var2 = (aw7) P2;
            boolean f2 = rv4Var.f(str);
            if (i10 == 4) {
                z5 = true;
            }
            boolean z8 = f2 | z5;
            Object P3 = rv4Var.P();
            if (z8 || P3 == lh9Var) {
                P3 = yae.z(str);
                rv4Var.o0(P3);
            }
            nmd.d(z, xt4Var, null, true, null, null, 0L, 0L, nae.e, 0L, null, jce.E(-1539797962, new w81(aw7Var, aw7Var2, (aw7) P3, mu4Var, xt4Var), rv4Var), rv4Var, i10 | 3072 | ((i9 >> 3) & Token.ASSIGN_MOD), 48, 2036);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new rd0(z, n24Var, xt4Var, mu4Var, i, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(java.lang.String r16, boolean r17, defpackage.vt4 r18, defpackage.lu4 r19, defpackage.rv4 r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bze.c(java.lang.String, boolean, vt4, lu4, rv4, int, int):void");
    }

    public static final void d(final List list, final long j, final nq7 nq7Var, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        final List list2;
        final long j2;
        final nq7 nq7Var2;
        final int i5;
        boolean z2;
        list.getClass();
        rv4Var.g0(-897296283);
        if (rv4Var.f(list)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i2 | i;
        if (rv4Var.e(j)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var.f(nq7Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if ((i8 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i8 & 1, z)) {
            if (list.isEmpty()) {
                ek9 u = rv4Var.u();
                if (u != null) {
                    u.d = new lu4(i, 0, j, nq7Var, list) { // from class: wq8
                        public final /* synthetic */ int a;
                        public final /* synthetic */ List b;
                        public final /* synthetic */ long c;
                        public final /* synthetic */ nq7 d;

                        {
                            this.a = r2;
                            this.b = list;
                            this.c = j;
                            this.d = nq7Var;
                        }

                        @Override // defpackage.lu4
                        public final Object invoke(Object obj, Object obj2) {
                            int i9 = this.a;
                            pvc pvcVar = pvc.a;
                            switch (i9) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int p = xoe.p(1);
                                    bze.d(this.b, this.c, this.d, (rv4) obj, p);
                                    return pvcVar;
                                default:
                                    ((Integer) obj2).getClass();
                                    int p2 = xoe.p(1);
                                    bze.d(this.b, this.c, this.d, (rv4) obj, p2);
                                    return pvcVar;
                            }
                        }
                    };
                    return;
                }
                return;
            }
            list2 = list;
            j2 = j;
            boolean z3 = false;
            nq7Var2 = nq7Var;
            i5 = i;
            if ((i8 & 14) != 4) {
                z2 = false;
            } else {
                z2 = true;
            }
            if ((i8 & Token.ASSIGN_MOD) == 32) {
                z3 = true;
            }
            boolean z4 = z2 | z3;
            Object P = rv4Var.P();
            if (z4 || P == ax1.a) {
                P = new lh6(list2, j2, 2);
                rv4Var.o0(P);
            }
            bce.a(nq7Var2, (xt4) P, rv4Var, (i8 >> 6) & 14);
        } else {
            list2 = list;
            j2 = j;
            nq7Var2 = nq7Var;
            i5 = i;
            rv4Var.X();
        }
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            u2.d = new lu4(i5, 1, j2, nq7Var2, list2) { // from class: wq8
                public final /* synthetic */ int a;
                public final /* synthetic */ List b;
                public final /* synthetic */ long c;
                public final /* synthetic */ nq7 d;

                {
                    this.a = r2;
                    this.b = list2;
                    this.c = j2;
                    this.d = nq7Var2;
                }

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    int i9 = this.a;
                    pvc pvcVar = pvc.a;
                    switch (i9) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int p = xoe.p(1);
                            bze.d(this.b, this.c, this.d, (rv4) obj, p);
                            return pvcVar;
                        default:
                            ((Integer) obj2).getClass();
                            int p2 = xoe.p(1);
                            bze.d(this.b, this.c, this.d, (rv4) obj, p2);
                            return pvcVar;
                    }
                }
            };
        }
    }

    public static final void e(tkc tkcVar, skc skcVar, Object obj, Object obj2, lf4 lf4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean h;
        int i3;
        boolean h2;
        int i4;
        boolean h3;
        int i5;
        int i6;
        int i7;
        rv4Var.g0(867041821);
        if ((i & 6) == 0) {
            if (rv4Var.f(tkcVar)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(skcVar)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if ((i & 512) == 0) {
                h3 = rv4Var.f(obj);
            } else {
                h3 = rv4Var.h(obj);
            }
            if (h3) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if ((i & 4096) == 0) {
                h2 = rv4Var.f(obj2);
            } else {
                h2 = rv4Var.h(obj2);
            }
            if (h2) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if ((32768 & i) == 0) {
                h = rv4Var.f(lf4Var);
            } else {
                h = rv4Var.h(lf4Var);
            }
            if (h) {
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
            if (tkcVar.g()) {
                skcVar.g(obj, obj2, lf4Var);
            } else {
                skcVar.h(obj2, lf4Var, null, null);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ud1(tkcVar, skcVar, obj, obj2, lf4Var, i, 15);
        }
    }

    public static final ArrayList f(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            rtd rtdVar = (rtd) obj;
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", rtdVar.a);
            bundle.putLong("event_timestamp", rtdVar.b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static final tkc g(tkc tkcVar, Object obj, Object obj2, String str, rv4 rv4Var, int i) {
        boolean z;
        int i2 = (i & 14) ^ 6;
        boolean z2 = true;
        if ((i2 > 4 && rv4Var.f(tkcVar)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        Object P = rv4Var.P();
        Object obj3 = ax1.a;
        if (z || P == obj3) {
            P = new tkc(new fw7(obj), tkcVar, eub.o(tkcVar.c, " > ", str));
            rv4Var.o0(P);
        }
        tkc tkcVar2 = (tkc) P;
        if ((i2 <= 4 || !rv4Var.f(tkcVar)) && (i & 6) != 4) {
            z2 = false;
        }
        boolean f = rv4Var.f(tkcVar2) | z2;
        Object P2 = rv4Var.P();
        if (f || P2 == obj3) {
            P2 = new t3c(9, tkcVar, tkcVar2);
            rv4Var.o0(P2);
        }
        yte.b(tkcVar2, (xt4) P2, rv4Var);
        if (tkcVar.g()) {
            tkcVar2.k(obj, obj2);
            return tkcVar2;
        }
        tkcVar2.p(obj2);
        tkcVar2.l.setValue(Boolean.FALSE);
        return tkcVar2;
    }

    public static final pkc h(tkc tkcVar, drc drcVar, String str, rv4 rv4Var, int i, int i2) {
        okc okcVar;
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean f = rv4Var.f(tkcVar);
        Object P = rv4Var.P();
        Object obj = ax1.a;
        if (f || P == obj) {
            P = new pkc(tkcVar, drcVar, str);
            rv4Var.o0(P);
        }
        pkc pkcVar = (pkc) P;
        boolean f2 = rv4Var.f(tkcVar) | rv4Var.h(pkcVar);
        Object P2 = rv4Var.P();
        if (f2 || P2 == obj) {
            P2 = new t3c(10, tkcVar, pkcVar);
            rv4Var.o0(P2);
        }
        yte.b(pkcVar, (xt4) P2, rv4Var);
        if (tkcVar.g() && (okcVar = (okc) pkcVar.b.getValue()) != null) {
            tkc tkcVar2 = pkcVar.c;
            okcVar.a.g(okcVar.c.invoke(tkcVar2.f().d()), okcVar.c.invoke(tkcVar2.f().f()), (lf4) okcVar.b.invoke(tkcVar2.f()));
        }
        return pkcVar;
    }

    public static final skc i(tkc tkcVar, Object obj, Object obj2, lf4 lf4Var, drc drcVar, rv4 rv4Var, int i) {
        boolean z;
        xt4 xt4Var;
        Object obj3;
        Object obj4;
        int i2 = i & 14;
        int i3 = i2 ^ 6;
        boolean z2 = true;
        if ((i3 > 4 && rv4Var.f(tkcVar)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        Object P = rv4Var.P();
        Object obj5 = ax1.a;
        if (!z && P != obj5) {
            obj4 = obj;
            obj3 = obj2;
        } else {
            zqa f = pae.f();
            if (f != null) {
                xt4Var = f.e();
            } else {
                xt4Var = null;
            }
            zqa h = pae.h(f);
            try {
                obj3 = obj2;
                js jsVar = (js) drcVar.a.invoke(obj3);
                jsVar.d();
                obj4 = obj;
                Object skcVar = new skc(tkcVar, obj4, jsVar, drcVar);
                pae.n(f, h, xt4Var);
                rv4Var.o0(skcVar);
                P = skcVar;
            } catch (Throwable th) {
                pae.n(f, h, xt4Var);
                throw th;
            }
        }
        skc skcVar2 = (skc) P;
        int i4 = (i >> 3) & 8;
        int i5 = i << 3;
        e(tkcVar, skcVar2, obj4, obj3, lf4Var, rv4Var, i2 | (i4 << 6) | (i5 & 896) | (i4 << 9) | (i5 & 7168) | (57344 & i5));
        if ((i3 <= 4 || !rv4Var.f(tkcVar)) && (i & 6) != 4) {
            z2 = false;
        }
        boolean f2 = rv4Var.f(skcVar2) | z2;
        Object P2 = rv4Var.P();
        if (f2 || P2 == obj5) {
            P2 = new t3c(8, tkcVar, skcVar2);
            rv4Var.o0(P2);
        }
        yte.b(skcVar2, (xt4) P2, rv4Var);
        return skcVar2;
    }

    public static Bitmap j(byte[] bArr, int i, int i2) {
        BitmapFactory.Options options;
        int i3 = 0;
        if (i2 != -1) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int max = Math.max(options.outWidth, options.outHeight); max > i2; max /= 2) {
                options.inSampleSize *= 2;
            }
        } else {
            options = null;
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (decodeByteArray != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                fz3 fz3Var = new fz3(byteArrayInputStream);
                byteArrayInputStream.close();
                switch (fz3Var.c(1)) {
                    case 3:
                    case 4:
                        i3 = 180;
                        break;
                    case 5:
                    case 8:
                        i3 = 270;
                        break;
                    case 6:
                    case 7:
                        i3 = 90;
                        break;
                }
                if (i3 != 0) {
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i3);
                    return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
                }
                return decodeByteArray;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        throw xm8.a(new IllegalStateException(), "Could not decode image data");
    }

    public static zx5 k(long j) {
        long j2 = j / 1000;
        if ((j ^ 1000) < 0 && j2 * 1000 != j) {
            j2--;
        }
        long j3 = j % 1000;
        int i = (int) ((j3 + (1000 & (((j3 ^ 1000) & ((-j3) | j3)) >> 63))) * 1000000);
        if (j2 < -31557014167219200L) {
            return zx5.c;
        }
        if (j2 > 31556889864403199L) {
            return zx5.d;
        }
        return l(j2, i);
    }

    public static zx5 l(long j, long j2) {
        long j3 = j2 / 1000000000;
        if ((j2 ^ 1000000000) < 0 && j3 * 1000000000 != j2) {
            j3--;
        }
        long j4 = j + j3;
        if ((j ^ j4) < 0 && (j3 ^ j) >= 0) {
            if (j > 0) {
                return zx5.d;
            }
            return zx5.c;
        } else if (j4 < -31557014167219200L) {
            return zx5.c;
        } else {
            if (j4 > 31556889864403199L) {
                return zx5.d;
            }
            long j5 = j2 % 1000000000;
            return new zx5(j4, (int) (j5 + ((((j5 ^ 1000000000) & ((-j5) | j5)) >> 63) & 1000000000)));
        }
    }

    public static final gi1 m(o9a o9aVar) {
        o9aVar.getClass();
        if (o9aVar instanceof l32) {
            return ((l32) o9aVar).b;
        }
        if (o9aVar instanceof p9a) {
            return m(((p9a) o9aVar).a);
        }
        return null;
    }

    public static final Object n(w27 w27Var) {
        xc6 xc6Var;
        Object S = w27Var.S();
        if (S instanceof xc6) {
            xc6Var = (xc6) S;
        } else {
            xc6Var = null;
        }
        if (xc6Var == null) {
            return null;
        }
        return xc6Var.K;
    }

    public static final nq7 o(nq7 nq7Var, Object obj) {
        return nq7Var.a0(new wc6(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void p(defpackage.k61 r10, defpackage.fvb r11) {
        /*
            it7 r0 = r11.b
            boolean r1 = r11.e()
            evb r2 = r11.a
            if (r1 == 0) goto L13
            int r1 = r2.f
            r3 = 3
            if (r1 != r3) goto L10
            goto L13
        L10:
            r1 = 1
        L11:
            r7 = r1
            goto L15
        L13:
            r1 = 0
            goto L11
        L15:
            if (r7 == 0) goto L40
            long r3 = r11.c
            r11 = 32
            long r5 = r3 >> r11
            int r1 = (int) r5
            float r1 = (float) r1
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            int r3 = (int) r3
            float r3 = (float) r3
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r8 = (long) r1
            int r1 = java.lang.Float.floatToRawIntBits(r3)
            long r3 = (long) r1
            long r8 = r8 << r11
            long r3 = r3 & r5
            long r3 = r3 | r8
            r5 = 0
            rk9 r11 = defpackage.npe.n(r5, r3)
            r10.i()
            defpackage.k61.r(r10, r11)
        L40:
            oyb r11 = r2.b
            uva r11 = r11.a
            gpb r1 = r11.m
            mub r2 = r11.a
            if (r1 != 0) goto L4c
            gpb r1 = defpackage.gpb.b
        L4c:
            r5 = r1
            nea r1 = r11.n
            if (r1 != 0) goto L53
            nea r1 = defpackage.nea.d
        L53:
            r4 = r1
            bk3 r11 = r11.p
            if (r11 != 0) goto L5a
            ye4 r11 = defpackage.ye4.a
        L5a:
            r6 = r11
            r11 = r2
            hy0 r2 = r11.b()     // Catch: java.lang.Throwable -> L95
            lub r1 = defpackage.lub.a
            if (r2 == 0) goto L7e
            if (r11 == r1) goto L71
            float r11 = r11.z()     // Catch: java.lang.Throwable -> L6d
        L6a:
            r1 = r10
            r3 = r11
            goto L74
        L6d:
            r0 = move-exception
            r11 = r0
            r1 = r10
            goto L98
        L71:
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L6a
        L74:
            defpackage.it7.k(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L7a
            r10 = r1
            r1 = r10
            goto L8d
        L7a:
            r0 = move-exception
            r10 = r1
        L7c:
            r11 = r0
            goto L98
        L7e:
            if (r11 == r1) goto L87
            long r1 = r11.a()     // Catch: java.lang.Throwable -> L6d
        L84:
            r2 = r1
            r1 = r10
            goto L8a
        L87:
            long r1 = defpackage.zl1.b     // Catch: java.lang.Throwable -> L95
            goto L84
        L8a:
            defpackage.it7.j(r0, r1, r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L93
        L8d:
            if (r7 == 0) goto L92
            r1.q()
        L92:
            return
        L93:
            r0 = move-exception
            goto L7c
        L95:
            r0 = move-exception
            r1 = r10
            goto L7c
        L98:
            if (r7 == 0) goto L9d
            r1.q()
        L9d:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bze.p(k61, fvb):void");
    }

    public static zx5 q(String str) {
        int i;
        dy5 o;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        int i8;
        long j;
        char charAt;
        char charAt2;
        str.getClass();
        if (str.length() == 0) {
            o = new eb5(str, "An empty string is not a valid Instant");
        } else {
            char charAt3 = str.charAt(0);
            if (charAt3 != '+' && charAt3 != '-') {
                i = 0;
                charAt3 = ' ';
            } else {
                i = 1;
            }
            int i9 = 0;
            int i10 = i;
            while (i10 < str.length() && '0' <= (charAt2 = str.charAt(i10)) && charAt2 < ':') {
                i9 = (i9 * 10) + (str.charAt(i10) - '0');
                i10++;
            }
            int i11 = i10 - i;
            if (i11 > 10) {
                o = pye.p(str, "Expected at most 10 digits for the year number, got " + i11 + " digits");
            } else if (i11 == 10 && str.charAt(i) >= '2') {
                o = pye.p(str, "Expected at most 9 digits for the year number or year 1000000000, got " + i11 + " digits");
            } else if (i11 < 4) {
                o = pye.p(str, "The year number must be padded to 4 digits, got " + i11 + " digits");
            } else if (charAt3 == '+' && i11 == 4) {
                o = pye.p(str, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (charAt3 == ' ' && i11 != 4) {
                o = pye.p(str, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            } else {
                if (charAt3 == '-') {
                    i9 = -i9;
                }
                int i12 = i10 + 16;
                if (str.length() < i12) {
                    o = pye.p(str, "The input string is too short");
                } else {
                    eb5 o2 = pye.o(str, "'-'", i10, new oi5(18));
                    if (o2 != null) {
                        o = o2;
                    } else {
                        o = pye.o(str, "'-'", i10 + 3, new oi5(19));
                        if (o == null && (o = pye.o(str, "'T' or 't'", i10 + 6, new oi5(20))) == null && (o = pye.o(str, "':'", i10 + 9, new oi5(21))) == null && (o = pye.o(str, "':'", i10 + 12, new oi5(22))) == null) {
                            int[] iArr = pye.f;
                            int i13 = 0;
                            while (true) {
                                if (i13 < 10) {
                                    eb5 o3 = pye.o(str, "an ASCII digit", iArr[i13] + i10, new oi5(23));
                                    if (o3 != null) {
                                        o = o3;
                                        break;
                                    }
                                    i13++;
                                } else {
                                    int q = pye.q(str, i10 + 1);
                                    int q2 = pye.q(str, i10 + 4);
                                    int q3 = pye.q(str, i10 + 7);
                                    int q4 = pye.q(str, i10 + 10);
                                    int q5 = pye.q(str, i10 + 13);
                                    int i14 = i10 + 15;
                                    if (str.charAt(i14) == '.') {
                                        i14 = i12;
                                        int i15 = 0;
                                        while (i14 < str.length() && '0' <= (charAt = str.charAt(i14)) && charAt < ':') {
                                            i15 = (i15 * 10) + (str.charAt(i14) - '0');
                                            i14++;
                                        }
                                        int i16 = i14 - i12;
                                        if (1 <= i16 && i16 < 10) {
                                            i2 = i15 * pye.e[9 - i16];
                                        } else {
                                            o = pye.p(str, "1..9 digits are supported for the fraction of the second, got " + i16 + " digits");
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                    if (i14 >= str.length()) {
                                        o = pye.p(str, "The UTC offset at the end of the string is missing");
                                    } else {
                                        char charAt4 = str.charAt(i14);
                                        if (charAt4 != '+' && charAt4 != '-') {
                                            if (charAt4 != 'Z' && charAt4 != 'z') {
                                                o = pye.p(str, "Expected the UTC offset at position " + i14 + ", got '" + charAt4 + '\'');
                                            } else {
                                                int i17 = i14 + 1;
                                                if (str.length() == i17) {
                                                    i6 = 0;
                                                    if (1 > q) {
                                                    }
                                                    o = pye.p(str, "Expected a month number in 1..12, got " + q);
                                                } else {
                                                    o = pye.p(str, "Extra text after the instant at position " + i17);
                                                }
                                            }
                                        } else {
                                            int length = str.length() - i14;
                                            if (length > 9) {
                                                o = pye.p(str, "The UTC offset string \"" + pye.t(str.subSequence(i14, str.length()).toString(), 16) + "\" is too long");
                                            } else if (length % 3 != 0) {
                                                o = pye.p(str, "Invalid UTC offset string \"" + str.subSequence(i14, str.length()).toString() + '\"');
                                            } else {
                                                int[] iArr2 = pye.g;
                                                int i18 = 0;
                                                for (int i19 = 2; i18 < i19; i19 = 2) {
                                                    int i20 = i14 + iArr2[i18];
                                                    if (i20 >= str.length()) {
                                                        break;
                                                    } else if (str.charAt(i20) != ':') {
                                                        StringBuilder s = hl5.s("Expected ':' at index ", ", got '", i20);
                                                        s.append(str.charAt(i20));
                                                        s.append('\'');
                                                        o = pye.p(str, s.toString());
                                                        break;
                                                    } else {
                                                        i18++;
                                                    }
                                                }
                                                int[] iArr3 = pye.h;
                                                int i21 = 0;
                                                while (i21 < 6 && (i7 = iArr3[i21] + i14) < str.length()) {
                                                    char charAt5 = str.charAt(i7);
                                                    int[] iArr4 = iArr3;
                                                    if ('0' <= charAt5 && charAt5 < ':') {
                                                        i21++;
                                                        iArr3 = iArr4;
                                                    } else {
                                                        StringBuilder s2 = hl5.s("Expected an ASCII digit at index ", ", got '", i7);
                                                        s2.append(str.charAt(i7));
                                                        s2.append('\'');
                                                        o = pye.p(str, s2.toString());
                                                        break;
                                                    }
                                                }
                                                int q6 = pye.q(str, i14 + 1);
                                                if (length > 3) {
                                                    i3 = pye.q(str, i14 + 4);
                                                } else {
                                                    i3 = 0;
                                                }
                                                if (length > 6) {
                                                    i4 = pye.q(str, i14 + 7);
                                                } else {
                                                    i4 = 0;
                                                }
                                                if (i3 > 59) {
                                                    o = pye.p(str, "Expected offset-minute-of-hour in 0..59, got " + i3);
                                                } else if (i4 > 59) {
                                                    o = pye.p(str, "Expected offset-second-of-minute in 0..59, got " + i4);
                                                } else if (q6 > 17 && (q6 != 18 || i3 != 0 || i4 != 0)) {
                                                    o = pye.p(str, "Expected an offset in -18:00..+18:00, got " + str.subSequence(i14, str.length()).toString());
                                                } else {
                                                    int i22 = (i3 * 60) + (q6 * 3600) + i4;
                                                    if (charAt4 == '-') {
                                                        i5 = -1;
                                                    } else {
                                                        i5 = 1;
                                                    }
                                                    i6 = i22 * i5;
                                                    if (1 > q && q < 13) {
                                                        if (1 <= q2) {
                                                            int i23 = i9 & 3;
                                                            if (i23 == 0 && (i9 % 100 != 0 || i9 % 400 == 0)) {
                                                                z = true;
                                                            } else {
                                                                z = false;
                                                            }
                                                            if (q != 2) {
                                                                if (q != 4 && q != 6 && q != 9 && q != 11) {
                                                                    i8 = 31;
                                                                } else {
                                                                    i8 = 30;
                                                                }
                                                            } else if (z) {
                                                                i8 = 29;
                                                            } else {
                                                                i8 = 28;
                                                            }
                                                            if (q2 <= i8) {
                                                                if (q3 > 23) {
                                                                    o = pye.p(str, "Expected hour in 0..23, got " + q3);
                                                                } else if (q4 > 59) {
                                                                    o = pye.p(str, "Expected minute-of-hour in 0..59, got " + q4);
                                                                } else if (q5 > 59) {
                                                                    o = pye.p(str, "Expected second-of-minute in 0..59, got " + q5);
                                                                } else {
                                                                    long j2 = i9;
                                                                    long j3 = 365 * j2;
                                                                    if (j2 >= 0) {
                                                                        j = ((j2 + 399) / 400) + (((j2 + 3) / 4) - ((j2 + 99) / 100)) + j3;
                                                                    } else {
                                                                        j = j3 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
                                                                    }
                                                                    long j4 = j + (((q * 367) - 362) / 12) + (q2 - 1);
                                                                    if (q > 2) {
                                                                        j4 = (i23 == 0 && (i9 % 100 != 0 || i9 % 400 == 0)) ? (-1) + j4 : j4 - 2;
                                                                    }
                                                                    o = new cy5((((j4 - 719528) * 86400) + (((q4 * 60) + (q3 * 3600)) + q5)) - i6, i2);
                                                                }
                                                            }
                                                        }
                                                        StringBuilder r = hl5.r(q, i9, "Expected a valid day-of-month for month ", " of year ", ", got ");
                                                        r.append(q2);
                                                        o = pye.p(str, r.toString());
                                                    } else {
                                                        o = pye.p(str, "Expected a month number in 1..12, got " + q);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return o.toInstant();
    }

    public static final x04 r(rv4 rv4Var) {
        Object P = rv4Var.P();
        Object obj = ax1.a;
        if (P == obj) {
            P = new qx6(9);
            rv4Var.o0(P);
        }
        vt4 vt4Var = (vt4) P;
        Context context = (Context) rv4Var.j(gh.b);
        boolean f = rv4Var.f(context);
        Object P2 = rv4Var.P();
        if (f || P2 == obj) {
            d82 d82Var = (d82) vt4Var.invoke();
            context.getClass();
            d82Var.getClass();
            if (((y04) sl1.e0(w67.a)) != null) {
                P2 = new fn9(new x04(context, d82Var));
                rv4Var.o0(P2);
            } else {
                vs.k("No MediampPlayerFactory implementation found on the classpath.");
                return null;
            }
        }
        return ((fn9) P2).a;
    }

    public static final tkc s(c3e c3eVar, String str, rv4 rv4Var, int i, int i2) {
        boolean z;
        xt4 xt4Var;
        boolean z2;
        if ((i2 & 2) != 0) {
            str = null;
        }
        int i3 = (i & 14) ^ 6;
        boolean z3 = true;
        if ((i3 > 4 && rv4Var.f(c3eVar)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        Object P = rv4Var.P();
        Object obj = ax1.a;
        if (z || P == obj) {
            zqa f = pae.f();
            if (f != null) {
                xt4Var = f.e();
            } else {
                xt4Var = null;
            }
            zqa h = pae.h(f);
            try {
                Object tkcVar = new tkc(c3eVar, null, str);
                pae.n(f, h, xt4Var);
                rv4Var.o0(tkcVar);
                P = tkcVar;
            } catch (Throwable th) {
                pae.n(f, h, xt4Var);
                throw th;
            }
        }
        tkc tkcVar2 = (tkc) P;
        if (c3eVar instanceof y4a) {
            rv4Var.e0(-1357341561);
            Object P2 = rv4Var.P();
            if (P2 == obj) {
                P2 = yte.s(rv4Var);
                rv4Var.o0(P2);
            }
            Object obj2 = (m82) P2;
            boolean h2 = rv4Var.h(obj2);
            if ((i3 > 4 && rv4Var.f(c3eVar)) || (i & 6) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = h2 | z2;
            Object P3 = rv4Var.P();
            if (z4 || P3 == obj) {
                P3 = new t3c(6, c3eVar, obj2);
                rv4Var.o0(P3);
            }
            yte.b(obj2, (xt4) P3, rv4Var);
            y4a y4aVar = (y4a) c3eVar;
            Object value = y4aVar.c.getValue();
            Object value2 = y4aVar.b.getValue();
            if ((i3 <= 4 || !rv4Var.f(c3eVar)) && (i & 6) != 4) {
                z3 = false;
            }
            Object P4 = rv4Var.P();
            if (z3 || P4 == obj) {
                P4 = new qkb(c3eVar, (m42) null, 18);
                rv4Var.o0(P4);
            }
            yte.h(value, value2, (lu4) P4, rv4Var);
            rv4Var.q(false);
        } else {
            rv4Var.e0(-1356348972);
            tkcVar2.a(c3eVar.B(), rv4Var, 0);
            rv4Var.q(false);
        }
        boolean f2 = rv4Var.f(tkcVar2);
        Object P5 = rv4Var.P();
        if (f2 || P5 == obj) {
            P5 = new vkc(tkcVar2, 0);
            rv4Var.o0(P5);
        }
        yte.b(tkcVar2, (xt4) P5, rv4Var);
        return tkcVar2;
    }

    public static final tkc t(Object obj, String str, rv4 rv4Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        Object P = rv4Var.P();
        lh9 lh9Var = ax1.a;
        if (P == lh9Var) {
            P = new tkc(new fw7(obj), null, str);
            rv4Var.o0(P);
        }
        tkc tkcVar = (tkc) P;
        tkcVar.a(obj, rv4Var, (i & 8) | 48 | (i & 14));
        Object P2 = rv4Var.P();
        if (P2 == lh9Var) {
            P2 = new vkc(tkcVar, 1);
            rv4Var.o0(P2);
        }
        yte.b(tkcVar, (xt4) P2, rv4Var);
        return tkcVar;
    }

    public int hashCode() {
        switch (this.a) {
            case 10:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.a) {
            case 10:
                String g = cm9.a(getClass()).g();
                g.getClass();
                return g;
            default:
                return super.toString();
        }
    }
}
