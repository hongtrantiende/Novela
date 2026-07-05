package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a18  reason: default package */
/* loaded from: classes.dex */
public final class a18 extends n42 {
    public long a;
    public /* synthetic */ Object b;
    public final /* synthetic */ b18 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a18(b18 b18Var, n42 n42Var) {
        super(n42Var);
        this.c = b18Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.m0(0L, this);
    }
}
