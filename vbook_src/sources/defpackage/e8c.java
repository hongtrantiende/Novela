package defpackage;
/* renamed from: e8c  reason: default package */
/* loaded from: classes.dex */
public final class e8c extends n42 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ g8c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8c(g8c g8cVar, m42 m42Var) {
        super(m42Var);
        this.c = g8cVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
