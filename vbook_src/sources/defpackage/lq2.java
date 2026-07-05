package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lq2  reason: default package */
/* loaded from: classes3.dex */
public final class lq2 extends n42 {
    public /* synthetic */ Object a;
    public final /* synthetic */ mq2 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq2(mq2 mq2Var, m42 m42Var) {
        super(m42Var);
        this.b = mq2Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(this);
    }
}
