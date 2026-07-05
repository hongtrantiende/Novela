package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jr4  reason: default package */
/* loaded from: classes3.dex */
public abstract class jr4 implements osa {
    public final osa a;

    public jr4(osa osaVar) {
        osaVar.getClass();
        this.a = osaVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // defpackage.osa
    public long read(my0 my0Var, long j) {
        my0Var.getClass();
        return this.a.read(my0Var, j);
    }

    @Override // defpackage.osa
    public final dac timeout() {
        return this.a.timeout();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.a + ')';
    }
}
