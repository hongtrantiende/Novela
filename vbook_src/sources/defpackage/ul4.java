package defpackage;
/* renamed from: ul4  reason: default package */
/* loaded from: classes.dex */
public final class ul4 extends n42 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ rl4 c;
    public tj4 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul4(rl4 rl4Var, m42 m42Var) {
        super(m42Var);
        this.c = rl4Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
