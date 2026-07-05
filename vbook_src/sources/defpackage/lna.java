package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lna  reason: default package */
/* loaded from: classes.dex */
public final class lna extends fb6 implements lu4 {
    public final /* synthetic */ long a;
    public final /* synthetic */ sna b;
    public final /* synthetic */ lu4 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lna(int i, long j, lu4 lu4Var, sna snaVar) {
        super(2);
        this.a = j;
        this.b = snaVar;
        this.c = lu4Var;
        this.d = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        nmd.i(this.d | 1, this.a, this.c, (rv4) obj, this.b);
        return pvc.a;
    }
}
