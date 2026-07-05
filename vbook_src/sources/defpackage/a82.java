package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a82  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a82 implements q51 {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    public static gt1 A(String str) {
        er6.b(str);
        return new gt1(6);
    }

    public static float B(float f, float f2, float f3, float f4) {
        return ((f * f2) + f3) * f4;
    }

    public static /* synthetic */ int C(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] D(int i) {
        int[] iArr = new int[i];
        System.arraycopy(a, 0, iArr, 0, i);
        return iArr;
    }

    public static /* synthetic */ boolean a(int i, int i2) {
        if (i != 0) {
            if (i == i2) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public static /* synthetic */ String b(int i) {
        if (i != 1) {
            if (i == 2) {
                return "account_selection_state";
            }
            throw null;
        }
        return "account_selection_token";
    }

    public static float c(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static gt1 e(Object obj) {
        hre.r(obj);
        return new gt1(6);
    }

    public static gt1 f(String str) {
        lv5.d(str);
        return new gt1(6);
    }

    public static nq7 g(rv4 rv4Var, float f, nq7 nq7Var, ba5 ba5Var) {
        return nmd.v(nq7Var, rm1.g(r0f.y(rv4Var), f), ba5Var);
    }

    public static Object h(int i, ArrayList arrayList) {
        return arrayList.remove(arrayList.size() - i);
    }

    public static Object i(q0a q0aVar, wl8 wl8Var, Class cls, nf9 nf9Var, wl8 wl8Var2) {
        q0aVar.getClass();
        wl8Var.getClass();
        return q0aVar.e(cm9.a(cls), wl8Var2, nf9Var);
    }

    public static String j(int i, String str) {
        return str + i;
    }

    public static String k(String str, float f, String str2) {
        return str + f + str2;
    }

    public static String l(String str, float f, String str2, float f2, String str3) {
        return str + f + str2 + f2 + str3;
    }

    public static String m(String str, String str2, int i) {
        return str + str2 + i;
    }

    public static String n(StringBuilder sb, String str, long j, String str2) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder o(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static HashMap p(Class cls, w30 w30Var) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, w30Var);
        return hashMap;
    }

    public static Map q(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static Set r(String str) {
        return fca.B(new ub6(str));
    }

    public static void s(int i, int i2, int i3, int i4, int i5) {
        a2d.K(i);
        a2d.K(i2);
        a2d.K(i3);
        a2d.K(i4);
        a2d.K(i5);
    }

    public static void t(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
    }

    public static void u(int i, String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(i);
        sb.append(str3);
    }

    public static void v(int i, HashMap hashMap, String str, int i2, String str2) {
        hashMap.put(Integer.valueOf(i), str);
        hashMap.put(Integer.valueOf(i2), str2);
    }

    public static /* synthetic */ void w(cq5 cq5Var) {
        boolean isTerminated;
        if (cq5Var instanceof AutoCloseable) {
            cq5Var.close();
        } else if (cq5Var instanceof ExecutorService) {
            ExecutorService executorService = (ExecutorService) cq5Var;
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
        } else if (cq5Var instanceof TypedArray) {
            ((TypedArray) cq5Var).recycle();
        } else if (cq5Var instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) cq5Var).release();
        } else if (cq5Var instanceof MediaDrm) {
            ((MediaDrm) cq5Var).release();
        } else {
            p1a.g();
        }
    }

    public static /* synthetic */ void x(Object obj) {
        if (obj == null) {
            return;
        }
        vm1.h();
    }

    public static void y(String str, String str2, int i) {
        st0.w(str2, str + i);
    }

    public static float z(float f, float f2, float f3, float f4) {
        return ((f - f2) / f3) + f4;
    }
}
