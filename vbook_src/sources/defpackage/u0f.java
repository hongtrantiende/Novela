package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u0f  reason: default package */
/* loaded from: classes.dex */
public final class u0f implements Runnable {
    public final /* synthetic */ s0f a;
    public final /* synthetic */ s0f b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ b1f e;

    public u0f(b1f b1fVar, s0f s0fVar, s0f s0fVar2, long j, boolean z) {
        this.a = s0fVar;
        this.b = s0fVar2;
        this.c = j;
        this.d = z;
        this.e = b1fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.d0(this.a, this.b, this.c, this.d, null);
    }
}
