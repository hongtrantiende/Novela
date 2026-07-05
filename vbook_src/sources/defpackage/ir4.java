package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ir4  reason: default package */
/* loaded from: classes3.dex */
public abstract class ir4 implements yma {
    public final yma a;

    public ir4(yma ymaVar) {
        ymaVar.getClass();
        this.a = ymaVar;
    }

    @Override // defpackage.yma, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // defpackage.yma, java.io.Flushable
    public void flush() {
        this.a.flush();
    }

    @Override // defpackage.yma
    public final dac timeout() {
        return this.a.timeout();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.a + ')';
    }

    @Override // defpackage.yma
    public void write(my0 my0Var, long j) {
        this.a.write(my0Var, j);
    }
}
