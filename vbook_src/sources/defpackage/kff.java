package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kff  reason: default package */
/* loaded from: classes.dex */
public abstract class kff {
    public static final AtomicReference a;
    public static final jf8 b;
    public static final WeakHashMap c;
    public static final ro d;

    static {
        ts5.i(5, "androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        a = new AtomicReference(tm9.F);
        b = new jf8(28);
        c = new WeakHashMap();
        d = new ro(10);
        new ArrayDeque();
        new ArrayDeque();
    }

    public static sgf a() {
        qgf c2 = c();
        sgf sgfVar = c2.b;
        if (sgfVar != null && sgfVar != bgf.C) {
            return sgfVar;
        }
        e60 e60Var = wff.C;
        UUID b2 = lff.c.b();
        String o = ref.o(b2);
        ts5 ts5Var = (ts5) a.get();
        if (!ts5Var.isEmpty()) {
            ts5Var.forEach(new tff(0));
        }
        return new wff(b2, o, wff.C, c2);
    }

    public static sgf b(qgf qgfVar, sgf sgfVar) {
        boolean equals;
        qgfVar.getClass();
        sgf sgfVar2 = qgfVar.b;
        if (sgfVar2 != sgfVar) {
            if (sgfVar2 == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    equals = Trace.isEnabled();
                } else {
                    q8f.a.getClass();
                    b.getClass();
                    String str = "false";
                    try {
                        str = (String) s8f.a.invoke(null, "tiktok_systrace", "false");
                    } catch (Exception e) {
                        Log.e("SystemProperties", "get error", e);
                    }
                    equals = str.equals("true");
                }
                qgfVar.a = equals;
            }
            if (qgfVar.a) {
                if (sgfVar2 != null) {
                    if (sgfVar != null) {
                        if (((ref) sgfVar2).a == sgfVar && !kqe.B(sgfVar2)) {
                            Trace.endSection();
                        } else if (sgfVar2 == ((ref) sgfVar).a && !kqe.B(sgfVar)) {
                            kqe.C(sgfVar);
                        }
                    }
                    kqe.A(sgfVar2);
                }
                if (sgfVar != null) {
                    kqe.z(sgfVar);
                }
            }
            if (sgfVar2 != sgfVar) {
                qgfVar.b = sgfVar;
                return sgfVar2;
            }
        }
        return sgfVar;
    }

    public static qgf c() {
        return (qgf) d.get();
    }
}
