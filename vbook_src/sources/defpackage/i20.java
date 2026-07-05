package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i20  reason: default package */
/* loaded from: classes3.dex */
public final class i20 extends n42 {
    public l20 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ l20 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i20(l20 l20Var, n42 n42Var) {
        super(n42Var);
        this.c = l20Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.i(this);
    }
}
