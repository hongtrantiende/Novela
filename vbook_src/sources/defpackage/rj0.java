package defpackage;

import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rj0  reason: default package */
/* loaded from: classes.dex */
public abstract class rj0 {
    public static final tza a = new f99(new mf0(3));
    public static Boolean b;

    public static final void a(final ps psVar, final oyb oybVar, final do4 do4Var, final List list, final boolean z, rv4 rv4Var) {
        Executor executor = (Executor) rv4Var.j(a);
        if (executor != null && b(psVar.b.length())) {
            rv4Var.e0(315439796);
            final tc6 tc6Var = (tc6) rv4Var.j(dy1.n);
            final r13 r13Var = (r13) rv4Var.j(dy1.h);
            try {
                executor.execute(new Runnable(tc6Var, list, psVar, r13Var, do4Var, z) { // from class: qj0
                    public final /* synthetic */ tc6 b;
                    public final /* synthetic */ List c;
                    public final /* synthetic */ ps d;
                    public final /* synthetic */ r13 e;
                    public final /* synthetic */ do4 f;

                    @Override // java.lang.Runnable
                    public final void run() {
                        yv7 yv7Var;
                        yv7 C;
                        oyb oybVar2 = oyb.this;
                        tc6 tc6Var2 = this.b;
                        ps psVar2 = this.d;
                        r13 r13Var2 = this.e;
                        do4 do4Var2 = this.f;
                        Trace.beginSection("BackgroundTextMeasurement");
                        try {
                            zqa j = dra.j();
                            if (j instanceof yv7) {
                                yv7Var = (yv7) j;
                            } else {
                                yv7Var = null;
                            }
                            if (yv7Var != null && (C = yv7Var.C(null, null)) != null) {
                                zqa j2 = C.j();
                                try {
                                    oyb z2 = uaf.z(oybVar2, tc6Var2);
                                    List list2 = this.c;
                                    if (list2 == null) {
                                        list2 = ks3.a;
                                    }
                                    bm1 bm1Var = new bm1(psVar2, z2, list2, r13Var2, do4Var2);
                                    bm1Var.l();
                                    bm1Var.h();
                                    zqa.q(j2);
                                    C.w().d();
                                    C.c();
                                    Trace.endSection();
                                    return;
                                } catch (Throwable th) {
                                    zqa.q(j2);
                                    throw th;
                                }
                            }
                            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                });
            } catch (RejectedExecutionException unused) {
            }
            rv4Var.q(false);
            return;
        }
        rv4Var.e0(317137883);
        rv4Var.q(false);
    }

    public static final boolean b(int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 28 && i >= 8 && i < 1000) {
            if (b == null) {
                if (Runtime.getRuntime().availableProcessors() >= 4) {
                    z = true;
                } else {
                    z = false;
                }
                b = Boolean.valueOf(z);
            }
            Boolean bool = b;
            bool.getClass();
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
