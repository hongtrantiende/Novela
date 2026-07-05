package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rza  reason: default package */
/* loaded from: classes.dex */
public final class rza extends n42 {
    public q8a a;
    public /* synthetic */ Object b;
    public final /* synthetic */ sza c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rza(sza szaVar, n42 n42Var) {
        super(n42Var);
        this.c = szaVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
