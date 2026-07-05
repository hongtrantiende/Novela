package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mz3  reason: default package */
/* loaded from: classes.dex */
public final class mz3 extends n42 {
    public long a;
    public /* synthetic */ Object b;
    public final /* synthetic */ nz3 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz3(nz3 nz3Var, n42 n42Var) {
        super(n42Var);
        this.c = nz3Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.l1(0L, 0L, this);
    }
}
