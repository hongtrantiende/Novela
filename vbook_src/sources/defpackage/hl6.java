package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hl6  reason: default package */
/* loaded from: classes.dex */
public final class hl6 extends n42 {
    public /* synthetic */ Object a;
    public final /* synthetic */ kl6 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl6(kl6 kl6Var, n42 n42Var) {
        super(n42Var);
        this.b = kl6Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.T0(this);
    }
}
