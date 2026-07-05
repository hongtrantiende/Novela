package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z08  reason: default package */
/* loaded from: classes.dex */
public final class z08 extends n42 {
    public long a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ b18 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z08(b18 b18Var, n42 n42Var) {
        super(n42Var);
        this.d = b18Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.l1(0L, 0L, this);
    }
}
