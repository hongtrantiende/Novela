package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ll0  reason: default package */
/* loaded from: classes.dex */
public final class ll0 extends n42 {
    public q8a a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ml0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll0(ml0 ml0Var, n42 n42Var) {
        super(n42Var);
        this.c = ml0Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
