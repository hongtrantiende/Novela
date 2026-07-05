package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sa3  reason: default package */
/* loaded from: classes3.dex */
public final class sa3 extends Exception {
    public final Throwable a;

    public sa3(Throwable th, f82 f82Var, d82 d82Var) {
        super("Coroutine dispatcher " + f82Var + " threw an exception, context = " + d82Var, th);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
