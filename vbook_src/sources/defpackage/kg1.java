package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kg1  reason: default package */
/* loaded from: classes3.dex */
public final class kg1 extends n42 {
    public j62 a;
    public ng1 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ng1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg1(ng1 ng1Var, n42 n42Var) {
        super(n42Var);
        this.d = ng1Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return ng1.k(this.d, null, this);
    }
}
