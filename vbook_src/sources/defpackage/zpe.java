package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Process;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zpe  reason: default package */
/* loaded from: classes.dex */
public abstract class zpe {
    public static final tu1 a = new tu1(new c8(23, (byte) 0), false, 1647339584);
    public static final vr1 b = new vr1(1);
    public static final vr1 c = new vr1(2);
    public static final vr1 d = new vr1(3);
    public static final vr1 e = new vr1(4);
    public static final vr1 f = new vr1(5);
    public static final mx8 g = new mx8(4);
    public static jj h;
    public static sf i;
    public static n61 j;

    public static final void a(Object obj, int i2, bi6 bi6Var, tu1 tu1Var, rv4 rv4Var, int i3) {
        int i4;
        boolean z;
        xt4 xt4Var;
        int i5;
        int i6;
        int i7;
        int i8;
        rv4Var.g0(872548579);
        if ((i3 & 6) == 0) {
            if (rv4Var.h(obj)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i4 = i8 | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            if (rv4Var.d(i2)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i4 |= i7;
        }
        if ((i3 & 384) == 0) {
            if (rv4Var.h(bi6Var)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i4 |= i6;
        }
        if ((i3 & 3072) == 0) {
            if (rv4Var.h(tu1Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i4 |= i5;
        }
        if ((i4 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i4 & 1, z)) {
            boolean f2 = rv4Var.f(obj) | rv4Var.f(bi6Var);
            Object P = rv4Var.P();
            Object obj2 = ax1.a;
            if (f2 || P == obj2) {
                P = new ai6(obj, bi6Var);
                rv4Var.o0(P);
            }
            ai6 ai6Var = (ai6) P;
            ai6Var.c = i2;
            hm8 hm8Var = ai6Var.g;
            f99 f99Var = mv8.a;
            ai6 ai6Var2 = (ai6) rv4Var.j(f99Var);
            zqa f3 = pae.f();
            if (f3 != null) {
                xt4Var = f3.e();
            } else {
                xt4Var = null;
            }
            zqa h2 = pae.h(f3);
            try {
                if (ai6Var2 != ((ai6) hm8Var.getValue())) {
                    hm8Var.setValue(ai6Var2);
                    if (ai6Var.d > 0) {
                        ai6 ai6Var3 = ai6Var.e;
                        if (ai6Var3 != null) {
                            ai6Var3.b();
                        }
                        if (ai6Var2 != null) {
                            ai6Var2.a();
                        } else {
                            ai6Var2 = null;
                        }
                        ai6Var.e = ai6Var2;
                    }
                }
                pae.n(f3, h2, xt4Var);
                boolean f4 = rv4Var.f(ai6Var);
                Object P2 = rv4Var.P();
                if (f4 || P2 == obj2) {
                    P2 = new fo4(ai6Var, 16);
                    rv4Var.o0(P2);
                }
                yte.b(ai6Var, (xt4) P2, rv4Var);
                pye.a(f99Var.a(ai6Var), tu1Var, rv4Var, ((i4 >> 6) & Token.ASSIGN_MOD) | 8);
            } catch (Throwable th) {
                pae.n(f3, h2, xt4Var);
                throw th;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new qu0(obj, i2, bi6Var, tu1Var, i3);
        }
    }

    public static final void b(String str, nq7 nq7Var, rv4 rv4Var, int i2) {
        boolean z;
        str.getClass();
        rv4Var.g0(-1643328597);
        int i3 = i2 & 1;
        if (i3 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3, z)) {
            nq7Var = kq7.a;
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ma(str, nq7Var, i2, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c A[LOOP:0: B:19:0x004a->B:20:0x004c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.gab r7, defpackage.hh0 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.s29
            if (r0 == 0) goto L13
            r0 = r8
            s29 r0 = (defpackage.s29) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            s29 r0 = new s29
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            gab r7 = r0.a
            defpackage.hre.r(r8)
            goto L40
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            r7 = 0
            return r7
        L2e:
            defpackage.hre.r(r8)
        L31:
            r0.a = r7
            r0.c = r2
            s09 r8 = defpackage.s09.b
            java.lang.Object r8 = r7.j(r8, r0)
            n82 r1 = defpackage.n82.a
            if (r8 != r1) goto L40
            return r1
        L40:
            r09 r8 = (defpackage.r09) r8
            java.util.List r1 = r8.a
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        L4a:
            if (r5 >= r3) goto L58
            java.lang.Object r6 = r1.get(r5)
            z09 r6 = (defpackage.z09) r6
            r6.a()
            int r5 = r5 + 1
            goto L4a
        L58:
            java.util.List r8 = r8.a
            int r1 = r8.size()
        L5e:
            if (r4 >= r1) goto L6e
            java.lang.Object r3 = r8.get(r4)
            z09 r3 = (defpackage.z09) r3
            boolean r3 = r3.d
            if (r3 == 0) goto L6b
            goto L31
        L6b:
            int r4 = r4 + 1
            goto L5e
        L6e:
            pvc r7 = defpackage.pvc.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zpe.c(gab, hh0):java.lang.Object");
    }

    public static final Context d(q0a q0aVar) {
        q0aVar.getClass();
        try {
            return (Context) q0aVar.e(cm9.a(Context.class), null, null);
        } catch (s28 unused) {
            throw new j1("Can't resolve Context instance. Please use androidContext() function in your KoinApplication configuration.", 4);
        }
    }

    public static final void e(ta1 ta1Var, Throwable th) {
        CancellationException cancellationException;
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        } else {
            cancellationException = null;
        }
        if (cancellationException == null) {
            cancellationException = nye.b("Channel was consumed, consumer had failed", th);
        }
        ta1Var.cancel(cancellationException);
    }

    public static final String f(ly0 ly0Var, long j2) {
        if (j2 == 0) {
            return "";
        }
        d5a d5aVar = ly0Var.a;
        if (d5aVar != null) {
            if (d5aVar.b() >= j2) {
                byte[] bArr = d5aVar.a;
                int i2 = d5aVar.b;
                String p = aze.p(bArr, i2, Math.min(d5aVar.c, ((int) j2) + i2));
                ly0Var.skip(j2);
                return p;
            }
            byte[] m = pbe.m(ly0Var, (int) j2);
            return aze.p(m, 0, m.length);
        }
        vs.k("Unreacheable");
        return null;
    }

    public static final int g(ly0 ly0Var) {
        int i2;
        int i3;
        int i4;
        ly0Var.w(1L);
        byte o = ly0Var.o(0L);
        if ((o & 128) == 0) {
            i2 = o & Byte.MAX_VALUE;
            i4 = 0;
            i3 = 1;
        } else if ((o & 224) == 192) {
            i2 = o & 31;
            i3 = 2;
            i4 = 128;
        } else if ((o & 240) == 224) {
            i2 = o & 15;
            i3 = 3;
            i4 = 2048;
        } else if ((o & 248) == 240) {
            i2 = o & 7;
            i3 = 4;
            i4 = Parser.ARGC_LIMIT;
        } else {
            ly0Var.skip(1L);
            return 65533;
        }
        long j2 = i3;
        if (ly0Var.c >= j2) {
            for (int i5 = 1; i5 < i3; i5++) {
                long j3 = i5;
                byte o2 = ly0Var.o(j3);
                if ((o2 & 192) == 128) {
                    i2 = (i2 << 6) | (o2 & 63);
                } else {
                    ly0Var.skip(j3);
                    return 65533;
                }
            }
            ly0Var.skip(j2);
            if (i2 > 1114111) {
                return 65533;
            }
            if ((55296 <= i2 && i2 < 57344) || i2 < i4) {
                return 65533;
            }
            return i2;
        }
        StringBuilder s = hl5.s("size < ", ": ", i3);
        s.append(ly0Var.c);
        s.append(" (to read code point prefixed 0x");
        char[] cArr = tc4.l;
        s.append(new String(new char[]{cArr[(o >> 4) & 15], cArr[o & 15]}));
        s.append(')');
        throw new EOFException(s.toString());
    }

    public static final String h(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final String i(psa psaVar) {
        psaVar.getClass();
        psaVar.request(Long.MAX_VALUE);
        return f(psaVar.b(), psaVar.b().c);
    }

    public static final aw7 j(Object[] objArr, vt4 vt4Var, rv4 rv4Var, int i2) {
        return (aw7) l(Arrays.copyOf(objArr, objArr.length), new yy9(new mx8(13), new rg8(27)), vt4Var, rv4Var, ((i2 << 3) & 7168) | 384);
    }

    public static final Object k(Object[] objArr, vt4 vt4Var, rv4 rv4Var, int i2) {
        return l(Arrays.copyOf(objArr, objArr.length), rse.i, vt4Var, rv4Var, ((i2 << 6) & 7168) | 384);
    }

    public static final Object l(Object[] objArr, xy9 xy9Var, vt4 vt4Var, rv4 rv4Var, int i2) {
        Object[] objArr2;
        xy9 xy9Var2;
        boolean z;
        Object obj;
        Object obj2;
        Object e2;
        long j2 = rv4Var.T;
        nqe.u(36);
        String l = Long.toString(j2, 36);
        l.getClass();
        xy9Var.getClass();
        xx9 xx9Var = (xx9) rv4Var.j(ay9.a);
        Object P = rv4Var.P();
        Object obj3 = null;
        Object obj4 = ax1.a;
        if (P == obj4) {
            if (xx9Var != null && (e2 = xx9Var.e(l)) != null) {
                obj2 = xy9Var.a(e2);
            } else {
                obj2 = null;
            }
            if (obj2 == null) {
                obj2 = vt4Var.invoke();
            }
            objArr2 = objArr;
            xy9Var2 = xy9Var;
            Object rx9Var = new rx9(xy9Var2, xx9Var, l, obj2, objArr2);
            rv4Var.o0(rx9Var);
            P = rx9Var;
        } else {
            objArr2 = objArr;
            xy9Var2 = xy9Var;
        }
        rx9 rx9Var2 = (rx9) P;
        if (Arrays.equals(objArr2, rx9Var2.e)) {
            obj3 = rx9Var2.d;
        }
        if (obj3 == null) {
            obj3 = vt4Var.invoke();
        }
        boolean h2 = rv4Var.h(rx9Var2);
        if ((((i2 & Token.ASSIGN_MOD) ^ 48) > 32 && rv4Var.h(xy9Var2)) || (i2 & 48) == 32) {
            z = true;
        } else {
            z = false;
        }
        boolean h3 = h2 | z | rv4Var.h(xx9Var) | rv4Var.f(l) | rv4Var.h(obj3) | rv4Var.h(objArr2);
        Object P2 = rv4Var.P();
        if (!h3 && P2 != obj4) {
            obj = obj3;
        } else {
            Object[] objArr3 = objArr2;
            obj = obj3;
            Object le1Var = new le1(rx9Var2, xy9Var2, xx9Var, l, obj, objArr3, 4);
            rv4Var.o0(le1Var);
            P2 = le1Var;
        }
        yte.k((vt4) P2, rv4Var);
        return obj;
    }

    public static final Object m(Object[] objArr, xy9 xy9Var, vt4 vt4Var, rv4 rv4Var, int i2) {
        return l(Arrays.copyOf(objArr, objArr.length), xy9Var, vt4Var, rv4Var, ((i2 << 3) & 7168) | 384);
    }

    public static final long n(long j2) {
        long j3 = 63 & j2;
        int i2 = (int) j3;
        if (i2 <= 15) {
            return j2;
        }
        if (i2 == wm1.u.c) {
            return sve.x(j2);
        }
        if ((i2 == wm1.v.c || i2 == wm1.w.c) && Build.VERSION.SDK_INT < 34) {
            return sve.x(j2);
        }
        if (i2 == wm1.x.c && Build.VERSION.SDK_INT < 36) {
            return sve.x(j2);
        }
        return (j2 & (-64)) | (j3 - 1);
    }

    public static final long o(long j2) {
        int i2 = (int) (63 & j2);
        if (i2 != wm1.x.c && i2 != wm1.s.c && i2 != wm1.t.c) {
            return n(j2);
        }
        return n(zl1.a(j2, wm1.e));
    }

    public static final Exception p(String str, FileNotFoundException fileNotFoundException) {
        boolean z = false;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            method.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.getClass();
            Process.myUserHandle().writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            int readInt = obtain.readInt();
            Object invoke = method.invoke(null, "sys.user." + readInt + ".ce_available", "false");
            invoke.getClass();
            z = ((String) invoke).equals("true");
        } catch (Throwable th) {
            pye.e(fileNotFoundException, th);
        }
        if (z || str == null) {
            return fileNotFoundException;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return fileNotFoundException;
        } catch (IOException unused) {
            return new c73(fileNotFoundException);
        } finally {
            file.delete();
        }
    }

    public static final void q(uj9 uj9Var, int i2) {
        String str;
        ly0 ly0Var = uj9Var.c;
        if (i2 >= 0 && i2 <= 1114111) {
            if (i2 < 128) {
                ly0Var.P((byte) i2);
            } else if (i2 < 2048) {
                d5a g0 = ly0Var.g0(2);
                byte[] bArr = g0.a;
                int i3 = g0.c;
                bArr[i3] = (byte) ((i2 >> 6) | 192);
                bArr[i3 + 1] = (byte) ((i2 & 63) | Token.CASE);
                g0.c = i3 + 2;
                ly0Var.c += 2;
            } else if (55296 <= i2 && i2 < 57344) {
                ly0Var.P((byte) 63);
            } else if (i2 < 65536) {
                d5a g02 = ly0Var.g0(3);
                byte[] bArr2 = g02.a;
                int i4 = g02.c;
                bArr2[i4] = -32;
                bArr2[i4 + 1] = (byte) (((i2 >> 6) & 63) | Token.CASE);
                bArr2[i4 + 2] = (byte) ((i2 & 63) | Token.CASE);
                g02.c = i4 + 3;
                ly0Var.c += 3;
            } else {
                d5a g03 = ly0Var.g0(4);
                byte[] bArr3 = g03.a;
                int i5 = g03.c;
                bArr3[i5] = -16;
                bArr3[i5 + 1] = Byte.MIN_VALUE;
                bArr3[i5 + 2] = (byte) (((i2 >> 6) & 63) | Token.CASE);
                bArr3[i5 + 3] = (byte) ((i2 & 63) | Token.CASE);
                g03.c = i5 + 4;
                ly0Var.c += 4;
            }
            uj9Var.C0();
            return;
        }
        StringBuilder sb = new StringBuilder("Code point value is out of Unicode codespace 0..0x10ffff: 0x");
        if (i2 != 0) {
            char[] cArr = tc4.l;
            int i6 = 0;
            char c2 = cArr[0];
            char[] cArr2 = {c2, c2, c2, c2, c2, c2, cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
            while (i6 < 8 && cArr2[i6] == '0') {
                i6++;
            }
            str = r4b.D(cArr2, i6, 8);
        } else {
            str = "0";
        }
        sb.append(str);
        sb.append(" (");
        sb.append(i2);
        sb.append(')');
        throw new IllegalArgumentException(sb.toString());
    }

    public static final void r(zma zmaVar, String str, int i2, int i3) {
        char charAt;
        long j2;
        long j3;
        char c2;
        str.getClass();
        tc4.m(str.length(), i2, i3);
        ly0 b2 = zmaVar.b();
        while (i2 < i3) {
            char charAt2 = str.charAt(i2);
            if (charAt2 < 128) {
                d5a g0 = b2.g0(1);
                byte[] bArr = g0.a;
                int i4 = -i2;
                int min = Math.min(i3, g0.a() + i2);
                int i5 = i2 + 1;
                bArr[g0.c + i2 + i4] = (byte) charAt2;
                while (true) {
                    i2 = i5;
                    if (i2 >= min || (charAt = str.charAt(i2)) >= 128) {
                        break;
                    }
                    i5 = i2 + 1;
                    bArr[g0.c + i2 + i4] = (byte) charAt;
                }
                int i6 = i4 + i2;
                if (i6 == 1) {
                    g0.c += i6;
                    b2.c += i6;
                } else if (i6 >= 0 && i6 <= g0.a()) {
                    if (i6 != 0) {
                        g0.c += i6;
                        b2.c += i6;
                    } else if (zxe.q(g0)) {
                        b2.Q();
                    }
                } else {
                    StringBuilder s = hl5.s("Invalid number of bytes written: ", ". Should be in 0..", i6);
                    s.append(g0.a());
                    throw new IllegalStateException(s.toString().toString());
                }
            } else {
                if (charAt2 < 2048) {
                    d5a g02 = b2.g0(2);
                    byte[] bArr2 = g02.a;
                    int i7 = g02.c;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | Token.CASE);
                    g02.c = i7 + 2;
                    j2 = b2.c;
                    j3 = 2;
                } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                    int i8 = i2 + 1;
                    if (i8 < i3) {
                        c2 = str.charAt(i8);
                    } else {
                        c2 = 0;
                    }
                    if (charAt2 <= 56319 && 56320 <= c2 && c2 < 57344) {
                        int i9 = (((charAt2 & 1023) << 10) | (c2 & 1023)) + Parser.ARGC_LIMIT;
                        d5a g03 = b2.g0(4);
                        byte[] bArr3 = g03.a;
                        int i10 = g03.c;
                        bArr3[i10] = (byte) ((i9 >> 18) | 240);
                        bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | Token.CASE);
                        bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | Token.CASE);
                        bArr3[i10 + 3] = (byte) ((i9 & 63) | Token.CASE);
                        g03.c = i10 + 4;
                        b2.c += 4;
                        i2 += 2;
                    } else {
                        b2.P((byte) 63);
                        i2 = i8;
                    }
                } else {
                    d5a g04 = b2.g0(3);
                    byte[] bArr4 = g04.a;
                    int i11 = g04.c;
                    bArr4[i11] = (byte) ((charAt2 >> '\f') | 224);
                    bArr4[i11 + 1] = (byte) ((63 & (charAt2 >> 6)) | Token.CASE);
                    bArr4[i11 + 2] = (byte) ((charAt2 & '?') | Token.CASE);
                    g04.c = i11 + 3;
                    j2 = b2.c;
                    j3 = 3;
                }
                b2.c = j2 + j3;
                i2++;
            }
        }
        zmaVar.C0();
    }

    public static void t(int i2, int i3) {
        String z;
        if (i2 >= 0 && i2 < i3) {
            return;
        }
        if (i2 >= 0) {
            if (i3 < 0) {
                vs.m(a82.j(i3, "negative size: "));
                return;
            }
            z = hif.z("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
        } else {
            z = hif.z("%s (%s) must not be negative", "index", Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(z);
    }

    public static void u(int i2, int i3, int i4) {
        String v;
        if (i2 >= 0 && i3 >= i2 && i3 <= i4) {
            return;
        }
        if (i2 >= 0 && i2 <= i4) {
            if (i3 >= 0 && i3 <= i4) {
                v = hif.z("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            } else {
                v = v(i3, i4, "end index");
            }
        } else {
            v = v(i2, i4, "start index");
        }
        throw new IndexOutOfBoundsException(v);
    }

    public static String v(int i2, int i3, String str) {
        if (i2 < 0) {
            return hif.z("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return hif.z("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        vs.m(a82.j(i3, "negative size: "));
        return null;
    }

    public static void w(int i2, int i3) {
        if (i2 >= 0 && i2 <= i3) {
            return;
        }
        cy7.k(v(i2, i3, "index"));
    }
}
