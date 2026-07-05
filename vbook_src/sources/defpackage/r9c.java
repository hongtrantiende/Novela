package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r9c  reason: default package */
/* loaded from: classes.dex */
public final class r9c implements gx9 {
    public final gx9 a;
    public final long b;

    public r9c(gx9 gx9Var, long j) {
        this.a = gx9Var;
        this.b = j;
    }

    @Override // defpackage.gx9
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.gx9
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.gx9
    public final int c(s6f s6fVar, cr2 cr2Var, int i) {
        int c = this.a.c(s6fVar, cr2Var, i);
        if (c == -4) {
            cr2Var.C += this.b;
        }
        return c;
    }

    @Override // defpackage.gx9
    public final int m(long j) {
        return this.a.m(j - this.b);
    }
}
