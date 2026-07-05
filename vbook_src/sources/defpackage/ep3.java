package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ep3  reason: default package */
/* loaded from: classes.dex */
public final class ep3 implements wr7 {
    public static final long[] e = new long[0];
    public long a;
    public Object b;
    public Object c;
    public final Object d;

    public ep3(o9a o9aVar, xe1 xe1Var) {
        o9aVar.getClass();
        this.b = o9aVar;
        this.c = xe1Var;
        int f = o9aVar.f();
        if (f <= 64) {
            this.a = f != 64 ? (-1) << f : 0L;
            this.d = e;
            return;
        }
        this.a = 0L;
        int i = (f - 1) >>> 6;
        long[] jArr = new long[i];
        if ((f & 63) != 0) {
            jArr[i - 1] = (-1) << f;
        }
        this.d = jArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x012b, code lost:
        if (r6 != null) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v33, types: [android.util.Pair] */
    /* JADX WARN: Type inference failed for: r0v77 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.jse a(java.lang.String r22, defpackage.jse r23) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ep3.a(java.lang.String, jse):jse");
    }

    @Override // defpackage.wr7
    public boolean c(long j) {
        sc6 sc6Var = (sc6) ((j7a) this.c).invoke();
        if (sc6Var != null) {
            n7a n7aVar = (n7a) this.d;
            if (!sc6Var.t() || !o7a.a(n7aVar, ((Number) ((j7a) this.b).invoke()).longValue())) {
                return false;
            }
            if (n7aVar.b(sc6Var, j, this.a, abf.H, false)) {
                this.a = j;
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // defpackage.wr7
    public void d() {
        ((n7a) this.d).c();
    }

    @Override // defpackage.wr7
    public boolean e(long j, h6a h6aVar, int i) {
        sc6 sc6Var = (sc6) ((j7a) this.c).invoke();
        if (sc6Var != null) {
            n7a n7aVar = (n7a) this.d;
            if (sc6Var.t()) {
                n7aVar.d(sc6Var, j, h6aVar, false);
                this.a = j;
                return o7a.a(n7aVar, ((Number) ((j7a) this.b).invoke()).longValue());
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.wr7
    public boolean f(long j, h6a h6aVar) {
        sc6 sc6Var = (sc6) ((j7a) this.c).invoke();
        if (sc6Var != null) {
            n7a n7aVar = (n7a) this.d;
            if (!sc6Var.t() || !o7a.a(n7aVar, ((Number) ((j7a) this.b).invoke()).longValue())) {
                return false;
            }
            if (n7aVar.b(sc6Var, j, this.a, h6aVar, false)) {
                this.a = j;
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // defpackage.wr7
    public boolean g(long j) {
        sc6 sc6Var = (sc6) ((j7a) this.c).invoke();
        if (sc6Var != null) {
            n7a n7aVar = (n7a) this.d;
            if (sc6Var.t()) {
                if (n7aVar.b(sc6Var, j, this.a, abf.H, false)) {
                    this.a = j;
                }
                return o7a.a(n7aVar, ((Number) ((j7a) this.b).invoke()).longValue());
            }
            return false;
        }
        return false;
    }

    public /* synthetic */ ep3(d0e d0eVar) {
        this.d = d0eVar;
    }

    public ep3(j7a j7aVar, j7a j7aVar2, n7a n7aVar) {
        this.b = j7aVar;
        this.c = j7aVar2;
        this.d = n7aVar;
        this.a = 0L;
    }
}
