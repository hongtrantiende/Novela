package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x5c  reason: default package */
/* loaded from: classes3.dex */
public final class x5c extends n42 {
    public /* synthetic */ Object a;
    public final /* synthetic */ y5c b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5c(y5c y5cVar, m42 m42Var) {
        super(m42Var);
        this.b = y5cVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return y5c.S(this.b, this);
    }
}
