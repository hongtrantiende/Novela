package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t0d  reason: default package */
/* loaded from: classes3.dex */
public final class t0d extends n42 {
    public /* synthetic */ Object a;
    public final /* synthetic */ x0d b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0d(x0d x0dVar, n42 n42Var) {
        super(n42Var);
        this.b = x0dVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.g(this);
    }
}
