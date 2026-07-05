package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s2a  reason: default package */
/* loaded from: classes.dex */
public final class s2a extends n42 {
    public long a;
    public /* synthetic */ Object b;
    public final /* synthetic */ t2a c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2a(t2a t2aVar, n42 n42Var) {
        super(n42Var);
        this.c = t2aVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.l1(0L, 0L, this);
    }
}
