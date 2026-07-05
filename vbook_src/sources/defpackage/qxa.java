package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qxa  reason: default package */
/* loaded from: classes3.dex */
public final class qxa implements o82, m42 {
    public static final qxa a = new Object();

    @Override // defpackage.o82
    public final o82 getCallerFrame() {
        return null;
    }

    @Override // defpackage.m42
    public final d82 getContext() {
        return gs3.a;
    }

    @Override // defpackage.m42
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("Failed to capture stack frame. This is usually happens when a coroutine is running so the frame stack is changing quickly and the coroutine debug agent is unable to capture it concurrently. You may retry running your test to see this particular trace.");
    }
}
