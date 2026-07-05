package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: en9  reason: default package */
/* loaded from: classes.dex */
public final class en9 implements m82, bn9 {
    public static final j61 d = new j61(0);
    public final d82 a;
    public final en9 b = this;
    public volatile d82 c;

    public en9(d82 d82Var) {
        this.a = d82Var;
    }

    @Override // defpackage.bn9
    public final void a() {
        d();
    }

    @Override // defpackage.bn9
    public final void b() {
        d();
    }

    public final void d() {
        synchronized (this.b) {
            try {
                d82 d82Var = this.c;
                if (d82Var == null) {
                    this.c = d;
                } else {
                    k27.m(d82Var, new sq4(0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.m82
    public final d82 q() {
        d82 d82Var;
        d82 d82Var2;
        d82 d82Var3 = this.c;
        if (d82Var3 == null || d82Var3 == d) {
            sx1 sx1Var = (sx1) this.a.get(sx1.b);
            if (sx1Var != null) {
                d82Var = new dn9(sx1Var, this);
            } else {
                d82Var = gs3.a;
            }
            synchronized (this.b) {
                try {
                    d82 d82Var4 = this.c;
                    if (d82Var4 == null) {
                        d82 d82Var5 = this.a;
                        d82Var2 = d82Var5.plus(new y26((w26) d82Var5.get(r0f.I))).plus(gs3.a).plus(d82Var);
                    } else if (d82Var4 == d) {
                        d82 d82Var6 = this.a;
                        y26 y26Var = new y26((w26) d82Var6.get(r0f.I));
                        y26Var.s(new sq4(0));
                        d82Var2 = d82Var6.plus(y26Var).plus(gs3.a).plus(d82Var);
                    } else {
                        d82Var2 = d82Var4;
                    }
                    this.c = d82Var2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            d82Var3 = d82Var2;
        }
        d82Var3.getClass();
        return d82Var3;
    }

    @Override // defpackage.bn9
    public final void c() {
    }
}
