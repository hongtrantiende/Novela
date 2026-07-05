package defpackage;
/* renamed from: mk4  reason: default package */
/* loaded from: classes3.dex */
public final class mk4 extends n42 {
    public int C;
    public long D;
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ja c;
    public tj4 d;
    public Throwable e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk4(ja jaVar, m42 m42Var) {
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
