package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BlurMaskFilter;
import android.os.Build;
import android.os.Debug;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import org.mozilla.javascript.Token;
/* renamed from: fca  reason: default package */
/* loaded from: classes.dex */
public abstract class fca {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final tu1 c = new tu1(new kv1(26), false, -2042676802);
    public static final tu1 d = new tu1(new kv1(27), false, 916916765);
    public static final tu1 e = new tu1(new lv1(25), false, 2003543149);
    public static final drc f = new drc(new svc(21), new h4d(8));
    public static final drc g = new drc(new svc(22), new svc(23));
    public static final drc h = new drc(new svc(24), new svc(25));
    public static final drc i = new drc(new svc(26), new svc(27));
    public static final drc j = new drc(new svc(28), new svc(29));
    public static final drc k = new drc(new h4d(0), new h4d(1));
    public static final drc l = new drc(new h4d(2), new h4d(3));
    public static final drc m = new drc(new h4d(4), new h4d(5));
    public static final drc n = new drc(new h4d(6), new h4d(7));

    public static final vy5 A(int i2, long j2, vy5 vy5Var) {
        int i3 = vy5Var.a;
        int i4 = vy5Var.d;
        int i5 = vy5Var.c;
        int i6 = vy5Var.b;
        if (i2 % 90 == 0) {
            int i7 = i2 % 360;
            if (i7 < 0) {
                i7 += 360;
            }
            if (i7 != 90) {
                if (i7 != 180) {
                    if (i7 != 270) {
                        return vy5Var;
                    }
                    int i8 = az5.c;
                    int i9 = (int) (j2 >> 32);
                    return new vy5(i6, i9 - i5, i4, i9 - i3);
                }
                int i10 = az5.c;
                int i11 = (int) (j2 >> 32);
                int i12 = (int) (j2 & 4294967295L);
                return new vy5(i11 - i5, i12 - i4, i11 - i3, i12 - i6);
            }
            int i13 = az5.c;
            int i14 = (int) (j2 & 4294967295L);
            return new vy5(i14 - i4, i3, i14 - i6, i5);
        }
        p1a.k(a82.j(i2, "rotation must be a multiple of 90, rotation: "));
        return null;
    }

    public static Set B(Object obj) {
        Set singleton = Collections.singleton(obj);
        singleton.getClass();
        return singleton;
    }

