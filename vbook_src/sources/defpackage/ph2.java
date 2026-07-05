package defpackage;
/* renamed from: ph2  reason: default package */
/* loaded from: classes3.dex */
public final class ph2 extends n42 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ qh2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph2(qh2 qh2Var, m42 m42Var) {
        super(m42Var);
        this.c = qh2Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
