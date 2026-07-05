package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: br  reason: default package */
/* loaded from: classes.dex */
public final class br extends x06 {
    public pkc L;
    public aw7 M;
    public er N;
    public long O;

    @Override // defpackage.mq7
    public final void B1() {
        this.O = -9223372034707292160L;
    }

    @Override // defpackage.x06, defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        long j2;
        mw8 M = w27Var.M(j);
        if (e37Var.I0()) {
            j2 = (M.a << 32) | (M.b & 4294967295L);
        } else {
            pkc pkcVar = this.L;
            int i = M.a;
            if (pkcVar == null) {
                j2 = (i << 32) | (M.b & 4294967295L);
                this.O = j2;
            } else {
                long j3 = (M.b & 4294967295L) | (i << 32);
                okc a = pkcVar.a(new jc(this, j3), null, null, new bu3(this, j3, 3));
                this.N.f = a;
                j2 = ((zy5) a.getValue()).a;
                this.O = ((zy5) a.getValue()).a;
            }
        }
        return e37Var.q0((int) (j2 >> 32), (int) (4294967295L & j2), ls3.a, new ar(this, M, j2));
    }
}
