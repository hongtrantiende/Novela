package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t  reason: default package */
/* loaded from: classes3.dex */
public final class t extends n42 {
    public v a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ v d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, n42 n42Var) {
        super(n42Var);
        this.d = vVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.u(null, 0, 0L, this);
    }
}
