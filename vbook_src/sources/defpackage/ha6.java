package defpackage;
/* renamed from: ha6  reason: default package */
/* loaded from: classes3.dex */
public final class ha6 extends n42 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ia6 c;
    public Object d;
    public int e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha6(ia6 ia6Var, m42 m42Var) {
        super(m42Var);
        this.c = ia6Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
