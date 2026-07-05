package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qt7  reason: default package */
/* loaded from: classes.dex */
public final class qt7 extends n42 {
    public Object a;
    public Object b;
    public AutoCloseable c;
    public /* synthetic */ Object d;
    public final /* synthetic */ st7 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt7(st7 st7Var, n42 n42Var) {
        super(n42Var);
        this.e = st7Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, this);
    }
}
