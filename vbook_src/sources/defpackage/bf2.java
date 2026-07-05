package defpackage;
/* renamed from: bf2  reason: default package */
/* loaded from: classes3.dex */
public final class bf2 extends n42 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ cf2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf2(cf2 cf2Var, m42 m42Var) {
        super(m42Var);
        this.c = cf2Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
