package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r9b  reason: default package */
/* loaded from: classes.dex */
public final class r9b extends s9b {
    public final pt4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9b(it4 it4Var, String str) {
        super(it4Var, str);
        it4Var.getClass();
        str.getClass();
        this.d = it4Var.C(str);
    }

    @Override // defpackage.iw9
    public final boolean Z0() {
        o();
        this.d.b.execute();
        return false;
    }

    @Override // defpackage.iw9
    public final void b0(int i, String str) {
        str.getClass();
        o();
        this.d.g(i, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.d.close();
        this.c = true;
    }

    @Override // defpackage.iw9
    public final byte[] getBlob(int i) {
        o();
        oue.K(21, "no row");
        throw null;
    }

    @Override // defpackage.iw9
    public final int getColumnCount() {
        o();
        return 0;
    }

    @Override // defpackage.iw9
    public final String getColumnName(int i) {
        o();
        oue.K(21, "no row");
        throw null;
    }

    @Override // defpackage.iw9
    public final long getLong(int i) {
        o();
        oue.K(21, "no row");
        throw null;
    }

    @Override // defpackage.iw9
    public final boolean isNull(int i) {
        o();
        oue.K(21, "no row");
        throw null;
    }

    @Override // defpackage.iw9
    public final void m(int i, long j) {
        o();
        this.d.m(i, j);
    }

    @Override // defpackage.iw9
    public final void p(byte[] bArr, int i) {
        o();
        this.d.p(bArr, i);
    }

    @Override // defpackage.iw9
    public final void r(int i) {
        o();
        this.d.r(i);
    }

    @Override // defpackage.iw9
    public final String s0(int i) {
        o();
        oue.K(21, "no row");
        throw null;
    }

    @Override // defpackage.iw9
    public final void reset() {
    }
}
