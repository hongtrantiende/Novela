package defpackage;
/* renamed from: dm6  reason: default package */
/* loaded from: classes3.dex */
public final class dm6 extends n42 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ hg3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm6(hg3 hg3Var, m42 m42Var) {
        super(m42Var);
        this.c = hg3Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
