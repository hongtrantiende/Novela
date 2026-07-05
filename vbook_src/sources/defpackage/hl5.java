package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hl5  reason: default package */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class hl5 {
    public static /* synthetic */ String A(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "null";
                    }
                    return "MatchParent";
                }
                return "Expand";
            }
            return "Fixed";
        }
        return "Wrap";
    }

    public static int a(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int b(int i, int i2, int i3, int i4) {
        return ((i / i2) * i3) + i4;
    }

    public static int c(int i, long j, int i2) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static gt1 d(String str) {
        ov5.b(str);
        return new gt1(6);
    }

    public static nq7 e(rv4 rv4Var, boolean z, boolean z2, kq7 kq7Var, float f) {
        rv4Var.q(z);
        rv4Var.q(z2);
        return pna.h(kq7Var, f);
    }

    public static nq7 f(kq7 kq7Var, float f, rv4 rv4Var, kq7 kq7Var2, float f2) {
        xbe.i(rv4Var, pna.h(kq7Var, f));
        return pna.f(kq7Var2, f2);
    }

    public static dm8 g(float f, rv4 rv4Var) {
        dm8 dm8Var = new dm8(f);
        rv4Var.o0(dm8Var);
        return dm8Var;
    }

    public static Integer h(int i, Integer num) {
        return Integer.valueOf(num.intValue() / i);
    }

    public static String i(int i, int i2, String str, String str2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String j(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        return sb.toString();
    }

    public static String k(long j, String str) {
        return str + j;
    }

    public static String l(String str, String str2, int i) {
        return str + i + str2;
    }

    public static String m(String str, String str2, int i, String str3) {
        return str + i + str2 + str3;
    }

    public static String n(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String o(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String p(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String q(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder r(int i, int i2, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder s(String str, String str2, int i) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static void t(int i, int i2, int i3, int i4, int i5) {
        rae.a(i);
        rae.a(i2);
        rae.a(i3);
        rae.a(i4);
        rae.a(i5);
    }

    public static void u(int i, lu4 lu4Var, rv4 rv4Var, boolean z, boolean z2) {
        lu4Var.invoke(rv4Var, Integer.valueOf(i));
        rv4Var.q(z);
        rv4Var.q(z2);
    }

    public static void v(rv4 rv4Var, boolean z, boolean z2, boolean z3) {
        rv4Var.q(z);
        rv4Var.q(z2);
        rv4Var.q(z3);
    }

    public static void w(kq7 kq7Var, float f, rv4 rv4Var, boolean z) {
        xbe.i(rv4Var, pna.h(kq7Var, f));
        rv4Var.q(z);
    }

    public static /* synthetic */ void x(dyb dybVar) {
        boolean isTerminated;
        if (dybVar instanceof AutoCloseable) {
            dybVar.close();
        } else if (dybVar instanceof ExecutorService) {
            ExecutorService executorService = (ExecutorService) dybVar;
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
        } else if (dybVar instanceof TypedArray) {
            ((TypedArray) dybVar).recycle();
        } else if (dybVar instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) dybVar).release();
        } else if (dybVar instanceof MediaDrm) {
            ((MediaDrm) dybVar).release();
        } else {
            p1a.g();
        }
    }

    public static void y(String str, String str2, String str3, it1 it1Var, ArrayList arrayList) {
        arrayList.add(new ht1(str, str2, str3, it1Var));
    }

    public static void z(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
    }
}
