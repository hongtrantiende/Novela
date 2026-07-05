package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i35  reason: default package */
/* loaded from: classes.dex */
public final class i35 implements l29 {
    public final dc a;
    public final l88 b;
    public long c = 0;

    public i35(dc dcVar, l88 l88Var) {
        this.a = dcVar;
        this.b = l88Var;
    }

    @Override // defpackage.l29
    public final long g(uy5 uy5Var, long j, tc6 tc6Var, long j2) {
        long b = this.b.b();
        if ((9223372034707292159L & b) == 9205357640488583168L) {
            b = this.c;
        }
        this.c = b;
        return py5.d(py5.d(uy5Var.d(), hif.v(b)), this.a.a(j2, 0L, tc6Var));
    }
}
