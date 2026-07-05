package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j1b  reason: default package */
/* loaded from: classes.dex */
public abstract class j1b {
    public fjc b;
    public t94 c;
    public s88 d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final q88 a = new q88();
    public rwa j = new rwa(1, false);

    public void a(long j) {
        this.g = j;
    }

    public abstract long b(km8 km8Var);

    public abstract boolean c(km8 km8Var, long j, rwa rwaVar);

    public void d(boolean z) {
        if (z) {
            this.j = new rwa(1, false);
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
