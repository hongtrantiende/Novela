package androidx.media3.exoplayer.dash;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class DashMediaSource$Factory implements d67 {
    public final kj a;
    public final gg2 b;
    public final nt2 c;
    public final kh5 d;
    public final ox9 e;
    public final long f;
    public final long g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kj] */
    /* JADX WARN: Type inference failed for: r1v0, types: [du2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [kh5, java.lang.Object] */
    public DashMediaSource$Factory(gg2 gg2Var) {
        ?? obj = new Object();
        obj.a = new abf(22);
        obj.c = 3;
        ?? obj2 = new Object();
        obj2.c = obj;
        obj2.b = gg2Var;
        obj2.a = 1;
        this.a = obj2;
        this.b = gg2Var;
        this.c = new nt2();
        this.e = new ox9(22);
        this.f = 30000L;
        this.g = 5000000L;
        this.d = new Object();
        ((du2) obj2.c).b = true;
    }

    @Override // defpackage.d67
    public final void a(abf abfVar) {
        du2 du2Var = (du2) this.a.c;
        du2Var.getClass();
        du2Var.a = abfVar;
    }

    @Override // defpackage.d67
    public final void b(boolean z) {
        ((du2) this.a.c).b = z;
    }

    @Override // defpackage.d67
    public final ci0 c(f57 f57Var) {
        c57 c57Var = f57Var.b;
        c57Var.getClass();
        an8 hf2Var = new hf2();
        List list = c57Var.c;
        if (!list.isEmpty()) {
            hf2Var = new s6f(hf2Var, list);
        }
        return new of2(f57Var, this.b, hf2Var, this.a, this.d, this.c.c(f57Var), this.e, this.f, this.g);
    }

    @Override // defpackage.d67
    public final void d(int i) {
        ((du2) this.a.c).c = i;
    }
}
