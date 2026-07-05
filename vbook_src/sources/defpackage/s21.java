package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s21  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class s21 {
    public static void A(String str, String str2, String str3) {
        st0.w(str3, str + str2);
    }

    public static void B(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
    }

    public static void C(String str, String str2, String str3, String str4, List list) {
        list.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
    }

    public static void D(StringBuilder sb, float f, String str, float f2, String str2) {
        sb.append(f);
        sb.append(str);
        sb.append(f2);
        sb.append(str2);
    }

    public static int a(int i, int i2, String str) {
        return str.length() + i + i2;
    }

    public static int b(Set set, int i, int i2) {
        return (set.hashCode() + i) * i2;
    }

    public static long c(ph phVar, int i) {
        Long c = phVar.c(i);
        c.getClass();
        return c.longValue();
    }

    public static hy d(float f, float f2) {
        hy hyVar = new hy(2);
        hyVar.i(f, f2);
        return hyVar;
    }

    public static zm4 e(rv4 rv4Var) {
        zm4 zm4Var = new zm4();
        rv4Var.o0(zm4Var);
        return zm4Var;
    }

    public static we6 f(rv4 rv4Var, nq7 nq7Var, np npVar, float f, boolean z) {
        jce.F(npVar, rv4Var, nq7Var);
        return new we6(f, z);
    }

    public static yu7 g(rv4 rv4Var) {
        yu7 yu7Var = new yu7();
        rv4Var.o0(yu7Var);
        return yu7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [yx5, ima] */
    public static ima h(yj0 yj0Var, wq7 wq7Var) {
        ?? yx5Var = new yx5(yj0Var);
        wq7Var.a(yx5Var);
        return yx5Var;
    }

    public static ClassCastException i(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static String j(ph phVar, int i) {
        phVar.getClass();
        String d = phVar.d(i);
        d.getClass();
        return d;
    }

    public static String k(String str, int i, String str2, String str3, String str4) {
        return str + str2 + str3 + i + str4;
    }

    public static String l(String str, ph phVar, int i) {
        str.getClass();
        String d = phVar.d(i);
        d.getClass();
        return d;
    }

    public static String m(String str, String str2) {
        return str + str2;
    }

    public static String n(String str, String str2, String str3) {
        Pattern compile = Pattern.compile(str);
        compile.getClass();
        String replaceAll = compile.matcher(str2).replaceAll(str3);
        replaceAll.getClass();
        return replaceAll;
    }

    public static String o(String str, StringBuilder sb) {
        return str + ((Object) sb);
    }

    public static String p(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String q(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder r(String str, int i, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder s(String str, String str2, String str3, int i, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(i);
        sb.append(str4);
        return sb;
    }

    public static void t(int i, rv4 rv4Var, np npVar, rv4 rv4Var2, kg kgVar) {
        jce.F(npVar, rv4Var, Integer.valueOf(i));
        jce.C(kgVar, rv4Var2);
    }

    public static void u(int i, HashMap hashMap, String str, int i2, String str2) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i2));
    }

    public static void v(gi1 gi1Var, StringBuilder sb, char c, String str, char c2) {
        sb.append(v66.a(gi1Var));
        sb.append(c);
        sb.append(str);
        sb.append(c2);
    }

    public static void w(rv4 rv4Var, int i, kq7 kq7Var, float f, rv4 rv4Var2) {
        rv4Var.e0(i);
        xbe.i(rv4Var2, pna.h(kq7Var, f));
    }

    public static void x(rv4 rv4Var, boolean z, kq7 kq7Var, float f, rv4 rv4Var2) {
        rv4Var.q(z);
        xbe.i(rv4Var2, pna.s(kq7Var, f));
    }

    public static /* synthetic */ void y(dq5 dq5Var) {
        boolean isTerminated;
        if (dq5Var instanceof AutoCloseable) {
            dq5Var.close();
        } else if (dq5Var instanceof ExecutorService) {
            ExecutorService executorService = (ExecutorService) dq5Var;
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
        } else if (dq5Var instanceof TypedArray) {
            ((TypedArray) dq5Var).recycle();
        } else if (dq5Var instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) dq5Var).release();
        } else if (dq5Var instanceof MediaDrm) {
            ((MediaDrm) dq5Var).release();
        } else {
            p1a.g();
        }
    }

    public static /* synthetic */ void z(nj9 nj9Var) {
        boolean isTerminated;
        if (nj9Var instanceof AutoCloseable) {
            nj9Var.close();
        } else if (nj9Var instanceof ExecutorService) {
            ExecutorService executorService = (ExecutorService) nj9Var;
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
        } else {
            p1a.g();
        }
    }
}
