package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e66  reason: default package */
/* loaded from: classes3.dex */
public final class e66 extends n42 {
    public final /* synthetic */ g66 C;
    public int D;
    public g66 a;
    public Object b;
    public Object c;
    public int d;
    public int e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e66(g66 g66Var, n42 n42Var) {
        super(n42Var);
        this.C = g66Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.f(null, 0, 0, this);
    }
}
