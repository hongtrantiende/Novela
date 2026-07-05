package defpackage;
/* renamed from: vk4  reason: default package */
/* loaded from: classes3.dex */
public final class vk4 extends n42 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ok4 c;
    public xk4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk4(ok4 ok4Var, m42 m42Var) {
        super(m42Var);
        this.c = ok4Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
