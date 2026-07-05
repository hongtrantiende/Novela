package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c06  reason: default package */
/* loaded from: classes.dex */
public final class c06 extends n42 {
    public int a;
    public e06 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ e06 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c06(e06 e06Var, n42 n42Var) {
        super(n42Var);
        this.d = e06Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(0, this, null);
    }
}
