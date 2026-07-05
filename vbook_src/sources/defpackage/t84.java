package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t84  reason: default package */
/* loaded from: classes3.dex */
public final class t84 extends n42 {
    public l54 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ v84 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t84(v84 v84Var, n42 n42Var) {
        super(n42Var);
        this.c = v84Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return v84.j(this.c, null, this);
    }
}
