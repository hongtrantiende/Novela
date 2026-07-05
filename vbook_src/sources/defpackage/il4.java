package defpackage;
/* renamed from: il4  reason: default package */
/* loaded from: classes3.dex */
public final class il4 extends n42 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ xk4 c;
    public Object d;
    public tj4 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il4(xk4 xk4Var, m42 m42Var) {
        super(m42Var);
        this.c = xk4Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
