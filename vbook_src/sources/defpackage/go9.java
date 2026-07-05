package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: go9  reason: default package */
/* loaded from: classes.dex */
public final class go9 extends n42 {
    public mo9 a;
    public i3a b;
    public /* synthetic */ Object c;
    public final /* synthetic */ mo9 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go9(mo9 mo9Var, n42 n42Var) {
        super(n42Var);
        this.d = mo9Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return mo9.a(this.d, null, this);
    }
}
