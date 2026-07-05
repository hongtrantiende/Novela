package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y41  reason: default package */
/* loaded from: classes.dex */
public abstract class y41 implements sb4 {
    public final xe8 a;
    public final mfb b;

    public y41(xe8 xe8Var, mfb mfbVar) {
        xe8Var.getClass();
        this.a = xe8Var;
        this.b = mfbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8 A[Catch: Exception -> 0x0092, TRY_LEAVE, TryCatch #1 {Exception -> 0x0092, blocks: (B:49:0x00bd, B:41:0x00a4, B:43:0x00a8, B:32:0x006c, B:34:0x007a, B:38:0x0097), top: B:59:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd A[Catch: Exception -> 0x0092, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0092, blocks: (B:49:0x00bd, B:41:0x00a4, B:43:0x00a8, B:32:0x006c, B:34:0x007a, B:38:0x0097), top: B:59:0x006c }] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(defpackage.y41 r9, defpackage.n42 r10) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y41.b(y41, n42):java.lang.Object");
    }

    @Override // defpackage.sb4
    public final Object a(n42 n42Var) {
        return b(this, n42Var);
    }

    public abstract Object c(m42 m42Var);

    public abstract String d();

    public final pe4 e() {
        pe4 pe4Var;
        oj9 oj9Var = (oj9) this.b.getValue();
        if (oj9Var != null && (pe4Var = oj9Var.a) != null) {
            return pe4Var;
        }
        return this.a.f;
    }

    public final nj9 f(nj9 nj9Var, byte[] bArr) {
        k57 k57Var;
        Throwable th = null;
        if (!this.a.h.b) {
            if (nj9Var != null) {
                try {
                    s21.z(nj9Var);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
        } else {
            if (nj9Var != null) {
                k57Var = nj9Var.o();
            } else {
                oj9 oj9Var = (oj9) this.b.getValue();
                if (oj9Var != null) {
                    k57Var = oj9Var.a(d());
                } else {
                    k57Var = null;
                }
            }
            if (k57Var != null) {
                try {
                    lj9 p = tl1.p(e().g1(((o40) k57Var.b).e(1), false));
                    p.write(bArr);
                    try {
                        p.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        return k57Var.E();
                    }
                    throw th;
                } catch (Exception e2) {
                    try {
                        ((o40) k57Var.b).b(false);
                    } catch (Exception unused2) {
                    }
                    throw e2;
                }
            }
        }
        return null;
    }
}
