package defpackage;
/* renamed from: z64  reason: default package */
/* loaded from: classes3.dex */
public final class z64 extends n42 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ lx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z64(lx lxVar, m42 m42Var) {
        super(m42Var);
        this.c = lxVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
