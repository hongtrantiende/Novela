package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wk  reason: default package */
/* loaded from: classes.dex */
public final class wk implements nm {
    public final pt4 a;

    public wk(pt4 pt4Var) {
        pt4Var.getClass();
        this.a = pt4Var;
    }

    @Override // defpackage.nm
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.nm
    public final void g(int i, String str) {
        pt4 pt4Var = this.a;
        int i2 = i + 1;
        if (str == null) {
            pt4Var.r(i2);
        } else {
            pt4Var.g(i2, str);
        }
    }

    @Override // defpackage.nm
    public final long h() {
        return this.a.b.executeUpdateDelete();
    }

    @Override // defpackage.nm
    public final Object i(xt4 xt4Var) {
        xt4Var.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.nm
    public final void j(int i, Long l) {
        long longValue = l.longValue();
        this.a.m(i + 1, longValue);
    }

    @Override // defpackage.nm
    public final void k(int i, Double d) {
        double doubleValue = d.doubleValue();
        this.a.B0(doubleValue, i + 1);
    }

    @Override // defpackage.nm
    public final void l(int i, Boolean bool) {
        long j;
        int i2 = i + 1;
        if (bool.booleanValue()) {
            j = 1;
        } else {
            j = 0;
        }
        this.a.m(i2, j);
    }
}
