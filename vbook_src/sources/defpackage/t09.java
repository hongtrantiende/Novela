package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t09  reason: default package */
/* loaded from: classes.dex */
public final class t09 extends CancellationException {
    public t09(long j) {
        super(nk2.t(j, "Timed out waiting for ", " ms"));
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(uwe.e);
        return this;
    }
}
