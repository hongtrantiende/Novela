package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qtb  reason: default package */
/* loaded from: classes.dex */
public final class qtb extends n42 {
    public yl9 a;
    public yl9 b;
    public h35 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ytb e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qtb(ytb ytbVar, n42 n42Var) {
        super(n42Var);
        this.e = ytbVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return ytb.b(this.e, null, false, this);
    }
}
