package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Paint;
import android.net.Uri;
import android.util.Log;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lre  reason: default package */
/* loaded from: classes.dex */
public abstract class lre {
    public static final tu1 a = new tu1(new cv1(4), false, 1699586470);
    public static final tu1 b = new tu1(new cv1(5), false, -1404998769);
    public static final tu1 c = new tu1(new cv1(6), false, -1113623624);
    public static final tu1 d = new tu1(new cv1(7), false, 597027223);
    public static final qm1 e = qm1.D;
    public static final float f = 1.0f;
    public static final ba5 g = new ba5(2);

    public static final long a(float f2, boolean z, boolean z2) {
        long j;
        long floatToRawIntBits = Float.floatToRawIntBits(f2);
        long j2 = 0;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        if (z2) {
            j2 = 2;
        }
        return ((j | j2) & 4294967295L) | (floatToRawIntBits << 32);
    }

    public static final void b(q9d q9dVar, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        q9d q9dVar2;
        nq7 nq7Var2;
        int i3;
        int i4;
        int i5;
        int i6;
        q9dVar.getClass();
        rv4Var.g0(-846374003);
        if ((i & 6) == 0) {
            if (rv4Var.f(q9dVar)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i | i6;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = Boolean.TRUE;
                rv4Var.o0(P);
            }
            if (!((Boolean) P).booleanValue()) {
                rv4Var.e0(1425247649);
                b37 d2 = fu0.d(kh5.e, false);
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
                jce.F(qw1.f, rv4Var, d2);
                jce.F(qw1.e, rv4Var, l);
                jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
                jce.C(qw1.h, rv4Var);
                jce.F(qw1.d, rv4Var, p);
                cvb.c(yqe.A((y3b) b2b.w.getValue(), rv4Var), zbe.y(kq7.a, 24.0f), 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, null, rv4Var, 48, 0, 261116);
                rv4Var.q(true);
                rv4Var.q(false);
                ek9 u = rv4Var.u();
                if (u != null) {
                    u.d = new yy7(q9dVar, nq7Var, i, 0);
                    return;
                }
                return;
            }
            q9dVar2 = q9dVar;
            nq7Var2 = nq7Var;
            i3 = 1;
            i4 = i;
            rv4Var.e0(1425574389);
            rv4Var.q(false);
            rte.i(q9dVar2, nq7Var2, rv4Var, i2 & Token.ELSE);
        } else {
            q9dVar2 = q9dVar;
            nq7Var2 = nq7Var;
            i3 = 1;
            i4 = i;
            rv4Var.X();
        }
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            u2.d = new yy7(q9dVar2, nq7Var2, i4, i3);
        }
    }

    public static final ljc c() {
        return new ljc(new Paint(7));
    }

    public static final void d(mq9 mq9Var, float f2, long j) {
        int i;
        mq9Var.getClass();
        boolean b2 = rg3.b(f2, Float.NaN);
        float f3 = nae.e;
        if (!b2) {
            if (rg3.b(f2, nae.e)) {
                f3 = 1.0f;
            } else {
                f3 = (float) Math.ceil(f2 * mq9Var.a);
            }
        }
        mq9Var.n((byte) 8, mq9Var.H, mq9Var.I);
        x5b x5bVar = mq9Var.c;
        if (x5bVar != null) {
            x5bVar.a |= 256;
            x5bVar.k = f3;
        }
        mq9Var.n((byte) 35, mq9Var.H, mq9Var.I);
        xr xrVar = mq9Var.H;
        xr xrVar2 = mq9Var.I;
        mxc mxcVar = mxc.a;
        if (xrVar == mxcVar) {
            if ((mq9Var.G & 1) != 0) {
                wu7 wu7Var = mq9Var.C;
                if (wu7Var == null || (xrVar = (xr) wu7Var.b(50)) == null) {
                    xrVar = nq9.a;
                }
            } else {
                xrVar = null;
            }
        }
        if (xrVar2 == mxcVar) {
            if ((mq9Var.G & 1) != 0) {
                wu7 wu7Var2 = mq9Var.D;
                if (wu7Var2 == null || (xrVar2 = (xr) wu7Var2.b(50)) == null) {
                    xrVar2 = nq9.a;
                }
            } else {
                xrVar2 = null;
            }
        }
        if (xrVar != null && xrVar2 != null) {
            i = mq9Var.G | 1;
        } else {
            i = mq9Var.G & (-2);
        }
        mq9Var.G = i;
        mq9Var.o(50, xrVar, xrVar2);
        x5b x5bVar2 = mq9Var.c;
        if (x5bVar2 != null) {
            x5bVar2.d(j);
        }
    }

    public static final void e(long j, ff8 ff8Var) {
        if (ff8Var == ff8.a) {
            if (x02.h(j) == Integer.MAX_VALUE) {
                ov5.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            }
        } else if (x02.i(j) != Integer.MAX_VALUE) {
        } else {
            ov5.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static void f(Cursor cursor) {
        if (cursor != null) {
            try {
                nk2.B(cursor);
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.zc2 r22, defpackage.zy5 r23, defpackage.n42 r24) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lre.g(zc2, zy5, n42):java.lang.Object");
    }

    public static boolean h(Context context, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = false;
        Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(uri, new String[]{"document_id"}, null, null, null);
                if (cursor.getCount() > 0) {
                    z = true;
                }
                f(cursor);
                return z;
            } catch (Exception e2) {
                Log.w("DocumentFile", "Failed query: " + e2);
                f(cursor);
                return false;
            }
        } catch (Throwable th) {
            f(cursor);
            throw th;
        }
    }

    public static final void i(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = w55.a[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 != i5) {
                i4--;
            } else {
                return;
            }
        }
    }

    public static final long j(byte[] bArr, int i) {
        return (bArr[i + 7] & 255) | ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
    }

    public static final Paint k(ljc ljcVar) {
        if (ljcVar == null) {
            String f2 = cm9.a(ljcVar.getClass()).f();
            kv5.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + f2);
        }
        return (Paint) ljcVar.b;
    }

    public static boolean l(Context context, Uri uri) {
        Cursor cursor;
        Throwable th;
        ContentResolver contentResolver = context.getContentResolver();
        String str = null;
        try {
            cursor = contentResolver.query(uri, new String[]{"mime_type"}, null, null, null);
            try {
                try {
                    if (cursor.moveToFirst() && !cursor.isNull(0)) {
                        str = cursor.getString(0);
                    }
                } catch (Exception e2) {
                    e = e2;
                    Log.w("DocumentFile", "Failed query: " + e);
                    f(cursor);
                    return "vnd.android.document/directory".equals(str);
                }
            } catch (Throwable th2) {
                th = th2;
                f(cursor);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th3) {
            cursor = null;
            th = th3;
            f(cursor);
            throw th;
        }
        f(cursor);
        return "vnd.android.document/directory".equals(str);
    }

    public static final nk6 m(rv4 rv4Var) {
        Object[] objArr = new Object[0];
        yy9 yy9Var = nk6.x;
        boolean d2 = rv4Var.d(0) | rv4Var.d(0);
        Object P = rv4Var.P();
        if (d2 || P == ax1.a) {
            P = new v16(21);
            rv4Var.o0(P);
        }
        return (nk6) zpe.m(objArr, yy9Var, (vt4) P, rv4Var, 0);
    }

    public static final void n(String str, String str2, int i) {
        StringBuilder s = s21.s("Expected ", str2, " at index ", i, ", but was '");
        s.append(str.charAt(i));
        s.append('\'');
        throw new IllegalArgumentException(s.toString());
    }

    public static String o(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            int i = b2 & 255;
            sb.append("0123456789abcdef".charAt(i / 16));
            sb.append("0123456789abcdef".charAt(i % 16));
        }
        return sb.toString();
    }

    public static byte[] p(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                int digit = Character.digit(str.charAt(i2), 16);
                int digit2 = Character.digit(str.charAt(i2 + 1), 16);
                if (digit != -1 && digit2 != -1) {
                    bArr[i] = (byte) ((digit << 4) + digit2);
                } else {
                    vs.m("input is not hexadecimal");
                    return null;
                }
            }
            return bArr;
        }
        vs.m("Expected a string of even length");
        return null;
    }
}
