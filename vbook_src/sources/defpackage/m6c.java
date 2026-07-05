package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m6c  reason: default package */
/* loaded from: classes3.dex */
public final class m6c extends n42 {
    public q36 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ n6c c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6c(n6c n6cVar, n42 n42Var) {
        super(n42Var);
        this.c = n6cVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return n6c.a(this.c, this);
    }
}
