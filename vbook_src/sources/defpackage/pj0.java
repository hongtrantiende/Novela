package defpackage;

import android.os.Trace;
import com.google.common.util.concurrent.ListenableFuture;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pj0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class pj0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ pj0(oyb oybVar, tc6 tc6Var, String str, r13 r13Var, do4 do4Var, boolean z) {
        this.b = oybVar;
        this.c = tc6Var;
        this.d = str;
        this.e = r13Var;
        this.f = do4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yv7 yv7Var;
        yv7 C;
        int i = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.c;
        Object obj4 = this.d;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                oyb oybVar = (oyb) obj5;
                tc6 tc6Var = (tc6) obj3;
                String str = (String) obj4;
                r13 r13Var = (r13) obj2;
                do4 do4Var = (do4) obj;
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
                        oyb z = uaf.z(oybVar, tc6Var);
                        ks3 ks3Var = ks3.a;
                        wj wjVar = new wj(str, z, ks3Var, ks3Var, do4Var, r13Var);
                        wjVar.l();
                        wjVar.h();
                        zqa.q(j2);
                        C.w().d();
                        C.c();
                        Trace.endSection();
                        return;
                    }
                    throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 1:
                qoc qocVar = (qoc) obj5;
                gca gcaVar = (gca) obj3;
                ListenableFuture listenableFuture = (ListenableFuture) obj4;
                ListenableFuture listenableFuture2 = (ListenableFuture) obj2;
                ty3 ty3Var = (ty3) obj;
                if (qocVar.isDone()) {
                    gcaVar.n(listenableFuture);
                    return;
                } else if (listenableFuture2.isCancelled()) {
                    int i2 = ty3.e;
                    if (ty3Var.compareAndSet(sy3.a, sy3.b)) {
                        qocVar.cancel(false);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            default:
                String str2 = (String) obj4;
                vt4 vt4Var = (vt4) obj3;
                zu7 zu7Var = (zu7) obj2;
                p51 p51Var = (p51) obj;
                ((r0f) obj5).getClass();
                boolean l = sxd.l();
                if (l) {
                    try {
                        Trace.beginSection(sxd.o(str2));
                    } finally {
                        if (l) {
                            Trace.endSection();
                        }
                    }
                }
                vt4Var.invoke();
                je8 je8Var = mu9.d;
                zu7Var.g(je8Var);
                p51Var.a(je8Var);
                if (l) {
                    return;
                }
                return;
        }
    }

    public /* synthetic */ pj0(qoc qocVar, gca gcaVar, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ty3 ty3Var) {
        this.b = qocVar;
        this.c = gcaVar;
        this.d = listenableFuture;
        this.e = listenableFuture2;
        this.f = ty3Var;
    }

    public /* synthetic */ pj0(r0f r0fVar, String str, vt4 vt4Var, zu7 zu7Var, p51 p51Var) {
        this.b = r0fVar;
        this.d = str;
        this.c = vt4Var;
        this.e = zu7Var;
        this.f = p51Var;
    }
}
