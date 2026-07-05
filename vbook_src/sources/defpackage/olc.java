package defpackage;
/* renamed from: olc  reason: default package */
/* loaded from: classes3.dex */
public final class olc extends n42 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ tm6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olc(tm6 tm6Var, m42 m42Var) {
        super(m42Var);
        this.c = tm6Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
