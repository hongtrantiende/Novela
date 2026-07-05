package defpackage;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p42  reason: default package */
/* loaded from: classes.dex */
public final class p42 extends AtomicBoolean implements OutcomeReceiver {
    public final f61 a;

    public p42(f61 f61Var) {
        super(false);
        this.a = f61Var;
    }

    public final void onError(Throwable th) {
        th.getClass();
        if (compareAndSet(false, true)) {
            this.a.resumeWith(new gs9(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.a.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        boolean z = get();
        return "ContinuationOutcomeReceiver(outcomeReceived = " + z + ")";
    }
}
