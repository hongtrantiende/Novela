package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.mozilla.javascript.Parser;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f5a  reason: default package */
/* loaded from: classes3.dex */
public abstract class f5a extends ty1 implements f48 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(f5a.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long e;

    public f5a(long j, f5a f5aVar, int i) {
        super(f5aVar);
        this.e = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // defpackage.ty1
    public final boolean g() {
        if (f.get(this) == l() && d() != null) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (f.addAndGet(this, -65536) == l() && d() != null) {
            return true;
        }
        return false;
    }

    public abstract int l();

    public abstract void m(int i, d82 d82Var);

    public final void n() {
        if (f.incrementAndGet(this) == l()) {
            i();
        }
    }

    public final boolean o() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == l() && d() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, Parser.ARGC_LIMIT + i));
        return true;
    }
}
