package defpackage;
/* renamed from: p5c  reason: default package */
/* loaded from: classes3.dex */
public final class p5c extends n42 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ s02 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5c(s02 s02Var, m42 m42Var) {
        super(m42Var);
        this.c = s02Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
