package defpackage;
/* renamed from: rja  reason: default package */
/* loaded from: classes3.dex */
public final class rja extends n42 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ r58 c;
    public ilc d;
    public oia e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rja(r58 r58Var, m42 m42Var) {
        super(m42Var);
        this.c = r58Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.g(null, this);
    }
}
