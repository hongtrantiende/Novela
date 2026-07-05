package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ow7  reason: default package */
/* loaded from: classes.dex */
public final class ow7 {
    public final AtomicReference a = new AtomicReference(null);
    public final sw7 b = new sw7();

    public static final void a(ow7 ow7Var, mw7 mw7Var) {
        AtomicReference atomicReference = ow7Var.a;
        while (true) {
            mw7 mw7Var2 = (mw7) atomicReference.get();
            if (mw7Var2 != null && mw7Var.a.compareTo(mw7Var2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(mw7Var2, mw7Var)) {
                if (atomicReference.get() != mw7Var2) {
                    break;
                }
            }
            if (mw7Var2 != null) {
                mw7Var2.b.cancel(new nx8("Mutation interrupted", 0));
                return;
            }
            return;
        }
    }
}
