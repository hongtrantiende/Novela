package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n0b  reason: default package */
/* loaded from: classes.dex */
public final class n0b implements Runnable {
    public final v69 a;
    public final qya b;
    public final boolean c;
    public final int d;

    public n0b(v69 v69Var, qya qyaVar, boolean z, int i) {
        v69Var.getClass();
        qyaVar.getClass();
        this.a = v69Var;
        this.b = qyaVar;
        this.c = z;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean d;
        nnd b;
        boolean z = this.c;
        v69 v69Var = this.a;
        qya qyaVar = this.b;
        if (z) {
            int i = this.d;
            v69Var.getClass();
            String str = qyaVar.a.a;
            synchronized (v69Var.k) {
                b = v69Var.b(str);
            }
            d = v69.d(str, b, i);
        } else {
            int i2 = this.d;
            v69Var.getClass();
            String str2 = qyaVar.a.a;
            synchronized (v69Var.k) {
                try {
                    if (v69Var.f.get(str2) != null) {
                        r95.n().c(v69.l, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                    } else {
                        Set set = (Set) v69Var.h.get(str2);
                        if (set != null && set.contains(qyaVar)) {
                            d = v69.d(str2, v69Var.b(str2), i2);
                        }
                    }
                    d = false;
                } finally {
                }
            }
        }
        r95.n().c(r95.r("StopWorkRunnable"), "StopWorkRunnable for " + this.b.a.a + "; Processor.stopWork = " + d);
    }
}
