package defpackage;
/* renamed from: ybd  reason: default package */
/* loaded from: classes3.dex */
public final class ybd extends n42 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ p9d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybd(p9d p9dVar, m42 m42Var) {
        super(m42Var);
        this.c = p9dVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
