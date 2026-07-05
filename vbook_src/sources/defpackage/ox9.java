package defpackage;

import android.text.TextUtils;
import android.util.Log;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.vbook.android.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ox9  reason: default package */
/* loaded from: classes.dex */
public final class ox9 implements xgd, dj1, xqa, nkc, ui4, gz, c82, u39, oa4 {
    public static ox9 M;
    public final /* synthetic */ int a;
    public static final ox9 b = new ox9(1);
    public static final lh c = new lh(0);
    public static final lh d = new lh(1);
    public static final lh e = new lh(2);
    public static final ox9 f = new ox9(3);
    public static final ox9 C = new ox9(4);
    public static final String[] D = new String[0];
    public static final ox9 E = new ox9(6);
    public static final ox9 F = new ox9(7);
    public static final ox9 G = new ox9(9);
    public static final ox9 H = new ox9(10);
    public static final ox9 I = new ox9(11);
    public static final ox9 J = new ox9(12);
    public static final okd K = new Object();
    public static final /* synthetic */ ox9 L = new ox9(14);

    public /* synthetic */ ox9(int i) {
        this.a = i;
    }

    public static vo6 B(List list, float f2, int i) {
        float f3;
        if ((i & 4) != 0) {
            f3 = Float.POSITIVE_INFINITY;
        } else {
            f3 = f2;
        }
        return new vo6(0, (Float.floatToRawIntBits(nae.e) << 32) | (Float.floatToRawIntBits(nae.e) & 4294967295L), (Float.floatToRawIntBits(nae.e) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L), list, null);
    }

    public static vo6 C(yk8[] yk8VarArr) {
        return w((yk8[]) Arrays.copyOf(yk8VarArr, yk8VarArr.length), (Float.floatToRawIntBits(nae.e) << 32) | (Float.floatToRawIntBits(nae.e) & 4294967295L), (Float.floatToRawIntBits(nae.e) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & 4294967295L));
    }

    public static void E(az0 az0Var, String str, long j) {
        byte[] bArr = new byte[512];
        byte[] H2 = r4b.H(str);
        if (H2.length <= 100) {
            b00.c0(H2, 0, 0, bArr, 0, 12);
            F(420L, bArr, 100, 8);
            F(0L, bArr, Token.ASSIGN_ADD, 8);
            F(0L, bArr, Token.COLON, 8);
            F(j, bArr, Token.IMPORT, 12);
            F(0L, bArr, Token.WITH, 12);
            bArr[156] = 48;
            b00.c0(r4b.H("ustar "), 257, 0, bArr, 0, 12);
            b00.c0(r4b.H("00"), 263, 0, bArr, 0, 12);
            for (int i = 148; i < 156; i++) {
                bArr[i] = 32;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < 512; i3++) {
                i2 += bArr[i3] & 255;
            }
            F(i2, bArr, Token.EXPR_RESULT, 7);
            bArr[155] = 32;
            az0Var.write(bArr);
            return;
        }
        p1a.k("tar entry name too long: ".concat(str));
    }

    public static void F(long j, byte[] bArr, int i, int i2) {
        nqe.u(8);
        String l = Long.toString(j, 8);
        l.getClass();
        int i3 = i2 - 1;
        byte[] H2 = r4b.H(k4b.r0(i3, l));
        b00.U(i, 0, Math.min(H2.length, i3), H2, bArr);
        bArr[(i + i2) - 1] = 0;
    }

