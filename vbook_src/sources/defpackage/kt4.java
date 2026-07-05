package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kt4  reason: default package */
/* loaded from: classes.dex */
public final class kt4 extends RuntimeException {
    public final lt4 a;
    public final Throwable b;

    public kt4(lt4 lt4Var, Throwable th) {
        super(th);
        this.a = lt4Var;
        this.b = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.b;
    }
}
