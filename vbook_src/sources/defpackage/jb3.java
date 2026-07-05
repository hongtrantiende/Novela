package defpackage;

import java.util.concurrent.ScheduledFuture;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jb3  reason: default package */
/* loaded from: classes3.dex */
public final class jb3 implements kb3 {
    public final ScheduledFuture a;

    public jb3(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    @Override // defpackage.kb3
    public final void a() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }
}
