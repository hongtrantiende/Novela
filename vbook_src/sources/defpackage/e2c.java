package defpackage;
/* renamed from: e2c  reason: default package */
/* loaded from: classes3.dex */
public final class e2c extends n42 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ hs0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2c(hs0 hs0Var, m42 m42Var) {
        super(m42Var);
        this.c = hs0Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
