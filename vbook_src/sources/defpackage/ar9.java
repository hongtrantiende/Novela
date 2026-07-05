package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ar9  reason: default package */
/* loaded from: classes.dex */
public final class ar9 extends n42 {
    public my0 a;
    public my0 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ pl0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar9(pl0 pl0Var, n42 n42Var) {
        super(n42Var);
        this.d = pl0Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
