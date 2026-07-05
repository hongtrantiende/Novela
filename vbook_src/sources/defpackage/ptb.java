package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ptb  reason: default package */
/* loaded from: classes.dex */
public final class ptb extends n42 {
    public yl9 a;
    public yl9 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ytb d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptb(ytb ytbVar, n42 n42Var) {
        super(n42Var);
        this.d = ytbVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return ytb.a(this.d, null, this);
    }
}
