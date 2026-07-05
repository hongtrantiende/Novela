package defpackage;
/* renamed from: s12  reason: default package */
/* loaded from: classes3.dex */
public final class s12 extends n42 {
    public /* synthetic */ Object a;
    public int b;
    public tj4 c;
    public int d;
    public final /* synthetic */ t12 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s12(t12 t12Var, m42 m42Var) {
        super(m42Var);
        this.e = t12Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.b(null, this);
    }
}
