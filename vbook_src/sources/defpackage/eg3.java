package defpackage;
/* renamed from: eg3  reason: default package */
/* loaded from: classes3.dex */
public final class eg3 extends n42 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ cg3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg3(cg3 cg3Var, m42 m42Var) {
        super(m42Var);
        this.c = cg3Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
