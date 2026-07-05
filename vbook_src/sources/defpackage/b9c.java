package defpackage;
/* renamed from: b9c  reason: default package */
/* loaded from: classes3.dex */
public final class b9c extends n42 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ sk4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9c(sk4 sk4Var, m42 m42Var) {
        super(m42Var);
        this.c = sk4Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