    public static final int e(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i * 31) + Character.toLowerCase(str.charAt(i2));
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006e -> B:27:0x0072). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(java.io.FileOutputStream r11, defpackage.n42 r12) {
        /*
            boolean r0 = r12 instanceof defpackage.ot7
            if (r0 == 0) goto L13
            r0 = r12
            ot7 r0 = (defpackage.ot7) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ot7 r0 = new ot7
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.c
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L2a
            long r3 = r0.b
            java.io.FileOutputStream r11 = r0.a
            defpackage.hre.r(r12)
            r12 = r0
            goto L72
        L2a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r11)
            r11 = 0
            return r11
        L31:
            defpackage.hre.r(r12)
            r3 = 10
            r12 = r0
        L37:
            r0 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L77
            java.nio.channels.FileChannel r5 = r11.getChannel()     // Catch: java.io.IOException -> L52
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            r6 = 0
            java.nio.channels.FileLock r0 = r5.lock(r6, r8, r10)     // Catch: java.io.IOException -> L52
            r0.getClass()     // Catch: java.io.IOException -> L52
            goto L8a
        L52:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L76
            java.lang.String r5 = "Resource deadlock would occur"
            r6 = 0
            boolean r1 = defpackage.k4b.V(r1, r5, r6)
            if (r1 != r2) goto L76
            r12.a = r11
            r12.b = r3
            r12.d = r2
            java.lang.Object r0 = defpackage.ade.q(r3, r12)
            n82 r1 = defpackage.n82.a
            if (r0 != r1) goto L72
            r0 = r1
            goto L8a
        L72:
            r0 = 2
            long r3 = r3 * r0
            goto L37
        L76:
            throw r0
        L77:
            java.nio.channels.FileChannel r5 = r11.getChannel()
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            r6 = 0
            java.nio.channels.FileLock r0 = r5.lock(r6, r8, r10)
            r0.getClass()
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ox9.i(java.io.FileOutputStream, n42):java.lang.Object");
    }

    public static final float j(float f2, float[] fArr, float[] fArr2) {
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float abs = Math.abs(f2);
        float signum = Math.signum(f2);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            return signum * fArr2[binarySearch];
        }
        int i = -(binarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f8 = fArr[fArr.length - 1];
            float f9 = fArr2[fArr.length - 1];
            if (f8 == nae.e) {
                return nae.e;
            }
            return (f9 / f8) * f2;
        }
        if (i2 == -1) {
            float f10 = fArr[0];
            f5 = fArr2[0];
            f6 = f10;
            f4 = 0.0f;
            f3 = 0.0f;
        } else {
            float f11 = fArr[i2];
            float f12 = fArr[i];
            f3 = fArr2[i2];
            f4 = f11;
            f5 = fArr2[i];
            f6 = f12;
        }
        if (f4 == f6) {
            f7 = 0.0f;
        } else {
            f7 = (abs - f4) / (f6 - f4);
        }
        return (((f5 - f3) * Math.max((float) nae.e, Math.min(1.0f, f7))) + f3) * signum;
    }

    public static String m(String str, boolean z) {
        String Q0;
        str.getClass();
        if (r4b.Q(str, "https://", false)) {
            Q0 = k4b.Q0(k4b.t0(str, "https://"), '/');
        } else if (r4b.Q(str, "http://", false)) {
            Q0 = k4b.Q0(k4b.t0(str, "http://"), '/');
        } else {
            Q0 = k4b.Q0(str, '/');
        }
        if (Q0 != str) {
            if (!z) {
                Q0 = k4b.D0(Q0, "/", Q0);
            }
            return kxe.p(r4b.H(Q0));
        }
        return kxe.p(r4b.H(str));
    }

    public static cy5 o(mc2 mc2Var, jt1 jt1Var) {
        IOException iOException = (IOException) jt1Var.c;
        if (iOException instanceof pf5) {
            int i = ((pf5) iOException).c;
            if (i == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503) {
                if (mc2Var.a(1)) {
                    return new cy5(1, 300000L);
                }
                if (mc2Var.a(2)) {
                    return new cy5(2, 60000L);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static long u(jt1 jt1Var) {
        for (Throwable th = (IOException) jt1Var.c; th != null; th = th.getCause()) {
            if (!(th instanceof xm8) && !(th instanceof FileNotFoundException) && !(th instanceof mf5) && !(th instanceof is6)) {
                if ((th instanceof kg2) && ((kg2) th).a == 2008) {
                    return -9223372036854775807L;
                }
            } else {
                return -9223372036854775807L;
            }
        }
        return Math.min((jt1Var.b - 1) * 1000, 5000);
    }

    public static vo6 v(List list, float f2, int i) {
        float f3;
        if ((i & 4) != 0) {
            f3 = Float.POSITIVE_INFINITY;
        } else {
            f3 = f2;
        }
        return new vo6(0, (Float.floatToRawIntBits(nae.e) << 32) | (Float.floatToRawIntBits(nae.e) & 4294967295L), (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(nae.e) & 4294967295L), list, null);
    }

    public static vo6 w(yk8[] yk8VarArr, long j, long j2) {
        ArrayList arrayList = new ArrayList(yk8VarArr.length);
        for (yk8 yk8Var : yk8VarArr) {
            arrayList.add(new zl1(((zl1) yk8Var.b).a));
        }
        ArrayList arrayList2 = new ArrayList(yk8VarArr.length);
        for (yk8 yk8Var2 : yk8VarArr) {
            arrayList2.add(Float.valueOf(((Number) yk8Var2.a).floatValue()));
        }
        return new vo6(0, j, j2, arrayList, arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.hn8 z(defpackage.hn8 r5, java.lang.String r6) {
        /*
            r0 = 1
            char[] r0 = new char[r0]
            r1 = 47
            r2 = 0
            r0[r2] = r1
            r1 = 6
            java.util.List r6 = defpackage.k4b.y0(r6, r0, r2, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L16:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r6.next()
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.length()
            if (r3 <= 0) goto L16
            r0.add(r1)
            goto L16
        L2d:
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto L34
            goto L60
        L34:
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto L3b
            goto L62
        L3b:
            int r6 = r0.size()
            r1 = r2
        L40:
            if (r1 >= r6) goto L62
            java.lang.Object r3 = r0.get(r1)
            int r1 = r1 + 1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "."
            boolean r4 = defpackage.c16.i(r3, r4)
            if (r4 != 0) goto L60
            java.lang.String r4 = ".."
            boolean r4 = defpackage.c16.i(r3, r4)
            if (r4 != 0) goto L60
            boolean r3 = defpackage.k4b.W(r3, r2)
            if (r3 == 0) goto L40
        L60:
            r5 = 0
            return r5
        L62:
            int r6 = r0.size()
        L66:
            if (r2 >= r6) goto L75
            java.lang.Object r1 = r0.get(r2)
            int r2 = r2 + 1
            java.lang.String r1 = (java.lang.String) r1
            hn8 r5 = defpackage.hn8.f(r5, r1)
            goto L66
        L75:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ox9.z(hn8, java.lang.String):hn8");
    }

    public void A(String str) {
        if (l(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public void D(String str, Exception exc) {
        if (l(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }

    @Override // defpackage.xqa
    public int a(int i, int i2) {
        return 0;
    }

    @Override // defpackage.nkc
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // defpackage.fz, defpackage.jz
    public float b() {
        return nae.e;
    }

    @Override // defpackage.ui4
    public float c() {
        return nae.e;
    }

    @Override // defpackage.ui4
    public float d(float f2, long j) {
        return nae.e;
    }

    @Override // defpackage.fz
    public void f(r13 r13Var, int i, int[] iArr, tc6 tc6Var, int[] iArr2) {
        if (tc6Var == tc6.a) {
            lz.b(i, iArr, iArr2, false);
        } else {
            lz.b(i, iArr, iArr2, true);
        }
    }

    @Override // defpackage.u39
    public CharSequence g(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        if (!TextUtils.isEmpty(null)) {
            return null;
        }
        return editTextPreference.a.getString(R.string.not_set);
    }

    @Override // defpackage.k99
    public Object get() {
        return new p35(Executors.newSingleThreadExecutor(), 1);
    }

    @Override // defpackage.xgd
    public StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // defpackage.xgd
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // defpackage.ui4
    public float h(float f2, float f3, long j) {
        return nae.e;
    }

    @Override // defpackage.jz
    public void k(r13 r13Var, int i, int[] iArr, int[] iArr2) {
        lz.b(i, iArr, iArr2, false);
    }

    public boolean l(int i) {
        if (4 > i && !Log.isLoggable("FirebaseCrashlytics", i)) {
            return false;
        }
        return true;
    }

    public void n(String str) {
        if (l(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    @Override // defpackage.ui4
    public long p(float f2) {
        return 0L;
    }

    @Override // defpackage.dj1
    public void q(re5 re5Var, aab aabVar) {
        re5Var.getClass();
        re5Var.e.g(ah5.o, new w8((mu4) aabVar, null, 3));
    }

    public int r(int i) {
        if (i == 7) {
            return 6;
        }
        return 3;
    }

    @Override // defpackage.xgd
    public String[] s() {
        return D;
    }

    @Override // defpackage.ui4
    public float t(float f2, float f3) {
        return nae.e;
    }

    public String toString() {
        switch (this.a) {
            case 11:
                return "Start";
            case 12:
                int i = yq7.b;
                return "TimeSource(System.nanoTime())";
            case 16:
                return "Arrangement#SpaceBetween";
            case 19:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(2:3|(13:5|6|7|(1:(2:10|11)(2:26|27))(4:28|29|30|(1:32))|12|13|14|(1:16)|17|(2:20|18)|21|22|23))|39|6|7|(0)(0)|12|13|14|(0)|17|(1:18)|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
        android.util.Log.e("GlanceAppWidget", "I/O error reading set of layout structures for App Widget id " + r8, r0);
        r6 = defpackage.ie6.n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
        android.util.Log.e("GlanceAppWidget", "Set of layout structures for App Widget id " + r8 + " is corrupted", r0);
        r6 = defpackage.ie6.n();
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4 A[LOOP:0: B:33:0x00ae->B:35:0x00b4, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x(android.content.Context r7, int r8, defpackage.n42 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.qc6
            if (r0 == 0) goto L13
            r0 = r9
            qc6 r0 = (defpackage.qc6) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            qc6 r0 = new qc6
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r6 = r0.c
            int r9 = r0.e
            java.lang.String r1 = "GlanceAppWidget"
            r2 = 1
            if (r9 == 0) goto L38
            if (r9 != r2) goto L31
            int r8 = r0.b
            android.content.Context r7 = r0.a
            defpackage.hre.r(r6)     // Catch: java.io.IOException -> L2b defpackage.u82 -> L2e
            goto L5c
        L2b:
            r0 = move-exception
            r6 = r0
            goto L61
        L2e:
            r0 = move-exception
            r6 = r0
            goto L77
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            r6 = 0
            return r6
        L38:
            defpackage.hre.r(r6)
            ez4 r6 = defpackage.ez4.a     // Catch: java.io.IOException -> L2b defpackage.u82 -> L2e
            ue6 r9 = defpackage.ue6.b     // Catch: java.io.IOException -> L2b defpackage.u82 -> L2e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L2b defpackage.u82 -> L2e
            java.lang.String r4 = "appWidgetLayout-"
            r3.<init>(r4)     // Catch: java.io.IOException -> L2b defpackage.u82 -> L2e
            r3.append(r8)     // Catch: java.io.IOException -> L2b defpackage.u82 -> L2e
            java.lang.String r3 = r3.toString()     // Catch: java.io.IOException -> L2b defpackage.u82 -> L2e
            r0.a = r7     // Catch: java.io.IOException -> L2b defpackage.u82 -> L2e
            r0.b = r8     // Catch: java.io.IOException -> L2b defpackage.u82 -> L2e
            r0.e = r2     // Catch: java.io.IOException -> L2b defpackage.u82 -> L2e
            java.lang.Object r6 = r6.c(r7, r9, r3, r0)     // Catch: java.io.IOException -> L2b defpackage.u82 -> L2e
            n82 r9 = defpackage.n82.a
            if (r6 != r9) goto L5c
            return r9
        L5c:
            ie6 r6 = (defpackage.ie6) r6     // Catch: java.io.IOException -> L2b defpackage.u82 -> L2e
        L5e:
            r1 = r7
            r4 = r8
            goto L92
        L61:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "I/O error reading set of layout structures for App Widget id "
            r9.<init>(r0)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            android.util.Log.e(r1, r9, r6)
            ie6 r6 = defpackage.ie6.n()
            goto L5e
        L77:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Set of layout structures for App Widget id "
            r9.<init>(r0)
            r9.append(r8)
            java.lang.String r0 = " is corrupted"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            android.util.Log.e(r1, r9, r6)
            ie6 r6 = defpackage.ie6.n()
            goto L5e
        L92:
            sz5 r7 = r6.o()
            r8 = 10
            int r8 = defpackage.tl1.s(r7, r8)
            int r8 = defpackage.p17.k(r8)
            r9 = 16
            if (r8 >= r9) goto La5
            r8 = r9
        La5:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>(r8)
            java.util.Iterator r7 = r7.iterator()
        Lae:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lcb
            java.lang.Object r8 = r7.next()
            ke6 r8 = (defpackage.ke6) r8
            me6 r0 = r8.m()
            int r8 = r8.n()
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r8)
            r9.put(r0, r2)
            goto Lae
        Lcb:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r9)
            rc6 r0 = new rc6
            int r3 = r6.p()
            java.util.Collection r6 = r2.values()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Set r5 = defpackage.sl1.G0(r6)
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ox9.x(android.content.Context, int, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:18|(1:20)(1:43)|21|22|23|24|25|(2:39|40)(3:27|(1:29)|(4:32|33|34|(1:36)(4:38|12|13|(1:14)))(1:31))) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0125, code lost:
        r11 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1 A[Catch: all -> 0x0037, TryCatch #4 {all -> 0x0037, blocks: (B:12:0x0032, B:36:0x00bb, B:38:0x00c1, B:40:0x00c9, B:42:0x0100, B:44:0x0107, B:56:0x0132, B:58:0x0138, B:60:0x0142, B:67:0x0171, B:68:0x0172, B:69:0x0175, B:70:0x0176, B:45:0x0117), top: B:90:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0189 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v8, types: [az0] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v10, types: [mu4] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0168 -> B:65:0x016a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y(java.lang.String r12, java.lang.String r13, defpackage.j3d r14, defpackage.n42 r15) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ox9.y(java.lang.String, java.lang.String, j3d, n42):java.lang.Object");
    }
}
