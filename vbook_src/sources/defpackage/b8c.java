package defpackage;
/* renamed from: b8c  reason: default package */
/* loaded from: classes3.dex */
public final class b8c extends n42 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ mx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8c(mx mxVar, m42 m42Var) {
        super(m42Var);
        this.c = mxVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
