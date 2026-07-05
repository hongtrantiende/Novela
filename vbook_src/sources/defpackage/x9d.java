package defpackage;
/* renamed from: x9d  reason: default package */
/* loaded from: classes3.dex */
public final class x9d extends n42 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ zo5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9d(zo5 zo5Var, m42 m42Var) {
        super(m42Var);
        this.c = zo5Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
