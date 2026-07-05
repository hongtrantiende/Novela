package defpackage;
/* renamed from: aa6  reason: default package */
/* loaded from: classes3.dex */
public final class aa6 extends n42 {
    public /* synthetic */ Object a;
    public int b;
    public tj4 c;
    public int d;
    public final /* synthetic */ ba6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa6(ba6 ba6Var, m42 m42Var) {
        super(m42Var);
        this.e = ba6Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.b(null, this);
    }
}
