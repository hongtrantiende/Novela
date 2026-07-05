package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pya  reason: default package */
/* loaded from: classes.dex */
public final class pya extends hr4 {
    public final /* synthetic */ m4a b;
    public final /* synthetic */ zg1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pya(zg1 zg1Var, m4a m4aVar, m4a m4aVar2) {
        super(m4aVar);
        this.c = zg1Var;
        this.b = m4aVar2;
    }

    @Override // defpackage.hr4, defpackage.m4a
    public final l4a e(long j) {
        l4a e = this.b.e(j);
        p4a p4aVar = e.a;
        long j2 = p4aVar.a;
        long j3 = p4aVar.b;
        long j4 = this.c.b;
        p4a p4aVar2 = new p4a(j2, j3 + j4);
        p4a p4aVar3 = e.b;
        return new l4a(p4aVar2, new p4a(p4aVar3.a, p4aVar3.b + j4));
    }
}
