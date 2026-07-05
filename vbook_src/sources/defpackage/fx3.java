package defpackage;
/* renamed from: fx3  reason: default package */
/* loaded from: classes3.dex */
public final class fx3 extends n42 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ja c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx3(ja jaVar, m42 m42Var) {
        super(m42Var);
        this.c = jaVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
