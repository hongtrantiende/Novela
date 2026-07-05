package defpackage;
/* renamed from: sld  reason: default package */
/* loaded from: classes3.dex */
public final class sld extends n42 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ bad c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sld(bad badVar, m42 m42Var) {
        super(m42Var);
        this.c = badVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
