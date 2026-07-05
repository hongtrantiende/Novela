package defpackage;

import java.util.concurrent.ScheduledFuture;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z51  reason: default package */
/* loaded from: classes3.dex */
public final class z51 implements a61 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ z51(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.a61
    public final void a(Throwable th) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ScheduledFuture) obj).cancel(false);
                return;
            case 1:
                ((xt4) obj).invoke(th);
                return;
            default:
                ((kb3) obj).a();
                return;
        }
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((xt4) obj).getClass().getSimpleName() + '@' + nq2.y(this) + ']';
            default:
                return "DisposeOnCancel[" + ((kb3) obj) + ']';
        }
    }
}
