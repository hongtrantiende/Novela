package okhttp3.internal.connection;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class BufferedSocketKt$asBufferedSocket$1 implements BufferedSocket {
    public final wra a;
    public final mj9 b;
    public final lj9 c;

    public BufferedSocketKt$asBufferedSocket$1(wra wraVar) {
        this.a = wraVar;
        this.b = tl1.q(wraVar.c());
        this.c = tl1.p(wraVar.b());
    }

    @Override // okhttp3.internal.connection.BufferedSocket, defpackage.wra
    public final az0 b() {
        return this.c;
    }

    @Override // okhttp3.internal.connection.BufferedSocket, defpackage.wra
    public final bz0 c() {
        return this.b;
    }

    @Override // defpackage.wra
    public final void cancel() {
        this.a.cancel();
    }

    @Override // defpackage.wra
    public final yma b() {
        return this.c;
    }

    @Override // defpackage.wra
    public final osa c() {
        return this.b;
    }
}