    public static String C(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes);
            return n(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            Log.e("FirebaseCrashlytics", "Could not create hashing algorithm: SHA-1, returning empty string.", e2);
            return "";
        }
    }

    public static String D(FileInputStream fileInputStream) {
        String str;
        Scanner useDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        try {
            if (useDelimiter.hasNext()) {
                str = useDelimiter.next();
            } else {
                str = "";
            }
            useDelimiter.close();
            return str;
        } catch (Throwable th) {
            if (useDelimiter != null) {
                try {
                    useDelimiter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static final String E(vy5 vy5Var) {
        vy5Var.getClass();
        StringBuilder sb = new StringBuilder("[");
        sb.append(vy5Var.a);
        sb.append('x');
        sb.append(vy5Var.b);
        sb.append(',');
        sb.append(vy5Var.c);
        sb.append('x');
        return hl5.p(sb, vy5Var.d, ']');
    }

    public static int F(byte[] bArr, int i2, lzd lzdVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            lzdVar.a = b2;
            return i3;
        }
        return G(b2, bArr, i3, lzdVar);
    }

    public static int G(int i2, byte[] bArr, int i3, lzd lzdVar) {
        byte b2 = bArr[i3];
        int i4 = i3 + 1;
        int i5 = i2 & Token.SWITCH;
        if (b2 >= 0) {
            lzdVar.a = i5 | (b2 << 7);
            return i4;
        }
        int i6 = i5 | ((b2 & Byte.MAX_VALUE) << 7);
        int i7 = i3 + 2;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            lzdVar.a = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & Byte.MAX_VALUE) << 14);
        int i9 = i3 + 3;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            lzdVar.a = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & Byte.MAX_VALUE) << 21);
        int i11 = i3 + 4;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            lzdVar.a = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] < 0) {
                i11 = i13;
            } else {
                lzdVar.a = i12;
                return i13;
            }
        }
    }

    public static int H(byte[] bArr, int i2, lzd lzdVar) {
        byte b2;
        long j2 = bArr[i2];
        int i3 = i2 + 1;
        if (j2 >= 0) {
            lzdVar.b = j2;
            return i3;
        }
        int i4 = i2 + 2;
        byte b3 = bArr[i3];
        long j3 = (j2 & 127) | ((b3 & Byte.MAX_VALUE) << 7);
        int i5 = 7;
        while (b3 < 0) {
            int i6 = i4 + 1;
            i5 += 7;
            j3 |= (b2 & Byte.MAX_VALUE) << i5;
            b3 = bArr[i4];
            i4 = i6;
        }
        lzdVar.b = j3;
        return i4;
    }

    public static int I(byte[] bArr, int i2) {
        int i3 = (bArr[i2 + 1] & 255) << 8;
        return ((bArr[i2 + 3] & 255) << 24) | i3 | (bArr[i2] & 255) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static long J(byte[] bArr, int i2) {
        return (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48) | ((bArr[i2 + 7] & 255) << 56);
    }

    public static int K(byte[] bArr, int i2, lzd lzdVar) {
        int F = F(bArr, i2, lzdVar);
        int i3 = lzdVar.a;
        if (i3 >= 0) {
            if (i3 == 0) {
                lzdVar.c = "";
                return F;
            }
            lzdVar.c = h3e.d(bArr, F, i3);
            return F + i3;
        }
        hfd.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return 0;
    }

    public static int L(byte[] bArr, int i2, lzd lzdVar) {
        int F = F(bArr, i2, lzdVar);
        int i3 = lzdVar.a;
        if (i3 >= 0) {
            if (i3 <= bArr.length - F) {
                if (i3 == 0) {
                    lzdVar.c = szd.b;
                    return F;
                }
                lzdVar.c = szd.h(bArr, F, i3);
                return F + i3;
            }
            hfd.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        hfd.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return 0;
    }

    public static int M(Object obj, m2e m2eVar, byte[] bArr, int i2, int i3, lzd lzdVar) {
        int i4 = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            i4 = G(i5, bArr, i4, lzdVar);
            i5 = lzdVar.a;
        }
        int i6 = i4;
        if (i5 >= 0 && i5 <= i3 - i6) {
            int i7 = lzdVar.d + 1;
            lzdVar.d = i7;
            if (i7 < 100) {
                int i8 = i6 + i5;
                m2eVar.e(obj, bArr, i6, i8, lzdVar);
                lzdVar.d--;
                lzdVar.c = obj;
                return i8;
            }
            hfd.s("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        hfd.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int N(Object obj, m2e m2eVar, byte[] bArr, int i2, int i3, int i4, lzd lzdVar) {
        c2e c2eVar = (c2e) m2eVar;
        int i5 = lzdVar.d + 1;
        lzdVar.d = i5;
        if (i5 < 100) {
            int w = c2eVar.w(obj, bArr, i2, i3, i4, lzdVar);
            lzdVar.d--;
            lzdVar.c = obj;
            return w;
        }
        hfd.s("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        return 0;
    }

    public static int O(int i2, byte[] bArr, int i3, int i4, f1e f1eVar, lzd lzdVar) {
        q0e q0eVar = (q0e) f1eVar;
        int F = F(bArr, i3, lzdVar);
        q0eVar.zzh(lzdVar.a);
        while (F < i4) {
            int F2 = F(bArr, F, lzdVar);
            if (i2 != lzdVar.a) {
                break;
            }
            F = F(bArr, F2, lzdVar);
            q0eVar.zzh(lzdVar.a);
        }
        return F;
    }

    public static int P(byte[] bArr, int i2, f1e f1eVar, lzd lzdVar) {
        q0e q0eVar = (q0e) f1eVar;
        int F = F(bArr, i2, lzdVar);
        int i3 = lzdVar.a + F;
        while (F < i3) {
            F = F(bArr, F, lzdVar);
            q0eVar.zzh(lzdVar.a);
        }
        if (F == i3) {
            return F;
        }
        hfd.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    public static int Q(m2e m2eVar, int i2, byte[] bArr, int i3, int i4, f1e f1eVar, lzd lzdVar) {
        o0e zza = m2eVar.zza();
        m2e m2eVar2 = m2eVar;
        byte[] bArr2 = bArr;
        int i5 = i4;
        lzd lzdVar2 = lzdVar;
        int M = M(zza, m2eVar2, bArr2, i3, i5, lzdVar2);
        m2eVar2.c(zza);
        lzdVar2.c = zza;
        f1eVar.add(zza);
        while (M < i5) {
            lzd lzdVar3 = lzdVar2;
            int i6 = i5;
            int F = F(bArr2, M, lzdVar3);
            if (i2 != lzdVar3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            m2e m2eVar3 = m2eVar2;
            o0e zza2 = m2eVar3.zza();
            M = M(zza2, m2eVar3, bArr3, F, i6, lzdVar3);
            m2eVar2 = m2eVar3;
            bArr2 = bArr3;
            i5 = i6;
            lzdVar2 = lzdVar3;
            m2eVar2.c(zza2);
            lzdVar2.c = zza2;
            f1eVar.add(zza2);
        }
        return M;
    }

    public static int R(int i2, byte[] bArr, int i3, int i4, x2e x2eVar, lzd lzdVar) {
        if ((i2 >>> 3) != 0) {
            int i5 = i2 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            if (i5 == 5) {
                                x2eVar.d(i2, Integer.valueOf(I(bArr, i3)));
                                return i3 + 4;
                            }
                            hfd.s("Protocol message contained an invalid tag (zero).");
                            return 0;
                        }
                        int i6 = (i2 & (-8)) | 4;
                        x2e a2 = x2e.a();
                        int i7 = lzdVar.d + 1;
                        lzdVar.d = i7;
                        if (i7 < 100) {
                            int i8 = 0;
                            while (true) {
                                if (i3 >= i4) {
                                    break;
                                }
                                int F = F(bArr, i3, lzdVar);
                                int i9 = lzdVar.a;
                                if (i9 == i6) {
                                    i8 = i9;
                                    i3 = F;
                                    break;
                                }
                                i3 = R(i9, bArr, F, i4, a2, lzdVar);
                                i8 = i9;
                            }
                            lzdVar.d--;
                            if (i3 <= i4 && i8 == i6) {
                                x2eVar.d(i2, a2);
                                return i3;
                            }
                            hfd.s("Failed to parse the message.");
                            return 0;
                        }
                        hfd.s("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                        return 0;
                    }
                    int F2 = F(bArr, i3, lzdVar);
                    int i10 = lzdVar.a;
                    if (i10 >= 0) {
                        if (i10 <= bArr.length - F2) {
                            if (i10 == 0) {
                                x2eVar.d(i2, szd.b);
                            } else {
                                x2eVar.d(i2, szd.h(bArr, F2, i10));
                            }
                            return F2 + i10;
                        }
                        hfd.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        return 0;
                    }
                    hfd.s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    return 0;
                }
                x2eVar.d(i2, Long.valueOf(J(bArr, i3)));
                return i3 + 8;
            }
            int H = H(bArr, i3, lzdVar);
            x2eVar.d(i2, Long.valueOf(lzdVar.b));
            return H;
        }
        hfd.s("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    public static int S(int i2, byte[] bArr, int i3, int i4, lzd lzdVar) {
        if ((i2 >>> 3) != 0) {
            int i5 = i2 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            if (i5 == 5) {
                                return i3 + 4;
                            }
                            hfd.s("Protocol message contained an invalid tag (zero).");
                            return 0;
                        }
                        int i6 = (i2 & (-8)) | 4;
                        int i7 = 0;
                        while (i3 < i4) {
                            i3 = F(bArr, i3, lzdVar);
                            i7 = lzdVar.a;
                            if (i7 == i6) {
                                break;
                            }
                            i3 = S(i7, bArr, i3, i4, lzdVar);
                        }
                        if (i3 <= i4 && i7 == i6) {
                            return i3;
                        }
                        hfd.s("Failed to parse the message.");
                        return 0;
                    }
                    return F(bArr, i3, lzdVar) + lzdVar.a;
                }
                return i3 + 8;
            }
            return H(bArr, i3, lzdVar);
        }
        hfd.s("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    public static final BlurMaskFilter a(float f2) {
        return new BlurMaskFilter(f2, BlurMaskFilter.Blur.NORMAL);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, xu8] */
    public static xu8 b(g6 g6Var) {
        int h2 = r4.h();
        r4.h();
        ?? obj = new Object();
        obj.a = d6.a;
        r4.h();
        obj.a = g6Var;
        obj.b = h2;
        return obj;
    }

    public static final void c(int i2, long j2, rv4 rv4Var, nq7 nq7Var, String str) {
        int i3;
        int i4;
        boolean z;
        ba5 ba5Var = lre.g;
        str.getClass();
        rv4Var.g0(-620811696);
        if (rv4Var.e(j2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (rv4Var.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i6 & 1, z)) {
            if (str.length() > 0) {
                rv4Var.e0(-471856218);
                fp5 fp5Var = new fp5((Context) rv4Var.j(gh.b));
                fp5Var.c = new zq9(str);
                z41 z41Var = z41.c;
                fp5Var.j = z41Var;
                fp5Var.i = z41Var;
                op5.a(fp5Var, false);
                xve.b(fp5Var.a(), (io5) rv4Var.j(do5.a), nmd.v(nq7Var, j2, ba5Var), r0f.F, rv4Var, 12582960, 3952);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-471338642);
                fu0.a(nmd.v(nq7Var, j2, ba5Var), rv4Var, 0);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new aya(j2, str, nq7Var, i2);
        }
    }

    public static xba d(xba xbaVar) {
        r07 r07Var = xbaVar.a;
        r07Var.b();
        if (r07Var.E > 0) {
            return xbaVar;
        }
        return xba.b;
    }

    public static synchronized long e(Context context) {
        long j2;
        synchronized (fca.class) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j2 = memoryInfo.totalMem;
        }
        return j2;
    }

    public static void f(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                Log.e("FirebaseCrashlytics", str, e2);
            }
        }
    }

    public static double g(double d2, double d3) {
        if (d2 >= 0.0d && d2 <= 100.0d) {
            double N = xbe.N(d2);
            double d4 = ((N + 5.0d) / d3) - 5.0d;
            if (d4 >= 0.0d && d4 <= 100.0d) {
                double y = y(N, d4);
                double abs = Math.abs(y - d3);
                if (y >= d3 || abs <= 0.04d) {
                    double G = ((xbe.G(d4 / 100.0d) * 116.0d) - 16.0d) - 0.4d;
                    if (G >= 0.0d && G <= 100.0d) {
                        return G;
                    }
                    return -1.0d;
                }
                return -1.0d;
            }
            return -1.0d;
        }
        return -1.0d;
    }

    public static final vy5 h(vy5 vy5Var, long j2) {
        int i2 = vy5Var.d;
        int i3 = vy5Var.a;
        int i4 = vy5Var.b;
        int i5 = vy5Var.c;
        int i6 = az5.c;
        int i7 = (int) (j2 >> 32);
        return new vy5(i7 - i5, i4, i7 - i3, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int i() {
        boolean o = o();
        ?? r0 = o;
        if (p()) {
            r0 = (o ? 1 : 0) | true;
        }
        if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger()) {
            return r0;
        }
        return r0 | 4;
    }

    public static final Object j(jp5 jp5Var, u4 u4Var) {
        Object obj = jp5Var.r.a.get(u4Var);
        if (obj == null) {
            Object obj2 = jp5Var.t.n.a.get(u4Var);
            if (obj2 == null) {
                return u4Var.b;
            }
            return obj2;
        }
        return obj;
    }

    public static final Object k(xe8 xe8Var, u4 u4Var) {
        Object obj = xe8Var.j.a.get(u4Var);
        if (obj == null) {
            return u4Var.b;
        }
        return obj;
    }

    public static int l(Context context, String str, String str2) {
        String packageName;
        Resources resources = context.getResources();
        int i2 = context.getApplicationContext().getApplicationInfo().icon;
        if (i2 > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i2);
                if ("android".equals(packageName)) {
                    packageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    public static HashSet m(Object... objArr) {
        HashSet hashSet = new HashSet(p17.k(objArr.length));
        b00.x0(objArr, hashSet);
        return hashSet;
    }

    public static String n(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2];
            int i3 = i2 * 2;
            char[] cArr2 = a;
            cArr[i3] = cArr2[(b2 & 255) >>> 4];
            cArr[i3 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public static boolean o() {
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu")) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean p() {
        boolean o = o();
        String str = Build.TAGS;
        if ((!o && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (!o && file.exists()) {
            return true;
        }
        return false;
    }

    public static final nq7 q(nq7 nq7Var, p76 p76Var, ii6 ii6Var, ff8 ff8Var, boolean z, boolean z2) {
        return nq7Var.a0(new li6(p76Var, ii6Var, ff8Var, z, z2));
    }

    public static double r(double d2, double d3) {
        if (d2 >= 0.0d && d2 <= 100.0d) {
            double N = xbe.N(d2);
            double d4 = ((N + 5.0d) * d3) - 5.0d;
            if (d4 >= 0.0d && d4 <= 100.0d) {
                double y = y(d4, N);
                double abs = Math.abs(y - d3);
                if (y >= d3 || abs <= 0.04d) {
                    double G = ((xbe.G(d4 / 100.0d) * 116.0d) - 16.0d) + 0.4d;
                    if (G >= 0.0d && G <= 100.0d) {
                        return G;
                    }
                    return -1.0d;
                }
                return -1.0d;
            }
            return -1.0d;
        }
        return -1.0d;
    }

    public static LinkedHashSet s(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(p17.k(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && c16.i(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set t(Set set, Iterable iterable) {
        Collection<?> C0;
        set.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            C0 = (Collection) iterable;
        } else {
            C0 = sl1.C0(iterable);
        }
        if (C0.isEmpty()) {
            return sl1.H0(set);
        }
        if (C0 instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : set) {
                if (!((Set) C0).contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(C0);
        return linkedHashSet2;
    }

    public static Set u(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(p17.k(objArr.length));
        b00.x0(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static LinkedHashSet v(Set set, Iterable iterable) {
        Integer num;
        int size;
        set.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            num = Integer.valueOf(((Collection) iterable).size());
        } else {
            num = null;
        }
        if (num != null) {
            size = set.size() + num.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(p17.k(size));
        linkedHashSet.addAll(set);
        xl1.P(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static LinkedHashSet w(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(p17.k(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static double x(double d2, double d3) {
        double d4 = (d2 + 16.0d) / 116.0d;
        double d5 = d4 * d4 * d4;
        if (d5 <= 0.008856451679035631d) {
            d5 = ((d4 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        double d6 = d5 * 100.0d;
        double d7 = (d3 + 16.0d) / 116.0d;
        double d8 = d7 * d7 * d7;
        if (d8 <= 0.008856451679035631d) {
            d8 = ((116.0d * d7) - 16.0d) / 903.2962962962963d;
        }
        return y(d6, d8 * 100.0d);
    }

    public static double y(double d2, double d3) {
        double max = Math.max(d2, d3);
        if (max != d3) {
            d2 = d3;
        }
        return (max + 5.0d) / (d2 + 5.0d);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [q07, xb7] */
    public static xb7 z(MappedByteBuffer mappedByteBuffer) {
        long j2;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i2 = duplicate.getShort() & 65535;
        if (i2 <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i3 = 0;
            while (true) {
                if (i3 < i2) {
                    int i4 = duplicate.getInt();
                    duplicate.position(duplicate.position() + 4);
                    j2 = duplicate.getInt() & 4294967295L;
                    duplicate.position(duplicate.position() + 4);
                    if (1835365473 == i4) {
                        break;
                    }
                    i3++;
                } else {
                    j2 = -1;
                    break;
                }
            }
            if (j2 != -1) {
                duplicate.position(duplicate.position() + ((int) (j2 - duplicate.position())));
                duplicate.position(duplicate.position() + 12);
                long j3 = duplicate.getInt() & 4294967295L;
                for (int i5 = 0; i5 < j3; i5++) {
                    int i6 = duplicate.getInt();
                    long j4 = duplicate.getInt() & 4294967295L;
                    duplicate.getInt();
                    if (1164798569 == i6 || 1701669481 == i6) {
                        duplicate.position((int) (j4 + j2));
                        ?? q07Var = new q07();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        int position = duplicate.position() + duplicate.getInt(duplicate.position());
                        q07Var.d = duplicate;
                        q07Var.a = position;
                        int i7 = position - duplicate.getInt(position);
                        q07Var.b = i7;
                        q07Var.c = ((ByteBuffer) q07Var.d).getShort(i7);
                        return q07Var;
                    }
                }
            }
            fb4.k("Cannot read metadata.");
            return null;
        }
        fb4.k("Cannot read metadata.");
        return null;
    }
}
