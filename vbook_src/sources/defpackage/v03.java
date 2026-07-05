package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v03  reason: default package */
/* loaded from: classes.dex */
public final class v03 extends n3 implements ScheduledFuture {
    public final ScheduledFuture D;

    public v03(u03 u03Var) {
        this.D = u03Var.a(new mce(this));
    }

    @Override // defpackage.n3
    public final void c() {
        boolean z;
        ScheduledFuture scheduledFuture = this.D;
        Object obj = this.a;
        if ((obj instanceof h3) && ((h3) obj).a) {
            z = true;
        } else {
            z = false;
        }
        scheduledFuture.cancel(z);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.D.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.D.getDelay(timeUnit);
    }
}
