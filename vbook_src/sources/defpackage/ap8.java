package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ap8  reason: default package */
/* loaded from: classes.dex */
public final class ap8 extends CancellationException {
    public final String a = "Document already closed";
    public final Exception b;

    public ap8(Exception exc) {
        this.b = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.b;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
