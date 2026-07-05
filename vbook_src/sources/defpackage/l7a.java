package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l7a  reason: default package */
/* loaded from: classes.dex */
public final class l7a implements npb {
    public long a = 9205357640488583168L;
    public long b = 9205357640488583168L;
    public long c = 0;
    public h6a d = abf.H;
    public final /* synthetic */ j7a e;
    public final /* synthetic */ j7a f;
    public final /* synthetic */ n7a g;

    public l7a(j7a j7aVar, j7a j7aVar2, n7a n7aVar) {
        this.e = j7aVar;
        this.f = j7aVar2;
        this.g = n7aVar;
    }

    @Override // defpackage.npb
    public final void a(long j, h6a h6aVar) {
        this.d = h6aVar;
        sc6 sc6Var = (sc6) this.f.invoke();
        if (sc6Var != null) {
            if (sc6Var.t()) {
                this.g.d(sc6Var, j, this.d, true);
                this.a = j;
                this.b = sc6Var.h0(0L);
            } else {
                return;
            }
        }
        if (!o7a.a(this.g, ((Number) this.e.invoke()).longValue())) {
            return;
        }
        this.c = 0L;
    }

    @Override // defpackage.npb
    public final void b() {
        long longValue = ((Number) this.e.invoke()).longValue();
        n7a n7aVar = this.g;
        if (o7a.a(n7aVar, longValue)) {
            n7aVar.c();
        }
        this.a = 9205357640488583168L;
        this.b = 9205357640488583168L;
    }

    @Override // defpackage.npb
    public final void e(long j) {
        sc6 sc6Var = (sc6) this.f.invoke();
        if (sc6Var != null && sc6Var.t()) {
            long longValue = ((Number) this.e.invoke()).longValue();
            n7a n7aVar = this.g;
            if (o7a.a(n7aVar, longValue)) {
                this.c = y78.j(this.c, j);
                long i = y78.i(y78.j(this.a, this.c), y78.i(sc6Var.h0(0L), this.b));
                if (n7aVar.b(sc6Var, i, this.a, this.d, true)) {
                    this.a = i;
                    this.b = sc6Var.h0(0L);
                    this.c = 0L;
                }
            }
        }
    }

    @Override // defpackage.npb
    public final void onCancel() {
        long longValue = ((Number) this.e.invoke()).longValue();
        n7a n7aVar = this.g;
        if (o7a.a(n7aVar, longValue)) {
            n7aVar.c();
        }
        this.a = 9205357640488583168L;
        this.b = 9205357640488583168L;
    }

    @Override // defpackage.npb
    public final void c() {
    }

    @Override // defpackage.npb
    public final void d() {
    }
}
