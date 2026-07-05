package defpackage;
/* renamed from: ha  reason: default package */
/* loaded from: classes3.dex */
public final class ha extends n42 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ia c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(ia iaVar, m42 m42Var) {
        super(m42Var);
        this.c = iaVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
