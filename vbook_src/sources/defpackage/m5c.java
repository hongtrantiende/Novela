package defpackage;
/* renamed from: m5c  reason: default package */
/* loaded from: classes3.dex */
public final class m5c extends n42 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ mx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5c(mx mxVar, m42 m42Var) {
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
