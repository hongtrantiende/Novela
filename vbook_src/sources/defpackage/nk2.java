package defpackage;

import android.content.res.TypedArray;
import android.database.Cursor;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nk2  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class nk2 {
    public static void A(hy hyVar, float f, float f2, float f3, float f4) {
        hyVar.g(f, f2);
        hyVar.g(f3, f4);
        hyVar.b();
    }

    public static /* synthetic */ void B(Cursor cursor) {
        boolean isTerminated;
        if (cursor instanceof AutoCloseable) {
            cursor.close();
        } else if (cursor instanceof ExecutorService) {
            ExecutorService executorService = (ExecutorService) cursor;
            if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                executorService.shutdown();
                boolean z = false;
                while (!isTerminated) {
                    try {
                        isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                    } catch (InterruptedException unused) {
                        if (!z) {
                            executorService.shutdownNow();
                            z = true;
                        }
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        } else if (cursor instanceof TypedArray) {
            ((TypedArray) cursor).recycle();
        } else if (cursor instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) cursor).release();
        } else if (cursor instanceof MediaDrm) {
            ((MediaDrm) cursor).release();
        } else {
            p1a.g();
        }
    }

    public static void C(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static /* synthetic */ int a(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i2;
    }

    public static double b(double d, double d2, double d3, double d4) {
        return (d3 - (d * d2)) / d4;
    }

    public static float c(float f, float f2, float f3, float f4) {
        return (f3 - (f * f2)) * f4;
    }

    public static int d(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static long e(km3 km3Var, lm3 lm3Var, sm3 sm3Var) {
        return oue.D(km3Var.a().b().b(lm3Var).a(), sm3Var);
    }

    public static long f(String str, ph phVar, int i) {
        str.getClass();
        Long c = phVar.c(i);
        c.getClass();
        return c.longValue();
    }

    public static nq7 g(rv4 rv4Var, float f, nq7 nq7Var, ba5 ba5Var, float f2) {
        return zbe.y(nmd.v(nq7Var, rm1.g(r0f.y(rv4Var), f), ba5Var), f2);
    }

    public static yk8 h(int i, int i2, Integer num) {
        return new yk8(new vna(i, i2), num);
    }

    public static yk8 i(int i, cu0 cu0Var) {
        return new yk8(cu0Var, new ad6(i));
    }

    public static yk8 j(int i, l12 l12Var) {
        return new yk8(l12Var, new j12(i));
    }

    public static yk8 k(int i, av9 av9Var) {
        return new yk8(av9Var, new ad6(i));
    }

    public static Boolean l(Boolean bool, ph phVar, int i) {
        bool.getClass();
        Boolean a = phVar.a(i);
        a.getClass();
        return a;
    }

    public static Long m(Long l, ph phVar, int i) {
        l.getClass();
        Long c = phVar.c(i);
        c.getClass();
        return c;
    }

    public static Object n(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static Object o(ph phVar, int i, cne cneVar) {
        String d = phVar.d(i);
        d.getClass();
        return cneVar.o(d);
    }

    public static Object p(kq7 kq7Var, float f, rv4 rv4Var, aw7 aw7Var) {
        xbe.i(rv4Var, pna.h(kq7Var, f));
        return aw7Var.getValue();
    }

    public static Object q(String str, qra qraVar) {
        return qraVar.get(new pm0(str));
    }

    public static Object r(HashMap hashMap, Uri uri, Uri uri2) {
        wq9.D(hashMap.containsKey(uri));
        return hashMap.get(uri2);
    }

    public static String s(int i, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String t(long j, String str, String str2) {
        return str + j + str2;
    }

    public static String u(String str, String str2) {
        return str + str2;
    }

    public static String v(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String w(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static StringBuilder x(String str, float f, String str2, float f2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(f);
        sb.append(str2);
        sb.append(f2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder y(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void z(int i, String str, String str2, String str3, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }
}
