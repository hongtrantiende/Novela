package androidx.media3.exoplayer.hls;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class HlsMediaSource$Factory implements d67 {
    public final fz4 a;
    public du2 b;
    public abf c;
    public final nt2 i = new nt2();
    public final lh9 f = new lh9(22);
    public final ls2 g = hu2.P;
    public final ox9 j = new ox9(22);
    public final kh5 h = new Object();
    public final int l = 1;
    public final long m = -9223372036854775807L;
    public final boolean k = true;
    public int e = 3;
    public boolean d = true;

    /* JADX WARN: Type inference failed for: r3v5, types: [kh5, java.lang.Object] */
    public HlsMediaSource$Factory(gg2 gg2Var) {
        this.a = new fz4(gg2Var);
    }

    @Override // defpackage.d67
    public final void a(abf abfVar) {
        this.c = abfVar;
    }

    @Override // defpackage.d67
    public final void b(boolean z) {
        this.d = z;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [du2, java.lang.Object] */
    @Override // defpackage.d67
    public final ci0 c(f57 f57Var) {
        c57 c57Var = f57Var.b;
        c57Var.getClass();
        if (this.b == null) {
            ?? obj = new Object();
            obj.a = new abf(22);
            obj.c = 3;
            this.b = obj;
        }
        abf abfVar = this.c;
        if (abfVar != null) {
            this.b.a = abfVar;
        }
        du2 du2Var = this.b;
        du2Var.b = this.d;
        du2Var.c = this.e;
        List list = c57Var.c;
        boolean isEmpty = list.isEmpty();
        y75 y75Var = this.f;
        if (!isEmpty) {
            y75Var = new kw5(24, y75Var, list);
        }
        fl3 c = this.i.c(f57Var);
        this.g.getClass();
        fz4 fz4Var = this.a;
        ox9 ox9Var = this.j;
        return new r75(f57Var, fz4Var, du2Var, this.h, c, ox9Var, new hu2(fz4Var, ox9Var, y75Var), this.m, this.k, this.l);
    }

    @Override // defpackage.d67
    public final void d(int i) {
        this.e = i;
    }
}
