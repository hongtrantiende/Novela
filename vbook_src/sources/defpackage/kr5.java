package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kr5  reason: default package */
/* loaded from: classes3.dex */
public final class kr5 extends n42 {
    public xt4 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ur5 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr5(ur5 ur5Var, n42 n42Var) {
        super(n42Var);
        this.c = ur5Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.o(0, null, this);
    }
}
