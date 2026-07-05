package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x41  reason: default package */
/* loaded from: classes.dex */
public final class x41 extends n42 {
    public y41 a;
    public nj9 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ y41 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x41(y41 y41Var, n42 n42Var) {
        super(n42Var);
        this.d = y41Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return y41.b(this.d, this);
    }
}
