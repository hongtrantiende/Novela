package defpackage;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h2f  reason: default package */
/* loaded from: classes.dex */
public final class h2f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lne b;
    public final /* synthetic */ r2f c;

    public /* synthetic */ h2f(r2f r2fVar, lne lneVar, int i) {
        this.a = i;
        this.b = lneVar;
        this.c = r2fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r2f r2fVar = this.c;
                synchronized (r2fVar) {
                    try {
                        r2fVar.a = false;
                        w2f w2fVar = r2fVar.c;
                        if (!w2fVar.o0()) {
                            ppe ppeVar = ((lte) w2fVar.a).f;
                            lte.m(ppeVar);
                            ppeVar.J.e("Connected to service");
                            lne lneVar = this.b;
                            w2fVar.W();
                            w2fVar.d = lneVar;
                            w2fVar.k0();
                            w2fVar.m0();
                        }
                    } finally {
                    }
                }
                return;
            default:
                r2f r2fVar2 = this.c;
                synchronized (r2fVar2) {
                    try {
                        r2fVar2.a = false;
                        w2f w2fVar2 = r2fVar2.c;
                        if (!w2fVar2.o0()) {
                            ppe ppeVar2 = ((lte) w2fVar2.a).f;
                            lte.m(ppeVar2);
                            ppeVar2.I.e("Connected to remote service");
                            lne lneVar2 = this.b;
                            w2fVar2.W();
                            w2fVar2.d = lneVar2;
                            w2fVar2.k0();
                            w2fVar2.m0();
                        }
                    } finally {
                    }
                }
                w2f w2fVar3 = this.c.c;
                ScheduledExecutorService scheduledExecutorService = w2fVar3.C;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    w2fVar3.C = null;
                    return;
                }
                return;
        }
    }
}
