package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ah2  reason: default package */
/* loaded from: classes.dex */
public final class ah2 extends n42 {
    public boolean a;
    public xya b;
    public /* synthetic */ Object c;
    public final /* synthetic */ gh2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah2(gh2 gh2Var, m42 m42Var) {
        super(m42Var);
        this.d = gh2Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return gh2.f(this.d, false, this);
    }
}
