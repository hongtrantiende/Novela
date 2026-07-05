package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sw2  reason: default package */
/* loaded from: classes3.dex */
public final class sw2 extends uy3 {
    public static final sw2 d;
    public l82 c;

    /* JADX WARN: Type inference failed for: r0v0, types: [f82, sw2] */
    static {
        int i = alb.c;
        int i2 = alb.d;
        long j = alb.e;
        String str = alb.a;
        ?? f82Var = new f82();
        f82Var.c = new l82(i, i2, j, str);
        d = f82Var;
    }

    @Override // defpackage.f82
    public final void C(d82 d82Var, Runnable runnable) {
        l82.C(this.c, runnable, 6);
    }

    @Override // defpackage.f82
    public final void Q(d82 d82Var, Runnable runnable) {
        l82.C(this.c, runnable, 2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.f82
    public final f82 j0(int i) {
        yte.p(i);
        if (i >= alb.c) {
            return this;
        }
        return super.j0(i);
    }

    @Override // defpackage.f82
    public final String toString() {
        return "Dispatchers.Default";
    }
}
