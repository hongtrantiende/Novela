package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lo9  reason: default package */
/* loaded from: classes.dex */
public final class lo9 extends n42 {
    public int C;
    public mo9 a;
    public Object b;
    public af6 c;
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ mo9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo9(mo9 mo9Var, n42 n42Var) {
        super(n42Var);
        this.f = mo9Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.C |= Integer.MIN_VALUE;
        return this.f.g(null, 0L, this);
    }
}
