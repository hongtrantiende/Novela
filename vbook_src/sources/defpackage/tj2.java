package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tj2  reason: default package */
/* loaded from: classes.dex */
public final class tj2 extends n42 {
    public long a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ tn3 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj2(tn3 tn3Var, n42 n42Var) {
        super(n42Var);
        this.d = tn3Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.u(0L, this);
    }
}
