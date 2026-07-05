package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c5d  reason: default package */
/* loaded from: classes.dex */
public final class c5d {
    public final mz6 a = new mz6(0);

    public final void a(long j, long j2) {
        this.a.a(j, j2);
    }

    public final long b() {
        return c(ese.q(Float.MAX_VALUE, Float.MAX_VALUE));
    }

    public final long c(long j) {
        mz6 mz6Var = this.a;
        mz6Var.getClass();
        if (z4d.b(j) <= nae.e || z4d.c(j) <= nae.e) {
            lv5.c("maximumVelocity should be a positive value. You specified=".concat(z4d.g(j)));
        }
        return ese.q(((b5d) mz6Var.b).c(z4d.b(j)), ((b5d) mz6Var.c).c(z4d.c(j)));
    }

    public final void d() {
        mz6 mz6Var = this.a;
        b5d b5dVar = (b5d) mz6Var.b;
        b00.g0(0, r1.length, null, b5dVar.d);
        b5dVar.e = 0;
        b5d b5dVar2 = (b5d) mz6Var.c;
        b00.g0(0, r3.length, null, b5dVar2.d);
        b5dVar2.e = 0;
        mz6Var.a = 0L;
    }
}
