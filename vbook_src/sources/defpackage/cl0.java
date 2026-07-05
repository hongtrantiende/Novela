package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cl0  reason: default package */
/* loaded from: classes3.dex */
public final class cl0 extends n42 {
    public hl0 a;
    public byte[] b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ hl0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl0(hl0 hl0Var, n42 n42Var) {
        super(n42Var);
        this.e = hl0Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.i(0, this, null);
    }
}
