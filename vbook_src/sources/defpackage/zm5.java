package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zm5  reason: default package */
/* loaded from: classes.dex */
public final class zm5 extends n42 {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ an5 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm5(an5 an5Var, n42 n42Var) {
        super(n42Var);
        this.d = an5Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, this);
    }
}
