package defpackage;
/* renamed from: x7c  reason: default package */
/* loaded from: classes3.dex */
public final class x7c extends n42 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ yh2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7c(yh2 yh2Var, m42 m42Var) {
        super(m42Var);
        this.c = yh2Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
