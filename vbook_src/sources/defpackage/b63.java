package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b63  reason: default package */
/* loaded from: classes3.dex */
public final class b63 extends n42 {
    public qw7 a;
    public q63 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ q63 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b63(q63 q63Var, n42 n42Var) {
        super(n42Var);
        this.d = q63Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
