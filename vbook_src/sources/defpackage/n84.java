package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n84  reason: default package */
/* loaded from: classes3.dex */
public final class n84 extends n42 {
    public l54 a;
    public o84 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ o84 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n84(o84 o84Var, n42 n42Var) {
        super(n42Var);
        this.d = o84Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return o84.b(this.d, null, this);
    }
}
