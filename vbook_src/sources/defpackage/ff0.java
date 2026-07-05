package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ff0  reason: default package */
/* loaded from: classes.dex */
public final class ff0 extends n42 {
    public gab a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ gf0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff0(gf0 gf0Var, n42 n42Var) {
        super(n42Var);
        this.d = gf0Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.f(null, this);
    }
}
