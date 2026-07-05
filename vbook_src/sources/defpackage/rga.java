package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rga  reason: default package */
/* loaded from: classes3.dex */
public final class rga extends r3 {
    public long a;
    public f61 b;

    @Override // defpackage.r3
    public final boolean a(q3 q3Var) {
        pga pgaVar = (pga) q3Var;
        if (this.a >= 0) {
            return false;
        }
        long j = pgaVar.E;
        if (j < pgaVar.F) {
            pgaVar.F = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.r3
    public final m42[] b(q3 q3Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((pga) q3Var).x(j);
    }
}
