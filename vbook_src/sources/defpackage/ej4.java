package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ej4  reason: default package */
/* loaded from: classes.dex */
public final class ej4 extends n42 {
    public ez5 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gj4 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej4(gj4 gj4Var, n42 n42Var) {
        super(n42Var);
        this.c = gj4Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
