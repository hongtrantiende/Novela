package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i7f  reason: default package */
/* loaded from: classes.dex */
public final class i7f implements l7f {
    public static boolean d;
    public final c9b a;
    public final int b;
    public final j0f c;

    public i7f(c9b c9bVar) {
        j0f j0fVar = j0f.c;
        this.a = c9bVar;
        this.b = Math.max(5, 10);
        this.c = j0fVar;
    }

    @Override // defpackage.l7f
    public final void zza() {
        synchronized (i7f.class) {
            try {
                if (!d) {
                    og ogVar = new og(this, 25);
                    long j = this.b;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    hr7 hr7Var = (hr7) this.a.get();
                    dfb dfbVar = new dfb(this, ogVar, hr7Var, j);
                    hr7Var.getClass();
                    qoc qocVar = new qoc(Executors.callable(dfbVar, null));
                    fr7 fr7Var = new fr7(qocVar, hr7Var.b.schedule(qocVar, j, timeUnit));
                    fr7Var.a(new og(fr7Var, 23), e73.a);
                    d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
