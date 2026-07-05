package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: di  reason: default package */
/* loaded from: classes.dex */
public final class di extends fb6 implements lu4 {
    public final /* synthetic */ nq7 a;
    public final /* synthetic */ lu4 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di(nq7 nq7Var, lu4 lu4Var, int i) {
        super(2);
        this.a = nq7Var;
        this.b = lu4Var;
        this.c = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p = xoe.p(this.c | 1);
        vqe.r(this.a, this.b, (rv4) obj, p);
        return pvc.a;
    }
}
